package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Pz */
/* loaded from: assets/audience_network.dex */
public class C0706Pz implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ JG A00;

    public C0706Pz(JG jg) {
        this.A00 = jg;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C0701Pu c0701Pu;
        C0701Pu c0701Pu2;
        c0701Pu = this.A00.A0C;
        if (c0701Pu != null) {
            c0701Pu2 = this.A00.A0C;
            return c0701Pu2.A04();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C0701Pu c0701Pu;
        C0701Pu c0701Pu2;
        c0701Pu = this.A00.A0C;
        if (c0701Pu != null) {
            c0701Pu2 = this.A00.A0C;
            return c0701Pu2.A05();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C0701Pu c0701Pu;
        C0701Pu c0701Pu2;
        c0701Pu = this.A00.A0C;
        if (c0701Pu != null) {
            c0701Pu2 = this.A00.A0C;
            if (c0701Pu2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        Q8 q8;
        Q8 q82;
        q8 = this.A00.A0F;
        if (q8 != null) {
            q82 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            q82.ABe();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        Q8 q8;
        Q8 q82;
        q8 = this.A00.A0F;
        if (q8 != null) {
            q82 = this.A00.A0F;
            q82.ABf();
        }
    }
}
