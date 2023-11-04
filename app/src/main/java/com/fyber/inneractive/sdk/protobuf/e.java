package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.r1;
import com.fyber.inneractive.sdk.protobuf.y;
import java.io.IOException;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.b.values().length];
            a = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[r1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[r1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[r1.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[r1.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[r1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[r1.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[r1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[r1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[r1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[r1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[r1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[r1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[r1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public long b;
        public Object c;
        public final q d;

        public b(q qVar) {
            qVar.getClass();
            this.d = qVar;
        }
    }

    public static int a(int i, byte[] bArr, int i2, b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            bVar.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            bVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            bVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            bVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int c(byte[] bArr, int i, b bVar) throws z {
        int d = d(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bVar.c = "";
                return d;
            }
            bVar.c = q1.a.a(bArr, d, i2);
            return d + i2;
        }
        throw z.f();
    }

    public static int d(byte[] bArr, int i, b bVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            bVar.a = b2;
            return i2;
        }
        return a(b2, bArr, i2, bVar);
    }

    public static int e(byte[] bArr, int i, b bVar) {
        byte b2;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            bVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b3 = bArr[i2];
        long j2 = (j & 127) | ((b3 & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b3 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b2 & ByteCompanionObject.MAX_VALUE) << i4;
            b3 = bArr[i3];
            i3 = i5;
        }
        bVar.b = j2;
        return i3;
    }

    public static int f(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        x xVar = (x) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            d = d(bArr, d, bVar);
            xVar.c(j.b(bVar.a));
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int g(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        f0 f0Var = (f0) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            d = e(bArr, d, bVar);
            f0Var.a(j.a(bVar.b));
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int h(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        x xVar = (x) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            d = d(bArr, d, bVar);
            xVar.c(bVar.a);
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int i(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        f0 f0Var = (f0) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            d = e(bArr, d, bVar);
            f0Var.a(bVar.b);
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int b(byte[] bArr, int i, b bVar) throws z {
        int d = d(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bVar.c = "";
                return d;
            }
            bVar.c = new String(bArr, d, i2, y.a);
            return d + i2;
        }
        throw z.f();
    }

    public static int d(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        f0 f0Var = (f0) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            f0Var.a(b(bArr, d));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int c(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        x xVar = (x) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            xVar.c(a(bArr, d));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int b(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        n nVar = (n) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            nVar.a(Double.longBitsToDouble(b(bArr, d)));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int e(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        v vVar = (v) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            vVar.a(Float.intBitsToFloat(a(bArr, d)));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int a(byte[] bArr, int i, b bVar) throws z {
        int d = d(bArr, i, bVar);
        int i2 = bVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - d) {
                if (i2 == 0) {
                    bVar.c = i.b;
                    return d;
                }
                bVar.c = i.a(bArr, d, i2);
                return d + i2;
            }
            throw z.i();
        }
        throw z.f();
    }

    public static int a(d1 d1Var, byte[] bArr, int i, int i2, b bVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = a(i4, bArr, i3, bVar);
            i4 = bVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object a2 = d1Var.a();
            int i6 = i4 + i5;
            d1Var.a(a2, bArr, i5, i6, bVar);
            d1Var.c(a2);
            bVar.c = a2;
            return i6;
        }
        throw z.i();
    }

    public static int a(d1 d1Var, byte[] bArr, int i, int i2, int i3, b bVar) throws IOException {
        r0 r0Var = (r0) d1Var;
        Object a2 = r0Var.a();
        int a3 = r0Var.a((r0) a2, bArr, i, i2, i3, bVar);
        r0Var.c((r0) a2);
        bVar.c = a2;
        return a3;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, y.j<?> jVar, b bVar) {
        x xVar = (x) jVar;
        int d = d(bArr, i2, bVar);
        xVar.c(bVar.a);
        while (d < i3) {
            int d2 = d(bArr, d, bVar);
            if (i != bVar.a) {
                break;
            }
            d = d(bArr, d2, bVar);
            xVar.c(bVar.a);
        }
        return d;
    }

    public static int a(byte[] bArr, int i, y.j<?> jVar, b bVar) throws IOException {
        g gVar = (g) jVar;
        int d = d(bArr, i, bVar);
        int i2 = bVar.a + d;
        while (d < i2) {
            d = e(bArr, d, bVar);
            gVar.a(bVar.b != 0);
        }
        if (d == i2) {
            return d;
        }
        throw z.i();
    }

    public static int a(d1<?> d1Var, int i, byte[] bArr, int i2, int i3, y.j<?> jVar, b bVar) throws IOException {
        int a2 = a(d1Var, bArr, i2, i3, bVar);
        jVar.add(bVar.c);
        while (a2 < i3) {
            int d = d(bArr, a2, bVar);
            if (i != bVar.a) {
                break;
            }
            a2 = a(d1Var, bArr, d, i3, bVar);
            jVar.add(bVar.c);
        }
        return a2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.e<?, ?> eVar, k1<l1, l1> k1Var, b bVar) throws IOException {
        Object a2;
        u<GeneratedMessageLite.d> uVar = extendableMessage.extensions;
        int i4 = i >>> 3;
        GeneratedMessageLite.d dVar = eVar.d;
        if (dVar.d && dVar.e) {
            switch (a.a[dVar.c.ordinal()]) {
                case 1:
                    n nVar = new n(new double[10], 0);
                    int b2 = b(bArr, i2, nVar, bVar);
                    uVar.c(eVar.d, nVar);
                    return b2;
                case 2:
                    v vVar = new v(new float[10], 0);
                    int e = e(bArr, i2, vVar, bVar);
                    uVar.c(eVar.d, vVar);
                    return e;
                case 3:
                case 4:
                    f0 f0Var = new f0();
                    int i5 = i(bArr, i2, f0Var, bVar);
                    uVar.c(eVar.d, f0Var);
                    return i5;
                case 5:
                case 6:
                    x xVar = new x();
                    int h = h(bArr, i2, xVar, bVar);
                    uVar.c(eVar.d, xVar);
                    return h;
                case 7:
                case 8:
                    f0 f0Var2 = new f0();
                    int d = d(bArr, i2, f0Var2, bVar);
                    uVar.c(eVar.d, f0Var2);
                    return d;
                case 9:
                case 10:
                    x xVar2 = new x();
                    int c = c(bArr, i2, xVar2, bVar);
                    uVar.c(eVar.d, xVar2);
                    return c;
                case 11:
                    g gVar = new g(new boolean[10], 0);
                    int a3 = a(bArr, i2, gVar, bVar);
                    uVar.c(eVar.d, gVar);
                    return a3;
                case 12:
                    x xVar3 = new x();
                    int f = f(bArr, i2, xVar3, bVar);
                    uVar.c(eVar.d, xVar3);
                    return f;
                case 13:
                    f0 f0Var3 = new f0();
                    int g = g(bArr, i2, f0Var3, bVar);
                    uVar.c(eVar.d, f0Var3);
                    return g;
                case 14:
                    x xVar4 = new x();
                    int h2 = h(bArr, i2, xVar4, bVar);
                    l1 l1Var = extendableMessage.unknownFields;
                    l1 l1Var2 = (l1) f1.a(i4, (List<Integer>) xVar4, eVar.d.a, l1Var != l1.f ? l1Var : null, (k1<UT, Object>) k1Var);
                    if (l1Var2 != null) {
                        extendableMessage.unknownFields = l1Var2;
                    }
                    uVar.c(eVar.d, xVar4);
                    return h2;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type cannot be packed: ");
                    sb.append(eVar.d.c);
                    throw new IllegalStateException(sb.toString());
            }
        }
        r1.b bVar2 = dVar.c;
        if (bVar2 == r1.b.ENUM) {
            i2 = d(bArr, i2, bVar);
            if (eVar.d.a.a(bVar.a) == null) {
                l1 l1Var3 = extendableMessage.unknownFields;
                l1 l1Var4 = l1Var3;
                if (l1Var3 == l1.f) {
                    l1 c2 = l1.c();
                    extendableMessage.unknownFields = c2;
                    l1Var4 = c2;
                }
                int i6 = bVar.a;
                Class<?> cls = f1.a;
                l1 l1Var5 = l1Var4;
                if (l1Var4 == null) {
                    l1Var5 = k1Var.a();
                }
                k1Var.b(l1Var5, i4, i6);
                return i2;
            }
            r3 = Integer.valueOf(bVar.a);
        } else {
            switch (a.a[bVar2.ordinal()]) {
                case 1:
                    r3 = Double.valueOf(Double.longBitsToDouble(b(bArr, i2)));
                    i2 += 8;
                    break;
                case 2:
                    r3 = Float.valueOf(Float.intBitsToFloat(a(bArr, i2)));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = e(bArr, i2, bVar);
                    r3 = Long.valueOf(bVar.b);
                    break;
                case 5:
                case 6:
                    i2 = d(bArr, i2, bVar);
                    r3 = Integer.valueOf(bVar.a);
                    break;
                case 7:
                case 8:
                    r3 = Long.valueOf(b(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    r3 = Integer.valueOf(a(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = e(bArr, i2, bVar);
                    r3 = Boolean.valueOf(bVar.b != 0);
                    break;
                case 12:
                    i2 = d(bArr, i2, bVar);
                    r3 = Integer.valueOf(j.b(bVar.a));
                    break;
                case 13:
                    i2 = e(bArr, i2, bVar);
                    r3 = Long.valueOf(j.a(bVar.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = a(bArr, i2, bVar);
                    r3 = bVar.c;
                    break;
                case 16:
                    i2 = b(bArr, i2, bVar);
                    r3 = bVar.c;
                    break;
                case 17:
                    i2 = a(z0.c.a(eVar.c.getClass()), bArr, i2, i3, (i4 << 3) | 4, bVar);
                    r3 = bVar.c;
                    break;
                case 18:
                    i2 = a(z0.c.a(eVar.c.getClass()), bArr, i2, i3, bVar);
                    r3 = bVar.c;
                    break;
            }
        }
        GeneratedMessageLite.d dVar2 = eVar.d;
        if (dVar2.d) {
            uVar.a((u<GeneratedMessageLite.d>) dVar2, r3);
        } else {
            int i7 = a.a[dVar2.c.ordinal()];
            if ((i7 == 17 || i7 == 18) && (a2 = uVar.a((u<GeneratedMessageLite.d>) eVar.d)) != null) {
                r3 = y.a(a2, r3);
            }
            uVar.c(eVar.d, r3);
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, l1 l1Var, b bVar) throws z {
        int i4 = r1.a;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int e = e(bArr, i2, bVar);
                l1Var.a(i, Long.valueOf(bVar.b));
                return e;
            } else if (i5 == 1) {
                l1Var.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int d = d(bArr, i2, bVar);
                int i6 = bVar.a;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - d) {
                        if (i6 == 0) {
                            l1Var.a(i, i.b);
                        } else {
                            l1Var.a(i, i.a(bArr, d, i6));
                        }
                        return d + i6;
                    }
                    throw z.i();
                }
                throw z.f();
            } else if (i5 != 3) {
                if (i5 != 5) {
                    throw z.b();
                }
                l1Var.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                l1 c = l1.c();
                int i7 = (i & (-8)) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int d2 = d(bArr, i2, bVar);
                    int i9 = bVar.a;
                    if (i9 == i7) {
                        i8 = i9;
                        i2 = d2;
                        break;
                    }
                    i8 = i9;
                    i2 = a(i9, bArr, d2, i3, c, bVar);
                }
                if (i2 <= i3 && i8 == i7) {
                    l1Var.a(i, c);
                    return i2;
                }
                throw z.g();
            }
        }
        throw z.b();
    }

    public static int a(int i, byte[] bArr, int i2, int i3, b bVar) throws z {
        int i4 = r1.a;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                return i2 + 4;
                            }
                            throw z.b();
                        }
                        int i6 = (i & (-8)) | 4;
                        int i7 = 0;
                        while (i2 < i3) {
                            i2 = d(bArr, i2, bVar);
                            i7 = bVar.a;
                            if (i7 == i6) {
                                break;
                            }
                            i2 = a(i7, bArr, i2, i3, bVar);
                        }
                        if (i2 > i3 || i7 != i6) {
                            throw z.g();
                        }
                        return i2;
                    }
                    return d(bArr, i2, bVar) + bVar.a;
                }
                return i2 + 8;
            }
            return e(bArr, i2, bVar);
        }
        throw z.b();
    }
}
