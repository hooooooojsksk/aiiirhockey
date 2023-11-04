package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mg */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0610Mg implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            i = C0616Mm.A0D;
            LL.A0M(view, i);
        } else if (action == 1) {
            LL.A0M(view, 0);
        }
        return false;
    }
}
