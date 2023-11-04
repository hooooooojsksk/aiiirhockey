package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ma */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0604Ma implements View.OnClickListener {
    public final /* synthetic */ C0777Ss A00;

    public View$OnClickListenerC0604Ma(C0777Ss c0777Ss) {
        this.A00 = c0777Ss;
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
