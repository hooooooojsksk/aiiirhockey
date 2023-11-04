package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Xq */
/* loaded from: assets/audience_network.dex */
public final class C0901Xq implements InterfaceC02155n {
    public static byte[] A02;
    public static final String A03;
    public final InterfaceC02185q A00;
    public final C6M A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, airhockey.P_GAME_MYWIN, 78, 81, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 75, 80, airhockey.P_GAME_REMATCH, 2, 7, airhockey.P_GAME_BREAKBALLCOUNT, 2, airhockey.P_GAME_MYSCORE, 85, 85, airhockey.P_GAME_MYWIN, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, 15, 93, 35, airhockey.P_GAME_STANDBY, 56, 63, airhockey.P_NATION, 52, 55, 60, 65, 58, -13, 64, 52, airhockey.P_GAME_STANDBY, 62, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 13, -13, -8, airhockey.P_GAME_BREAKBALLCOUNT, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, 19, 12, 9, 12, 13, 21, 12};
    }

    static {
        A02();
        A03 = C0901Xq.class.getSimpleName();
    }

    public C0901Xq(InterfaceC02185q interfaceC02185q, C0886Xb c0886Xb) {
        this.A00 = interfaceC02185q;
        this.A00.A3E(new C0903Xs(this));
        this.A01 = new C6M(c0886Xb);
        A01();
    }

    public void A01() {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5l().size()));
        }
        for (InterfaceC02215t asset : this.A00.A5l()) {
            int i = C02175p.A00[asset.A7v().ordinal()];
            if (i == 1) {
                A04(asset.getUrl());
            } else if (i == 2) {
                A06(asset.getUrl());
            } else if (i == 3) {
                A05(asset.getUrl());
            }
        }
        this.A01.A0W(new C0902Xr(this), new C6F(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 122), str);
        }
        C6K c6k = new C6K(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        c6k.A01 = A00(117, 8, 90);
        this.A01.A0b(c6k);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 99), str);
        }
        C6I c6i = new C6I(str, A00(81, 36, 11), A00(125, 7, 46));
        c6i.A04 = true;
        c6i.A02 = A00(117, 8, 90);
        this.A01.A0X(c6i);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 89), str);
        }
        C6I c6i = new C6I(str, A00(81, 36, 11), A00(125, 7, 46));
        c6i.A04 = false;
        c6i.A02 = A00(117, 8, 90);
        this.A01.A0a(c6i);
    }
}
