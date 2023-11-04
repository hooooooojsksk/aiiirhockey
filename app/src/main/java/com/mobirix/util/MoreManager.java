package com.mobirix.util;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.telephony.TelephonyManager;
import java.util.List;

/* loaded from: classes2.dex */
public class MoreManager {
    public static final int _COL = 1;
    public static final int _ROW = 0;

    public static native int NativeInstallPackage(String str);

    public static native int NativeMoreSet(String str, String str2, String str3, String str4, String str5, int i, int i2);

    public void init(Activity activity, String str, String str2, int i) {
        String str3;
        try {
            str3 = ((TelephonyManager) activity.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            str3 = "";
        }
        init(activity, str, str2, i, str3);
    }

    public void init(Activity activity, String str, String str2, int i, String str3) {
        int i2;
        String stringExtra;
        int i3 = 0;
        try {
            List<ApplicationInfo> installedApplications = activity.getPackageManager().getInstalledApplications(0);
            int size = installedApplications.size();
            for (int i4 = 0; i4 < size; i4++) {
                ApplicationInfo applicationInfo = installedApplications.get(i4);
                if (applicationInfo.packageName.contains(".mobirix.")) {
                    NativeInstallPackage(applicationInfo.packageName);
                }
            }
        } catch (Exception unused) {
        }
        String packageName = activity.getPackageName();
        try {
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null && (stringExtra = intent.getStringExtra("push_url")) != null) {
                if (stringExtra.length() > 0) {
                    i3 = 1;
                }
            }
            i2 = i3;
        } catch (Exception unused2) {
            i2 = 0;
        }
        NativeMoreSet(str, str2, str3, packageName, "https://dzpu6za66svjl.cloudfront.net/new_morelist/arcade/morelist.json", i, i2);
    }
}
