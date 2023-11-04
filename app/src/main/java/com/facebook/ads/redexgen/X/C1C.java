package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1C */
/* loaded from: assets/audience_network.dex */
public final class C1C implements Serializable {
    public static byte[] A0A = null;
    public static String[] A0B = {"R5DeYR6FKIddoQ1tNFb4QO1F3D7YHRG7", "hniB1BSXMiqlCD6U", "jhH7rQZzgqsha0FGspkq8z1DrJIjsBJk", "lw6F7y1SoSoTAEcdzLyYaN1xEC1Q2oWX", "ic1GHkKPsX6vyCRQCqNODZsBJ", "Aw8qdmnq9PbtDTR9ez9n3jUjtBry3vCr", "3as5zHbOptZ96SzIdP7nSqOic", "mvWErpvjRXL0vWcjCyiUNQO7TD5zouZh"};
    public static final long serialVersionUID = 85021702336014823L;
    public C1E A00;
    public C1F A01;
    public C1J A02;
    public C1M A03;
    public C1N A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            String[] strArr = A0B;
            if (strArr[3].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[2] = "LXXQrjhAH5CnLq5fKQjRUnrA3R85ks8i";
            strArr2[7] = "Vzc9rcIkwZ9oA3QEo9fi0aCOPKhgVZjz";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{61, 0, 84, 3, 29, 24, 24, 84, 21, 1, 0, 27, 25, 21, 0, 29, 23, 21, 24, 24, 13, 84, 27, 4, 17, 26, 84, 29, 26, 84, 47, 7, 17, 23, 7, 41, 7, airhockey.J_DISCONNECT, airhockey.J_BACK, airhockey.P_GAME_EXIT, airhockey.J_REWARD, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_DISCONNECT, airhockey.J_SDKVER, 124, 99, airhockey.J_GOO, airhockey.P_GAME_EXIT, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_INVITE, 15, 24, 25, 25, 2, 3, 50, 4, 14, 2, 3, 23, 21, 24, 24, 43, 0, 27, 43, 21, 23, 0, 29, 27, 26, 1, 3, 22, 7, 5, 13, 16, 27, 92, 93, 84, 89, 65, airhockey.J_ENEMYWIN, 91, 84, 81, 91, 83, airhockey.J_ENEMYWIN, 76, 93, 64, 76, 87, 86, 64, airhockey.P_GAME_MYWIN, 90, 93, 82, airhockey.P_GAME_MYWIN, 90, 92, 93, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYWIN, 90, airhockey.P_GAME_MYWIN, 95, 86, 56, 51, 57, 2, 62, 60, 47, 57, 2, 59, 50, 47, 62, 56, 2, 43, 52, 56, 42, 2, 41, 52, 48, 56, airhockey.P_GAME_EXIT, 65, 75, airhockey.J_GOO, 76, 78, 93, 75, airhockey.J_GOO, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_NATION, 78, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_EXIT, 92, 82, 86, 85, 80, airhockey.J_GAME_ENEMYEXIT, 87, 91, 89, 89, 85, 90, 80, 44, 46, 37, 46, 57, 34, 40, 20, 63, 46, 51, 63, 6, 11, 7, 9, 6, 26, 64, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 78, 76, 60, 38, 10, 39, 48, 34, 52, 39, 49, 48, 49, 10, 52, 49, 31, 5, 41, 0, 31, 18, 19, 25, 41, 23, 3, 18, 31, 25, 41, 27, 3, 2, 19, 18, airhockey.P_GAME_REMATCH, 83, ByteCompanionObject.MAX_VALUE, 87, 65, 84, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_MYLOSE, ByteCompanionObject.MAX_VALUE, 65, 78, airhockey.P_GAME_SELECTMAP, ByteCompanionObject.MAX_VALUE, airhockey.P_NATION, 82, 79, 87, 83, airhockey.P_GAME_STANDBY, 43, 56, 45, 48, 55, 62, 6, 58, 54, 44, 55, 45, 47, 60, 41, 52, 51, 58, 2, 43, 60, 49, 40, 56, airhockey.P_GAME_MYSCORE, 85, 83, 95, 94, 84, airhockey.P_GAME_MYSCORE, 111, 86, 95, airhockey.P_NATION, 111, airhockey.P_NATION, 85, airhockey.P_GAME_MYWIN, 81, airhockey.P_NATION, 84, 9, 18, 21, 13, 37, 31, 20, 30, 37, 25, 27, 8, 30, 43, 48, 55, 47, 7, 61, 32, 49, 44, 7, 44, 42, 57, 54, 43, 49, 44, 49, 55, 54, 48, 43, 44, 52, 28, 42, 45, 55, 49, 44, 28, 55, 49, 34, 45, 48, 42, 55, 42, 44, 45, airhockey.P_GAME_MYWIN, 95, 93, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_ENEMYEXIT, 85, 90, 80, airhockey.J_GAME_ENEMYEXIT, 88, 91, airhockey.P_GAME_MYWIN, 81, airhockey.J_GAME_ENEMYEXIT, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_MYSCORE, 85, airhockey.P_GAME_BREAKBALLCOUNT, 80, airhockey.J_GAME_REMATCH, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, airhockey.J_GAME_EXIT, 123, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_STANDBY, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_ERROR, airhockey.J_DISCONNECT, 126, airhockey.J_GAME_REMATCH, airhockey.P_GAME_BREAKBALLCOUNT, 90, 86, 92, 84, 89, airhockey.J_GAME_EXIT, 86, 90, 91, 65, 80, 77, 65, 52, 50, 37, 51, 46, 51, 43, 34, 76, 81, 76, 84, 93, airhockey.J_ERROR, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_GOO, airhockey.J_GOO, airhockey.J_SDKVER, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 95, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_STANDBY, 99, 111, airhockey.J_INVITE, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, 39, 32, 62, airhockey.J_REWARD, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 111, 95, airhockey.J_SDKVER, airhockey.J_ERROR, airhockey.J_DISCONNECT, 111, airhockey.J_GOO, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_WAIT, 95, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_SDKVER, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, 36, 59, 54, 55, 61, 13, 54, 39, 32, 51, 38, 59, 61, 60, 13, 33, 55, 49, airhockey.J_BACK, airhockey.J_INVITE, 99, airhockey.J_NATION, airhockey.J_ENEMYLOSE, 88, 119, airhockey.J_ERROR, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, 102, 99, 88, airhockey.J_DISCONNECT, airhockey.J_INVITE, 125, airhockey.J_NATION, 88, airhockey.J_GAME_STANDBY, 126, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, airhockey.J_DISCONNECT, 89, airhockey.P_GAME_BREAKBALLCOUNT, 75, airhockey.P_GAME_EXIT, 64, airhockey.J_GOO, 90, 93, airhockey.P_GAME_MYSCORE, 80, 78, airhockey.P_GAME_MYSCORE, 83, 79};
    }

