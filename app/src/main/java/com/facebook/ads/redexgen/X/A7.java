package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

@TargetApi(21)
/* loaded from: assets/audience_network.dex */
public final class A7 {
    public static byte[] A02;
    public static final A7 A03;
    public final int A00;
    public final int[] A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{95, 83, -90, -88, -93, -93, -94, -91, -89, -104, -105, airhockey.J_ACHIEVEMENTCALLBACK, -95, -106, -94, -105, -100, -95, -102, -90, airhockey.J_GOO, airhockey.J_INVITE, -94, -111, -106, -100, airhockey.J_GOO, -114, -99, -114, -113, -106, -103, -106, -95, -106, -110, -96, -120, -102, -114, -91, airhockey.J_GOO, -107, -114, -101, -101, -110, -103, airhockey.J_GOO, -100, -94, -101, -95, airhockey.J_GAME_EXIT, -122, -116, -103, -113, -99, -102, -108, -113, 89, -104, -112, -113, -108, -116, 89, -116, -114, -97, -108, -102, -103, 89, airhockey.J_SAVEDGAME_SAVE, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_DISCONNECT, -118, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MIN_VALUE, 111, airhockey.J_DISCONNECT, airhockey.J_PURCHASE, -118, 123, 119, ByteCompanionObject.MIN_VALUE, airhockey.J_SAVEDGAME_RELOAD, -93, -80, -90, -76, -79, -85, -90, airhockey.J_GOO, -81, -89, -90, -85, -93, airhockey.J_GOO, -89, -70, -74, -76, -93, airhockey.J_GOO, -125, -105, -122, -117, -111, -95, -110, -114, -105, -119, -95, -107, -106, -125, -106, -121, 126, -117, -127, -113, -116, -122, -127, 75, -118, -126, -127, -122, 126, 75, -126, -107, -111, -113, 126, 75, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, 102, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_GOO, ByteCompanionObject.MAX_VALUE, -116, -126, -112, -115, -121, -126, 76, -117, -125, -126, -121, ByteCompanionObject.MAX_VALUE, 76, -125, -106, -110, -112, ByteCompanionObject.MAX_VALUE, 76, airhockey.J_GAME_ENEMYEXIT, 95, airhockey.J_REWARD, 125, airhockey.J_SDKVER, 102, 95, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_DISCONNECT, 99, airhockey.J_GAME_EXIT, 125, airhockey.J_SDKVER, 109, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_DISCONNECT, airhockey.J_SAVEDGAME_RELOAD};
    }

    static {
        A03();
        A03 = new A7(new int[]{2}, 2);
    }

    public A7(int[] iArr, int i) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public static A7 A00(Context context) {
        return A01(context.registerReceiver(null, new IntentFilter(A02(56, 36, 42))));
    }

    @SuppressLint({"InlinedApi"})
    public static A7 A01(Intent intent) {
        if (intent == null || intent.getIntExtra(A02(92, 36, 65), 0) == 0) {
            return A03;
        }
        return new A7(intent.getIntArrayExtra(A02(128, 29, 28)), intent.getIntExtra(A02(157, 37, 29), 0));
    }

    public final boolean A04(int i) {
        return Arrays.binarySearch(this.A01, i) >= 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A7) {
            A7 a7 = (A7) obj;
            return Arrays.equals(this.A01, a7.A01) && this.A00 == a7.A00;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A02(21, 34, 44) + this.A00 + A02(0, 21, 50) + Arrays.toString(this.A01) + A02(55, 1, 40);
    }
}
