package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.redexgen.X.2G */
/* loaded from: assets/audience_network.dex */
public final class C2G {
    public static byte[] A03;
    public static String[] A04 = {"WaajtisyqSdmr5n0MmqvTq", "fdIaRasDBQ3mzQVC7YD5nGkHzZAmQvnJ", "WAxtNKI8ST0O8UsrAPtnvhIOfFZAxPRo", "iXpFblfpqQgQYwoemHyqPvk55iTf4XTw", "RtKJcmIp3WHhRmLDIsvrFFxbXoefOAJz", "sGysMZG", "ia7vWYD1O3n4XjJSJMs69oivtzC", "7HN0WjvVbr0DvNKb02v1a"};
    @Nullable
    public C0513Ii A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{airhockey.J_GAME_EXIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.P_NATION, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYSCORE, 29, 17, 30, 17, 23, 21, 47, 17, 20, 47, 0, 2, 21, 22, 21, 2, 21, 30, 19, 21, 3, 60, 35, 39, 58, 60, 61, 32, 12, 32, 54, 63, 54, 48, 39, 54, 55, 52, 51, 38, 53, 51, airhockey.J_ONREWARDED, airhockey.J_NATION, airhockey.J_DISCONNECT, 99, 78, 123, 126, airhockey.J_ONREWARDED, 99, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.P_GAME_BREAKBALLCOUNT, 89, airhockey.P_GAME_MYLOSE, airhockey.J_INVITE, 80, 92, airhockey.J_INVITE, 88, airhockey.J_INVITE, airhockey.P_NATION, 84, 84, 88, 95, 86, airhockey.J_INVITE, airhockey.P_GAME_STANDBY, 89, 88, airhockey.P_NATION};
    }

    static {
        A01();
    }

    public C2G() {
    }

    public C2G(C0513Ii c0513Ii) {
        this.A00 = c0513Ii;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(47, 12, 86), new JSONArray((Collection) this.A02).toString());
        hashMap.put(A00(26, 16, 20), new JSONArray((Collection) this.A01).toString());
        return hashMap;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 55));
        C0513Ii c0513Ii = this.A00;
        if (c0513Ii != null) {
            c0513Ii.A04(EnumC0512Ih.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 0));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 118));
        C0513Ii c0513Ii = this.A00;
        if (c0513Ii != null) {
            c0513Ii.A04(EnumC0512Ih.A0C, null);
        }
    }

    public final void A07(int i) {
        this.A01.add(String.valueOf(i));
    }

    public final void A08(C2F c2f) {
        List<String> list = this.A02;
        list.add(c2f.A02() + A00(1, 4, 96));
        C0513Ii c0513Ii = this.A00;
        if (c0513Ii != null) {
            c0513Ii.A04(EnumC0512Ih.A09, null);
        }
    }

    public final void A09(C2F c2f, int i) {
        List<String> list = this.A02;
        list.add(c2f.A02() + A00(0, 1, 114) + i);
    }

    public final boolean A0A() {
        if (this.A02.isEmpty()) {
            List<String> list = this.A01;
            if (A04[0].length() != 22) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[3] = "1yk3ZSNQ1BStxV76R0ws43k7I6sqjrng";
            strArr[1] = "j3RusJXAZ4GZuuXU7mrgX9kSNDex5H9F";
            if (list.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
