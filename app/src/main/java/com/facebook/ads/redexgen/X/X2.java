package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.common.Preconditions;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class X2 implements C8Z {
    public static byte[] A03;
    public static final String A04;
    public final C0886Xb A00;
    public final InterfaceC02798k<IX> A01;
    public final InterfaceC02798k<IX> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, airhockey.J_ONREWARDED, 43, 34, airhockey.J_ONREWARDED, 48, 61, 52, 33, 126, airhockey.J_ONREWARDED, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, 42, 60, airhockey.J_GAME_REMATCH, airhockey.P_GAME_MYLOSE, 65, airhockey.P_GAME_MYLOSE, 89, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 13, airhockey.P_GAME_MYLOSE, 91, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 89, 23, 13, 15, airhockey.P_NATION, airhockey.J_GAME_STANDBY, 109, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 96, 36, airhockey.J_GOO, airhockey.J_GAME_ENEMYEXIT, 36, airhockey.J_ENEMYWIN, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, airhockey.J_GAME_STANDBY, airhockey.J_REWARD, 36, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_SDKVER, airhockey.J_GAME_EXIT, airhockey.J_GOO, 119, 36, 119, airhockey.J_GOO, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GAME_STANDBY, 99, airhockey.J_SDKVER, airhockey.J_SDKVER, airhockey.P_GAME_BREAKBALLCOUNT, 78, 75, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 7, 83, airhockey.P_GAME_MYLOSE, 7, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 84, airhockey.P_NATION, 85, 78, airhockey.P_GAME_BREAKBALLCOUNT, 75, 78, 93, airhockey.P_NATION, 7, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_REMATCH, 7, airhockey.P_NATION, 81, airhockey.P_NATION, airhockey.P_GAME_REMATCH, 83, 7, 65, 85, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_EXIT, 7, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 83, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, 84, airhockey.P_NATION, 7, airhockey.J_GAME_ENEMYEXIT, 76, airhockey.P_GAME_SELECTMAP, 65, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 13, 89, airhockey.P_NATION, 13, 64, airhockey.P_NATION, 91, airhockey.P_GAME_MYLOSE, 13, airhockey.P_GAME_MYLOSE, 91, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 89, 94, 13, 75, 95, airhockey.P_NATION, 64, 13, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, 0, 75, 65, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_EXIT, airhockey.P_GAME_STANDBY, 89, 13, 94, 89, airhockey.P_NATION, 95, 76, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYLOSE, 13, 79, 76, 78, airhockey.P_GAME_BREAKBALLCOUNT, 13, 89, airhockey.P_NATION, 13, airhockey.P_GAME_MYLOSE, 91, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 89, 94, 13, airhockey.P_GAME_REMATCH, 76, 89, 76, 79, 76, 94, airhockey.P_GAME_MYLOSE, airhockey.J_REWARD, 81, 89, 92, 85, 84, 16, airhockey.P_GAME_SELECTMAP, 95, 16, 64, 81, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 85, 16, 81, 94, 16, 85, airhockey.P_GAME_BREAKBALLCOUNT, 85, 94, airhockey.P_GAME_SELECTMAP, 16, 86, airhockey.P_NATION, 95, 93, 16, 89, 94, 29, 86, 92, 89, 87, 88, airhockey.P_GAME_SELECTMAP, 16, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_SELECTMAP, 95, airhockey.P_NATION, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, airhockey.P_GAME_REMATCH, 82, 29, 79, 88, 92, 89, 29, airhockey.P_GAME_REMATCH, 85, 88, 29, 83, airhockey.P_GAME_MYLOSE, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, airhockey.P_GAME_REMATCH, 78, 29, 91, 79, 82, 80, 29, 89, 92, airhockey.P_GAME_REMATCH, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, airhockey.J_GAME_EXIT, 62, 37, airhockey.J_GAME_EXIT, 57, 47, 56, 35, 43, 38, 35, 48, 47, airhockey.J_GAME_EXIT, 43, 46, airhockey.J_GAME_EXIT, 47, 60, 47, 36, 62, airhockey.J_GAME_REMATCH, 78, airhockey.P_GAME_BREAKBALLCOUNT, 76, airhockey.P_GAME_REMATCH, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, 84, 13, airhockey.J_SDKVER, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_STANDBY, 86, airhockey.P_GAME_STANDBY, 78, 84, airhockey.J_SAVEDGAME_SAVE, 84, 79, 82, 65, airhockey.P_GAME_MYWIN, airhockey.P_GAME_STANDBY, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYSCORE, 79, 82, airhockey.P_GAME_SELECTMAP, airhockey.J_ONREWARDED, 65, 84, 65, airhockey.P_NATION, 65, 83, airhockey.P_GAME_STANDBY, 56, 15, 9, 5, 24, 14, airhockey.P_GAME_EXIT, 14, 11, 30, 11, 8, 11, 25, 15, airhockey.P_GAME_EXIT, 12, 11, 3, 6, 31, 24, 15, airhockey.P_GAME_EXIT, 5, 9, 9, 31, 24, 24, 15, 14, airhockey.P_GAME_EXIT, 29, 2, 15, 4, airhockey.P_GAME_EXIT, 24, 15, 11, 14, 3, 4, 13, airhockey.P_GAME_EXIT, 15, 28, 15, 4, 30, 25, airhockey.P_GAME_SELECTMAP, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, airhockey.P_GAME_MYLOSE, 78, airhockey.P_NATION, 95, airhockey.P_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_REMATCH, 76, 89, 76, 79, 76, 94, airhockey.P_GAME_MYLOSE, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, airhockey.J_ONREWARDED, airhockey.J_WAIT, 125, airhockey.J_ERROR, 49, 42, 46, 32, 43, 88, 85, 92, airhockey.P_GAME_REMATCH, 12, 23, 18, 23, 22, 14, 23};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ec A[Catch: 8t -> 0x0132, TryCatch #3 {8t -> 0x0132, blocks: (B:114:0x00e0, B:116:0x00ec, B:117:0x00fb, B:103:0x0088, B:105:0x008e, B:107:0x009a, B:108:0x00d6, B:120:0x0104, B:121:0x0108, B:123:0x010e, B:124:0x011e, B:125:0x0122, B:127:0x0128), top: B:140:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X2.A0B(int, java.util.Set, java.util.Set):int");
    }

    static {
        A03();
        A04 = X2.class.getSimpleName();
    }

    public X2(C0886Xb c0886Xb) throws IOException {
        this.A00 = c0886Xb;
        this.A01 = new C0884Wz(C02768h.A00(A00(11, 28, 31), c0886Xb), new X4(this));
        this.A02 = new C0884Wz(C02768h.A00(A00(322, 37, 102), c0886Xb), new X3(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException jsone) {
                if (this.A00.A04().A8f()) {
                    Log.e(A04, A00(85, 45, 97), jsone);
                }
                int start = C02627s.A2O;
                A05(start, jsone);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    public void A04(int i, String str) {
        C02637t c02637t = new C02637t(str);
        c02637t.A03(1);
        this.A00.A07().A9D(A00(425, 15, 107), i, c02637t);
    }

    private void A05(int i, Throwable th) {
        this.A00.A07().A9C(A00(425, 15, 107), i, new C02637t(th));
    }

    public static byte[] A07(C7N c7n, String str, IX ix) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(HttpStatus.SC_LOCKED, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), ix.A08());
            jSONObject.put(A00(471, 4, 106), ix.A06().toString());
            jSONObject.put(A00(462, 4, 86), LC.A02(ix.A04()));
            jSONObject.put(A00(450, 12, 27), LC.A02(ix.A03()));
            jSONObject.put(A00(440, 10, 116), ix.A07());
            String A00 = A00(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 4, 62);
            JSONObject eventJson = new JSONObject(ix.A09());
            jSONObject.put(A00, eventJson);
            jSONObject.put(A00(HttpStatus.SC_PRECONDITION_FAILED, 7, 26), 0);
        } catch (JSONException e) {
            if (c7n.A04().A8f()) {
                Log.e(A04, A00(294, 28, 12), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7U();
        } catch (C02888t e) {
            if (this.A00.A04().A8f()) {
                Log.e(A04, A00(245, 49, 123), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:46:0x002c */
    /* JADX WARN: Incorrect condition in loop: B:56:0x0054 */
    /* JADX WARN: Incorrect condition in loop: B:60:0x006e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<org.json.JSONObject> A0C(int r8) {
        /*
            r7 = this;
            r6 = 0
            r0 = -1
            if (r8 != r0) goto L7
            r6 = 1
            r8 = 30
        L7:
            int[] r1 = new int[r8]
            int r0 = r8 * 1000
            byte[] r4 = new byte[r0]
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.facebook.ads.redexgen.X.8k<com.facebook.ads.redexgen.X.IX> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            com.facebook.ads.redexgen.X.8j r0 = r0.A5O(r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            int r2 = r0.A5P()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
        L28:
            boolean r0 = r0.A9h()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            if (r0 == 0) goto L4c
            if (r2 < r8) goto L32
            if (r6 == 0) goto L4c
        L32:
            if (r6 == 0) goto L35
            goto L3a
        L35:
            int r0 = r8 - r2
            int[] r1 = new int[r0]     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            goto L3e
        L3a:
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
        L3e:
            com.facebook.ads.redexgen.X.8k<com.facebook.ads.redexgen.X.IX> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            com.facebook.ads.redexgen.X.8j r0 = r0.A5O(r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            goto L28
        L4c:
            java.util.Iterator r2 = r5.iterator()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
        L50:
            boolean r0 = r2.hasNext()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            if (r0 == 0) goto L66
            java.lang.Object r0 = r2.next()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            com.facebook.ads.redexgen.X.8k<com.facebook.ads.redexgen.X.IX> r1 = r7.A02     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            byte[] r0 = A09(r0)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            r1.AFV(r0)     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            goto L50
        L66:
            java.util.Iterator r1 = r3.iterator()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
        L6a:
            boolean r0 = r1.hasNext()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r1.next()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            com.facebook.ads.redexgen.X.8j r0 = (com.facebook.ads.redexgen.X.InterfaceC02788j) r0     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            r0.A4l()     // Catch: com.facebook.ads.redexgen.X.C02888t -> L7a
            goto L6a
        L7a:
            r4 = move-exception
            com.facebook.ads.redexgen.X.Xb r0 = r7.A00
            com.facebook.ads.redexgen.X.7S r0 = r0.A04()
            boolean r0 = r0.A8f()
            if (r0 == 0) goto L96
            java.lang.String r3 = com.facebook.ads.redexgen.X.X2.A04
            r2 = 359(0x167, float:5.03E-43)
            r1 = 53
            r0 = 44
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r3, r0, r4)
        L96:
            int r0 = com.facebook.ads.redexgen.X.C02627s.A2L
            r7.A05(r0, r4)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.X2.A0C(int):java.util.List");
    }

    @Override // com.facebook.ads.redexgen.X.C8Z
    public final void A43() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C02888t e) {
            if (this.A00.A04().A8f()) {
                Log.e(A04, A00(55, 30, 66), e);
            }
            A05(C02627s.A2I, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8W != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C8Z
    public final void AG8(IX ix, C8W<String> c8w) {
        LN.A00(LQ.A07, new AsyncTask<Void, Void, String>(ix, c8w, this.A01, this.A00) { // from class: com.facebook.ads.redexgen.X.8a
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            @Nullable
            public C02888t A00;
            public final C7N A01;
            public final C8W<String> A02;
            public final InterfaceC02798k<IX> A03;
            public final IX A04;

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, airhockey.J_SDKVER, 36, 55, 36, 47, 53, 123, airhockey.J_SDKVER, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8W != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8k != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = ix;
                this.A03 = interfaceC02798k;
                this.A02 = c8w;
                this.A01 = c0886Xb;
            }

            @Nullable
            private final String A01(Void... voidArr) {
                byte[] A07;
                if (C0548Jt.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        this.A01.A07().A8S(this.A04.A06().toString());
                    } catch (C02888t e) {
                        this.A00 = e;
                        InterfaceC02617r A072 = this.A01.A07();
                        String eventId = A00(44, 15, 76);
                        A072.A9C(eventId, C02627s.A2M, new C02637t(e));
                    }
                    if (TextUtils.isEmpty(this.A04.A08())) {
                        return null;
                    }
                    if (this.A01.A04().A8f()) {
                        String str2 = A00(29, 15, 118) + this.A04.A06().toString() + A00(0, 1, 13) + this.A04.A09().toString();
                    }
                    InterfaceC02798k<IX> interfaceC02798k2 = this.A03;
                    A07 = X2.A07(this.A01, str, this.A04);
                    interfaceC02798k2.AFV(A07);
                    return str;
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (C0548Jt.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
