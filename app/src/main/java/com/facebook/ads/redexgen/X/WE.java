package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WE extends AbstractC0360Bw {
    public static byte[] A03;
    public final long A00;
    public final List<WE> A01;
    public final List<WD> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{12, 79, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 88, 77, airhockey.P_GAME_STANDBY, airhockey.P_NATION, airhockey.P_GAME_REMATCH, 94, 95, 22, 12, 79, 3, 10, 14, 25, 10, 28, 85, 79};
    }

    public WE(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final WE A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            WE we = this.A01.get(i2);
            int childrenSize = ((AbstractC0360Bw) we).A00;
            if (childrenSize == i) {
                return we;
            }
        }
        return null;
    }

    public final WD A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            WD wd = this.A02.get(i2);
            int childrenSize = ((AbstractC0360Bw) wd).A00;
            if (childrenSize == i) {
                return wd;
            }
        }
        return null;
    }

    public final void A08(WE we) {
        this.A01.add(we);
    }

    public final void A09(WD wd) {
        this.A02.add(wd);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0360Bw
    public final String toString() {
        return AbstractC0360Bw.A02(super.A00) + A04(13, 9, 69) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 6) + Arrays.toString(this.A01.toArray());
    }
}
