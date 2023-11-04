package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.4a */
/* loaded from: assets/audience_network.dex */
public class C01774a extends ViewGroup.MarginLayoutParams {
    public AbstractC01934r A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C01774a(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C01774a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C01774a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C01774a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C01774a(C01774a c01774a) {
        super((ViewGroup.LayoutParams) c01774a);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0I();
    }

    public final boolean A01() {
        return this.A00.A0f();
    }

    public final boolean A02() {
        return this.A00.A0c();
    }

    public final boolean A03() {
        return this.A00.A0b();
    }
}
