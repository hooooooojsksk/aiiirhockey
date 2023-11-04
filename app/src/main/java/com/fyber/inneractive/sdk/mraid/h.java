package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.k0;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends b {
    public h(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        this.c.a(g.GET_CURRENT_POSITION, "Unsupported action getCurrentPosition");
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }
}
