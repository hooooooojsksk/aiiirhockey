package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class FA extends AbstractC0769Sk {
    public static byte[] A02;
    public final /* synthetic */ C0970aA A00;
    public final /* synthetic */ C0960a0 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, airhockey.J_GAME_EXIT, -81, -62, -81, -83, -65, -66, -77, -72, -79, airhockey.J_GAME_EXIT, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    public FA(C0970aA c0970aA, C0960a0 c0960a0) {
        this.A00 = c0970aA;
        this.A01 = c0960a0;
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void AAF() {
        boolean z;
        this.A00.A0E = true;
        z = this.A00.A0F;
        if (!z) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0769Sk, com.facebook.ads.redexgen.X.N3
    public final void AAV(String str, Map<String, String> extraData) {
        C0402Dv c0402Dv;
        C0402Dv c0402Dv2;
        InterfaceC0505Ia interfaceC0505Ia;
        String str2;
        C0402Dv c0402Dv3;
        InterfaceC00960v interfaceC00960v;
        InterfaceC00960v interfaceC00960v2;
        c0402Dv = this.A00.A03;
        c0402Dv.A0E().A3Z();
        Uri A00 = KT.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C00820g.A04(A00.getAuthority())) {
            interfaceC00960v = this.A00.A00;
            if (interfaceC00960v != null) {
                interfaceC00960v2 = this.A00.A00;
                interfaceC00960v2.AAO(this.A00);
            }
        }
        c0402Dv2 = this.A00.A03;
        interfaceC0505Ia = this.A00.A04;
        AbstractC00810f adAction = C00820g.A00(c0402Dv2, interfaceC0505Ia, this.A01.A6B(), A00, extraData);
        if (adAction == null) {
            return;
        }
        try {
            c0402Dv3 = this.A00.A03;
            c0402Dv3.A0E().A3W();
            adAction.A0C();
        } catch (Exception e) {
            str2 = C0970aA.A0I;
            Log.e(str2, A00(0, 22, 0), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0769Sk, com.facebook.ads.redexgen.X.N3
    public final void ABC() {
        C0402Dv c0402Dv;
        C0958Zy c0958Zy;
        C0958Zy c0958Zy2;
        C0958Zy c0958Zy3;
        c0402Dv = this.A00.A03;
        InterfaceC0989aT A0E = c0402Dv.A0E();
        c0958Zy = this.A00.A01;
        A0E.A3a(c0958Zy != null);
        c0958Zy2 = this.A00.A01;
        if (c0958Zy2 == null) {
            return;
        }
        c0958Zy3 = this.A00.A01;
        c0958Zy3.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0769Sk, com.facebook.ads.redexgen.X.N3
    public final void ABu() {
        C0402Dv c0402Dv;
        C0958Zy c0958Zy;
        c0402Dv = this.A00.A03;
        c0402Dv.A0E().A3c();
        c0958Zy = this.A00.A01;
        c0958Zy.A07();
    }

    @Override // com.facebook.ads.redexgen.X.N3
    public final void ADD() {
    }
}
