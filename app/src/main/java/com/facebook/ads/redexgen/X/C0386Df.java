package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Df */
/* loaded from: assets/audience_network.dex */
public final class C0386Df implements Handler.Callback, VB, GL, ES, C9C, InterfaceC03049j {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C9O A04;
    public C9Z A05;
    public ET A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public InterfaceC0879Wu[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final C0882Wx A0G;
    public final InterfaceC0880Wv A0H;
    public final C9U A0J;
    public final C03129s A0L;
    public final C03139t A0M;
    public final GM A0N;
    public final GN A0O;
    public final HG A0P;
    public final HQ A0Q;
    public final ArrayList<C9M> A0R;
    public final boolean A0S;
    public final InterfaceC0879Wu[] A0T;
    public final InterfaceC03089n[] A0U;
    public final C9X A0K = new C9X();
    public C03119q A06 = C03119q.A03;
    public final C9N A0I = new C9N();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07() throws C9F, IOException {
        InterfaceC0879Wu[] interfaceC0879WuArr;
        long AFm = this.A0P.AFm();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(AFm, 10L);
            return;
        }
        C9V A0G = this.A0K.A0G();
        C0496Hp.A02(A06(150, 10, 20));
        A0J();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0G.A08.A4s(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean z2 = true;
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0C) {
            interfaceC0879Wu.AEH(this.A03, elapsedRealtime);
            boolean z3 = true;
            z = z && interfaceC0879Wu.A8h();
            boolean z4 = interfaceC0879Wu.A8r() || interfaceC0879Wu.A8h() || A0s(interfaceC0879Wu);
            if (!z4) {
                interfaceC0879Wu.A9m();
            }
            if (!z2 || !z4) {
                z3 = false;
            }
            z2 = z3;
        }
        if (!z2) {
            A0B();
        }
        long j = A0G.A02.A01;
        if (z && ((j == -9223372036854775807L || j <= this.A05.A0A) && A0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z2)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z2 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (InterfaceC0879Wu interfaceC0879Wu2 : this.A0C) {
                interfaceC0879Wu2.A9m();
            }
        }
        boolean z5 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z5 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(AFm, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AEE(2);
        } else {
            A0R(AFm, 1000L);
        }
        C0496Hp.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0062, code lost:
        if (r4 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0064, code lost:
        r4 = r14.A0K.A0G();
        r2 = r14.A0K.A0S(r4);
        r5 = new boolean[r14.A0T.length];
        r10 = r4.A0B(r14.A05.A0A, r2, r5);
        A0i(r4.A03, r4.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0088, code lost:
        if (r14.A05.A00 == 4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0090, code lost:
        if (r10 == r14.A05.A0A) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0092, code lost:
        r8 = r14.A05;
        r14.A05 = r8.A04(r8.A04, r10, r14.A05.A01);
        r14.A0I.A04(4);
        A0P(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a8, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b6, code lost:
        if (com.facebook.ads.redexgen.X.C0386Df.A0W[2].charAt(12) == 'N') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00b8, code lost:
        r2 = com.facebook.ads.redexgen.X.C0386Df.A0W;
        r2[1] = "v6rigB8My08mC5ZvZtTcxONYTtnHkhiY";
        r2[0] = "jJJ7EyTzSHhVUQBMBNjuu6IlWzfsi9o6";
        r9 = new boolean[r14.A0T.length];
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ca, code lost:
        r1 = r14.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00cd, code lost:
        if (r11 >= r1.length) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00cf, code lost:
        r10 = r1[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00d5, code lost:
        if (r10.A7i() == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00d7, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d8, code lost:
        r9[r11] = r0;
        r1 = r4.A0A[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00de, code lost:
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00e0, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00e4, code lost:
        if (r9[r11] == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00ea, code lost:
        if (r1 == r10.A7n()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ec, code lost:
        A0b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ef, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00f4, code lost:
        if (r5[r11] == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f6, code lost:
        r1 = r14.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0104, code lost:
        if (com.facebook.ads.redexgen.X.C0386Df.A0W[5].charAt(1) == 'w') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0106, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[7] = "kUW5tsmcM8CZIAjkj84TOGdyZAx2gWc6";
        r10.AET(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0111, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0113, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[7] = "5RhHFxqKf8KludlSzI9zDK8m295dvAFV";
        r9 = new boolean[r14.A0T.length];
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0128, code lost:
        if (r4 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0133, code lost:
        r14.A0K.A0S(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x013a, code lost:
        if (r6.A06 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x013c, code lost:
        r6.A0A(java.lang.Math.max(r6.A02.A03, r6.A08(r14.A03)), false);
        A0i(r6.A03, r6.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0156, code lost:
        r14.A05 = r14.A05.A05(r4.A03, r4.A04);
        A0p(r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01a3, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0E() throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0386Df.A0E():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0096, code lost:
        if (r6 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0098, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00c8, code lost:
        if (r6 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00cb, code lost:
        r2 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00d1, code lost:
        if (r4.A02.A05 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00d3, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00d4, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00d7, code lost:
        if (r5 >= r2.length) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00d9, code lost:
        r3 = r2[r5];
        r2 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x00df, code lost:
        if (r2 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00e5, code lost:
        if (r3.A7n() != r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00eb, code lost:
        if (r3.A8H() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00ed, code lost:
        r3.AEt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00f0, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00f3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00f6, code lost:
        if (r4.A01 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00fc, code lost:
        if (r4.A01.A06 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00fe, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00ff, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0100, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0103, code lost:
        if (r6 >= r2.length) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0105, code lost:
        r8 = r2[r6];
        r7 = r4.A0A[r6];
        r5 = r8.A7n();
        r3 = com.facebook.ads.redexgen.X.C0386Df.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0121, code lost:
        if (r3[1].charAt(10) == r3[0].charAt(10)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0123, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[2] = "GzZd6F7lJVp08TeGQitpN19OrvCnG4PK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x012a, code lost:
        if (r5 != r7) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x012c, code lost:
        if (r7 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0132, code lost:
        if (r8.A8H() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0134, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0135, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0138, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[5] = "G5Kl7lcZBM87T4fNUwO1IYVdGnNcsgpo";
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x013f, code lost:
        if (r5 != r7) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0142, code lost:
        r7 = r4.A04;
        r6 = r1.A0K.A0D();
        r5 = r6.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0159, code lost:
        if (r6.A08.ADt() == (-9223372036854775807L)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x015b, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x015c, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x015d, code lost:
        r8 = r1.A0T;
        r3 = com.facebook.ads.redexgen.X.C0386Df.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0171, code lost:
        if (r3[1].charAt(10) == r3[0].charAt(10)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0173, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[5] = "zgqvIFw9hHXttypZtkJx3efsgqUZ32NO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x017b, code lost:
        if (r4 >= r8.length) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x017d, code lost:
        r8 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0183, code lost:
        if (r7.A00(r4) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0185, code lost:
        r4 = r4 + 1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0189, code lost:
        if (r10 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x018b, code lost:
        r8.AEt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0193, code lost:
        if (r8.A8e() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0195, code lost:
        r9 = r5.A01.A00(r4);
        r3 = r5.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x01a8, code lost:
        if (r1.A0U[r4].A7u() != 5) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x01aa, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01ab, code lost:
        r1 = r7.A03[r4];
        r0 = r5.A03[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01b3, code lost:
        if (r3 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01b9, code lost:
        if (r0.equals(r1) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01bb, code lost:
        if (r2 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01bd, code lost:
        r8.AEJ(A0v(r9), r6.A0A[r4], r6.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01cd, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01cf, code lost:
        r8.AEt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01d4, code lost:
        if (r4 >= r8.length) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01d7, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01d9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:?, code lost:
        return;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0I() throws com.facebook.ads.redexgen.X.C9F, java.io.IOException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0386Df.A0I():void");
    }

    public static void A0K() {
        byte[] bArr = {airhockey.P_GAME_SELECTMAP, airhockey.J_WAIT, airhockey.J_INVITE, 81, 109, 96, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYLOSE, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, 109, airhockey.P_GAME_MYLOSE, 111, airhockey.J_ERROR, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, 111, 96, 109, 111, 82, airhockey.P_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.P_GAME_BREAKBALLCOUNT, 75, 83, 79, 88, 99, airhockey.P_GAME_MYWIN, 90, airhockey.P_GAME_BREAKBALLCOUNT, 99, airhockey.P_GAME_SELECTMAP, 94, 79, 88, airhockey.P_GAME_SELECTMAP, 75, airhockey.P_GAME_BREAKBALLCOUNT, 16, airhockey.J_NATION, 75, airhockey.P_GAME_SELECTMAP, 78, airhockey.P_GAME_BREAKBALLCOUNT, 79, 88, airhockey.P_NATION, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_GAME_DISCONNECT, 43, 102, airhockey.J_INVITE, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_INVITE, airhockey.J_ACHIEVEMENTCALLBACK, 43, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, 43, airhockey.J_GAME_EXIT, 109, ByteCompanionObject.MAX_VALUE, airhockey.J_INVITE, airhockey.J_WAIT, 43, airhockey.J_WAIT, airhockey.J_INVITE, airhockey.J_ENEMYWIN, airhockey.J_INVITE, airhockey.J_GAME_EXIT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_INVITE, 37, airhockey.P_GAME_STANDBY, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, 126, airhockey.J_NATION, 109, 96, 44, 126, airhockey.J_WAIT, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, airhockey.J_GAME_REMATCH, 44, airhockey.J_GAME_REMATCH, 126, 126, 99, 126, 34, 24, 36, 41, 49, 42, 41, 43, 35, airhockey.J_ENEMYLOSE, 45, 58, 58, 39, 58, 102, airhockey.P_GAME_EXIT, airhockey.J_REWARD, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, 124, 57, 124, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, airhockey.J_REWARD, airhockey.J_GAME_ENEMYEXIT, 55, airhockey.P_GAME_MYLOSE, 111, airhockey.J_DISCONNECT, airhockey.J_GAME_ENEMYEXIT, 59, 125, airhockey.J_PURCHASE, airhockey.J_SAVEDGAME_RELOAD, 119, 126, ByteCompanionObject.MAX_VALUE, 53, 90, 81, 109, 81, 83, 91, airhockey.J_GAME_REMATCH, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0S(C9L c9l) throws C9F {
        if (c9l.A01 != this.A07) {
            return;
        }
        AbstractC03149u abstractC03149u = this.A05.A03;
        AbstractC03149u abstractC03149u2 = c9l.A00;
        Object obj = c9l.A02;
        this.A0K.A0N(abstractC03149u2);
        this.A05 = this.A05.A03(abstractC03149u2, obj);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C9O c9o = this.A04;
            if (c9o != null) {
                Pair<Integer, Long> A04 = A04(c9o, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                ER A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            } else if (this.A05.A02 == -9223372036854775807L) {
                if (abstractC03149u2.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(abstractC03149u2, abstractC03149u2.A05(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                ER A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            } else {
                return;
            }
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (abstractC03149u.A0E()) {
            if (abstractC03149u2.A0E()) {
                return;
            }
            ER A0L3 = this.A0K.A0L(i2, j);
            this.A05 = this.A05.A04(A0L3, A0L3.A01() ? 0L : j, j);
            return;
        }
        C9V A0E = this.A0K.A0E();
        int A042 = abstractC03149u2.A04(A0E == null ? abstractC03149u.A0A(i2, this.A0L, true).A03 : A0E.A09);
        if (A042 != -1) {
            if (A042 != i2) {
                this.A05 = this.A05.A01(A042);
            }
            ER er = this.A05.A04;
            if (er.A01()) {
                ER A0L4 = this.A0K.A0L(A042, j);
                if (!A0L4.equals(er)) {
                    this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : j), j);
                    return;
                }
            }
            if (this.A0K.A0U(er, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int A01 = A01(i2, abstractC03149u, abstractC03149u2);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (A01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> A052 = A05(abstractC03149u2, abstractC03149u2.A09(A01, this.A0L).A00, -9223372036854775807L);
        int intValue3 = ((Integer) A052.first).intValue();
        long longValue3 = ((Long) A052.second).longValue();
        ER A0L5 = this.A0K.A0L(intValue3, longValue3);
        abstractC03149u2.A0A(intValue3, this.A0L, true);
        if (A0E != null) {
            Object obj2 = this.A0L.A03;
            A0E.A02 = A0E.A02.A00(-1);
            while (A0E.A01 != null) {
                A0E = A0E.A01;
                if (A0E.A09.equals(obj2)) {
                    C9X c9x = this.A0K;
                    C9W c9w = A0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    A0E.A02 = c9x.A0J(c9w, intValue3);
                } else {
                    A0E.A02 = A0E.A02.A00(-1);
                }
            }
        }
        boolean A012 = A0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(A0L5, A02(A0L5, A012 ? 0L : longValue3), longValue3);
    }

    static {
        A0K();
    }

    public C0386Df(InterfaceC0879Wu[] interfaceC0879WuArr, GM gm, GN gn, C9U c9u, boolean z, int i, boolean z2, Handler handler, InterfaceC0880Wv interfaceC0880Wv, HG hg) {
        this.A0T = interfaceC0879WuArr;
        this.A0N = gm;
        this.A0O = gn;
        this.A0J = c9u;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = interfaceC0880Wv;
        this.A0P = hg;
        this.A0D = c9u.A5o();
        this.A0S = c9u.AEU();
        this.A05 = new C9Z(AbstractC03149u.A01, -9223372036854775807L, TrackGroupArray.A04, gn);
        this.A0U = new InterfaceC03089n[interfaceC0879WuArr.length];
        for (int i2 = 0; i2 < interfaceC0879WuArr.length; i2++) {
            interfaceC0879WuArr[i2].AEw(i2);
            this.A0U[i2] = interfaceC0879WuArr[i2].A61();
        }
        this.A0G = new C0882Wx(this, hg);
        this.A0R = new ArrayList<>();
        this.A0C = new InterfaceC0879Wu[0];
        this.A0M = new C03139t();
        this.A0L = new C03129s();
        gm.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F.start();
        this.A0Q = hg.A4M(this.A0F.getLooper(), this);
    }

    private int A00() {
        AbstractC03149u abstractC03149u = this.A05.A03;
        if (abstractC03149u.A0E()) {
            return 0;
        }
        return abstractC03149u.A0B(abstractC03149u.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AbstractC03149u abstractC03149u, AbstractC03149u abstractC03149u2) {
        int i2 = i;
        int maxIterations = -1;
        int A00 = abstractC03149u.A00();
        for (int i3 = 0; i3 < A00 && maxIterations == -1; i3++) {
            i2 = abstractC03149u.A03(i2, this.A0L, this.A0M, this.A02, this.A0B);
            if (i2 == -1) {
                break;
            }
            maxIterations = abstractC03149u2.A04(abstractC03149u.A0A(i2, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(ER er, long j) throws C9F {
        return A03(er, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0039, code lost:
        if (r4 != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003b, code lost:
        if (r12 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x003d, code lost:
        r4 = r8.A0C;
        r2 = r4.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
        if (r1 >= r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0043, code lost:
        A0b(r4[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0052, code lost:
        r8.A0C = new com.facebook.ads.redexgen.X.InterfaceC0879Wu[0];
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0057, code lost:
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0059, code lost:
        A0V(r4);
        r2 = com.facebook.ads.redexgen.X.C0386Df.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
        r2 = com.facebook.ads.redexgen.X.C0386Df.A0W;
        r2[4] = "JYav744H3005gGdd3wHQ67gij";
        r2[3] = "FVGbgJ3f5rxs8oy2Mt1O3WpPvx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007e, code lost:
        if (r3.A05 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0080, code lost:
        r10 = r3.A08.AEg(r10);
        r7 = r3.A08;
        r2 = r10 - r8.A0D;
        r6 = r8.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
        if (com.facebook.ads.redexgen.X.C0386Df.A0W[7].charAt(9) == '8') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
        if (r3.A05 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a8, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[7] = "LvYFslBjN8wEk55S4mS5Jlrj4VNptxmz";
        r7.A4s(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b2, code lost:
        A0P(r10);
        A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b9, code lost:
        r8.A0K.A0O(true);
        A0P(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
        r8.A0Q.AEi(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
        if (com.facebook.ads.redexgen.X.C0386Df.A0W[2].charAt(12) == 'N') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d6, code lost:
        com.facebook.ads.redexgen.X.C0386Df.A0W[2] = "qbdkiXSPlbFYutVyIKxCWSr3uDHCS3n2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A03(com.facebook.ads.redexgen.X.ER r9, long r10, boolean r12) throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0386Df.A03(com.facebook.ads.redexgen.X.ER, long, boolean):long");
    }

    private Pair<Integer, Long> A04(C9O c9o, boolean z) {
        int A01;
        AbstractC03149u abstractC03149u = this.A05.A03;
        AbstractC03149u abstractC03149u2 = c9o.A02;
        if (abstractC03149u.A0E()) {
            return null;
        }
        if (abstractC03149u2.A0E()) {
            abstractC03149u2 = abstractC03149u;
        }
        try {
            Pair<Integer, Long> A07 = abstractC03149u2.A07(this.A0M, this.A0L, c9o.A00, c9o.A01);
            if (abstractC03149u == abstractC03149u2) {
                return A07;
            }
            int A04 = abstractC03149u.A04(abstractC03149u2.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z || (A01 = A01(((Integer) A07.first).intValue(), abstractC03149u2, abstractC03149u)) == -1) {
                return null;
            }
            Pair<Integer, Long> A05 = A05(abstractC03149u, abstractC03149u.A09(A01, this.A0L).A00, -9223372036854775807L);
            String[] strArr = A0W;
            if (strArr[4].length() != strArr[3].length()) {
                String[] strArr2 = A0W;
                strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
                strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
                return A05;
            }
            throw new RuntimeException();
        } catch (IndexOutOfBoundsException unused) {
            throw new C9T(abstractC03149u, c9o.A00, c9o.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC03149u abstractC03149u, int i, long j) {
        return abstractC03149u.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C9V A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AFC = this.A0J.AFC(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A7O().A01);
        A0k(AFC);
        if (AFC) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        boolean z;
        int i2;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i = this.A0I.A01;
            z = this.A0I.A03;
            if (z) {
                i2 = this.A0I.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i, i2, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C9V A0F = this.A0K.A0F();
        C9V readingPeriodHolder = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (readingPeriodHolder != null) {
                C9V loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != A0F) {
                    return;
                }
            }
            InterfaceC0879Wu[] interfaceC0879WuArr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (InterfaceC0879Wu interfaceC0879Wu : interfaceC0879WuArr) {
                if (!interfaceC0879Wu.A8H()) {
                    return;
                }
            }
            A0F.A08.A9k();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C9W A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.A9l();
                return;
            }
            VA mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5j(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.ADY(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACJ();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C9F {
        this.A09 = false;
        this.A0G.A05();
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0C) {
            interfaceC0879Wu.start();
        }
    }

    private void A0H() throws C9F {
        this.A0G.A06();
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0C) {
            A0c(interfaceC0879Wu);
        }
    }

    private void A0J() throws C9F {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C9V A0G = this.A0K.A0G();
        VA va = A0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long ADt = va.ADt();
        if (ADt != -9223372036854775807L) {
            A0P(ADt);
            if (ADt != this.A05.A0A) {
                C9Z c9z = this.A05;
                ER er = c9z.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c9z.A04(er, ADt, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C9Z c9z2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c9z2.A09 = A0C;
    }

    private void A0L(float f) {
        GJ[] A01;
        for (C9V A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            GN gn = A0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (gn != null) {
                for (GJ gj : A0E.A04.A01.A01()) {
                    if (gj != null) {
                        gj.AC2(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C9F {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            C9Z A02 = this.A05.A02(i);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = A02;
        }
    }

    private void A0O(int i, boolean playing, int i2) throws C9F {
        C9V A0G = this.A0K.A0G();
        InterfaceC0879Wu interfaceC0879Wu = this.A0T[i];
        this.A0C[i2] = interfaceC0879Wu;
        if (interfaceC0879Wu.A7i() == 0) {
            C03099o c03099o = A0G.A04.A03[i];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] A0v = A0v(A0G.A04.A01.A00(i));
            boolean z = this.A08 && this.A05.A00 == 3;
            interfaceC0879Wu.A5D(c03099o, A0v, A0G.A0A[i], this.A03, !playing && z, A0G.A07());
            this.A0G.A09(interfaceC0879Wu);
            if (z) {
                interfaceC0879Wu.start();
            }
        }
    }

    private void A0P(long j) throws C9F {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0C) {
            interfaceC0879Wu.AET(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws C9F {
        C9M c9m;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        C9Z c9z = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i = c9z.A04.A02;
        int currentPeriodIndex = this.A00;
        C9M c9m2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c9m2 != null) {
            if (c9m2.A00 <= i) {
                int i2 = c9m2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i2 == i) {
                        if (c9m2.A01 <= j) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            this.A00--;
            int currentPeriodIndex2 = this.A00;
            c9m2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c9m = this.A0R.get(this.A00);
        } else {
            c9m = null;
        }
        while (c9m != null && c9m.A02 != null && (c9m.A00 < i || (c9m.A00 == i && c9m.A01 <= j))) {
            this.A00++;
            if (this.A00 < this.A0R.size()) {
                c9m = this.A0R.get(this.A00);
            } else {
                c9m = null;
            }
        }
        while (c9m != null && c9m.A02 != null && c9m.A00 == i && c9m.A01 > j && c9m.A01 <= j2) {
            A0Z(c9m.A03);
            if (c9m.A03.A0B() || c9m.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C9M> arrayList = this.A0R;
                int i3 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c9m = arrayList.get(i3);
            } else {
                c9m = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.AEE(2);
        this.A0Q.AEj(2, j + j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.X.C9O r20) throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0386Df.A0T(com.facebook.ads.redexgen.X.9O):void");
    }

    private void A0V(@Nullable C9V c9v) throws C9F {
        C9V A0G = this.A0K.A0G();
        if (A0G == null || c9v == A0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            InterfaceC0879Wu[] interfaceC0879WuArr = this.A0T;
            if (i2 < interfaceC0879WuArr.length) {
                InterfaceC0879Wu interfaceC0879Wu = interfaceC0879WuArr[i2];
                zArr[i2] = interfaceC0879Wu.A7i() != 0;
                if (A0G.A04.A00(i2)) {
                    i++;
                }
                if (zArr[i2] && (!A0G.A04.A00(i2) || (interfaceC0879Wu.A8e() && interfaceC0879Wu.A7n() == c9v.A0A[i2]))) {
                    A0b(interfaceC0879Wu);
                }
                i2++;
            } else {
                this.A05 = this.A05.A05(A0G.A03, A0G.A04);
                A0p(zArr, i);
                return;
            }
        }
    }

    private void A0W(C02959a c02959a) {
        this.A0G.AF4(c02959a);
    }

    public void A0X(C03069l c03069l) throws C9F {
        if (c03069l.A0D()) {
            return;
        }
        try {
            c03069l.A04().A8C(c03069l.A00(), c03069l.A09());
            c03069l.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th) {
            c03069l.A0A(true);
            throw th;
        }
    }

    private void A0Y(C03069l c03069l) throws C9F {
        if (c03069l.A02() == -9223372036854775807L) {
            A0Z(c03069l);
        } else if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C9M(c03069l));
        } else {
            C9M c9m = new C9M(c03069l);
            if (A0r(c9m)) {
                this.A0R.add(c9m);
                Collections.sort(this.A0R);
                return;
            }
            c03069l.A0A(false);
        }
    }

    private void A0Z(C03069l c03069l) throws C9F {
        if (c03069l.A03().getLooper() == this.A0Q.A72()) {
            A0X(c03069l);
            C9Z c9z = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c9z.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AEi(2);
                return;
            }
            return;
        }
        this.A0Q.A9y(15, c03069l).sendToTarget();
    }

    private void A0a(final C03069l c03069l) {
        c03069l.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9K
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C0548Jt.A02(this)) {
                    return;
                }
                try {
                    try {
                        C0386Df.this.A0X(c03069l);
                    } catch (C9F e) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    C0548Jt.A00(th, this);
                }
            }
        });
    }

    private void A0b(InterfaceC0879Wu interfaceC0879Wu) throws C9F {
        this.A0G.A08(interfaceC0879Wu);
        A0c(interfaceC0879Wu);
        interfaceC0879Wu.A4q();
    }

    private void A0c(InterfaceC0879Wu interfaceC0879Wu) throws C9F {
        if (interfaceC0879Wu.A7i() == 2) {
            interfaceC0879Wu.stop();
        }
    }

    private void A0d(C03119q c03119q) {
        this.A06 = c03119q;
    }

    private void A0e(VA va) {
        if (!this.A0K.A0T(va)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(VA va) throws C9F {
        if (!this.A0K.A0T(va)) {
            return;
        }
        C9V A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7O().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C9V loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0422Ep
    /* renamed from: A0g */
    public final void AAc(VA va) {
        this.A0Q.A9y(10, va).sendToTarget();
    }

    private void A0h(ET et, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = et;
        A0N(2);
        et.ADb(this.A0H, true, this);
        this.A0Q.AEi(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, GN gn) {
        this.A0J.ACo(this.A0T, trackGroupArray, gn.A01);
    }

    private void A0j(boolean z) throws C9F {
        ER er = this.A0K.A0G().A02.A04;
        long A03 = A03(er, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            C9Z c9z = this.A05;
            this.A05 = c9z.A04(er, A03, c9z.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C9F {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AEi(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.AEi(2);
        }
    }

    private void A0m(boolean z) throws C9F {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACg();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        GN gn;
        ET et;
        this.A0Q.AEE(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (InterfaceC0879Wu interfaceC0879Wu : this.A0C) {
            try {
                A0b(interfaceC0879Wu);
            } catch (C9F | RuntimeException e) {
                Log.e(A06(0, 21, 43), A06(138, 12, 49), e);
            }
        }
        this.A0C = new InterfaceC0879Wu[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AbstractC03149u.A01);
            Iterator<C9M> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC03149u abstractC03149u = z3 ? AbstractC03149u.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        ER er = z2 ? new ER(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A04 : this.A05.A05;
        if (z3) {
            gn = this.A0O;
        } else {
            gn = this.A05.A06;
        }
        this.A05 = new C9Z(abstractC03149u, obj, er, j, j2, i, false, trackGroupArray, gn);
        if (z && (et = this.A07) != null) {
            et.AEB(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0p(boolean[] r6, int r7) throws com.facebook.ads.redexgen.X.C9F {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Wu[] r0 = new com.facebook.ads.redexgen.X.InterfaceC0879Wu[r7]
            r5.A0C = r0
            r4 = 0
            com.facebook.ads.redexgen.X.9X r0 = r5.A0K
            com.facebook.ads.redexgen.X.9V r3 = r0.A0G()
            r2 = 0
        Lc:
            com.facebook.ads.redexgen.X.Wu[] r0 = r5.A0T
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.GN r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L21
            boolean r1 = r6[r2]
            int r0 = r4 + 1
            r5.A0O(r2, r1, r4)
            r4 = r0
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0386Df.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C9V A0G = this.A0K.A0G();
        long j = A0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C9V c9v = A0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c9v != null) {
                    C9V playingPeriodHolder = A0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C9V playingPeriodHolder2 = A0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C9M c9m) {
        if (c9m.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C9O(c9m.A03.A08(), c9m.A03.A01(), AnonymousClass99.A00(c9m.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            int intValue = ((Integer) A04.first).intValue();
            long longValue = ((Long) A04.second).longValue();
            AbstractC03149u abstractC03149u = this.A05.A03;
            Integer num = (Integer) A04.first;
            String[] strArr = A0W;
            String str = strArr[1];
            String str2 = strArr[0];
            int charAt = str.charAt(10);
            int index = str2.charAt(10);
            if (charAt == index) {
                throw new RuntimeException();
            }
            A0W[6] = "Qe4SjxIsSBa3x6HAW";
            c9m.A01(intValue, longValue, abstractC03149u.A0A(num.intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c9m.A02);
            if (A042 == -1) {
                return false;
            }
            c9m.A00 = A042;
        }
        return true;
    }

    private boolean A0s(InterfaceC0879Wu interfaceC0879Wu) {
        C9V A0H = this.A0K.A0H();
        C9V readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C9V readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && interfaceC0879Wu.A8H()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(ER er, long j, C9V c9v) {
        if (er.equals(c9v.A02.A04) && c9v.A06) {
            this.A05.A03.A09(c9v.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 != -1) {
                int nextAdGroupIndex = (this.A0L.A09(A04) > c9v.A02.A02 ? 1 : (this.A0L.A09(A04) == c9v.A02.A02 ? 0 : -1));
                if (nextAdGroupIndex == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (this.A05.A08) {
            C9V A0F = this.A0K.A0F();
            long A0C = A0F.A0C(!A0F.A02.A05);
            return A0C == Long.MIN_VALUE || this.A0J.AFF(A0C - A0F.A08(this.A03), this.A0G.A7O().A01, this.A09);
        }
        return true;
    }

    @NonNull
    public static Format[] A0v(GJ gj) {
        int length = gj != null ? gj.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int charAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (charAt != length2) {
            String[] strArr2 = A0W;
            strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
            strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
            for (int i = 0; i < length; i++) {
                formatArr[i] = gj.A6o(i);
            }
            return formatArr;
        }
        throw new RuntimeException();
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:36:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.HQ r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AEi(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0386Df.A0x():void");
    }

    public final void A0y(AbstractC03149u abstractC03149u, int i, long j) {
        this.A0Q.A9y(3, new C9O(abstractC03149u, i, j)).sendToTarget();
    }

    public final void A0z(ET et, boolean z, boolean z2) {
        this.A0Q.A9x(0, z ? 1 : 0, z2 ? 1 : 0, et).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.A9w(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A9w(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.C9C
    public final void AC1(C02959a c02959a) {
        this.A0E.obtainMessage(1, c02959a).sendToTarget();
        A0L(c02959a.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VB
    public final void AC9(VA va) {
        this.A0Q.A9y(9, va).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.ES
    public final void ACb(ET et, AbstractC03149u abstractC03149u, Object obj) {
        this.A0Q.A9y(8, new C9L(et, abstractC03149u, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03049j
    public final synchronized void AEk(C03069l c03069l) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            c03069l.A0A(false);
            return;
        }
        this.A0Q.A9y(14, c03069l).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((ET) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C9O) message.obj);
                    break;
                case 4:
                    A0W((C02959a) message.obj);
                    break;
                case 5:
                    A0d((C03119q) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C9L) message.obj);
                    break;
                case 9:
                    A0f((VA) message.obj);
                    break;
                case 10:
                    A0e((VA) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C03069l) message.obj);
                    break;
                case 15:
                    A0a((C03069l) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C9F e) {
            Log.e(A06, A06(110, 15, 98), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 51), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C9F.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 38), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C9F.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
