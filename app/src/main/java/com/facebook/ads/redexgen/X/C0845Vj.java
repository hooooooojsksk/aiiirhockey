package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Vj */
/* loaded from: assets/audience_network.dex */
public final class C0845Vj implements InterfaceC0364Cb {
    public static byte[] A0K;
    public static String[] A0L = {"UXkay4rUGskktYzxNvudWKkCsEVxw", "TbZCK2AobFbud3dzlhL4ME6xz6dWV35u", "g54hQOaX", "Hzwenjp7P2fY81mJ8QBm2GDgQOuz90wV", "pL9ldBQtoqrc20elRWolxWe4zjdgoW6T", "TPLjBFOallz6251M1W6TB1HqEI4wd", "DLwQdeQQFfiBx7iMVYuUh1sumwfdr4oM", "y7d3scFL40rvPqI5TaUsSswOsLgzDZPi"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC0351Bh A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C0483Hc A0I = new C0483Hc(1024);
    public final C0482Hb A0H = new C0482Hb(this.A0I.A00);

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0L[1].charAt(8) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[6] = "y88DdvbFX6MPRa9z5ZeTPeJlbkGd2RA6";
            strArr[4] = "7eDKdIkFThzm8wa04NY5bFVXWVarNGHW";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
            i4++;
        }
    }

    public static void A04() {
        A0K = new byte[]{57, 45, 60, 49, 55, 119, 53, 40, airhockey.J_GAME_DISCONNECT, 57, airhockey.J_ERROR, 52, 57, 44, 53};
    }

    static {
        A04();
    }

    public C0845Vj(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C0482Hb c0482Hb) throws C9Y {
        int A01 = c0482Hb.A01();
        Pair<Integer, Integer> config = HH.A02(c0482Hb, true);
        int bitsLeft = ((Integer) config.first).intValue();
        this.A05 = bitsLeft;
        int bitsLeft2 = ((Integer) config.second).intValue();
        this.A02 = bitsLeft2;
        int bitsLeft3 = c0482Hb.A01();
        return A01 - bitsLeft3;
    }

    private int A01(C0482Hb c0482Hb) throws C9Y {
        int tmp;
        int i = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = c0482Hb.A04(8);
                i += tmp;
            } while (tmp == 255);
            return i;
        }
        throw new C9Y();
    }

    public static long A02(C0482Hb c0482Hb) {
        int bytesForValue = c0482Hb.A04(2);
        return c0482Hb.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i) {
        this.A0I.A0W(i);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C0482Hb c0482Hb) throws C9Y {
        boolean useSameStreamMux = c0482Hb.A0F();
        if (!useSameStreamMux) {
            this.A0G = true;
            A08(c0482Hb);
        } else {
            boolean useSameStreamMux2 = this.A0G;
            if (!useSameStreamMux2) {
                return;
            }
        }
        int i = this.A00;
        if (A0L[2].length() != 8) {
            throw new RuntimeException();
        }
        A0L[1] = "yEjpzXBGbjL6zW81s4nwg5Kx41FgkglX";
        if (i == 0) {
            if (this.A04 == 0) {
                A09(c0482Hb, A01(c0482Hb));
                boolean useSameStreamMux3 = this.A0F;
                if (useSameStreamMux3) {
                    c0482Hb.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C9Y();
        }
        throw new C9Y();
    }

    private void A07(C0482Hb c0482Hb) {
        this.A03 = c0482Hb.A04(3);
        int i = this.A03;
        if (i == 0) {
            if (A0L[2].length() != 8) {
                throw new RuntimeException();
            }
            A0L[2] = "qJ9xjuWp";
            c0482Hb.A08(8);
        } else if (i != 1) {
            if (i == 3 || i == 4 || i == 5) {
                c0482Hb.A08(6);
            } else if (i != 6 && i != 7) {
            } else {
                c0482Hb.A08(1);
            }
        } else {
            c0482Hb.A08(9);
        }
    }

    private void A08(C0482Hb c0482Hb) throws C9Y {
        boolean A0F;
        int A04 = c0482Hb.A04(1);
        this.A00 = A04 == 1 ? c0482Hb.A04(1) : 0;
        if (this.A00 == 0) {
            if (A04 == 1) {
                A02(c0482Hb);
            }
            if (c0482Hb.A0F()) {
                this.A04 = c0482Hb.A04(6);
                int A042 = c0482Hb.A04(4);
                int A043 = c0482Hb.A04(3);
                if (A042 == 0 && A043 == 0) {
                    if (A04 == 0) {
                        int A03 = c0482Hb.A03();
                        int A00 = A00(c0482Hb);
                        c0482Hb.A07(A03);
                        byte[] bArr = new byte[(A00 + 7) / 8];
                        c0482Hb.A0D(bArr, 0, A00);
                        Format A07 = Format.A07(this.A0E, A03(0, 15, 40), null, -1, -1, this.A02, this.A05, Collections.singletonList(bArr), null, 0, this.A0J);
                        if (!A07.equals(this.A0C)) {
                            this.A0C = A07;
                            this.A0A = 1024000000 / A07.A0C;
                            this.A0D.A5X(A07);
                        }
                    } else {
                        c0482Hb.A08(((int) A02(c0482Hb)) - A00(c0482Hb));
                    }
                    A07(c0482Hb);
                    this.A0F = c0482Hb.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (A04 == 1) {
                            this.A09 = A02(c0482Hb);
                        } else {
                            do {
                                A0F = c0482Hb.A0F();
                                this.A09 = (this.A09 << 8) + c0482Hb.A04(8);
                            } while (A0F);
                        }
                    }
                    if (c0482Hb.A0F()) {
                        c0482Hb.A08(8);
                        return;
                    }
                    return;
                }
                throw new C9Y();
            }
            throw new C9Y();
        }
        throw new C9Y();
    }

    private void A09(C0482Hb c0482Hb, int i) {
        int A03 = c0482Hb.A03();
        int bitPosition = A03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = A03 >> 3;
            this.A0I.A0Y(bitPosition2);
        } else {
            int bitPosition3 = i * 8;
            c0482Hb.A0D(this.A0I.A00, 0, bitPosition3);
            C0483Hc c0483Hc = this.A0I;
            String[] strArr = A0L;
            String str = strArr[6];
            String str2 = strArr[4];
            int charAt = str.charAt(4);
            int bitPosition4 = str2.charAt(4);
            if (charAt != bitPosition4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[6] = "hISKdmFcBvkt3UkKbTRUxOfzbLN5RWYH";
            strArr2[4] = "PVNedBTwWz01jOulB5OdqyWGI6cUIeHW";
            c0483Hc.A0Y(0);
        }
        this.A0D.AEX(this.A0I, i);
        this.A0D.AEY(this.A0B, 1, i, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4B(C0483Hc c0483Hc) throws C9Y {
        while (true) {
            int A04 = c0483Hc.A04();
            if (A0L[1].charAt(8) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[3] = "OUH24t4ef0Bd1TNZZrzghovIx2sIzWi9";
            strArr[7] = "WHKixNlsxExZUks5bFrxsUMqOnC83dmQ";
            if (A04 > 0) {
                int i = this.A08;
                if (i == 0) {
                    int secondByte = c0483Hc.A0E();
                    if (secondByte == 86) {
                        this.A08 = 1;
                    }
                } else if (i == 1) {
                    int A0E = c0483Hc.A0E();
                    if ((A0E & 224) == 224) {
                        this.A07 = A0E;
                        if (A0L[2].length() != 8) {
                            A0L[2] = "GS3bIWmA";
                            this.A08 = 2;
                        } else {
                            A0L[2] = "lkshyeX1";
                            this.A08 = 2;
                        }
                    } else if (A0E != 86) {
                        this.A08 = 0;
                    }
                } else if (i == 2) {
                    int bytesToRead = this.A07;
                    this.A06 = ((bytesToRead & (-225)) << 8) | c0483Hc.A0E();
                    if (this.A06 > this.A0I.A00.length) {
                        int i2 = this.A06;
                        if (A0L[2].length() != 8) {
                            throw new RuntimeException();
                        }
                        A0L[2] = "GLemk9OP";
                        A05(i2);
                    }
                    this.A01 = 0;
                    this.A08 = 3;
                } else if (i == 3) {
                    int min = Math.min(c0483Hc.A04(), this.A06 - this.A01);
                    byte[] bArr = this.A0H.A00;
                    int bytesToRead2 = this.A01;
                    c0483Hc.A0c(bArr, bytesToRead2, min);
                    int bytesToRead3 = this.A01;
                    this.A01 = bytesToRead3 + min;
                    int i3 = this.A01;
                    int bytesToRead4 = this.A06;
                    if (i3 == bytesToRead4) {
                        this.A0H.A07(0);
                        A06(this.A0H);
                        this.A08 = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void A4Y(BX bx, C0375Cp c0375Cp) {
        c0375Cp.A05();
        this.A0D = bx.AFc(c0375Cp.A03(), 1);
        this.A0E = c0375Cp.A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADM() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void ADN(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0364Cb
    public final void AEb() {
        this.A08 = 0;
        this.A0G = false;
    }
}
