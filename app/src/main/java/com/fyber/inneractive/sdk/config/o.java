package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.n0;
import com.fyber.inneractive.sdk.network.p0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class o implements com.fyber.inneractive.sdk.network.u<IAConfigManager.c> {
    public final /* synthetic */ IAConfigManager a;

    public o(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(IAConfigManager.c cVar, Exception exc, boolean z) {
        int i;
        IAConfigManager.c cVar2 = cVar;
        boolean z2 = false;
        if (cVar2 != null) {
            if (z) {
                IAConfigManager iAConfigManager = this.a;
                IAConfigManager iAConfigManager2 = IAConfigManager.M;
                iAConfigManager.getClass();
                iAConfigManager.e = cVar2.c;
                iAConfigManager.d = cVar2.b;
                iAConfigManager.a = cVar2.d;
                iAConfigManager.b = cVar2.e;
            } else {
                IAConfigManager.N = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.e = cVar2.c;
                iAConfigManager3.d = cVar2.b;
                iAConfigManager3.a = cVar2.d;
                iAConfigManager3.b = cVar2.e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.f) {
            IAConfigManager.N = System.currentTimeMillis();
        }
        if (z) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.a;
        boolean i2 = IAConfigManager.i();
        iAConfigManager4.getClass();
        if (i2) {
            iAConfigManager4.a((Exception) null);
        } else {
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof p0) ? TextUtils.isEmpty(iAConfigManager4.c.trim()) : !((i = ((p0) exc).a) < 400 || i >= 500))) {
                z2 = true;
            }
            if (z2) {
                iAConfigManager4.a(new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(exc);
            } else {
                iAConfigManager4.a(new IAConfigManager.d());
            }
        }
        if (IAConfigManager.i()) {
            IAConfigManager iAConfigManager5 = this.a;
            if (iAConfigManager5.C == null) {
                iAConfigManager5.C = new com.fyber.inneractive.sdk.network.e0(new q(iAConfigManager5), iAConfigManager5.f, new com.fyber.inneractive.sdk.config.global.m());
            }
            n0 m = iAConfigManager5.C.m();
            if (m == n0.RUNNING || m == n0.QUEUED) {
                return;
            }
            iAConfigManager5.s.c(iAConfigManager5.C);
        }
    }
}
