package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tz */
/* loaded from: assets/audience_network.dex */
public class C0809Tz extends AbstractC00890o {
    public static byte[] A01;
    public final /* synthetic */ C0799Tp A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public C0809Tz(C0799Tp c0799Tp) {
        this.A00 = c0799Tp;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0B(C0967a7 c0967a7) {
        this.A00.A1T(c0967a7);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0C() {
        InterfaceC0798To interfaceC0798To;
        InterfaceC0798To interfaceC0798To2;
        interfaceC0798To = this.A00.A0G;
        if (interfaceC0798To != null) {
            interfaceC0798To2 = this.A00.A0G;
            interfaceC0798To2.AA4();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0F(InterfaceC00880n interfaceC00880n) {
        C0424Er c0424Er;
        C0424Er c0424Er2;
        c0424Er = this.A00.A0A;
        if (c0424Er != null) {
            c0424Er2 = this.A00.A0A;
            c0424Er2.A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0G(JA ja) {
        long j;
        InterfaceC0798To interfaceC0798To;
        InterfaceC0798To interfaceC0798To2;
        C0R A0E = this.A00.A11().A0E();
        j = this.A00.A00;
        A0E.A2b(LC.A01(j), ja.A03().getErrorCode(), ja.A04());
        interfaceC0798To = this.A00.A0G;
        if (interfaceC0798To != null) {
            interfaceC0798To2 = this.A00.A0G;
            interfaceC0798To2.AAv(ja);
        }
    }
}
