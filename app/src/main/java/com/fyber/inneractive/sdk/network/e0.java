package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e0<T> extends d0<T> {
    public final Context i;
    public final com.fyber.inneractive.sdk.cache.a<T> j;
    public t<T> k;

    public e0(u<T> uVar, Context context, com.fyber.inneractive.sdk.cache.a<T> aVar) {
        this(uVar, context, aVar, v.a().c());
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        z zVar = new z();
        try {
            String stringBuffer = com.fyber.inneractive.sdk.util.q.a(jVar.c, false).toString();
            zVar.a = this.j.a(stringBuffer);
            zVar.b = stringBuffer;
            return zVar;
        } catch (Exception e) {
            IAlog.a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new y(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public String c() {
        return this.j.c();
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public a<T> h() {
        com.fyber.inneractive.sdk.cache.i iVar;
        Context context = this.i;
        com.fyber.inneractive.sdk.cache.a<T> aVar = this.j;
        t<T> tVar = new t<>(context, aVar);
        this.k = tVar;
        try {
            if (!aVar.d()) {
                iVar = new com.fyber.inneractive.sdk.cache.i(new t.a());
            } else {
                T a = tVar.b.a(tVar.a(tVar.b.c()));
                if (tVar.c == null) {
                    tVar.c = context.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                iVar = new com.fyber.inneractive.sdk.cache.i(a, tVar.c.getString(tVar.b.b(), null));
            }
        } catch (Exception e) {
            if (tVar.c == null) {
                tVar.c = tVar.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.c.edit().remove(tVar.b.b()).apply();
            iVar = new com.fyber.inneractive.sdk.cache.i(e);
        }
        return new a<>(iVar.b, iVar.a, this.j.c());
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

    public e0(u<T> uVar, Context context, com.fyber.inneractive.sdk.cache.a<T> aVar, g gVar) {
        super(uVar, gVar);
        this.i = context;
        this.j = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        return this.j.a();
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public void a(z zVar, String str, String str2) {
        t<T> tVar = this.k;
        if (tVar != null) {
            if (tVar.c == null) {
                tVar.c = tVar.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.c.edit().putString(tVar.b.b(), str2).apply();
            if (zVar.b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.k.a(str, zVar.b)) {
                IAlog.b("Failed to cache file", new Object[0]);
            } else {
                this.j.a((com.fyber.inneractive.sdk.cache.a<T>) zVar.a);
            }
        }
    }
}
