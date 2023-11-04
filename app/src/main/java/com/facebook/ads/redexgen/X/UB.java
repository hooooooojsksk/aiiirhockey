package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class UB implements InterfaceC0505Ia {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static InterfaceC0505Ia A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C0886Xb A00;
    public final C8Z A01;
    public final IZ A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = UB.class.getSimpleName();
        A06 = false;
    }

    public UB(C0886Xb c0886Xb) {
        IY dispatchCallback;
        this.A00 = c0886Xb;
        if (IM.A0T(c0886Xb)) {
            this.A01 = C8X.A00(c0886Xb);
            dispatchCallback = C0510If.A01(c0886Xb, this.A01);
        } else {
            C0396Dp A01 = C8X.A01(c0886Xb);
            dispatchCallback = C0510If.A00(c0886Xb, A01);
            this.A01 = A01;
        }
        this.A02 = new UE(c0886Xb, dispatchCallback);
        LQ.A08.execute(new UD(this));
        A04(c0886Xb);
    }

    public static synchronized InterfaceC0505Ia A01(C0886Xb c0886Xb) {
        InterfaceC0505Ia interfaceC0505Ia;
        synchronized (UB.class) {
            if (A03 == null) {
                A03 = new UB(c0886Xb);
            }
            interfaceC0505Ia = A03;
        }
        return interfaceC0505Ia;
    }

    public static synchronized void A04(C0886Xb c0886Xb) {
        synchronized (UB.class) {
            if (A06) {
                return;
            }
            c0886Xb.A03().AA5();
            A06 = true;
        }
    }

    private void A05(IX ix) {
        if (!ix.A0A()) {
            String str = A05;
            Log.e(str, A02(7, 29, 24) + ix.A06() + A02(0, 7, 55));
            return;
        }
        A06(ix);
        this.A01.AG8(ix, new UC(this, ix));
    }

    @SuppressLint({"ThrowException"})
    private void A06(IX ix) {
        switch (ix.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                C02637t c02637t = new C02637t(new Exception(A02(36, 5, 50)));
                c02637t.A03(1);
                try {
                    c02637t.A05(new JSONObject().put(A02(48, 4, 107), ix.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().A9D(A02(41, 7, 50), C02627s.A1H, c02637t);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A95(String str, Map<String, String> data) {
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A97(String str, Map<String, String> data) {
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A98(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A07).A06(C0515Ik.A0A(str, EnumC0512Ih.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A99(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A08).A06(C0515Ik.A0A(str, EnumC0512Ih.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9B(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9F(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9H(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0D).A06(C0515Ik.A0A(str, EnumC0512Ih.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9I(String str, @Nullable Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9J(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0F).A06(C0515Ik.A0A(str, EnumC0512Ih.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9K(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0K).A06(C0515Ik.A0A(str, EnumC0512Ih.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9L(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0H).A06(C0515Ik.A0A(str, EnumC0512Ih.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9N(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0J).A06(C0515Ik.A0A(str, EnumC0512Ih.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9O(String str, Map<String, String> data, String str2, EnumC0507Ic enumC0507Ic) {
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(enumC0507Ic).A02(EnumC0508Id.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9P(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IX adEvent = new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9T(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0N).A06(C0515Ik.A0A(str, EnumC0512Ih.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9U(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0O).A06(C0515Ik.A0A(str, EnumC0512Ih.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9W(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0P).A06(C0515Ik.A0A(str, EnumC0512Ih.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9X(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9Y(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0Q).A06(C0515Ik.A0A(str, EnumC0512Ih.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9Z(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0U).A06(C0515Ik.A0A(str, EnumC0512Ih.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9a(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A04).A02(EnumC0508Id.A0T).A06(C0515Ik.A0A(str, EnumC0512Ih.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9b(String str, Map<String, String> data) {
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void A9d(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IW().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0507Ic.A05).A02(EnumC0508Id.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0505Ia
    public final void ADV(String str) {
        new AsyncTaskC0707Qa(this.A00).execute(str);
    }
}
