package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class PH extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    @Nullable
    public C02316g A00;
    public WeakReference<PG> A01;
    public final Q5 A02;

    public PH(C0887Xc c0887Xc, Q5 q5) {
        super(c0887Xc);
        this.A02 = q5;
        LL.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(PR pr) {
        addView(pr, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C02316g) pr;
    }

    public final void A01(PR pr) {
        LL.A0J(pr);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8J();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C02316g c02316g = this.A00;
        if (c02316g != null) {
            c02316g.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00e0, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00e2, code lost:
        if (r0 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e4, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e7, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00a4, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a6, code lost:
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00aa, code lost:
        if (r6 > r5) goto L16;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PH.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(PG pg) {
        this.A01 = new WeakReference<>(pg);
    }
}
