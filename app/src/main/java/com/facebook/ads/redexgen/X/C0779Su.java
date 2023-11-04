package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Su */
/* loaded from: assets/audience_network.dex */
public final class C0779Su extends MH {
    public static final int A03 = (int) (Kk.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2D A01;
    public final C0887Xc A02;

    public C0779Su(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, C1V c1v, InterfaceC0588Lk interfaceC0588Lk, InterfaceC0587Lj interfaceC0587Lj) {
        super(c0887Xc, interfaceC0505Ia, str, c1v, interfaceC0588Lk, interfaceC0587Lj);
        this.A02 = c0887Xc;
        this.A01 = C2E.A00(c0887Xc.A01());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        LL.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new MM(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            LL.A0V(this, transitionSet);
            return;
        }
        LL.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0L() {
        C2H A0A = this.A01.A0A();
        MW mw = new MW(this.A02);
        mw.setInfo(LT.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        mw.setOnClickListener(new MN(this));
        C2H A0B = this.A01.A0B();
        MW mw2 = new MW(this.A02);
        mw2.setInfo(LT.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        mw2.setOnClickListener(new MO(this));
        MW mw3 = new MW(this.A02);
        mw3.setInfo(LT.AD_CHOICES_ICON, this.A01.A0M(), "");
        mw3.setOnClickListener(new MP(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        LL.A0M(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(mw, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(mw2, layoutParams);
        }
        linearLayout.addView(mw3, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0M() {
        LL.A0I(this);
        this.A00.removeAllViews();
        LL.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0N(C2H c2h, C2F c2f) {
        String A0E;
        int i;
        if (c2f == C2F.A04) {
            return;
        }
        boolean z = c2f == C2F.A05;
        MF mf = new MF(this.A02, this.A0B);
        if (z) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        MF A0E2 = mf.A0I(A0E).A0H(this.A01.A0D()).A0F(c2h.A04()).A0E(z ? LT.REPORT_AD : LT.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        MG adHiddenView = A0E2.A0D(i).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        LL.A0M(adHiddenView, -1);
        LL.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final void A0O(C2H c2h, C2F c2f) {
        String A0H;
        boolean z = c2f == C2F.A05;
        C0887Xc c0887Xc = this.A02;
        MJ mj = this.A0B;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        MZ mz = new MZ(c0887Xc, c2h, mj, A0H, z ? LT.REPORT_AD : LT.HIDE_AD);
        mz.setClickable(true);
        LL.A0M(mz, -1);
        int i = A03;
        mz.setPadding(i * 2, i, i * 2, i);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(mz, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.MH
    public final boolean A0P() {
        return false;
    }
}
