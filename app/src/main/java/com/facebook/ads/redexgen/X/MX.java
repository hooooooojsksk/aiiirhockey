package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MX implements View.OnClickListener {
    public final /* synthetic */ MZ A00;

    public MX(MZ mz) {
        this.A00 = mz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MJ mj;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            mj = this.A00.A02;
            mj.A86();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
