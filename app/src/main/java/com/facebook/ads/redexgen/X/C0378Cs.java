package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Cs */
/* loaded from: assets/audience_network.dex */
public final class C0378Cs {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.VW A00(com.facebook.ads.redexgen.X.BW r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0378Cs.A00(com.facebook.ads.redexgen.X.BW):com.facebook.ads.redexgen.X.VW");
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{39, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_ERROR, 39, airhockey.J_SAVEDGAME_SAVE, 126, 119, airhockey.J_NATION, 39, 33, 58, 125, airhockey.J_ERROR, airhockey.J_INVITE, 32, 58, 123, 80, 77, 86, 83, 24, 81, 75, 24, 76, 87, 87, 24, 84, 89, airhockey.P_GAME_EXIT, 95, 93, 24, 16, airhockey.P_GAME_BREAKBALLCOUNT, 10, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, 19, 17, 24, 76, 87, 24, 75, 83, 81, airhockey.P_GAME_MYLOSE, 3, 24, 81, 92, 2, 24, 81, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_BACK, 119, 96, airhockey.J_BACK, airhockey.J_GOO, 52, airhockey.J_REWARD, airhockey.J_ACHIEVEMENTCALLBACK, 123, 119, ByteCompanionObject.MAX_VALUE, 52, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, 125, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, airhockey.J_WAIT, airhockey.J_BACK, airhockey.J_PURCHASE, 96, 46, 52, airhockey.J_ENEMYWIN, airhockey.P_GAME_REMATCH, 64, 65, 92, airhockey.P_GAME_MYWIN, 64, airhockey.P_GAME_REMATCH, 14, 91, 64, airhockey.P_GAME_STANDBY, 64, 65, 89, 64, 14, airhockey.J_WAIT, 111, airhockey.J_ACHIEVEMENTCALLBACK, 14, 77, airhockey.P_GAME_BREAKBALLCOUNT, 91, 64, airhockey.P_GAME_STANDBY, 20, 14, 6, 29, 18, 18, airhockey.J_GAME_EXIT, 81, 76, airhockey.P_GAME_EXIT, 79, 79, 80, 77, 75, 90, 91, 31, 109, airhockey.J_REWARD, airhockey.J_WAIT, airhockey.J_WAIT, 31, 89, 80, 77, 82, 94, 75, 5, 31, 20, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, airhockey.J_SDKVER, 22, 0, 23, airhockey.J_SDKVER, 35, 40, 53, airhockey.J_SDKVER, 37, 36, 49, 53, 41, airhockey.J_SDKVER, 111, 84, airhockey.P_GAME_REMATCH, 79, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 85, airhockey.P_GAME_MYLOSE, 78, 95, 94, 26, 109, 123, airhockey.J_GAME_DISCONNECT, 26, 92, 85, airhockey.P_GAME_MYLOSE, 87, 91, 78, 26, 78, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, 95, 0, 26, 126, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_DISCONNECT, 126, airhockey.P_GAME_MYLOSE, 95, airhockey.J_SDKVER, 76, airhockey.P_GAME_MYLOSE, 77, 76, 91, 123, 76, airhockey.P_GAME_MYLOSE, 77, 76, 91, 10, 15, 26, 15, airhockey.J_NATION, airhockey.J_GAME_REMATCH, airhockey.J_GOO, 36};
    }

    public static void A03(BW bw, VW vw) throws IOException, InterruptedException {
        HD.A01(bw);
        HD.A01(vw);
        bw.AES();
        C0483Hc c0483Hc = new C0483Hc(8);
        C0377Cr A002 = C0377Cr.A00(bw, c0483Hc);
        while (A002.A00 != C0499Hs.A08(A01(214, 4, 74))) {
            Log.w(A01(199, 15, 13), A01(83, 28, 10) + A002.A00);
            long j = A002.A01 + 8;
            if (A002.A00 == C0499Hs.A08(A01(111, 4, 112))) {
                j = 12;
            }
            if (j <= 2147483647L) {
                bw.AFJ((int) j);
                A002 = C0377Cr.A00(bw, c0483Hc);
            } else {
                throw new C9Y(A01(17, 40, 28) + A002.A00);
            }
        }
        bw.AFJ(8);
        vw.A06(bw.A7P(), A002.A01);
    }
}
