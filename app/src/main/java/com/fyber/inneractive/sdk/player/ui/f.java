package com.fyber.inneractive.sdk.player.ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.q;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class f extends TextureView {
    public WeakReference<l> a;

    public f(l lVar) {
        super(lVar.getContext());
        this.a = new WeakReference<>(lVar);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        l lVar = (l) q.a(this.a);
        if (lVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(lVar.C.a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(lVar.C.b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
