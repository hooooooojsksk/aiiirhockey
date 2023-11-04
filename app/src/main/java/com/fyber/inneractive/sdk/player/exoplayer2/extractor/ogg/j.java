package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends h {
    public a n;
    public int o;
    public boolean p;
    public k.c q;
    public k.a r;

    /* loaded from: classes.dex */
    public static final class a {
        public final k.c a;
        public final byte[] b;
        public final k.b[] c;
        public final int d;

        public a(k.c cVar, k.a aVar, byte[] bArr, k.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = bArr;
            this.c = bVarArr;
            this.d = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public void b(long j) {
        this.g = j;
        this.p = j != 0;
        k.c cVar = this.q;
        this.o = cVar != null ? cVar.d : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int i;
        byte[] bArr = kVar.a;
        if ((bArr[0] & 1) == 1) {
            return -1L;
        }
        byte b = bArr[0];
        a aVar = this.n;
        if (!aVar.c[(b >> 1) & (255 >>> (8 - aVar.d))].a) {
            i = aVar.a.d;
        } else {
            i = aVar.a.e;
        }
        long j = this.p ? (this.o + i) / 4 : 0;
        kVar.d(kVar.c + 4);
        byte[] bArr2 = kVar.a;
        int i2 = kVar.c;
        bArr2[i2 - 4] = (byte) (j & 255);
        bArr2[i2 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i2 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i2 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, long j, h.a aVar) throws IOException, InterruptedException {
        a aVar2;
        int i;
        long j2;
        int i2;
        if (this.n != null) {
            return false;
        }
        if (this.q == null) {
            k.a(1, kVar, false);
            long f = kVar.f();
            int l = kVar.l();
            long f2 = kVar.f();
            int e = kVar.e();
            int e2 = kVar.e();
            int e3 = kVar.e();
            int l2 = kVar.l();
            this.q = new k.c(f, l, f2, e, e2, e3, (int) Math.pow(2.0d, l2 & 15), (int) Math.pow(2.0d, (l2 & 240) >> 4), (kVar.l() & 1) > 0, Arrays.copyOf(kVar.a, kVar.c));
        } else if (this.r == null) {
            k.a(3, kVar, false);
            String b = kVar.b((int) kVar.f());
            long f3 = kVar.f();
            String[] strArr = new String[(int) f3];
            int length = b.length() + 11 + 4;
            for (int i3 = 0; i3 < f3; i3++) {
                strArr[i3] = kVar.b((int) kVar.f());
                length = length + 4 + strArr[i3].length();
            }
            if ((kVar.l() & 1) != 0) {
                this.r = new k.a(b, strArr, length + 1);
            } else {
                throw new l("framing bit expected to be set");
            }
        } else {
            int i4 = kVar.c;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            System.arraycopy(kVar.a, 0, bArr, 0, i4);
            int i6 = this.q.a;
            int i7 = 5;
            k.a(5, kVar, false);
            int l3 = kVar.l() + 1;
            i iVar = new i(kVar.a);
            iVar.b(kVar.b * 8);
            int i8 = 0;
            while (true) {
                int i9 = 16;
                if (i8 < l3) {
                    if (iVar.a(24) == 5653314) {
                        int a2 = iVar.a(16);
                        int a3 = iVar.a(24);
                        long[] jArr = new long[a3];
                        long j3 = 0;
                        if (!iVar.a()) {
                            boolean a4 = iVar.a();
                            while (i5 < a3) {
                                if (a4) {
                                    if (iVar.a()) {
                                        i2 = a2;
                                        jArr[i5] = iVar.a(5) + 1;
                                    } else {
                                        i2 = a2;
                                        jArr[i5] = 0;
                                    }
                                } else {
                                    i2 = a2;
                                    jArr[i5] = iVar.a(5) + 1;
                                }
                                i5++;
                                a2 = i2;
                            }
                            i = a2;
                        } else {
                            i = a2;
                            int a5 = iVar.a(5) + 1;
                            int i10 = 0;
                            while (i10 < a3) {
                                int a6 = iVar.a(k.a(a3 - i10));
                                int i11 = i10;
                                int i12 = 0;
                                while (i12 < a6 && i11 < a3) {
                                    jArr[i11] = a5;
                                    i11++;
                                    i12++;
                                    a3 = a3;
                                }
                                a5++;
                                i10 = i11;
                                a3 = a3;
                            }
                        }
                        int i13 = a3;
                        int a7 = iVar.a(4);
                        if (a7 > 2) {
                            throw new l("lookup type greater than 2 not decodable: " + a7);
                        }
                        if (a7 == 1 || a7 == 2) {
                            iVar.b(32);
                            iVar.b(32);
                            int a8 = iVar.a(4) + 1;
                            iVar.b(1);
                            if (a7 == 1) {
                                if (i != 0) {
                                    double d = i;
                                    Double.isNaN(d);
                                    j2 = (long) Math.floor(Math.pow(i13, 1.0d / d));
                                }
                                iVar.b((int) (a8 * j3));
                            } else {
                                j2 = i13 * i;
                            }
                            j3 = j2;
                            iVar.b((int) (a8 * j3));
                        }
                        i8++;
                        i5 = 0;
                    } else {
                        throw new l("expected code book to start with [0x56, 0x43, 0x42] at " + ((iVar.c * 8) + iVar.d));
                    }
                } else {
                    int i14 = 6;
                    int a9 = iVar.a(6) + 1;
                    for (int i15 = 0; i15 < a9; i15++) {
                        if (iVar.a(16) != 0) {
                            throw new l("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i16 = 1;
                    int a10 = iVar.a(6) + 1;
                    int i17 = 0;
                    while (i17 < a10) {
                        int a11 = iVar.a(i9);
                        if (a11 == 0) {
                            int i18 = 8;
                            iVar.b(8);
                            iVar.b(16);
                            iVar.b(16);
                            iVar.b(6);
                            iVar.b(8);
                            int a12 = iVar.a(4) + 1;
                            int i19 = 0;
                            while (i19 < a12) {
                                iVar.b(i18);
                                i19++;
                                i18 = 8;
                            }
                        } else if (a11 == i16) {
                            int a13 = iVar.a(i7);
                            int[] iArr = new int[a13];
                            int i20 = -1;
                            for (int i21 = 0; i21 < a13; i21++) {
                                iArr[i21] = iVar.a(4);
                                if (iArr[i21] > i20) {
                                    i20 = iArr[i21];
                                }
                            }
                            int i22 = i20 + 1;
                            int[] iArr2 = new int[i22];
                            for (int i23 = 0; i23 < i22; i23++) {
                                int i24 = 1;
                                iArr2[i23] = iVar.a(3) + 1;
                                int a14 = iVar.a(2);
                                int i25 = 8;
                                if (a14 > 0) {
                                    iVar.b(8);
                                }
                                int i26 = 0;
                                while (i26 < (i24 << a14)) {
                                    iVar.b(i25);
                                    i26++;
                                    i24 = 1;
                                    i25 = 8;
                                }
                            }
                            iVar.b(2);
                            int a15 = iVar.a(4);
                            int i27 = 0;
                            int i28 = 0;
                            for (int i29 = 0; i29 < a13; i29++) {
                                i27 += iArr2[iArr[i29]];
                                while (i28 < i27) {
                                    iVar.b(a15);
                                    i28++;
                                }
                            }
                        } else {
                            throw new l("floor type greater than 1 not decodable: " + a11);
                        }
                        i17++;
                        i14 = 6;
                        i7 = 5;
                        i16 = 1;
                        i9 = 16;
                    }
                    int i30 = 1;
                    int a16 = iVar.a(i14) + 1;
                    int i31 = 0;
                    while (i31 < a16) {
                        if (iVar.a(16) <= 2) {
                            iVar.b(24);
                            iVar.b(24);
                            iVar.b(24);
                            int a17 = iVar.a(i14) + i30;
                            int i32 = 8;
                            iVar.b(8);
                            int[] iArr3 = new int[a17];
                            for (int i33 = 0; i33 < a17; i33++) {
                                iArr3[i33] = ((iVar.a() ? iVar.a(5) : 0) * 8) + iVar.a(3);
                            }
                            int i34 = 0;
                            while (i34 < a17) {
                                int i35 = 0;
                                while (i35 < i32) {
                                    if ((iArr3[i34] & (1 << i35)) != 0) {
                                        iVar.b(i32);
                                    }
                                    i35++;
                                    i32 = 8;
                                }
                                i34++;
                                i32 = 8;
                            }
                            i31++;
                            i14 = 6;
                            i30 = 1;
                        } else {
                            throw new l("residueType greater than 2 is not decodable");
                        }
                    }
                    int a18 = iVar.a(i14) + 1;
                    for (int i36 = 0; i36 < a18; i36++) {
                        int a19 = iVar.a(16);
                        if (a19 != 0) {
                            Log.e("VorbisUtil", "mapping type other than 0 not supported: " + a19);
                        } else {
                            int a20 = iVar.a() ? iVar.a(4) + 1 : 1;
                            if (iVar.a()) {
                                int a21 = iVar.a(8) + 1;
                                for (int i37 = 0; i37 < a21; i37++) {
                                    int i38 = i6 - 1;
                                    iVar.b(k.a(i38));
                                    iVar.b(k.a(i38));
                                }
                            }
                            if (iVar.a(2) != 0) {
                                throw new l("to reserved bits must be zero after mapping coupling steps");
                            }
                            if (a20 > 1) {
                                for (int i39 = 0; i39 < i6; i39++) {
                                    iVar.b(4);
                                }
                            }
                            for (int i40 = 0; i40 < a20; i40++) {
                                iVar.b(8);
                                iVar.b(8);
                                iVar.b(8);
                            }
                        }
                    }
                    int a22 = iVar.a(6) + 1;
                    k.b[] bVarArr = new k.b[a22];
                    for (int i41 = 0; i41 < a22; i41++) {
                        bVarArr[i41] = new k.b(iVar.a(), iVar.a(16), iVar.a(16), iVar.a(8));
                    }
                    if (iVar.a()) {
                        aVar2 = new a(this.q, this.r, bArr, bVarArr, k.a(a22 - 1));
                    } else {
                        throw new l("framing bit after modes not set as expected");
                    }
                }
            }
        }
        aVar2 = null;
        this.n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.f);
        arrayList.add(this.n.b);
        k.c cVar = this.n.a;
        aVar.a = com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "audio/vorbis", (String) null, cVar.c, -1, cVar.a, (int) cVar.b, -1, arrayList, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null, 0, (String) null);
        return true;
    }
}
