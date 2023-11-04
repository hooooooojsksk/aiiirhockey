package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.u;

/* loaded from: classes.dex */
public class f implements u<String> {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z) {
        String str2 = str;
        if (str2 != null) {
            this.a.c = str2;
        }
    }
}
