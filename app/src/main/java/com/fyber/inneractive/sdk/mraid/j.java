package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.k0;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends b {
    public j(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        com.fyber.inneractive.sdk.web.i iVar = this.c;
        iVar.a(new w(iVar.e0, iVar.f0));
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }
}
