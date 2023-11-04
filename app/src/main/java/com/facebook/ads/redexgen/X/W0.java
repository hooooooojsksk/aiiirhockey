package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W0 implements BV {
    public static byte[] A03;
    public static final BY A04;
    public BX A00;
    public CR A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{airhockey.J_GAME_DISCONNECT, -121, -113, -110, -117, -118, airhockey.P_GAME_BREAKBALLCOUNT, -102, -107, airhockey.P_GAME_BREAKBALLCOUNT, -118, -117, -102, -117, -104, -109, -113, -108, -117, airhockey.P_GAME_BREAKBALLCOUNT, -120, -113, -102, -103, -102, -104, -117, -121, -109, airhockey.P_GAME_BREAKBALLCOUNT, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new W1();
    }

    public static C0483Hc A00(C0483Hc c0483Hc) {
        c0483Hc.A0Y(0);
        return c0483Hc;
    }

    private boolean A03(BW bw) throws IOException, InterruptedException {
        CN cn = new CN();
        if (cn.A03(bw, true) && (cn.A04 & 2) == 2) {
            int length = Math.min(cn.A00, 8);
            C0483Hc c0483Hc = new C0483Hc(length);
            bw.ADP(c0483Hc.A00, 0, length);
            if (W2.A04(A00(c0483Hc))) {
                this.A01 = new W2();
            } else if (C0856Vx.A06(A00(c0483Hc))) {
                this.A01 = new C0856Vx();
            } else if (!C0858Vz.A04(A00(c0483Hc))) {
                return false;
            } else {
                this.A01 = new C0858Vz();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A00 = bx;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(bw)) {
                bw.AES();
            } else {
                throw new C9Y(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            InterfaceC0351Bh AFc = this.A00.AFc(0, 1);
            this.A00.A5G();
            this.A01.A06(this.A00, AFc);
            this.A02 = true;
        }
        return this.A01.A02(bw, c0346Bc);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        CR cr = this.A01;
        if (cr != null) {
            cr.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        try {
            return A03(bw);
        } catch (C9Y unused) {
            return false;
        }
    }
}
