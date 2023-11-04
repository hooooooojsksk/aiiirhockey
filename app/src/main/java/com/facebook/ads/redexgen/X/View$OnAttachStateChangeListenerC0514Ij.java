package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ij */
/* loaded from: assets/audience_network.dex */
public class View$OnAttachStateChangeListenerC0514Ij implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0512Ih A00;
    public final /* synthetic */ C0513Ii A01;

    public View$OnAttachStateChangeListenerC0514Ij(C0513Ii c0513Ii, EnumC0512Ih enumC0512Ih) {
        this.A01 = c0513Ii;
        this.A00 = enumC0512Ih;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
