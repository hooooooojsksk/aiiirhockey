package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class G4 {
    public static byte[] A01;
    public static String[] A02 = {"JYYG6mQudNNGYNEgDR02nAMcKzDjIK4P", "2FeNcZ4AMvklOu4dQ", "gTW6toOfk8MVsyPSs", "RutE2HgswW2Ba8ERBuDpKSxIcN55U9", "rp2dSjsGIei", "VbvhM5GUqSDZ5Gwz8nmiFAQ41xb0JLlL", "3r4p5hSJjLrlxa79edZPjpayqJig4NbN", "nYAJe"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{39, 124, airhockey.P_GAME_MYWIN, airhockey.J_GAME_STANDBY, 17, 30, 102, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, 119, airhockey.J_GAME_STANDBY, 17, 30, 102, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, 94, airhockey.P_NATION, 56, 31, 7, 16, 29, 24, 21, 81, 16, 29, 24, 22, 31, 28, 20, 31, 5, 81, 7, 16, 29, 4, 20, 75, 81, 25, 62, 38, 49, 60, 57, 52, airhockey.J_GOO, 49, 62, 51, 56, 63, 34, airhockey.J_GOO, 38, 49, 60, 37, 53, airhockey.J_GAME_EXIT, airhockey.J_GOO, 81, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 34, 96, 99, 102, 34, airhockey.J_SDKVER, 119, airhockey.J_ENEMYWIN, 34, airhockey.J_BACK, airhockey.J_ENEMYWIN, airhockey.J_REWARD, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 56, 34, airhockey.J_GAME_REMATCH, 81, 83, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 83, 84, 93, 26, 89, 79, 95, 26, 77, 83, 78, 82, 26, 88, 91, 94, 26, 82, 95, 91, 94, 95, airhockey.P_GAME_MYLOSE, 0, 26, 15, 52, 49, 52, 53, 45, 52, airhockey.J_PURCHASE, 57, 47, 63, airhockey.J_PURCHASE, 41, 63, 46, 46, 51, 52, 61, airhockey.J_PURCHASE, 21, 39, 32, 52, 54, 54, 1, 55, 39, 18, 35, 48, 49, 39, 48, 58, 65, 61, 79, 60, 88, 46, 90, 85, 45, 47, 90, airhockey.J_ERROR, 45, 43, 43, 56, 90, airhockey.J_ERROR, 45, 46, 90, 85, 45, 47, 46, 40, 44, 47, 57, 34, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, 48, 60, 33, 109, 36, 76, airhockey.P_GAME_EXIT, 65, 91, airhockey.P_GAME_EXIT, 93, 24, 19, 25, 20, 7, airhockey.P_NATION, 99, 109, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 99, airhockey.J_ONREWARDED, 109, 42, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, airhockey.J_PURCHASE, airhockey.J_PURCHASE, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 126, 111, airhockey.J_INVITE, 42, 111, airhockey.J_ONREWARDED, 126, 99, 126, airhockey.J_SAVEDGAME_SAVE, 48, 42, 45, 44, 53, 56, 55, 62, 9, 0, 3, 17, airhockey.J_SAVEDGAME_RELOAD, 119, airhockey.J_GOO, 123, 84, 76, 24, 28, 17, 17, 25, 16, 87, 91, airhockey.P_GAME_EXIT, airhockey.P_GAME_REMATCH, 79, 80, 76, 86, 75, 86, 80, 81, 34, 57, 55, 56, 36, 58, 32, 51, 44, 29, 26, 15, 28, 26, 111, airhockey.P_GAME_EXIT};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final boolean A0G(C0483Hc c0483Hc, G1 g1, List<C0456Fz> list) {
        String A0P = c0483Hc.A0P();
        if (A0P == null) {
            return false;
        }
        Matcher matcher = A03.matcher(A0P);
        if (matcher.matches()) {
            return A0F(null, matcher, c0483Hc, g1, this.A00, list);
        }
        String A0P2 = c0483Hc.A0P();
        if (A0P2 == null) {
            return false;
        }
        Matcher matcher2 = A03.matcher(A0P2);
        if (matcher2.matches()) {
            return A0F(A0P.trim(), matcher2, c0483Hc, g1, this.A00, list);
        }
        return false;
    }

    static {
        A05();
        A03 = Pattern.compile(A03(161, 26, 75));
        A04 = Pattern.compile(A03(3, 12, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 0
            r6 = 3
            r5 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L3d;
                case -1074341483: goto L4e;
                case 100571: goto L5f;
                case 109757538: goto L8e;
                default: goto Lb;
            }
        Lb:
            r0 = -1
        Lc:
            if (r0 == 0) goto Lb6
            if (r0 == r4) goto Lb5
            if (r0 == r5) goto Lb5
            if (r0 == r6) goto Lb4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 43
            r1 = 22
            r0 = 29
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2 = 141(0x8d, float:1.98E-43)
            r1 = 15
            r0 = 15
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L3d:
            r2 = 197(0xc5, float:2.76E-43)
            r1 = 6
            r0 = 98
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        L4e:
            r2 = 254(0xfe, float:3.56E-43)
            r1 = 6
            r0 = 56
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 2
            goto Lc
        L5f:
            r2 = 203(0xcb, float:2.84E-43)
            r1 = 3
            r0 = 48
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r3 = r8.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.G4.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto L84
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G4.A02
            java.lang.String r1 = "W9z1tlml8oHZW88fZWUMzT4FbwhCC9z"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto Lb
        L82:
            r0 = 3
            goto Lc
        L84:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G4.A02
            java.lang.String r1 = "fdGkOFUxyno"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb
            goto L82
        L8e:
            r2 = 281(0x119, float:3.94E-43)
            r1 = 5
            r0 = 35
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r3 = r8.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.G4.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto Lb7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G4.A02
            java.lang.String r1 = "1rUDZc1zpmKX3lK5wqzuXN7L1n8yuk9K"
            r0 = 6
            r2[r0] = r1
            if (r3 == 0) goto Lb
            r0 = 0
            goto Lc
        Lb4:
            return r5
        Lb5:
            return r4
        Lb6:
            return r7
        Lb7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G4.A00(java.lang.String):int");
    }

    public static int A01(String str, int i) {
        int indexOf = str.indexOf(62, i);
        if (indexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = indexOf + 1;
        return index2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment A02(String str) {
        char c;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 98))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1074341483:
                if (str.equals(A03(254, 6, 56))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals(A03(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 3, 48))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (str.equals(A03(244, 4, 40))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals(A03(272, 5, 29))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals(A03(281, 5, 35))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c == 2 || c == 3) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (c != 4 && c != 5) {
            Log.w(A03(141, 15, 15), A03(18, 25, 60) + str);
            return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static String A04(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            if (A02[4].length() != 19) {
                A02[3] = "n2qP40ip31gyFkT4bwxWbWgEBn8x5R";
                return null;
            }
            throw new RuntimeException();
        }
        return C0499Hs.A0m(trim, A03(156, 5, 44))[0];
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, C0456Fz c0456Fz, int i, int i2) {
        if (c0456Fz == null) {
            return;
        }
        if (c0456Fz.A08() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c0456Fz.A08()), i, i2, 33);
        }
        if (c0456Fz.A0O()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c0456Fz.A0P()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c0456Fz.A0N()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c0456Fz.A06()), i, i2, 33);
        }
        if (c0456Fz.A0M()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c0456Fz.A05()), i, i2, 33);
        }
        String A0H = c0456Fz.A0H();
        if (A02[6].charAt(12) == 'U') {
            throw new RuntimeException();
        }
        A02[6] = "tzfwj6Yb5L7snAfsv0bj9UNvpNFUfxvv";
        if (A0H != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c0456Fz.A0H()), i, i2, 33);
        }
        if (c0456Fz.A0A() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c0456Fz.A0A()), i, i2, 33);
        }
        int A07 = c0456Fz.A07();
        if (A07 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c0456Fz.A04(), true), i, i2, 33);
        } else if (A07 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0456Fz.A04()), i, i2, 33);
        } else if (A07 != 3) {
        } else {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c0456Fz.A04() / 100.0f), i, i2, 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A07(java.lang.String r8, android.text.SpannableStringBuilder r9) {
        /*
            int r6 = r8.hashCode()
            r0 = 3309(0xced, float:4.637E-42)
            r5 = 3
            r4 = 2
            r3 = 1
            if (r6 == r0) goto Lb9
            r7 = 3464(0xd88, float:4.854E-42)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.G4.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto Lcb
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.G4.A02
            java.lang.String r1 = "3281j55CBGH9OVj7j"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "0j4d4NXVTtLZ6NkCp"
            r0 = 1
            r2[r0] = r1
            if (r6 == r7) goto La7
            r0 = 96708(0x179c4, float:1.35517E-40)
            if (r6 == r0) goto L96
            r0 = 3374865(0x337f11, float:4.729193E-39)
            if (r6 == r0) goto L85
        L31:
            r0 = -1
        L32:
            if (r0 == 0) goto L7f
            if (r0 == r3) goto L79
            if (r0 == r4) goto L73
            if (r0 == r5) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 209(0xd1, float:2.93E-43)
            r1 = 31
            r0 = 71
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            r3.append(r8)
            r2 = 16
            r1 = 2
            r0 = 40
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2 = 141(0x8d, float:1.98E-43)
            r1 = 15
            r0 = 15
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r0, r3)
        L6c:
            return
        L6d:
            r0 = 38
            r9.append(r0)
            goto L6c
        L73:
            r0 = 32
            r9.append(r0)
            goto L6c
        L79:
            r0 = 62
            r9.append(r0)
            goto L6c
        L7f:
            r0 = 60
            r9.append(r0)
            goto L6c
        L85:
            r2 = 260(0x104, float:3.64E-43)
            r1 = 4
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L31
            r0 = 2
            goto L32
        L96:
            r2 = 192(0xc0, float:2.69E-43)
            r1 = 3
            r0 = 28
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L31
            r0 = 3
            goto L32
        La7:
            r2 = 252(0xfc, float:3.53E-43)
            r1 = 2
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L31
            r0 = 0
            goto L32
        Lb9:
            r2 = 206(0xce, float:2.89E-43)
            r1 = 2
            r0 = 62
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        Lcb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G4.A07(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    public static void A08(String str, G1 g1) {
        String A032 = A03(141, 15, 15);
        Matcher matcher = A04.matcher(str);
        while (true) {
            boolean find = matcher.find();
            if (A02[7].length() != 5) {
                throw new RuntimeException();
            }
            A02[7] = "ISZNO";
            if (find) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                try {
                    if (A03(248, 4, 83).equals(group)) {
                        A09(group2, g1);
                    } else if (A03(187, 5, 70).equals(group)) {
                        g1.A0B(A02(group2));
                    } else if (A03(264, 8, 114).equals(group)) {
                        A0A(group2, g1);
                    } else if (A03(277, 4, 4).equals(group)) {
                        g1.A05(G5.A00(group2));
                    } else {
                        Log.w(A032, A03(121, 20, 23) + group + A03(15, 1, 19) + group2);
                    }
                } catch (NumberFormatException unused) {
                    Log.w(A032, A03(65, 26, 79) + matcher.group());
                }
            } else {
                return;
            }
        }
    }

    public static void A09(String str, G1 g1) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            g1.A06(A00(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            g1.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 47))) {
            g1.A03(G5.A00(str)).A07(0);
            return;
        }
        int commaIndex = Integer.parseInt(str);
        if (commaIndex < 0) {
            commaIndex--;
        }
        g1.A03(commaIndex).A07(1);
    }

    public static void A0A(String str, G1 g1) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            int commaIndex = indexOf + 1;
            g1.A08(A00(str.substring(commaIndex)));
            str = str.substring(0, indexOf);
        } else {
            g1.A08(Integer.MIN_VALUE);
        }
        g1.A04(G5.A00(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00c0, code lost:
        if (r7.equals(A03(195, 1, 66)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00c2, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0061, code lost:
        if (r8 != 98) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0065, code lost:
        if (r8 == 99) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0069, code lost:
        if (r8 == 117) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x006d, code lost:
        if (r8 == 118) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x007e, code lost:
        if (r7.equals(A03(287, 1, 113)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0080, code lost:
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x008f, code lost:
        if (r7.equals(A03(286, 1, 87)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0091, code lost:
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00a0, code lost:
        if (r7.equals(A03(196, 1, 10)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00a2, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00b0, code lost:
        if (r8 != 98) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[LOOP:0: B:112:0x010e->B:113:0x0110, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0B(java.lang.String r10, com.facebook.ads.redexgen.X.G2 r11, android.text.SpannableStringBuilder r12, java.util.List<com.facebook.ads.redexgen.X.C0456Fz> r13, java.util.List<com.facebook.ads.redexgen.X.G3> r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G4.A0B(java.lang.String, com.facebook.ads.redexgen.X.G2, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0067, code lost:
        if (r7 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0069, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00c0, code lost:
        if (r7 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c3, code lost:
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(java.lang.String r14, java.lang.String r15, com.facebook.ads.redexgen.X.G1 r16, java.util.List<com.facebook.ads.redexgen.X.C0456Fz> r17) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G4.A0C(java.lang.String, java.lang.String, com.facebook.ads.redexgen.X.G1, java.util.List):void");
    }

    public static void A0D(List<C0456Fz> list, String str, G2 g2, List<G3> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0456Fz c0456Fz = list.get(i);
            String str2 = g2.A01;
            String[] strArr = g2.A03;
            String str3 = g2.A02;
            if (A02[3].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "AMyBO4NnCnMpgJ1A04yWFmVBrU3uxkkG";
            strArr2[5] = "4pWDMPx0mcGHcptb8cUlFxOOK6mkNbT4";
            int i2 = c0456Fz.A09(str, str2, strArr, str3);
            if (i2 > 0) {
                list2.add(new G3(i2, c0456Fz));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x006a, code lost:
        if (r8 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x006c, code lost:
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007a, code lost:
        if (r8 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0E(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G4.A0E(java.lang.String):boolean");
    }

    public static boolean A0F(String str, Matcher matcher, C0483Hc c0483Hc, G1 g1, StringBuilder sb, List<C0456Fz> list) {
        try {
            g1.A0A(G5.A01(matcher.group(1))).A09(G5.A01(matcher.group(2)));
            A08(matcher.group(3), g1);
            sb.setLength(0);
            while (true) {
                String A0P = c0483Hc.A0P();
                if (!TextUtils.isEmpty(A0P)) {
                    if (sb.length() > 0) {
                        sb.append(A03(0, 1, 96));
                    }
                    sb.append(A0P.trim());
                } else {
                    A0C(str, sb.toString(), g1, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(141, 15, 15), A03(91, 30, 119) + matcher.group());
            return false;
        }
    }
}
