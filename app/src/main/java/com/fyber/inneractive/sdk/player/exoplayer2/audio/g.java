package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.google.android.gms.games.GamesStatusCodes;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final short[] f;
    public int g;
    public short[] h;
    public int i;
    public short[] j;
    public int k;
    public short[] l;
    public int q;
    public int r;
    public int s;
    public int t;
    public int v;
    public int w;
    public int x;
    public int m = 0;
    public int n = 0;
    public int u = 0;
    public float o = 1.0f;
    public float p = 1.0f;

    public g(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i / HttpStatus.SC_BAD_REQUEST;
        int i3 = i / 65;
        this.d = i3;
        int i4 = i3 * 2;
        this.e = i4;
        this.f = new short[i4];
        this.g = i4;
        int i5 = i2 * i4;
        this.h = new short[i5];
        this.i = i4;
        this.j = new short[i5];
        this.k = i4;
        this.l = new short[i5];
    }

    public final void a(int i) {
        int i2 = this.q + i;
        int i3 = this.g;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.g = i4;
            this.h = Arrays.copyOf(this.h, i4 * this.b);
        }
    }

    public final void b(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.i = i4;
            this.j = Arrays.copyOf(this.j, i4 * this.b);
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        b(i2);
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, this.j, this.r * i3, i3 * i2);
        this.r += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.e / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f[i7] = (short) (i8 / i5);
        }
    }

    public final int a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.w = i5 / i7;
        this.x = i8 / i6;
        return i7;
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.r;
        float f = this.o / this.p;
        double d = f;
        int i9 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            a(this.h, 0, this.q);
            this.q = 0;
        } else {
            int i10 = this.q;
            if (i10 >= this.e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.t;
                    if (i12 > 0) {
                        int min = Math.min(this.e, i12);
                        a(this.h, i11, min);
                        this.t -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.h;
                        int i13 = this.a;
                        int i14 = i13 > 4000 ? i13 / GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND : 1;
                        if (this.b == i9 && i14 == i9) {
                            i = a(sArr, i11, this.c, this.d);
                        } else {
                            b(sArr, i11, i14);
                            int a = a(this.f, 0, this.c / i14, this.d / i14);
                            if (i14 != i9) {
                                int i15 = a * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.b == i9) {
                                    i = a(sArr, i11, i17, i18);
                                } else {
                                    b(sArr, i11, i9);
                                    i = a(this.f, 0, i17, i18);
                                }
                            } else {
                                i = a;
                            }
                        }
                        int i21 = this.w;
                        int i22 = i21 != 0 && this.u != 0 && this.x <= i21 * 3 && i21 * 2 > this.v * 3 ? this.u : i;
                        this.v = i21;
                        this.u = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.h;
                            if (f >= 2.0f) {
                                i3 = (int) (i22 / (f - 1.0f));
                            } else {
                                this.t = (int) ((i22 * (2.0f - f)) / (f - 1.0f));
                                i3 = i22;
                            }
                            b(i3);
                            int i23 = i3;
                            a(i3, this.b, this.j, this.r, sArr2, i11, sArr2, i11 + i22);
                            this.r += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.h;
                            if (f < 0.5f) {
                                i2 = (int) ((i24 * f) / (1.0f - f));
                            } else {
                                this.t = (int) ((i24 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i2 = i24;
                            }
                            int i25 = i24 + i2;
                            b(i25);
                            int i26 = this.b;
                            System.arraycopy(sArr3, i11 * i26, this.j, this.r * i26, i26 * i24);
                            a(i2, this.b, this.j, this.r + i24, sArr3, i24 + i11, sArr3, i11);
                            this.r += i25;
                            i11 += i2;
                        }
                    }
                    if (this.e + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i27 = this.q - i11;
                short[] sArr4 = this.h;
                int i28 = this.b;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.q = i27;
            }
        }
        float f2 = this.p;
        if (f2 == 1.0f || this.r == i8) {
            return;
        }
        int i29 = this.a;
        int i30 = (int) (i29 / f2);
        while (true) {
            if (i30 <= 16384 && i29 <= 16384) {
                break;
            }
            i30 /= 2;
            i29 /= 2;
        }
        int i31 = this.r - i8;
        int i32 = this.s + i31;
        int i33 = this.k;
        if (i32 > i33) {
            int i34 = i33 + (i33 / 2) + i31;
            this.k = i34;
            this.l = Arrays.copyOf(this.l, i34 * this.b);
        }
        short[] sArr5 = this.j;
        int i35 = this.b;
        System.arraycopy(sArr5, i8 * i35, this.l, this.s * i35, i35 * i31);
        this.r = i8;
        this.s += i31;
        int i36 = 0;
        while (true) {
            i4 = this.s;
            i5 = i4 - 1;
            if (i36 >= i5) {
                break;
            }
            while (true) {
                i6 = this.m + 1;
                int i37 = i6 * i30;
                i7 = this.n;
                if (i37 <= i7 * i29) {
                    break;
                }
                b(1);
                int i38 = 0;
                while (true) {
                    int i39 = this.b;
                    if (i38 < i39) {
                        short[] sArr6 = this.l;
                        int i40 = (i36 * i39) + i38;
                        short s = sArr6[i40];
                        short s2 = sArr6[i40 + i39];
                        int i41 = this.m;
                        int i42 = i41 * i30;
                        int i43 = (i41 + 1) * i30;
                        int i44 = i43 - (this.n * i29);
                        int i45 = i43 - i42;
                        this.j[(this.r * i39) + i38] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i38++;
                    }
                }
                this.n++;
                this.r++;
            }
            this.m = i6;
            if (i6 == i29) {
                this.m = 0;
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(i7 == i30);
                this.n = 0;
            }
            i36++;
        }
        if (i5 == 0) {
            return;
        }
        short[] sArr7 = this.l;
        int i46 = this.b;
        System.arraycopy(sArr7, i5 * i46, sArr7, 0, (i4 - i5) * i46);
        this.s -= i5;
    }

    public static void a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
