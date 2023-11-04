package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.Yp */
/* loaded from: assets/audience_network.dex */
public class C0925Yp extends C01442s {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C3S A00;

    public C0925Yp(C3S c3s) {
        this.A00 = c3s;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A05() > 1;
    }

    @Override // com.facebook.ads.redexgen.X.C01442s
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C3S.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A05());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C01442s
    public final void A08(View view, C01553d c01553d) {
        super.A08(view, c01553d);
        c01553d.A0O(C3S.class.getName());
        c01553d.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c01553d.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c01553d.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C01442s
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i == 8192 && this.A00.canScrollHorizontally(-1)) {
                C3S c3s = this.A00;
                c3s.setCurrentItem(c3s.A00 - 1);
                return true;
            }
            return false;
        }
        C3S c3s2 = this.A00;
        String[] strArr = A01;
        if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
        if (c3s2.canScrollHorizontally(1)) {
            C3S c3s3 = this.A00;
            c3s3.setCurrentItem(c3s3.A00 + 1);
            return true;
        }
        return false;
    }
}
