package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class HV {
    public static byte[] A00;
    public static String[] A01 = {"ieRwpCtuK3Uo85cjZEKrdCd37bpimhtY", "SWj8fz5xlO0E25uIaEG5QR97PjyPRjqc", "qo9VJyE5iR063JUt4OVQofS18tUFAamR", "Gteq1bVQSr5XKs4A7OlOChfT", "PlUSU1U83lKSeB2O5clYiMU4GGCz", "temwCY24a07Ffi16KYvyo8ZHegbdFSBA", "rqFjIUeqZXsH", "sifdD3H0nhYqlD5Nup1ZT"};
    public static final ArrayList<HU> A02;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].length() == 2) {
                throw new RuntimeException();
            }
            A01[6] = "B0XYBYFpMcx2";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
            i4++;
        }
    }

    public static void A08() {
        A00 = new byte[]{92, -127, -119, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, 124, 119, 51, ByteCompanionObject.MIN_VALUE, 124, ByteCompanionObject.MIN_VALUE, airhockey.J_ACHIEVEMENTCALLBACK, 51, -121, -116, -125, airhockey.J_ACHIEVEMENTCALLBACK, 77, 51, -56, -54, -108, -102, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -30, -28, -32, -84, -75, -81, -73, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, airhockey.J_ERROR, -87, -85, -89, airhockey.J_SAVEDGAME_SAVE, 125, airhockey.J_REWARD, 126, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -52, -34, -54, -37, -35, -54, -37, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, airhockey.J_GAME_REMATCH, -93, -98, 109, -81, -66, -66, -70, -73, -79, -81, -62, -73, -67, -68, 125, -66, -75, -63, -85, -70, -70, -74, -77, -83, -85, -66, -77, -71, -72, airhockey.J_WAIT, -66, -66, -73, -74, airhockey.J_ERROR, -62, -73, -74, -127, -112, -112, -116, -119, -125, -127, -108, -119, -113, -114, 79, -106, -113, -126, -109, -107, -126, -96, -81, -81, -85, -88, -94, -96, -77, -88, -82, -83, airhockey.J_INVITE, -73, airhockey.J_GAME_DISCONNECT, -94, -96, -84, -92, -79, -96, airhockey.J_GAME_DISCONNECT, -84, -82, -77, -88, -82, -83, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -17, -92, -36, -28, -22, -34, -18, -3, -3, -7, -10, -16, -18, 1, -10, -4, -5, -68, 5, -70, -6, -3, -63, -70, -16, -14, -18, -70, -61, -67, -59, -70, -55, -55, -59, -62, -68, -70, -51, -62, -56, -57, -120, -47, -122, -58, -55, -115, -122, -49, -51, -51, -100, -85, -85, -89, -92, -98, -100, -81, -92, -86, -87, airhockey.J_GAME_EXIT, -77, airhockey.J_ENEMYLOSE, -84, -80, -92, -98, -90, -81, -92, -88, -96, airhockey.J_ENEMYLOSE, -81, -77, airhockey.J_INVITE, -94, -93, -78, -78, -82, -85, -91, -93, -74, -85, -79, -80, airhockey.J_BACK, -70, 111, -76, -93, -71, -91, -91, 119, -122, -122, -126, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, 119, -118, ByteCompanionObject.MAX_VALUE, -123, -124, airhockey.P_GAME_STANDBY, -114, airhockey.P_GAME_MYSCORE, -119, airhockey.J_WAIT, -118, 123, airhockey.P_GAME_REMATCH, 75, 124, -117, -117, -121, -124, 126, 124, -113, -124, -118, -119, airhockey.P_GAME_EXIT, -109, airhockey.P_GAME_MYLOSE, -114, -112, 125, -115, -124, -117, -42, -22, -39, -34, -28, -59, -39, -56, -51, -45, -109, -59, -57, -105, -113, -93, -110, -105, -99, 93, -109, -113, -111, airhockey.J_SDKVER, -125, -105, -122, -117, -111, 81, -121, -125, -123, 85, 79, -116, -111, -123, airhockey.J_DISCONNECT, -120, 119, 124, -126, airhockey.P_NATION, ByteCompanionObject.MIN_VALUE, -125, airhockey.P_GAME_MYWIN, airhockey.J_DISCONNECT, 64, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, -121, ByteCompanionObject.MIN_VALUE, -62, -42, -59, -54, -48, -112, -50, -47, -58, -56, ByteCompanionObject.MIN_VALUE, -108, -125, -120, -114, 78, -114, -113, -108, -110, -105, -85, -102, -97, -91, airhockey.J_GAME_STANDBY, -86, -88, -85, -101, 99, -98, -102, -109, -89, -106, -101, -95, airhockey.J_SDKVER, -88, -96, -106, 96, -106, -90, -91, -52, -32, -49, -44, -38, -102, -31, -39, -49, -103, -49, -33, -34, -103, -45, -49, -61, -41, -58, -53, -47, -111, -40, -47, -44, -60, -53, -43, -88, -67, -86, airhockey.J_ACHIEVEMENTCALLBACK, -23, -2, -21, -69, -34, -37, -35, -83, -115, -114, -116, 92, -27, -11, -12, -28, -26, -10, -11, -25, -99, -83, -84, -95, airhockey.J_PURCHASE, -118, -119, -126, -53, -55, -111, -103, -36, -38, -92, -86, -121, -124, -107, 80, -126, -112, 125, 75, -54, -51, -111, -66, -39, -36, -96, -51, -102, -58, -57, -52, -54, -95, -110, -91, -95, -80, -93, -98, -97, -87, -12, -25, -30, -29, -19, -83, -33, -12, -31, -42, -55, -60, -59, -49, -113, -56, -59, -42, -61, -97, -110, -115, -114, -104, 88, -106, -103, 93, -97, 86, -114, -100, -41, -54, -59, -58, -48, -112, -50, -47, -58, -56, -116, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, 123, -123, airhockey.P_GAME_STANDBY, -125, -122, 123, 125, airhockey.P_GAME_MYLOSE, -109, -122, -127, -126, -116, 76, -108, -109, ByteCompanionObject.MIN_VALUE, 78, -45, -58, -63, -62, -52, -116, -43, -118, -45, -53, -63, -117, -52, -53, -113, -117, -45, -51, -107, -18, -31, -36, -35, -25, -89, -16, -91, -18, -26, -36, -90, -25, -26, -86, -90, -18, -24, -79, -31, -38, -35, -51, -44, -34, -23, -29, -93, -85, -33, -39, -103, -94, -10, -16, -72, -53, -59, -114};
    }

    static {
        A08();
        A02 = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A04(350, 14, 19))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(A04(HttpStatus.SC_PRECONDITION_FAILED, 13, 35))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(A04(331, 9, 85))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(A04(340, 10, 31))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (A01[3].length() != 9) {
                    String[] strArr = A01;
                    strArr[1] = "HNkoOhUTdh2WEonYh0qKfRn5Yj4ayqME";
                    strArr[2] = "AjLiWuI2q8tELJrtJCfbVzthekc1K3Gt";
                    if (str.equals(A04(425, 16, 92))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 1556697186:
                if (A01[7].length() == 21) {
                    A01[6] = "VI64o8R1DPg9";
                    if (str.equals(A04(399, 13, 39))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1 || c == 2) {
                return 6;
            }
            if (c != 3) {
                if (c != 4) {
                    return c != 5 ? 0 : 14;
                }
                return 8;
            }
            return 7;
        }
        return 5;
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (A09(str)) {
            return 1;
        }
        if (A0B(str)) {
            return 2;
        }
        if (A0A(str) || A04(23, 19, 112).equals(str)) {
            return 3;
        }
        if (A01[3].length() != 9) {
            String[] strArr = A01;
            strArr[1] = "LJhw0AyNjlY1daGtGtEMPB4ZWI4lLjxq";
            strArr[2] = "Jpqt6rhjDWOI2VL5M75U9AGCLzRFcI9K";
            if (A04(42, 19, 55).equals(str) || A04(193, 25, 126).equals(str) || A04(306, 20, 12).equals(str) || A04(110, 20, 59).equals(str) || A04(239, 28, 44).equals(str) || A04(218, 21, 74).equals(str) || A04(267, 19, 51).equals(str) || A04(130, 18, 17).equals(str) || A04(95, 15, 63).equals(str) || A04(61, 19, 89).equals(str)) {
                return 3;
            }
            if (!A04(80, 15, 43).equals(str)) {
                if (A01[6].length() != 12) {
                    A01[5] = "rwbag1QSJlT1yZsbEhClTGvMhp5yspb0";
                    if (A04(175, 5, 84).equals(str)) {
                        return 4;
                    }
                } else {
                    String[] strArr2 = A01;
                    strArr2[1] = "oiEUm8Pa8xqbloGyO2Igjyb7THZFd6q8";
                    strArr2[2] = "XLA61hR1gHB686GQiHbqHMaGrNzQ5Lyu";
                    if (A04(175, 18, 104).equals(str)) {
                        return 4;
                    }
                }
                if (!A04(286, 20, 7).equals(str)) {
                    boolean equals = A04(148, 27, 48).equals(str);
                    if (A01[0].charAt(10) != 'U') {
                        throw new RuntimeException();
                    }
                    A01[4] = "H9g3dImLmMl";
                    if (equals) {
                        return 4;
                    }
                    return A02(str);
                }
                return 4;
            }
            return 4;
        }
        throw new RuntimeException();
    }

    public static int A02(String str) {
        int size = A02.size();
        for (int i = 0; i < size; i++) {
            HU hu = A02.get(i);
            if (str.equals(hu.A02)) {
                int customMimeTypeCount = hu.A00;
                return customMimeTypeCount;
            }
        }
        return -1;
    }

    @Nullable
    public static String A03(int i) {
        if (i == 32) {
            String A04 = A04(542, 13, 26);
            if (A01[6].length() != 12) {
                A01[6] = "bvUhNk2RbVuP";
                return A04;
            }
            A01[4] = "8GzAdBy4CtQ";
            return A04;
        } else if (i == 33) {
            if (A01[4].length() != 2) {
                A01[7] = "xDmNlI5E0jBp494ocxKop";
                return A04(523, 9, 111);
            }
            throw new RuntimeException();
        } else if (i != 35) {
            if (i != 64) {
                if (i != 163) {
                    if (i != 177) {
                        if (i != 165) {
                            if (i != 166) {
                                switch (i) {
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                        return A04(565, 11, 7);
                                    case 102:
                                    case 103:
                                    case 104:
                                        break;
                                    case 105:
                                    case 107:
                                        return A04(379, 10, 82);
                                    case 106:
                                        return A04(555, 10, 82);
                                    default:
                                        switch (i) {
                                            case 169:
                                            case 172:
                                                return A04(HttpStatus.SC_PRECONDITION_FAILED, 13, 35);
                                            case 170:
                                            case 171:
                                                return A04(425, 16, 92);
                                            case 173:
                                                return A04(389, 10, 16);
                                            default:
                                                return null;
                                        }
                                }
                            } else {
                                return A04(340, 10, 31);
                            }
                        } else {
                            return A04(331, 9, 85);
                        }
                    } else {
                        return A04(605, 19, 105);
                    }
                } else {
                    return A04(576, 10, 14);
                }
            }
            return A04(364, 15, 4);
        } else {
            return A04(532, 10, 81);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00ff, code lost:
        if (r3.startsWith(A04(cz.msebera.android.httpclient.HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, 5, 93)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x011e, code lost:
        if (r3.startsWith(r1) != false) goto L26;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A05(@androidx.annotation.Nullable java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HV.A05(java.lang.String):java.lang.String");
    }

    @Nullable
    public static String A06(String str) {
        int size = A02.size();
        for (int i = 0; i < size; i++) {
            HU hu = A02.get(i);
            if (str.startsWith(hu.A01)) {
                return hu.A02;
            }
        }
        return null;
    }

    @Nullable
    public static String A07(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException(A04(0, 19, 4) + str);
    }

    public static boolean A09(String str) {
        return A04(326, 5, 102).equals(A07(str));
    }

    public static boolean A0A(String str) {
        return A04(514, 4, 30).equals(A07(str));
    }

    public static boolean A0B(String str) {
        return A04(518, 5, 43).equals(A07(str));
    }
}
