package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class OE extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    @Nullable
    public PK A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC0952Zs A05;
    public final C6M A06;
    public final C0887Xc A07;
    public final C0513Ii A08;
    public final InterfaceC0587Lj A09;
    public final MC A0A;
    public final OD A0B;
    public final PB A0C;
    public final RA A0D;
    public final AnonymousClass75 A0E;
    public final PO A0F;
    public final AbstractC0664Oj A0G;
    public final NY A0H;
    public final AbstractC0623Mt A0I;
    public final M9 A0J;
    public final M8 A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 95, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 87, 86, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYWIN, airhockey.J_SDKVER, 119, airhockey.J_REWARD, 80, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_MYWIN, airhockey.J_SDKVER, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public OE(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, AbstractC0952Zs abstractC0952Zs, C6M c6m, C0513Ii c0513Ii, InterfaceC0587Lj interfaceC0587Lj, MC mc, OD od) {
        super(c0887Xc);
        this.A0J = new M9() { // from class: com.facebook.ads.redexgen.X.8u
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A02 */
            public final void A03(MK mk) {
                OD od2;
                JSONObject A03;
                OE.this.A03 = true;
                od2 = OE.this.A0B;
                A03 = OE.this.A03();
                od2.AD0(A00(0, 8, 101), A03);
            }
        };
        this.A0I = new AbstractC0623Mt() { // from class: com.facebook.ads.redexgen.X.8s
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, airhockey.P_GAME_MYLOSE};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A02 */
            public final void A03(NC nc) {
                OD od2;
                JSONObject A03;
                OE.this.A04 = true;
                od2 = OE.this.A0B;
                A03 = OE.this.A03();
                od2.AD0(A00(0, 4, 62), A03);
            }
        };
        this.A0H = new NY() { // from class: com.facebook.ads.redexgen.X.8l
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{28, 13, 25, 31, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A02 */
            public final void A03(C02466z c02466z) {
                OD od2;
                JSONObject A03;
                od2 = OE.this.A0B;
                A03 = OE.this.A03();
                od2.AD0(A00(0, 5, 49), A03);
            }
        };
        this.A0K = new M8() { // from class: com.facebook.ads.redexgen.X.8g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A00 */
            public final void A03(C02456y c02456y) {
                OE.this.A0H(c02456y);
                OE.this.A0A();
            }
        };
        this.A0F = new PO() { // from class: com.facebook.ads.redexgen.X.8S
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8V
            /* renamed from: A02 */
            public final void A03(AnonymousClass72 anonymousClass72) {
                OD od2;
                RA ra;
                JSONObject A04;
                OE.this.A07();
                od2 = OE.this.A0B;
                OE oe = OE.this;
                ra = oe.A0D;
                A04 = oe.A04(ra.getDuration());
                od2.AD0(A00(0, 9, 100), A04);
            }
        };
        this.A0G = new AnonymousClass89(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c0887Xc;
        this.A05 = abstractC0952Zs;
        this.A06 = c6m;
        this.A08 = c0513Ii;
        this.A09 = interfaceC0587Lj;
        this.A0A = mc;
        this.A0D = new RA(c0887Xc);
        this.A0B = od;
        this.A0D.setFunnelLoggingHandler(c0513Ii);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new AnonymousClass75(c0887Xc, interfaceC0505Ia, this.A0D, abstractC0952Zs.A0m());
        if (IK.A1R(this.A07)) {
            this.A0C = new PB(c0887Xc, interfaceC0505Ia, this.A0D, abstractC0952Zs.A0m(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A0h().A0D().A08()));
        A09();
        LL.A0M(this, this.A05.A0g().A01().A07(true));
        String videoUrl = abstractC0952Zs.A0h().A0D().A07();
        if (!TextUtils.isEmpty(videoUrl)) {
            C0634Ne.A00(c0887Xc, this, videoUrl);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new S4(this), IK.A0J(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new S3(this), IK.A0K(this.A07));
    }

    public void A0A() {
        this.A0B.AD0(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0h().A0D().A07())) {
            C02316g c02316g = new C02316g(this.A07);
            this.A0D.A0c(c02316g);
            c02316g.setImage(this.A05.A0h().A0D().A07());
        }
        C6G c6g = new C6G(this.A07, true, this.A08);
        this.A0D.A0c(c6g);
        this.A0D.A0c(new C0545Jq(c6g, PX.A03, true));
        this.A0D.A0c(new C6X(this.A07));
    }

    public void A0H(C02456y c02456y) {
        if (this.A0D.getState() == Q7.A02 && IK.A18(this.A07)) {
            this.A0D.postDelayed(new S2(this, c02456y), 5000L);
        }
    }

    public void A0I(String str) {
        this.A07.A0E().A2o(str);
        if (IK.A19(this.A07)) {
            A07();
            return;
        }
        InterfaceC0587Lj interfaceC0587Lj = this.A09;
        MC mc = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC0587Lj.A3t(mc.A6g());
        this.A09.A3t(this.A0A.A6b());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0h().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(PK.A02, 26);
        A08();
    }

    public final void A0O() {
        RA ra = this.A0D;
        if (ra != null) {
            if (!this.A02) {
                ra.A0a(PF.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        PB pb = this.A0C;
        if (pb != null) {
            pb.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        LL.A0T(this);
        LL.A0H(this.A0D);
        LL.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(PF.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == Q7.A06 || this.A00 == null) {
            return;
        }
        boolean z2 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z2 || z) {
            this.A0D.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0b(PK.A04, 25);
    }
}
