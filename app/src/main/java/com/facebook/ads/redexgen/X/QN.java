package com.facebook.ads.redexgen.X;

import com.google.android.gms.games.GamesStatusCodes;
import com.loopj.android.http.AsyncHttpClient;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class QN {
    public static byte[] A07;
    public QE A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT;
    public int A02 = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, 29, 4, 21, 17, 9, 17, 92, 14, 25, 8, 14, 21, 25, 15, 92, 17, 9, 15, 8, 92, 30, 25, 92, 30, 25, 8, 11, 25, 25, 18, 92, 77, 92, 29, 18, 24, 92, 77, airhockey.P_GAME_SELECTMAP};
    }

    public final QN A02(int i) {
        this.A00 = i;
        return this;
    }

    public final QN A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final QN A04(int i) {
        this.A02 = i;
        return this;
    }

    public final QN A05(int i) {
        this.A03 = i;
        return this;
    }

    public final QN A06(int i) {
        this.A04 = i;
        return this;
    }

    public final QN A07(QE qe) {
        this.A05 = qe;
        return this;
    }

    public final QN A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final QO A09() {
        return new QO(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
