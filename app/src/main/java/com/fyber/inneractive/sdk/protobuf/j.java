package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.i;
import com.fyber.inneractive.sdk.protobuf.o0;
import com.fyber.inneractive.sdk.protobuf.p1;
import com.fyber.inneractive.sdk.protobuf.q1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public abstract class j {
    public int a;
    public int b;
    public int c;
    public k d;

    /* loaded from: classes.dex */
    public static final class b extends j {
        public final byte[] e;
        public final boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.l = Integer.MAX_VALUE;
            this.e = bArr;
            this.g = i2 + i;
            this.i = i;
            this.j = i;
            this.f = z;
        }

        public long A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = w();
                j |= (w & ByteCompanionObject.MAX_VALUE) << i;
                if ((w & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw z.e();
        }

        public final void B() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = i - this.j;
            int i3 = this.l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.h = i4;
                this.g = i - i4;
                return;
            }
            this.h = 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i) throws z {
            if (this.k != i) {
                throw z.a();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int b() {
            return this.i - this.j;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void c(int i) {
            this.l = i;
            B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean d() throws IOException {
            return z() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean e(int i) throws IOException {
            int t;
            int i2 = r1.a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.g - this.i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.e;
                        int i5 = this.i;
                        this.i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw z.e();
                }
                while (i4 < 10) {
                    if (w() < 0) {
                        i4++;
                    }
                }
                throw z.e();
                return true;
            } else if (i3 == 1) {
                f(8);
                return true;
            } else if (i3 == 2) {
                f(m());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw z.d();
                    }
                    f(4);
                    return true;
                }
                return false;
            } else {
                do {
                    t = t();
                    if (t == 0) {
                        break;
                    }
                } while (e(t));
                a(r1.a(i >>> 3, 4));
                return true;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public double f() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int g() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int h() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long i() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public float j() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int k() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long l() throws IOException {
            return z();
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.i
                int r1 = r5.g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.A()
                int r1 = (int) r0
                return r1
            L70:
                r5.i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.b.m():int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int n() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long o() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int p() throws IOException {
            return j.b(m());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long q() throws IOException {
            return j.a(z());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String r() throws IOException {
            int m = m();
            if (m > 0) {
                int i = this.g;
                int i2 = this.i;
                if (m <= i - i2) {
                    String str = new String(this.e, i2, m, y.a);
                    this.i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m < 0) {
                throw z.f();
            }
            throw z.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String s() throws IOException {
            int m = m();
            if (m > 0) {
                int i = this.g;
                int i2 = this.i;
                if (m <= i - i2) {
                    String a = q1.a.a(this.e, i2, m);
                    this.i += m;
                    return a;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m <= 0) {
                throw z.f();
            }
            throw z.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int t() throws IOException {
            if (c()) {
                this.k = 0;
                return 0;
            }
            int m = m();
            this.k = m;
            int i = r1.a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw z.b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int u() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long v() throws IOException {
            return z();
        }

        public byte w() throws IOException {
            int i = this.i;
            if (i != this.g) {
                byte[] bArr = this.e;
                this.i = i + 1;
                return bArr[i];
            }
            throw z.i();
        }

        public int x() throws IOException {
            int i = this.i;
            if (this.g - i >= 4) {
                byte[] bArr = this.e;
                this.i = i + 4;
                return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
            }
            throw z.i();
        }

        public long y() throws IOException {
            int i = this.i;
            if (this.g - i >= 8) {
                byte[] bArr = this.e;
                this.i = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw z.i();
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long z() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.b.z():long");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int d(int i) throws z {
            if (i >= 0) {
                int b = i + b();
                int i2 = this.l;
                if (b <= i2) {
                    this.l = b;
                    B();
                    return i2;
                }
                throw z.i();
            }
            throw z.f();
        }

        public void f(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.g;
                int i3 = this.i;
                if (i <= i2 - i3) {
                    this.i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw z.f();
            }
            throw z.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i, o0.a aVar, q qVar) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                ((GeneratedMessageLite.b) aVar).a(this, qVar);
                a(r1.a(i, 4));
                this.a--;
                return;
            }
            throw z.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean c() throws IOException {
            return this.i == this.g;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(o0.a aVar, q qVar) throws IOException {
            int m = m();
            if (this.a < this.b) {
                int d = d(m);
                this.a++;
                ((GeneratedMessageLite.b) aVar).a(this, qVar);
                a(0);
                this.a--;
                this.l = d;
                B();
                return;
            }
            throw z.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int a() {
            int i = this.l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public i e() throws IOException {
            byte[] bArr;
            int m = m();
            if (m > 0) {
                int i = this.g;
                int i2 = this.i;
                if (m <= i - i2) {
                    i a = i.a(this.e, i2, m);
                    this.i += m;
                    return a;
                }
            }
            if (m == 0) {
                return i.b;
            }
            if (m > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (m <= i3 - i4) {
                    int i5 = m + i4;
                    this.i = i5;
                    bArr = Arrays.copyOfRange(this.e, i4, i5);
                    i iVar = i.b;
                    return new i.h(bArr);
                }
            }
            if (m <= 0) {
                if (m == 0) {
                    bArr = y.b;
                    i iVar2 = i.b;
                    return new i.h(bArr);
                }
                throw z.f();
            }
            throw z.i();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j {
        public final InputStream e;
        public final byte[] f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;

        public c(InputStream inputStream, int i) {
            super();
            this.l = Integer.MAX_VALUE;
            y.a(inputStream, "input");
            this.e = inputStream;
            this.f = new byte[i];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        public long A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = w();
                j |= (w & ByteCompanionObject.MAX_VALUE) << i;
                if ((w & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw z.e();
        }

        public final void B() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = this.k + i;
            int i3 = this.l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.h = i4;
                this.g = i - i4;
                return;
            }
            this.h = 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i) throws z {
            if (this.j != i) {
                throw z.a();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int b() {
            return this.k + this.i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void c(int i) {
            this.l = i;
            B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean d() throws IOException {
            return z() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean e(int i) throws IOException {
            int t;
            int i2 = r1.a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.g - this.i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f;
                        int i5 = this.i;
                        this.i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw z.e();
                }
                while (i4 < 10) {
                    if (w() < 0) {
                        i4++;
                    }
                }
                throw z.e();
                return true;
            } else if (i3 == 1) {
                i(8);
                return true;
            } else if (i3 == 2) {
                i(m());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw z.d();
                    }
                    i(4);
                    return true;
                }
                return false;
            } else {
                do {
                    t = t();
                    if (t == 0) {
                        break;
                    }
                } while (e(t));
                a(r1.a(i >>> 3, 4));
                return true;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public double f() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int g() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int h() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long i() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public float j() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int k() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long l() throws IOException {
            return z();
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.i
                int r1 = r5.g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.A()
                int r1 = (int) r0
                return r1
            L70:
                r5.i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.c.m():int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int n() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long o() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int p() throws IOException {
            return j.b(m());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long q() throws IOException {
            return j.a(z());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String r() throws IOException {
            int m = m();
            if (m > 0) {
                int i = this.g;
                int i2 = this.i;
                if (m <= i - i2) {
                    String str = new String(this.f, i2, m, y.a);
                    this.i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m <= this.g) {
                h(m);
                String str2 = new String(this.f, this.i, m, y.a);
                this.i += m;
                return str2;
            }
            return new String(a(m, false), y.a);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String s() throws IOException {
            byte[] a;
            int m = m();
            int i = this.i;
            int i2 = this.g;
            if (m <= i2 - i && m > 0) {
                a = this.f;
                this.i = i + m;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= i2) {
                    h(m);
                    a = this.f;
                    this.i = m + 0;
                } else {
                    a = a(m, false);
                }
                i = 0;
            }
            return q1.a.a(a, i, m);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int t() throws IOException {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int m = m();
            this.j = m;
            int i = r1.a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw z.b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int u() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long v() throws IOException {
            return z();
        }

        public byte w() throws IOException {
            if (this.i == this.g) {
                h(1);
            }
            byte[] bArr = this.f;
            int i = this.i;
            this.i = i + 1;
            return bArr[i];
        }

        public int x() throws IOException {
            int i = this.i;
            if (this.g - i < 4) {
                h(4);
                i = this.i;
            }
            byte[] bArr = this.f;
            this.i = i + 4;
            return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        }

        public long y() throws IOException {
            int i = this.i;
            if (this.g - i < 8) {
                h(8);
                i = this.i;
            }
            byte[] bArr = this.f;
            this.i = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long z() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.c.z():long");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int d(int i) throws z {
            if (i >= 0) {
                int i2 = i + this.k + this.i;
                int i3 = this.l;
                if (i2 <= i3) {
                    this.l = i2;
                    B();
                    return i3;
                }
                throw z.i();
            }
            throw z.f();
        }

        public final byte[] f(int i) throws IOException {
            if (i == 0) {
                return y.b;
            }
            if (i >= 0) {
                int i2 = this.k;
                int i3 = this.i;
                int i4 = i2 + i3 + i;
                if (i4 - this.c <= 0) {
                    int i5 = this.l;
                    if (i4 <= i5) {
                        int i6 = this.g - i3;
                        int i7 = i - i6;
                        if (i7 < 4096 || i7 <= this.e.available()) {
                            byte[] bArr = new byte[i];
                            System.arraycopy(this.f, this.i, bArr, 0, i6);
                            this.k += this.g;
                            this.i = 0;
                            this.g = 0;
                            while (i6 < i) {
                                int read = this.e.read(bArr, i6, i - i6);
                                if (read != -1) {
                                    this.k += read;
                                    i6 += read;
                                } else {
                                    throw z.i();
                                }
                            }
                            return bArr;
                        }
                        return null;
                    }
                    i((i5 - i2) - i3);
                    throw z.i();
                }
                throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw z.f();
        }

        public final List<byte[]> g(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.k += read;
                        i2 += read;
                    } else {
                        throw z.i();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final void h(int i) throws IOException {
            if (j(i)) {
                return;
            }
            if (i > (this.c - this.k) - this.i) {
                throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw z.i();
        }

        public void i(int i) throws IOException {
            int i2 = this.g;
            int i3 = this.i;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.i = i3 + i;
            } else if (i >= 0) {
                int i5 = this.k;
                int i6 = i5 + i3;
                int i7 = i6 + i;
                int i8 = this.l;
                if (i7 <= i8) {
                    this.k = i6;
                    this.g = 0;
                    this.i = 0;
                    while (i4 < i) {
                        try {
                            long j = i - i4;
                            long skip = this.e.skip(j);
                            int i9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i9 < 0 || skip > j) {
                                throw new IllegalStateException(this.e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i9 == 0) {
                                break;
                            } else {
                                i4 += (int) skip;
                            }
                        } finally {
                            this.k += i4;
                            B();
                        }
                    }
                    if (i4 >= i) {
                        return;
                    }
                    int i10 = this.g;
                    int i11 = i10 - this.i;
                    this.i = i10;
                    h(1);
                    while (true) {
                        int i12 = i - i11;
                        int i13 = this.g;
                        if (i12 > i13) {
                            i11 += i13;
                            this.i = i13;
                            h(1);
                        } else {
                            this.i = i12;
                            return;
                        }
                    }
                } else {
                    i((i8 - i5) - i3);
                    throw z.i();
                }
            } else {
                throw z.f();
            }
        }

        public final boolean j(int i) throws IOException {
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                int i5 = this.c;
                int i6 = this.k;
                if (i <= (i5 - i6) - i2 && i6 + i2 + i <= this.l) {
                    if (i2 > 0) {
                        if (i4 > i2) {
                            byte[] bArr = this.f;
                            System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                        }
                        this.k += i2;
                        this.g -= i2;
                        this.i = 0;
                    }
                    InputStream inputStream = this.e;
                    byte[] bArr2 = this.f;
                    int i7 = this.g;
                    int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.k) - i7));
                    if (read == 0 || read < -1 || read > this.f.length) {
                        throw new IllegalStateException(this.e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    } else if (read > 0) {
                        this.g += read;
                        B();
                        if (this.g >= i) {
                            return true;
                        }
                        return j(i);
                    } else {
                        return false;
                    }
                }
                return false;
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i, o0.a aVar, q qVar) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                ((GeneratedMessageLite.b) aVar).a(this, qVar);
                a(r1.a(i, 4));
                this.a--;
                return;
            }
            throw z.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean c() throws IOException {
            return this.i == this.g && !j(1);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(o0.a aVar, q qVar) throws IOException {
            int m = m();
            if (this.a < this.b) {
                int d = d(m);
                this.a++;
                ((GeneratedMessageLite.b) aVar).a(this, qVar);
                a(0);
                this.a--;
                this.l = d;
                B();
                return;
            }
            throw z.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int a() {
            int i = this.l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.k + this.i);
        }

        public final byte[] a(int i, boolean z) throws IOException {
            byte[] f = f(i);
            if (f != null) {
                return z ? (byte[]) f.clone() : f;
            }
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i3 - i2;
            this.k += i3;
            this.i = 0;
            this.g = 0;
            List<byte[]> g = g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, i4);
            Iterator it = ((ArrayList) g).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public i e() throws IOException {
            int m = m();
            int i = this.g;
            int i2 = this.i;
            if (m <= i - i2 && m > 0) {
                i a = i.a(this.f, i2, m);
                this.i += m;
                return a;
            } else if (m == 0) {
                return i.b;
            } else {
                byte[] f = f(m);
                if (f != null) {
                    i iVar = i.b;
                    return i.a(f, 0, f.length);
                }
                int i3 = this.i;
                int i4 = this.g;
                int i5 = i4 - i3;
                this.k += i4;
                this.i = 0;
                this.g = 0;
                List<byte[]> g = g(m - i5);
                byte[] bArr = new byte[m];
                System.arraycopy(this.f, i3, bArr, 0, i5);
                Iterator it = ((ArrayList) g).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    i5 += bArr2.length;
                }
                i iVar2 = i.b;
                return new i.h(bArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends j {
        public final ByteBuffer e;
        public final boolean f;
        public final long g;
        public long h;
        public long i;
        public long j;
        public int k;
        public int l;
        public int m;

        public d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.m = Integer.MAX_VALUE;
            this.e = byteBuffer;
            long a = p1.a(byteBuffer);
            this.g = a;
            this.h = byteBuffer.limit() + a;
            long position = a + byteBuffer.position();
            this.i = position;
            this.j = position;
            this.f = z;
        }

        public long A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = w();
                j |= (w & ByteCompanionObject.MAX_VALUE) << i;
                if ((w & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw z.e();
        }

        public final void B() {
            long j = this.h + this.k;
            this.h = j;
            int i = (int) (j - this.j);
            int i2 = this.m;
            if (i > i2) {
                int i3 = i - i2;
                this.k = i3;
                this.h = j - i3;
                return;
            }
            this.k = 0;
        }

        public final int C() {
            return (int) (this.h - this.i);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i) throws z {
            if (this.l != i) {
                throw z.a();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int b() {
            return (int) (this.i - this.j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void c(int i) {
            this.m = i;
            B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean d() throws IOException {
            return z() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean e(int i) throws IOException {
            int t;
            int i2 = r1.a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (C() >= 10) {
                    while (i4 < 10) {
                        long j = this.i;
                        this.i = 1 + j;
                        if (p1.e.a(j) < 0) {
                            i4++;
                        }
                    }
                    throw z.e();
                }
                while (i4 < 10) {
                    if (w() < 0) {
                        i4++;
                    }
                }
                throw z.e();
                return true;
            } else if (i3 == 1) {
                f(8);
                return true;
            } else if (i3 == 2) {
                f(m());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        throw z.d();
                    }
                    f(4);
                    return true;
                }
                return false;
            } else {
                do {
                    t = t();
                    if (t == 0) {
                        break;
                    }
                } while (e(t));
                a(r1.a(i >>> 3, 4));
                return true;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public double f() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int g() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int h() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long i() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public float j() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int k() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long l() throws IOException {
            return z();
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0085, code lost:
            if (r6.a(r4) < 0) goto L34;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m() throws java.io.IOException {
            /*
                r11 = this;
                long r0 = r11.i
                long r2 = r11.h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L87
            La:
                r2 = 1
                long r4 = r0 + r2
                com.fyber.inneractive.sdk.protobuf.p1$d r6 = com.fyber.inneractive.sdk.protobuf.p1.e
                byte r0 = r6.a(r0)
                if (r0 < 0) goto L19
                r11.i = r4
                return r0
            L19:
                long r7 = r11.h
                long r7 = r7 - r4
                r9 = 9
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 >= 0) goto L23
                goto L87
            L23:
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L31
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8d
            L31:
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L40
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3e:
                r7 = r4
                goto L8d
            L40:
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L50
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8d
            L50:
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                int r7 = r1 << 28
                r0 = r0 ^ r7
                r7 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r7
                if (r1 >= 0) goto L3e
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                if (r1 >= 0) goto L8d
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                if (r1 >= 0) goto L3e
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                if (r1 >= 0) goto L8d
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                if (r1 >= 0) goto L3e
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                if (r1 >= 0) goto L8d
            L87:
                long r0 = r11.A()
                int r1 = (int) r0
                return r1
            L8d:
                r11.i = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.d.m():int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int n() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long o() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int p() throws IOException {
            return j.b(m());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long q() throws IOException {
            return j.a(z());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String r() throws IOException {
            int m = m();
            if (m <= 0 || m > C()) {
                if (m == 0) {
                    return "";
                }
                if (m < 0) {
                    throw z.f();
                }
                throw z.i();
            }
            byte[] bArr = new byte[m];
            long j = m;
            p1.e.a(this.i, bArr, 0L, j);
            String str = new String(bArr, y.a);
            this.i += j;
            return str;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String s() throws IOException {
            String a;
            int m = m();
            if (m <= 0 || m > C()) {
                if (m == 0) {
                    return "";
                }
                if (m <= 0) {
                    throw z.f();
                }
                throw z.i();
            }
            int b = b(this.i);
            ByteBuffer byteBuffer = this.e;
            q1.b bVar = q1.a;
            bVar.getClass();
            if (byteBuffer.hasArray()) {
                a = bVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + b, m);
            } else if (byteBuffer.isDirect()) {
                a = bVar.b(byteBuffer, b, m);
            } else {
                a = bVar.a(byteBuffer, b, m);
            }
            this.i += m;
            return a;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int t() throws IOException {
            if (c()) {
                this.l = 0;
                return 0;
            }
            int m = m();
            this.l = m;
            int i = r1.a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw z.b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int u() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long v() throws IOException {
            return z();
        }

        public byte w() throws IOException {
            long j = this.i;
            if (j != this.h) {
                this.i = 1 + j;
                return p1.e.a(j);
            }
            throw z.i();
        }

        public int x() throws IOException {
            long j = this.i;
            if (this.h - j >= 4) {
                this.i = 4 + j;
                p1.d dVar = p1.e;
                return ((dVar.a(j + 3) & UByte.MAX_VALUE) << 24) | (dVar.a(j) & UByte.MAX_VALUE) | ((dVar.a(1 + j) & UByte.MAX_VALUE) << 8) | ((dVar.a(2 + j) & UByte.MAX_VALUE) << 16);
            }
            throw z.i();
        }

        public long y() throws IOException {
            long j = this.i;
            if (this.h - j >= 8) {
                this.i = 8 + j;
                p1.d dVar = p1.e;
                return ((dVar.a(j + 7) & 255) << 56) | (dVar.a(j) & 255) | ((dVar.a(1 + j) & 255) << 8) | ((dVar.a(2 + j) & 255) << 16) | ((dVar.a(3 + j) & 255) << 24) | ((dVar.a(4 + j) & 255) << 32) | ((dVar.a(5 + j) & 255) << 40) | ((dVar.a(6 + j) & 255) << 48);
            }
            throw z.i();
        }

        public long z() throws IOException {
            long a;
            long j;
            long j2;
            int i;
            long j3 = this.i;
            if (this.h != j3) {
                long j4 = j3 + 1;
                p1.d dVar = p1.e;
                byte a2 = dVar.a(j3);
                if (a2 >= 0) {
                    this.i = j4;
                    return a2;
                } else if (this.h - j4 >= 9) {
                    long j5 = j4 + 1;
                    int a3 = a2 ^ (dVar.a(j4) << 7);
                    if (a3 >= 0) {
                        long j6 = j5 + 1;
                        int a4 = a3 ^ (dVar.a(j5) << 14);
                        if (a4 >= 0) {
                            a = a4 ^ 16256;
                        } else {
                            j5 = j6 + 1;
                            int a5 = a4 ^ (dVar.a(j6) << 21);
                            if (a5 < 0) {
                                i = a5 ^ (-2080896);
                            } else {
                                j6 = j5 + 1;
                                long a6 = a5 ^ (dVar.a(j5) << 28);
                                if (a6 < 0) {
                                    long j7 = j6 + 1;
                                    long a7 = a6 ^ (dVar.a(j6) << 35);
                                    if (a7 < 0) {
                                        j = -34093383808L;
                                    } else {
                                        j6 = j7 + 1;
                                        a6 = a7 ^ (dVar.a(j7) << 42);
                                        if (a6 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            j7 = j6 + 1;
                                            a7 = a6 ^ (dVar.a(j6) << 49);
                                            if (a7 < 0) {
                                                j = -558586000294016L;
                                            } else {
                                                j6 = j7 + 1;
                                                a = (a7 ^ (dVar.a(j7) << 56)) ^ 71499008037633920L;
                                                if (a < 0) {
                                                    long j8 = 1 + j6;
                                                    if (dVar.a(j6) >= 0) {
                                                        j5 = j8;
                                                        this.i = j5;
                                                        return a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    a = a7 ^ j;
                                    j5 = j7;
                                    this.i = j5;
                                    return a;
                                }
                                j2 = 266354560;
                                a = a6 ^ j2;
                            }
                        }
                        j5 = j6;
                        this.i = j5;
                        return a;
                    }
                    i = a3 ^ (-128);
                    a = i;
                    this.i = j5;
                    return a;
                }
            }
            return A();
        }

        public final int b(long j) {
            return (int) (j - this.g);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int d(int i) throws z {
            if (i >= 0) {
                int b = i + b();
                int i2 = this.m;
                if (b <= i2) {
                    this.m = b;
                    B();
                    return i2;
                }
                throw z.i();
            }
            throw z.f();
        }

        public void f(int i) throws IOException {
            if (i >= 0 && i <= C()) {
                this.i += i;
            } else if (i < 0) {
                throw z.f();
            } else {
                throw z.i();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i, o0.a aVar, q qVar) throws IOException {
            int i2 = this.a;
            if (i2 < this.b) {
                this.a = i2 + 1;
                ((GeneratedMessageLite.b) aVar).a(this, qVar);
                a(r1.a(i, 4));
                this.a--;
                return;
            }
            throw z.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean c() throws IOException {
            return this.i == this.h;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(o0.a aVar, q qVar) throws IOException {
            int m = m();
            if (this.a < this.b) {
                int d = d(m);
                this.a++;
                ((GeneratedMessageLite.b) aVar).a(this, qVar);
                a(0);
                this.a--;
                this.m = d;
                B();
                return;
            }
            throw z.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int a() {
            int i = this.m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public i e() throws IOException {
            int m = m();
            if (m <= 0 || m > C()) {
                if (m == 0) {
                    return i.b;
                }
                if (m < 0) {
                    throw z.f();
                }
                throw z.i();
            }
            byte[] bArr = new byte[m];
            long j = m;
            p1.e.a(this.i, bArr, 0L, j);
            this.i += j;
            i iVar = i.b;
            return new i.h(bArr);
        }
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static j a(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = y.b;
            return a(bArr, 0, bArr.length, false);
        }
        return new c(inputStream, 4096);
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract void a(int i) throws z;

    public abstract void a(int i, o0.a aVar, q qVar) throws IOException;

    public abstract void a(o0.a aVar, q qVar) throws IOException;

    public abstract int b();

    public abstract void c(int i);

    public abstract boolean c() throws IOException;

    public abstract int d(int i) throws z;

    public abstract boolean d() throws IOException;

    public abstract i e() throws IOException;

    public abstract boolean e(int i) throws IOException;

    public abstract double f() throws IOException;

    public abstract int g() throws IOException;

    public abstract int h() throws IOException;

    public abstract long i() throws IOException;

    public abstract float j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract String r() throws IOException;

    public abstract String s() throws IOException;

    public abstract int t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public j() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
    }

    public static j a(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.d(i2);
            return bVar;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static j a(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && p1.f) {
            return new d(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return a(bArr, 0, remaining, true);
    }
}
