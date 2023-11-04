package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Yu */
/* loaded from: assets/audience_network.dex */
public class C0929Yu extends C01432r {
    @Override // com.facebook.ads.redexgen.X.C01432r
    public final View.AccessibilityDelegate A00(final C01442s c01442s) {
        return new View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.2p
            public static String[] A02 = {"5TXwkxGOky4JO26BdMoLZorZ75Qh7TJ1", "TGpCIVKfg9q9VkptB3w2PfFUtUXuMPxH", "XWnogg3sW", "LoblWG2nky8IldTW7marNA4rqywTihhk", "", "za5KD6H2U", "Ka0OyPk3mlOgfUpq6xId3QQILfS23GTN", "DN7QTk2L5QCC7wBdOwuQ1Nom6iZb"};

            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c01442s.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                C01573f provider = c01442s.A01(view);
                if (provider != null) {
                    Object A022 = provider.A02();
                    String[] strArr = A02;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A02[1] = "uCvPJ7NUfrK1Xmg35VTgFJzpSrozRbu2";
                        return (AccessibilityNodeProvider) A022;
                    }
                    throw new RuntimeException();
                }
                return null;
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c01442s.A07(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                c01442s.A08(view, C01553d.A01(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c01442s.A03(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return c01442s.A06(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return c01442s.A09(view, i, bundle);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(View view, int i) {
                c01442s.A02(view, i);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                c01442s.A04(view, accessibilityEvent);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.C01432r
    public final C01573f A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C01573f(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C01432r
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
