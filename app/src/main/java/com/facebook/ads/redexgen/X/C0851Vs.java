package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vs */
/* loaded from: assets/audience_network.dex */
public final class C0851Vs implements BV {
    public static byte[] A04;
    public static String[] A05 = {"zdP8mq1V4qx9ZCdsfAD4NG7cLFVpQAAe", "koAkuIv", "fyRTvmHGGGsRl9BV6D3JToZwd0QymLEV", "Ol6FmQC", "pWzJ4KWOtVeOprDRKRooJjLfCIz1i7Yl", "FaGWZpOEFJ3DEiDU22ljd64Ld5pUV9HD", "txEKQBUTk3v9kOkzxdvVTnLo1IME9gDG", "VQ1knBpCfCAoSCLl3kVfN2N5wBdN5LBp"};
    public static final BY A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final Vr A02;
    public final C0483Hc A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[2].charAt(21) == strArr[4].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "6nR4pRT1Z5KTQHbqvhpghrBhlvQkSoKV";
            strArr2[5] = "SkXTa4uQceGhkSQtr6wVij7rDC15CMq5";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{airhockey.P_NATION, 79, 56};
    }

    static {
        A01();
        A06 = new C0852Vt();
        A07 = C0499Hs.A08(A00(0, 3, 72));
    }

    public C0851Vs() {
        this(0L);
    }

    public C0851Vs(long j) {
        this.A01 = j;
        this.A02 = new Vr(true);
        this.A03 = new C0483Hc(200);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A02.A4Y(bx, new C0375Cp(0, 1));
        bx.A5G();
        bx.AEd(new WU(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        int read = bw.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.ADN(this.A01, true);
            this.A00 = true;
        }
        this.A02.A4B(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A00 = false;
        this.A02.AEb();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        C0483Hc c0483Hc = new C0483Hc(10);
        C0482Hb c0482Hb = new C0482Hb(c0483Hc.A00);
        int startPosition = 0;
        while (true) {
            bw.ADP(c0483Hc.A00, 0, 10);
            c0483Hc.A0Y(0);
            if (c0483Hc.A0G() != A07) {
                break;
            }
            c0483Hc.A0Z(3);
            int A0D = c0483Hc.A0D();
            startPosition += A0D + 10;
            bw.A3L(A0D);
        }
        bw.AES();
        bw.A3L(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i = 0;
        while (true) {
            bw.ADP(c0483Hc.A00, 0, 2);
            c0483Hc.A0Y(0);
            int headerPosition = 65526 & c0483Hc.A0I();
            if (headerPosition != 65520) {
                i = 0;
                validFramesCount = 0;
                bw.AES();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                bw.A3L(syncBytes);
            } else {
                i++;
                if (i >= 4 && validFramesCount > 188) {
                    return true;
                }
                bw.ADP(c0483Hc.A00, 0, 4);
                c0482Hb.A07(14);
                int headerPosition3 = c0482Hb.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                bw.A3L(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}
