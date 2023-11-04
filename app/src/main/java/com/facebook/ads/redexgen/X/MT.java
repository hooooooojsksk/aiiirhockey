package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MT implements View.OnClickListener {
    public final /* synthetic */ ML A00;
    public final /* synthetic */ C0778St A01;

    public MT(C0778St c0778St, ML ml) {
        this.A01 = c0778St;
        this.A00 = ml;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A90();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
