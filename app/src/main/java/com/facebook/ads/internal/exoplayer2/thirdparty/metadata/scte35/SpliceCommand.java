package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{90, airhockey.P_GAME_EXIT, 93, 76, 36, 58, 60, 41, airhockey.J_PURCHASE, airhockey.J_WAIT, airhockey.J_GAME_STANDBY, 96, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, 41, airhockey.J_GAME_EXIT, 102, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, airhockey.J_ENEMYWIN, 109, 51, 41, 125, airhockey.J_GOO, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, 52};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 66) + getClass().getSimpleName();
    }
}
