package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;

/* loaded from: assets/audience_network.dex */
public final class NS extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    @Nullable
    public AbstractC0586Li A00;
    public final AbstractC0952Zs A01;
    public final C0887Xc A02;
    public final InterfaceC0587Lj A03;
    public final NR A04;
    @Nullable
    public final RA A05;
    public final View[] A06;

    public NS(C0642Nm c0642Nm, AbstractC0952Zs abstractC0952Zs, @Nullable RA ra, JW jw, ND nd, InterfaceC0587Lj interfaceC0587Lj, NR nr) {
        this(c0642Nm, abstractC0952Zs, ra, interfaceC0587Lj, nr, jw, nd);
    }

    public NS(C0642Nm c0642Nm, AbstractC0952Zs abstractC0952Zs, @Nullable RA ra, InterfaceC0587Lj interfaceC0587Lj, NR nr, View... viewArr) {
        this(c0642Nm.A05(), c0642Nm.A08(), abstractC0952Zs, ra, interfaceC0587Lj, nr, viewArr);
    }

    public NS(C0887Xc c0887Xc, @Nullable AbstractC0586Li abstractC0586Li, AbstractC0952Zs abstractC0952Zs, @Nullable RA ra, InterfaceC0587Lj interfaceC0587Lj, NR nr, View... viewArr) {
        super(c0887Xc);
        this.A02 = c0887Xc;
        this.A00 = abstractC0586Li;
        this.A01 = abstractC0952Zs;
        this.A06 = viewArr;
        this.A03 = interfaceC0587Lj;
        this.A05 = ra;
        this.A04 = nr;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0F = this.A01.A0F();
        if (A0F == null) {
            title = this.A01.A0j().A05();
        } else {
            title = this.A01.A0j().A06(A0F.getCurrency(), A0F.getQuantity());
        }
        C0597Lt c0597Lt = new C0597Lt(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A0j().A04(), this.A01.A0j().A03(), LU.A01(LT.REWARD_ICON));
        c0597Lt.A02.setOnClickListener(new NP(this));
        c0597Lt.A01.setOnClickListener(new NQ(this));
        addView(c0597Lt, new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A04() {
        RA ra = this.A05;
        if (ra != null) {
            ra.A0a(PF.A07);
        }
        this.A04.AA9();
        if (!this.A01.A0h().A0O()) {
            this.A01.A0p(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        View[] viewArr;
        RA ra = this.A05;
        if (ra != null && !ra.A0j()) {
            this.A05.A0f(false, false, 11);
            LL.A0N(this.A05, 4);
        }
        AbstractC0586Li abstractC0586Li = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0586Li != null) {
            LL.A0H(abstractC0586Li);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            LL.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.ABd();
    }
}
