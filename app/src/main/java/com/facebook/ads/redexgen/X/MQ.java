package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MQ implements View.OnClickListener {
    public final /* synthetic */ C0778St A00;

    public MQ(C0778St c0778St) {
        this.A00 = c0778St;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A86();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
