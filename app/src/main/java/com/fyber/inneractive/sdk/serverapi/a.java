package com.fyber.inneractive.sdk.serverapi;

import android.app.NotificationManager;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.c0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.f0;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.util.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {
    public static final HashMap<String, Integer> a = new C0054a();
    public static final List<String> b = Arrays.asList("POWER_SAVE_MODE_OPEN", "SmartModeStatus");

    /* renamed from: com.fyber.inneractive.sdk.serverapi.a$a */
    /* loaded from: classes.dex */
    public class C0054a extends HashMap<String, Integer> {
        public C0054a() {
            put("HUAWEI", 4);
            put("XIAOMI", 1);
        }
    }

    public static String a() {
        try {
            Intent registerReceiver = l.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                return a((registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / registerReceiver.getIntExtra("scale", -1));
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(float f) {
        return f < 5.0f ? "1" : f <= 9.0f ? "2" : f <= 24.0f ? "3" : f <= 39.0f ? "4" : f <= 54.0f ? "5" : f <= 69.0f ? "6" : f <= 84.0f ? "7" : f <= 100.0f ? "8" : "";
    }

    public static Long b() {
        long j;
        f0 f0Var = IAConfigManager.M.x;
        f0Var.getClass();
        try {
            String str = "";
            String str2 = f0Var.c.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j, TimeUnit.MILLISECONDS));
    }

    public static Long d() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean e() {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                return Boolean.valueOf(Settings.System.getInt(l.a.getContentResolver(), "airplane_mode_on", 0) != 0);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static Boolean f() {
        if (l.b("android.permission.BLUETOOTH") && Build.VERSION.SDK_INT >= 18) {
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) l.a.getSystemService("bluetooth");
                if (bluetoothManager.getAdapter().getProfileConnectionState(1) != 2 && bluetoothManager.getAdapter().getProfileConnectionState(2) != 2) {
                    return null;
                }
                return Boolean.TRUE;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Boolean g() {
        return Boolean.valueOf((l.a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    public static Boolean h() {
        int intExtra;
        try {
            Intent registerReceiver = l.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = true;
            if (registerReceiver == null || ((intExtra = registerReceiver.getIntExtra("plugged", -1)) != 1 && intExtra != 2 && intExtra != 4)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean i() {
        try {
            boolean z = false;
            int ringerMode = ((AudioManager) l.a.getSystemService("audio")).getRingerMode();
            if (ringerMode == 0 || ringerMode == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean j() {
        try {
            NotificationManager notificationManager = (NotificationManager) l.a.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 23) {
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean k() {
        boolean isWiredHeadsetOn;
        AudioDeviceInfo[] devices;
        try {
            AudioManager audioManager = (AudioManager) l.a.getSystemService("audio");
            if (Build.VERSION.SDK_INT >= 23) {
                isWiredHeadsetOn = false;
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                        isWiredHeadsetOn = true;
                    }
                }
            } else {
                isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
            }
            return Boolean.valueOf(isWiredHeadsetOn);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean l() {
        Integer num;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (!TextUtils.isEmpty(upperCase) && a.containsKey(upperCase)) {
                try {
                    for (String str : b) {
                        int i = Settings.System.getInt(l.a.getContentResolver(), str, -1);
                        if (i != -1 && (num = a.get(upperCase)) != null) {
                            return Boolean.valueOf(num.intValue() == i);
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                return Boolean.valueOf(((PowerManager) l.a.getSystemService("power")).isPowerSaveMode());
            } else {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String c() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            return "unity3d";
        } catch (Throwable unused) {
            return "native";
        }
    }

    public static UnitDisplayType a(String str) {
        a0 a0Var;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        z a2 = com.fyber.inneractive.sdk.config.a.a(str);
        if (a2 == null || a2.a.size() <= 0 || (a0Var = a2.a.get(0)) == null) {
            return unitDisplayType;
        }
        c0 c0Var = a0Var.f;
        t tVar = a0Var.c;
        if (c0Var != null) {
            return c0Var.j;
        }
        return tVar != null ? tVar.b : unitDisplayType;
    }
}
