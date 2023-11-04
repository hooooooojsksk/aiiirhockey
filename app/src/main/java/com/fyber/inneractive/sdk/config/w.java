package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.config.l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes.dex */
public class w {
    public static void a(Context context, v vVar) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            IAlog.d("advertising id: %s", id);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            IAlog.d("limit ad tracking: %s", Boolean.valueOf(isLimitAdTrackingEnabled));
            l lVar = (l) vVar;
            synchronized (lVar) {
                l.c cVar = lVar.b;
                cVar.a = id;
                cVar.b = isLimitAdTrackingEnabled;
                cVar.c = false;
            }
        } catch (Exception e) {
            IAlog.d("Handled Exception:", new Object[0]);
            IAlog.d(com.fyber.inneractive.sdk.util.q.b(e), new Object[0]);
            IAlog.c("Advertising ID is not available. Please add Google Play Services library (v 4.0+) to improve your ad targeting. (relevant for devices running Android API 2.3 and above)", new Object[0]);
        }
    }
}
