package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class ZR implements InterfaceC01221v {
    public static byte[] A04;
    public static String[] A05 = {"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    public EnumC01211u A00 = EnumC01211u.A03;
    public EnumC01211u A01 = EnumC01211u.A03;
    public final ZO A02;
    public final C0887Xc A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            A05[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, 11, 6, -73, airhockey.J_REWARD, airhockey.J_ENEMYLOSE, -95, -73, -67, airhockey.J_ENEMYLOSE, -85, -87, -74, airhockey.J_ENEMYLOSE, -85, -80, -87, -74, -81, -83, airhockey.J_ENEMYLOSE, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, airhockey.J_ENEMYLOSE, -115, -70, -70, -73, -70, airhockey.J_ENEMYLOSE, -75, -73, -84, -83, airhockey.J_ENEMYLOSE, -86, -63, airhockey.J_ENEMYLOSE, -69, -83, -68, -68, -79, -74, -81, airhockey.J_ENEMYLOSE, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, airhockey.J_REWARD, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, airhockey.J_GOO, airhockey.J_BACK, airhockey.J_GOO, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, -97, -114, -109, -113, -104, -115, -113, airhockey.J_ACHIEVEMENTCALLBACK, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, airhockey.J_SAVEDGAME_SAVE, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, airhockey.J_WAIT, airhockey.J_PURCHASE, -63, -74, -67, -59, airhockey.J_REWARD, 119, 15, 3, -4, 15, -69, 4, 14, -69, -4, 7, 13, 0, -4, -1, 20, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, 13, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, ByteCompanionObject.MAX_VALUE, -56, -46, ByteCompanionObject.MAX_VALUE, -64, -53, -47, -60, -64, -61, -40, ByteCompanionObject.MAX_VALUE, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    static {
        A01();
    }

    public ZR(C0887Xc c0887Xc, ZO zo) {
        this.A03 = c0887Xc;
        this.A02 = zo;
    }

    private void A02(EnumC01211u enumC01211u, EnumC01211u enumC01211u2) {
        String A00 = A00(113, 26, 99);
        StringBuilder sb = new StringBuilder();
        String errorTitle = A00(108, 5, 54);
        sb.append(errorTitle);
        sb.append(enumC01211u);
        String errorTitle2 = A00(0, 4, 122);
        sb.append(errorTitle2);
        sb.append(enumC01211u2);
        String sb2 = sb.toString();
        InterfaceC02617r A07 = this.A03.A07();
        int i = C02627s.A0e;
        C02637t c02637t = new C02637t(A00, sb2);
        String errorTitle3 = A00(139, 3, 115);
        A07.A9C(errorTitle3, i, c02637t);
        String errorTitle4 = A00 + TokenParser.SP + sb2;
        this.A03.A0E().AGC(errorTitle4);
    }

    private void A03(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode A00 = C01181r.A00(this.A03);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(139, 3, 115);
        String A003 = A00(91, 17, 13);
        if (!z) {
            Log.e(A003, format);
            this.A03.A07().A9C(A002, C02627s.A0c, new C02637t(format));
            this.A03.A0E().AGB(format);
            return;
        }
        int i = C01201t.A00[A00.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A03.A0E().AGB(format);
                Log.e(A003, format);
                this.A03.A07().A9C(A002, C02627s.A0c, new C02637t(format));
            }
            Log.e(A003, format);
            return;
        }
        String errorMessage = format + A00(4, 87, 43);
        throw new C01231w(errorMessage);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final boolean A5M() {
        boolean z = (this.A00 == EnumC01211u.A03 || this.A00 == EnumC01211u.A05) && this.A01 != EnumC01211u.A08;
        if (z) {
            this.A00 = EnumC01211u.A07;
        } else {
            A03(A00(142, 6, 52), A00(154, 42, 126), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final boolean A5N() {
        boolean z = this.A00 == EnumC01211u.A06 && (this.A01 != EnumC01211u.A08 || IK.A0g(this.A03));
        if (z) {
            this.A00 = EnumC01211u.A03;
            this.A01 = EnumC01211u.A08;
        } else {
            EnumC01211u enumC01211u = this.A00;
            EnumC01211u enumC01211u2 = EnumC01211u.A06;
            String A00 = A00(148, 6, 49);
            if (enumC01211u != enumC01211u2) {
                A03(A00, A00(219, 18, 97), true);
            } else {
                A03(A00, A00(196, 23, 66), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final EnumC01211u A5f() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final void AEr(EnumC01211u enumC01211u) {
        this.A00 = enumC01211u;
        this.A01 = enumC01211u;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final void AEv(AdError adError) {
        this.A00 = EnumC01211u.A05;
        this.A01 = EnumC01211u.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final void AEz() {
        if (this.A00 != EnumC01211u.A07) {
            A02(this.A00, EnumC01211u.A06);
        }
        this.A00 = EnumC01211u.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01221v
    public final void AF9() {
        if (this.A01 != EnumC01211u.A08) {
            A02(this.A00, EnumC01211u.A09);
        }
        this.A01 = EnumC01211u.A09;
    }
}
