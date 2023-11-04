package com.facebook.ads.redexgen.X;

import android.os.Build;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.2M */
/* loaded from: assets/audience_network.dex */
public class C2M extends E9 {
    public C2M(C0887Xc c0887Xc) {
        super(c0887Xc);
        setCarouselLayoutManager(c0887Xc);
    }

    @Nullable
    public C0735Rc getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof C0735Rc) {
            return (C0735Rc) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.E9
    public C0915Ye getLayoutManager() {
        return (C0915Ye) super.getLayoutManager();
    }

    public AbstractC01814e getOnScrollListener() {
        return new TG(this);
    }

    private void setCarouselLayoutManager(C0887Xc c0887Xc) {
        C0915Ye c0915Ye = new C0915Ye(c0887Xc, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c0915Ye.A1V(true);
        }
        super.setLayoutManager(c0915Ye);
    }

    @Override // com.facebook.ads.redexgen.X.E9
    public void setLayoutManager(C4Z c4z) {
    }
}
