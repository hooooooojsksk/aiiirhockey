package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes.dex */
public class j extends i implements IAConfigManager.OnConfigurationReadyAndValidListener {
    public final boolean i;
    public int j;
    public long k;
    public final Runnable l;
    public final Runnable m;
    public com.fyber.inneractive.sdk.response.e n;
    public long o;
    public boolean p;
    public long q;
    public long r;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            if (jVar.p && jVar.i) {
                jVar.getClass();
                IAlog.d("%s mTimeOutChecker invoked", IAlog.a(jVar));
                com.fyber.inneractive.sdk.metrics.c.d.b(j.this.h).a("dyn_timeout");
                j.this.a(true);
                j.this.p = false;
                j.a(j.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(j.this);
        }
    }

    public j(String str) {
        super(str);
        this.k = 0L;
        this.l = new a();
        this.m = new b();
        this.o = 8000L;
        this.p = false;
        this.j = 0;
        this.i = ((com.fyber.inneractive.sdk.config.global.features.m) IAConfigManager.e().a(com.fyber.inneractive.sdk.config.global.features.m.class)).e();
    }

    @Override // com.fyber.inneractive.sdk.flow.i
    public void e() {
        String str;
        com.fyber.inneractive.sdk.response.e eVar = this.n;
        InneractiveAdRequest inneractiveAdRequest = this.e;
        if (eVar == null || (str = eVar.z) == null) {
            return;
        }
        com.fyber.inneractive.sdk.metrics.g b2 = com.fyber.inneractive.sdk.metrics.c.d.b(str);
        com.fyber.inneractive.sdk.config.global.s sVar = this.f;
        if (sVar == null) {
            sVar = com.fyber.inneractive.sdk.config.global.s.b();
        }
        b2.a(eVar, inneractiveAdRequest, sVar);
    }

    public final boolean g() {
        long min = Math.min(this.o, this.r - (System.currentTimeMillis() - this.q));
        boolean z = this.j <= 6 && min >= 500;
        IAlog.d("maybeRetryAdLoad time left - %d, hasSufficientTimeForAnotherLoad ? %b", Long.valueOf(min), Boolean.valueOf(z));
        return z;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z) {
            return;
        }
        b(this.e, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, f.NO_APP_CONFIG_AVAILABLE, exc));
    }

    @Override // com.fyber.inneractive.sdk.flow.i, com.fyber.inneractive.sdk.interfaces.a.InterfaceC0019a
    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.metrics.c.d.b(this.h).a(inneractiveInfrastructureError.getErrorCode().toString());
        this.p = false;
        if (this.i && inneractiveInfrastructureError.getErrorCode() != InneractiveErrorCode.IN_FLIGHT_TIMEOUT) {
            Handler handler = com.fyber.inneractive.sdk.util.m.b;
            handler.removeCallbacks(this.l);
            handler.postDelayed(this.m, 500 - (System.currentTimeMillis() - this.k));
            return;
        }
        super.a(inneractiveInfrastructureError);
    }

    public static void a(j jVar) {
        jVar.j++;
        if (!jVar.i) {
            jVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, f.AD_RELOAD_NOT_ACTIVE));
        } else if (jVar.g()) {
            IAlog.d("%s maybeRetryAdLoad trying again", IAlog.a(jVar));
            jVar.a(jVar.e, jVar.n);
            jVar.a(jVar.e, jVar.n, jVar.f, jVar);
        } else {
            IAlog.d("%s maybeRetryAdLoad failing", IAlog.a(jVar));
            jVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, f.NO_TIME_TO_RETRY));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.i, com.fyber.inneractive.sdk.interfaces.a.InterfaceC0019a
    public void a() {
        this.p = false;
        com.fyber.inneractive.sdk.metrics.c.d.b(this.h).a(FirebaseAnalytics.Param.SUCCESS);
        super.a();
        if (this.i) {
            com.fyber.inneractive.sdk.util.m.b.removeCallbacks(this.l);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.i
    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.s sVar, i iVar) {
        this.p = true;
        this.k = System.currentTimeMillis();
        ((g) this.c).a(inneractiveAdRequest, eVar, sVar, this);
        if (this.i) {
            long min = Math.min(this.o, this.r - (System.currentTimeMillis() - this.q));
            IAlog.d("IAAdSourceLoad staring to load ad with %d timeout", Long.valueOf(min));
            com.fyber.inneractive.sdk.util.m.b.postDelayed(this.l, min);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.i
    public void a(boolean z) {
        com.fyber.inneractive.sdk.interfaces.a aVar = this.c;
        if (aVar != null && z) {
            aVar.a();
            this.c = null;
        }
        Handler handler = com.fyber.inneractive.sdk.util.m.b;
        handler.removeCallbacks(this.l);
        handler.removeCallbacks(this.m);
    }

    @Override // com.fyber.inneractive.sdk.flow.i
    public void a(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest) {
        String str;
        if (eVar == null || (str = eVar.z) == null) {
            return;
        }
        com.fyber.inneractive.sdk.metrics.g b2 = com.fyber.inneractive.sdk.metrics.c.d.b(str);
        com.fyber.inneractive.sdk.config.global.s sVar = this.f;
        if (sVar == null) {
            sVar = com.fyber.inneractive.sdk.config.global.s.b();
        }
        b2.a(eVar, inneractiveAdRequest, sVar);
    }
}
