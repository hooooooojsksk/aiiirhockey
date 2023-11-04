package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.7G */
/* loaded from: assets/audience_network.dex */
public final class C7G extends T9 implements InterfaceC0673Os {
    public static byte[] A0N;
    public static String[] A0O = {"jpfQHsJU1lQWxp7CXlwdVdxcmzkEjD3g", "zEjz0M8mBGIlVid6uM60nN2wm9TWrUGD", "N1PpSZkKdQQSk7AxXPBdtL04F7CB9SRH", "NsCDsqdLjA318x1fHEY8u0Kcg9miAoAi", "WmIcjMDFfLwNDk", "", "Zb94j8IQkKLdVAKFmXIR3eGQpuAhW41l", "pxOHyfKHQ8aixQeNEjeruqZzDXsiYM9P"};
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public RelativeLayout A03;
    public F1 A04;
    public C6M A05;
    @Nullable
    public C2M A06;
    @Nullable
    public ND A07;
    @Nullable
    public NT A08;
    @Nullable
    public C0736Rd A09;
    @Nullable
    @DoNotStrip
    public Q9 A0A;
    public QA A0B;
    @Nullable
    public String A0C;
    public List<C0668On> A0D;
    public final int A0E;
    public final C1L A0F;
    public final C0887Xc A0G;
    public final LD A0H;
    public final InterfaceC0587Lj A0I;
    public final C0642Nm A0J;
    public final C0674Ot A0K;
    public final C0674Ot A0L;
    public final JW A0M;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 14;
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0A() {
        int min;
        int i;
        int i2;
        int i3 = getResources().getConfiguration().orientation;
        int i4 = Kk.A03.widthPixels;
        int i5 = Kk.A03.heightPixels;
        if (i3 == 1) {
            min = Math.min(i4 - (A0Q * 4), i5 / 2);
            i = (i4 - min) / 8;
            i2 = i * 4;
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            min = Math.min(i5, i4);
            i = (i4 - min) / 2;
            i2 = i;
            A08();
        }
        C2M c2m = this.A06;
        if (c2m == null) {
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
            return;
        }
        C0735Rc fullscreenCarouselRecyclerViewAdapter = c2m.getFullscreenCarouselRecyclerViewAdapter();
        if (fullscreenCarouselRecyclerViewAdapter != null) {
            fullscreenCarouselRecyclerViewAdapter.A0F(min, i, i2);
            fullscreenCarouselRecyclerViewAdapter.A06();
        }
    }

