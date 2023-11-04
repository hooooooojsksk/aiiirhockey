package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class HO implements QG {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC02617r A00;
    public Executor A01;
    public boolean A02;
    public QL A03;
    public final QQ A04 = new C0497Hq();
    public final QV A05;
    public final QW A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final QF A01(QS qs) throws QT {
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        QF qf = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(qs.A05(), KV.A04() ? A09() : null);
                A0H(A082, qs);
                A0G(A082, qs);
                if (this.A06.A8o()) {
                    this.A06.A9R(A082, qs.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z2 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        QX.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.A9V(A072, C02627s.A1y, new C02637t(e));
                    } catch (Exception e2) {
                        this.A00.A9V(A072, C02627s.A1x, new C02637t(e2));
                    }
                }
                if (A082.getDoOutput() && qs.A06() != null) {
                    A00(A082, qs.A06());
                }
                QF A06 = A082.getDoInput() ? A06(A082) : new HR(A082, null);
                if (this.A06.A8o()) {
                    this.A06.A9S(A06);
                }
                A082.disconnect();
                return A06;
            } catch (Exception e3) {
                try {
                    qf = A05(null);
                    if (qf == null || qf.A7m() <= 0) {
                        throw new QT(e3, qf);
                    }
                    if (this.A06.A8o()) {
                        this.A06.A9S(qf);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return qf;
                } catch (Exception unused) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 53), e3);
                    if (qf == null || qf.A7m() <= 0) {
                        throw new QT(e3, qf);
                    }
                    if (this.A06.A8o()) {
                        this.A06.A9S(qf);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return qf;
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8o()) {
                this.A06.A9S(null);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 14, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYLOSE, 15, 76, 90, 93, airhockey.P_GAME_MYSCORE, 15, 14, airhockey.P_GAME_MYWIN, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, airhockey.P_NATION, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, 14, 123, 124, airhockey.J_NATION, 14, 65, airhockey.P_GAME_MYLOSE, 14, 94, 102, airhockey.J_GAME_EXIT, 9, 30, airhockey.J_GAME_EXIT, 119, airhockey.J_GAME_EXIT, 28, 16, airhockey.J_NATION, airhockey.J_ONREWARDED, 16, 13, 16, 55, 59, 111, airhockey.J_GAME_REMATCH, airhockey.J_NATION, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ERROR, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, airhockey.P_GAME_MYSCORE, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, airhockey.P_GAME_MYLOSE, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, 119, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, 111, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_DISCONNECT, airhockey.J_ERROR, 52, 99, 54, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_DISCONNECT, 54, 125, airhockey.J_DISCONNECT, airhockey.J_GAME_REMATCH, airhockey.J_REWARD, 54, airhockey.J_INVITE, airhockey.J_GAME_REMATCH, 119, 126, airhockey.J_ERROR, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_DISCONNECT, ByteCompanionObject.MAX_VALUE, 126, ByteCompanionObject.MAX_VALUE, 32, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_PURCHASE, airhockey.J_GAME_REMATCH, airhockey.J_ENEMYLOSE, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, 39, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, ByteCompanionObject.MAX_VALUE, 99, 99, airhockey.J_ENEMYWIN, 57, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_INVITE, airhockey.P_GAME_MYWIN, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x017d, code lost:
        if (r25.A04 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x017f, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a8, code lost:
        if (r25.A04 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ab, code lost:
        r0 = r25.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.QF A0J(com.facebook.ads.redexgen.X.QS r25) throws com.facebook.ads.redexgen.X.QT {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HO.A0J(com.facebook.ads.redexgen.X.QS):com.facebook.ads.redexgen.X.QF");
    }

    static {
        A0A();
        A09 = QG.class.getSimpleName();
    }

    public HO(QL ql, InterfaceC02617r interfaceC02617r, Executor executor) {
        A0B();
        this.A03 = ql;
        this.A06 = new HM(ql.A04());
        this.A05 = new AbstractC0489Hi(this.A06) { // from class: com.facebook.ads.redexgen.X.4S
        };
        this.A01 = executor;
        this.A00 = interfaceC02617r;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.ADK(httpURLConnection);
            if (outputStream != null) {
                this.A05.AGA(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Nullable
    private final QF A02(QS qs) {
        if (this.A03.A04()) {
            A0C(qs);
        }
        QF qf = null;
        try {
            qf = A01(qs);
            return qf;
        } catch (QT hre) {
            this.A05.AAy(hre);
            return qf;
        } catch (Exception e) {
            this.A05.AAy(new QT(e, qf));
            return qf;
        }
    }

    @Nullable
    private final QF A03(String str, QU qu, QO qo) {
        return A02(new C0481Ha(str, qu, qo));
    }

    @Nullable
    private final QF A04(String str, String str2, byte[] bArr, QO qo) {
        return A02(new HZ(str, null, str2, bArr, qo));
    }

    private final QF A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.ADw(inputStream);
            }
            HR hr = new HR(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return hr;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final QF A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.ADJ(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.ADw(inputStream);
            }
            HR hr = new HR(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return hr;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, @Nullable Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ADI(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String proxyAddress = System.getProperty(A07(HttpStatus.SC_PARTIAL_CONTENT, 14, 74));
        int i = -1;
        if (proxyAddress != null) {
            try {
                i = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        if (portStr.charAt(28) != strArr[2].charAt(28)) {
            String[] strArr2 = A08;
            strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
            strArr2[6] = "26yRDH09B";
            if (!isEmpty && i > 0 && i <= 65535) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
            }
            return proxy;
        }
        throw new RuntimeException();
    }

    public static synchronized void A0B() {
        synchronized (HO.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(QS qs) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 17));
        boolean equals = qs.A03().equals(QR.A06);
        String A072 = A07(41, 1, 33);
        if (equals && qs.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(qs.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(A072);
        }
        Map<String, String> A06 = qs.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 109));
        sb.append(qs.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND) + 1);
    }

    private void A0D(QS qs, QH qh) {
        QP executor = this.A04.A5m(this, qh, this.A01);
        executor.A5K(qs);
        if (this.A03.A04()) {
            A0C(qs);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND);
            A0E(str.substring(GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, QH qh, QO qo) {
        HZ req = new HZ(str, null, str2, bArr, qo);
        A0D(req, qh);
    }

    private void A0G(HttpURLConnection httpURLConnection, QS qs) {
        Map<String, String> A06 = qs.A02().A06();
        QE A05 = qs.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A5Y = A05.A5Y(this.A03.A03());
            for (String str2 : A5Y.keySet()) {
                httpURLConnection.setRequestProperty(str2, A5Y.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, QS qs) throws IOException {
        QO A02 = qs.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADa(httpURLConnection, qs.A03(), qs.A04());
    }

    private final boolean A0I(Throwable th, long j, QS qs) {
        QO A02 = qs.A02();
        long elapsedTime = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A8o()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= A00;
    }

    public final QL A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QG
    @Nullable
    @Deprecated
    public final QF ADS(String str, Map<String, String> parameters) {
        return A03(str, new QU(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.QG
    @Nullable
    @Deprecated
    public final QF ADT(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.QG
    public final void ADU(String str, byte[] bArr, QH qh) {
        A0F(str, A07(135, 47, 70), bArr, qh, this.A03.A00());
    }
}
