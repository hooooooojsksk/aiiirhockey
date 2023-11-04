package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class KY {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<JD, JF> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, airhockey.P_GAME_EXIT, 30, 93, 76, 91, 95, airhockey.P_GAME_EXIT, 91, 30, ByteCompanionObject.MAX_VALUE, 90, 109, 87, airhockey.P_GAME_SELECTMAP, 91, 30, 75, 77, 87, 80, 89, 30, airhockey.P_GAME_EXIT, 86, 87, 77, 30, airhockey.P_GAME_REMATCH, 87, 90, airhockey.P_GAME_EXIT, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, airhockey.P_GAME_EXIT, 16, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYLOSE, 77, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 81, airhockey.P_GAME_MYLOSE, 6, airhockey.J_ENEMYWIN, airhockey.P_NATION, airhockey.J_ERROR, 79, 92, airhockey.P_GAME_MYSCORE, 6, 82, 95, 86, airhockey.P_GAME_MYSCORE, 8};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(JD.A08, JF.A0C);
        A02.put(JD.A06, JF.A0E);
        A02.put(JD.A05, JF.A0D);
    }

    public static AdSize A00(JD jd) {
        return AdSize.fromWidthAndHeight(jd.A03(), jd.A02());
    }

    public static AdSize A01(JF jf) {
        for (Map.Entry<JD, JF> entry : A02.entrySet()) {
            if (entry.getValue() == jf) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static JD A02(int i) {
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        if (i == 100) {
                            return JD.A07;
                        }
                        throw new IllegalArgumentException(A06(48, 20, 63));
                    }
                    return JD.A08;
                }
                return JD.A06;
            }
            return JD.A05;
        }
        return JD.A04;
    }

    public static JD A03(int i, int i2) {
        if (JD.A07.A02() == i2 && JD.A07.A03() == i) {
            JD jd = JD.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return jd;
        } else if (JD.A04.A02() == i2 && JD.A04.A03() == i) {
            return JD.A04;
        } else {
            if (JD.A05.A02() == i2 && JD.A05.A03() == i) {
                JD jd2 = JD.A05;
                if (A01[1].charAt(1) != 'd') {
                    String[] strArr2 = A01;
                    strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
                    strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
                    return jd2;
                }
                throw new RuntimeException();
            } else if (JD.A06.A02() == i2 && JD.A06.A03() == i) {
                return JD.A06;
            } else {
                if (JD.A08.A02() == i2 && JD.A08.A03() == i) {
                    return JD.A08;
                }
                throw new IllegalArgumentException(A06(0, 48, 39));
            }
        }
    }

    public static JD A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static JF A05(JD jd) {
        JF adTemplate = A02.get(jd);
        if (adTemplate == null) {
            JF jf = JF.A0F;
            if (A01[1].charAt(1) != 'd') {
                String[] strArr = A01;
                strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
                strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
                return jf;
            }
            throw new RuntimeException();
        }
        return adTemplate;
    }
}