    static {
        A03();
    }

    public static C1C A00(JSONObject jSONObject) {
        int optInt;
        C1C c1c = new C1C();
        c1c.A06(new C1I().A0H(jSONObject.optString(A01(HttpStatus.SC_METHOD_NOT_ALLOWED, 5, 2))).A0G(jSONObject.optString(A01(397, 8, 125))).A0B(jSONObject.optString(A01(53, 4, 45))).A0F(jSONObject.optString(A01(383, 14, 15))).A0E(jSONObject.optString(A01(262, 12, 103))).A0D(jSONObject.optString(A01(250, 12, 99))).A09(jSONObject.optString(A01(37, 16, 47))).A0A(jSONObject.optString(A01(82, 8, 88))).A0C(jSONObject.optString(A01(106, 17, 9))).A0I());
        c1c.A07(new C1M(jSONObject.optString(A01(162, 12, 14)), jSONObject.optString(A01(68, 14, 78)), jSONObject.optJSONObject(A01(57, 11, 87)), jSONObject.optString(A02(jSONObject))));
        String A01 = A01(HttpStatus.SC_GONE, 19, 58);
        if (jSONObject.optInt(A01, -1) == -1) {
            if (A0B[1].length() == 16) {
                A0B[5] = "m0SNHJxvul7tSRvrfYkKg9k0pQQtrIDe";
                optInt = jSONObject.optInt(A01(366, 17, 32), -1);
            }
            throw new RuntimeException();
        }
        optInt = jSONObject.optInt(A01, -1);
        C1E A0I = new C1E().A0K(jSONObject.optString(A01(496, 9, 21))).A0H(jSONObject.optLong(A01(472, 24, 61), -1L)).A0F(optInt).A0E(jSONObject.optInt(A01(274, 18, 10), Integer.MAX_VALUE)).A0I(C1X.A01(jSONObject));
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(192, 5, 19));
        if (optJSONObject != null) {
            C1E A0D = A0I.A0J(optJSONObject.optString(A01(429, 3, 104))).A0D(optJSONObject.optInt(A01(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 5, 29)));
            int unskippableSeconds = A0B[1].length();
            if (unskippableSeconds == 16) {
                A0B[5] = "WsiHjZ6Ab9OhwgLQk07kFOW3FmkdrPnz";
                A0D.A0C(optJSONObject.optInt(A01(186, 6, 84)));
            }
            throw new RuntimeException();
        }
        c1c.A04(A0I);
        c1c.A0C(jSONObject.optBoolean(A01(325, 21, 121)));
        c1c.A08(new C1N(C0568Kq.A04(jSONObject.optJSONArray(A01(147, 15, 21))), jSONObject.optLong(A01(123, 24, 103), 0L)));
        c1c.A09(jSONObject.optBoolean(A01(231, 19, 26)));
        return c1c;
    }

    public static String A02(JSONObject jSONObject) {
        String A01 = A01(90, 16, 2);
        String A012 = A01(0, 37, 78);
        String optString = jSONObject.optString(A01, A012);
        if (optString.equals(A012)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(174, 12, 113));
            if (optJSONObject != null) {
                A012 = optJSONObject.optString(A01, A012);
            }
            return A012;
        }
        return optString;
    }

    private void A04(C1E c1e) {
        this.A00 = c1e;
    }

    private final void A05(C1F c1f) {
        this.A01 = c1f;
    }

    private final void A06(C1J c1j) {
        this.A02 = c1j;
    }

    private final void A07(C1M c1m) {
        this.A03 = c1m;
    }

    private final void A08(C1N c1n) {
        this.A04 = c1n;
    }

    private final void A09(boolean z) {
        this.A06 = z;
    }

    private final void A0A(boolean z) {
        this.A07 = z;
    }

    private final void A0B(boolean z) {
        this.A08 = z;
    }

    private final void A0C(boolean z) {
        this.A09 = z;
    }

    public final C1F A0D() {
        return this.A01;
    }

    public final C1J A0E() {
        return this.A02;
    }

    public final C1M A0F() {
        return this.A03;
    }

    public final C1N A0G() {
        return this.A04;
    }

    public final void A0H(JSONObject jSONObject) {
        A05(this.A00.A0O());
    }

    public final void A0I(JSONObject jSONObject) {
        this.A00.A0M(jSONObject.optBoolean(A01(432, 22, 58)));
        this.A00.A0L(jSONObject.optBoolean(A01(211, 20, 76), true));
        A05(this.A00.A0O());
        A0L(jSONObject.optBoolean(A01(197, 14, 111)));
        A0A(jSONObject.optBoolean(A01(292, 13, 64)));
        A0B(jSONObject.optBoolean(A01(HttpStatus.SC_USE_PROXY, 20, 98)));
    }

    public final void A0J(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(211, 20, 76), true));
        A05(this.A00.A0O());
    }

    public final void A0K(JSONObject jSONObject) {
        this.A00.A0G(jSONObject.optInt(A01(454, 18, 104)));
        this.A00.A0L(jSONObject.optBoolean(A01(211, 20, 76), true));
        this.A00.A0N(jSONObject.optBoolean(A01(346, 20, 14), false));
        A05(this.A00.A0O());
        A0A(jSONObject.optBoolean(A01(292, 13, 64)));
    }

    public final void A0L(boolean z) {
        this.A05 = z;
    }

    public final boolean A0M() {
        return this.A05;
    }

    public final boolean A0N() {
        return this.A06;
    }

    public final boolean A0O() {
        return this.A07;
    }

    public final boolean A0P() {
        return this.A09;
    }
}
