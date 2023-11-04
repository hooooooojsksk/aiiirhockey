package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: assets/audience_network.dex */
public final class RT {
    public static byte[] A03;
    public static String[] A04 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", "r", "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};
    @VisibleForTesting
    public BlockingDeque<RU> A00;
    public final int A01;
    @Nullable
    public final String A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A05(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        for (Long l : list) {
            A09(sb, A00(l.longValue()));
        }
        return A03(sb.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static String A07(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08() {
        A03 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 75, airhockey.P_GAME_EXIT, airhockey.P_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, 124, ByteCompanionObject.MAX_VALUE, 126, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, 123, airhockey.J_PURCHASE, airhockey.J_ERROR, airhockey.J_DISCONNECT, 119, airhockey.J_REWARD, airhockey.J_BACK, airhockey.J_GOO, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_RELOAD, 109, airhockey.J_GAME_DISCONNECT, 111, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, airhockey.J_ENEMYWIN, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, 22, 55, 62, 38, 51, 45, 123, 42, 13, 57, 40, 37, 35, 57, 49, 28, 6, 38, 26, 0, 27, 17, 58, 27, 10, 25, 14, 15, 21, 19, 18, 109, 52, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, airhockey.J_ONREWARDED, 52, 44, 52, airhockey.P_GAME_STANDBY, 95, 76, 83, airhockey.P_GAME_REMATCH, 83, 78, 85, 83, 83, 82, airhockey.P_GAME_REMATCH, 91, 87, 78, airhockey.P_GAME_REMATCH, 85, 87, airhockey.P_GAME_BREAKBALLCOUNT, 52, airhockey.J_GAME_ENEMYEXIT};
    }

    static {
        A08();
    }

    public RT(@Nullable String str) {
        this(str, 2000);
    }

    public RT(@Nullable String str, int i) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = new LinkedBlockingDeque();
    }

    public static long A00(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static long A01(List<RU> list, int i, int i2) {
        HashMap hashMap = new HashMap();
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            long A032 = list.get(i3).A03();
            long A01 = list.get(i3).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(A01))) {
                hashMap.put(Long.valueOf(A01), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A01))).intValue() + 1));
            } else {
                Long valueOf = Long.valueOf(A01);
                int i4 = A04[2].length();
                if (i4 == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[6] = "1vNPfVBSY4dOMHCgW1yzfdLMrSn5bdwR";
                strArr[0] = "JWbjY4s0cXOj2VlFs0Pom5JqAlb5V7T0";
                hashMap.put(valueOf, 1);
            }
        }
        long j = 3333;
        int baseCountMax = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i + 1; baseCountMax2 < i + i2; baseCountMax2++) {
            list.get(baseCountMax2).A08(list.get(baseCountMax2).A03() - j);
            list.get(baseCountMax2).A06(list.get(baseCountMax2).A01() - j);
            if (A04[7].length() == 7) {
                throw new RuntimeException();
            }
            A04[4] = "Qmxl";
        }
        return j;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.charAt"})
    public static String A03(String str) {
        String A02 = A02(0, 64, 117);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A04;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A04[2] = "LfiGB0y4";
                sb3.append('=');
                sb.append((char) 0);
                length++;
            }
        }
        for (int n4 = 0; n4 < sb.length(); n4 += 3) {
            int charAt = (sb.charAt(n4) << 16) + (sb.charAt(n4 + 1) << '\b') + sb.charAt(n4 + 2);
            int c = (charAt >> 18) & 63;
            sb2.append(A02.charAt(c));
            sb2.append(A02.charAt((charAt >> 12) & 63));
            sb2.append(A02.charAt((charAt >> 6) & 63));
            sb2.append(A02.charAt(charAt & 63));
        }
        StringBuilder r = new StringBuilder();
        String base64chars = sb2.substring(0, sb2.length() - sb3.length());
        r.append(base64chars);
        r.append((Object) sb3);
        String base64chars2 = r.toString();
        return base64chars2;
    }

    @Nullable
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public static String A04(@Nullable List<RU> list) {
        if (list == null) {
            return null;
        }
        return A06(list, 0, list.size());
    }

    @Nullable
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public static String A06(@Nullable List<RU> list, int i, int i2) {
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || i2 <= 0 || i + i2 > list.size()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 35), list.get(i).A04());
        hashMap.put(A02(92, 7, 20), 1);
        boolean z = false;
        if (i2 > 1) {
            A0A(list, i, i2);
            hashMap.put(A02(64, 9, 58), Long.valueOf(A01(list, i, i2)));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i3 = i + 1;
            while (true) {
                int i4 = i + i2;
                String[] strArr = A04;
                if (strArr[6].charAt(27) == strArr[0].charAt(27)) {
                    A04[3] = "sY72aKe28VDDg4QAKU7aKOljcr02pFxR";
                    if (i3 < i4) {
                        arrayList.add(Long.valueOf(list.get(i3).A03()));
                        arrayList.add(Long.valueOf(list.get(i3).A01()));
                        arrayList.add(Long.valueOf(list.get(i3).A02()));
                        arrayList2.add(Long.valueOf(list.get(i3).A00()));
                        if (list.get(i3).A00() != 0) {
                            z = true;
                        }
                        i3++;
                    } else {
                        hashMap.put(A02(81, 2, 55), A05(arrayList));
                        hashMap.put(A02(75, 6, 36), A05(arrayList2));
                        hashMap.put(A02(83, 9, 29), Boolean.valueOf(z));
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        String A07 = A07(hashMap);
        if (A07.length() > 900000) {
            return A02(99, 29, 126);
        }
        return A07;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(java.lang.StringBuilder r5, long r6) {
        /*
            r4 = 128(0x80, float:1.8E-43)
        L2:
            long r1 = (long) r4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L15
            int r0 = r4 + (-1)
            long r2 = (long) r0
            long r2 = r2 & r6
            long r0 = (long) r4
            long r2 = r2 | r0
            int r0 = (int) r2
            char r1 = (char) r0
            r0 = 7
            long r6 = r6 >> r0
            r5.append(r1)
            goto L2
        L15:
            int r0 = (int) r6
            char r3 = (char) r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RT.A04
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L31
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L31:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RT.A04
            java.lang.String r1 = "TgLp8xzira9J3G7G7T0jqPUigov5tglm"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6"
            r0 = 0
            r2[r0] = r1
            r5.append(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RT.A09(java.lang.StringBuilder, long):void");
    }

    public static void A0A(List<RU> list, int i, int i2) {
        long A00;
        for (int i3 = (i + i2) - 1; i3 > i; i3--) {
            int i4 = i3 - 1;
            list.get(i3).A08(list.get(i3).A03() - list.get(i4).A03());
            int i5 = i3 - 1;
            list.get(i3).A06(list.get(i3).A01() - list.get(i5).A01());
            int i6 = i3 - 1;
            list.get(i3).A07(list.get(i3).A02() - list.get(i6).A02());
            RU ru = list.get(i3);
            int i7 = i3 - 1;
            if (list.get(i7).A00() == -1) {
                A00 = 0;
            } else {
                int i8 = i3 - 1;
                A00 = list.get(i3).A00() - list.get(i8).A00();
            }
            ru.A05(A00);
            list.get(i3).A07(list.get(i3).A02() - list.get(i3).A01());
        }
    }

    public final List<RU> A0B() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0C(RU ru) {
        RU peekLast = this.A00.peekLast();
        if (peekLast != null) {
            long A032 = peekLast.A03();
            if (A04[7].length() == 7) {
                throw new RuntimeException();
            }
            A04[1] = "fQhMIvl";
            if (A032 == ru.A03() && peekLast.A01() == ru.A01()) {
                return;
            }
        }
        this.A00.add(ru);
    }
}
