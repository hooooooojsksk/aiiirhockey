package com.facebook.ads.redexgen.X;

import com.google.android.gms.games.GamesStatusCodes;
import cz.msebera.android.httpclient.HttpStatus;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Aj */
/* loaded from: assets/audience_network.dex */
public final class C0329Aj {
    public static String[] A0M = {"OjKCpSHRaQgRVuqtUlgsb9O8", "00OaDgM7p4igg1vHbesCR74DVTlAeC7z", "TzmlGabo8AOjcKFjChfq2OdnE6jP", "eUJX5SGKEEZf9vIFl", "j2zFnhkJHUredpBjDjfUiogYLN6sD6KJ", "gWZYAfYL2BaqEY2VQTncveV2", "fwiYKc5SQMrWihGSp5I7vQU09P9mYkrS", "9p8sUcgEmhCbeCaZ4cFvJcsv2VoCKNVu"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C0329Aj(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i / i3;
        this.A0K = i / HttpStatus.SC_BAD_REQUEST;
        this.A0I = i / 65;
        this.A0J = this.A0I * 2;
        int i4 = this.A0J;
        this.A0L = new short[i4];
        this.A0A = new short[i4 * i2];
        this.A0B = new short[i4 * i2];
        this.A0C = new short[i4 * i2];
    }

    private int A00(int i) {
        int min = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i, min);
        int frameCount = this.A09;
        this.A09 = frameCount - min;
        return min;
    }

    private int A01(short[] sArr, int i) {
        int maxP;
        int period;
        int i2 = this.A0H;
        int i3 = i2 > 4000 ? i2 / GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND : 1;
        int skip = this.A0G;
        if (skip == 1 && i3 == 1) {
            int i4 = this.A0K;
            int skip2 = this.A0I;
            maxP = A04(sArr, i, i4, skip2);
        } else {
            A0E(sArr, i, i3);
            int skip3 = this.A0I;
            maxP = A04(this.A0L, 0, this.A0K / i3, skip3 / i3);
            if (i3 != 1) {
                int i5 = maxP * i3;
                int skip4 = i3 * 4;
                int i6 = i5 - skip4;
                int period2 = (i3 * 4) + i5;
                int skip5 = this.A0K;
                if (i6 < skip5) {
                    i6 = this.A0K;
                }
                int skip6 = this.A0I;
                if (period2 > skip6) {
                    period2 = this.A0I;
                }
                int skip7 = this.A0G;
                if (skip7 == 1) {
                    maxP = A04(sArr, i, i6, period2);
                } else {
                    A0E(sArr, i, 1);
                    maxP = A04(this.A0L, 0, i6, period2);
                }
            }
        }
        int i7 = this.A02;
        int minP = this.A01;
        String[] strArr = A0M;
        String str = strArr[5];
        String str2 = strArr[0];
        int period3 = str.length();
        int skip8 = str2.length();
        if (period3 != skip8) {
            throw new RuntimeException();
        }
        A0M[1] = "8bhQeTnLevaZP1Rdp3IHUAHszuXZY5fw";
        if (A0F(i7, minP)) {
            period = this.A08;
        } else {
            period = maxP;
        }
        int skip9 = this.A02;
        this.A07 = skip9;
        this.A08 = maxP;
        return period;
    }

