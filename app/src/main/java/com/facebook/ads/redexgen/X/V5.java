package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class V5 implements FT {
    public static byte[] A00;
    public static String[] A01 = {"WhhTtmL3IE0OcmfXWkhGt3DJMBKWOPru", "IevVaXk7JqzzQUabSVzCZHFLz34", "JQeKeaIRvnKict07eDImxsw0zmpeeDwJ", "rs4XVQZ55s40EhV5j5mU6ZQA9Y9rRaIz", "SJPDpX1Ek2cYyhaXJ8Sq3wDJ6OH3a64q", "ZrPZtqAmah23MQGa5C4AxOobVPmeO1Q6", "YNQWbrIx5dPz4M9Oia0FZFMQh4yL9BRJ", ""};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(9) == strArr[6].charAt(9)) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[7] = "";
            strArr2[1] = "4dyVwnIREhtUy8kbUvz4COx2efs";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] ^ i3) ^ 91;
            String[] strArr3 = A01;
            if (strArr3[3].charAt(9) == strArr3[6].charAt(9)) {
                break;
            }
            String[] strArr4 = A01;
            strArr4[2] = "YKvNYNoIe7sickVZlze0IU3YAzLP0yRC";
            strArr4[0] = "QfLwrAzJ9MWwcUOLXpFOoivgYgfoEA7m";
            copyOfRange[i4] = (byte) i5;
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        byte[] bArr = {airhockey.P_GAME_EXIT, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, 102, 123, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, 111, 43, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, 43, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_INVITE, airhockey.J_GAME_EXIT, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, 43, 111, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, 111, airhockey.J_INVITE, airhockey.J_WAIT, 43, 109, airhockey.J_ONREWARDED, airhockey.J_WAIT, 43, 126, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 126, 123, 123, airhockey.J_ONREWARDED, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, 111, 43, 109, airhockey.J_ONREWARDED, airhockey.J_WAIT, 102, airhockey.J_GAME_EXIT, ByteCompanionObject.MAX_VALUE, 77, 92, 92, 64, airhockey.P_GAME_STANDBY, 79, 77, 88, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 3, 79, airhockey.P_GAME_REMATCH, 77, 1, 26, 28, 20, 15, 30, 30, 2, 7, 13, 15, 26, 7, 1, 0, 65, 13, 11, 15, airhockey.P_GAME_MYSCORE, 89, 94, 86, 89, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, 84, 81, 91, 89, 76, 81, 87, 86, 23, 92, 78, 90, 75, 77, 90, 75, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 5, 18, 6, 56, 41, 41, 53, 48, 58, 56, 45, 48, 54, 55, airhockey.J_REWARD, 45, 45, 52, 53, airhockey.J_SAVEDGAME_RELOAD, 33, 52, 53, 86, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYWIN, 91, 94, 84, 86, airhockey.P_GAME_MYSCORE, 94, 88, 89, 24, 79, 26, 90, airhockey.P_GAME_MYWIN, 3, 26, 84, 82, 86, 26, 1, 7, 15, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, airhockey.J_PURCHASE, 102, 99, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 126, 99, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, 37, airhockey.J_SAVEDGAME_RELOAD, 39, airhockey.J_ENEMYWIN, airhockey.J_PURCHASE, 62, 39, 124, 126, 126, 119, 102, 102, airhockey.J_PURCHASE, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, 119, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 57, airhockey.J_INVITE, 59, airhockey.J_ENEMYWIN, 99, ByteCompanionObject.MAX_VALUE, airhockey.J_ERROR, 125, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, 123, airhockey.J_SAVEDGAME_SAVE, 59, airhockey.J_NATION, airhockey.J_INVITE, 37, airhockey.J_BACK, 49, 32, 32, 60, 57, 51, 49, 36, 57, 63, 62, ByteCompanionObject.MAX_VALUE, 40, 125, 35, 37, 50, 34, 57, 32, 26, 11, 22, 26, 65, 24, 26, 26, airhockey.J_INVITE, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_INVITE, 53, airhockey.J_NATION, 55, airhockey.J_GAME_REMATCH, airhockey.J_GAME_REMATCH, 123};
        String[] strArr = A01;
        if (strArr[7].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "";
        strArr2[1] = "2GwQ5PhYbi899tQyrHJTlEvTlhB";
        A00 = bArr;
    }

    static {
        A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x000d  */
    @Override // com.facebook.ads.redexgen.X.FT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.V6 A4J(com.facebook.ads.internal.exoplayer2.thirdparty.Format r6) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.V5.A4J(com.facebook.ads.internal.exoplayer2.thirdparty.Format):com.facebook.ads.redexgen.X.V6");
    }

    @Override // com.facebook.ads.redexgen.X.FT
    public final boolean AFZ(Format format) {
        String str = format.A0O;
        String mimeType = A00(236, 8, 53);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 65);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 2);
                if (!mimeType3.equals(str)) {
                    String[] strArr = A01;
                    if (strArr[4].charAt(2) != strArr[5].charAt(2)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[2] = "loep2I6zPFVtcRcjqtJxRjX9IyStAKeo";
                    strArr2[0] = "undYhYHmNoLvcT1DYiuXgnR63VlRVc3K";
                    String mimeType4 = A00(167, 21, 81);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 11);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 77);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 119);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(142, 25, 108);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 53);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 99);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 46);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
