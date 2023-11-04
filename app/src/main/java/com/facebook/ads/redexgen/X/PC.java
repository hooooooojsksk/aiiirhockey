package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PC implements View.OnTouchListener {
    public final /* synthetic */ RA A00;

    public PC(RA ra) {
        this.A00 = ra;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C8U c8u;
        c8u = this.A00.A0B;
        c8u.A02(new LJ(view, motionEvent));
        return false;
    }
}
