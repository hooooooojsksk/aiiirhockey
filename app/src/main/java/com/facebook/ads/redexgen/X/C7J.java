package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7J */
/* loaded from: assets/audience_network.dex */
public final class C7J extends AbstractC0753Ru {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    @Nullable
    public AbstractC0638Ni A00;
    public P5 A01;
    @Nullable
    public PK A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C5D A09;
    public final PB A0A;
    public final RA A0B;
    public final AnonymousClass75 A0C;
    public final PO A0D;
    public final AbstractC0664Oj A0E;
    public final NY A0F;
    public final AbstractC0623Mt A0G;
    public final M9 A0H;
    public final M8 A0I;
    public final C0542Jn A0J;
    public final JW A0K;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C7J(C0887Xc c0887Xc, MC mc, InterfaceC0505Ia interfaceC0505Ia, AbstractC0952Zs abstractC0952Zs, C6M c6m, InterfaceC0587Lj interfaceC0587Lj) {
        super(c0887Xc, mc, interfaceC0505Ia, abstractC0952Zs, c6m, interfaceC0587Lj);
        this.A09 = new C0742Rj(this);
        this.A0H = new M9() { // from class: com.facebook.ads.redexgen.X.86
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(MK mk) {
                C7J.this.A07 = true;
            }
        };
        this.A0G = new AbstractC0623Mt() { // from class: com.facebook.ads.redexgen.X.85
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(NC nc) {
                C7J.this.A08 = true;
                C7J.this.A0P();
            }
        };
        this.A0F = new NY() { // from class: com.facebook.ads.redexgen.X.84
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C02466z c02466z) {
            }
        };
        this.A0I = new M8() { // from class: com.facebook.ads.redexgen.X.83
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C02456y c02456y) {
                AbstractC0638Ni abstractC0638Ni;
                C7J.this.A0F(c02456y);
                C7J.this.A0E(c02456y);
                abstractC0638Ni = C7J.this.A00;
                abstractC0638Ni.A0C(c02456y);
            }
        };
        this.A0D = new PO() { // from class: com.facebook.ads.redexgen.X.7v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(AnonymousClass72 anonymousClass72) {
                RA ra;
                C7J c7j = C7J.this;
                ra = c7j.A0B;
                c7j.A0D(anonymousClass72, ra.getState() != Q7.A06, false);
            }
        };
        this.A0E = new C02587o(this);
        boolean z = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A0B = new RA(super.A03);
        this.A0B.setFunnelLoggingHandler(super.A05);
        this.A0B.getEventBus().A03(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
        this.A0C = new AnonymousClass75(super.A03, super.A04, this.A0B, super.A01.A0m());
        if (IK.A1R(super.A03)) {
            this.A0A = new PB(super.A03, super.A04, this.A0B, super.A01.A0m(), null);
        } else {
            this.A0A = null;
        }
        this.A01 = new P5(super.A03, super.A09, super.A01.A0M(), interfaceC0587Lj);
        this.A0J = new C0542Jn(super.A03, super.A05);
        this.A0K = new JW(super.A03);
        A07();
        this.A0B.setVideoURI(super.A02.A0S(super.A01.A0h().A0D().A08()));
        A05();
        int A03 = super.A01.A0h().A0D().A03();
        if (IK.A1l(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0h().A0M() && super.A01.A0h().A0D().A02() > 0) {
            z = true;
        }
        this.A03 = z;
        LL.A0M(this, super.A01.A0g().A01().A07(true));
        if (IK.A1f(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private AbstractC0638Ni A00(int i) {
        return C0639Nj.A00(new C0641Nl(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i).A0F(this.A0J).A0I(this.A0K).A0J(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new C0741Ri(this), IK.A0J(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new C0740Rh(this), IK.A0K(super.A03));
    }

    private void A06() {
        this.A05 = true;
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null) {
            abstractC0638Ni.A0a();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0h().A0D().A07())) {
            C02316g c02316g = new C02316g(super.A03);
            this.A0B.A0c(c02316g);
            c02316g.setImage(super.A01.A0h().A0D().A07());
        }
        C6G c6g = new C6G(super.A03, true, super.A05);
        this.A0B.A0c(c6g);
        this.A0B.A0c(new C0545Jq(c6g, PX.A03, true));
        this.A0B.A0c(new C6X(super.A03));
    }

    public void A0D(AnonymousClass72 anonymousClass72, boolean z, boolean z2) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null) {
            abstractC0638Ni.A0B(anonymousClass72);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    public void A0E(C02456y c02456y) {
        if (this.A0B.getState() == Q7.A02 && IK.A18(super.A03)) {
            this.A0B.postDelayed(new C0743Rk(this, c02456y), 5000L);
        }
    }

    public void A0F(C02456y c02456y) {
        int A00 = c02456y.A00();
        if (this.A03) {
            int currentPosMs = A00 / 1000;
            int A02 = super.A01.A0h().A0D().A02() - currentPosMs;
            if (!View$OnClickListenerC0759Sa.A08(super.A01)) {
                if (A02 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A0l().A02().replace(A03(0, 6, 74), String.valueOf(A02)));
                } else {
                    super.A07.setToolbarActionMessage(A03(0, 0, 25));
                }
            }
            if (A02 <= 0) {
                String[] strArr = A0M;
                String str = strArr[2];
                String str2 = strArr[7];
                int totalSecondsForReward = str.length();
                int currentPosMs2 = str2.length();
                if (totalSecondsForReward == currentPosMs2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                A0H(false, false);
            }
        }
        int currentPosMs3 = super.A01.A0h().A0D().A03();
        int currentPosMs4 = this.A0B.getDuration();
        float seenPercentage = A00 / Math.min(currentPosMs3 * 1000.0f, currentPosMs4);
        super.A07.setProgress(100.0f * seenPercentage);
        int currentPosMs5 = (seenPercentage > 1.0f ? 1 : (seenPercentage == 1.0f ? 0 : -1));
        if (currentPosMs5 >= 0 && !this.A05) {
            A06();
            AbstractC0586Li abstractC0586Li = super.A07;
            int currentPosMs6 = getCloseButtonStyle();
            abstractC0586Li.setToolbarActionMode(currentPosMs6);
        }
    }

    public void A0G(String str) {
        int i = 0;
        int i2 = 0;
        RA ra = this.A0B;
        if (ra != null) {
            i = ra.getCurrentPositionInMillis();
            i2 = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0E().A2o(str);
        if (IK.A19(super.A03)) {
            A0D(new AnonymousClass72(i, i2), false, true);
            return;
        }
        InterfaceC0587Lj interfaceC0587Lj = super.A08;
        int duration = A0M[3].charAt(0);
        if (duration == 122) {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC0587Lj.A3t(super.A09.A6g());
        super.A08.A3t(super.A09.A6b());
    }

    private synchronized void A0H(boolean z, boolean z2) {
        if (this.A03 && !z && !z2) {
            super.A08.A3t(super.A09.A5c());
            this.A01.A05();
            this.A03 = false;
            if (this.A00 != null) {
                this.A00.A0Y();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru
    public final void A0Q() {
        LL.A0L(this.A00);
        LL.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0h().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(PK.A02, 20);
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null && this.A03) {
            abstractC0638Ni.A0Z();
        }
        AbstractC0638Ni abstractC0638Ni2 = this.A00;
        if (abstractC0638Ni2 != null && !this.A05) {
            abstractC0638Ni2.A0b();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru
    public final void A0S(C5F c5f) {
        c5f.A0K(this.A09);
        int orientation = c5f.A0H().getResources().getConfiguration().orientation;
        this.A00 = A00(orientation);
        addView(this.A00, AbstractC0753Ru.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        LL.A0H(this.A00);
        LL.A0H(super.A07);
        AbstractC0638Ni abstractC0638Ni = this.A00;
        setUpFullscreenMode(abstractC0638Ni != null && abstractC0638Ni.A0d());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru
    public final boolean A0T() {
        AbstractC0638Ni abstractC0638Ni = this.A00;
        return abstractC0638Ni != null && abstractC0638Ni.A0e(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == Q7.A06 || this.A02 == null) {
            return;
        }
        if (!this.A04 || z) {
            RA ra = this.A0B;
            PK pk = this.A02;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            ra.A0b(pk, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null) {
            return abstractC0638Ni.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0753Ru, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        super.onDestroy();
        if (IK.A1Q(super.A03)) {
            super.A03.A0A().AFe(this.A0B);
        }
        AbstractC0638Ni abstractC0638Ni = this.A00;
        if (abstractC0638Ni != null) {
            abstractC0638Ni.A0X();
        }
        RA ra = this.A0B;
        if (ra != null) {
            if (!this.A06) {
                ra.A0a(PF.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        PB pb = this.A0A;
        if (pb != null) {
            pb.A0A();
        }
        this.A0C.A0g();
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(P5 p5) {
        this.A01 = p5;
    }
}
