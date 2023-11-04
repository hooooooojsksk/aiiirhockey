package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oo */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0669Oo implements View.OnClickListener {
    public final /* synthetic */ C0670Op A00;

    public View$OnClickListenerC0669Oo(C0670Op c0670Op) {
        this.A00 = c0670Op;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6G c6g;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            c6g = this.A00.A05;
            c6g.performClick();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
