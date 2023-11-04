package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class XM implements InterfaceC0546Jr {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0546Jr
    public final void AEI(Throwable th, Object obj) {
        if (obj instanceof C7L) {
            C0887Xc adContext = ((C7L) obj).A5d();
            if (adContext != null) {
                adContext.A0I(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C0887Xc)) {
                return;
            }
            ((C0887Xc) context).A0I(th);
        }
    }
}
