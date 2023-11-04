package org.cocos2dx.lib;

import android.content.Context;
import android.media.SoundPool;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class Cocos2dxSound {
    private static final int INVALID_SOUND_ID = -1;
    private static final int INVALID_STREAM_ID = -1;
    private static final int LOAD_TIME_OUT = 500;
    private static final int MAX_SIMULTANEOUS_STREAMS_DEFAULT = 5;
    private static final int MAX_SIMULTANEOUS_STREAMS_I9100 = 3;
    private static final int SOUND_PRIORITY = 1;
    private static final int SOUND_QUALITY = 5;
    private static final float SOUND_RATE = 1.0f;
    private static final String TAG = "Cocos2dxSound";
    private final Context mContext;
    private float mLeftVolume;
    private float mRightVolume;
    private SoundPool mSoundPool;
    private boolean mIsAudioFocus = true;
    private final HashMap<String, ArrayList<Integer>> mPathStreamIDsMap = new HashMap<>();
    private final Object mLockPathStreamIDsMap = new Object();
    private final HashMap<String, Integer> mPathSoundIDMap = new HashMap<>();
    private ConcurrentHashMap<Integer, SoundInfoForLoadedCompleted> mPlayWhenLoadedEffects = new ConcurrentHashMap<>();

    public Cocos2dxSound(Context context) {
        this.mContext = context;
        initData();
    }

    private void initData() {
        if (Cocos2dxHelper.getDeviceModel().contains("GT-I9100")) {
            this.mSoundPool = new SoundPool(3, 3, 5);
        } else {
            this.mSoundPool = new SoundPool(5, 3, 5);
        }
        this.mSoundPool.setOnLoadCompleteListener(new OnLoadCompletedListener());
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
    }

    public int preloadEffect(String str) {
        Integer num = this.mPathSoundIDMap.get(str);
        if (num == null) {
            num = Integer.valueOf(createSoundIDFromAsset(str));
            if (num.intValue() != -1) {
                this.mPathSoundIDMap.put(str, num);
            }
        }
        return num.intValue();
    }

    public void unloadEffect(String str) {
        synchronized (this.mLockPathStreamIDsMap) {
            ArrayList<Integer> arrayList = this.mPathStreamIDsMap.get(str);
            if (arrayList != null) {
                Iterator<Integer> it = arrayList.iterator();
                while (it.hasNext()) {
                    this.mSoundPool.stop(it.next().intValue());
                }
            }
            this.mPathStreamIDsMap.remove(str);
        }
        Integer num = this.mPathSoundIDMap.get(str);
        if (num != null) {
            this.mSoundPool.unload(num.intValue());
            this.mPathSoundIDMap.remove(str);
        }
    }

    public int playEffect(String str, boolean z, float f, float f2, float f3) {
        Integer num = this.mPathSoundIDMap.get(str);
        if (num != null) {
            return doPlayEffect(str, num.intValue(), z, f, f2, f3);
        }
        Integer valueOf = Integer.valueOf(preloadEffect(str));
        if (valueOf.intValue() == -1) {
            return -1;
        }
        SoundInfoForLoadedCompleted soundInfoForLoadedCompleted = new SoundInfoForLoadedCompleted(str, z, f, f2, f3);
        this.mPlayWhenLoadedEffects.putIfAbsent(valueOf, soundInfoForLoadedCompleted);
        synchronized (soundInfoForLoadedCompleted) {
            try {
                soundInfoForLoadedCompleted.wait(500L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int i = soundInfoForLoadedCompleted.effectID;
        this.mPlayWhenLoadedEffects.remove(valueOf);
        return i;
    }

    public void stopEffect(int i) {
        this.mSoundPool.stop(i);
        synchronized (this.mLockPathStreamIDsMap) {
            Iterator<String> it = this.mPathStreamIDsMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (this.mPathStreamIDsMap.get(next).contains(Integer.valueOf(i))) {
                    this.mPathStreamIDsMap.get(next).remove(this.mPathStreamIDsMap.get(next).indexOf(Integer.valueOf(i)));
                    break;
                }
            }
        }
    }

    public void pauseEffect(int i) {
        this.mSoundPool.pause(i);
    }

    public void resumeEffect(int i) {
        this.mSoundPool.resume(i);
    }

    public void pauseAllEffects() {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                for (Map.Entry<String, ArrayList<Integer>> entry : this.mPathStreamIDsMap.entrySet()) {
                    Iterator<Integer> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        this.mSoundPool.pause(it.next().intValue());
                    }
                }
            }
        }
    }

    public void resumeAllEffects() {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                for (Map.Entry<String, ArrayList<Integer>> entry : this.mPathStreamIDsMap.entrySet()) {
                    Iterator<Integer> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        this.mSoundPool.resume(it.next().intValue());
                    }
                }
            }
        }
    }

    public void stopAllEffects() {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                for (Map.Entry<String, ArrayList<Integer>> entry : this.mPathStreamIDsMap.entrySet()) {
                    Iterator<Integer> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        this.mSoundPool.stop(it.next().intValue());
                    }
                }
            }
            this.mPathStreamIDsMap.clear();
        }
    }

    public float getEffectsVolume() {
        return (this.mLeftVolume + this.mRightVolume) / 2.0f;
    }

    public void setEffectsVolume(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > SOUND_RATE) {
            f = SOUND_RATE;
        }
        this.mRightVolume = f;
        this.mLeftVolume = f;
        if (this.mIsAudioFocus) {
            setEffectsVolumeInternal(f, f);
        }
    }

    private void setEffectsVolumeInternal(float f, float f2) {
        synchronized (this.mLockPathStreamIDsMap) {
            if (!this.mPathStreamIDsMap.isEmpty()) {
                for (Map.Entry<String, ArrayList<Integer>> entry : this.mPathStreamIDsMap.entrySet()) {
                    Iterator<Integer> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        this.mSoundPool.setVolume(it.next().intValue(), f, f2);
                    }
                }
            }
        }
    }

    public void end() {
        this.mSoundPool.release();
        synchronized (this.mLockPathStreamIDsMap) {
            this.mPathStreamIDsMap.clear();
        }
        this.mPathSoundIDMap.clear();
        this.mPlayWhenLoadedEffects.clear();
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
        initData();
    }

    private int createSoundIDFromAsset(String str) {
        int i;
        try {
            if (str.startsWith("/")) {
                i = this.mSoundPool.load(str, 0);
            } else if (Cocos2dxHelper.getObbFile() != null) {
                i = this.mSoundPool.load(Cocos2dxHelper.getObbFile().getAssetFileDescriptor(str), 0);
            } else {
                i = this.mSoundPool.load(this.mContext.getAssets().openFd(str), 0);
            }
        } catch (Exception e) {
            Log.e(TAG, "error: " + e.getMessage(), e);
            i = -1;
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    private float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public synchronized int doPlayEffect(String str, int i, boolean z, float f, float f2, float f3) {
        int play;
        float clamp = this.mLeftVolume * f3 * (SOUND_RATE - clamp(f2, 0.0f, SOUND_RATE));
        float clamp2 = this.mRightVolume * f3 * (SOUND_RATE - clamp(-f2, 0.0f, SOUND_RATE));
        play = this.mSoundPool.play(i, clamp(clamp, 0.0f, SOUND_RATE), clamp(clamp2, 0.0f, SOUND_RATE), 1, z ? -1 : 0, clamp(f * SOUND_RATE, 0.5f, 2.0f));
        synchronized (this.mLockPathStreamIDsMap) {
            ArrayList<Integer> arrayList = this.mPathStreamIDsMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.mPathStreamIDsMap.put(str, arrayList);
            }
            arrayList.add(Integer.valueOf(play));
        }
        return play;
    }

    public void onEnterBackground() {
        this.mSoundPool.autoPause();
    }

    public void onEnterForeground() {
        this.mSoundPool.autoResume();
    }

    public void setAudioFocus(boolean z) {
        this.mIsAudioFocus = z;
        setEffectsVolumeInternal(z ? this.mLeftVolume : 0.0f, z ? this.mRightVolume : 0.0f);
    }

    /* loaded from: classes2.dex */
    public class SoundInfoForLoadedCompleted {
        int effectID = -1;
        float gain;
        boolean isLoop;
        float pan;
        String path;
        float pitch;

        SoundInfoForLoadedCompleted(String str, boolean z, float f, float f2, float f3) {
            Cocos2dxSound.this = r1;
            this.path = str;
            this.isLoop = z;
            this.pitch = f;
            this.pan = f2;
            this.gain = f3;
        }
    }

    /* loaded from: classes2.dex */
    public class OnLoadCompletedListener implements SoundPool.OnLoadCompleteListener {
        public OnLoadCompletedListener() {
            Cocos2dxSound.this = r1;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            SoundInfoForLoadedCompleted soundInfoForLoadedCompleted;
            if (i2 != 0 || (soundInfoForLoadedCompleted = (SoundInfoForLoadedCompleted) Cocos2dxSound.this.mPlayWhenLoadedEffects.get(Integer.valueOf(i))) == null) {
                return;
            }
            soundInfoForLoadedCompleted.effectID = Cocos2dxSound.this.doPlayEffect(soundInfoForLoadedCompleted.path, i, soundInfoForLoadedCompleted.isLoop, soundInfoForLoadedCompleted.pitch, soundInfoForLoadedCompleted.pan, soundInfoForLoadedCompleted.gain);
            synchronized (soundInfoForLoadedCompleted) {
                soundInfoForLoadedCompleted.notifyAll();
            }
        }
    }
}
