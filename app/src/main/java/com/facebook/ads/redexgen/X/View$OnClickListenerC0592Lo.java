package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Lo */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0592Lo implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC0592Lo(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0585Lh interfaceC0585Lh;
        M4 m4;
        InterfaceC0585Lh interfaceC0585Lh2;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            interfaceC0585Lh = this.A00.A01;
            if (interfaceC0585Lh != null) {
                m4 = this.A00.A06;
                if (m4.A04()) {
                    interfaceC0585Lh2 = this.A00.A01;
                    interfaceC0585Lh2.AAW();
                }
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
