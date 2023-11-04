package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.0d */
/* loaded from: assets/audience_network.dex */
public class C00790d extends C01071g {
    @Override // com.facebook.ads.redexgen.X.EI, com.facebook.ads.redexgen.X.C3D
    public final void A0C(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.X.C3D
    public final boolean A0J(View view) {
        return view.isAttachedToWindow();
    }
}
