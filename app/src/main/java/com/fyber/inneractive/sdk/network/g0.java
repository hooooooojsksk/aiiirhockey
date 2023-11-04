package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class g0 extends d0<String> {
    public final String i;
    public final AtomicInteger j;

    /* loaded from: classes.dex */
    public class a implements u<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
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
            IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.b));
        }
    }

    public g0(u<String> uVar, String str, g gVar) {
        super(uVar, gVar);
        this.j = new AtomicInteger();
        this.i = str;
    }

    public static void b(String str) {
        g0 g0Var = new g0(new a(str, System.currentTimeMillis()), str, v.c.c());
        IAConfigManager.M.s.a.offer(g0Var);
        g0Var.a(n0.QUEUED);
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
        return this.j.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        return ((int) Math.pow(2.0d, this.j.get())) * 1000;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        try {
            z zVar = new z();
            zVar.a = String.valueOf(i);
            InputStream inputStream = jVar.c;
            if (inputStream != null) {
                zVar.b = com.fyber.inneractive.sdk.util.q.a(inputStream, false).toString();
            }
            return zVar;
        } catch (Exception e) {
            IAlog.a("failed parse hit network request", e, new Object[0]);
            throw new y(e);
        }
    }
}
