package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8w */
/* loaded from: assets/audience_network.dex */
public final class C02918w extends FrameLayout implements InterfaceC0588Lk, S0 {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public C5D A00;
    @Nullable
    public C5F A01;
    @Nullable
    public OW A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC0952Zs A06;
    public final C0887Xc A07;
    public final InterfaceC0505Ia A08;
    public final C0513Ii A09;
    public final L8 A0A;
    public final LD A0B;
    public final InterfaceC0587Lj A0C;
    public final MC A0D;
    @Nullable
    public final OE A0E;
    public final OM A0F;
    @DoNotStrip
    public final Q9 A0G;
    public final QA A0H;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98, -90, -81, -84, -90, -82, -94, -74, -78, -72, -75, -90, -88, 25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A0D();
    }

    public C02918w(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj, AbstractC0952Zs abstractC0952Zs, MC mc, @DynamicWebViewController$AdFormatType int i) {
        super(c0887Xc);
        this.A00 = new SD(this);
        this.A0G = new SC(this);
        this.A03 = true;
        this.A07 = c0887Xc;
        this.A08 = interfaceC0505Ia;
        this.A0C = interfaceC0587Lj;
        this.A06 = abstractC0952Zs;
        this.A0D = mc;
        OM A02 = ON.A02(abstractC0952Zs.A0L());
        if (A02 == null) {
            this.A0F = new OM(this.A07, abstractC0952Zs, interfaceC0505Ia, i);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new SB(this));
        LL.A0G(1003, this.A0F.A0O());
        if (this.A06.A0W()) {
            C0887Xc c0887Xc2 = this.A07;
            this.A0E = new OE(c0887Xc2, this.A08, this.A06, new C6M(c0887Xc2), this.A09, this.A0C, this.A0D, new SA(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new OA(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new QA(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0A());
        this.A0H.A0X(this.A06.A0B());
        this.A0F.A0e(this.A0H);
        this.A0A = new L8(this);
        this.A0A.A05(L7.A03);
        setBackgroundColor(0);
        if (IK.A1Q(c0887Xc)) {
            c0887Xc.A0A().AFr(mediaView, abstractC0952Zs.A0m(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A0s = abstractC0952Zs.A0s();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (!A0s) {
                if (KU.A05(abstractC0952Zs.A0J())) {
                    jSONObject.put(A0B4, true);
                    jSONObject.put(A0B3, 2);
                    jSONObject.put(A0B2, 1);
                    jSONObject.put(A0B, this.A06.A0E());
                }
            } else {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0E());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C02627s.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        C0660Oe A0B = new C0658Oc(this.A07, this.A06.A0h().A0E(), this.A06.A0k()).A08(this.A06.A0g().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new S8(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A4z();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A50();
            if (this.A0F.A0k()) {
                AFS();
                C0887Xc c0887Xc = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (IK.A1Q(c0887Xc)) {
                    this.A07.A0A().AAg();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3J(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0X()) {
            this.A0A.A05(L7.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NI ni = new NI(this.A07, this.A0D.A6A(), this.A0H, this.A0B, this.A08, this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 26), A0B(98, 9, 123));
        ni.A08(this.A06.A0m(), str, hashMap);
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void A89() {
        A0F(this.A06.A0h().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void A8A(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void A8E() {
        this.A0C.A3t(this.A0D.A5c());
        P5 serverSideRewardHandler = new P5(this.A07, this.A0D, this.A06.A0M(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void A8w() {
        new Handler(Looper.getMainLooper()).post(new S9(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void A92(Intent intent, @Nullable Bundle bundle, C5F c5f) {
        OM.A0B().incrementAndGet();
        c5f.A0K(this.A00);
        this.A01 = c5f;
        A0E();
        if (this.A06.A0h().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void AB4() {
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void AB8() {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void ABm(boolean z) {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ABw(boolean z) {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void ACM(boolean z) {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0T(z);
        }
        boolean z2 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z2) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void ACZ() {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void AD5(boolean z) {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0U(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void AD7(boolean z) {
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0V(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void ADL(String str) {
        String urlString = this.A06.A0n(str);
        if (urlString == null) {
            return;
        }
        KS.A0E(new KS(), this.A07, KT.A00(urlString), this.A06.A0m());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void AEZ(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void AFS() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void close() {
        C5F c5f = this.A01;
        if (c5f == null) {
            return;
        }
        c5f.finish(4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public String getCurrentClientToken() {
        return this.A06.A0m();
    }

    private ViewGroup getMediaView() {
        OE oe = this.A0E;
        return oe != null ? oe : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0588Lk
    public final void onDestroy() {
        if (IK.A1Q(this.A07)) {
            this.A07.A0A().AFe(getMediaView());
        }
        OE oe = this.A0E;
        if (oe != null) {
            oe.A0O();
        }
        this.A0A.A03();
        this.A08.A99(this.A06.A0m(), new NA().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        ON.A04(this.A06.A0L());
        OM.A0B().decrementAndGet();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0587Lj interfaceC0587Lj) {
    }

    public void setRtfActionsJavascriptListener(OW ow) {
        this.A02 = ow;
    }
}
