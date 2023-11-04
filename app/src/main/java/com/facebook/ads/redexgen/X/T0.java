package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class T0 extends RelativeLayout implements InterfaceC0588Lk {
    public static byte[] A0Z;
    public static String[] A0a = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final RelativeLayout.LayoutParams A0k;
    @Nullable
    public View A00;
    @Nullable
    public RelativeLayout A01;
    @Nullable
    public RelativeLayout A02;
    public Toast A03;
    @Nullable
    public C5F A04;
    @Nullable
    public C0558Ke A05;
    @Nullable
    public View$OnClickListenerC0759Sa A06;
    public C0679Oy A07;
    public P5 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AbstractC0952Zs A0G;
    public final C1X A0H;
    public final C5D A0I;
    public final C0887Xc A0J;
    public final InterfaceC0505Ia A0K;
    public final C0513Ii A0L;
    public final C0558Ke A0M;
    public final L8 A0N;
    public final InterfaceC0587Lj A0O;
    public final MC A0P;
    public final NR A0Q;
    public final NS A0R;
    public final P3 A0S;
    public final AtomicBoolean A0T;
    public final AtomicBoolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    @VisibleForTesting
    public final AbstractC0586Li A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public T0(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, AbstractC0952Zs abstractC0952Zs, @Nullable String str, MC mc) {
        super(c0887Xc);
        this.A0I = new T8(this);
        this.A0U = new AtomicBoolean(false);
        this.A0T = new AtomicBoolean(false);
        this.A0D = false;
        this.A0F = true;
        this.A0B = false;
        this.A09 = false;
        this.A0J = c0887Xc;
        this.A0O = interfaceC0587Lj;
        this.A0K = interfaceC0505Ia;
        this.A0G = abstractC0952Zs;
        this.A0H = abstractC0952Zs.A0h().A0D().A06();
        this.A0L = new C0513Ii(this.A0G.A0m(), this.A0K);
        this.A0P = mc;
        this.A08 = new P5(c0887Xc, this.A0P, str, this.A0O);
        this.A0C = this.A0G.A0h().A0M() && this.A0G.A0h().A0D().A02() > 0;
        this.A0X = this.A0G.A0h().A0D().A0A();
        if (this.A0H == null) {
            this.A0O.A3t(this.A0P.A6g());
            this.A0O.A3t(this.A0P.A6b());
        }
        int A02 = (this.A0C && this.A0X) ? this.A0G.A0h().A0D().A02() : this.A0H.A07();
        this.A0U.set(!this.A0H.A0I());
        this.A0M = new C0558Ke(A02, new T2(this, null));
        this.A0W = IK.A2C(this.A0J);
        this.A0V = IK.A0k(this.A0J);
        this.A0Y = A06();
        this.A0S = new P3(this.A0J, this.A0K, this.A0G);
        if (this.A0W) {
            C0634Ne.A00(c0887Xc, this, abstractC0952Zs.A0h().A0D().A07());
        } else {
            LL.A0M(this, -14473425);
        }
        this.A0N = new L8(this);
        this.A0N.A05(L7.A03);
        if (IK.A1f(this.A0J)) {
            this.A0Y.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(56, 9, 61), this.A0P.A7M());
        this.A07 = new C0679Oy(this.A0J, this.A0G, this.A0H, this.A0K, new T1(this, null), hashMap);
        A0L();
        this.A0O.A3J(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        this.A0Q = new T7(this);
        this.A0R = new NS(this.A0J, this.A0Y, this.A0G, (RA) null, this.A0O, this.A0Q, this.A06, this.A01, this.A07);
    }

    public static String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Z, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0Z = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -77, -68, -71, -77, -69, -81, -61, -65, -59, -62, -77, -75, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -55, -68, -49, -60, -47, -64, -70, -66, -57, -60, -66, -58, -43, -47, -58, -56, -54, -46, -54, -45, -39, -65, -78, -60, -82, -65, -79, -78, -79, -84, -61, -74, -79, -78, -68, -80, -98, -101, -81, -94, -98, -80, -104, -100, -91, -94, -100, -92};
    }

    static {
        A0P();
        A0i = (int) (Kk.A02 * 64.0f);
        A0d = (int) (Kk.A02 * 16.0f);
        A0j = (int) (Kk.A02 * 12.0f);
        A0b = (int) (Kk.A02 * 10.0f);
        A0k = new RelativeLayout.LayoutParams(-1, -1);
        A0e = (int) (Kk.A02 * 48.0f);
        A0f = (int) (Kk.A02 * 16.0f);
        A0h = (int) (Kk.A02 * 14.0f);
        A0g = C01272a.A01(-1, 77);
        A0c = (int) (Kk.A02 * 8.0f);
    }

    private AbstractC0586Li A06() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0J, this.A0O, this.A0L, 0, this.A0G.A0b());
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A04(this.A0G.A0g().A01(), View$OnClickListenerC0759Sa.A08(this.A0G));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0G.A0k(), this.A0G.A0m(), this.A0H.A07(), this.A0G.A0l());
        fullScreenAdToolbar.setToolbarListener(new T4(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private View$OnClickListenerC0759Sa A09() {
        C0679Oy c0679Oy = this.A07;
        if (c0679Oy == null || c0679Oy.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        View$OnClickListenerC0759Sa button = new View$OnClickListenerC0759Sa(this.A0J, this.A0P.A6A(), this.A0G.A0g().A01(), this.A0K, this.A0O, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder());
        LL.A0K(button);
        button.setText(this.A0G.A0h().A0F().A04());
        button.setTextSize(14.0f);
        button.setIncludeFontPadding(false);
        int i = A0b;
        button.setPadding(i, i, i, i);
        if (!this.A0W) {
            LL.A0N(button, 8);
        }
        button.setOnClickListener(new View$OnClickListenerC0599Lv(this));
        return button;
    }

    private C0630Na A0C() {
        C0630Na c0630Na = new C0630Na(this.A0J, this.A0G.A0g().A01(), true, 16, 14, 0);
        c0630Na.A03(this.A0G.A0h().A0E().A06(), this.A0G.A0h().A0E().A05(), null, false, true);
        TextView descriptionTv = c0630Na.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c0630Na.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c0630Na;
    }

    private void A0H() {
        int i = A0e;
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(i, i);
        ratingInfoContainerParams.addRule(15);
        ratingInfoContainerParams.addRule(9);
        NU nu = new NU(this.A0J);
        LL.A0M(nu, 0);
        LL.A0K(nu);
        AsyncTaskC0764Sf asyncTaskC0764Sf = new AsyncTaskC0764Sf(nu, this.A0J);
        int i2 = A0e;
        asyncTaskC0764Sf.A05(i2, i2).A07(this.A0G.A0k().A01());
        TextView textView = new TextView(this.A0J);
        LL.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0G.A0g().A01().A06(true));
        textView.setText(this.A0G.A0h().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        NW nw = new NW(this.A0J, A0h, 5, A0g, -1);
        nw.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0J);
        textView2.setTextColor(this.A0G.A0g().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = A0c;
        LinearLayout linearLayout = new LinearLayout(this.A0J);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, A0f);
        layoutParams3.topMargin = A0c / 2;
        layoutParams3.addRule(3, textView.getId());
        linearLayout.addView(nw, layoutParams);
        linearLayout.addView(textView2, layoutParams2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = A0c;
        layoutParams4.addRule(1, nu.getId());
        layoutParams4.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams3);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0a[4].length() != 18) {
                throw new RuntimeException();
            }
            A0a[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams4);
            this.A02.addView(nu, ratingInfoContainerParams);
        }
        if (TextUtils.isEmpty(this.A0G.A0h().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        nw.setRating(Float.parseFloat(this.A0G.A0h().A0E().A03()));
        if (this.A0G.A0h().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0G.A0h().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0H.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0N.A05(L7.A04);
        }
    }

    public void A0J() {
        this.A0E = true;
        if (this.A0G.A0h().A0M()) {
            this.A08.A05();
            this.A0O.A3u(this.A0P.A5c(), new AnonymousClass72(0, 0));
            if (this.A0A) {
                boolean z = this.A0W;
                if (A0a[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0a;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    NI.A03(this.A0J, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0K, this.A0G.A0h().A0F(), this.A0G.A0m());
                }
            }
        }
    }

    private void A0K() {
        C0660Oe A0B = new C0658Oc(this.A0J, this.A0G.A0h().A0E(), this.A0G.A0k()).A08(this.A0G.A0g().A01()).A0A(this.A0H.A0G()).A09(this.A0H.A0D()).A07(2000).A0B();
        C0515Ik.A04(A0B, this.A0L, EnumC0512Ih.A0U);
        addView(A0B, A0k);
        A0B.A04(new T6(this));
    }

    private void A0L() {
        this.A06 = A09();
        this.A01 = new RelativeLayout(getContext());
        LL.A0K(this.A01);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
        int i = A0d;
        int i2 = A0j;
        adWebViewParams.setMargins(i, i2, i, i2);
        adWebViewParams.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        LL.A0K(this.A02);
        if (this.A0V) {
            A0H();
        } else {
            RelativeLayout relativeLayout = this.A02;
            C0630Na A0C = A0C();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(A0C, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-1, -2);
        iconAndMetaDataContainerParams.setMargins(0, 0, A0d, 0);
        this.A01.addView(this.A02, iconAndMetaDataContainerParams);
        View$OnClickListenerC0759Sa view$OnClickListenerC0759Sa = this.A06;
        if (view$OnClickListenerC0759Sa != null) {
            iconAndMetaDataContainerParams.addRule(0, view$OnClickListenerC0759Sa.getId());
            RelativeLayout.LayoutParams iconAndMetaDataContainerParams2 = new RelativeLayout.LayoutParams(-2, -2);
            iconAndMetaDataContainerParams2.addRule(11);
            iconAndMetaDataContainerParams2.addRule(6, this.A02.getId());
            iconAndMetaDataContainerParams2.addRule(8, this.A02.getId());
            this.A01.addView(this.A06, iconAndMetaDataContainerParams2);
        }
        LL.A0K(this.A0Y);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams3 = new RelativeLayout.LayoutParams(-1, -1);
        int i3 = A0d;
        iconAndMetaDataContainerParams3.setMargins(i3, 0, i3, 0);
        iconAndMetaDataContainerParams3.addRule(3, this.A0Y.getId());
        iconAndMetaDataContainerParams3.addRule(2, this.A01.getId());
        this.A0Y.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0Y, layoutParams);
        addView(this.A07, iconAndMetaDataContainerParams3);
        addView(this.A01, adWebViewParams);
        if (this.A0H.A0J()) {
            this.A07.A0B();
        }
    }

    public void A0M() {
        new C0513Ii(this.A0G.A0m(), this.A0K).A04(EnumC0512Ih.A0r, null);
        this.A0T.set(true);
        LL.A0T(this);
        LL.A0H(this.A07);
        LL.A0Z(this.A0R, this.A00, this.A07);
        LL.A0L(this.A0Y);
        LL.A0L(this.A06);
        Pair<P2, View> A03 = this.A0S.A03(this.A06);
        this.A00 = (View) A03.second;
        int i = C0600Lw.A00[((P2) A03.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                LL.A0Z(relativeLayout);
            }
            addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, this.A0Y.getToolbarHeight(), 0, 0);
        LL.A0L(this.A01);
        RelativeLayout relativeLayout2 = this.A01;
        if (relativeLayout2 != null) {
            layoutParams.addRule(2, relativeLayout2.getId());
        }
        addView(this.A00, layoutParams);
    }

    public void A0N() {
        LL.A0T(this);
        if (!this.A0H.A0J()) {
            C0679Oy c0679Oy = this.A07;
            if (A0a[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            c0679Oy.A0B();
        }
        this.A0Y.setVisibility(0);
        this.A07.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0G.A0e() > 0 && this.A05 == null) {
            this.A05 = new C0558Ke(this.A0G.A0e(), new T5(this));
            this.A05.A08();
        }
        this.A0M.A08();
    }

    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0H.A0C(), 1);
        A0Q((int) this.A0M.A04());
        this.A03.show();
    }

    public void A0Q(int i) {
        String valueOf = String.valueOf(i);
        Toast toast = this.A03;
        String A0C = this.A0H.A0C();
        String progress = A0E(2, 6, 31);
        LL.A0Y(toast, A0C.replace(progress, valueOf), 49, 0, A0i);
    }

    public void A0X(boolean z, String str) {
        this.A0B = true;
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(8, 12, 121), z ? A0E(79, 13, 17) : A0E(44, 12, 51));
        hashMap.put(A0E(20, 12, 40), str);
        NI ni = new NI(this.A0J, this.A0P.A6A(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0K, this.A0O);
        if (!this.A0W) {
            boolean z2 = !this.A0M.A05();
            ni.A0A(!z2);
            ni.A08(this.A0G.A0m(), this.A0G.A0h().A0F().A05(), hashMap);
            if (z2) {
                new Handler(Looper.getMainLooper()).post(new T3(this));
            }
            this.A0A = true;
            return;
        }
        ni.A08(this.A0G.A0m(), this.A0G.A0h().A0F().A05(), hashMap);
    }

    public boolean A0Y() {
        if (!this.A0G.A0K().equals(A0E(65, 14, 37))) {
            if (this.A0G.A0K().equals(A0E(32, 12, 100))) {
                AbstractC0952Zs abstractC0952Zs = this.A0G;
                if (A0a[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0a[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (abstractC0952Zs.A0h().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    public boolean A0Z() {
        return this.A0X && !this.A0D && !this.A0F && this.A0H.A07() < this.A0G.A0h().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, Bundle bundle, C5F c5f) {
        this.A04 = c5f;
        this.A04.A0K(this.A0I);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
        this.A0M.A07();
        this.A09 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
        if (this.A0X && this.A0F) {
            return;
        }
        boolean z2 = this.A0D;
        if (A0a[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0a[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0U.get() && !this.A0M.A06()) {
            this.A0M.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public String getCurrentClientToken() {
        return this.A0G.A0m();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        this.A0N.A03();
        C5F c5f = this.A04;
        if (c5f != null) {
            c5f.A0L(this.A0I);
        }
        if (this.A07 != null) {
            AbstractC0952Zs abstractC0952Zs = this.A0G;
            if (A0a[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0a[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(abstractC0952Zs.A0m())) {
                this.A0K.A99(this.A0G.A0m(), new NA().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0M.A07();
        this.A0Y.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ACM(false);
        } else {
            ABw(false);
        }
    }

    public void setListener(InterfaceC0587Lj interfaceC0587Lj) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(P5 p5) {
        this.A08 = p5;
    }
}
