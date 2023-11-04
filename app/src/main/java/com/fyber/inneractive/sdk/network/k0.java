package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.global.features.m;
import com.fyber.inneractive.sdk.util.IAlog;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class k0 extends d0<com.fyber.inneractive.sdk.response.e> {
    public final String i;
    public final com.fyber.inneractive.sdk.bidder.adm.f j;
    public int k;
    public final int l;
    public final com.fyber.inneractive.sdk.response.e m;
    public final com.fyber.inneractive.sdk.config.global.s n;

    public k0(u<com.fyber.inneractive.sdk.response.e> uVar, String str, com.fyber.inneractive.sdk.bidder.adm.f fVar, com.fyber.inneractive.sdk.config.global.s sVar, com.fyber.inneractive.sdk.response.e eVar) {
        super(uVar, ((com.fyber.inneractive.sdk.config.global.features.m) sVar.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c() == m.b.OKHTTP ? v.a().b() : v.a().c(), sVar);
        this.k = 0;
        this.i = str;
        this.j = fVar;
        this.l = ((com.fyber.inneractive.sdk.config.global.features.m) sVar.a(com.fyber.inneractive.sdk.config.global.features.m.class)).d();
        this.m = eVar;
        this.n = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public String a() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public l0 g() {
        return l0.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public com.fyber.inneractive.sdk.config.global.s j() {
        return this.n;
    }

    @Override // com.fyber.inneractive.sdk.network.d0, com.fyber.inneractive.sdk.network.a0
    public q0 k() {
        long j;
        long j2;
        com.fyber.inneractive.sdk.config.global.s sVar = this.n;
        if (sVar != null) {
            Integer b = ((com.fyber.inneractive.sdk.config.global.features.m) sVar.a(com.fyber.inneractive.sdk.config.global.features.m.class)).b("so");
            if (b != null && b.intValue() >= 1 && b.intValue() <= com.fyber.inneractive.sdk.config.global.features.m.e) {
                j = b.intValue();
            } else {
                j = com.fyber.inneractive.sdk.config.global.features.m.f;
            }
            int i = (int) j;
            Integer b2 = ((com.fyber.inneractive.sdk.config.global.features.m) sVar.a(com.fyber.inneractive.sdk.config.global.features.m.class)).b("rto");
            if (b2 != null && b2.intValue() >= 1 && b2.intValue() <= com.fyber.inneractive.sdk.config.global.features.m.e) {
                j2 = b2.intValue();
            } else {
                j2 = com.fyber.inneractive.sdk.config.global.features.m.f;
            }
            return new q0(i, (int) j2);
        }
        return super.k();
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public boolean l() {
        int i = this.l;
        int i2 = this.k;
        boolean z = i > i2;
        this.k = i2 + 1;
        return z;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public x o() {
        return x.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.a0
    public int r() {
        m.a aVar;
        String a = ((com.fyber.inneractive.sdk.config.global.features.m) this.n.a(com.fyber.inneractive.sdk.config.global.features.m.class)).a("bot", "EXPONENTIAL");
        m.a[] values = m.a.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                aVar = values[i];
                String str = aVar.stringName;
                Locale locale = Locale.ROOT;
                if (str.toLowerCase(locale).equals(a.toLowerCase(locale))) {
                    break;
                }
                i++;
            } else {
                aVar = m.a.EXPONENTIAL;
                break;
            }
        }
        if (aVar == m.a.STATIC) {
            return this.k * HttpStatus.SC_INTERNAL_SERVER_ERROR;
        }
        return (int) Math.min(Math.pow(2.0d, this.k) * 250.0d, 10000.0d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.fyber.inneractive.sdk.response.e] */
    @Override // com.fyber.inneractive.sdk.network.a0
    public z a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        z zVar = new z();
        try {
            InputStream inputStream = jVar.c;
            if (inputStream != null) {
                String stringBuffer = com.fyber.inneractive.sdk.util.q.a(inputStream, false).toString();
                int b = this.j.b();
                com.fyber.inneractive.sdk.bidder.adm.f fVar = this.j;
                fVar.c = stringBuffer;
                ?? a = a(b, null, fVar, null);
                a.h = stringBuffer;
                zVar.a = a;
            }
            return zVar;
        } catch (b e) {
            e = e;
            IAlog.a("failed parse adm network request but will re-try", e, new Object[0]);
            throw new w0(e);
        } catch (SocketTimeoutException e2) {
            e = e2;
            IAlog.a("failed parse adm network request but will re-try", e, new Object[0]);
            throw new w0(e);
        } catch (UnknownHostException e3) {
            e = e3;
            IAlog.a("failed parse adm network request but will re-try", e, new Object[0]);
            throw new w0(e);
        } catch (Exception e4) {
            IAlog.a("failed parse adm network request", e4, new Object[0]);
            throw new y(e4);
        }
    }
}