    public static void A0B() {
        byte[] bArr = {94, -117, -117, -120, -117, 57, 124, -117, 126, airhockey.J_PURCHASE, -115, -126, -121, ByteCompanionObject.MIN_VALUE, 57, 124, airhockey.J_PURCHASE, -117, -120, -114, -116, 126, -123, 57, -113, -126, 126, -112, 89, -122, -122, -125, -122, 52, -117, 124, 125, ByteCompanionObject.MIN_VALUE, airhockey.J_WAIT, 52, 119, airhockey.J_ERROR, -122, -125, -119, -121, airhockey.J_WAIT, ByteCompanionObject.MIN_VALUE, 52, 119, airhockey.J_ERROR, -122, airhockey.J_ACHIEVEMENTCALLBACK, 52, 119, 124, airhockey.J_ERROR, -126, 123, airhockey.J_WAIT, airhockey.P_NATION, 91, 87, 86, -118, airhockey.J_WAIT, 126, airhockey.J_PURCHASE, -125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, 99, airhockey.J_PURCHASE, -119, -116, -124, -121, ByteCompanionObject.MIN_VALUE, -97, -94, -99, -94, -97, -78, -97, -99, -96, -77, -84, -94, -86, -93, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -17, -16, -27, -16, -27, -35, -24, -86, -33, -24, -27, -33, -25, -31, -32};
        if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0O[0] = "0pXVmbGKHAzIVbBBK7Eyv6Mrdc2f0VIY";
        A0N = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0D(int i, @Nullable Bundle bundle) {
        boolean z = i == 1;
        this.A03 = new RelativeLayout(getContext());
        this.A07 = new SW(this.A0G, 0, this.A0D.get(0).A03().A0E().A00() == C1H.A05, this.A0F, super.A0A.A0h().A0F().A06(), A06(92, 37, 110), getAdEventManager(), this.A0I, this.A0B, this.A0H);
        this.A07.A0C(z ? 1 : 0);
        this.A03.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A0A = new C0734Rb(this);
        this.A0B = new QA(this, 1, new WeakReference(this.A0A), this.A0G);
        this.A0B.A0W(this.A01);
        this.A0B.A0X(this.A02);
        this.A06 = new C2M(this.A0G);
        LL.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.A09 = new C0736Rd(this.A06, i, this.A0D, this.A0B, bundle);
        if (this.A0C != null) {
            this.A06.setAdapter(new C0735Rc(this.A0G, this.A0D, this.A04, super.A0C, this.A05, this.A0B, this.A0H, getAudienceNetworkListener(), this.A0C, this.A09, this.A0M, super.A0E));
            A0A();
        } else if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        } else {
            A0O[5] = "";
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
        }
        A0F(this.A09);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        if (IK.A1Q(this.A0G)) {
            InterfaceC0517Im A0A = this.A0G.A0A();
            C2M c2m = this.A06;
            String A0m = super.A0A.A0m();
            if (A0O[4].length() == 17) {
                throw new RuntimeException();
            }
            A0O[5] = "";
            A0A.AFp(c2m, A0m, false);
        }
        this.A03.addView(this.A06, layoutParams);
        A09();
        this.A03.addView(this.A08);
        this.A07.setTitleMaxLines(3);
        this.A07.A0A();
        this.A07.A09();
        this.A03.addView(this.A07, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        int i2 = A0P;
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        layoutParams3.setMargins(A0Q, 0, 0, 0);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        int i3 = A0P;
        layoutParams4.width = i3;
        layoutParams4.height = i3;
        layoutParams4.setMargins(0, 0, A0Q, 0);
        this.A03.addView(this.A0K, layoutParams3);
        this.A03.addView(this.A0L, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(12);
        this.A03.addView(this.A0M, layoutParams5);
        A0U(this.A03, true, i);
        removeView(findViewById(C0634Ne.A00));
        if (IK.A2A(this.A0G)) {
            LL.A0M(this, -1);
        } else {
            C0634Ne.A00(this.A0J.A05(), this, this.A04.A0h().A0D().A07());
        }
        if (this.A0C != null) {
            this.A07.setInfo(this.A04.A0h().A0E(), this.A04.A0h().A0F(), this.A0C, super.A0A.A0k().A01(), null);
        }
    }

    static {
        A0B();
        A0Q = (int) (Kk.A02 * 8.0f);
        A0R = (int) (Kk.A02 * 8.0f);
        A0S = (int) (Kk.A02 * 12.0f);
        A0P = (int) (Kk.A02 * 42.0f);
    }

    public C7G(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, C6M c6m, InterfaceC0587Lj interfaceC0587Lj, F1 f1) {
        super(c0887Xc, interfaceC0505Ia, interfaceC0587Lj, f1);
        this.A0H = new LD();
        this.A00 = -1;
        this.A05 = c6m;
        this.A0G = c0887Xc;
        this.A0I = interfaceC0587Lj;
        this.A0E = super.A0A.A0o().size();
        this.A0M = new JW(this.A0G);
        this.A0L = new C0674Ot(this.A0G, EnumC0672Or.A04, this);
        this.A0K = new C0674Ot(this.A0G, EnumC0672Or.A03, this);
        this.A0J = new C0641Nl(this.A0G, interfaceC0505Ia, getAudienceNetworkListener(), this.A04, null, this.A0B, this.A0H).A0H(super.A0E).A0J();
        this.A0F = f1.A0g().A01();
        if (IK.A1f(this.A0G)) {
            super.A0E.setProgressSpinnerInvisible(true);
        }
    }

    private void A08() {
        if (this.A00 > 0) {
            this.A0K.setVisibility(0);
        } else {
            this.A0K.setVisibility(8);
        }
        if (this.A00 != this.A0E - 1) {
            C0674Ot c0674Ot = this.A0L;
            String[] strArr = A0O;
            if (strArr[7].charAt(14) == strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            A0O[0] = "6a52QfyEa3IWfhbHGHqjZ8J10HxaoQoC";
            c0674Ot.setVisibility(0);
            return;
        }
        this.A0L.setVisibility(8);
    }

    private void A09() {
        if (this.A08 != null && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams.addRule(3, this.A06.getId());
                layoutParams.setMargins(0, A0Q, 0, 0);
            } else {
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, A0Q);
            }
            layoutParams.addRule(14);
            this.A08.setLayoutParams(layoutParams);
        }
    }

    private final void A0C() {
        C2M c2m = this.A06;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A06 = null;
        }
        NT nt = this.A08;
        if (nt != null) {
            nt.removeAllViews();
            this.A08 = null;
        }
        RelativeLayout relativeLayout = this.A03;
        if (A0O[5].length() != 0) {
            throw new RuntimeException();
        }
        A0O[5] = "";
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    private void A0E(F1 f1) {
        this.A04 = f1;
        this.A0C = this.A04.A0m();
        this.A01 = this.A04.A0A();
        this.A02 = this.A04.A0B();
        List<C1C> A0o = this.A04.A0o();
        List<AdInfo> adInfoList = new ArrayList<>(A0o.size());
        this.A0D = adInfoList;
        for (int i = 0; i < A0o.size(); i++) {
            List<C0668On> list = this.A0D;
            int i2 = A0o.size();
            list.add(new C0668On(i, i2, A0o.get(i)));
        }
    }

    private void A0F(C0736Rd c0736Rd) {
        new EA().A0G(this.A06);
        c0736Rd.A0Z(new C0733Ra(this));
        this.A08 = new NT(this.A0G, super.A05.A01(), this.A0D.size());
        LL.A0K(this.A08);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0R);
        layoutParams.setMargins(0, A0S, 0, 0);
        this.A08.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.T9
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, @Nullable Bundle bundle, C5F c5f) {
        F1 dataBundle = (F1) intent.getSerializableExtra(A06(78, 14, 48));
        A0V(c5f);
        if (dataBundle != null) {
            A0E(dataBundle);
        }
        A0D(c5f.A0H().getResources().getConfiguration().orientation, bundle);
        c5f.A0K(new RZ(this, c5f));
        int A03 = super.A0A.A0h().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
        super.ABw(z);
        C0736Rd c0736Rd = this.A09;
        if (c0736Rd != null) {
            c0736Rd.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
        super.ACM(z);
        C0736Rd c0736Rd = this.A09;
        if (c0736Rd != null) {
            c0736Rd.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0673Os
    public final void ACi(EnumC0672Or enumC0672Or) {
        int i;
        C2M c2m = this.A06;
        if (c2m != null) {
            C0915Ye layoutManager = c2m.getLayoutManager();
            if (enumC0672Or == EnumC0672Or.A03) {
                int i2 = this.A00;
                i = i2 <= 0 ? 0 : i2 - 1;
                layoutManager.A21(this.A06, new C01904o(), i);
            } else {
                int i3 = this.A00;
                int i4 = this.A0E;
                i = i3 >= i4 + (-1) ? i4 - 1 : i3 + 1;
                layoutManager.A21(this.A06, new C01904o(), i);
            }
            setUpLayoutForCardAtIndex(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
        C0736Rd c0736Rd = this.A09;
        if (c0736Rd != null) {
            c0736Rd.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle savedInstanceState = new Bundle();
        AEZ(savedInstanceState);
        super.onConfigurationChanged(configuration);
        A0A();
        C2M c2m = this.A06;
        if (c2m != null && this.A09 != null) {
            c2m.getLayoutManager().A1t(Math.max(this.A00, 0));
            this.A09.A0U(Math.max(this.A00, 0));
        }
        A09();
        ND nd = this.A07;
        if (nd != null) {
            nd.A0C(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.T9, com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        super.onDestroy();
        if (IK.A1Q(this.A0G)) {
            InterfaceC0517Im A0A = this.A0G.A0A();
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[4] = "nCvA44nJ0TVVJ";
            A0A.AFe(this.A06);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            super.A0C.A99(this.A0C, new NA().A03(this.A0B).A02(this.A0H).A05());
        }
        A0C();
        this.A0B.A0V();
        this.A0B = null;
        this.A0A = null;
        this.A0D = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0H.A06(this.A0G, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void setAdDetailsToolBarClickListener(int i) {
        InterfaceC0590Lm interfaceC0590Lm;
        if (this.A06 == null || !IK.A0y(this.A0J.A05()) || i < 0 || this.A06.getAdapter() == null) {
            return;
        }
        C2M c2m = this.A06;
        String[] strArr = A0O;
        if (strArr[3].charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[7] = "L2Q99TOJcURMOBK7mibMWk3Gkyoj0cp8";
        strArr2[1] = "bh6RAua9XdYQzRZgXDnYUJ30pnvEuGys";
        if (i >= c2m.getAdapter().A0D() || (interfaceC0590Lm = (InterfaceC0590Lm) this.A06.A1F(i)) == null) {
            return;
        }
        interfaceC0590Lm.AEn();
        interfaceC0590Lm.AEl(this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUpLayoutForCardAtIndex(int r12) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.NT r0 = r11.A08
            if (r0 == 0) goto L7
            r0.A00(r12)
        L7:
            com.facebook.ads.redexgen.X.F1 r0 = r11.A04
            com.facebook.ads.redexgen.X.1C r4 = r0.A0i(r12)
            if (r4 == 0) goto L81
            int r0 = r11.A00
            if (r0 == r12) goto L81
            r11.A00 = r12
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L25
            r11.A08()
        L25:
            int r0 = com.facebook.ads.redexgen.X.C0634Ne.A00
            android.view.View r0 = r11.findViewById(r0)
            r11.removeView(r0)
            com.facebook.ads.redexgen.X.Xc r0 = r11.A0G
            boolean r0 = com.facebook.ads.redexgen.X.IK.A2A(r0)
            if (r0 == 0) goto La6
            r0 = -1
            com.facebook.ads.redexgen.X.LL.A0M(r11, r0)
        L3a:
            java.lang.String r0 = r11.A0C
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.ND r5 = r11.A07
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C7G.A0O
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto Lb8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C7G.A0O
            java.lang.String r1 = "kFih28rpO37RepskuaJrvvoNb65qRIkh"
            r0 = 6
            r2[r0] = r1
            if (r5 != 0) goto L8a
        L58:
            r2 = 61
            r1 = 17
            r0 = 7
            java.lang.String r3 = A06(r2, r1, r0)
            r2 = 28
            r1 = 33
            r0 = 6
            java.lang.String r0 = A06(r2, r1, r0)
            android.util.Log.e(r3, r0)
        L6d:
            com.facebook.ads.redexgen.X.1F r0 = r4.A0D()
            java.lang.String r0 = r0.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.JW r1 = r11.A0M
            r0 = 0
            r1.setVisibility(r0)
        L81:
            return
        L82:
            com.facebook.ads.redexgen.X.JW r1 = r11.A0M
            r0 = 8
            r1.setVisibility(r0)
            goto L81
        L8a:
            com.facebook.ads.redexgen.X.1J r6 = r4.A0E()
            com.facebook.ads.redexgen.X.1M r7 = r4.A0F()
            java.lang.String r8 = r11.A0C
            com.facebook.ads.redexgen.X.Zs r0 = r11.A0A
            com.facebook.ads.redexgen.X.1V r0 = r0.A0k()
            java.lang.String r9 = r0.A01()
            r10 = 0
            r5.setInfo(r6, r7, r8, r9, r10)
            r11.setAdDetailsToolBarClickListener(r12)
            goto L6d
        La6:
            com.facebook.ads.redexgen.X.Nm r0 = r11.A0J
            com.facebook.ads.redexgen.X.Xc r1 = r0.A05()
            com.facebook.ads.redexgen.X.1F r0 = r4.A0D()
            java.lang.String r0 = r0.A07()
            com.facebook.ads.redexgen.X.C0634Ne.A00(r1, r11, r0)
            goto L3a
        Lb8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7G.setUpLayoutForCardAtIndex(int):void");
    }
}
