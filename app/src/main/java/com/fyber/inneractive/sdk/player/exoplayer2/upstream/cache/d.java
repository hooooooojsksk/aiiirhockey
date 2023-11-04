package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g d;
    public final a e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.g i;
    public boolean j;
    public Uri k;
    public int l;
    public String m;
    public long n;
    public long o;
    public g p;
    public boolean q;
    public boolean r;
    public long s;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j, long j2);
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar2, com.fyber.inneractive.sdk.player.exoplayer2.upstream.f fVar, int i, a aVar2) {
        this.a = aVar;
        this.b = gVar2;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        this.d = gVar;
        if (fVar != null) {
            this.c = new z(gVar, fVar);
        } else {
            this.c = null;
        }
        this.e = aVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws IOException {
        try {
            Uri uri = jVar.a;
            this.k = uri;
            this.l = jVar.g;
            String str = jVar.f;
            if (str == null) {
                str = uri.toString();
            }
            this.m = str;
            this.n = jVar.d;
            boolean z = (this.g && this.q) || (jVar.e == -1 && this.h);
            this.r = z;
            long j = jVar.e;
            if (j == -1 && !z) {
                long a2 = this.a.a(str);
                this.o = a2;
                if (a2 != -1) {
                    long j2 = a2 - jVar.d;
                    this.o = j2;
                    if (j2 <= 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.h(0);
                    }
                }
                a(true);
                return this.o;
            }
            this.o = j;
            a(true);
            return this.o;
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    public final void b() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.i;
        if (gVar == null) {
            return;
        }
        try {
            gVar.close();
            this.i = null;
            this.j = false;
        } finally {
            g gVar2 = this.p;
            if (gVar2 != null) {
                this.a.b(gVar2);
                this.p = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        this.k = null;
        a aVar = this.e;
        if (aVar != null && this.s > 0) {
            aVar.a(this.a.a(), this.s);
            this.s = 0L;
        }
        try {
            b();
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        try {
            int a2 = this.i.a(bArr, i, i2);
            if (a2 >= 0) {
                if (this.i == this.b) {
                    this.s += a2;
                }
                long j = a2;
                this.n += j;
                long j2 = this.o;
                if (j2 != -1) {
                    this.o = j2 - j;
                }
            } else {
                if (this.j) {
                    long j3 = this.n;
                    if (this.i == this.c) {
                        this.a.a(this.m, j3);
                    }
                    this.o = 0L;
                }
                b();
                long j4 = this.o;
                if ((j4 > 0 || j4 == -1) && a(false)) {
                    return a(bArr, i, i2);
                }
            }
            return a2;
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.i;
        return gVar == this.d ? gVar.a() : this.k;
    }

    public final boolean a(boolean z) throws IOException {
        g b;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar;
        IOException iOException = null;
        if (this.r) {
            b = null;
        } else if (this.f) {
            try {
                b = this.a.b(this.m, this.n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            b = this.a.c(this.m, this.n);
        }
        boolean z2 = true;
        if (b == null) {
            this.i = this.d;
            Uri uri = this.k;
            long j = this.n;
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri, null, j, j, this.o, this.m, this.l);
        } else if (b.d) {
            Uri fromFile = Uri.fromFile(b.e);
            long j2 = this.n - b.b;
            long j3 = b.c - j2;
            long j4 = this.o;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(fromFile, null, this.n, j2, j3, this.m, this.l);
            this.i = this.b;
            jVar = jVar2;
        } else {
            long j5 = b.c;
            if (j5 == -1) {
                j5 = this.o;
            } else {
                long j6 = this.o;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            Uri uri2 = this.k;
            long j7 = this.n;
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri2, null, j7, j7, j5, this.m, this.l);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.c;
            if (gVar != null) {
                this.i = gVar;
                this.p = b;
            } else {
                this.i = this.d;
                this.a.b(b);
            }
        }
        this.j = jVar.e == -1;
        long j8 = 0;
        try {
            j8 = this.i.a(jVar);
        } catch (IOException e) {
            if (!z && this.j) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if ((th instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.h) && ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.h) th).a == 0) {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException != null) {
                throw iOException;
            }
            z2 = false;
        }
        if (this.j && j8 != -1) {
            this.o = j8;
            long j9 = jVar.d + j8;
            if (this.i == this.c) {
                this.a.a(this.m, j9);
            }
        }
        return z2;
    }

    public final void a(IOException iOException) {
        if (this.i == this.b || (iOException instanceof a.C0047a)) {
            this.q = true;
        }
    }
}
