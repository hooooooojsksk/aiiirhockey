package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class S5 extends FrameLayout implements InterfaceC0588Lk {
    public String A00;
    public final InterfaceC0587Lj A01;
    public final OM A02;

    public S5(C0887Xc c0887Xc, InterfaceC0587Lj interfaceC0587Lj, OM om, String str) {
        super(c0887Xc);
        this.A02 = om;
        this.A01 = interfaceC0587Lj;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, @Nullable Bundle bundle, C5F c5f) {
        OM.A0B().incrementAndGet();
        this.A02.A0V();
        LL.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3J(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().AB6();
        }
        OM.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC0587Lj interfaceC0587Lj) {
    }
}
