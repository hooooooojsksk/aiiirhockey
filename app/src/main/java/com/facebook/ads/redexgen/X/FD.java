package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FD extends AbstractC0982aM {
    public static byte[] A02;
    public static String[] A03 = {"OXbCEMjwdPN5xvU2NT0kKgep5UeL1Sqr", "SX0ygsPxRN6KiRybC8JMsMv996SDI", "L77PzfY5dGd9ppcaJeqEYdg5mL", "qaE4mxmFDXDzve4pMTR5s0xQhV", "rrEUCxltihDw1phZ7LTyezPpJ6vgfWBl", "FdpTQfSalwXKw6iuOYHl49ZbqEAaQDuv", "IFg4N7XoM6S2Rxr", "IzcF2xeWDVSzXIhxKqlgaOjlVHZ1W1Z3"};
    public Map<String, String> A00;
    public final Uri A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {airhockey.J_ENEMYLOSE, 109, airhockey.J_GAME_EXIT, 111};
        if (A03[5].charAt(30) != 'u') {
            throw new RuntimeException();
        }
        A03[5] = "82m81CO1d0OwjHPL38rD7xdABiLQ6kup";
        A02 = bArr;
    }

    static {
        A01();
    }

    public FD(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, Uri uri, Map<String, String> mExtraData) {
        super(c0887Xc, interfaceC0505Ia, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0982aM
    public final void A0D() {
        A0E(this.A00, null);
    }

    public final Uri A0G() {
        return KT.A00(this.A01.getQueryParameter(A00(0, 4, 20)));
    }
}
