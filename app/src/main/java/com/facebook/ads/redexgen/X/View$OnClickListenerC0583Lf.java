package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Lf */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0583Lf implements View.OnClickListener {
    public final /* synthetic */ C1V A00;
    public final /* synthetic */ C0513Ii A01;
    public final /* synthetic */ C0584Lg A02;
    public final /* synthetic */ InterfaceC0587Lj A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC0583Lf(C0584Lg c0584Lg, C0513Ii c0513Ii, InterfaceC0587Lj interfaceC0587Lj, String str, C1V c1v) {
        this.A02 = c0584Lg;
        this.A01 = c0513Ii;
        this.A03 = interfaceC0587Lj;
        this.A04 = str;
        this.A00 = c1v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2D c2d;
        C0887Xc c0887Xc;
        C0887Xc c0887Xc2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.A04(EnumC0512Ih.A0A, null);
            c2d = this.A02.A02;
            c0887Xc = this.A02.A03;
            if (c2d.A0O(c0887Xc.A01(), true)) {
                this.A03.A8y(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                KS ks = new KS();
                c0887Xc2 = this.A02.A03;
                KS.A0E(ks, c0887Xc2, KT.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
