package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1X */
/* loaded from: assets/audience_network.dex */
public final class C1X implements Serializable {
    public static byte[] A0D = null;
    public static String[] A0E = {"U8UpqfD5GcCjHjfawFZje9GDKAZv", "HUavThSyJs21QkbQiVkA2MVijDNZ2nZM", "IARTRQxD0JaHLqaDLyMBN", "Hsg2CAAgFk1Vd6W6cseJD0UtB0g0pB8N", "UbckorOyb4FxR7xZ8GphAvSWlQBuZ4z3", "t3UgO82iTBj4Je3asj0XN1i1cbfA", "fleIFkN77EtPYIR4IZjCzdODP1NyIKiN", "OPDxW3mvsrdjNTdOIjiPk89aFloqol7I"};
    public static final C1Y A0F;
    public static final NB A0G;
    public static final long serialVersionUID = -5352540123250859603L;
    public String A00;
    public final int A01;
    public final int A02;
    public final C1Y A03;
    public final NB A04;
    public final String A05;
    public final String A06;
    public final String A07;
    @Nullable
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0E[6].charAt(18) == 'U') {
                throw new RuntimeException();
            }
            A0E[2] = "FjEz07QReKngvCKAACpwo";
            copyOfRange[i4] = (byte) (i5 ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0D = new byte[]{124, 64, 77, 85, 12, ByteCompanionObject.MAX_VALUE, 88, airhockey.P_GAME_MYSCORE, 94, airhockey.P_GAME_REMATCH, 12, 91, airhockey.P_GAME_STANDBY, 64, 64, 12, 77, 89, 88, airhockey.P_GAME_MYSCORE, 65, 77, 88, airhockey.P_GAME_STANDBY, 79, 77, 64, 64, 85, 12, airhockey.P_GAME_MYSCORE, 92, airhockey.P_GAME_REMATCH, airhockey.P_NATION, 12, airhockey.P_GAME_STANDBY, airhockey.P_NATION, 12, 119, 95, airhockey.P_GAME_REMATCH, 79, 95, airhockey.J_BACK, 95, 65, airhockey.J_REWARD, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SDKVER, 119, airhockey.J_REWARD, 119, 51, airhockey.P_GAME_MYSCORE, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_EXIT, 80, 95, 90, 86, 93, airhockey.P_GAME_MYWIN, airhockey.J_GAME_DISCONNECT, airhockey.P_GAME_MYWIN, 92, 88, 86, 93, 82, airhockey.P_GAME_STANDBY, 111, airhockey.J_INVITE, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, airhockey.J_SAVEDGAME_RELOAD, 84, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, airhockey.J_NATION, airhockey.J_ENEMYLOSE, 96, 84, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, 54, 61, 50, 49, 63, 54, 12, 54, 61, 55, 12, 48, 50, 33, 55, airhockey.P_GAME_SELECTMAP, 79, 64, airhockey.P_GAME_MYSCORE, 77, airhockey.P_GAME_SELECTMAP, 126, airhockey.P_GAME_MYLOSE, 79, 85, 83, 78, 126, airhockey.P_NATION, 64, 83, airhockey.P_GAME_STANDBY, 20, 22, 29, 22, 1, 26, 16, 44, 7, 22, 11, 7, airhockey.J_GOO, 119, airhockey.J_GAME_EXIT, 109, airhockey.J_ACHIEVEMENTCALLBACK, 119, airhockey.J_PURCHASE, 124, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_GOO, 125, 34, 37, 63, 57, 36, 20, 40, 42, 57, 47, 20, 34, 40, 36, 37, 20, 62, 57, 39, airhockey.J_GOO, airhockey.J_GAME_EXIT, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_GAME_REMATCH, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, 96, airhockey.J_ACHIEVEMENTCALLBACK, 123, airhockey.J_ERROR, 124, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_GAME_ENEMYEXIT, 124, airhockey.J_DISCONNECT, airhockey.J_REWARD, 109, 124, airhockey.P_GAME_BREAKBALLCOUNT, ByteCompanionObject.MAX_VALUE, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, 109, 83, 78, 85, 89, 82, airhockey.P_GAME_MYLOSE, 93, airhockey.P_GAME_MYLOSE, 85, 83, 82, 56, 36, 41, 49, 41, 42, 36, 45, 23, 44, 41, 60, 41, 52, 54, 33, 39, 37, 39, 44, 45, 42, 35, 27, 41, 33, 48, 44, 43, 32, 2, 21, 7, 17, 2, 20, 21, 20, 47, 0, 28, 17, 9, 47, 4, 21, 8, 4, 87, 79, 77, 84, 84, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYLOSE, 65, 123, 87, 65, airhockey.P_GAME_MYWIN, 75, airhockey.P_GAME_EXIT, 64, 87, airhockey.J_GAME_STANDBY, 126, 99, 123, airhockey.J_WAIT, 96, 96, airhockey.J_BACK, airhockey.J_SAVEDGAME_RELOAD, 124, airhockey.J_ERROR, 79, 99, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, ByteCompanionObject.MAX_VALUE, 126, airhockey.J_DISCONNECT, 99, 75, 76, 87, 1, 19, 20, 41, 0, 31, 19, 1, 41, 2, 31, 27, 19, 25, 3, 2, 41, 31, 24, 41, 27, 31, 26, 26, 31, 5, 19, 21, 25, 24, 18, 5};
    }

    static {
        A06();
        A0G = NB.A05;
        A0F = C1Y.A03;
    }

    public C1X(String str, String str2, int i, String str3, String str4, NB nb, int i2, boolean z, boolean z2, C1Y c1y, boolean z3, String str5) {
        if (z3) {
            this.A08 = UUID.randomUUID().toString();
            Uri uri = KT.A00(str).buildUpon().appendQueryParameter(A03(132, 11, 111), this.A08).appendQueryParameter(A03(58, 12, 69), str5).build();
            this.A07 = uri.toString();
        } else {
            this.A07 = str;
            this.A08 = null;
        }
        this.A06 = str2;
        this.A01 = i;
        this.A09 = str3;
        this.A05 = str4;
        this.A04 = nb;
        this.A02 = i2;
        this.A0B = z;
        this.A0A = z2;
        this.A03 = c1y;
        this.A0C = z3;
    }

    public static int A00(JSONObject jSONObject) {
        String A03 = A03(246, 17, 82);
        if (jSONObject.has(A03)) {
            return jSONObject.optInt(A03);
        }
        return jSONObject.optInt(A03(263, 19, 102), 0);
    }

    @Nullable
    public static C1X A01(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(198, 13, 62));
        if (optJSONObject == null) {
            return null;
        }
        C1Y precachingMethod = C1Y.A00(optJSONObject.optString(A03(211, 17, 50), A0F.name()));
        return new C1X(optJSONObject.optString(A03(282, 3, 72)), optJSONObject.optString(A03(143, 19, 61)), A00(jSONObject), A05(optJSONObject), A04(optJSONObject), A02(optJSONObject), optJSONObject.optInt(A03(285, 32, 0), 5000), optJSONObject.optBoolean(A03(103, 17, 87), true), optJSONObject.optBoolean(A03(88, 15, 37)), precachingMethod, optJSONObject.optBoolean(A03(162, 25, 111)), jSONObject.optString(A03(70, 2, 71)));
    }

    public static NB A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(187, 11, 74), A0G.A03());
        return NB.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(120, 12, 5));
        String A03 = A03(0, 45, 90);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(72, 16, 125), A03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(120, 12, 5));
        String A03 = A03(45, 13, 101);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(228, 18, 6), A03);
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        return this.A02;
    }

    public final C1Y A09() {
        return this.A03;
    }

    public final NB A0A() {
        return this.A04;
    }

    public final String A0B() {
        return this.A00;
    }

    public final String A0C() {
        return this.A05;
    }

    public final String A0D() {
        return this.A06;
    }

    public final String A0E() {
        return this.A07;
    }

    @Nullable
    public final String A0F() {
        return this.A08;
    }

    public final String A0G() {
        return this.A09;
    }

    public final void A0H(String str) {
        this.A00 = str;
    }

    public final boolean A0I() {
        return this.A0B;
    }

    public final boolean A0J() {
        return this.A0C;
    }
}
