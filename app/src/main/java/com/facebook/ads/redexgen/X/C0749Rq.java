package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rq */
/* loaded from: assets/audience_network.dex */
public final class C0749Rq extends FrameLayout implements InterfaceC0588Lk {
    public static byte[] A0I;
    public static String[] A0J = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0K;
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public NL A03;
    @Nullable
    public C0633Nd A04;
    public P5 A05;
    public boolean A06;
    public boolean A07;
    public final C0950Zq A08;
    public final C5D A09;
    public final C6M A0A;
    public final C0887Xc A0B;
    public final InterfaceC0505Ia A0C;
    public final C0513Ii A0D;
    public final L8 A0E;
    public final InterfaceC0587Lj A0F;
    public final FullScreenAdToolbar A0G;
    public final MC A0H;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0I = new byte[]{airhockey.J_BACK, -64, -73, airhockey.J_BACK, -62, -27, -95};
        String[] strArr = A0J;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0E();
        A0K = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0749Rq(C0887Xc c0887Xc, MC mc, InterfaceC0505Ia interfaceC0505Ia, C0950Zq c0950Zq, C6M c6m, InterfaceC0587Lj interfaceC0587Lj) {
        super(c0887Xc);
        this.A07 = false;
        this.A06 = false;
        this.A02 = 1;
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = new C0752Rt(this);
        this.A0B = c0887Xc;
        this.A0H = mc;
        this.A0C = interfaceC0505Ia;
        this.A08 = c0950Zq;
        this.A0A = c6m;
        this.A0F = interfaceC0587Lj;
        this.A0D = new C0513Ii(this.A08.A0e(0).A0m(), this.A0C);
        this.A0E = new L8(this);
        this.A0E.A05(L7.A03);
        this.A05 = new P5(this.A0B, this.A0H, this.A08.A0M(), interfaceC0587Lj);
        this.A0G = A04();
        FullScreenAdToolbar fullScreenAdToolbar = this.A0G;
        addView(fullScreenAdToolbar, new FrameLayout.LayoutParams(-1, fullScreenAdToolbar.getToolbarHeight()));
    }

    public static /* synthetic */ int A00(C0749Rq c0749Rq, int i) {
        int i2 = c0749Rq.A00 + i;
        c0749Rq.A00 = i2;
        return i2;
    }

