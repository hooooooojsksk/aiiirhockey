package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T1 implements InterfaceC0677Ow {
    public static byte[] A01;
    public final /* synthetic */ T0 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{29, 27, 13, 26, 11, 4, 1, 11, 3};
    }

    public T1(T0 t0) {
        this.A00 = t0;
    }

    public /* synthetic */ T1(T0 t0, T8 t8) {
        this(t0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0677Ow
    public final void AAd() {
        this.A00.A0X(true, A00(0, 9, 55));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0677Ow
    public final void ABC() {
        AbstractC0952Zs abstractC0952Zs;
        InterfaceC0587Lj interfaceC0587Lj;
        MC mc;
        InterfaceC0505Ia interfaceC0505Ia;
        AbstractC0952Zs abstractC0952Zs2;
        C0679Oy c0679Oy;
        C0679Oy c0679Oy2;
        AbstractC0952Zs abstractC0952Zs3;
        C0887Xc c0887Xc;
        abstractC0952Zs = this.A00.A0G;
        if (!TextUtils.isEmpty(abstractC0952Zs.A0m())) {
            interfaceC0505Ia = this.A00.A0K;
            abstractC0952Zs2 = this.A00.A0G;
            String A0m = abstractC0952Zs2.A0m();
            NA na = new NA();
            c0679Oy = this.A00.A07;
            NA A03 = na.A03(c0679Oy.getViewabilityChecker());
            c0679Oy2 = this.A00.A07;
            interfaceC0505Ia.A9H(A0m, A03.A02(c0679Oy2.getTouchDataRecorder()).A05());
            abstractC0952Zs3 = this.A00.A0G;
            AnonymousClass29.A00(abstractC0952Zs3.A0I());
            c0887Xc = this.A00.A0J;
            c0887Xc.A0E().A2Z();
        }
        interfaceC0587Lj = this.A00.A0O;
        mc = this.A00.A0P;
        interfaceC0587Lj.A3t(mc.A6t());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0677Ow
    public final void ABX() {
        InterfaceC0587Lj interfaceC0587Lj;
        MC mc;
        interfaceC0587Lj = this.A00.A0O;
        mc = this.A00.A0P;
        interfaceC0587Lj.A3t(mc.A6g());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0677Ow
    public final void ADD() {
        InterfaceC0587Lj interfaceC0587Lj;
        interfaceC0587Lj = this.A00.A0O;
        interfaceC0587Lj.AAR(15);
    }
}
