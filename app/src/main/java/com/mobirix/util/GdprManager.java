package com.mobirix.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.telephony.TelephonyManager;
import java.util.Locale;

/* loaded from: classes2.dex */
public class GdprManager {
    public static final boolean DEBUG = false;
    private static final String TAG = "GdprManager";
    public static Activity activity;
    public static Handler handler = new Handler();

    public void init(Activity activity2) {
        activity = activity2;
    }

    public static void gdpr_openUrl(final String str) {
        handler.post(new Runnable() { // from class: com.mobirix.util.GdprManager.1
            @Override // java.lang.Runnable
            public void run() {
                GdprManager.activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        });
    }

    public static String gdpr_getCountry() {
        return ((TelephonyManager) activity.getSystemService("phone")).getNetworkCountryIso();
    }

    public static String gdpr_getLanguage() {
        return Locale.getDefault().toString();
    }
}
