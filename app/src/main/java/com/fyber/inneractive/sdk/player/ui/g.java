package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.p0;
import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: classes.dex */
public class g implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public l0 a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, l0 l0Var, int i3, int i4, int i5, int i6) {
        if (l0Var == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(i3, i5) - com.fyber.inneractive.sdk.util.l.b(i6 * 2);
            l0Var.a = min;
            l0Var.b = min;
        } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int min2 = Math.min(i3, i5) - com.fyber.inneractive.sdk.util.l.b(i6 * 2);
            l0Var.a = min2;
            l0Var.b = (min2 * 9) / 16;
        } else if (unitDisplayType == UnitDisplayType.MRECT) {
            l0Var.a = com.fyber.inneractive.sdk.util.l.b((int) HttpStatus.SC_MULTIPLE_CHOICES);
            l0Var.b = com.fyber.inneractive.sdk.util.l.b(250);
        } else if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            p0.a(unitDisplayType, l0Var, i, i2, i3, i4);
        } else {
            l0Var.a = 0;
            l0Var.b = 0;
        }
        return l0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public l0 a(UnitDisplayType unitDisplayType, int i, int i2, l0 l0Var, int i3, ViewGroup viewGroup, ImageView imageView) {
        l0 l0Var2 = new l0(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            if (imageView != null) {
                imageView.getLayoutParams().width = l0Var.a;
                imageView.getLayoutParams().height = l0Var.a;
            }
            int i4 = l0Var.a;
            p0.a(unitDisplayType, l0Var2, i, i2, i4, i4);
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
