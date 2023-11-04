package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.aA */
/* loaded from: assets/audience_network.dex */
public final class C0970aA<NativeViewabilityLogger> implements InterfaceC00880n {
    public static byte[] A0G;
    public static String[] A0H = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0I;
    public InterfaceC00960v A00;
    public C0958Zy A01;
    @Nullable
    public F3 A02;
    public C0402Dv A03;
    @Nullable
    public InterfaceC0505Ia A04;
    @Nullable
    @DoNotStrip
    public N3 A06;
    @Nullable
    public C0766Sh A07;
    @Nullable
    public C02908v A08;
    @DoNotStrip
    public Q9 A09;
    @Nullable
    public QA A0A;
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public LD A05 = new LD();
    public Boolean A0B = false;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0G = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE};
    }

    static {
        A0A();
        A0I = C0970aA.class.getSimpleName();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A09() {
        F3 f3;
        if (this.A00 != null && this.A08 != null && (f3 = this.A02) != null && f3.A0a()) {
            this.A00.AAP(this, this.A08);
        }
        if (this.A00 != null && this.A0D) {
            boolean z = this.A0E;
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            A0H[2] = "DQYu3GBVfiN4Ml";
            if (z || !this.A0F) {
                this.A00.AAP(this, this.A07);
            }
        }
        this.A03.A0E().A3Y(this.A00 != null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0B(int i, C8B c8b) {
        C0973aD c0973aD = new C0973aD(this);
        this.A08 = new C02908v(this.A03, this.A04, c0973aD, this.A02, A08(0, 31, 110), 2, this.A05);
        this.A09 = new C0972aC(this);
        this.A0A = new QA(this.A08, c8b.A04(), c8b.A09(), true, new WeakReference(this.A09), this.A03);
        this.A0A.A0W(this.A02.A0A());
        this.A0A.A0X(this.A02.A0B());
        this.A08.setVisibility(0);
        this.A03.getResources();
        this.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A08.AFS();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0E(C8B c8b, C01171q c01171q) {
        C0960a0 A00 = C0960a0.A00(this.A03, c01171q.A03());
        this.A0C = A00.A6B();
        if (C00850j.A06(this.A03, A00, this.A04)) {
            this.A03.A0E().A44();
            this.A00.ABP(this, JA.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A06 = new FA(this, A00);
        this.A07 = new C0766Sh(this.A03, new WeakReference(this.A06), c8b.A04(), A6B());
        this.A07.A0G(c8b.A07(), c8b.A08());
        AbstractC00910q impressionHelper = new C0971aB(this);
        C0402Dv c0402Dv = this.A03;
        InterfaceC0505Ia interfaceC0505Ia = this.A04;
        C0766Sh c0766Sh = this.A07;
        this.A01 = new C0958Zy(c0402Dv, interfaceC0505Ia, c0766Sh, c0766Sh.getViewabilityChecker(), impressionHelper);
        this.A01.A08(A00);
        this.A07.loadDataWithBaseURL(N6.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0D = true;
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(JD jd, C8B c8b) {
        if (this.A02 == null || this.A04 == null) {
            return;
        }
        int A02 = (int) (jd.A02() * Resources.getSystem().getDisplayMetrics().density);
        int bannerHeight = (IK.A1c(this.A03) && C02145m.A0A(this.A02.A0N())) ? 1 : 0;
        if (bannerHeight == 0) {
            A0B(A02, c8b);
        } else {
            new C02145m(new C6M(this.A03), this.A02.A0N(), this.A02.A0K(), this.A02.A0L(), true, new C0975aF(this, A02, c8b, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0I(C0402Dv c0402Dv, InterfaceC0505Ia interfaceC0505Ia, JD jd, InterfaceC00960v interfaceC00960v, C01171q c01171q) {
        c0402Dv.A0E().A3X();
        this.A03 = c0402Dv;
        this.A04 = interfaceC0505Ia;
        this.A00 = interfaceC00960v;
        this.A0F = IK.A1G(this.A03.getApplicationContext());
        C8B A01 = c01171q.A01();
        this.A02 = F3.A02(c01171q.A03(), this.A03);
        if (this.A02.A0a()) {
            A0F(jd, A01);
        } else {
            A0E(A01, c01171q);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final String A6B() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final AdPlacementType A7L() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final boolean AFX() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.aA != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final void onDestroy() {
        this.A03.A0E().A3V(this.A07 != null);
        C0766Sh c0766Sh = this.A07;
        if (c0766Sh != null) {
            c0766Sh.destroy();
            this.A07 = null;
            this.A06 = null;
        }
    }
}
