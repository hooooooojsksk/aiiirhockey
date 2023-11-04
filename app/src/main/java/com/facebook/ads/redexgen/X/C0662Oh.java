package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Oh */
/* loaded from: assets/audience_network.dex */
public final class C0662Oh {
    public final int[] A00(View view, int i, int i2) {
        C01774a c01774a = (C01774a) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c01774a.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), c01774a.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c01774a.leftMargin + c01774a.rightMargin, childWidthSpec3 + c01774a.bottomMargin + c01774a.topMargin};
    }
}
