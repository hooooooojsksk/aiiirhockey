package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nf */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0635Nf implements View.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC0759Sa A00;
    public final /* synthetic */ String A01;

    public View$OnClickListenerC0635Nf(View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa, String str) {
        this.A00 = view$OnClickListenerC0759Sa;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
