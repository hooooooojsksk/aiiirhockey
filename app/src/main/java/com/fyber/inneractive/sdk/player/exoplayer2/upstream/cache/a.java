package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$a */
    /* loaded from: classes.dex */
    public static class C0047a extends IOException {
        public C0047a(String str) {
            super(str);
        }

        public C0047a(IOException iOException) {
            super(iOException);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(a aVar, g gVar);

        void a(a aVar, g gVar, g gVar2);

        void b(a aVar, g gVar);
    }

    long a();

    long a(String str);

    File a(String str, long j, long j2) throws C0047a;

    void a(g gVar) throws C0047a;

    void a(File file) throws C0047a;

    void a(String str, long j) throws C0047a;

    g b(String str, long j) throws InterruptedException, C0047a;

    void b(g gVar);

    g c(String str, long j) throws C0047a;
}
