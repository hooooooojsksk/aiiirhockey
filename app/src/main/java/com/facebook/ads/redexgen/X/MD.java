package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MD implements View.OnClickListener {
    public final /* synthetic */ MG A00;

    public MD(MG mg) {
        this.A00 = mg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        MJ mj;
        MJ mj2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                mj2 = this.A00.A04;
                mj2.A45();
                return;
            }
            mj = this.A00.A04;
            mj.A46();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
