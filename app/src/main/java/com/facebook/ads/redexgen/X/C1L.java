package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1L */
/* loaded from: assets/audience_network.dex */
public final class C1L implements Serializable {
    public static byte[] A09 = null;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{37, 52, 53, 52, 49, 52, 64, 84, airhockey.P_GAME_MYSCORE, 21, airhockey.P_GAME_MYSCORE, 17, airhockey.P_NATION, 65, 4, 30, 23, 30, 19, 30, airhockey.P_GAME_SELECTMAP, 82, 23, airhockey.P_GAME_MYWIN, 23, airhockey.P_GAME_BREAKBALLCOUNT, 23, airhockey.P_GAME_MYLOSE, 58, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, 45, 41, 33, 41, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, 59, 57, 57, 63, 52, 46, 5, 57, 53, 54, 53, 40, airhockey.J_INVITE, airhockey.J_GAME_ENEMYEXIT, 83, 111, 99, 96, 99, 126, 57, 52, 63, 34, 4, 56, 52, 55, 52, 41, 13, 26, 15, 49, 13, 1, 2, 1, 28, airhockey.J_GAME_REMATCH, 126, airhockey.J_GAME_ENEMYEXIT, 85, airhockey.J_GAME_REMATCH, airhockey.J_GAME_STANDBY, 102, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 85, airhockey.J_GAME_STANDBY, 124, 111, airhockey.J_ACHIEVEMENTCALLBACK, 85, airhockey.J_ENEMYWIN, 111, airhockey.J_INVITE, 99, airhockey.J_GAME_ENEMYEXIT, 1, 22, 3, 61, 22, 7, 26, 22, 61, 1, 13, 14, 13, 16, 31, 8, 29, 35, 8, 25, 4, 8, 35, 31, 19, 16, 19, 14, 35, 19, 10, 25, 14, 35, 17, 25, 24, 21, 29, 43, 45, 58, 44, 49, 44, 52, 61, 7, 59, 55, 52, 55, 42, 83, 78, 83, 75, airhockey.P_NATION, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYLOSE, 75, airhockey.P_GAME_MYLOSE, 85};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(14, 7, 123));
        A0B = Color.parseColor(A02(7, 7, 43));
        A0C = Color.parseColor(A02(21, 7, 45));
        String A02 = A02(28, 9, 69);
        A0D = Color.parseColor(A02);
        A0E = Color.parseColor(A02(0, 7, 90));
        A0F = Color.parseColor(A02);
    }

    public C1L(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
        this.A08 = i9;
    }

    public static int A00(@Nullable JSONObject jSONObject, String str, int i) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i;
    }

    public static C1L A01(@Nullable JSONObject jSONObject) {
        return new C1L(A00(jSONObject, A02(37, 12, 6), A0A), A00(jSONObject, A02(57, 10, 7), A0B), A00(jSONObject, A02(135, 14, 4), ViewCompat.MEASURED_STATE_MASK), A00(jSONObject, A02(49, 8, 80), A0C), A00(jSONObject, A02(67, 9, 50), A0D), A00(jSONObject, A02(76, 20, 86), -1), A00(jSONObject, A02(96, 14, 62), -1), A00(jSONObject, A02(110, 25, 32), A0F), A00(jSONObject, A02(149, 11, 123), ViewCompat.MEASURED_STATE_MASK));
    }

    public final int A04(boolean z) {
        if (z) {
            return -1;
        }
        return this.A00;
    }

    public final int A05(boolean z) {
        if (z) {
            return -1;
        }
        return this.A01;
    }

    public final int A06(boolean z) {
        if (z) {
            return -1;
        }
        return this.A02;
    }

    public final int A07(boolean z) {
        return z ? A0E : this.A03;
    }

    public final int A08(boolean z) {
        return z ? this.A05 : this.A04;
    }

    public final int A09(boolean z) {
        return z ? this.A07 : this.A06;
    }

    public final int A0A(boolean z) {
        if (z) {
            return -1;
        }
        return this.A08;
    }
}
