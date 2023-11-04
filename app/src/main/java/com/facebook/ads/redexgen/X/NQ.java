package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NQ implements View.OnClickListener {
    public final /* synthetic */ NS A00;

    public NQ(NS ns) {
        this.A00 = ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
