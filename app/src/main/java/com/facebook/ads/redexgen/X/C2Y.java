package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.2Y */
/* loaded from: assets/audience_network.dex */
public final class C2Y {
    public static byte[] A04;
    public static String[] A05 = {"XC94AwcgSvjgVkKSrw6USa9yjPBs64Er", "sEOY3yVdzVjZYc5fCydQIWNRtoI3Ep8p", "tsp8L53mE941fUp", "tfJ", "WI5YCVlpnY9sS2vUV4hGrlGwgmIaf2Io", "oZjWXXS8g7ghKD4scwMqufEnh", "pMetx8l337qhdnOFVjsjKuwa37", "eWa41C8ZyjQQf2L"};
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{109, 9, 8, 12, 9, airhockey.J_SDKVER, 39, 40, 45, 53, 36, 51, 124, ByteCompanionObject.MAX_VALUE, airhockey.P_GAME_MYLOSE, 78, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_SELECTMAP, 91, airhockey.P_GAME_MYLOSE, 95, 86, airhockey.P_NATION};
    }

    static {
        A01();
    }

    public C2Y(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(A00(13, 9, 62));
        sb.append(this.A02);
        sb.append(A00(5, 8, 82));
        sb.append(this.A03);
        if (this.A01) {
            sb.append(A00(0, 5, 94));
        }
        String A00 = A00(22, 1, 44);
        String[] strArr = A05;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A05[5] = "FUdb7WkfGlB";
        sb.append(A00);
        return sb.toString();
    }
}
