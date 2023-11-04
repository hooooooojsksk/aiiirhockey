package com.fyber.inneractive.sdk.serverapi;

import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.j;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements c {
    public static final List<Integer> c = Arrays.asList(5);
    public static final List<Integer> d = Arrays.asList(Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0.value), Integer.valueOf(com.fyber.inneractive.sdk.rtb.data.types.a.VAST_2_0_WRAPPER.value));
    public static final List<String> e = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "application/x-mpegURL");
    public s a;
    public String b = j.j();

    public b(s sVar) {
        this.a = sVar;
    }

    public String a() {
        try {
            return ((TelephonyManager) l.a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public String b() {
        int i = j.b;
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public String c() {
        String str = this.b;
        return str == null ? "" : str.substring(0, Math.min(3, str.length()));
    }

    public String d() {
        String str = this.b;
        return str == null ? "" : str.substring(Math.min(3, str.length()));
    }

    public String e() {
        return l.a.getPackageName();
    }

    public String f() {
        try {
            return l.a.getPackageManager().getPackageInfo(l.a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public int g() {
        return l.c(l.d());
    }

    public int h() {
        return l.c(l.e());
    }

    public boolean i() {
        return (p.a() ^ true) || IAConfigManager.M.r;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('-');
        sb.append("Android");
        sb.append('-');
        sb.append("8.2.3");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        return sb.toString();
    }

    public void a(Map<String, String> map, String str) {
        String str2;
        HashMap<String, Integer> hashMap = a.a;
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("headset", a(a.k()));
        map.put("is_muted", a(a.i()));
        map.put("btry_c", a(a.h()));
        map.put("btry_l", a.a());
        map.put("bt_con", a(a.f()));
        Long d2 = a.d();
        map.put("tod", d2 == null ? "" : String.valueOf(d2));
        map.put("apnm", a(a.e()));
        map.put("dnd", a(a.j()));
        IAConfigManager iAConfigManager = IAConfigManager.M;
        map.put("lng", iAConfigManager.p);
        String a = iAConfigManager.x.a(a.a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a) && a.contains(",")) {
            a = a.split(",")[0];
        }
        map.put("ldomain", a);
        map.put("lbundle", iAConfigManager.x.a(a.a(str), "LAST_APP_BUNDLE_ID"));
        String a2 = iAConfigManager.x.a(a.a(str), "LAST_CLICKED");
        if (TextUtils.equals(a2, "0")) {
            a2 = "";
        }
        map.put("lclick", a2);
        String a3 = iAConfigManager.x.a(a.a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(a3, "0")) {
            a3 = "";
        }
        map.put("v_lskip", a3);
        UnitDisplayType a4 = a.a(str);
        map.put("v_lclicktype", a4.isFullscreenUnit() ? iAConfigManager.x.a(a4, "LAST_VAST_CLICKED_TYPE") : "");
        Long b = a.b();
        map.put("sdur", b != null ? String.valueOf(b) : "");
        map.put("userid", IAConfigManager.h());
        map.put("low_power_mode", a(a.l()));
        map.put("dark_mode", a(a.g()));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    public static String a(Boolean bool) {
        return bool == null ? "" : bool.booleanValue() ? "1" : "0";
    }

    public String a(Intent intent) {
        return a.a((intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / intent.getIntExtra("scale", -1));
    }
}
