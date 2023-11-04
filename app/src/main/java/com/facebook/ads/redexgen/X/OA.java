package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OA implements View.OnTouchListener {
    public final /* synthetic */ C02918w A00;

    public OA(C02918w c02918w) {
        this.A00 = c02918w;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OE oe;
        oe = this.A00.A0E;
        oe.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
