package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mh */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0611Mh implements View.OnClickListener {
    public final /* synthetic */ C0616Mm A00;

    public View$OnClickListenerC0611Mh(C0616Mm c0616Mm) {
        this.A00 = c0616Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0615Ml interfaceC0615Ml;
        InterfaceC0615Ml interfaceC0615Ml2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            interfaceC0615Ml = this.A00.A04;
            if (interfaceC0615Ml == null) {
                return;
            }
            interfaceC0615Ml2 = this.A00.A04;
            interfaceC0615Ml2.AAW();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
