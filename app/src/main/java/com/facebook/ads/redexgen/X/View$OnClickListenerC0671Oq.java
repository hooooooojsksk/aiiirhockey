package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oq */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0671Oq implements View.OnClickListener {
    public final /* synthetic */ C0674Ot A00;

    public View$OnClickListenerC0671Oq(C0674Ot c0674Ot) {
        this.A00 = c0674Ot;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0673Os interfaceC0673Os;
        EnumC0672Or enumC0672Or;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            interfaceC0673Os = this.A00.A02;
            enumC0672Or = this.A00.A01;
            interfaceC0673Os.ACi(enumC0672Or);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
