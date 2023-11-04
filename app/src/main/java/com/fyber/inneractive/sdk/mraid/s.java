package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.k0;
import java.util.Map;

/* loaded from: classes.dex */
public class s extends b {
    public s(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.b.get("shouldUseCustomClose"));
        if (InneractiveAdManager.isCurrentUserAChild()) {
            equals = false;
        }
        this.c.c(equals);
    }
}
