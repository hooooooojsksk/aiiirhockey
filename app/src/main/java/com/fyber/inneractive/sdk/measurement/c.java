package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes.dex */
public class c implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b b;

    public c(b bVar, Context context) {
        this.b = bVar;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Omid.activate(this.a);
            this.b.e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            b.a(this.b, this.a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th) {
            IAlog.a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.b.getClass();
            r.a(th.getClass().getSimpleName(), String.format("%s - %s", "OpenMeasurementMeasurer", th.getMessage()), null, null);
        }
    }
}
