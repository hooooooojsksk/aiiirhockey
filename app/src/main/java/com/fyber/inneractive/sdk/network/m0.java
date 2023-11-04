package com.fyber.inneractive.sdk.network;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class m0 extends d0<com.fyber.inneractive.sdk.click.c> {
    public final String i;

    public m0(u<com.fyber.inneractive.sdk.click.c> uVar, String str, g gVar) {
        super(uVar, gVar);
        this.i = str;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean l() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.fyber.inneractive.sdk.click.c] */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        z zVar = new z();
        ?? cVar = new com.fyber.inneractive.sdk.click.c();
        List<String> list = jVar.f;
        cVar.a.clear();
        cVar.a.addAll(list);
        InputStream inputStream = jVar.c;
        if (inputStream != null) {
            String stringBuffer = com.fyber.inneractive.sdk.util.q.a(inputStream, false).toString();
            cVar.b = stringBuffer;
            zVar.b = stringBuffer;
        }
        zVar.a = cVar;
        return zVar;
    }
}
