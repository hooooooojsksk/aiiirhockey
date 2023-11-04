package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class g {
    public static final int b = u.a("ID3");
    public final a a;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final boolean b;
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public g() {
        this(null);
    }

    public static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static d b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = kVar.b;
        int b2 = b(kVar.a, i4);
        String str = new String(kVar.a, i4, b2 - i4, "ISO-8859-1");
        kVar.e(b2 + 1);
        int l = kVar.l();
        boolean z2 = (l & 2) != 0;
        boolean z3 = (l & 1) != 0;
        int l2 = kVar.l();
        String[] strArr = new String[l2];
        for (int i5 = 0; i5 < l2; i5++) {
            int i6 = kVar.b;
            int b3 = b(kVar.a, i6);
            strArr[i5] = new String(kVar.a, i6, b3 - i6, "ISO-8859-1");
            kVar.e(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kVar.b < i7) {
            h a2 = a(i2, kVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z2, z3, strArr, hVarArr);
    }

    public static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : HTTP.UTF_16;
    }

    public static k c(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i);
        kVar.b += i;
        return new k(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    public static j d(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        int a2 = a(bArr, 0, l);
        String str = new String(bArr, 0, a2, b2);
        int a3 = a2 + a(l);
        return new j("TXXX", str, a3 < i2 ? new String(bArr, a3, a(bArr, a3, l) - a3, b2) : "");
    }

    public static k e(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        int a2 = a(bArr, 0, l);
        String str = new String(bArr, 0, a2, b2);
        int a3 = a2 + a(l);
        return new k("WXXX", str, a3 < i2 ? new String(bArr, a3, b(bArr, a3) - a3, "ISO-8859-1") : "");
    }

    public static int f(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) {
        byte[] bArr = kVar.a;
        int i2 = kVar.b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & UByte.MAX_VALUE) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.a a(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(byte[], int):com.fyber.inneractive.sdk.player.exoplayer2.metadata.a");
    }

    public g(a aVar) {
        this.a = aVar;
    }

    public static i c(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i);
        kVar.b += i;
        int b2 = b(bArr, 0);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i2 = b2 + 1;
        return new i(str, i2 < i ? Arrays.copyOfRange(bArr, i2, i) : new byte[0]);
    }

    public static j b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        return new j(str, null, new String(bArr, 0, a(bArr, 0, l), b2));
    }

    public static f b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        int l = kVar.l();
        String b2 = b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i2);
        kVar.b += i2;
        int b3 = b(bArr, 0);
        String str = new String(bArr, 0, b3, "ISO-8859-1");
        int i3 = b3 + 1;
        int a2 = a(bArr, i3, l);
        String str2 = new String(bArr, i3, a2 - i3, b2);
        int a3 = a2 + a(l);
        int a4 = a(bArr, a3, l);
        return new f(str, str2, new String(bArr, a3, a4 - a3, b2), Arrays.copyOfRange(bArr, a4 + a(l), i2));
    }

    public static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static c a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        int i4 = kVar.b;
        int b2 = b(kVar.a, i4);
        String str = new String(kVar.a, i4, b2 - i4, "ISO-8859-1");
        kVar.e(b2 + 1);
        int c = kVar.c();
        int c2 = kVar.c();
        long m = kVar.m();
        long j = m == 4294967295L ? -1L : m;
        long m2 = kVar.m();
        long j2 = m2 == 4294967295L ? -1L : m2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kVar.b < i5) {
            h a2 = a(i2, kVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, c, c2, j, j2, hVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0074, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lab
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r18.c()     // Catch: java.lang.Throwable -> Lab
            long r8 = r18.m()     // Catch: java.lang.Throwable -> Lab
            int r10 = r18.q()     // Catch: java.lang.Throwable -> Lab
            goto L2a
        L20:
            int r7 = r18.n()     // Catch: java.lang.Throwable -> Lab
            int r8 = r18.n()     // Catch: java.lang.Throwable -> Lab
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            r1.e(r2)
            return r4
        L38:
            r7 = 4
            if (r0 != r7) goto L69
            if (r21 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L49
            r1.e(r2)
            return r6
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L69:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L71
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            r7 = r10 & 1
            if (r7 == 0) goto L86
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L94
            r1.e(r2)
            return r6
        L94:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lab
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La1
            r1.e(r2)
            return r6
        La1:
            int r3 = (int) r8
            r1.f(r3)     // Catch: java.lang.Throwable -> Lab
            goto L6
        La7:
            r1.e(r2)
            return r4
        Lab:
            r0 = move-exception
            r1.e(r2)
            goto Lb1
        Lb0:
            throw r0
        Lb1:
            goto Lb0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:306:0x018a, code lost:
        if (r11 == 67) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h a(int r21, com.fyber.inneractive.sdk.player.exoplayer2.util.k r22, boolean r23, int r24, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a r25) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.k, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, int i2) throws UnsupportedEncodingException {
        int b2;
        String str;
        int l = kVar.l();
        String b3 = b(l);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i3);
        kVar.b += i3;
        if (i2 == 2) {
            str = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (str.equals("image/jpg")) {
                str = "image/jpeg";
            }
            b2 = 2;
        } else {
            b2 = b(bArr, 0);
            String lowerCase = new String(bArr, 0, b2, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[b2 + 1] & UByte.MAX_VALUE;
        int i5 = b2 + 2;
        int a2 = a(bArr, i5, l);
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a(str, new String(bArr, i5, a2 - i5, b3), i4, Arrays.copyOfRange(bArr, a2 + a(l), i3));
    }

    public static e a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int l = kVar.l();
        String b2 = b(l);
        byte[] bArr = new byte[3];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, 3);
        kVar.b += 3;
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(kVar.a, kVar.b, bArr2, 0, i2);
        kVar.b += i2;
        int a2 = a(bArr2, 0, l);
        String str2 = new String(bArr2, 0, a2, b2);
        int a3 = a2 + a(l);
        return new e(str, str2, a3 < i2 ? new String(bArr2, a3, a(bArr2, a3, l) - a3, b2) : "");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.a, kVar.b, bArr, 0, i);
        kVar.b += i;
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b(str, bArr);
    }

    public static String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int a(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if (b2 % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }
}