    private FullScreenAdToolbar A04() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0B, this.A0F, this.A0D, 2);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new C0750Rr(this));
        return fullScreenAdToolbar;
    }

    private C0633Nd A07(boolean z, int i) {
        return new C0633Nd(this.A0B, this.A0C, this.A08.A0e(this.A01), this.A0A, this.A0H, this.A0F, this.A0D, this.A08.A0D(), i, this.A08.A0b(), z, this.A08.A0d(), new C0751Rs(this, i));
    }

    public void A09() {
        this.A07 = true;
        A0G();
        this.A0F.A3t(this.A0H.A6b());
    }

    public void A0A() {
        if (!this.A07) {
            C0633Nd c0633Nd = this.A04;
            if (c0633Nd != null && c0633Nd.A0U() && this.A08.A0b() == 1) {
                A0O(false, this.A02);
                return;
            }
            return;
        }
        C0633Nd c0633Nd2 = this.A04;
        if (A0J[1].charAt(22) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[6] = "o7GgZi";
        strArr[0] = "3kZ0BgSrSMT6Nn9nBikWu4s9yN";
        if (c0633Nd2 != null && c0633Nd2.A0T()) {
            this.A0G.setToolbarActionMode(0);
            this.A04.A0Q();
        } else if (A0Q() && !A0R()) {
            A0B();
            String[] strArr2 = A0J;
            if (strArr2[7].length() != strArr2[5].length()) {
                return;
            }
            String[] strArr3 = A0J;
            strArr3[6] = "6NilYX";
            strArr3[0] = "SEFjrqARzTApviPZOzNzDnNgpv";
        } else {
            A09();
        }
    }

    private void A0B() {
        this.A06 = true;
        this.A03 = new NL(this.A0B, this.A08, this.A0C, this.A0F, this.A0G.getToolbarHeight(), this.A02);
        A0D();
        C0633Nd c0633Nd = this.A04;
        if (c0633Nd != null) {
            LL.A0J(c0633Nd);
            if (A0J[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[7] = "ZPnrdglx3i";
            strArr[5] = "Z92DtyKnO3";
            this.A04.A0P();
        }
        LL.A0J(this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A0C() {
        if (this.A0G == null) {
            return;
        }
        C0427Eu A0e = this.A08.A0e(this.A01);
        this.A0G.A07(this.A0B, A0e.A0b());
        this.A0G.A06(A0e.A0k(), A0e.A0m(), A0e.A0D());
        this.A0G.A04(A0e.A0g().A01(), true);
        FullScreenAdToolbar fullScreenAdToolbar = this.A0G;
        fullScreenAdToolbar.setToolbarActionMessage(A08(4, 3, 90) + (this.A01 + 1) + A08(0, 4, 42) + this.A08.A0c());
    }

    public void A0D() {
        if (!A0P()) {
            this.A0G.setToolbarActionMessage(A08(0, 0, 66));
            String[] strArr = A0J;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[6] = "66jeXp";
            strArr2[0] = "LGNwWFhV2djJuwlh4kKslTldzy";
            this.A0G.setToolbarActionMode(0);
            return;
        }
        this.A0G.setToolbarActionMode(1);
    }

    private final void A0F() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0E.A05(L7.A04);
    }

    private synchronized void A0G() {
        this.A0F.A3t(this.A0H.A5c());
        this.A05.A05();
    }

    private final void A0H(C5F c5f) {
        c5f.A0K(this.A09);
        A0O(this.A08.A0h(), c5f.A0H().getResources().getConfiguration().orientation);
        A0F();
    }

    public void A0N(C02456y c02456y) {
        float A00 = c02456y.A00();
        float unskippableSeconds = this.A08.A0D();
        float seenPercentage = (this.A00 + A00) / unskippableSeconds;
        float currentPosMs = 100.0f * seenPercentage;
        this.A0G.setProgress(currentPosMs);
        if (seenPercentage >= 1.0f && !this.A07) {
            this.A07 = true;
            this.A0G.setToolbarActionMode(1);
        }
    }

    public void A0O(boolean z, int i) {
        C0633Nd c0633Nd = this.A04;
        if (c0633Nd != null) {
            c0633Nd.removeAllViews();
            LL.A0J(this.A04);
        }
        if (!A0P()) {
            if (A0Q()) {
                A0B();
                return;
            }
            this.A07 = true;
            A09();
            return;
        }
        boolean isLoaded = this.A0B.A00().A8d(this.A08.A0e(this.A01).A0m(), this.A08.A0f());
        if (!isLoaded) {
            this.A0B.A0E().A40();
            A09();
            return;
        }
        this.A04 = A07(z, i);
        addView(this.A04, 0, A0K);
        A0C();
        this.A01++;
    }

    private boolean A0P() {
        return this.A01 < this.A08.A0c();
    }

    private boolean A0Q() {
        return this.A08.A0b() == 2;
    }

    private final boolean A0R() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, @Nullable Bundle bundle, C5F c5f) {
        this.A0F.A3J(this, A0K);
        A0H(c5f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
        C0633Nd c0633Nd = this.A04;
        if (c0633Nd != null) {
            c0633Nd.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
        C0633Nd c0633Nd = this.A04;
        if (c0633Nd != null) {
            c0633Nd.A0S(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
    }

    @Nullable
    @VisibleForTesting
    public C0633Nd getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        C0633Nd c0633Nd = this.A04;
        if (c0633Nd != null) {
            c0633Nd.onConfigurationChanged(configuration);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        C0633Nd c0633Nd = this.A04;
        if (c0633Nd != null) {
            c0633Nd.A0P();
        }
        this.A0B.A00().A41(this.A08.A0f());
        this.A0E.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0587Lj interfaceC0587Lj) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(P5 p5) {
        this.A05 = p5;
    }
}
