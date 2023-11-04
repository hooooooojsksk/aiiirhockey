package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: com.facebook.ads.redexgen.X.0a */
/* loaded from: assets/audience_network.dex */
public class C00760a extends C00790d {
    @Override // com.facebook.ads.redexgen.X.C3D
    public final C3V A08(View view, C3V c3v) {
        WindowInsets result = (WindowInsets) C3V.A01(c3v);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3V.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3D
    public final C3V A09(View view, C3V c3v) {
        WindowInsets result = (WindowInsets) C3V.A01(c3v);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C3V.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3D
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C3D
    public final void A0F(View view, final InterfaceC01502y interfaceC01502y) {
        if (interfaceC01502y == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3C
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C3V compatInsets = interfaceC01502y.AAC(view2, C3V.A00(windowInsets));
                    return (WindowInsets) C3V.A01(compatInsets);
                }
            });
        }
    }
}
