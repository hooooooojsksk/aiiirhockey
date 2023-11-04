package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;
import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class Vr implements InterfaceC0364Cb {
    public static byte[] A0H;
    public static String[] A0I = {"aRSbhnMLIcOzj", "ArMoJofeV0W2c5eK3C8YvO0k1qJSW4Bu", "08qFCQPWLGI3uv5FT5gA6GEjfGrW3Yqx", "08xirDFjjs8oqtTIfBkr", "oUVAEbDN9zve", "EoNb", "rtTHy9LVM9SlY", "UaKoPz55Hu2hTR949azFeJYsN1lXPKTw"};
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public InterfaceC0351Bh A07;
    public InterfaceC0351Bh A08;
    public InterfaceC0351Bh A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0482Hb A0D;
    public final C0483Hc A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-31, -43, 23, 42, 41, -43, 22, 40, 40, 42, 34, 30, 35, 28, -43, -10, -10, -8, -43, 1, -8, -29, -8, 27, 43, 42, 9, 28, 24, 27, 28, 41, -39, -6, 9, -6, -8, 9, -6, -7, -75, -10, 10, -7, -2, 4, -75, 4, -9, -1, -6, -8, 9, -75, 9, 14, 5, -6, -49, -75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 42, 37, -12, 0, 20, 3, 8, 14, -50, 12, 15, -45, 0, -52, 11, 0, 19, 12};
    }

    static {
        A06();
        A0J = new byte[]{airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 51};
    }

    public Vr(boolean z) {
        this(z, null);
    }

    public Vr(boolean z, String str) {
        this.A0D = new C0482Hb(new byte[7]);
        this.A0E = new C0483Hc(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws C9Y {
        this.A0D.A07(0);
        if (!this.A0C) {
            int A04 = this.A0D.A04(2) + 1;
            if (A04 != 2) {
                Log.w(A00(22, 10, 59), A00(32, 28, 25) + A04 + A00(0, 22, 57));
                A04 = 2;
            }
            int A042 = this.A0D.A04(4);
            this.A0D.A08(1);
            int audioObjectType = this.A0D.A04(3);
            byte[] A07 = HH.A07(A04, A042, audioObjectType);
            Pair<Integer, Integer> A03 = HH.A03(A07);
            Format A072 = Format.A07(this.A0A, A00(75, 15, 35), null, -1, -1, ((Integer) A03.second).intValue(), ((Integer) A03.first).intValue(), Collections.singletonList(A07), null, 0, this.A0F);
            int audioObjectType2 = A072.A0C;
            this.A05 = 1024000000 / audioObjectType2;
            this.A09.A5X(A072);
            this.A0C = true;
        } else {
            this.A0D.A08(10);
        }
        this.A0D.A08(4);
        int A043 = (this.A0D.A04(13) - 2) - 5;
        if (this.A0B) {
            A043 -= 2;
        }
        A07(this.A09, this.A05, 0, A043);
    }

    private void A02() {
        this.A08.AEX(this.A0E, 10);
        this.A0E.A0Y(6);
        A07(this.A08, 0L, 10, this.A0E.A0D() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Y(0);
    }

    private void A07(InterfaceC0351Bh interfaceC0351Bh, long j, int i, int i2) {
        this.A03 = 3;
        this.A00 = i;
        this.A07 = interfaceC0351Bh;
        this.A04 = j;
        this.A02 = i2;
    }

    private void A08(C0483Hc c0483Hc) {
        byte[] bArr = c0483Hc.A00;
        int A06 = c0483Hc.A06();
        int A07 = c0483Hc.A07();
        while (A06 < A07) {
            int position = A06 + 1;
            int i = bArr[A06] & UByte.MAX_VALUE;
            if (this.A01 == 512 && i >= 240 && i != 255) {
                this.A0B = (i & 1) == 0;
                A04();
                c0483Hc.A0Y(position);
                return;
            }
            int endOffset = this.A01;
            int data = endOffset | i;
            if (data == 329) {
                this.A01 = 768;
            } else if (data == 511) {
                this.A01 = 512;
            } else if (data == 836) {
                this.A01 = 1024;
            } else if (data != 1075) {
                if (endOffset != 256) {
                    this.A01 = 256;
                    A06 = position - 1;
                }
            } else {
                A05();
                c0483Hc.A0Y(position);
                return;
            }
            A06 = position;
        }
        c0483Hc.A0Y(A06);
    }

    private void A09(C0483Hc c0483Hc) {
        int min = Math.min(c0483Hc.A04(), this.A02 - this.A00);
        this.A07.AEX(c0483Hc, min);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        int bytesToRead2 = this.A00;
        int i = this.A02;
        if (bytesToRead2 == i) {
            this.A07.AEY(this.A06, 1, i, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0A(C0483Hc c0483Hc, byte[] bArr, int i) {
        int min = Math.min(c0483Hc.A04(), i - this.A00);
        int bytesToRead = this.A00;
        c0483Hc.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4B(C0483Hc c0483Hc) throws C9Y {
        while (c0483Hc.A04() > 0) {
            int i = this.A03;
            if (i == 0) {
                A08(c0483Hc);
            } else if (i != 1) {
                if (i == 2) {
                    if (A0A(c0483Hc, this.A0D.A00, this.A0B ? 7 : 5)) {
                        A01();
                    }
                } else if (i == 3) {
                    A09(c0483Hc);
                }
            } else if (A0A(c0483Hc, this.A0E.A00, 10)) {
                A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A0A = c0375Cp.A04();
        this.A09 = bx.AFc(c0375Cp.A03(), 1);
        if (this.A0G) {
            c0375Cp.A05();
            this.A08 = bx.AFc(c0375Cp.A03(), 4);
            if (A0I[4].length() != 12) {
                throw new RuntimeException();
            }
            A0I[5] = "GBp";
            this.A08.A5X(Format.A0B(c0375Cp.A04(), A00(60, 15, 69), null, -1, null));
            return;
        }
        this.A08 = new WW();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        this.A06 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        A03();
    }
}
