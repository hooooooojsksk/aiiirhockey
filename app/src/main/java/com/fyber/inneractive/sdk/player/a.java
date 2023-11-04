package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.c0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.util.l;

/* loaded from: classes.dex */
public class a {
    public d0 a;
    public InterfaceC0024a b;

    /* renamed from: com.fyber.inneractive.sdk.player.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0024a {
    }

    public a(d0 d0Var) {
        this.a = d0Var;
    }

    public InterfaceC0024a a() throws Throwable {
        c0 c0Var;
        UnitDisplayType unitDisplayType;
        if (this.b == null) {
            Application application = l.a;
            d0 d0Var = this.a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) d0Var.b;
            b0 b0Var = d0Var.d;
            InneractiveAdRequest inneractiveAdRequest = d0Var.a;
            com.fyber.inneractive.sdk.measurement.a aVar = null;
            if (d0Var != null && b0Var != null && ((com.fyber.inneractive.sdk.config.global.features.l) d0Var.c.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c() && (c0Var = ((a0) this.a.d).f) != null && ((unitDisplayType = c0Var.j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                aVar = IAConfigManager.M.J;
            }
            this.b = new e(application, gVar, b0Var, inneractiveAdRequest, d0Var, aVar);
        }
        return this.b;
    }
}
