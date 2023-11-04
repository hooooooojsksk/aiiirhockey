package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M5 implements View.OnClickListener {
    public final /* synthetic */ C0783Sy A00;

    public M5(C0783Sy c0783Sy) {
        this.A00 = c0783Sy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        M7 m7;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            m7 = this.A00.A07;
            m7.AB1();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
