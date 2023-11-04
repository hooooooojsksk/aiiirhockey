package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.p0;

/* loaded from: classes.dex */
public class e implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public l0 a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, l0 l0Var, int i3, int i4, int i5, int i6) {
        if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            p0.a(unitDisplayType, l0Var, i, i2, i3, i4);
        }
        l0Var.a = 0;
        l0Var.b = 0;
        return l0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public l0 a(UnitDisplayType unitDisplayType, int i, int i2, l0 l0Var, int i3, ViewGroup viewGroup, ImageView imageView) {
        l0 l0Var2 = new l0(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(l0Var.a, i3);
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                viewGroup.getLayoutParams().height = min;
            }
            if (imageView != null) {
                imageView.getLayoutParams().width = min;
                imageView.getLayoutParams().height = min;
            }
            p0.a(unitDisplayType, l0Var2, i, i2, min, min);
        } else {
            p0.a(unitDisplayType, l0Var2, i, i2, l0Var.a, l0Var.b);
            if (imageView != null) {
                imageView.getLayoutParams().width = l0Var2.a;
                imageView.getLayoutParams().height = l0Var2.b;
            }
        }
        return l0Var2;
    }
}
