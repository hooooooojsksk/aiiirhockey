package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import androidx.work.WorkRequest;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class WI implements BV {
    public static byte[] A0p;
    public static String[] A0q = {"WhKu7pkuAeXCsVE8uRhv3EZwgBp9riSc", "wrDeNyGLCWUv14ZggE2zPWUzu5gjoOIg", "xUs1VEgTJlmvEesGlKYim2mGX89Mn6Ap", "W8YnXYO8xf4ClNYvDZVYWX", "B88t6KSt5rHqx0X", "mP1RKkMa67OSAD0gBpbGTYhDs7d4UNMk", "rmkWP1gG3PZnRTV6Vu72xnpKfVt", "q3NSDD9bEbAX3BTi5XmjKvgCV917aeoR"};
    public static final BY A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
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
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public BX A0N;
    public C0357Br A0O;
    public HS A0P;
    public HS A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<C0357Br> A0c;
    public final InterfaceC0355Bn A0d;
    public final C0359Bu A0e;
    public final C0483Hc A0f;
    public final C0483Hc A0g;
    public final C0483Hc A0h;
    public final C0483Hc A0i;
    public final C0483Hc A0j;
    public final C0483Hc A0k;
    public final C0483Hc A0l;
    public final C0483Hc A0m;
    public final C0483Hc A0n;
    public final boolean A0o;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{65, -113, -112, -107, 65, -108, -106, -111, -111, -112, -109, -107, -122, -123, -98, -87, -86, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, 56, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 119, 77, 56, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 119, 77, 56, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 119, 63, 56, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_BREAKBALLCOUNT, 119, -107, -103, -89, -89, -71, -56, -56, -67, -62, -69, -57, -105, -67, -60, -68, -71, -58, -95, -61, -72, -71, airhockey.J_DISCONNECT, -53, -23, -53, -53, -51, -55, -25, -55, -53, -69, -81, -51, -78, -62, -63, -117, -87, -114, -98, -99, airhockey.J_WAIT, -113, -94, -102, -100, -113, -99, -99, -93, -63, -90, -74, -75, -111, -82, -79, -75, -75, -82, -89, -75, -75, -120, -90, -116, -120, -118, airhockey.J_PURCHASE, 94, 124, 99, airhockey.J_GAME_REMATCH, 94, 96, -77, -47, -65, -62, -73, -71, -95, -66, -92, 85, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SDKVER, airhockey.J_ONREWARDED, 89, 91, airhockey.P_GAME_MYSCORE, 96, airhockey.P_GAME_MYWIN, airhockey.J_DISCONNECT, -110, ByteCompanionObject.MIN_VALUE, -122, airhockey.J_NATION, airhockey.J_DISCONNECT, airhockey.J_REWARD, ByteCompanionObject.MIN_VALUE, -77, -47, -63, -62, -57, -59, -100, -70, -85, -98, -88, -118, -92, -87, -81, -118, -89, -92, -81, -117, -87, -98, -100, -97, -113, -110, -114, -92, -62, -71, -78, -75, -91, -84, -74, -109, -79, -66, 119, -60, airhockey.J_GOO, -61, -77, -79, -68, -75, airhockey.J_GOO, -60, -71, -67, -75, -77, -65, -76, -75, airhockey.J_GOO, -64, -62, -71, -65, -62, airhockey.J_GOO, -60, -65, airhockey.J_GOO, -60, -71, -67, -75, -77, -65, -76, -75, -93, -77, -79, -68, -75, airhockey.J_GOO, -78, -75, -71, -66, -73, airhockey.J_GOO, -61, -75, -60, 126, 89, -123, -125, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, -124, ByteCompanionObject.MAX_VALUE, -124, 125, 54, 123, -124, airhockey.J_WAIT, -120, -113, -122, -118, ByteCompanionObject.MAX_VALUE, -123, -124, 54, 119, -124, airhockey.J_PURCHASE, 54, airhockey.J_WAIT, -123, -125, -122, -120, 123, -119, -119, ByteCompanionObject.MAX_VALUE, -123, -124, 54, ByteCompanionObject.MAX_VALUE, -119, 54, -124, -123, -118, 54, -119, -117, -122, -122, -123, -120, -118, 123, airhockey.J_PURCHASE, -69, -25, -26, -20, -35, -26, -20, -69, -25, -27, -24, -71, -28, -33, -25, -104, -111, -67, -68, -62, -77, -68, -62, -109, -68, -79, -113, -70, -75, -67, airhockey.J_INVITE, -89, -45, -46, -40, -55, -46, -40, -87, -46, -57, -45, -56, -51, -46, -53, -77, -42, -56, -55, -42, -124, airhockey.J_ACHIEVEMENTCALLBACK, -92, -93, -87, -102, -93, -87, airhockey.J_PURCHASE, -93, -104, -92, -103, -98, -93, -100, -120, -104, -92, -91, -102, 85, -59, -16, -28, -43, -6, -15, -26, -95, 94, -119, 125, airhockey.J_INVITE, -109, -118, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, 123, 126, airhockey.J_GOO, ByteCompanionObject.MAX_VALUE, -116, -115, -125, -119, -120, 58, -68, -71, -60, -61, -105, -29, -40, -38, -32, -27, -34, -105, -22, -40, -28, -25, -29, -36, -105, -22, -32, -15, -36, -105, -26, -20, -21, -105, -26, -35, -105, -23, -40, -27, -34, -36, -91, -79, -82, -71, -72, -66, -47, -51, -48, -62, -47, -34, -33, -43, -37, -38, -116, -60, -19, -30, -15, -8, -17, -13, -28, -29, -97, -45, -15, -32, -30, -22, -97, -27, -18, -12, -19, -29, -97, -31, -12, -13, -97, -62, -18, -19, -13, -28, -19, -13, -60, -19, -30, -54, -28, -8, -56, -61, -97, -10, -32, -14, -97, -19, -18, -13, -97, -27, -18, -12, -19, -29, airhockey.J_ENEMYWIN, -102, -106, -121, -112, -107, -117, -111, -112, airhockey.P_NATION, -124, -117, -106, airhockey.P_NATION, -117, -107, airhockey.P_NATION, -107, -121, -106, airhockey.P_NATION, -117, -112, airhockey.P_NATION, -107, -117, -119, -112, -125, -114, airhockey.P_NATION, -124, -101, -106, -121, -91, -50, -47, -52, -64, -45, -103, ByteCompanionObject.MAX_VALUE, -78, -45, -64, -47, -45, -117, ByteCompanionObject.MAX_VALUE, -92, -51, -61, -117, ByteCompanionObject.MAX_VALUE, -79, -60, -64, -61, -82, -47, -61, -60, -47, -117, ByteCompanionObject.MAX_VALUE, -85, -64, -40, -60, -47, -117, ByteCompanionObject.MAX_VALUE, -78, -45, -40, -53, -60, -117, ByteCompanionObject.MAX_VALUE, -83, -64, -52, -60, -117, ByteCompanionObject.MAX_VALUE, -84, -64, -47, -58, -56, -51, -85, -117, ByteCompanionObject.MAX_VALUE, -84, -64, -47, -58, -56, -51, -79, -117, ByteCompanionObject.MAX_VALUE, -84, -64, -47, -58, -56, -51, -75, -117, ByteCompanionObject.MAX_VALUE, -92, -59, -59, -60, -62, -45, -117, ByteCompanionObject.MAX_VALUE, -77, -60, -41, -45, -99, -78, -76, -70, -65, -72, airhockey.J_BACK, -64, -65, -67, -54, airhockey.J_BACK, -60, -58, -63, -63, -64, -61, -59, -74, -75, airhockey.J_BACK, -70, -65, airhockey.J_BACK, -92, -70, -66, -63, -67, -74, -109, -67, -64, -76, -68, -60, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_SAVE, -121, -108, -118, -121, -102, -107, -104, -97, airhockey.P_GAME_BREAKBALLCOUNT, -117, -110, -117, -109, -117, -108, -102, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_WAIT, -117, -117, -111, 111, airhockey.J_GAME_EXIT, airhockey.P_GAME_BREAKBALLCOUNT, -107, -104, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_WAIT, -117, -117, -111, airhockey.J_REWARD, -107, -103, -113, -102, -113, -107, -108, airhockey.P_GAME_BREAKBALLCOUNT, -108, -107, -102, airhockey.P_GAME_BREAKBALLCOUNT, -116, -107, -101, -108, -118, -54, -14, -23, -15, -26, -19, -23, -30, -99, -48, -30, -28, -22, -30, -21, -15, -99, -30, -23, -30, -22, -30, -21, -15, -16, -99, -21, -20, -15, -99, -16, -14, -19, -19, -20, -17, -15, -30, -31, -102, -69, airhockey.J_GAME_DISCONNECT, -62, -83, -72, -75, -80, airhockey.J_GAME_DISCONNECT, -64, -66, -83, -81, -73, -65, airhockey.J_GAME_DISCONNECT, -61, -79, -66, -79, airhockey.J_GAME_DISCONNECT, -78, -69, -63, -70, -80, 119, -104, airhockey.P_GAME_REMATCH, -97, -118, -107, -110, -115, airhockey.P_GAME_REMATCH, -97, -118, -101, -110, -105, -99, airhockey.P_GAME_REMATCH, -107, -114, -105, -112, -99, -111, airhockey.P_GAME_REMATCH, -106, -118, -100, -108, airhockey.P_GAME_REMATCH, -113, -104, -98, -105, -115, airhockey.J_GOO, 124, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_SAVE, 95, airhockey.J_GOO, airhockey.J_SAVEDGAME_RELOAD, 95, -44, -32, -55, -59, -50, -41, -80, -47, -56, -44, -104, -92, -103, -118, -99, -103, airhockey.J_DISCONNECT, -122, -104, -104, -72, -60, -71, -86, -67, -71, -108, -70, -71, -85, -99, -42, -30, -39, -46, -59, -42, -40, -59, airhockey.J_ENEMYLOSE, -127, airhockey.J_ACHIEVEMENTCALLBACK, -117, -125, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_REWARD, -121, airhockey.J_ACHIEVEMENTCALLBACK, 119, 51, 124, 119, 77, 51, ByteCompanionObject.MAX_VALUE, -104, -113, -94, -102, -113, -115, -98, -113, -114, airhockey.P_GAME_EXIT, -106, -117, -115, -109, -104, -111, airhockey.P_GAME_EXIT, -96, -117, -106, -97, -113, airhockey.J_ONREWARDED, airhockey.P_GAME_EXIT, -86, -77, -95, -92, -103, -101, -122, -38, -29, -47, -44, -55, -53, -72, -77, -51, -41, -45, -77, -59, -44, -72, -63, -81, -78, -89, -87, -106, -111, -85, -75, -79, -111, -93, -75, -78, airhockey.J_PURCHASE, -125, airhockey.J_BACK, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, 88, 83, 109, 119, airhockey.J_SAVEDGAME_SAVE, 83, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.J_ENEMYWIN, -53, -44, -62, -59, -70, -68, -87, -92, -66, -56, -60, -92, -56, -59, airhockey.J_DISCONNECT, 125, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, 99, airhockey.J_GAME_STANDBY, 102, 77, airhockey.J_ENEMYWIN, airhockey.J_BACK, 109, 77, 102, 99, airhockey.J_DISCONNECT, airhockey.J_SDKVER, -47, -38, -56, -50, -86, -47, -63, -46, -86, -63, -54, -48, -51, -66, -66, -67, -58, 
        -69, -81, -84, -74, -71, -88, -100, -91, -100, -106, 126, airhockey.J_REWARD, ByteCompanionObject.MAX_VALUE, airhockey.J_REWARD, airhockey.J_GOO, 89, -13, -25, -6, -8, -11, -7, -15, -25, -63, -76, -81, -80, -70, airhockey.J_PURCHASE, -62, -80, -83, -72, -12, -30, -33, -22};
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x01ed, code lost:
        if (A03(967, 16, 18).equals(r6) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0280, code lost:
        if (A03(967, 16, 7).equals(r6) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0294, code lost:
        if (r12.A0X == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x029c, code lost:
        if (r10.A0j.A07() != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x029e, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x029f, code lost:
        com.facebook.ads.redexgen.X.HD.A04(r0);
        r12.A0X.A01(r11, r10.A01, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02a9, code lost:
        r0 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02ab, code lost:
        if (r0 >= r13) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02ad, code lost:
        A00(r11, r4, r13 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02b3, code lost:
        r0 = false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.BW r11, com.facebook.ads.redexgen.X.C0357Br r12, int r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WI.A08(com.facebook.ads.redexgen.X.BW, com.facebook.ads.redexgen.X.Br, int):void");
    }

    static {
        A06();
        A0r = new WK();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = C0499Hs.A0i(A03(539, 90, 83));
        A0u = new byte[]{airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_REMATCH, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, 111, airhockey.J_ENEMYWIN, airhockey.J_ERROR, airhockey.J_GAME_STANDBY, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public WI() {
        this(0);
    }

    public WI(int i) {
        this(new WL(), i);
    }

    public WI(InterfaceC0355Bn interfaceC0355Bn, int i) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = interfaceC0355Bn;
        this.A0d.A8W(new WJ(this, null));
        this.A0o = (i & 1) == 0;
        this.A0e = new C0359Bu();
        this.A0c = new SparseArray<>();
        this.A0k = new C0483Hc(4);
        this.A0n = new C0483Hc(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C0483Hc(4);
        this.A0i = new C0483Hc(HY.A03);
        this.A0h = new C0483Hc(4);
        this.A0j = new C0483Hc();
        this.A0m = new C0483Hc();
        this.A0f = new C0483Hc(8);
        this.A0g = new C0483Hc();
    }

    private int A00(BW bw, InterfaceC0351Bh interfaceC0351Bh, int i) throws IOException, InterruptedException {
        int bytesRead;
        int strippedBytesLeft = this.A0j.A04();
        if (strippedBytesLeft > 0) {
            bytesRead = Math.min(i, strippedBytesLeft);
            interfaceC0351Bh.AEX(this.A0j, bytesRead);
        } else {
            bytesRead = interfaceC0351Bh.AEW(bw, i, false);
        }
        this.A07 += bytesRead;
        this.A08 += bytesRead;
        return bytesRead;
    }

    private long A01(long j) throws C9Y {
        long j2 = this.A0M;
        if (j2 != -9223372036854775807L) {
            return C0499Hs.A0F(j, j2, 1000L);
        }
        throw new C9Y(A03(189, 54, 68));
    }

    /* JADX WARN: Incorrect condition in loop: B:48:0x0064 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.InterfaceC0348Be A02() {
        /*
            r11 = this;
            long r3 = r11.A0K
            r8 = 0
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r3 = r11.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.HS r0 = r11.A0Q
            if (r0 == 0) goto L2e
            int r0 = r0.A02()
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.HS r0 = r11.A0P
            if (r0 == 0) goto L2e
            int r1 = r0.A02()
            com.facebook.ads.redexgen.X.HS r0 = r11.A0Q
            int r0 = r0.A02()
            if (r1 == r0) goto L3a
        L2e:
            r11.A0Q = r8
            r11.A0P = r8
            long r1 = r11.A0H
            com.facebook.ads.redexgen.X.WU r0 = new com.facebook.ads.redexgen.X.WU
            r0.<init>(r1)
            return r0
        L3a:
            com.facebook.ads.redexgen.X.HS r0 = r11.A0Q
            int r7 = r0.A02()
            int[] r9 = new int[r7]
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            r10 = 0
        L49:
            if (r10 >= r7) goto L61
            com.facebook.ads.redexgen.X.HS r0 = r11.A0Q
            long r0 = r0.A03(r10)
            r4[r10] = r0
            long r0 = r11.A0K
            com.facebook.ads.redexgen.X.HS r2 = r11.A0P
            long r2 = r2.A03(r10)
            long r0 = r0 + r2
            r6[r10] = r0
            int r10 = r10 + 1
            goto L49
        L61:
            r10 = 0
        L62:
            int r0 = r7 + (-1)
            if (r10 >= r0) goto L7c
            int r0 = r10 + 1
            r0 = r6[r0]
            r2 = r6[r10]
            long r0 = r0 - r2
            int r2 = (int) r0
            r9[r10] = r2
            int r0 = r10 + 1
            r2 = r4[r0]
            r0 = r4[r10]
            long r2 = r2 - r0
            r5[r10] = r2
            int r10 = r10 + 1
            goto L62
        L7c:
            int r10 = r7 + (-1)
            long r2 = r11.A0K
            long r0 = r11.A0L
            long r2 = r2 + r0
            int r0 = r7 + (-1)
            r0 = r6[r0]
            long r2 = r2 - r0
            int r0 = (int) r2
            r9[r10] = r0
            int r10 = r7 + (-1)
            long r0 = r11.A0H
            int r2 = r7 + (-1)
            r2 = r4[r2]
            long r0 = r0 - r2
            r5[r10] = r0
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.WZ r0 = new com.facebook.ads.redexgen.X.WZ
            r0.<init>(r9, r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WI.A02():com.facebook.ads.redexgen.X.Be");
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(BW bw, int i) throws IOException, InterruptedException {
        if (this.A0k.A07() >= i) {
            return;
        }
        if (this.A0k.A05() < i) {
            C0483Hc c0483Hc = this.A0k;
            c0483Hc.A0b(Arrays.copyOf(c0483Hc.A00, Math.max(this.A0k.A00.length * 2, i)), this.A0k.A07());
        }
        byte[] bArr = this.A0k.A00;
        int A07 = this.A0k.A07();
        if (A0q[6].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[0] = "ZmQc4cegfKT6TM2j1HdEhTMrEsYvVAK8";
        strArr[2] = "PLs1alOmXmQPSsdSdZUe4T02xUG6CaQT";
        bw.readFully(bArr, A07, i - this.A0k.A07());
        this.A0k.A0X(i);
    }

    private void A09(BW bw, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0m.A05();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0m.A00 = Arrays.copyOf(bArr, sizeWithPrefix2);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        byte[] bArr2 = this.A0m.A00;
        int sizeWithPrefix3 = bArr.length;
        bw.readFully(bArr2, sizeWithPrefix3, i);
        this.A0m.A0W(length);
    }

    private void A0A(BW bw, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.A0j.A04());
        int pendingStrippedBytes = i2 - min;
        bw.readFully(bArr, i + min, pendingStrippedBytes);
        if (min > 0) {
            this.A0j.A0c(bArr, i, min);
        }
        int pendingStrippedBytes2 = this.A07;
        this.A07 = pendingStrippedBytes2 + i2;
    }

    private void A0B(C0357Br c0357Br, long j) {
        if (c0357Br.A0X != null) {
            C0358Bs c0358Bs = c0357Br.A0X;
            if (A0q[6].length() != 27) {
                throw new RuntimeException();
            }
            A0q[6] = "nKrIVrdQs7NkqXN01cL0onp1lFd";
            c0358Bs.A03(c0357Br, j);
        } else {
            if (A03(843, 11, 89).equals(c0357Br.A0Y)) {
                A0C(c0357Br, A03(33, 19, 7), 19, 1000L, A0x);
            } else {
                if (A03(833, 10, 57).equals(c0357Br.A0Y)) {
                    A0C(c0357Br, A03(14, 19, 109), 21, WorkRequest.MIN_BACKOFF_MILLIS, A0v);
                }
            }
            c0357Br.A0W.AEY(j, this.A01, this.A08, 0, c0357Br.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(C0357Br c0357Br, String str, int i, long j, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i, j, bArr);
        InterfaceC0351Bh interfaceC0351Bh = c0357Br.A0W;
        C0483Hc c0483Hc = this.A0m;
        interfaceC0351Bh.AEX(c0483Hc, c0483Hc.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] timeCodeData;
        if (j == -9223372036854775807L) {
            timeCodeData = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - ((i2 * 3600) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - ((i3 * 60) * 1000000);
            int lastValue = (int) (j4 / 1000000);
            int seconds = (int) ((j4 - (lastValue * 1000000)) / j2);
            timeCodeData = C0499Hs.A0i(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(lastValue), Integer.valueOf(seconds)));
        }
        System.arraycopy(timeCodeData, 0, bArr, i, bArr2.length);
    }

    private boolean A0E(C0346Bc c0346Bc, long j) {
        if (this.A0Y) {
            this.A0J = j;
            c0346Bc.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        boolean z = this.A0a;
        String[] strArr = A0q;
        if (strArr[0].charAt(31) != strArr[2].charAt(31)) {
            String[] strArr2 = A0q;
            strArr2[1] = "bgcuSmmv9nMD5qNgR1ZnJGCWOsXR4zDF";
            strArr2[5] = "rXrXJdml0w7r8hjghYXvJH5LLiJomjK3";
            if (z) {
                long j2 = this.A0J;
                if (j2 != -1) {
                    c0346Bc.A00 = j2;
                    this.A0J = -1L;
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0F(String str) {
        if (!A03(1006, 5, 58).equals(str) && !A03(1011, 5, 20).equals(str) && !A03(902, 7, 72).equals(str)) {
            String A03 = A03(953, 14, 105);
            String[] strArr = A0q;
            if (strArr[1].charAt(15) == strArr[5].charAt(15)) {
                A0q[7] = "rYhgwmDh4TKBcj4Uwcvshsmah3Wf4ae0";
                if (!A03.equals(str) && !A03(923, 15, 86).equals(str) && !A03(909, 14, 120).equals(str) && !A03(938, 15, 24).equals(str) && !A03(967, 16, 18).equals(str) && !A03(983, 15, 111).equals(str)) {
                    String[] strArr2 = A0q;
                    if (strArr2[1].charAt(15) != strArr2[5].charAt(15)) {
                        throw new RuntimeException();
                    }
                    A0q[6] = "rlxG2GXYid9bCHwXApke8Gz33sW";
                    if (!A03(998, 8, 91).equals(str) && !A03(154, 6, 102).equals(str) && !A03(181, 8, 87).equals(str) && !A03(74, 5, 126).equals(str) && !A03(128, 9, 102).equals(str) && !A03(137, 9, 8).equals(str) && !A03(79, 5, 124).equals(str) && !A03(116, 6, 59).equals(str) && !A03(173, 8, 62).equals(str) && !A03(84, 5, 98).equals(str) && !A03(89, 13, 62).equals(str) && !A03(102, 14, 86).equals(str) && !A03(122, 6, 17).equals(str) && !A03(146, 8, 39).equals(str) && !A03(160, 13, 79).equals(str)) {
                        boolean equals = A03(843, 11, 89).equals(str);
                        String[] strArr3 = A0q;
                        if (strArr3[0].charAt(31) != strArr3[2].charAt(31)) {
                            String[] strArr4 = A0q;
                            strArr4[1] = "DfP1dlVZEdoO22ggDOih4DhJX4h9DttB";
                            strArr4[5] = "iPMsbxRLvFu5COzgJWPWeI2fmUuAHT3S";
                            if (!equals && !A03(833, 10, 57).equals(str) && !A03(854, 8, 119).equals(str) && !A03(823, 10, 117).equals(str) && !A03(815, 8, 17).equals(str)) {
                                return false;
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static int[] A0H(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public final void A0I(int i) throws C9Y {
        if (i == 160) {
            if (this.A04 != 2) {
                return;
            }
            if (!this.A0W) {
                this.A01 |= 1;
            }
            SparseArray<C0357Br> sparseArray = this.A0c;
            int i2 = this.A05;
            String[] strArr = A0q;
            if (strArr[1].charAt(15) != strArr[5].charAt(15)) {
                throw new RuntimeException();
            }
            A0q[6] = "RSkrjtrH0DZIu64VznKeQu280Ie";
            A0B(sparseArray.get(i2), this.A0D);
            this.A04 = 0;
        } else if (i == 174) {
            if (A0F(this.A0O.A0Y)) {
                C0357Br c0357Br = this.A0O;
                c0357Br.A09(this.A0N, c0357Br.A0N);
                SparseArray<C0357Br> sparseArray2 = this.A0c;
                String[] strArr2 = A0q;
                if (strArr2[1].charAt(15) != strArr2[5].charAt(15)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0q;
                strArr3[1] = "74pxEvdQlKznF5jgDPRjEQh8ucb6bJbJ";
                strArr3[5] = "78ui8XRcTlU5cJPgzooakknZ4h2HRrWY";
                sparseArray2.put(this.A0O.A0N, this.A0O);
            }
            this.A0O = null;
        } else if (i == 19899) {
            int i3 = this.A0B;
            if (i3 != -1) {
                long j = this.A0I;
                if (j != -1) {
                    if (i3 != 475249515) {
                        return;
                    }
                    this.A0F = j;
                    return;
                }
            }
            throw new C9Y(A03(667, 50, 26));
        } else if (i == 25152) {
            if (!this.A0O.A0c) {
                return;
            }
            if (this.A0O.A0V != null) {
                this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(AnonymousClass99.A04, A03(1024, 10, 63), this.A0O.A0V.A03));
                return;
            }
            throw new C9Y(A03(449, 55, 115));
        } else if (i == 28032) {
            if (!this.A0O.A0c || this.A0O.A0f == null) {
                return;
            }
            throw new C9Y(A03(243, 53, 10));
        } else if (i == 357149030) {
            if (this.A0M == -9223372036854775807L) {
                this.A0M = 1000000L;
            }
            long j2 = this.A0G;
            if (j2 == -9223372036854775807L) {
                return;
            }
            this.A0H = A01(j2);
        } else if (i != 374648427) {
            if (i != 475249515 || this.A0a) {
                return;
            }
            this.A0N.AEd(A02());
            this.A0a = true;
        } else if (this.A0c.size() != 0) {
            this.A0N.A5G();
        } else {
            throw new C9Y(A03(756, 26, 64));
        }
    }

    public final void A0J(int i, double d) {
        if (i == 181) {
            this.A0O.A0O = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.A0O.A06 = (float) d;
                    return;
                case 21970:
                    this.A0O.A07 = (float) d;
                    return;
                case 21971:
                    this.A0O.A04 = (float) d;
                    return;
                case 21972:
                    this.A0O.A05 = (float) d;
                    return;
                case 21973:
                    this.A0O.A02 = (float) d;
                    return;
                case 21974:
                    this.A0O.A03 = (float) d;
                    return;
                case 21975:
                    this.A0O.A08 = (float) d;
                    return;
                case 21976:
                    this.A0O.A09 = (float) d;
                    return;
                case 21977:
                    this.A0O.A00 = (float) d;
                    return;
                case 21978:
                    this.A0O.A01 = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            long j = (long) d;
            if (A0q[6].length() != 27) {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[1] = "WDka1mf2CsNw4QigexbDbEebuBmvSt6W";
            strArr[5] = "iBpV8TklpIMmAuqgJkVlWV9x0VAmPj3X";
            this.A0G = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0107, code lost:
        if (r18 == 163) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0109, code lost:
        r1 = r17.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x010d, code lost:
        if (r1 >= r17.A02) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x010f, code lost:
        A08(r20, r5, r17.A0b[r1]);
        A0B(r5, r17.A0D + ((r17.A03 * r5.A0F) / 1000));
        r17.A03++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x012b, code lost:
        if (r18 == 163) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02b2, code lost:
        r17.A04 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02b6, code lost:
        r4 = r17.A0b[0];
        r2 = com.facebook.ads.redexgen.X.WI.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02cd, code lost:
        if (r2[0].charAt(31) == r2[2].charAt(31)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02cf, code lost:
        r2 = com.facebook.ads.redexgen.X.WI.A0q;
        r2[3] = "RwuJZhEYbPwrYhgspkpAZU";
        r2[4] = "DTAVHXJ2rXJnopR";
        A08(r20, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02df, code lost:
        A08(r20, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02fe, code lost:
        throw new com.facebook.ads.redexgen.X.C9Y(A03(396, 37, 107));
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(int r18, int r19, com.facebook.ads.redexgen.X.BW r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WI.A0K(int, int, com.facebook.ads.redexgen.X.BW):void");
    }

    public final void A0L(int i, long j) throws C9Y {
        String A03 = A03(0, 14, 21);
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new C9Y(A03(327, 21, 88) + j + A03);
        } else if (i != 20530) {
            switch (i) {
                case 131:
                    this.A0O.A0Q = (int) j;
                    return;
                case 136:
                    this.A0O.A0Z = j == 1;
                    return;
                case 155:
                    this.A0C = A01(j);
                    return;
                case 159:
                    this.A0O.A0B = (int) j;
                    return;
                case 176:
                    C0357Br c0357Br = this.A0O;
                    int i2 = (int) j;
                    if (A0q[6].length() != 27) {
                        c0357Br.A0R = i2;
                        return;
                    }
                    String[] strArr = A0q;
                    strArr[0] = "XVxg7oDCnYjszKvzMZsUUQ807hVNhLoA";
                    strArr[2] = "0ue5jS5NLDJS8BF8ykMkIp2Moa1xs6hP";
                    c0357Br.A0R = i2;
                    return;
                case 179:
                    this.A0Q.A04(A01(j));
                    return;
                case 186:
                    this.A0O.A0J = (int) j;
                    return;
                case 215:
                    C0357Br c0357Br2 = this.A0O;
                    int i3 = (int) j;
                    if (A0q[6].length() != 27) {
                        c0357Br2.A0N = i3;
                        return;
                    }
                    String[] strArr2 = A0q;
                    strArr2[3] = "l2vw1fgJd0VDbhIrSAi3kG";
                    strArr2[4] = "etUjpNfhe8S13q3";
                    c0357Br2.A0N = i3;
                    return;
                case 231:
                    this.A0E = A01(j);
                    return;
                case 241:
                    if (this.A0Z) {
                        return;
                    }
                    this.A0P.A04(j);
                    this.A0Z = true;
                    return;
                case 251:
                    this.A0W = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw new C9Y(A03(296, 16, 108) + j + A03);
                case 17029:
                    if (j >= 1 && j <= 2) {
                        return;
                    }
                    throw new C9Y(A03(377, 19, 14) + j + A03);
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw new C9Y(A03(433, 16, 96) + j + A03);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw new C9Y(A03(312, 15, 66) + j + A03);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw new C9Y(A03(52, 22, 72) + j + A03);
                case 21420:
                    this.A0I = this.A0K + j;
                    return;
                case 21432:
                    int i4 = (int) j;
                    if (i4 == 0) {
                        this.A0O.A0P = 0;
                        return;
                    } else if (i4 == 1) {
                        this.A0O.A0P = 2;
                        return;
                    } else if (i4 == 3) {
                        this.A0O.A0P = 1;
                        return;
                    } else {
                        String[] strArr3 = A0q;
                        String str = strArr3[0];
                        String str2 = strArr3[2];
                        int layout = str.charAt(31);
                        if (layout != str2.charAt(31)) {
                            String[] strArr4 = A0q;
                            strArr4[0] = "NNPHYzuIxoVCpcvyGp46FNV8jONBlxcC";
                            strArr4[2] = "dKLj6aoBrKwCeS1TbngdnlPxGSMw9Ifn";
                            if (i4 != 15) {
                                return;
                            }
                            this.A0O.A0P = 3;
                            return;
                        }
                    }
                    break;
                case 21680:
                    this.A0O.A0I = (int) j;
                    return;
                case 21682:
                    this.A0O.A0H = (int) j;
                    return;
                case 21690:
                    this.A0O.A0G = (int) j;
                    return;
                case 21930:
                    this.A0O.A0a = j == 1;
                    return;
                case 22186:
                    this.A0O.A0S = j;
                    return;
                case 22203:
                    this.A0O.A0T = j;
                    return;
                case 25188:
                    this.A0O.A0A = (int) j;
                    return;
                case 2352003:
                    this.A0O.A0F = (int) j;
                    return;
                case 2807729:
                    this.A0M = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i5 = (int) j;
                            if (i5 == 1) {
                                this.A0O.A0C = 2;
                                return;
                            } else if (i5 != 2) {
                                return;
                            } else {
                                this.A0O.A0C = 1;
                                return;
                            }
                        case 21946:
                            int i6 = (int) j;
                            if (i6 != 1) {
                                if (A0q[7].charAt(2) == 'J') {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0q;
                                strArr5[1] = "Kj3FE77SqtP8skZgqIoOHsVkhTzxuZMY";
                                strArr5[5] = "lEoYkqiqBcXObqrgLJbRKLzsvFbWD6uL";
                                if (i6 != 16) {
                                    String[] strArr6 = A0q;
                                    if (strArr6[3].length() != strArr6[4].length()) {
                                        A0q[7] = "mV5wi4RdAtLICzfql5r9CviPSqv5gEzL";
                                        if (i6 == 18) {
                                            this.A0O.A0E = 7;
                                            return;
                                        } else if (i6 != 6 && i6 != 7) {
                                            return;
                                        }
                                    }
                                } else {
                                    C0357Br c0357Br3 = this.A0O;
                                    if (A0q[7].charAt(2) != 'J') {
                                        A0q[7] = "jzNtO6nbghsOK2zNzcbiuAHR0hMudXvD";
                                        c0357Br3.A0E = 6;
                                        return;
                                    }
                                }
                            }
                            this.A0O.A0E = 3;
                            return;
                        case 21947:
                            C0357Br c0357Br4 = this.A0O;
                            c0357Br4.A0b = true;
                            int layout2 = A0q[6].length();
                            if (layout2 == 27) {
                                A0q[7] = "cRzVQdX7r3sNL6uNWZqYIbMTncmWUqDN";
                                int layout3 = (int) j;
                                if (layout3 == 1) {
                                    c0357Br4.A0D = 1;
                                    return;
                                } else if (layout3 == 9) {
                                    c0357Br4.A0D = 6;
                                    return;
                                } else if (layout3 != 4 && layout3 != 5 && layout3 != 6 && layout3 != 7) {
                                    return;
                                } else {
                                    this.A0O.A0D = 2;
                                    return;
                                }
                            }
                            break;
                        case 21948:
                            this.A0O.A0K = (int) j;
                            return;
                        case 21949:
                            this.A0O.A0L = (int) j;
                            return;
                        default:
                            return;
                    }
            }
            throw new RuntimeException();
        } else if (j == 1) {
        } else {
            throw new C9Y(A03(348, 21, 41) + j + A03);
        }
    }

    public final void A0M(int i, long j, long j2) throws C9Y {
        if (i == 160) {
            this.A0W = false;
        } else if (i == 174) {
            this.A0O = new C0357Br(null);
        } else if (i == 187) {
            this.A0Z = false;
        } else if (i == 19899) {
            this.A0B = -1;
            if (A0q[7].charAt(2) == 'J') {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[1] = "WnX9Xf7tQ76egxzgWKXx7UcXidJkCAmW";
            strArr[5] = "aGO21Sv6KBonhAsgqf6HI5bVGIHydlTh";
            this.A0I = -1L;
        } else if (i == 20533) {
            this.A0O.A0c = true;
        } else if (i == 21968) {
            this.A0O.A0b = true;
        } else if (i != 25152) {
            if (i == 408125543) {
                long j3 = this.A0K;
                if (j3 == -1 || j3 == j) {
                    this.A0K = j;
                    this.A0L = j2;
                    return;
                }
                throw new C9Y(A03(717, 39, 113));
            } else if (i != 475249515) {
                if (i != 524531317 || this.A0a) {
                    return;
                }
                if (this.A0o && this.A0F != -1) {
                    this.A0Y = true;
                    return;
                }
                this.A0N.AEd(new WU(this.A0H));
                this.A0a = true;
            } else {
                this.A0Q = new HS();
                this.A0P = new HS();
            }
        }
    }

    public final void A0N(int i, String str) throws C9Y {
        if (i == 134) {
            this.A0O.A0Y = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.A0O.A0g = str;
            }
        } else if (A03(1034, 4, 113).equals(str) || A03(1016, 8, 122).equals(str)) {
        } else {
            throw new C9Y(A03(369, 8, 117) + str + A03(0, 14, 21));
        }
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        this.A0N = bx;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        this.A0V = false;
        boolean z = true;
        while (z && !this.A0V) {
            z = this.A0d.ADr(bw);
            if (z && A0E(c0346Bc, bw.A7P())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        int i = 0;
        while (true) {
            SparseArray<C0357Br> sparseArray = this.A0c;
            String[] strArr = A0q;
            String str = strArr[0];
            String str2 = strArr[2];
            int charAt = str.charAt(31);
            int i2 = str2.charAt(31);
            if (charAt == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[3] = "Tajypdz7aNAm7FibYO8x24";
            strArr2[4] = "TBunjD0UUDKaUo7";
            int i3 = sparseArray.size();
            if (i < i3) {
                this.A0c.valueAt(i).A07();
                i++;
            } else {
                return -1;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x001e */
    @Override // com.facebook.ads.redexgen.X.BV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AEc(long r3, long r5) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A0E = r0
            r0 = 0
            r2.A04 = r0
            com.facebook.ads.redexgen.X.Bn r0 = r2.A0d
            r0.reset()
            com.facebook.ads.redexgen.X.Bu r0 = r2.A0e
            r0.A06()
            r2.A05()
            r1 = 0
        L18:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Br> r0 = r2.A0c
            int r0 = r0.size()
            if (r1 >= r0) goto L2e
            android.util.SparseArray<com.facebook.ads.redexgen.X.Br> r0 = r2.A0c
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Br r0 = (com.facebook.ads.redexgen.X.C0357Br) r0
            r0.A08()
            int r1 = r1 + 1
            goto L18
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WI.AEc(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        return new Bt().A01(bw);
    }
}
