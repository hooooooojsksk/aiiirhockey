package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.3l */
/* loaded from: assets/audience_network.dex */
public final class C01623l {
    public static Object A00(final InterfaceC01613k interfaceC01613k) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3j
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC01613k.this.A4G(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC01613k.this.A5Q(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) InterfaceC01613k.this.A5R(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC01613k.this.ADR(i, i2, bundle);
            }
        };
    }
}
