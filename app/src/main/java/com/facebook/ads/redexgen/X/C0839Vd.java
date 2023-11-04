package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vd */
/* loaded from: assets/audience_network.dex */
public final class C0839Vd implements InterfaceC0370Cj {
    public static byte[] A03;
    public InterfaceC0351Bh A00;
    public C0495Ho A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, 20, airhockey.P_GAME_MYSCORE, 22, airhockey.P_GAME_MYLOSE, 88, 79, 94, 8, 14};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Cj
    public final void A4B(C0483Hc c0483Hc) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5X(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c0483Hc.A04();
        this.A00.AEX(c0483Hc, A04);
        this.A00.AEY(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0370Cj
    public final void A8X(C0495Ho c0495Ho, BX bx, C0375Cp c0375Cp) {
        this.A01 = c0495Ho;
        c0375Cp.A05();
        this.A00 = bx.AFc(c0375Cp.A03(), 4);
        this.A00.A5X(Format.A0B(c0375Cp.A04(), A00(0, 20, 99), null, -1, null));
    }
}
