package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CN {
    public static byte[] A0B;
    public static final int A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C0483Hc A0A = new C0483Hc(255);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{airhockey.J_PURCHASE, -110, -110, 126, -85, -66, -74, -85, -87, -70, -85, -86, 102, -107, -83, -83, -103, 102, -87, -89, -74, -70, -69, -72, -85, 102, -74, -89, -70, -70, -85, -72, -76, 102, -89, -70, 102, -88, -85, -83, -81, -76, 102, -75, -84, 102, -74, -89, -83, -85, -63, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, airhockey.J_GAME_DISCONNECT, -82, -75, -64, airhockey.J_GAME_DISCONNECT, -65, -64, -66, -79, -83, -71, airhockey.J_GAME_DISCONNECT, -66, -79, -62, -75, -65, -75, -69, -70};
    }

    static {
        A01();
        A0C = C0499Hs.A08(A00(0, 4, 33));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(BW bw, boolean z) throws IOException, InterruptedException {
        this.A0A.A0V();
        A02();
        boolean hasEnoughBytes = bw.A70() == -1 || bw.A70() - bw.A7K() >= 27;
        if (hasEnoughBytes) {
            boolean hasEnoughBytes2 = bw.ADQ(this.A0A.A00, 0, 27, true);
            if (hasEnoughBytes2) {
                if (this.A0A.A0M() != A0C) {
                    if (z) {
                        return false;
                    }
                    throw new C9Y(A00(4, 46, 60));
                }
                this.A03 = this.A0A.A0E();
                if (this.A03 != 0) {
                    if (z) {
                        return false;
                    }
                    throw new C9Y(A00(50, 31, 66));
                }
                this.A04 = this.A0A.A0E();
                this.A05 = this.A0A.A0J();
                this.A08 = this.A0A.A0K();
                this.A07 = this.A0A.A0K();
                this.A06 = this.A0A.A0K();
                this.A02 = this.A0A.A0E();
                this.A01 = this.A02 + 27;
                this.A0A.A0V();
                bw.ADP(this.A0A.A00, 0, this.A02);
                for (int i = 0; i < this.A02; i++) {
                    this.A09[i] = this.A0A.A0E();
                    int i2 = this.A00;
                    this.A00 = i2 + this.A09[i];
                }
                return true;
            }
        }
        if (z) {
            return false;
        }
        throw new EOFException();
    }
}
