package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;
import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1B */
/* loaded from: assets/audience_network.dex */
public abstract class C1B implements Serializable {
    public static byte[] A0H = null;
    public static final long serialVersionUID = -8352540727250859603L;
    public int A01;
    public long A02;
    public RewardData A03;
    public String A04;
    @Nullable
    public String A05;
    @Nullable
    public String A06;
    public String A07;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public String A08 = A01(0, 0, 100);
    public int A00 = 200;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{111, 109, 126, 99, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_REMATCH, 96, 42, 33, 40, 32, 39, 22, 57, 40, 59, 40, 36, 58, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 59, 60, 33, 60, 33, 41, 36, 102, 43, 36, 33, 43, 35, 45, 44, airhockey.J_NATION, airhockey.J_ERROR, airhockey.J_GAME_EXIT, 89, airhockey.J_INVITE, 111, airhockey.J_NATION, 99, 89, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_GOO, 111, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_SAVEDGAME_RELOAD, 111, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, 89, 99, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_ONREWARDED, airhockey.J_GAME_EXIT, 99, airhockey.J_NATION, 2, 21, 10, 57, 14, 21, 57, 3, 8, 7, 4, 10, 3, 2, 87, 64, 95, airhockey.J_GAME_DISCONNECT, 91, airhockey.P_GAME_EXIT, 81, 65, 90, 87, airhockey.J_GAME_DISCONNECT, 86, 93, 82, 81, 95, 86, 87, airhockey.J_BACK, airhockey.J_GAME_DISCONNECT, 123, airhockey.J_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, 124, airhockey.J_REWARD, airhockey.P_GAME_EXIT, 102, airhockey.J_BACK, 126, airhockey.P_GAME_EXIT, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.J_GAME_DISCONNECT, airhockey.J_GOO, airhockey.J_ENEMYWIN, airhockey.P_GAME_EXIT, 125, airhockey.J_SDKVER, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_WAIT, airhockey.P_GAME_EXIT, 96, airhockey.J_ENEMYWIN, airhockey.J_WAIT, 87, 92, 81, 64, 75, airhockey.P_NATION, airhockey.P_GAME_BREAKBALLCOUNT, 87, 86, 109, 81, airhockey.P_NATION, 95, 94, 89, airhockey.P_GAME_MYSCORE, 82, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 94, airhockey.P_GAME_MYSCORE, 94, 86, 91, 15, 0, 21, 8, 23, 4, airhockey.J_SDKVER, airhockey.J_REWARD, airhockey.J_NATION, 102, airhockey.J_REWARD, 96, airhockey.J_ENEMYWIN, 76, airhockey.J_PURCHASE, 119, 48, 39, 53, 35, 48, 38, 39, 38, 29, 52, 43, 38, 39, 45, 81, 78, airhockey.P_NATION, 80, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_STANDBY, 78, 75, 78, 83, 94, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_SELECTMAP, 79, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, 76, airhockey.J_ACHIEVEMENTCALLBACK, 78, airhockey.P_GAME_REMATCH, 78, 83, 78, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 75, airhockey.P_GAME_BREAKBALLCOUNT, 94, 32, 63, 51, 33, 55, 52, 63, 58, 63, 34, 47, 9, 53, 62, 51, 53, 61, 9, 63, 56, 34, 51, 36, 32, 55, 58};
    }

    public abstract int A0C();

    public abstract int A0D();

    public static C1B A00(JSONObject jSONObject, C0887Xc c0887Xc) {
        boolean has = jSONObject.has(A01(8, 12, 113));
        boolean z = false;
        JSONArray optJSONArray = jSONObject.optJSONArray(A01(0, 8, 52));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            z = true;
        }
        C1B c1b = null;
        if (has) {
            try {
                c1b = C0950Zq.A02(jSONObject, c0887Xc);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (c1b == null) {
            has = false;
            c1b = C0427Eu.A02(jSONObject, c0887Xc);
        }
        c1b.A09(has);
        c1b.A08(z);
        return c1b;
    }

    private void A03(int i) {
        this.A01 = i;
    }

    private void A04(String str) {
        this.A04 = str;
    }

    private void A05(@Nullable String str) {
        this.A05 = str;
    }

    private void A06(String str) {
        this.A09 = str;
    }

    private void A07(JSONObject jSONObject) {
        this.A08 = jSONObject.toString();
    }

    private final void A08(boolean z) {
        this.A0E = z;
    }

    private final void A09(boolean z) {
        this.A0F = z;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A0G;
    }

    public final long A0E() {
        return this.A02;
    }

    @Nullable
    public final RewardData A0F() {
        return this.A03;
    }

    public final String A0G() {
        char c;
        String str = this.A07;
        int hashCode = str.hashCode();
        if (hashCode == -1364000502) {
            if (str.equals(A01(183, 14, 122))) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -1052618729) {
            if (hashCode == 604727084 && str.equals(A01(155, 12, 15))) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(A01(167, 6, 89))) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return A01(0, 0, 100);
                }
                return PM.A03.A02();
            }
            return PN.A04.A02();
        }
        return A01(20, 37, 112);
    }

    public final String A0H() {
        return this.A04;
    }

    @Nullable
    public final String A0I() {
        return this.A05;
    }

    @Nullable
    public final String A0J() {
        return this.A06;
    }

    public final String A0K() {
        return this.A07;
    }

    public final String A0L() {
        return this.A09;
    }

    public final String A0M() {
        return this.A0A;
    }

    public final JSONObject A0N() {
        try {
            return new JSONObject(this.A08);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A0O(int i) {
        this.A00 = i;
    }

    public final void A0P(long j) {
        this.A02 = j;
    }

    public final void A0Q(RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0R(@Nullable String str) {
        this.A06 = str;
    }

    public final void A0S(String str) {
        this.A07 = str;
    }

    public final void A0T(String str) {
        this.A0A = str;
    }

    public final void A0U(JSONObject jSONObject) {
        String A01 = A01(0, 0, 100);
        A06(jSONObject.optString(A01(173, 10, 43), A01));
        A05(jSONObject.optString(A01(142, 13, 10)));
        A07(jSONObject);
        A03(jSONObject.optInt(A01(197, 31, 31), 0));
        A0O(jSONObject.optInt(A01(228, 26, 110), 1000));
        A04(jSONObject.optString(A01(116, 26, 45), A01));
        this.A0C = jSONObject.optBoolean(A01(84, 14, 94));
        this.A0D = jSONObject.optBoolean(A01(98, 18, 11));
        this.A0B = jSONObject.optBoolean(A01(57, 27, 62), true);
    }

    public final boolean A0V() {
        return this.A0C;
    }

    public final boolean A0W() {
        return this.A0D;
    }

    public final boolean A0X() {
        return this.A0B;
    }

    public final boolean A0Y() {
        return this.A0E;
    }

    public final boolean A0Z() {
        return this.A0F;
    }

    public final boolean A0a() {
        return Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(A0H());
    }
}
