package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dto.AdCookieData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.loopj.android.http.AsyncHttpClient;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8B */
/* loaded from: assets/audience_network.dex */
public final class C8B {
    public static byte[] A0F;
    public static final AdPlacementType A0G;
    public static final String A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public AdPlacementType A0B;
    public boolean A0D;
    public List<AdCookieData> A0C = null;
    public final long A0E = System.currentTimeMillis();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C8B(Map<String, String> map) {
        char c;
        this.A01 = -1;
        this.A00 = -1;
        this.A0B = A0G;
        this.A03 = 1;
        this.A0A = 0;
        this.A04 = 0;
        this.A05 = 20;
        this.A08 = 0;
        this.A09 = 1000;
        this.A06 = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT;
        this.A07 = 200;
        this.A02 = 3600;
        this.A0D = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1561601017:
                    if (key.equals(A01(105, 17, 70))) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -856794442:
                    if (key.equals(A01(199, 26, 64))) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -726276175:
                    if (key.equals(A01(122, 15, 35))) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -634541425:
                    if (key.equals(A01(9, 32, 87))) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -553208868:
                    if (key.equals(A01(0, 9, 102))) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (key.equals(A01(137, 4, 17))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 700812481:
                    if (key.equals(A01(41, 26, 72))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 858630459:
                    if (key.equals(A01(225, 24, 94))) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 986744879:
                    if (key.equals(A01(141, 27, 73))) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1085444827:
                    if (key.equals(A01(98, 7, 62))) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1183549815:
                    if (key.equals(A01(168, 31, 73))) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1503616961:
                    if (key.equals(A01(67, 16, 3))) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2002133996:
                    if (key.equals(A01(83, 15, 59))) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.A0B = AdPlacementType.fromString(entry.getValue());
                    break;
                case 1:
                    this.A03 = Integer.parseInt(entry.getValue());
                    break;
                case 2:
                    this.A0A = Integer.parseInt(entry.getValue());
                    break;
                case 3:
                    this.A04 = Integer.parseInt(entry.getValue());
                    break;
                case 4:
                    this.A05 = Integer.parseInt(entry.getValue());
                    break;
                case 5:
                    this.A02 = Integer.parseInt(entry.getValue());
                    break;
                case 6:
                    this.A0D = Boolean.valueOf(entry.getValue()).booleanValue();
                    break;
                case 7:
                    this.A01 = Integer.parseInt(entry.getValue());
                    break;
                case '\b':
                    this.A00 = Integer.parseInt(entry.getValue());
                    break;
                case '\t':
                    this.A08 = Integer.parseInt(entry.getValue());
                    break;
                case '\n':
                    this.A09 = Integer.parseInt(entry.getValue());
                    break;
                case 11:
                    this.A06 = Integer.parseInt(entry.getValue());
                    break;
                case '\f':
                    try {
                        this.A07 = Integer.parseInt(entry.getValue());
                        break;
                    } catch (NumberFormatException unused) {
                        this.A07 = 200;
                        break;
                    }
            }
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{119, airhockey.J_ERROR, 119, 124, airhockey.J_BACK, airhockey.J_ERROR, airhockey.J_REWARD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_BACK, 76, 75, 83, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, 76, 65, airhockey.P_GAME_SELECTMAP, 81, 76, airhockey.P_GAME_EXIT, 75, airhockey.J_PURCHASE, 65, 80, 87, airhockey.P_GAME_SELECTMAP, 81, 76, airhockey.P_GAME_EXIT, 75, airhockey.J_PURCHASE, 76, 75, airhockey.J_PURCHASE, 86, 64, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_EXIT, 75, 65, 86, 87, 83, 84, airhockey.J_GAME_STANDBY, 76, 83, 95, 77, 91, 88, 83, 86, 83, 78, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_STANDBY, airhockey.P_GAME_EXIT, 95, airhockey.P_GAME_MYLOSE, 89, 95, 84, 78, 91, 93, 95, 1, 29, 16, 18, 20, 28, 20, 31, 5, 46, 25, 20, 24, 22, 25, 5, 57, 37, 40, 42, 44, 36, 44, 39, 61, 22, 62, 32, 45, 61, 33, 62, 41, 42, 62, 41, 63, 36, airhockey.P_GAME_BREAKBALLCOUNT, 81, 82, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_MYWIN, 92, airhockey.J_GAME_ENEMYEXIT, 64, 92, airhockey.P_GAME_BREAKBALLCOUNT, 81, airhockey.P_GAME_MYWIN, 92, 91, 88, 80, 35, 52, 32, 36, 52, 34, 37, 14, 37, 56, 60, 52, 62, 36, 37, 23, 26, 19, 6, 77, 82, 95, 94, 84, airhockey.J_ONREWARDED, 79, 82, 86, 94, airhockey.J_ONREWARDED, 75, 84, 87, 87, 82, 85, 92, airhockey.J_ONREWARDED, 82, 85, 79, 94, airhockey.P_GAME_REMATCH, 77, 90, 87, 77, 82, 94, 76, 90, 89, 82, 87, 82, 79, airhockey.P_NATION, airhockey.J_ONREWARDED, 88, 83, 94, 88, 80, airhockey.J_ONREWARDED, 82, 85, 82, 79, 82, 90, 87, airhockey.J_ONREWARDED, 95, 94, 87, 90, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, 91, 87, airhockey.P_GAME_STANDBY, 83, 80, 91, 94, 91, airhockey.P_GAME_BREAKBALLCOUNT, 75, 109, 81, 90, 87, 81, 89, 109, 91, 92, airhockey.P_GAME_BREAKBALLCOUNT, 87, 64, airhockey.P_GAME_SELECTMAP, 83, 94, 90, airhockey.P_GAME_STANDBY, airhockey.P_GAME_REMATCH, 91, 77, 78, airhockey.P_GAME_STANDBY, 64, airhockey.P_GAME_STANDBY, 88, 85, airhockey.J_SAVEDGAME_SAVE, 79, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, 79, airhockey.P_GAME_MYWIN, airhockey.J_SAVEDGAME_SAVE, 88, airhockey.P_GAME_STANDBY, 79, airhockey.P_GAME_MYWIN, airhockey.P_GAME_REMATCH, 94};
    }

    static {
        A02();
        A0H = C8B.class.getSimpleName();
        A0G = AdPlacementType.UNKNOWN;
    }

    public static C8B A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return new C8B(hashMap);
    }

    public final int A03() {
        return this.A02 * 1000;
    }

    public final int A04() {
        return this.A03;
    }

    public final int A05() {
        return this.A06;
    }

    public final int A06() {
        return this.A07;
    }

    public final int A07() {
        return this.A08;
    }

    public final int A08() {
        return this.A09;
    }

    public final int A09() {
        return this.A0A;
    }

    public final long A0A() {
        return this.A04 * 1000;
    }

    public final long A0B() {
        return this.A05 * 1000;
    }

    public final long A0C() {
        return this.A0E;
    }

    public final AdPlacementType A0D() {
        return this.A0B;
    }

    public final boolean A0E() {
        return this.A0D;
    }
}
