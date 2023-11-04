package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.nio.charset.Charset;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class k {
    public byte[] a;
    public int b;
    public int c;

    public k() {
    }

    public void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public int b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public void c(int i) {
        a(b() < i ? new byte[i] : this.a, i);
    }

    public void d(int i) {
        a.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void e(int i) {
        a.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void f(int i) {
        e(this.b + i);
    }

    public int g() {
        int e = e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    public int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        this.b = i2 + 1;
        return ((bArr[i2] & UByte.MAX_VALUE) << 8) | i3;
    }

    public long i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        int i5 = i4 + 1;
        this.b = i5;
        int i6 = i5 + 1;
        this.b = i6;
        int i7 = i6 + 1;
        this.b = i7;
        int i8 = i7 + 1;
        this.b = i8;
        this.b = i8 + 1;
        return (bArr[i8] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public String j() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public int k() {
        return (l() << 21) | (l() << 14) | (l() << 7) | l();
    }

    public int l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & UByte.MAX_VALUE;
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    public int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = ((bArr[i] & UByte.MAX_VALUE) << 16) | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        this.b = i3 + 1;
        return (bArr[i3] & UByte.MAX_VALUE) | i4;
    }

    public int o() {
        int c = c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException("Top bit not zero: " + c);
    }

    public long p() {
        long i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    public int q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        this.b = i2 + 1;
        return (bArr[i2] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8);
    }

    public void r() {
        this.b = 0;
        this.c = 0;
    }

    public k(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public String b(int i) {
        String str = new String(this.a, this.b, i, Charset.defaultCharset());
        this.b += i;
        return str;
    }

    public int c() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i2] & UByte.MAX_VALUE) << 16);
        int i5 = i3 + 1;
        this.b = i5;
        int i6 = i4 | ((bArr[i3] & UByte.MAX_VALUE) << 8);
        this.b = i5 + 1;
        return (bArr[i5] & UByte.MAX_VALUE) | i6;
    }

    public long f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = i2 + 1;
        this.b = i3;
        int i4 = i3 + 1;
        this.b = i4;
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public String d() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !u.b(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.b;
        String str = new String(bArr2, i3, i - i3);
        this.b = i;
        int i4 = this.c;
        if (i == i4) {
            return str;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.b = i5;
            if (i5 == i4) {
                return str;
            }
        }
        int i6 = this.b;
        if (bArr3[i6] == 10) {
            this.b = i6 + 1;
        }
        return str;
    }

    public int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & UByte.MAX_VALUE;
        int i4 = i2 + 1;
        this.b = i4;
        int i5 = i3 | ((bArr[i2] & UByte.MAX_VALUE) << 8);
        int i6 = i4 + 1;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & UByte.MAX_VALUE) << 16);
        this.b = i6 + 1;
        return ((bArr[i6] & UByte.MAX_VALUE) << 24) | i7;
    }

    public int a() {
        return this.c - this.b;
    }

    public k(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public void a(j jVar, int i) {
        a(jVar.a, 0, i);
        jVar.b(0);
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public k(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public String a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return str;
    }
}
