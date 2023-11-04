package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class Vn implements InterfaceC0364Cb {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0351Bh A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final Cc A0B = new Cc(128);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Format, Long> A00(Cc cc, String str) {
        int i;
        byte[] copyOf = Arrays.copyOf(cc.A02, cc.A00);
        int i2 = copyOf[4] & UByte.MAX_VALUE;
        int i3 = copyOf[5] & UByte.MAX_VALUE;
        int i4 = (i2 << 4) | (i3 >> 4);
        int i5 = ((i3 & 15) << 8) | (copyOf[6] & UByte.MAX_VALUE);
        float f = 1.0f;
        int i6 = (copyOf[7] & 240) >> 4;
        if (i6 == 2) {
            f = (i5 * 4) / (i4 * 3);
        } else if (i6 == 3) {
            f = (i5 * 16) / (i4 * 9);
        } else if (i6 == 4) {
            f = (i5 * 121) / (i4 * 100);
        }
        Format A03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i4, i5, -1.0f, Collections.singletonList(copyOf), -1, f, null);
        long j = 0;
        int i7 = (copyOf[7] & 15) - 1;
        if (i7 >= 0) {
            double[] dArr = A0E;
            if (i7 < dArr.length) {
                double d = dArr[i7];
                int i8 = cc.A01;
                int i9 = (copyOf[i8 + 9] & 96) >> 5;
                if (i9 != (copyOf[i8 + 9] & 31)) {
                    d *= (i9 + 1.0d) / (i + 1);
                }
                j = (long) (1000000.0d / d);
            }
        }
        return Pair.create(A03, Long.valueOf(j));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{7, 24, 21, 20, 30, 94, 28, 1, 20, 22, airhockey.P_GAME_MYSCORE};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4B(C0483Hc c0483Hc) {
        int A06 = c0483Hc.A06();
        int A07 = c0483Hc.A07();
        byte[] bArr = c0483Hc.A00;
        this.A04 += c0483Hc.A04();
        this.A05.AEX(c0483Hc, c0483Hc.A04());
        while (true) {
            int bytesWrittenPastStartCode = HY.A04(bArr, A06, A07, this.A0C);
            if (bytesWrittenPastStartCode == A07) {
                break;
            }
            int startCodeValue = c0483Hc.A00[bytesWrittenPastStartCode + 3] & UByte.MAX_VALUE;
            if (!this.A07) {
                int i = bytesWrittenPastStartCode - A06;
                if (i > 0) {
                    this.A0B.A01(bArr, A06, bytesWrittenPastStartCode);
                }
                if (this.A0B.A02(startCodeValue, i < 0 ? -i : 0)) {
                    Pair<Format, Long> A00 = A00(this.A0B, this.A06);
                    this.A05.A5X((Format) A00.first);
                    this.A00 = ((Long) A00.second).longValue();
                    this.A07 = true;
                }
            }
            if (startCodeValue == 0 || startCodeValue == 179) {
                int i2 = A07 - bytesWrittenPastStartCode;
                if (this.A0A && this.A08 && this.A07) {
                    boolean z = this.A09;
                    InterfaceC0351Bh interfaceC0351Bh = this.A05;
                    long j = this.A03;
                    int startCodeOffset = z ? 1 : 0;
                    interfaceC0351Bh.AEY(j, startCodeOffset, ((int) (this.A04 - this.A02)) - i2, i2, null);
                }
                if (!this.A0A || this.A08) {
                    this.A02 = this.A04 - i2;
                    long j2 = this.A01;
                    if (j2 == -9223372036854775807L) {
                        j2 = this.A0A ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j2;
                    this.A09 = false;
                    this.A01 = -9223372036854775807L;
                    this.A0A = true;
                }
                this.A08 = startCodeValue == 0;
            } else if (startCodeValue == 184) {
                this.A09 = true;
            }
            A06 = bytesWrittenPastStartCode + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, A06, A07);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A06 = c0375Cp.A04();
        this.A05 = bx.AFc(c0375Cp.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        HY.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
