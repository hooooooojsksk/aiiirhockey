package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Op */
/* loaded from: assets/audience_network.dex */
public final class C0670Op extends FrameLayout {
    public static final int A08 = (int) (Kk.A02 * 16.0f);
    public AA A00;
    @Nullable
    public PB A01;
    @Nullable
    public AnonymousClass75 A02;
    public C0542Jn A03;
    public C02316g A04;
    public C6G A05;
    public final C0887Xc A06;
    public final C0513Ii A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(InterfaceC0505Ia interfaceC0505Ia, String str, Map<String, String> map) {
        A02();
        this.A02 = new AnonymousClass75(this.A06, interfaceC0505Ia, this.A00, str, map);
        if (IK.A1R(this.A06)) {
            this.A01 = new PB(this.A06, interfaceC0505Ia, this.A00, str, map);
        } else {
            this.A01 = null;
        }
    }

    public C0670Op(C0887Xc c0887Xc, C0513Ii c0513Ii) {
        super(c0887Xc);
        this.A07 = c0513Ii;
        this.A06 = c0887Xc;
        setUpView(c0887Xc);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        PB pb = this.A01;
        if (pb != null) {
            pb.A0A();
            this.A01 = null;
        }
        AnonymousClass75 anonymousClass75 = this.A02;
        if (anonymousClass75 != null) {
            anonymousClass75.A0g();
            this.A02 = null;
        }
    }

    public final void A03(C8V c8v) {
        this.A00.getEventBus().A05(c8v);
    }

    public final void A05(PK pk) {
        this.A00.A0b(pk, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public RA getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C0887Xc c0887Xc) {
        this.A00.A0X();
        this.A04 = new C02316g(c0887Xc);
        this.A00.A0c(this.A04);
        this.A03 = new C0542Jn(c0887Xc, this.A07);
        this.A00.A0c(new C02376o(c0887Xc));
        this.A00.A0c(this.A03);
        this.A05 = new C6G(c0887Xc, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new C0545Jq(this.A05, PX.A03, true, true));
        if (!this.A00.A0g() && !IK.A2A(c0887Xc)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C0887Xc c0887Xc) {
        this.A00 = new AA(c0887Xc);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LL.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new View$OnClickListenerC0669Oo(this));
    }

    private void setUpView(C0887Xc c0887Xc) {
        setUpVideo(c0887Xc);
        setUpPlugins(c0887Xc);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
