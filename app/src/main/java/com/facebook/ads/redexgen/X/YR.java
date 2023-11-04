package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network.dex */
public final class YR extends C01442s {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final C01442s A00 = new YS(this);
    public final E9 A01;

    public YR(E9 e9) {
        this.A01 = e9;
    }

    @Override // com.facebook.ads.redexgen.X.C01442s
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(E9.class.getName());
        if ((view instanceof E9) && !A0B()) {
            E9 e9 = (E9) view;
            if (e9.getLayoutManager() != null) {
                e9.getLayoutManager().A1x(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C01442s
    public final void A08(View view, C01553d c01553d) {
        super.A08(view, c01553d);
        c01553d.A0O(E9.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c01553d);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C01442s
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        } else if (!A0B() && this.A01.getLayoutManager() != null) {
            C4Z layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1Z(i, bundle);
        } else {
            return false;
        }
    }

    public final C01442s A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1u();
    }
}
