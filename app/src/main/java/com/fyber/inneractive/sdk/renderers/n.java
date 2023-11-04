package com.fyber.inneractive.sdk.renderers;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.player.b;

/* loaded from: classes.dex */
public abstract class n {
    public com.fyber.inneractive.sdk.player.controller.b a;
    public com.fyber.inneractive.sdk.player.ui.h b;
    public com.fyber.inneractive.sdk.player.e c;

    public n(com.fyber.inneractive.sdk.player.h hVar) {
        this.c = (com.fyber.inneractive.sdk.player.e) hVar.c();
    }

    public abstract com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, d0 d0Var);

    public abstract void a(b.d dVar);

    public boolean a() {
        d0 d0Var;
        T t;
        com.fyber.inneractive.sdk.player.e eVar = this.c;
        boolean z = false;
        if (((eVar == null || (d0Var = eVar.f) == null || (t = d0Var.b) == 0 || ((com.fyber.inneractive.sdk.response.g) t).C == null) ? false : true) && TextUtils.equals(((com.fyber.inneractive.sdk.response.g) eVar.f.b).C, "1")) {
            z = true;
        }
        return !z;
    }

    public String b() {
        d0 d0Var;
        T t;
        com.fyber.inneractive.sdk.player.e eVar = this.c;
        if (eVar == null || (d0Var = eVar.f) == null || (t = d0Var.b) == 0 || TextUtils.isEmpty(((com.fyber.inneractive.sdk.response.g) t).D)) {
            return null;
        }
        return ((com.fyber.inneractive.sdk.response.g) this.c.f.b).D;
    }

    public abstract boolean c();
}
