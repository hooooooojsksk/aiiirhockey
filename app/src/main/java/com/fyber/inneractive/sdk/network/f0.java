package com.fyber.inneractive.sdk.network;

import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f0 extends d0<String> {
    public String i;
    public final String j;
    public final AtomicInteger k;

    public f0(u<String> uVar, String str, String str2, g gVar) {
        super(uVar, gVar);
        this.k = new AtomicInteger();
        this.j = str;
        this.i = str2;
        this.c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean l() {
        return this.k.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        return ((int) Math.pow(2.0d, this.k.get())) * 1000;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        try {
            z zVar = new z();
            zVar.a = String.valueOf(i);
            return zVar;
        } catch (Exception e) {
            IAlog.a("failed parse event network request", e, new Object[0]);
            throw new y(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public byte[] q() {
        byte[] bytes;
        try {
            IAlog.a("NetworkRequestEvent: network request body %s", this.i);
            if (Build.VERSION.SDK_INT >= 19) {
                bytes = this.i.getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = this.i.getBytes("UTF-8");
            }
            return bytes;
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
