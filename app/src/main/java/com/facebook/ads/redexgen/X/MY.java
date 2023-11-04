package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MY implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ ML A01;
    public final /* synthetic */ MZ A02;

    public MY(MZ mz, ML ml, C2H c2h) {
        this.A02 = mz;
        this.A01 = ml;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MJ mj;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            mj = this.A02.A02;
            mj.ABs(this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
