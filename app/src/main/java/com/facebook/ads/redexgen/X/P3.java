package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class P3 {
    @Nullable
    public View$OnClickListenerC0759Sa A00;
    public final AnonymousClass18 A01;
    public final C1J A02;
    public final C1N A03;
    public final C1V A04;
    public final C0887Xc A05;
    public final C0513Ii A06;
    public static String[] A07 = {"67PC1vS7qkP", "IjFo3BG6VwtzNtFBLMxB3hm7uxcMitzp", "CicRHWg02u8tYTVNboa", "Lc1HqPOOGgkkm0o4iF185HVfJQb2Oy4J", "rfUiy7qGv2cTTJD", "veTQu7RBhk0w6DuY7Y8JViB1PkIKs", "nFnk8VxBkehLa6QhTm5QccOE2IAl", "l0nPd7gOfqjUiTZVoVDHfvPfOU4VPF8e"};
    public static final int A0A = (int) (Kk.A02 * 4.0f);
    public static final int A08 = (int) (Kk.A02 * 72.0f);
    public static final int A09 = (int) (Kk.A02 * 8.0f);

    public P3(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, AbstractC0952Zs abstractC0952Zs) {
        this.A05 = c0887Xc;
        this.A06 = new C0513Ii(abstractC0952Zs.A0m(), interfaceC0505Ia);
        this.A01 = abstractC0952Zs.A0g();
        this.A02 = abstractC0952Zs.A0h().A0E();
        this.A04 = abstractC0952Zs.A0k();
        this.A03 = abstractC0952Zs.A0h().A0G();
    }

    private View A00() {
        E9 e9 = new E9(this.A05);
        e9.setLayoutManager(new C0915Ye(this.A05, 0, false));
        e9.setAdapter(new RL(this.A05, this.A03.A01(), A0A, this.A00));
        return e9;
    }

    private View A01(@Nullable View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa) {
        C0630Na c0630Na = new C0630Na(this.A05, this.A01.A01(), true, false, false);
        c0630Na.A03(this.A02.A06(), this.A02.A01(), null, false, true);
        c0630Na.setAlignment(17);
        NU nu = new NU(this.A05);
        LL.A0M(nu, 0);
        nu.setRadius(50);
        new AsyncTaskC0764Sf(nu, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i = A08;
        linearLayout.addView(nu, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A09;
        imageParams.setMargins(0, i2, 0, i2);
        linearLayout.addView(c0630Na, imageParams);
        if (view$OnClickListenerC0759Sa != null) {
            LL.A0J(view$OnClickListenerC0759Sa);
            linearLayout.addView(view$OnClickListenerC0759Sa, imageParams);
            if (TextUtils.isEmpty(view$OnClickListenerC0759Sa.getText())) {
                LL.A0H(view$OnClickListenerC0759Sa);
            }
        }
        return linearLayout;
    }

    private final P2 A02() {
        if (!this.A03.A01().isEmpty()) {
            return P2.A04;
        }
        P2 p2 = P2.A03;
        String[] strArr = A07;
        if (strArr[3].charAt(8) != strArr[7].charAt(8)) {
            A07[4] = "qwlEjiYhEcV8j1J";
            return p2;
        }
        throw new RuntimeException();
    }

    public final Pair<P2, View> A03(@Nullable View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa) {
        View A00;
        this.A00 = view$OnClickListenerC0759Sa;
        P2 A02 = A02();
        if (P1.A00[A02.ordinal()] != 1) {
            View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa2 = this.A00;
            if (A07[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[3] = "Oe6IO8Uak3tx5GvHWoKp5mKUb4E2rtDt";
            strArr[7] = "t7tx5cDm578ghKblxCWBuUm65hKnqcQl";
            A00 = A01(view$OnClickListenerC0759Sa2);
        } else {
            A00 = A00();
        }
        C0515Ik.A04(A00, this.A06, EnumC0512Ih.A0S);
        return new Pair<>(A02, A00);
    }
}
