package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h0 extends d0<IgniteResponseOuterClass$IgniteResponse> {
    public final byte[] i;
    public final AtomicInteger j;

    public h0(u<IgniteResponseOuterClass$IgniteResponse> uVar, byte[] bArr, g gVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(uVar, gVar, sVar);
        this.j = new AtomicInteger();
        this.i = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        return "https://init-mp.fyber.com/init";
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean l() {
        return this.j.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public String n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public byte[] q() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        return ((int) Math.pow(2.0d, this.j.get())) * 1000;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse, T] */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        try {
            z zVar = new z();
            InputStream inputStream = jVar.c;
            if (inputStream != null) {
                String a = com.fyber.inneractive.sdk.util.q.a(inputStream);
                ?? parseFrom = IgniteResponseOuterClass$IgniteResponse.parseFrom(a.getBytes());
                zVar.b = a;
                zVar.a = parseFrom;
            }
            return zVar;
        } catch (Exception e) {
            IAlog.a("failed parse ignite network request", e, new Object[0]);
            throw new y(e);
        } catch (Throwable th) {
            IAlog.a("failed parse ignite network request", th, new Object[0]);
            throw new y("failed to parse ignite network request");
        }
    }
}
