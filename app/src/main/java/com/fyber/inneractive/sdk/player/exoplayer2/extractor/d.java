package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class d implements n {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b a;
    public final int b;
    public final c c;
    public final LinkedBlockingDeque<com.fyber.inneractive.sdk.player.exoplayer2.upstream.a> d;
    public final b e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f;
    public final AtomicInteger g;
    public long h;
    public com.fyber.inneractive.sdk.player.exoplayer2.i i;
    public long j;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a k;
    public int l;
    public boolean m;
    public InterfaceC0034d n;

    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public long b;
        public long c;
        public byte[] d;

        public b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0034d {
        void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar);
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.a = bVar;
        int a2 = ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) bVar).a();
        this.b = a2;
        this.c = new c();
        this.d = new LinkedBlockingDeque<>();
        this.e = new b();
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(32);
        this.g = new AtomicInteger();
        this.l = a2;
    }

    public void a(boolean z) {
        int andSet = this.g.getAndSet(z ? 0 : 2);
        a();
        c cVar = this.c;
        cVar.m = Long.MIN_VALUE;
        cVar.n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.i = null;
        }
    }

    public void b() {
        if (this.g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public long d() {
        long max;
        c cVar = this.c;
        synchronized (cVar) {
            max = Math.max(cVar.m, cVar.n);
        }
        return max;
    }

    public com.fyber.inneractive.sdk.player.exoplayer2.i e() {
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar;
        c cVar = this.c;
        synchronized (cVar) {
            iVar = cVar.p ? null : cVar.q;
        }
        return iVar;
    }

    public boolean f() {
        boolean z;
        c cVar = this.c;
        synchronized (cVar) {
            z = cVar.i == 0;
        }
        return z;
    }

    public void g() {
        long j;
        c cVar = this.c;
        synchronized (cVar) {
            int i = cVar.i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = cVar.k + i;
                int i3 = cVar.a;
                int i4 = (i2 - 1) % i3;
                cVar.k = i2 % i3;
                cVar.j += i;
                cVar.i = 0;
                j = cVar.c[i4] + cVar.d[i4];
            }
        }
        if (j != -1) {
            a(j);
        }
    }

    public final boolean h() {
        return this.g.compareAndSet(0, 1);
    }

    public boolean a(long j, boolean z) {
        long j2;
        c cVar = this.c;
        synchronized (cVar) {
            if (cVar.i != 0) {
                long[] jArr = cVar.f;
                int i = cVar.k;
                if (j >= jArr[i] && (j <= cVar.n || z)) {
                    int i2 = -1;
                    int i3 = 0;
                    while (i != cVar.l && cVar.f[i] <= j) {
                        if ((cVar.e[i] & 1) != 0) {
                            i2 = i3;
                        }
                        i = (i + 1) % cVar.a;
                        i3++;
                    }
                    if (i2 != -1) {
                        int i4 = (cVar.k + i2) % cVar.a;
                        cVar.k = i4;
                        cVar.j += i2;
                        cVar.i -= i2;
                        j2 = cVar.c[i4];
                    }
                }
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return false;
        }
        a(j2);
        return true;
    }

    public int a(com.fyber.inneractive.sdk.player.exoplayer2.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar, boolean z, boolean z2, long j) {
        long j2;
        char c2;
        int i;
        c cVar = this.c;
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.i;
        b bVar2 = this.e;
        synchronized (cVar) {
            if (cVar.i != 0) {
                if (!z) {
                    com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = cVar.h;
                    int i2 = cVar.k;
                    if (iVarArr[i2] == iVar) {
                        if (!(bVar.c == null && bVar.e == 0)) {
                            long j3 = cVar.f[i2];
                            bVar.d = j3;
                            bVar.a = cVar.e[i2];
                            bVar2.a = cVar.d[i2];
                            bVar2.b = cVar.c[i2];
                            bVar2.d = cVar.g[i2];
                            cVar.m = Math.max(cVar.m, j3);
                            int i3 = cVar.i - 1;
                            cVar.i = i3;
                            int i4 = cVar.k + 1;
                            cVar.k = i4;
                            cVar.j++;
                            if (i4 == cVar.a) {
                                cVar.k = 0;
                            }
                            if (i3 > 0) {
                                j2 = cVar.c[cVar.k];
                            } else {
                                j2 = bVar2.b + bVar2.a;
                            }
                            bVar2.c = j2;
                            c2 = 65532;
                        }
                        c2 = 65533;
                    }
                }
                jVar.a = cVar.h[cVar.k];
                c2 = 65531;
            } else if (z2) {
                bVar.a = 4;
                c2 = 65532;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.i iVar2 = cVar.q;
                if (iVar2 != null && (z || iVar2 != iVar)) {
                    jVar.a = iVar2;
                    c2 = 65531;
                }
                c2 = 65533;
            }
        }
        if (c2 == 65531) {
            this.i = jVar.a;
            return -5;
        } else if (c2 != 65532) {
            if (c2 == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (bVar.b(4)) {
            return -4;
        } else {
            if (bVar.d < j) {
                bVar.a |= Integer.MIN_VALUE;
            }
            if (bVar.b(1073741824)) {
                b bVar3 = this.e;
                long j4 = bVar3.b;
                this.f.c(1);
                a(j4, this.f.a, 1);
                long j5 = j4 + 1;
                byte b2 = this.f.a[0];
                boolean z3 = (b2 & ByteCompanionObject.MIN_VALUE) != 0;
                int i5 = b2 & ByteCompanionObject.MAX_VALUE;
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar = bVar.b;
                if (aVar.a == null) {
                    aVar.a = new byte[16];
                }
                a(j5, aVar.a, i5);
                long j6 = j5 + i5;
                if (z3) {
                    this.f.c(2);
                    a(j6, this.f.a, 2);
                    j6 += 2;
                    i = this.f.q();
                } else {
                    i = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar2 = bVar.b;
                int[] iArr = aVar2.d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = aVar2.e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (z3) {
                    int i6 = i * 6;
                    this.f.c(i6);
                    a(j6, this.f.a, i6);
                    j6 += i6;
                    this.f.e(0);
                    for (int i7 = 0; i7 < i; i7++) {
                        iArr[i7] = this.f.q();
                        iArr2[i7] = this.f.o();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = bVar3.a - ((int) (j6 - bVar3.b));
                }
                com.fyber.inneractive.sdk.player.exoplayer2.decoder.a aVar3 = bVar.b;
                byte[] bArr = bVar3.d;
                byte[] bArr2 = aVar3.a;
                aVar3.f = i;
                aVar3.d = iArr;
                aVar3.e = iArr2;
                aVar3.b = bArr;
                aVar3.a = bArr2;
                aVar3.c = 1;
                int i8 = u.a;
                if (i8 >= 16) {
                    MediaCodec.CryptoInfo cryptoInfo = aVar3.g;
                    cryptoInfo.numSubSamples = i;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = 1;
                    if (i8 >= 24) {
                        a.b bVar4 = aVar3.h;
                        bVar4.b.set(0, 0);
                        bVar4.a.setPattern(bVar4.b);
                    }
                }
                long j7 = bVar3.b;
                int i9 = (int) (j6 - j7);
                bVar3.b = j7 + i9;
                bVar3.a -= i9;
            }
            int i10 = this.e.a;
            ByteBuffer byteBuffer = bVar.c;
            if (byteBuffer == null) {
                bVar.c = bVar.a(i10);
            } else {
                int capacity = byteBuffer.capacity();
                int position = bVar.c.position();
                int i11 = i10 + position;
                if (capacity < i11) {
                    ByteBuffer a2 = bVar.a(i11);
                    if (position > 0) {
                        bVar.c.position(0);
                        bVar.c.limit(position);
                        a2.put(bVar.c);
                    }
                    bVar.c = a2;
                }
            }
            b bVar5 = this.e;
            long j8 = bVar5.b;
            ByteBuffer byteBuffer2 = bVar.c;
            int i12 = bVar5.a;
            while (i12 > 0) {
                a(j8);
                int i13 = (int) (j8 - this.h);
                int min = Math.min(i12, this.b - i13);
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a peek = this.d.peek();
                byteBuffer2.put(peek.a, peek.b + i13, min);
                j8 += min;
                i12 -= min;
            }
            a(this.e.c);
            return -4;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public int i;
        public int j;
        public int k;
        public int l;
        public com.fyber.inneractive.sdk.player.exoplayer2.i q;
        public int r;
        public int a = 1000;
        public int[] b = new int[1000];
        public long[] c = new long[1000];
        public long[] f = new long[1000];
        public int[] e = new int[1000];
        public int[] d = new int[1000];
        public byte[][] g = new byte[1000];
        public com.fyber.inneractive.sdk.player.exoplayer2.i[] h = new com.fyber.inneractive.sdk.player.exoplayer2.i[1000];
        public long m = Long.MIN_VALUE;
        public long n = Long.MIN_VALUE;
        public boolean p = true;
        public boolean o = true;

        public synchronized void a(long j, int i, long j2, int i2, byte[] bArr) {
            if (this.o) {
                if ((i & 1) == 0) {
                    return;
                }
                this.o = false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.p);
            synchronized (this) {
                this.n = Math.max(this.n, j);
                long[] jArr = this.f;
                int i3 = this.l;
                jArr[i3] = j;
                long[] jArr2 = this.c;
                jArr2[i3] = j2;
                this.d[i3] = i2;
                this.e[i3] = i;
                this.g[i3] = bArr;
                this.h[i3] = this.q;
                this.b[i3] = this.r;
                int i4 = this.i + 1;
                this.i = i4;
                int i5 = this.a;
                if (i4 == i5) {
                    int i6 = i5 + 1000;
                    int[] iArr = new int[i6];
                    long[] jArr3 = new long[i6];
                    long[] jArr4 = new long[i6];
                    int[] iArr2 = new int[i6];
                    int[] iArr3 = new int[i6];
                    byte[][] bArr2 = new byte[i6];
                    com.fyber.inneractive.sdk.player.exoplayer2.i[] iVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.i[i6];
                    int i7 = this.k;
                    int i8 = i5 - i7;
                    System.arraycopy(jArr2, i7, jArr3, 0, i8);
                    System.arraycopy(this.f, this.k, jArr4, 0, i8);
                    System.arraycopy(this.e, this.k, iArr2, 0, i8);
                    System.arraycopy(this.d, this.k, iArr3, 0, i8);
                    System.arraycopy(this.g, this.k, bArr2, 0, i8);
                    System.arraycopy(this.h, this.k, iVarArr, 0, i8);
                    System.arraycopy(this.b, this.k, iArr, 0, i8);
                    int i9 = this.k;
                    System.arraycopy(this.c, 0, jArr3, i8, i9);
                    System.arraycopy(this.f, 0, jArr4, i8, i9);
                    System.arraycopy(this.e, 0, iArr2, i8, i9);
                    System.arraycopy(this.d, 0, iArr3, i8, i9);
                    System.arraycopy(this.g, 0, bArr2, i8, i9);
                    System.arraycopy(this.h, 0, iVarArr, i8, i9);
                    System.arraycopy(this.b, 0, iArr, i8, i9);
                    this.c = jArr3;
                    this.f = jArr4;
                    this.e = iArr2;
                    this.d = iArr3;
                    this.g = bArr2;
                    this.h = iVarArr;
                    this.b = iArr;
                    this.k = 0;
                    int i10 = this.a;
                    this.l = i10;
                    this.i = i10;
                    this.a = i6;
                } else {
                    int i11 = i3 + 1;
                    this.l = i11;
                    if (i11 == i5) {
                        this.l = 0;
                    }
                }
            }
        }

        public synchronized boolean a(long j) {
            boolean z = false;
            if (this.m >= j) {
                return false;
            }
            int i = this.i;
            while (i > 0 && this.f[((this.k + i) - 1) % this.a] >= j) {
                i--;
            }
            int i2 = this.j;
            int i3 = this.i;
            int i4 = (i2 + i3) - (i + i2);
            if (i4 >= 0 && i4 <= i3) {
                z = true;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z);
            if (i4 == 0) {
                if (this.j != 0) {
                    int i5 = this.l;
                    if (i5 == 0) {
                        i5 = this.a;
                    }
                    int i6 = i5 - 1;
                    long j2 = this.c[i6];
                    int i7 = this.d[i6];
                }
            } else {
                int i8 = this.i - i4;
                this.i = i8;
                int i9 = this.l;
                int i10 = this.a;
                this.l = ((i9 + i10) - i4) % i10;
                this.n = Long.MIN_VALUE;
                for (int i11 = i8 - 1; i11 >= 0; i11--) {
                    int i12 = (this.k + i11) % this.a;
                    this.n = Math.max(this.n, this.f[i12]);
                    if ((this.e[i12] & 1) != 0) {
                        break;
                    }
                }
                long j3 = this.c[this.l];
            }
            return true;
        }
    }

    public final void a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            a(j);
            int i3 = (int) (j - this.h);
            int min = Math.min(i - i2, this.b - i3);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a peek = this.d.peek();
            System.arraycopy(peek.a, peek.b + i3, bArr, i2, min);
            j += min;
            i2 += min;
        }
    }

    public final void a(long j) {
        int i = ((int) (j - this.h)) / this.b;
        for (int i2 = 0; i2 < i; i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a remove = this.d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) bVar;
            synchronized (kVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = kVar.d;
                aVarArr[0] = remove;
                kVar.a(aVarArr);
            }
            this.h += this.b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
        boolean z;
        if (iVar == null) {
            iVar = null;
        }
        c cVar = this.c;
        synchronized (cVar) {
            z = true;
            if (iVar == null) {
                cVar.p = true;
            } else {
                cVar.p = false;
                if (!u.a(iVar, cVar.q)) {
                    cVar.q = iVar;
                }
            }
            z = false;
        }
        InterfaceC0034d interfaceC0034d = this.n;
        if (interfaceC0034d == null || !z) {
            return;
        }
        interfaceC0034d.a(iVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public int a(g gVar, int i, boolean z) throws IOException, InterruptedException {
        if (!h()) {
            int b2 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(i);
            if (b2 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            return b2;
        }
        try {
            int a2 = a(i);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.k;
            int a3 = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).a(aVar.a, aVar.b + this.l, a2);
            if (a3 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.l += a3;
            this.j += a3;
            return a3;
        } finally {
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) {
        if (!h()) {
            kVar.e(kVar.b + i);
            return;
        }
        while (i > 0) {
            int a2 = a(i);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.k;
            kVar.a(aVar.a, aVar.b + this.l, a2);
            this.l += a2;
            this.j += a2;
            i -= a2;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.n
    public void a(long j, int i, int i2, int i3, byte[] bArr) {
        if (!h()) {
            c cVar = this.c;
            synchronized (cVar) {
                cVar.n = Math.max(cVar.n, j);
            }
            return;
        }
        try {
            if (this.m) {
                if ((i & 1) != 0 && this.c.a(j)) {
                    this.m = false;
                }
                return;
            }
            long j2 = 0 + j;
            this.c.a(j2, i, (this.j - i2) - i3, i2, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        c cVar = this.c;
        cVar.j = 0;
        cVar.k = 0;
        cVar.l = 0;
        cVar.i = 0;
        cVar.o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.a;
        LinkedBlockingDeque<com.fyber.inneractive.sdk.player.exoplayer2.upstream.a> linkedBlockingDeque = this.d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) this.a).b();
        this.h = 0L;
        this.j = 0L;
        this.k = null;
        this.l = this.b;
    }

    public final int a(int i) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.l == this.b) {
            this.l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.k) this.a;
            synchronized (kVar) {
                kVar.f++;
                int i2 = kVar.g;
                if (i2 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = kVar.h;
                    int i3 = i2 - 1;
                    kVar.g = i3;
                    aVar = aVarArr[i3];
                    aVarArr[i3] = null;
                } else {
                    aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(new byte[kVar.b], 0);
                }
            }
            this.k = aVar;
            this.d.add(aVar);
        }
        return Math.min(i, this.b - this.l);
    }
}
