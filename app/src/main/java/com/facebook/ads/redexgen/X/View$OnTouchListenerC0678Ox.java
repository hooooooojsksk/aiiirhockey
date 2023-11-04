package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ox */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0678Ox implements View.OnTouchListener {
    public final /* synthetic */ C0679Oy A00;

    public View$OnTouchListenerC0678Ox(C0679Oy c0679Oy) {
        this.A00 = c0679Oy;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC0505Ia interfaceC0505Ia;
        AbstractC0952Zs abstractC0952Zs;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C0679Oy.A00(this.A00);
            interfaceC0505Ia = this.A00.A06;
            abstractC0952Zs = this.A00.A03;
            interfaceC0505Ia.A9N(abstractC0952Zs.A0m(), new NA().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
