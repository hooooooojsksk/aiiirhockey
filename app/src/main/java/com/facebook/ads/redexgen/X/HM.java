package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class HM implements QW {
    public static byte[] A01;
    public static String[] A02 = {"pV4qaXw6VxHe7sBZO1Jm7", "tYmmDZR", "QxtgKachTN194eYcwGU9LkTJFmNVHEQq", "xizWbh8OYfs2b3YS4RQSAfdZXrf", "ZGXkvbP8ihMVuHVBPcyrpbYPgwlZhzIP", "8ikrsMyeeixNpMm9GyoBY2XQC58AAuyp", "5oOpXt9UGuRFEd", "RP1a17xo5hy9tsnm95xYo1Dg0S3kboh6"};
    public final boolean A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, airhockey.P_GAME_EXIT, airhockey.J_INVITE, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 89, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 89, 23, 13, 19, 36, 34, 36, 40, 55, 36, airhockey.J_SDKVER, 52, 51, 45, 123, airhockey.J_SDKVER, 12, 43, 62, 43, 42, 44, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE};
    }

    static {
        A01();
    }

    public HM(boolean z) {
        this.A00 = z;
    }

    private void A02(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String header : map.get(str)) {
                    String str2 = str + A00(1, 1, 79) + header;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8o() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void A9R(HttpURLConnection httpURLConnection, Object obj) throws IOException {
        String str = httpURLConnection.getRequestMethod() + A00(0, 1, 13) + httpURLConnection.getURL().toString();
        if (obj instanceof String) {
            String str2 = A00(2, 9, 18) + ((String) obj);
        }
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        String[] strArr = A02;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "GaHF5freueg6l7URhKCrm47FqBCtqYBi";
        strArr2[5] = "OrzNjk0gyiryng1un1TYaQe8BXJyjneo";
        A02(requestProperties);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void A9S(QF qf) {
        if (qf != null) {
            String str = A00(11, 13, 126) + qf.getUrl();
            String str2 = A00(24, 8, 96) + qf.A7m();
            A02(qf.A6r());
        }
    }
}
