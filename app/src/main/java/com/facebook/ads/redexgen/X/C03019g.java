package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9g */
/* loaded from: assets/audience_network.dex */
public final class C03019g extends C0736Rd {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public C03019g(C2M c2m, int i, @Nullable List<C0668On> list, @Nullable QA qa, @Nullable Bundle bundle) {
        super(c2m, i, list, qa, bundle);
        c2m.A1k(this);
        this.A03 = new C0774Sp(this);
    }

    public void A00() {
        int A27 = this.A0C.A27();
        if (this.A05 == null || A27 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A27 < curPos - 1) {
            int curPos2 = A27 + 1;
            A0V(curPos2);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        int firstVisibleItem = this.A0C.A27();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0W(visibleItem, lastVisibleItem, i);
    }

    @Override // com.facebook.ads.redexgen.X.C0736Rd, com.facebook.ads.redexgen.X.AbstractC01814e
    public final void A0L(E9 e9, int i) {
    }

    @Override // com.facebook.ads.redexgen.X.C0736Rd, com.facebook.ads.redexgen.X.AbstractC01814e
    public final void A0M(E9 e9, int i, int i2) {
        if (this.A0C.A27() != -1) {
            SF sf = (SF) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (sf != null && sf.A0k() && !sf.A0j()) {
                sf.A0h();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0736Rd
    public final void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.C0736Rd
    public final void A0a(SF sf, boolean z) {
        A0Y(sf, z);
        if (!z && sf.A0j()) {
            sf.A0g();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0736Rd
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final QA A0c() {
        return this.A04;
    }

    public final void A0d(QA qa) {
        this.A04 = qa;
    }

    public final void A0e(List<C0668On> list) {
        this.A05 = list;
    }
}
