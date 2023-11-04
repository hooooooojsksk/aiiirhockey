package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.d0;
import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.renderers.m;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class InneractiveFullscreenVideoContentController extends e0 {
    @Override // com.fyber.inneractive.sdk.flow.v
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof d0;
    }

    public void setControlledRenderer(m mVar) {
        new WeakReference(mVar);
    }
}
