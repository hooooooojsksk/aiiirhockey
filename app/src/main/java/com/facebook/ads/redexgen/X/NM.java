package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public class NM extends Button {
    public static final int A0A = (int) (Kk.A02 * 16.0f);
    public static final int A0B = (int) (Kk.A02 * 4.0f);
    public int A00;
    public int A01;
    public C1L A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public NM(C0887Xc c0887Xc, C1L c1l) {
        super(c0887Xc);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new SZ(this);
        this.A09 = new SY(this);
        this.A02 = c1l;
        this.A07 = IK.A04(c0887Xc);
        this.A06 = IK.A00(c0887Xc);
        LL.A0X(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        C1L c1l = this.A02;
        if (c1l != null) {
            this.A00 = c1l.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        LL.A0O(this, this.A00, this.A04 ? A0B : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        if (IK.A20(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    public C1L getColorInfo() {
        return this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A03();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1L c1l) {
        this.A02 = c1l;
        A03();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A03();
    }
}
