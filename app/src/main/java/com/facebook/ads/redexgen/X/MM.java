package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MM implements View.OnClickListener {
    public final /* synthetic */ C0779Su A00;

    public MM(C0779Su c0779Su) {
        this.A00 = c0779Su;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A46();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
