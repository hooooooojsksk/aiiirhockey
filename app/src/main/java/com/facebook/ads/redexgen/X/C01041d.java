package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1d */
/* loaded from: assets/audience_network.dex */
public final class C01041d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    @Nullable
    public C6M A00;
    public NB A01 = NB.A06;
    @Nullable
    @DoNotStrip
    public OM A02;
    public final F1 A03;
    public final InterfaceC01031c A04;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A09(C0887Xc c0887Xc, EnumSet<CacheFlag> enumSet) {
        boolean A0a = this.A03.A0a();
        C6M A04 = A04(c0887Xc);
        A04.A0d(new C0513Ii(this.A03.A0m(), c0887Xc.A09()));
        boolean z = IK.A1c(c0887Xc) && C02145m.A0A(this.A03.A0N());
        if (z) {
            new C02145m(A04, this.A03.A0N(), this.A03.A0K(), this.A03.A0L(), z, new C0945Zl(this, c0887Xc, A0a)).A0B();
            return;
        }
        String A062 = A06(65, 12, 2);
        if (A0a) {
            C6I c6i = new C6I(this.A03.A0H(), this.A03.A0L(), A062);
            c6i.A04 = true;
            c6i.A03 = A06(0, 5, 17);
            A04.A0X(c6i);
        }
        A04.A0c(new C6K(this.A03.A0k().A01(), C0667Om.A04, C0667Om.A04, this.A03.A0L(), A06(65, 12, 2)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i = 0;
        boolean A2G = IK.A2G(c0887Xc, C0701Pu.A03());
        for (C1C c1c : this.A03.A0o()) {
            C6K c6k = new C6K(c1c.A0D().A07(), C01101j.A00(c1c.A0D()), C01101j.A01(c1c.A0D()), this.A03.A0L(), A06(65, 12, 2));
            if (i == 0) {
                A04.A0b(c6k);
            } else {
                A04.A0c(c6k);
            }
            for (String str : c1c.A0G().A01()) {
                A04.A0c(new C6K(str, -1, -1, this.A03.A0L(), A06(65, 12, 2)));
            }
            if (contains && !TextUtils.isEmpty(c1c.A0D().A08())) {
                C6I c6i2 = new C6I(c1c.A0D().A08(), this.A03.A0L(), A06(65, 12, 2), c1c.A0D().A05());
                c6i2.A04 = false;
                if (i == 0) {
                    if (!A0a || A2G) {
                        A04.A0a(c6i2);
                    } else {
                        A04.A0X(c6i2);
                    }
                } else if (!A0a || A2G) {
                    A04.A0Z(c6i2);
                } else {
                    A04.A0Y(c6i2);
                }
            }
            i++;
        }
        A04.A0W(new C0943Zj(this, c0887Xc, A0a), new C6F(this.A03.A0L(), A062));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0H(C0887Xc c0887Xc, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c0887Xc);
        if (A00 != null) {
            this.A04.AA6(A00);
            return;
        }
        this.A04.AE1();
        if (A0C() == EnumC0539Jj.A0A) {
            A08(c0887Xc);
        } else {
            A09(c0887Xc, enumSet);
        }
    }

    static {
        A07();
    }

    public C01041d(C0887Xc c0887Xc, C01171q c01171q, InterfaceC01031c interfaceC01031c, @Nullable String str) {
        JSONObject dataObject = c01171q.A03();
        this.A03 = A02(c0887Xc, c01171q, str, dataObject);
        this.A04 = interfaceC01031c;
    }

    @Nullable
    private AdError A00(C0887Xc c0887Xc) {
        if (this.A03.A0o().isEmpty()) {
            c0887Xc.A07().A9C(A06(62, 3, 18), C02627s.A0Z, new C02637t(A06(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static F1 A02(C0887Xc c0887Xc, C01171q c01171q, @Nullable String str, JSONObject jSONObject) {
        F1 A02 = F1.A02(jSONObject, c0887Xc);
        A02.A0R(str);
        C8B A01 = c01171q.A01();
        if (A01 != null) {
            A02.A0O(A01.A06());
        }
        return A02;
    }

    private C6M A04(C0887Xc c0887Xc) {
        C6M c6m = this.A00;
        return c6m != null ? c6m : new C6M(c0887Xc);
    }

    private void A08(C0887Xc c0887Xc) {
        C1X playableData = this.A03.A0h().A0D().A06();
        A0A(playableData != null ? playableData.A0A() : NB.A06);
        C0942Zi c0942Zi = new C0942Zi(this);
        C6M c6m = new C6M(c0887Xc);
        boolean z = IK.A1c(c0887Xc) && C02145m.A0A(this.A03.A0N());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z) {
            C02145m c02145m = new C02145m(c6m, this.A03.A0N(), this.A03.A0K(), this.A03.A0L(), z, new C0941Zh(this));
            c6m.A0d(new C0513Ii(this.A03.A0m(), c0887Xc.A09()));
            c02145m.A0B();
            return;
        }
        F1 f1 = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C01141n.A02(c0887Xc, f1, true, c0942Zi);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C01141n.A02(c0887Xc, f1, true, c0942Zi);
    }

    private void A0A(NB nb) {
        this.A01 = nb;
    }

    public final AbstractC0952Zs A0B() {
        return this.A03;
    }

    public final EnumC0539Jj A0C() {
        if (this.A03.A0a()) {
            return EnumC0539Jj.A04;
        }
        int size = this.A03.A0o().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC0539Jj.A08;
            }
            if (this.A03.A0h().A0D().A06() != null) {
                EnumC0539Jj enumC0539Jj = EnumC0539Jj.A0A;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0539Jj;
                }
            } else if (A0I()) {
                EnumC0539Jj enumC0539Jj2 = EnumC0539Jj.A0B;
                String[] strArr3 = A06;
                if (strArr3[6].length() != strArr3[2].length()) {
                    A06[3] = "JH";
                    return enumC0539Jj2;
                }
                throw new RuntimeException();
            } else {
                EnumC0539Jj enumC0539Jj3 = EnumC0539Jj.A09;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC0539Jj3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC0539Jj3;
            }
        }
        throw new RuntimeException();
    }

    public final NB A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0m();
    }

    public final void A0F() {
        this.A04.AFg();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0Q(rewardData);
        this.A03.A0T(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0h().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0W();
    }
}
