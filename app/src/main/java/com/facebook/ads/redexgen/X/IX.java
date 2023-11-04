package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class IX {
    public static byte[] A07;
    public static String[] A08 = {"LYvtYpjh3A8vQy5q2R4RxEae0rP", "jA7v2s", "LzEc2Zjd8NVDeWOm9tYj7O2gb", "Qr4hCar3IUJK7IjuLaxeJKR14jvwbtqN", "uluEIDHou1vA3RshZYJ1CVooXlj", "7Mv6zZGpvnHTc", "8W43Le7bwqTNh", "1W0jBamhj3r3Yg4zpKy5fnBuSdv5NYDW"};
    public final double A00;
    public final double A01 = System.currentTimeMillis() / 1000.0d;
    public final EnumC0507Ic A02;
    public final EnumC0508Id A03;
    public final String A04;
    public final String A05;
    public final Map<String, String> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A08;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "vmrJ4a9vgt2Kh5jnKLFXcgPaai5qbtv5";
            strArr2[3] = "Xi4zcaKQ0kTUusAVwfois8CGtwAhjWs7";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
            i4++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Map<String, String> A01(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public static void A02() {
        A07 = new byte[]{airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, 111, airhockey.J_ENEMYWIN, 109, airhockey.J_GOO, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 99, airhockey.J_INVITE, 93, airhockey.J_SDKVER, airhockey.J_INVITE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_REWARD, 93, airhockey.J_REWARD, 109, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, airhockey.J_ERROR, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ENEMYLOSE, airhockey.J_BACK, airhockey.J_WAIT, airhockey.P_NATION, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, 126, airhockey.J_BACK, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_NATION, airhockey.J_DISCONNECT, airhockey.J_SAVEDGAME_SAVE, airhockey.P_NATION, 123, airhockey.J_ENEMYLOSE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_BACK};
    }

    static {
        A02();
    }

    public IX(C7N c7n, String str, double d, String str2, @Nullable Map<String, String> map, EnumC0507Ic enumC0507Ic, EnumC0508Id enumC0508Id, boolean z) {
        this.A05 = str;
        this.A00 = d;
        this.A04 = str2;
        this.A02 = enumC0507Ic;
        this.A03 = enumC0508Id;
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        if (z) {
            hashMap.put(A00(27, 24, 34), String.valueOf(z));
        }
        String A01 = C0515Ik.A01(str);
        if (!TextUtils.isEmpty(A01) && (z || enumC0508Id == EnumC0508Id.A0C)) {
            hashMap.put(A00(6, 21, 61), A01);
        }
        if (A0B()) {
            Map<String, String> extraData = c7n.A03().A5k();
            hashMap.put(A00(0, 6, 63), C0568Kq.A01(extraData));
        }
        Map<String, String> extraData2 = A01(hashMap);
        this.A06 = extraData2;
    }

    public final double A03() {
        return this.A00;
    }

    public final double A04() {
        return this.A01;
    }

    public final EnumC0507Ic A05() {
        return this.A02;
    }

    public final EnumC0508Id A06() {
        return this.A03;
    }

    public final String A07() {
        return this.A04;
    }

    public final String A08() {
        return this.A05;
    }

    public final Map<String, String> A09() {
        return this.A06;
    }

    public final boolean A0A() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final boolean A0B() {
        return this.A02 == EnumC0507Ic.A05;
    }
}
