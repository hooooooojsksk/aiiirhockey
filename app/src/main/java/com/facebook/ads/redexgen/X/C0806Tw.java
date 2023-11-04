package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tw */
/* loaded from: assets/audience_network.dex */
public class C0806Tw implements C6E {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C0967a7 A00;
    public final /* synthetic */ C0799Tp A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 14, 25, 33, 24, 22, 25, 11, 14, -54, 11, -54, 23, 15, 14, 19, 11, -40};
    }

    static {
        A01();
    }

    public C0806Tw(C0799Tp c0799Tp, C0967a7 c0967a7, boolean z) {
        this.A01 = c0799Tp;
        this.A00 = c0967a7;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAT() {
        C0887Xc c0887Xc;
        long j;
        InterfaceC0798To interfaceC0798To;
        InterfaceC0798To interfaceC0798To2;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c0887Xc = this.A01.A0c;
        C0R A0E = c0887Xc.A0E();
        j = this.A01.A00;
        A0E.A2b(LC.A01(j), adErrorType.getErrorCode(), A00);
        interfaceC0798To = this.A01.A0G;
        if (interfaceC0798To != null) {
            C0799Tp c0799Tp = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            interfaceC0798To2 = c0799Tp.A0G;
            interfaceC0798To2.AAv(JA.A01(adErrorType, A00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAb() {
        InterfaceC0798To interfaceC0798To;
        EnumC0523Is enumC0523Is;
        C0887Xc c0887Xc;
        InterfaceC0798To interfaceC0798To2;
        C0887Xc c0887Xc2;
        boolean A0q;
        InterfaceC0798To interfaceC0798To3;
        C0424Er c0424Er;
        C0424Er c0424Er2;
        C0799Tp c0799Tp = this.A01;
        c0799Tp.A0a = this.A00;
        if (this.A02) {
            c0424Er = c0799Tp.A0A;
            if (c0424Er != null) {
                c0424Er2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                c0424Er2.A0H();
            }
        }
        interfaceC0798To = this.A01.A0G;
        if (interfaceC0798To != null) {
            enumC0523Is = this.A01.A0E;
            if (enumC0523Is.equals(EnumC0523Is.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    interfaceC0798To3 = this.A01.A0G;
                    interfaceC0798To3.ABg();
                }
            }
            if (this.A02) {
                c0887Xc = this.A01.A0c;
                if (!IK.A1K(c0887Xc) || this.A01.A0z() == null || !this.A01.A0z().A0a()) {
                    interfaceC0798To2 = this.A01.A0G;
                    interfaceC0798To2.AA8();
                    return;
                }
                C0799Tp c0799Tp2 = this.A01;
                c0887Xc2 = c0799Tp2.A0c;
                c0799Tp2.A0M = ON.A01(c0887Xc2, this.A01.A0z(), 4, new C0807Tx(this));
            }
        }
    }
}
