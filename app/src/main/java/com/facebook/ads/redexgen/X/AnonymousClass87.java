package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.87 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass87 extends AbstractC0753Ru {
    @Nullable
    public AbstractC0638Ni A00;
    public final ImageView A01;
    public final C5D A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public AnonymousClass87(C0887Xc c0887Xc, MC mc, InterfaceC0505Ia interfaceC0505Ia, AbstractC0952Zs abstractC0952Zs, C6M c6m, InterfaceC0587Lj interfaceC0587Lj) {
        super(c0887Xc, mc, interfaceC0505Ia, abstractC0952Zs, c6m, interfaceC0587Lj);
        this.A02 = new C0748Rp(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC0764Sf(this.A01, super.A03).A05(super.A01.A0h().A0D().A00(), super.A01.A0h().A0D().A01()).A06(new C0747Ro(this)).A07(super.A01.A0h().A0D().A07());
    }

    private AbstractC0638Ni A01(int i) {
        if (this.A01.getParent() != null) {
            LL.A0J(this.A01);
        }
        return C0639Nj.A00(new C0641Nl(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i).A0J(), null, true);
    }

    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i) {
        LL.A0J(this.A00);
        this.A00 = A01(i);
        C1L colors = this.A00.getColors();
        AbstractC0638Ni abstractC0638Ni = this.A00;
        boolean z = true;
        LL.A0M(this, colors.A07(abstractC0638Ni != null && (abstractC0638Ni.A0d() || (this.A00 instanceof SR))));
        this.A07.setFullscreen(this.A00.A0d());
        this.A07.A04(colors, View$OnClickListenerC0759Sa.A08(super.A01));
        addView(this.A00, 0, AbstractC0753Ru.A0D);
        AbstractC0638Ni abstractC0638Ni2 = this.A00;
        setUpFullscreenMode((abstractC0638Ni2 == null || !abstractC0638Ni2.A0d()) ? false : false);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru
    public final void A0Q() {
        LL.A0L(this.A00);
        LL.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0h().A0D().A03();
        if (A03 > 0) {
            AbstractC0638Ni abstractC0638Ni = this.A00;
            if (abstractC0638Ni != null) {
                abstractC0638Ni.A0b();
            }
            A0R(A03, new C0746Rn(this));
            return;
        }
        this.A05.set(true);
        AbstractC0586Li abstractC0586Li = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC0586Li.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru
    public final void A0S(C5F c5f) {
        c5f.A0K(this.A02);
        int orientation = c5f.A0H().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        LL.A0H(this.A00);
        LL.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru
    public final boolean A0T() {
        AbstractC0638Ni abstractC0638Ni = this.A00;
        return abstractC0638Ni != null && abstractC0638Ni.A0e(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
    }

    public int getCloseButtonStyle() {
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null) {
            return abstractC0638Ni.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0h().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        if (IK.A1Q(super.A03)) {
            super.A03.A0A().AFe(this.A01);
        }
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null) {
            abstractC0638Ni.A0X();
        }
        super.onDestroy();
    }
}
