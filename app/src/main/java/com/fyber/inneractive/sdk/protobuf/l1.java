package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l1 {
    public static final l1 f = new l1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public l1() {
        this(0, new int[8], new Object[8], true);
    }

    public static l1 a(l1 l1Var, l1 l1Var2) {
        int i = l1Var.a + l1Var2.a;
        int[] copyOf = Arrays.copyOf(l1Var.b, i);
        System.arraycopy(l1Var2.b, 0, copyOf, l1Var.a, l1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(l1Var.c, i);
        System.arraycopy(l1Var2.c, 0, copyOf2, l1Var.a, l1Var2.a);
        return new l1(i, copyOf, copyOf2, true);
    }

    public static l1 c() {
        return new l1(0, new int[8], new Object[8], true);
    }

    public int b() {
        int e;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = r1.a;
            int i6 = i4 >>> 3;
            int i7 = i4 & 7;
            if (i7 == 0) {
                e = l.e(i6, ((Long) this.c[i3]).longValue());
            } else if (i7 == 1) {
                e = l.a(i6, ((Long) this.c[i3]).longValue());
            } else if (i7 == 2) {
                e = l.a(i6, (i) this.c[i3]);
            } else if (i7 == 3) {
                e = (l.b(i6) * 2) + ((l1) this.c[i3]).b();
            } else if (i7 != 5) {
                throw new IllegalStateException(z.d());
            } else {
                e = l.b(i6, ((Integer) this.c[i3]).intValue());
            }
            i2 += e;
        }
        this.d = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l1)) {
            l1 l1Var = (l1) obj;
            int i = this.a;
            if (i == l1Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = l1Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = l1Var.c;
                    int i3 = this.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public l1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public void a(s1 s1Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        ((m) s1Var).getClass();
        for (int i = 0; i < this.a; i++) {
            a(this.b[i], this.c[i], s1Var);
        }
    }

    public static void a(int i, Object obj, s1 s1Var) throws IOException {
        int i2 = r1.a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            ((m) s1Var).a.g(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            ((m) s1Var).a.f(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            ((m) s1Var).a.b(i3, (i) obj);
        } else if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(z.d());
            }
            ((m) s1Var).a.g(i3, ((Integer) obj).intValue());
        } else {
            m mVar = (m) s1Var;
            mVar.a.i(i3, 3);
            ((l1) obj).a(s1Var);
            mVar.a.i(i3, 4);
        }
    }

    public void a(int i, Object obj) {
        a();
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public boolean a(int i, j jVar) throws IOException {
        int t;
        a();
        int i2 = r1.a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            a(i, Long.valueOf(jVar.l()));
            return true;
        } else if (i4 == 1) {
            a(i, Long.valueOf(jVar.i()));
            return true;
        } else if (i4 == 2) {
            a(i, jVar.e());
            return true;
        } else if (i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5) {
                    throw z.d();
                }
                a(i, Integer.valueOf(jVar.h()));
                return true;
            }
            return false;
        } else {
            l1 l1Var = new l1(0, new int[8], new Object[8], true);
            do {
                t = jVar.t();
                if (t == 0) {
                    break;
                }
            } while (l1Var.a(t, jVar));
            jVar.a(r1.a(i3, 4));
            a(i, l1Var);
            return true;
        }
    }
}
