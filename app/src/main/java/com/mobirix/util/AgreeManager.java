package com.mobirix.util;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AgreeManager {
    public static Activity act;

    public void init(Activity activity) {
        act = activity;
    }

    public static String agm_getLanguage() {
        return Locale.getDefault().toString();
    }

    public static String agm_getPackage() {
        return act.getPackageName();
    }

    public static void agm_openUrl(final String str) {
        try {
            act.runOnUiThread(new Runnable() { // from class: com.mobirix.util.AgreeManager.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AgreeManager.act.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}
