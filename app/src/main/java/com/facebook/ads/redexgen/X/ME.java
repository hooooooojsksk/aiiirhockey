package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ME implements View.OnClickListener {
    public final /* synthetic */ MG A00;

    public ME(MG mg) {
        this.A00 = mg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MJ mj;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            mj = this.A00.A04;
            mj.A8z();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
