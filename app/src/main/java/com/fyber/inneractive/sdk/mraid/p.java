package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.k0;
import java.util.Map;

/* loaded from: classes.dex */
public class p extends b {
    public p(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        Map<String, String> map = this.b;
        this.c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && "false".equals(this.b.get("allowOrientationChange"))) ? false : true, this.b.get("forceOrientation"));
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }
}
