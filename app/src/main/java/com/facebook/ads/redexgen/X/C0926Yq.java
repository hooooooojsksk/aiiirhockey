package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yq */
/* loaded from: assets/audience_network.dex */
public class C0926Yq implements InterfaceC01502y {
    public final Rect A00 = new Rect();
    public final /* synthetic */ C3S A01;

    public C0926Yq(C3S c3s) {
        this.A01 = c3s;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01502y
    public final C3V AAC(View view, C3V c3v) {
        C3V A06 = C3E.A06(view, c3v);
        if (A06.A07()) {
            return A06;
        }
        Rect rect = this.A00;
        rect.left = A06.A03();
        rect.top = A06.A05();
        rect.right = A06.A04();
        rect.bottom = A06.A02();
        int i = this.A01.getChildCount();
        for (int count = 0; count < i; count++) {
            C3V A05 = C3E.A05(this.A01.getChildAt(count), A06);
            rect.left = Math.min(A05.A03(), rect.left);
            rect.top = Math.min(A05.A05(), rect.top);
            rect.right = Math.min(A05.A04(), rect.right);
            rect.bottom = Math.min(A05.A02(), rect.bottom);
        }
        int count2 = rect.left;
        C3V applied = A06.A06(count2, rect.top, rect.right, rect.bottom);
        return applied;
    }
}
