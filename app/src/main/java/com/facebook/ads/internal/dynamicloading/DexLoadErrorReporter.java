package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DexLoadErrorReporter {
    private static final String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final AtomicBoolean sAlreadyReported = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r6v2, types: [com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter$1] */
    public static void reportDexLoadingIssue(final Context context, final String str, double d) {
        AtomicBoolean atomicBoolean = sAlreadyReported;
        if (atomicBoolean.get() || Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new Thread() { // from class: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.1
            /* JADX WARN: Removed duplicated region for block: B:165:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:181:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 424
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.AnonymousClass1.run():void");
            }
        }.start();
    }

    public static void addEnvFields(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }
}