    private int A02(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.A09 = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int newFrameCount = i2 + i3;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount);
        int i4 = this.A0G;
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        System.arraycopy(sArr, i * i4, sArr2, newFrameCount2 * i4, i4 * i2);
        A0C(i3, this.A0G, this.A0B, this.A05 + i2, sArr, i + i2, sArr, i);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + i2 + i3;
        return i3;
    }

    private int A03(short[] sArr, int i, float f, int i2) {
        int newFrameCount;
        if (f >= 2.0f) {
            newFrameCount = (int) (i2 / (f - 1.0f));
        } else {
            this.A09 = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            newFrameCount = i2;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i, sArr, i + i2);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i6 = i * bestPeriod;
        while (i2 <= i3) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i2; minDiff++) {
                int bestPeriod2 = i6 + minDiff;
                short s = sArr[bestPeriod2];
                int bestPeriod3 = i6 + i2;
                int worstPeriod = s - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i4;
            int bestPeriod5 = period * i2;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i4 = i2;
            }
            int worstPeriod3 = diff * i5;
            int bestPeriod6 = maxDiff * i2;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i5 = i2;
            }
            i2++;
        }
        this.A02 = period / i4;
        this.A01 = maxDiff / i5;
        return i4;
    }

    private short A05(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[this.A0G + i];
        int rightPosition = this.A03 * i2;
        int i4 = this.A04;
        int i5 = i4 * i3;
        int position = (i4 + 1) * i3;
        int i6 = position - rightPosition;
        int position2 = position - i5;
        short left = (short) (((i6 * s) + ((position2 - i6) * s2)) / position2);
        return left;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06() {
        /*
            r8 = this;
            int r6 = r8.A05
            float r7 = r8.A0F
            float r0 = r8.A0D
            float r7 = r7 / r0
            float r5 = r8.A0E
            float r5 = r5 * r0
            double r3 = (double) r7
            r1 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L1e
            double r3 = (double) r7
            r1 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2b
        L1e:
            r8.A07(r7)
        L21:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L2a
            r8.A08(r5, r6)
        L2a:
            return
        L2b:
            short[] r2 = r8.A0A
            int r1 = r8.A00
            r0 = 0
            r8.A0D(r2, r0, r1)
            r8.A00 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0329Aj.A06():void");
    }

    private void A07(float f) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i = this.A00;
        int i2 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i2);
                i2 += frameCount3;
            } else {
                int A01 = A01(this.A0A, i2);
                int frameCount4 = (f > 1.0d ? 1 : (f == 1.0d ? 0 : -1));
                if (frameCount4 > 0) {
                    int frameCount5 = A03(this.A0A, i2, f, A01);
                    i2 += frameCount5 + A01;
                } else {
                    int frameCount6 = A02(this.A0A, i2, f, A01);
                    i2 += frameCount6;
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i2 <= i);
        A0B(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x009b, code lost:
        r0 = r3 + 1;
        r9.A04 = r0;
        r0 = r9.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a1, code lost:
        if (r0 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a3, code lost:
        r2 = com.facebook.ads.redexgen.X.C0329Aj.A0M;
        r1 = r2[5];
        r0 = r2[0];
        r1 = r1.length();
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b4, code lost:
        if (r1 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bb, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bc, code lost:
        com.facebook.ads.redexgen.X.C0329Aj.A0M[6] = "dm69MZtNxJx8v5BsJDIKlnc92CG6PQ3Q";
        r9.A04 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c5, code lost:
        if (r4 != r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c7, code lost:
        com.facebook.ads.redexgen.X.HD.A04(r5);
        r9.A03 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d0, code lost:
        r5 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(float r10, int r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0329Aj.A08(float, int):void");
    }

    private void A09(int i) {
        int i2 = this.A05 - i;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i2);
        short[] sArr2 = this.A0B;
        int i3 = this.A0G;
        short[] sArr3 = this.A0C;
        int frameCount2 = this.A06;
        System.arraycopy(sArr2, i * i3, sArr3, frameCount2 * i3, i3 * i2);
        this.A05 = i;
        int frameCount3 = this.A06;
        this.A06 = frameCount3 + i2;
    }

    private void A0A(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.A0C;
        int i2 = this.A0G;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.A06 - i) * i2);
        this.A06 -= i;
    }

    private void A0B(int i) {
        int i2 = this.A00 - i;
        short[] sArr = this.A0A;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.A00 = i2;
    }

    public static void A0C(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int t = (i5 * i2) + i6;
            int d = (i4 * i2) + i6;
            for (int u = 0; u < i; u++) {
                int i8 = i - u;
                int o = sArr2[d] * i8;
                int i9 = sArr3[t] * u;
                sArr[i7] = (short) ((o + i9) / i);
                i7 += i2;
                d += i2;
                t += i2;
            }
        }
    }

    private void A0D(short[] sArr, int i, int i2) {
        this.A0B = A0G(this.A0B, this.A05, i2);
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, this.A0B, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A0E(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int frameCount = this.A0G;
        int j = frameCount * i2;
        int i4 = i * frameCount;
        for (int value = 0; value < i3; value++) {
            int samplesPerValue = 0;
            for (int i5 = 0; i5 < j; i5++) {
                samplesPerValue += sArr[(value * j) + i4 + i5];
            }
            this.A0L[value] = (short) (samplesPerValue / j);
        }
    }

    private boolean A0F(int i, int i2) {
        if (i == 0 || this.A08 == 0 || i2 > i * 3 || i * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.A0G;
        int currentCapacityFrames = length / i3;
        if (i + i2 <= currentCapacityFrames) {
            return sArr;
        }
        return Arrays.copyOf(sArr, i3 * (((currentCapacityFrames * 3) / 2) + i2));
    }

    public final int A0H() {
        return this.A05;
    }

    public final void A0I() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0J() {
        int i;
        int i2 = this.A00;
        float f = this.A0F;
        float f2 = this.A0D;
        float r = f / f2;
        float f3 = this.A0E * f2;
        int i3 = this.A05;
        float s = i2;
        int remainingFrameCount = this.A06;
        int i4 = i3 + ((int) ((((s / r) + remainingFrameCount) / f3) + 0.5f));
        short[] sArr = this.A0A;
        int i5 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i5, (remainingFrameCount2 * 2) + i2);
        int xSample = 0;
        while (true) {
            i = this.A0J;
            int remainingFrameCount3 = i * 2;
            int i6 = this.A0G;
            if (xSample >= remainingFrameCount3 * i6) {
                break;
            }
            this.A0A[(i6 * i2) + xSample] = 0;
            xSample++;
        }
        int remainingFrameCount4 = i * 2;
        this.A00 += remainingFrameCount4;
        A06();
        int remainingFrameCount5 = this.A05;
        if (remainingFrameCount5 > i4) {
            this.A05 = i4;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0K(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * min);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - min;
        short[] sArr2 = this.A0B;
        int i = this.A0G;
        int framesToRead3 = this.A05;
        System.arraycopy(sArr2, min * i, sArr2, 0, framesToRead3 * i);
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int framesToWrite = this.A0G;
        int i = remaining / framesToWrite;
        this.A0A = A0G(this.A0A, this.A00, i);
        short[] sArr = this.A0A;
        int bytesToWrite = this.A00;
        shortBuffer.get(sArr, bytesToWrite * this.A0G, ((framesToWrite * i) * 2) / 2);
        this.A00 += i;
        A06();
    }
}
