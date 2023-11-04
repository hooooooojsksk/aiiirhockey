package com.facebook.ads.redexgen.X;

import android.view.View;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Zc */
/* loaded from: assets/audience_network.dex */
public class C0936Zc implements InterfaceC00960v {
    public static byte[] A02;
    public static String[] A03 = {"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    public final /* synthetic */ C0426Et A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, -94, airhockey.J_DISCONNECT, airhockey.J_ERROR, airhockey.J_GOO, -124, -93, -80, -80, -89, -76, airhockey.J_NATION, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, airhockey.J_NATION, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, ByteCompanionObject.MIN_VALUE, -115, airhockey.J_ENEMYWIN, -118, -126, -126, -124, -119, -126, airhockey.J_ONREWARDED, -120, -117, -115, ByteCompanionObject.MIN_VALUE, -114, -114, -124, -118, -119};
    }

    static {
        A01();
    }

    public C0936Zc(C0426Et c0426Et, Runnable runnable) {
        this.A00 = c0426Et;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00960v
    public final void AAO(C0970aA c0970aA) {
        C0402Dv c0402Dv;
        c0402Dv = this.A00.A01;
        c0402Dv.A0E().A3k();
        this.A00.A06.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00960v
    public final void AAP(C0970aA c0970aA, View view) {
        C0402Dv c0402Dv;
        c0402Dv = this.A00.A01;
        c0402Dv.A0E().A3j(c0970aA == ((AbstractC0934Za) this.A00).A00);
        if (c0970aA != ((AbstractC0934Za) this.A00).A00) {
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        InterfaceC00880n interfaceC00880n = ((AbstractC0934Za) this.A00).A01;
        C0426Et c0426Et = this.A00;
        ((AbstractC0934Za) c0426Et).A01 = c0970aA;
        c0426Et.A00 = view;
        if (!this.A00.A0C) {
            this.A00.A06.A0F(c0970aA);
            return;
        }
        this.A00.A06.A0E(view);
        this.A00.A0M(interfaceC00880n);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00960v
    public final void AAQ(C0970aA c0970aA) {
        C0402Dv c0402Dv;
        JO.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        c0402Dv = this.A00.A01;
        c0402Dv.A0E().A3m();
        this.A00.A06.A0D();
        this.A00.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00960v
    public final void ABP(C0970aA c0970aA, JA ja) {
        C0402Dv c0402Dv;
        c0402Dv = this.A00.A01;
        c0402Dv.A0E().A3l(c0970aA == ((AbstractC0934Za) this.A00).A00, ja.A03().getErrorCode());
        if (c0970aA != ((AbstractC0934Za) this.A00).A00) {
            return;
        }
        this.A00.A0E().removeCallbacks(this.A01);
        this.A00.A0M(c0970aA);
        this.A00.AAv(ja);
    }
}
