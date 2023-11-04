package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class b {
    public static final int a = u.a("vide");
    public static final int b = u.a("soun");
    public static final int c = u.a("text");
    public static final int d = u.a("sbtl");
    public static final int e = u.a("subt");
    public static final int f = u.a("clcp");
    public static final int g = u.a("cenc");
    public static final int h = u.a("meta");

    /* loaded from: classes.dex */
    public interface a {
        int a();

        int b();

        boolean c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b */
    /* loaded from: classes.dex */
    public static final class C0040b {
        public final i[] a;
        public com.fyber.inneractive.sdk.player.exoplayer2.i b;
        public int c;
        public int d = 0;

        public C0040b(int i) {
            this.a = new i[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a {
        public final int a;
        public final int b;
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.k c;

        public c(a.b bVar) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = bVar.P0;
            this.c = kVar;
            kVar.e(12);
            this.a = kVar.o();
            this.b = kVar.o();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int a() {
            return this.b;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int b() {
            int i = this.a;
            return i == 0 ? this.c.o() : i;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public boolean c() {
            return this.a != 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {
        public final com.fyber.inneractive.sdk.player.exoplayer2.util.k a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public d(a.b bVar) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar = bVar.P0;
            this.a = kVar;
            kVar.e(12);
            this.c = kVar.o() & 255;
            this.b = kVar.o();
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int a() {
            return this.b;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public int b() {
            int i = this.c;
            if (i == 8) {
                return this.a.l();
            }
            if (i == 16) {
                return this.a.q();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int l = this.a.l();
                this.e = l;
                return (l & 240) >> 4;
            }
            return this.e & 15;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a
        public boolean c() {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:493:0x00a0, code lost:
        if (r8 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.C0039a r46, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b r47, long r48, com.fyber.inneractive.sdk.player.exoplayer2.drm.a r50, boolean r51) throws com.fyber.inneractive.sdk.player.exoplayer2.l {
        /*
            Method dump skipped, instructions count: 2001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.a, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h");
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2, C0040b c0040b, int i3) {
        int i4 = kVar.b;
        while (true) {
            if (i4 - i >= i2) {
                return 0;
            }
            kVar.e(i4);
            int c2 = kVar.c();
            int i5 = 1;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(c2 > 0, "childAtomSize should be positive");
            if (kVar.c() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.W) {
                int i6 = i4 + 8;
                Pair pair = null;
                Integer num = null;
                i iVar = null;
                boolean z = false;
                while (i6 - i4 < c2) {
                    kVar.e(i6);
                    int c3 = kVar.c();
                    int c4 = kVar.c();
                    if (c4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.c0) {
                        num = Integer.valueOf(kVar.c());
                    } else if (c4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.X) {
                        kVar.f(4);
                        z = kVar.c() == g;
                    } else if (c4 == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.Y) {
                        int i7 = i6 + 8;
                        while (true) {
                            if (i7 - i6 >= c3) {
                                iVar = null;
                                break;
                            }
                            kVar.e(i7);
                            int c5 = kVar.c();
                            if (kVar.c() == com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.Z) {
                                kVar.f(6);
                                boolean z2 = kVar.l() == i5;
                                int l = kVar.l();
                                byte[] bArr = new byte[16];
                                System.arraycopy(kVar.a, kVar.b, bArr, 0, 16);
                                kVar.b += 16;
                                iVar = new i(z2, l, bArr);
                            } else {
                                i7 += c5;
                                i5 = 1;
                            }
                        }
                    }
                    i6 += c3;
                    i5 = 1;
                }
                if (z) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(num != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, iVar);
                }
                if (pair != null) {
                    c0040b.a[i3] = (i) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            i4 += c2;
        }
    }

    public static Pair<String, byte[]> a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) {
        kVar.e(i + 8 + 4);
        kVar.f(1);
        a(kVar);
        kVar.f(2);
        int l = kVar.l();
        if ((l & 128) != 0) {
            kVar.f(2);
        }
        if ((l & 64) != 0) {
            kVar.f(kVar.q());
        }
        if ((l & 32) != 0) {
            kVar.f(2);
        }
        kVar.f(1);
        a(kVar);
        int l2 = kVar.l();
        String str = null;
        if (l2 == 32) {
            str = "video/mp4v-es";
        } else if (l2 == 33) {
            str = "video/avc";
        } else if (l2 != 35) {
            if (l2 != 64) {
                if (l2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (l2 == 165) {
                    str = "audio/ac3";
                } else if (l2 != 166) {
                    switch (l2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (l2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        kVar.f(12);
        kVar.f(1);
        int a2 = a(kVar);
        byte[] bArr = new byte[a2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, a2);
        kVar.b += a2;
        return Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int l = kVar.l();
        int i = l & 127;
        while ((l & 128) == 128) {
            l = kVar.l();
            i = (i << 7) | (l & 127);
        }
        return i;
    }
}
