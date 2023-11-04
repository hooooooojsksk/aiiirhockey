package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0j */
/* loaded from: assets/audience_network.dex */
public final class C00850j {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{airhockey.J_GAME_STANDBY, 64, 4, 77, 87, 4, 77, airhockey.P_GAME_EXIT, 82, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, 77, 64, airhockey.P_GAME_STANDBY, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, airhockey.P_GAME_EXIT, 10, 10, 27, 2, 39, 38, 55, 38, 32, 55, 42, 44, 45, 28, 48, 55, 49, 42, 45, 36, 48, 35, 36, 60, 43, 38, 35, 46, 43, 62, 35, 37, 36, 21, 40, 47, 34, 43, 60, 35, 37, 56, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 96, airhockey.J_SDKVER, 123, 124, airhockey.J_ERROR};
    }

    static {
        A05();
    }

    public static EnumC00830h A00(JSONObject jSONObject) {
        return EnumC00830h.A00(jSONObject.optString(A02(52, 21, 114)));
    }

    public static InterfaceC00840i A01(C0887Xc c0887Xc, JSONObject jSONObject, String str) {
        return new C0983aN(jSONObject, c0887Xc, str);
    }

    @Nullable
    public static Collection<String> A03(C0887Xc c0887Xc, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 123));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e) {
            c0887Xc.A07().A9C(A02(73, 7, 42), C02627s.A2B, new C02637t(e));
        }
        return A04(jSONArray);
    }

    @Nullable
    public static Collection<String> A04(@Nullable JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A06(C0887Xc c0887Xc, InterfaceC00840i interfaceC00840i, InterfaceC0505Ia interfaceC0505Ia) {
        EnumC00830h A6w = interfaceC00840i.A6w();
        if (A6w != null) {
            EnumC00830h invalidationBehavior = EnumC00830h.A03;
            if (A6w != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A6U = interfaceC00840i.A6U();
                if (A6U == null || A6U.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A6U.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (C0571Kt.A04(c0887Xc, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC00830h invalidationBehavior2 = EnumC00830h.A02;
                if (packageInstalled != (A6w == invalidationBehavior2)) {
                    return false;
                }
                String A6B = interfaceC00840i.A6B();
                boolean isEmpty = TextUtils.isEmpty(A6B);
                String[] strArr = A01;
                String clientToken = strArr[7];
                if (clientToken.charAt(25) != strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
                if (!isEmpty) {
                    interfaceC0505Ia.A9I(A6B, null);
                    return true;
                }
                c0887Xc.A07().A9C(A02(32, 3, 83), C02627s.A0Z, new C02637t(A02(0, 32, 28)));
                return true;
            }
        }
        return false;
    }
}
