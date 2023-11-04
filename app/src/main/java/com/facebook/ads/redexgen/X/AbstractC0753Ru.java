package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ru */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0753Ru extends FrameLayout implements InterfaceC0588Lk {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC0952Zs A01;
    public final C6M A02;
    public final C0887Xc A03;
    public final InterfaceC0505Ia A04;
    public final C0513Ii A05;
    public final LD A06;
    public final AbstractC0586Li A07;
    public final InterfaceC0587Lj A08;
    public final MC A09;
    public final QA A0A;
    public final L8 A0B;
    @DoNotStrip
    public final Q9 A0C;

    public abstract void A0Q();

    public abstract void A0S(C5F c5f);

    public abstract boolean A0T();

    public AbstractC0753Ru(C0887Xc c0887Xc, MC mc, InterfaceC0505Ia interfaceC0505Ia, AbstractC0952Zs abstractC0952Zs, C6M c6m, InterfaceC0587Lj interfaceC0587Lj) {
        super(c0887Xc);
        this.A0C = new C0757Ry(this);
        this.A06 = new LD();
        this.A00 = false;
        this.A03 = c0887Xc;
        this.A09 = mc;
        this.A04 = interfaceC0505Ia;
        this.A01 = abstractC0952Zs;
        this.A02 = c6m;
        this.A08 = interfaceC0587Lj;
        this.A05 = new C0513Ii(this.A01.A0m(), this.A04);
        this.A0A = new QA(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0A());
        this.A0A.A0X(this.A01.A0B());
        this.A07 = A0N();
        this.A0B = new L8(this);
        this.A0B.A05(L7.A03);
    }

    private AbstractC0586Li A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0b());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A0h().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0k(), this.A01.A0m(), A03, this.A01.A0l());
        fullScreenAdToolbar.A04(this.A01.A0g().A01(), View$OnClickListenerC0759Sa.A08(this.A01));
        if (A03 < 0 && this.A01.A0h().A0M()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new C0754Rv(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0h().A0P()) {
            C0660Oe A0B = new C0658Oc(this.A03, this.A01.A0h().A0E(), this.A01.A0k()).A08(this.A01.A0g().A01()).A0B();
            C0515Ik.A04(A0B, this.A05, EnumC0512Ih.A0U);
            addView(A0B, A0D);
            A0B.A04(new C0755Rw(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i, K1 k1) {
        new C0558Ke(i, new C0756Rx(this, i, k1)).A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, @Nullable Bundle bundle, C5F c5f) {
        this.A08.A3J(this, A0D);
        A0S(c5f);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public String getCurrentClientToken() {
        return this.A01.A0m();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0m())) {
            this.A04.A99(this.A01.A0m(), new NA().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0587Lj interfaceC0587Lj) {
    }

    public void setUpFullscreenMode(boolean z) {
        L7 l7;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            l7 = L7.A04;
        } else {
            l7 = L7.A03;
        }
        this.A0B.A05(l7);
    }
}
