package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3i */
/* loaded from: assets/audience_network.dex */
public final class C01603i {
    public static Object A00(final InterfaceC01593h interfaceC01593h) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3g
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC01593h.this.A4G(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC01593h.this.A5Q(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC01593h.this.ADR(i, i2, bundle);
            }
        };
    }
}
