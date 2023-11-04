package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class YZ implements InterfaceC01733w {
    public static byte[] A01;
    public static String[] A02 = {"m0v39bkLL0n2S0xNgN89hz2dGOcTpwho", "Je1TSnUfgjz87J45b10M9zAxXIUpZahJ", "5NPz60Ycb2xlrnlJbjQuqitLPDDjbzHA", "GN4TkK3T6zCNiBjoupvxTPY", "uEyRXI1LEgEguUOEBvXDLSZ", "uM6injuc1j2LJ4wHPsuMaMxVec9yzmkB", "WB5Y9xOLXhFok7BjZ8qu5ygjzkxXvdjS", "QTx8NC78KyDJtqbkFzNokRxLjqTFyIiz"};
    public final /* synthetic */ E9 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-39, -9, 2, 2, -5, -6, -74, -9, 10, 10, -9, -7, -2, -74, 5, 4, -74, -9, -74, -7, -2, -1, 2, -6, -74, 13, -2, -1, -7, -2, -74, -1, 9, -74, 4, 5, 10, -74, -6, -5, 10, -9, -7, -2, -5, -6, -48, -74, -75, -77, -66, -66, -73, -74, airhockey.J_SAVEDGAME_RELOAD, -74, -73, -58, -77, -75, -70, airhockey.J_SAVEDGAME_RELOAD, -63, -64, airhockey.J_SAVEDGAME_RELOAD, -77, -64, airhockey.J_SAVEDGAME_RELOAD, -77, -66, -60, -73, -77, -74, -53, airhockey.J_SAVEDGAME_RELOAD, -74, -73, -58, -77, -75, -70, -73, -74, airhockey.J_SAVEDGAME_RELOAD, -75, -70, -69, -66, -74, airhockey.J_SAVEDGAME_RELOAD};
    }

    static {
        A01();
    }

    public YZ(E9 e9) {
        this.A00 = e9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void A3U(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F != null) {
            if (A0F.A0e() || A0F.A0h()) {
                A0F.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 113) + A0F + this.A00.A1I());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void A4p(int i) {
        AbstractC01934r A0F;
        View view = A65(i);
        if (view != null && (A0F = E9.A0F(view)) != null) {
            if (!A0F.A0e() || A0F.A0h()) {
                A0F.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 45) + A0F + this.A00.A1I());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final View A65(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final int A66() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final AbstractC01934r A69(View view) {
        return E9.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final int A8U(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void AAu(View view) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F != null) {
            A0F.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void ABQ(View view) {
        AbstractC01934r A0F = E9.A0F(view);
        if (A0F != null) {
            A0F.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void AEC() {
        int A66 = A66();
        for (int i = 0; i < A66; i++) {
            View A65 = A65(i);
            this.A00.A1j(A65);
            A65.clearAnimation();
        }
        this.A00.removeAllViews();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int count = str2.length();
        if (length != count) {
            throw new RuntimeException();
        }
        A02[2] = "YVtNrV2twtC96zFGqk3M5li58NeZhLji";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void AEG(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1j(childAt);
            childAt.clearAnimation();
        }
        E9 e9 = this.A00;
        if (A02[2].charAt(25) == 'R') {
            throw new RuntimeException();
        }
        A02[2] = "BurwQQkBxJzMJJK1acCycPqXpvrCcXzS";
        e9.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01733w
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1i(view);
    }
}
