package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.web.i;

/* loaded from: classes.dex */
public class x extends u {
    public final i.g a;

    public x(i.g gVar) {
        this.a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.mraid.u
    public String a() {
        return "placementType: '" + this.a.toString().toLowerCase() + "'";
    }
}
