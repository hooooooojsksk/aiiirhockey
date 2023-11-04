package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.e;
import com.fyber.inneractive.sdk.protobuf.h0;
import com.fyber.inneractive.sdk.protobuf.p1;
import com.fyber.inneractive.sdk.protobuf.y;
import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class r0<T> implements d1<T> {
    public static final int[] r = new int[0];
    public static final Unsafe s;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final o0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final t0 m;
    public final e0 n;
    public final k1<?, ?> o;
    public final r<?> p;
    public final j0 q;

    static {
        Unsafe unsafe;
        Unsafe unsafe2 = p1.a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new o1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        s = unsafe;
    }

    public r0(int[] iArr, Object[] objArr, int i, int i2, o0 o0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, t0 t0Var, e0 e0Var, k1<?, ?> k1Var, r<?> rVar, j0 j0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = o0Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = rVar != null && rVar.a(o0Var);
        this.i = z2;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = t0Var;
        this.n = e0Var;
        this.o = k1Var;
        this.p = rVar;
        this.e = o0Var;
        this.q = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:350:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.protobuf.r0 a(com.fyber.inneractive.sdk.protobuf.m0 r35, com.fyber.inneractive.sdk.protobuf.t0 r36, com.fyber.inneractive.sdk.protobuf.e0 r37, com.fyber.inneractive.sdk.protobuf.k1 r38, com.fyber.inneractive.sdk.protobuf.r r39, com.fyber.inneractive.sdk.protobuf.j0 r40) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.a(com.fyber.inneractive.sdk.protobuf.m0, com.fyber.inneractive.sdk.protobuf.t0, com.fyber.inneractive.sdk.protobuf.e0, com.fyber.inneractive.sdk.protobuf.k1, com.fyber.inneractive.sdk.protobuf.r, com.fyber.inneractive.sdk.protobuf.j0):com.fyber.inneractive.sdk.protobuf.r0");
    }

    public static long d(int i) {
        return i & 1048575;
    }

    public static l1 e(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        l1 l1Var = generatedMessageLite.unknownFields;
        if (l1Var == l1.f) {
            l1 c = l1.c();
            generatedMessageLite.unknownFields = c;
            return c;
        }
        return l1Var;
    }

    public static int f(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0041, code lost:
        if (com.fyber.inneractive.sdk.protobuf.f1.a(com.fyber.inneractive.sdk.protobuf.p1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.p1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x007c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.f1.a(com.fyber.inneractive.sdk.protobuf.p1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.p1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0099, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00b4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00d1, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x00ec, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0107, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0122, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0141, code lost:
        if (com.fyber.inneractive.sdk.protobuf.f1.a(com.fyber.inneractive.sdk.protobuf.p1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.p1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0160, code lost:
        if (com.fyber.inneractive.sdk.protobuf.f1.a(com.fyber.inneractive.sdk.protobuf.p1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.p1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x017f, code lost:
        if (com.fyber.inneractive.sdk.protobuf.f1.a(com.fyber.inneractive.sdk.protobuf.p1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.p1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x019c, code lost:
        if (r4.a(r10, r5) == r4.a(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01b7, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01d4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x01ef, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x020c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0228, code lost:
        if (com.fyber.inneractive.sdk.protobuf.p1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.p1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x024c, code lost:
        if (java.lang.Float.floatToIntBits(r4.d(r10, r5)) == java.lang.Float.floatToIntBits(r4.d(r11, r5))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0272, code lost:
        if (java.lang.Double.doubleToLongBits(r4.c(r10, r5)) == java.lang.Double.doubleToLongBits(r4.c(r11, r5))) goto L142;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final d1 c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        d1 d1Var = (d1) objArr[i2];
        if (d1Var != null) {
            return d1Var;
        }
        d1<T> a = z0.c.a((Class) objArr[i2 + 1]);
        this.b[i2] = a;
        return a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public int d(T t) {
        int i;
        int a;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int g = g(i3);
            int i4 = this.a[i3];
            long d = d(g);
            int i5 = 37;
            switch (f(g)) {
                case 0:
                    i = i2 * 53;
                    a = y.a(Double.doubleToLongBits(p1.e.c(t, d)));
                    i2 = i + a;
                    break;
                case 1:
                    i = i2 * 53;
                    a = Float.floatToIntBits(p1.e.d(t, d));
                    i2 = i + a;
                    break;
                case 2:
                    i = i2 * 53;
                    a = y.a(p1.f(t, d));
                    i2 = i + a;
                    break;
                case 3:
                    i = i2 * 53;
                    a = y.a(p1.f(t, d));
                    i2 = i + a;
                    break;
                case 4:
                    i = i2 * 53;
                    a = p1.e(t, d);
                    i2 = i + a;
                    break;
                case 5:
                    i = i2 * 53;
                    a = y.a(p1.f(t, d));
                    i2 = i + a;
                    break;
                case 6:
                    i = i2 * 53;
                    a = p1.e(t, d);
                    i2 = i + a;
                    break;
                case 7:
                    i = i2 * 53;
                    a = y.a(p1.e.a(t, d));
                    i2 = i + a;
                    break;
                case 8:
                    i = i2 * 53;
                    a = ((String) p1.g(t, d)).hashCode();
                    i2 = i + a;
                    break;
                case 9:
                    Object g2 = p1.g(t, d);
                    if (g2 != null) {
                        i5 = g2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    a = p1.g(t, d).hashCode();
                    i2 = i + a;
                    break;
                case 11:
                    i = i2 * 53;
                    a = p1.e(t, d);
                    i2 = i + a;
                    break;
                case 12:
                    i = i2 * 53;
                    a = p1.e(t, d);
                    i2 = i + a;
                    break;
                case 13:
                    i = i2 * 53;
                    a = p1.e(t, d);
                    i2 = i + a;
                    break;
                case 14:
                    i = i2 * 53;
                    a = y.a(p1.f(t, d));
                    i2 = i + a;
                    break;
                case 15:
                    i = i2 * 53;
                    a = p1.e(t, d);
                    i2 = i + a;
                    break;
                case 16:
                    i = i2 * 53;
                    a = y.a(p1.f(t, d));
                    i2 = i + a;
                    break;
                case 17:
                    Object g3 = p1.g(t, d);
                    if (g3 != null) {
                        i5 = g3.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    a = p1.g(t, d).hashCode();
                    i2 = i + a;
                    break;
                case 50:
                    i = i2 * 53;
                    a = p1.g(t, d).hashCode();
                    i2 = i + a;
                    break;
                case 51:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(Double.doubleToLongBits(b(t, d)));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = Float.floatToIntBits(c(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(e(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(e(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = d(t, d);
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(e(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = d(t, d);
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(a(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = ((String) p1.g(t, d)).hashCode();
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = p1.g(t, d).hashCode();
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = p1.g(t, d).hashCode();
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = d(t, d);
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = d(t, d);
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = d(t, d);
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(e(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = d(t, d);
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = y.a(e(t, d));
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((r0<T>) t, i4, i3)) {
                        i = i2 * 53;
                        a = p1.g(t, d).hashCode();
                        i2 = i + a;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.b(t).hashCode();
        return this.f ? (hashCode * 53) + this.p.a(t).a.hashCode() : hashCode;
    }

    public final int g(int i) {
        return this.a[i + 1];
    }

    public static <T> long e(T t, long j) {
        return ((Long) p1.g(t, j)).longValue();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void c(T t) {
        int i;
        int i2 = this.k;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            long d = d(g(this.j[i2]));
            Object g = p1.g(t, d);
            if (g != null) {
                p1.a(t, d, this.q.e(g));
            }
            i2++;
        }
        int length = this.j.length;
        while (i < length) {
            this.n.a(t, this.j[i]);
            i++;
        }
        this.o.e(t);
        if (this.f) {
            this.p.c(t);
        }
    }

    public final int e(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return a(i, 0);
    }

    public static <T> float c(T t, long j) {
        return ((Float) p1.g(t, j)).floatValue();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public int b(T t) {
        int c;
        int d;
        int i;
        int i2;
        int i3;
        int a;
        int b;
        int a2;
        int d2;
        int c2;
        int b2;
        int c3;
        int a3;
        int a4;
        int a5;
        int c4;
        int b3;
        int c5;
        int i4 = 1048575;
        int i5 = 1;
        if (this.h) {
            Unsafe unsafe = s;
            c = 0;
            for (int i6 = 0; i6 < this.a.length; i6 += 3) {
                int g = g(i6);
                int f = f(g);
                int i7 = this.a[i6];
                long d3 = d(g);
                int i8 = (f < FieldType.DOUBLE_LIST_PACKED.id() || f > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i6 + 2] & 1048575;
                switch (f) {
                    case 0:
                        if (a((r0<T>) t, i6)) {
                            a4 = l.a(i7, 0.0d);
                            a5 = a4;
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.a(i7, 0.0f);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.b(i7, p1.f(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.e(i7, p1.f(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.c(i7, p1.e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.a(i7, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.b(i7, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.a(i7, true);
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (a((r0<T>) t, i6)) {
                            Object g2 = p1.g(t, d3);
                            if (g2 instanceof i) {
                                a5 = l.a(i7, (i) g2);
                                break;
                            } else {
                                a5 = l.a(i7, (String) g2);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a((r0<T>) t, i6)) {
                            a5 = f1.a(i7, p1.g(t, d3), c(i6));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.a(i7, (i) p1.g(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.f(i7, p1.e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.a(i7, p1.e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.d(i7, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.c(i7, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.e(i7, p1.e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.d(i7, p1.f(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (a((r0<T>) t, i6)) {
                            a5 = l.a(i7, (o0) p1.g(t, d3), c(i6));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        a5 = f1.d(i7, (List) p1.g(t, d3), false);
                        break;
                    case 19:
                        a5 = f1.c(i7, (List) p1.g(t, d3), false);
                        break;
                    case 20:
                        a5 = f1.f(i7, (List) p1.g(t, d3), false);
                        break;
                    case 21:
                        a5 = f1.j(i7, (List) p1.g(t, d3), false);
                        break;
                    case 22:
                        a5 = f1.e(i7, (List) p1.g(t, d3), false);
                        break;
                    case 23:
                        a5 = f1.d(i7, (List) p1.g(t, d3), false);
                        break;
                    case 24:
                        a5 = f1.c(i7, (List) p1.g(t, d3), false);
                        break;
                    case 25:
                        a5 = f1.a(i7, (List<?>) p1.g(t, d3), false);
                        break;
                    case 26:
                        a5 = f1.b(i7, (List) p1.g(t, d3));
                        break;
                    case 27:
                        a5 = f1.b(i7, (List) p1.g(t, d3), c(i6));
                        break;
                    case 28:
                        a5 = f1.a(i7, (List) p1.g(t, d3));
                        break;
                    case 29:
                        a5 = f1.i(i7, (List) p1.g(t, d3), false);
                        break;
                    case 30:
                        a5 = f1.b(i7, (List<Integer>) p1.g(t, d3), false);
                        break;
                    case 31:
                        a5 = f1.c(i7, (List) p1.g(t, d3), false);
                        break;
                    case 32:
                        a5 = f1.d(i7, (List) p1.g(t, d3), false);
                        break;
                    case 33:
                        a5 = f1.g(i7, (List) p1.g(t, d3), false);
                        break;
                    case 34:
                        a5 = f1.h(i7, (List) p1.g(t, d3), false);
                        break;
                    case 35:
                        c4 = f1.c((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        c4 = f1.b((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        c4 = f1.e((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        c4 = f1.i((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        c4 = f1.d((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        c4 = f1.c((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        c4 = f1.b((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        Class<?> cls = f1.a;
                        c4 = ((List) unsafe.getObject(t, d3)).size();
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        c4 = f1.h((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        c4 = f1.a((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        c4 = f1.b((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        c4 = f1.c((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        c4 = f1.f((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        c4 = f1.g((List) unsafe.getObject(t, d3));
                        if (c4 > 0) {
                            if (this.i) {
                                unsafe.putInt(t, i8, c4);
                            }
                            b3 = l.b(i7);
                            c5 = l.c(c4);
                            a5 = c4 + b3 + c5;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        a5 = f1.a(i7, (List<o0>) p1.g(t, d3), c(i6));
                        break;
                    case 50:
                        a5 = this.q.a(i7, p1.g(t, d3), b(i6));
                        break;
                    case 51:
                        if (a((r0<T>) t, i7, i6)) {
                            a4 = l.a(i7, 0.0d);
                            a5 = a4;
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.a(i7, 0.0f);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.b(i7, e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.e(i7, e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.c(i7, d(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.a(i7, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.b(i7, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.a(i7, true);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (a((r0<T>) t, i7, i6)) {
                            Object g3 = p1.g(t, d3);
                            if (g3 instanceof i) {
                                a5 = l.a(i7, (i) g3);
                                break;
                            } else {
                                a5 = l.a(i7, (String) g3);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = f1.a(i7, p1.g(t, d3), c(i6));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.a(i7, (i) p1.g(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.f(i7, d(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.a(i7, d(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.d(i7, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.c(i7, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.e(i7, d(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.d(i7, e(t, d3));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (a((r0<T>) t, i7, i6)) {
                            a5 = l.a(i7, (o0) p1.g(t, d3), c(i6));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                c += a5;
            }
            k1<?, ?> k1Var = this.o;
            d = k1Var.c(k1Var.b(t));
        } else {
            Unsafe unsafe2 = s;
            int i9 = 0;
            int i10 = 0;
            int i11 = 1048575;
            int i12 = 0;
            while (i9 < this.a.length) {
                int g4 = g(i9);
                int i13 = this.a[i9];
                int f2 = f(g4);
                if (f2 <= 17) {
                    i = this.a[i9 + 2];
                    int i14 = i & i4;
                    i2 = i5 << (i >>> 20);
                    if (i14 != i11) {
                        i12 = unsafe2.getInt(t, i14);
                        i11 = i14;
                    }
                } else {
                    i = (!this.i || f2 < FieldType.DOUBLE_LIST_PACKED.id() || f2 > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.a[i9 + 2] & i4;
                    i2 = 0;
                }
                long d4 = d(g4);
                switch (f2) {
                    case 0:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a = l.a(i13, 0.0d);
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 1:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a = l.a(i13, 0.0f);
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 2:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            b = l.b(i13, unsafe2.getLong(t, d4));
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 3:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            b = l.e(i13, unsafe2.getLong(t, d4));
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 4:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            b = l.c(i13, unsafe2.getInt(t, d4));
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 5:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            b = l.a(i13, 0L);
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 6:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            b = l.b(i13, 0);
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 7:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a = l.a(i13, true);
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 8:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            Object object = unsafe2.getObject(t, d4);
                            if (object instanceof i) {
                                a2 = l.a(i13, (i) object);
                            } else {
                                a2 = l.a(i13, (String) object);
                            }
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 9:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = f1.a(i13, unsafe2.getObject(t, d4), c(i9));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 10:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.a(i13, (i) unsafe2.getObject(t, d4));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 11:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.f(i13, unsafe2.getInt(t, d4));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 12:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.a(i13, unsafe2.getInt(t, d4));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 13:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a = l.d(i13, 0);
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 14:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.c(i13, 0L);
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 15:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.e(i13, unsafe2.getInt(t, d4));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 16:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.d(i13, unsafe2.getLong(t, d4));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 17:
                        i3 = i11;
                        if ((i12 & i2) != 0) {
                            a2 = l.a(i13, (o0) unsafe2.getObject(t, d4), c(i9));
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 18:
                        i3 = i11;
                        d2 = f1.d(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 19:
                        i3 = i11;
                        d2 = f1.c(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 20:
                        i3 = i11;
                        d2 = f1.f(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 21:
                        i3 = i11;
                        d2 = f1.j(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 22:
                        i3 = i11;
                        d2 = f1.e(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 23:
                        i3 = i11;
                        d2 = f1.d(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 24:
                        i3 = i11;
                        d2 = f1.c(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 25:
                        i3 = i11;
                        d2 = f1.a(i13, (List<?>) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 26:
                        i3 = i11;
                        a2 = f1.b(i13, (List) unsafe2.getObject(t, d4));
                        a = a2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 27:
                        i3 = i11;
                        a2 = f1.b(i13, (List) unsafe2.getObject(t, d4), c(i9));
                        a = a2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 28:
                        i3 = i11;
                        a2 = f1.a(i13, (List) unsafe2.getObject(t, d4));
                        a = a2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 29:
                        i3 = i11;
                        d2 = f1.i(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 30:
                        i3 = i11;
                        d2 = f1.b(i13, (List<Integer>) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 31:
                        i3 = i11;
                        d2 = f1.c(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 32:
                        i3 = i11;
                        d2 = f1.d(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 33:
                        i3 = i11;
                        d2 = f1.g(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 34:
                        i3 = i11;
                        d2 = f1.h(i13, (List) unsafe2.getObject(t, d4), false);
                        a = d2;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 35:
                        i3 = i11;
                        c2 = f1.c((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 36:
                        i3 = i11;
                        c2 = f1.b((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 37:
                        i3 = i11;
                        c2 = f1.e((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 38:
                        i3 = i11;
                        c2 = f1.i((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 39:
                        i3 = i11;
                        c2 = f1.d((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 40:
                        i3 = i11;
                        c2 = f1.c((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 41:
                        i3 = i11;
                        c2 = f1.b((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 42:
                        i3 = i11;
                        Class<?> cls2 = f1.a;
                        c2 = ((List) unsafe2.getObject(t, d4)).size();
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 43:
                        i3 = i11;
                        c2 = f1.h((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 44:
                        i3 = i11;
                        c2 = f1.a((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 45:
                        i3 = i11;
                        c2 = f1.b((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 46:
                        i3 = i11;
                        c2 = f1.c((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 47:
                        i3 = i11;
                        c2 = f1.f((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 48:
                        c2 = f1.g((List) unsafe2.getObject(t, d4));
                        if (c2 > 0) {
                            i3 = i11;
                            if (this.i) {
                                unsafe2.putInt(t, i, c2);
                            }
                            b2 = l.b(i13);
                            c3 = l.c(c2);
                            a2 = b2 + c3 + c2;
                            a = a2;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 49:
                        a3 = f1.a(i13, (List<o0>) unsafe2.getObject(t, d4), c(i9));
                        i3 = i11;
                        a = a3;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 50:
                        a3 = this.q.a(i13, unsafe2.getObject(t, d4), b(i9));
                        i3 = i11;
                        a = a3;
                        i10 += a;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 51:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.a(i13, 0.0d);
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 52:
                        if (a((r0<T>) t, i13, i9)) {
                            b = l.a(i13, 0.0f);
                            i3 = i11;
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 53:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.b(i13, e(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 54:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.e(i13, e(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 55:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.c(i13, d(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 56:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.a(i13, 0L);
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 57:
                        if (a((r0<T>) t, i13, i9)) {
                            b = l.b(i13, 0);
                            i3 = i11;
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 58:
                        if (a((r0<T>) t, i13, i9)) {
                            b = l.a(i13, true);
                            i3 = i11;
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 59:
                        if (a((r0<T>) t, i13, i9)) {
                            Object object2 = unsafe2.getObject(t, d4);
                            if (object2 instanceof i) {
                                a3 = l.a(i13, (i) object2);
                            } else {
                                a3 = l.a(i13, (String) object2);
                            }
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 60:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = f1.a(i13, unsafe2.getObject(t, d4), c(i9));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 61:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.a(i13, (i) unsafe2.getObject(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 62:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.f(i13, d(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 63:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.a(i13, d(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 64:
                        if (a((r0<T>) t, i13, i9)) {
                            b = l.d(i13, 0);
                            i3 = i11;
                            a = b;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 65:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.c(i13, 0L);
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 66:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.e(i13, d(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 67:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.d(i13, e(t, d4));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    case 68:
                        if (a((r0<T>) t, i13, i9)) {
                            a3 = l.a(i13, (o0) unsafe2.getObject(t, d4), c(i9));
                            i3 = i11;
                            a = a3;
                            i10 += a;
                            i9 += 3;
                            i11 = i3;
                            i4 = 1048575;
                            i5 = 1;
                        }
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                    default:
                        i3 = i11;
                        i9 += 3;
                        i11 = i3;
                        i4 = 1048575;
                        i5 = 1;
                }
            }
            k1<?, ?> k1Var2 = this.o;
            c = i10 + k1Var2.c(k1Var2.b(t));
            if (!this.f) {
                return c;
            }
            d = this.p.a(t).d();
        }
        return c + d;
    }

    public static Field a(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public T a() {
        return (T) this.m.a(this.e);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void a(T t, T t2) {
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long d = d(i2);
                int i3 = this.a[i];
                switch (f(i2)) {
                    case 0:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.d dVar = p1.e;
                            dVar.a(t, d, dVar.c(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 1:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.d dVar2 = p1.e;
                            dVar2.a((Object) t, d, dVar2.d(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 2:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.f(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 3:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.f(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 4:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.e(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 5:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.f(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 6:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.e(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 7:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.d dVar3 = p1.e;
                            dVar3.a(t, d, dVar3.a(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 8:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a(t, d, p1.g(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 9:
                        a(t, t2, i);
                        break;
                    case 10:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a(t, d, p1.g(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 11:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.e(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 12:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.e(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 13:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.e(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 14:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.f(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 15:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.e(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 16:
                        if (!a((r0<T>) t2, i)) {
                            break;
                        } else {
                            p1.a((Object) t, d, p1.f(t2, d));
                            b((r0<T>) t, i);
                            break;
                        }
                    case 17:
                        a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.a(t, t2, d);
                        break;
                    case 50:
                        j0 j0Var = this.q;
                        Class<?> cls = f1.a;
                        p1.a(t, d, j0Var.a(p1.g(t, d), p1.g(t2, d)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a((r0<T>) t2, i3, i)) {
                            break;
                        } else {
                            p1.a(t, d, p1.g(t2, d));
                            b((r0<T>) t, i3, i);
                            break;
                        }
                    case 60:
                        b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a((r0<T>) t2, i3, i)) {
                            break;
                        } else {
                            p1.a(t, d, p1.g(t2, d));
                            b((r0<T>) t, i3, i);
                            break;
                        }
                    case 68:
                        b(t, t2, i);
                        break;
                }
                i += 3;
            } else {
                k1<?, ?> k1Var = this.o;
                Class<?> cls2 = f1.a;
                k1Var.c(t, k1Var.a(k1Var.b(t), k1Var.b(t2)));
                if (this.f) {
                    r<?> rVar = this.p;
                    u<?> a = rVar.a(t2);
                    if (a.a.isEmpty()) {
                        return;
                    }
                    rVar.b(t).a(a);
                    return;
                }
                return;
            }
        }
    }

    public static <T> int d(T t, long j) {
        return ((Integer) p1.g(t, j)).intValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:562:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x0b15  */
    @Override // com.fyber.inneractive.sdk.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r18, com.fyber.inneractive.sdk.protobuf.s1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.a(java.lang.Object, com.fyber.inneractive.sdk.protobuf.s1):void");
    }

    public final <K, V> void a(s1 s1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.q.f(this.b[(i2 / 3) * 2]);
            Map<?, ?> a = this.q.a(obj);
            m mVar = (m) s1Var;
            mVar.a.getClass();
            Iterator<Map.Entry<?, ?>> it = a.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                mVar.a.i(i, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public void a(T t, c1 c1Var, q qVar) throws IOException {
        qVar.getClass();
        a(this.o, this.p, (r) t, c1Var, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x0076, code lost:
        r0 = r16.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x007a, code lost:
        if (r0 >= r16.l) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x007c, code lost:
        r13 = a((java.lang.Object) r19, r16.j[r0], (int) r13, (com.fyber.inneractive.sdk.protobuf.k1<UT, int>) r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0087, code lost:
        if (r13 == null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0089, code lost:
        r17.b((java.lang.Object) r19, (T) r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x008c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends com.fyber.inneractive.sdk.protobuf.u.b<ET>> void a(com.fyber.inneractive.sdk.protobuf.k1<UT, UB> r17, com.fyber.inneractive.sdk.protobuf.r<ET> r18, T r19, com.fyber.inneractive.sdk.protobuf.c1 r20, com.fyber.inneractive.sdk.protobuf.q r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.a(com.fyber.inneractive.sdk.protobuf.k1, com.fyber.inneractive.sdk.protobuf.r, java.lang.Object, com.fyber.inneractive.sdk.protobuf.c1, com.fyber.inneractive.sdk.protobuf.q):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:300:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0624  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(T r13, com.fyber.inneractive.sdk.protobuf.s1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.b(java.lang.Object, com.fyber.inneractive.sdk.protobuf.s1):void");
    }

    public final Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    public final void b(Object obj, int i, c1 c1Var) throws IOException {
        if ((536870912 & i) != 0) {
            c1Var.b(this.n.b(obj, d(i)));
        } else {
            c1Var.q(this.n.b(obj, d(i)));
        }
    }

    public final void b(T t, T t2, int i) {
        int[] iArr = this.a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long d = d(i2);
        if (a((r0<T>) t2, i3, i)) {
            Object g = a((r0<T>) t, i3, i) ? p1.g(t, d) : null;
            Object g2 = p1.g(t2, d);
            if (g != null && g2 != null) {
                p1.a(t, d, y.a(g, g2));
                b((r0<T>) t, i3, i);
            } else if (g2 != null) {
                p1.a(t, d, g2);
                b((r0<T>) t, i3, i);
            }
        }
    }

    public final void b(T t, int i) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        p1.a((Object) t, j, (1 << (i2 >>> 20)) | p1.e(t, j));
    }

    public final void b(T t, int i, int i2) {
        p1.a((Object) t, this.a[i2 + 2] & 1048575, i);
    }

    public static <T> double b(T t, long j) {
        return ((Double) p1.g(t, j)).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0207  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:323:0x0138 -> B:324:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:353:0x01b4 -> B:354:0x01b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:374:0x0204 -> B:375:0x0205). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.fyber.inneractive.sdk.protobuf.e.b r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.fyber.inneractive.sdk.protobuf.e$b):int");
    }

    public final <K, V> int a(T t, byte[] bArr, int i, int i2, int i3, long j, e.b bVar) throws IOException {
        Unsafe unsafe = s;
        Object obj = this.b[(i3 / 3) * 2];
        Object object = unsafe.getObject(t, j);
        if (this.q.d(object)) {
            Object b = this.q.b(obj);
            this.q.a(b, object);
            unsafe.putObject(t, j, b);
            object = b;
        }
        this.q.f(obj);
        this.q.c(object);
        int d = e.d(bArr, i, bVar);
        int i4 = bVar.a;
        if (i4 >= 0 && i4 <= i2 - d) {
            throw null;
        }
        throw z.i();
    }

    public final int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, e.b bVar) throws IOException {
        Unsafe unsafe = s;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(e.b(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(e.a(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int e = e.e(bArr, i, bVar);
                    unsafe.putObject(t, j, Long.valueOf(bVar.b));
                    unsafe.putInt(t, j2, i4);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int d = e.d(bArr, i, bVar);
                    unsafe.putObject(t, j, Integer.valueOf(bVar.a));
                    unsafe.putInt(t, j2, i4);
                    return d;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(e.b(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(e.a(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int e2 = e.e(bArr, i, bVar);
                    unsafe.putObject(t, j, Boolean.valueOf(bVar.b != 0));
                    unsafe.putInt(t, j2, i4);
                    return e2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int d2 = e.d(bArr, i, bVar);
                    int i13 = bVar.a;
                    if (i13 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & DriveFile.MODE_WRITE_ONLY) != 0 && !q1.b(bArr, d2, d2 + i13)) {
                        throw z.c();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, d2, i13, y.a));
                        d2 += i13;
                    }
                    unsafe.putInt(t, j2, i4);
                    return d2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int a = e.a(c(i8), bArr, i, i2, bVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, bVar.c);
                    } else {
                        unsafe.putObject(t, j, y.a(object, bVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return a;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a2 = e.a(bArr, i, bVar);
                    unsafe.putObject(t, j, bVar.c);
                    unsafe.putInt(t, j2, i4);
                    return a2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int d3 = e.d(bArr, i, bVar);
                    int i14 = bVar.a;
                    y.e a3 = a(i8);
                    if (a3 != null && !a3.a(i14)) {
                        e(t).a(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i14));
                        unsafe.putInt(t, j2, i4);
                    }
                    return d3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int d4 = e.d(bArr, i, bVar);
                    unsafe.putObject(t, j, Integer.valueOf(j.b(bVar.a)));
                    unsafe.putInt(t, j2, i4);
                    return d4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int e3 = e.e(bArr, i, bVar);
                    unsafe.putObject(t, j, Long.valueOf(j.a(bVar.b)));
                    unsafe.putInt(t, j2, i4);
                    return e3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int a4 = e.a(c(i8), bArr, i, i2, (i3 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, bVar.c);
                    } else {
                        unsafe.putObject(t, j, y.a(object2, bVar.c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return a4;
                }
                break;
        }
        return i;
    }

    public final y.e a(int i) {
        return (y.e) this.b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0396, code lost:
        if (r0 != r1) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03e2, code lost:
        if (r0 != r15) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03e4, code lost:
        r10 = r30;
        r13 = r31;
        r12 = r33;
        r8 = r35;
        r11 = r36;
        r5 = r20;
        r2 = r21;
        r6 = r22;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x03f8, code lost:
        r8 = r35;
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(T r31, byte[] r32, int r33, int r34, int r35, com.fyber.inneractive.sdk.protobuf.e.b r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.e$b):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x02b2, code lost:
        if (r0 != r5) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0308, code lost:
        if (r0 != r15) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x030a, code lost:
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0311, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // com.fyber.inneractive.sdk.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r31, byte[] r32, int r33, int r34, com.fyber.inneractive.sdk.protobuf.e.b r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.r0.a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final boolean a(T t) {
        boolean z;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= this.k) {
                return !this.f || this.p.a(t).e();
            }
            int i4 = this.j[i];
            int i5 = this.a[i4];
            int g = g(i4);
            int i6 = this.a[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i2) {
                if (i7 != 1048575) {
                    i3 = s.getInt(t, i7);
                }
                i2 = i7;
            }
            if ((268435456 & g) != 0) {
                if (i2 == 1048575) {
                    z = a((r0<T>) t, i4);
                } else {
                    z = (i3 & i8) != 0;
                }
                if (!z) {
                    return false;
                }
            }
            int f = f(g);
            if (f != 9 && f != 17) {
                if (f != 27) {
                    if (f == 60 || f == 68) {
                        if (a((r0<T>) t, i5, i4) && !c(i4).a(p1.g(t, d(g)))) {
                            return false;
                        }
                    } else if (f != 49) {
                        if (f == 50 && !this.q.a(p1.g(t, d(g))).isEmpty()) {
                            this.q.f(this.b[(i4 / 3) * 2]);
                            throw null;
                        }
                    }
                }
                List list = (List) p1.g(t, d(g));
                if (!list.isEmpty()) {
                    d1 c = c(i4);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= list.size()) {
                            break;
                        } else if (!c.a(list.get(i9))) {
                            z2 = false;
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (!z2) {
                    return false;
                }
            } else {
                if (i2 == 1048575) {
                    z2 = a((r0<T>) t, i4);
                } else if ((i3 & i8) == 0) {
                    z2 = false;
                }
                if (z2 && !c(i4).a(p1.g(t, d(g)))) {
                    return false;
                }
            }
            i++;
        }
    }

    public final void a(int i, Object obj, s1 s1Var) throws IOException {
        if (obj instanceof String) {
            ((m) s1Var).a.b(i, (String) obj);
            return;
        }
        ((m) s1Var).a.b(i, (i) obj);
    }

    public final void a(Object obj, int i, c1 c1Var) throws IOException {
        if ((536870912 & i) != 0) {
            p1.a(obj, d(i), c1Var.p());
        } else if (this.g) {
            p1.a(obj, d(i), c1Var.n());
        } else {
            p1.a(obj, d(i), c1Var.a());
        }
    }

    public final <E> void a(Object obj, int i, c1 c1Var, d1<E> d1Var, q qVar) throws IOException {
        c1Var.b(this.n.b(obj, d(i)), d1Var, qVar);
    }

    public final <E> void a(Object obj, long j, c1 c1Var, d1<E> d1Var, q qVar) throws IOException {
        c1Var.a(this.n.b(obj, j), d1Var, qVar);
    }

    public final <UT, UB> UB a(Object obj, int i, UB ub, k1<UT, UB> k1Var) {
        y.e a;
        int[] iArr = this.a;
        int i2 = iArr[i];
        Object g = p1.g(obj, d(iArr[i + 1]));
        if (g == null || (a = a(i)) == null) {
            return ub;
        }
        Map<?, ?> c = this.q.c(g);
        this.q.f(this.b[(i / 3) * 2]);
        for (Map.Entry<?, ?> entry : c.entrySet()) {
            if (!a.a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    k1Var.a();
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
        return ub;
    }

    public final <K, V> void a(Object obj, int i, Object obj2, q qVar, c1 c1Var) throws IOException {
        long d = d(this.a[i + 1]);
        Object g = p1.g(obj, d);
        if (g == null) {
            g = this.q.b(obj2);
            p1.a(obj, d, g);
        } else if (this.q.d(g)) {
            Object b = this.q.b(obj2);
            this.q.a(b, g);
            p1.a(obj, d, b);
            g = b;
        }
        Map<?, ?> c = this.q.c(g);
        this.q.f(obj2);
        c1Var.a(c, (h0.a) null, qVar);
    }

    public final void a(T t, T t2, int i) {
        long d = d(this.a[i + 1]);
        if (a((r0<T>) t2, i)) {
            Object g = p1.g(t, d);
            Object g2 = p1.g(t2, d);
            if (g != null && g2 != null) {
                p1.a(t, d, y.a(g, g2));
                b((r0<T>) t, i);
            } else if (g2 != null) {
                p1.a(t, d, g2);
                b((r0<T>) t, i);
            }
        }
    }

    public final boolean a(T t, int i) {
        int[] iArr = this.a;
        int i2 = iArr[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            return (p1.e(t, j) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long d = d(i3);
        switch (f(i3)) {
            case 0:
                return p1.e.c(t, d) != 0.0d;
            case 1:
                return p1.e.d(t, d) != 0.0f;
            case 2:
                return p1.f(t, d) != 0;
            case 3:
                return p1.f(t, d) != 0;
            case 4:
                return p1.e(t, d) != 0;
            case 5:
                return p1.f(t, d) != 0;
            case 6:
                return p1.e(t, d) != 0;
            case 7:
                return p1.e.a(t, d);
            case 8:
                Object g = p1.g(t, d);
                if (g instanceof String) {
                    return !((String) g).isEmpty();
                }
                if (g instanceof i) {
                    return !i.b.equals(g);
                }
                throw new IllegalArgumentException();
            case 9:
                return p1.g(t, d) != null;
            case 10:
                return !i.b.equals(p1.g(t, d));
            case 11:
                return p1.e(t, d) != 0;
            case 12:
                return p1.e(t, d) != 0;
            case 13:
                return p1.e(t, d) != 0;
            case 14:
                return p1.f(t, d) != 0;
            case 15:
                return p1.e(t, d) != 0;
            case 16:
                return p1.f(t, d) != 0;
            case 17:
                return p1.g(t, d) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(T t, int i, int i2) {
        return p1.e(t, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public static <T> boolean a(T t, long j) {
        return ((Boolean) p1.g(t, j)).booleanValue();
    }

    public final int a(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
