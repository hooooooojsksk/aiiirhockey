package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.player.b;

/* loaded from: classes.dex */
public class c extends n {
    public boolean d;

    public c(com.fyber.inneractive.sdk.player.h hVar) {
        super(hVar);
        this.d = false;
    }

    public com.fyber.inneractive.sdk.player.ui.h a(Context context, s sVar) {
        com.fyber.inneractive.sdk.flow.d dVar;
        boolean z;
        d0 d0Var;
        com.fyber.inneractive.sdk.ignite.k kVar;
        r rVar;
        if (this.b == null) {
            if (sVar != null && (rVar = (r) sVar.a(r.class)) != null) {
                this.d = rVar.a("use_video_design", false);
            }
            com.fyber.inneractive.sdk.player.e eVar = this.c;
            if (eVar == null || (d0Var = eVar.f) == null) {
                dVar = null;
                z = false;
            } else {
                com.fyber.inneractive.sdk.flow.d dVar2 = new com.fyber.inneractive.sdk.flow.d(d0Var.a, d0Var.b, sVar);
                com.fyber.inneractive.sdk.player.e eVar2 = this.c;
                T t = eVar2.f.b;
                if (t != 0) {
                    kVar = ((com.fyber.inneractive.sdk.response.g) t).F;
                } else {
                    kVar = com.fyber.inneractive.sdk.ignite.k.NONE;
                }
                z = eVar2.a(sVar, kVar);
                dVar = dVar2;
            }
            if (this.d) {
                this.b = new com.fyber.inneractive.sdk.player.ui.j(context, dVar, new com.fyber.inneractive.sdk.player.ui.e(), sVar, z, b());
            } else {
                this.b = new com.fyber.inneractive.sdk.player.ui.k(context, dVar, new com.fyber.inneractive.sdk.player.ui.e(), sVar, z, b());
            }
        }
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public boolean c() {
        this.c.getClass();
        return false;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, d0 d0Var) {
        if (this.a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean isOverlayOutside = selectedUnitController instanceof e0 ? ((e0) selectedUnitController).isOverlayOutside() : false;
            Skip a = inneractiveAdSpot instanceof b0 ? ((b0) inneractiveAdSpot).a() : null;
            if (this.d) {
                this.a = new com.fyber.inneractive.sdk.player.controller.e(this.c, (com.fyber.inneractive.sdk.player.ui.j) this.b, inneractiveAdSpot.getAdContent().d, d0Var.c, false, isOverlayOutside, a, d0Var.h(), b(), a());
            } else {
                this.a = new com.fyber.inneractive.sdk.player.controller.e(this.c, (com.fyber.inneractive.sdk.player.ui.k) this.b, inneractiveAdSpot.getAdContent().d, d0Var.c, false, isOverlayOutside, a, d0Var.h(), b(), a());
            }
        }
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public void a(b.d dVar) {
        com.fyber.inneractive.sdk.player.e eVar = this.c;
        eVar.getClass();
        dVar.a(eVar);
    }
}
