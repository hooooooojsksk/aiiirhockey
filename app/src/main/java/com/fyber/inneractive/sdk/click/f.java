package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.k0;
import com.fyber.inneractive.sdk.web.t;

/* loaded from: classes.dex */
public class f implements com.fyber.inneractive.sdk.click.a {
    public t a;
    public boolean b;
    public final a c;
    public final k0 d;
    public final com.fyber.inneractive.sdk.util.e e;

    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar, k0 k0Var, com.fyber.inneractive.sdk.util.e eVar);
    }

    public f(a aVar, k0 k0Var, com.fyber.inneractive.sdk.util.e eVar) {
        this.c = aVar;
        this.d = k0Var;
        this.e = eVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public boolean a(Uri uri, l lVar) {
        com.fyber.inneractive.sdk.ignite.k kVar = com.fyber.inneractive.sdk.ignite.k.NONE;
        com.fyber.inneractive.sdk.ignite.k kVar2 = lVar.k;
        this.b = lVar.j;
        this.a = lVar.i;
        if (kVar2 != kVar && IAConfigManager.M.E.d()) {
            t tVar = this.a;
            if (tVar != null && tVar.l) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007b  */
    @Override // com.fyber.inneractive.sdk.click.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.click.b a(android.content.Context r12, android.net.Uri r13, java.util.List<com.fyber.inneractive.sdk.click.i> r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.click.f.a(android.content.Context, android.net.Uri, java.util.List):com.fyber.inneractive.sdk.click.b");
    }
}
