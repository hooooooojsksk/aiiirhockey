package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Go */
/* loaded from: assets/audience_network.dex */
public class C0469Go implements InterfaceC0712Qf {
    public static byte[] A05;
    public static String[] A06 = {"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", "", "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", "", "QpBNbg2dQWhW"};
    @Nullable
    public JSONObject A00;
    @Nullable
    public JSONObject A01;
    public final EnumC0713Qg A03;
    public final List<InterfaceC0714Qh> A04 = new ArrayList();
    public boolean A02 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        A06[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, 13, 22, 28, 20, 29, 88, 93, 11, 88, 28, 25, 12, 25, 88, 13, 8, 28, 25, 12, 29, airhockey.P_NATION, airhockey.J_SAVEDGAME_RELOAD, 82, 82, 88, 28, 25, 12, 25, 88, 82, 82, airhockey.J_SAVEDGAME_RELOAD, 93, 11, airhockey.J_SAVEDGAME_RELOAD, 82, 82, 88, 30, 17, 22, 31, 29, 10, 8, 10, 17, 22, 12, 88, 82, 82, airhockey.J_SAVEDGAME_RELOAD, 93, 11, 89, airhockey.J_INVITE, airhockey.J_ERROR, ByteCompanionObject.MAX_VALUE, 119, 126, 59, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, airhockey.J_ENEMYLOSE, 59, airhockey.J_ERROR, airhockey.J_DISCONNECT, 59, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 124, 126, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 111, 32, 23, 12, 6, 14, 7, airhockey.P_NATION, 11, 17, airhockey.P_NATION, 12, 13, 22, airhockey.P_NATION, 16, 7, 3, 6, 27, 43, 46, 59, 46, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SAVEDGAME_RELOAD, 111, 33, 58, 35, 35, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, 99, airhockey.J_GAME_EXIT, airhockey.J_ENEMYLOSE, ByteCompanionObject.MAX_VALUE, 125, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, 99, airhockey.J_WAIT, 45, 44, 48, 45, 99, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SDKVER, airhockey.J_SDKVER, 125, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 124, 126, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 111, 59, 38, 38, 59, airhockey.J_ERROR, airhockey.J_INVITE, 119, 119, 77, 86, 79, 79};
    }

    static {
        A03();
    }

    public C0469Go(EnumC0713Qg enumC0713Qg) {
        this.A03 = enumC0713Qg;
    }

    private boolean A04(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean A02 = C0711Qe.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "";
        strArr2[6] = "";
        return true ^ A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0025, code lost:
        if (r8.A03.A04() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ab, code lost:
        throw new java.lang.IllegalArgumentException(A02(113, 19, 22));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean A05(org.json.JSONObject r9, @androidx.annotation.Nullable org.json.JSONObject r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto Lac
            if (r10 != 0) goto L1d
            com.facebook.ads.redexgen.X.Qg r0 = r8.A03     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> Lbc
            if (r0 != 0) goto Le
            goto L1d
        Le:
            r2 = 132(0x84, float:1.85E-43)
            r1 = 19
            r0 = 0
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        L1d:
            if (r10 == 0) goto L27
            com.facebook.ads.redexgen.X.Qg r0 = r8.A03     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L9c
        L27:
            org.json.JSONObject r0 = r8.A01     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r8.A04(r0, r10)     // Catch: java.lang.Throwable -> Lbc
            r3 = 0
            if (r0 != 0) goto L38
            org.json.JSONObject r0 = r8.A00     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r8.A04(r0, r9)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L9a
        L38:
            r8.A00 = r9     // Catch: java.lang.Throwable -> Lbc
            r8.A01 = r10     // Catch: java.lang.Throwable -> Lbc
            r7 = 1
            r8.A02 = r7     // Catch: java.lang.Throwable -> Lbc
            java.util.List<com.facebook.ads.redexgen.X.Qh> r0 = r8.A04     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lbc
        L45:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbc
            com.facebook.ads.redexgen.X.Qh r0 = (com.facebook.ads.redexgen.X.InterfaceC0714Qh) r0     // Catch: java.lang.Throwable -> Lbc
            r0.A3v()     // Catch: java.lang.Throwable -> Lbc
            goto L45
        L55:
            java.util.Locale r6 = java.util.Locale.US     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r2 = 0
            r1 = 57
            r0 = 99
            java.lang.String r5 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            com.facebook.ads.redexgen.X.Qg r0 = r8.A03     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r4[r3] = r0     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            org.json.JSONObject r0 = r8.A00     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            r3 = 2
            if (r0 != 0) goto L91
            r2 = 151(0x97, float:2.12E-43)
            r1 = 4
            r0 = 56
            java.lang.String r0 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
        L75:
            r4[r7] = r0     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            org.json.JSONObject r0 = r8.A01     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            if (r0 != 0) goto L8a
            r2 = 151(0x97, float:2.12E-43)
            r1 = 4
            r0 = 56
            java.lang.String r0 = A02(r2, r1, r0)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
        L84:
            r4[r3] = r0     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            java.lang.String.format(r6, r5, r4)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            goto L98
        L8a:
            org.json.JSONObject r0 = r8.A01     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.toString(r3)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            goto L84
        L91:
            org.json.JSONObject r0 = r8.A00     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            java.lang.String r0 = r0.toString(r3)     // Catch: org.json.JSONException -> L98 java.lang.Throwable -> Lbc
            goto L75
        L98:
            monitor-exit(r8)
            return r7
        L9a:
            monitor-exit(r8)
            return r3
        L9c:
            r2 = 113(0x71, float:1.58E-43)
            r1 = 19
            r0 = 22
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lac:
            r2 = 101(0x65, float:1.42E-43)
            r1 = 12
            r0 = 84
            java.lang.String r1 = A02(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0469Go.A05(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0712Qf
    public final synchronized void A3G(InterfaceC0714Qh interfaceC0714Qh) {
        this.A04.add(interfaceC0714Qh);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0712Qf
    public final synchronized JSONObject A6P() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0712Qf
    public final synchronized JSONObject A6n() {
        if (this.A03.A04()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0712Qf
    public final EnumC0713Qg A6s() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0712Qf
    public final synchronized boolean A8r() {
        return this.A02;
    }
}
