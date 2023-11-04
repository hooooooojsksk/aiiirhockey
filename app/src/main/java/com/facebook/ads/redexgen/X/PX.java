package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public enum PX {
    A05,
    A04,
    A03;
    
    public static byte[] A00;
    public static String[] A01 = {"7GN8MrenydislHWBBPReIB", "P5", "QDtKUFo4Pv7jZ7qumv108KMzWf6HrSMn", "iim9AI0VqZedzbhMlrV0qDo4YMl61NlV", "LtGcJkDv8PpKzGxu4pknm0pyAahoAI9h", "Z7tecEc8tS2JrzNmQM0R9CjEnjCb6ksC", "JuvL09EyJViLP4nPFPxPBzJM00GhcqAu", "kQTCJlS50BSCbahTVqCDmy8LW1L9RVvG"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{airhockey.P_NATION, airhockey.P_GAME_STANDBY, 64, 65, 91, 75, 81, 80, 91, 75, airhockey.P_GAME_EXIT, 91, 84, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_STANDBY, 93, airhockey.J_GAME_STANDBY, airhockey.J_NATION, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, 96, airhockey.J_GAME_REMATCH, 5, 26, 0, 26, 17, 31, 22};
    }

    static {
        A01();
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PX[] valuesCustom() {
        Object clone = values().clone();
        String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            A01[3] = "fXviZ9AMoZT5h2KBZwjslTMVyIobOTux";
            return (PX[]) clone;
        }
        throw new RuntimeException();
    }
}
