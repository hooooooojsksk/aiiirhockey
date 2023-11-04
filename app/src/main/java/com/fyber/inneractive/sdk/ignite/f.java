package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class f implements u<String> {
    public final /* synthetic */ String a;

    public f(c cVar, String str) {
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.network.u
    public void a(String str, Exception exc, boolean z) {
        String str2 = str;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str2);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
    }
}
