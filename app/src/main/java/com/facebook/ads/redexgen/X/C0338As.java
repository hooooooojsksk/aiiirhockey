package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.As */
/* loaded from: assets/audience_network.dex */
public final class C0338As implements InterfaceC0811Ub {
    public static byte[] A0G;
    public static String[] A0H = {"75NS6XWtOFaqvUAv70pmXpUOnNLqFC62", "xNyAW7YuQe6", "JhVZQGcu6MYhTGFRaY9NVeSWQV9pZEhG", "Kya4laZJ5Yz4z7ubQErhqHVe", "a5xQ9UmIIc2iWER6a0yqQZDBwnw5LxXI", "JNGHth9iM2AZaEQIUYfWNR2mTS", "R", "WvGanvqVoE"};
    public static final AtomicReference<byte[]> A0I;
    public static final Pattern A0J;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C0458Gb A04;
    public InputStream A05;
    public HttpURLConnection A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    @Nullable
    public final C0463Gi A0A;
    public final C0463Gi A0B = new C0463Gi();
    @Nullable
    public final InterfaceC0474Gt<? super C0338As> A0C;
    @Nullable
    public final InterfaceC0485He<String> A0D;
    public final String A0E;
    public final boolean A0F;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x007f, code lost:
        return r3;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection A04(com.facebook.ads.redexgen.X.C0458Gb r15) throws java.io.IOException {
        /*
            r14 = this;
            android.net.Uri r0 = r15.A04
            java.lang.String r0 = r0.toString()
            java.net.URL r6 = new java.net.URL
            r6.<init>(r0)
            byte[] r7 = r15.A06
            long r8 = r15.A03
            long r10 = r15.A02
            r0 = 1
            boolean r12 = r15.A02(r0)
            r0 = r14
            boolean r0 = r0.A0F
            if (r0 != 0) goto L22
            r13 = 1
            r5 = r14
            java.net.HttpURLConnection r0 = r5.A05(r6, r7, r8, r10, r12, r13)
            return r0
        L22:
            r1 = 0
        L23:
            int r4 = r1 + 1
            r0 = 20
            if (r1 > r0) goto L80
            r13 = 0
            r5 = r14
            java.net.HttpURLConnection r3 = r5.A05(r6, r7, r8, r10, r12, r13)
            int r1 = r3.getResponseCode()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0338As.A0H
            r0 = 5
            r0 = r2[r0]
            int r2 = r0.length()
            r0 = 26
            if (r2 == r0) goto L46
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L46:
            java.lang.String[] r5 = com.facebook.ads.redexgen.X.C0338As.A0H
            java.lang.String r2 = "FxIBfHo5MrM4KwNe65t8Xtniv5kx6"
            r0 = 3
            r5[r0] = r2
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 == r0) goto L67
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L67
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L67
            r0 = 303(0x12f, float:4.25E-43)
            if (r1 == r0) goto L67
            if (r7 != 0) goto L7f
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L67
            r0 = 308(0x134, float:4.32E-43)
            if (r1 != r0) goto L7f
        L67:
            r7 = 0
            r2 = 86
            r1 = 8
            r0 = 11
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.String r0 = r3.getHeaderField(r0)
            r3.disconnect()
            java.net.URL r6 = A06(r6, r0)
            r1 = r4
            goto L23
        L7f:
            return r3
        L80:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 125(0x7d, float:1.75E-43)
            r1 = 20
            r0 = 38
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0338As.A04(com.facebook.ads.redexgen.X.Gb):java.net.HttpURLConnection");
    }

    public static void A09() {
        A0G = new byte[]{3, 18, 48, 48, 54, 35, 39, 126, 22, 61, 48, 60, 55, 58, 61, 52, 49, 29, 28, 6, 23, 28, 6, 95, 62, 23, 28, 21, 6, 26, 58, 22, 23, 13, 28, 23, 13, 84, 43, 24, 23, 30, 28, 62, 31, 28, 27, 15, 22, 14, 50, 14, 14, 10, 62, 27, 14, 27, 41, 21, 15, 8, 25, 31, airhockey.J_ERROR, 82, 95, 83, 82, 79, 85, 79, airhockey.P_GAME_MYLOSE, 89, 82, airhockey.P_GAME_MYLOSE, 28, 84, 89, 93, 88, 89, 78, 79, 28, airhockey.J_ENEMYWIN, 126, 93, 81, 83, airhockey.P_GAME_BREAKBALLCOUNT, 91, 93, 92, airhockey.P_GAME_REMATCH, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, 39, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, 102, airhockey.J_SAVEDGAME_SAVE, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 39, airhockey.J_ERROR, airhockey.J_NATION, 99, airhockey.J_INVITE, airhockey.J_ERROR, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, 26, 5, 25, 30, airhockey.J_INVITE, 93, 82, 91, 89, 75, airhockey.J_GOO, airhockey.J_GOO, 63, airhockey.J_SAVEDGAME_RELOAD, 126, airhockey.J_BACK, 102, 63, 109, airhockey.J_PURCHASE, 123, airhockey.J_REWARD, 109, airhockey.J_PURCHASE, 124, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 37, 63, 40, 19, 28, 31, 17, 24, 93, 9, 18, 93, 30, 18, 19, 19, 24, 30, 9, 93, 9, 18, 93, 82, airhockey.J_GAME_REMATCH, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, 119, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, 99, 39, airhockey.P_GAME_SELECTMAP, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, airhockey.J_GAME_REMATCH, airhockey.J_SAVEDGAME_SAVE, 42, 75, airhockey.J_NATION, airhockey.J_GAME_REMATCH, 96, airhockey.J_SAVEDGAME_SAVE, 111, 39, 92, airhockey.J_GAME_EXIT, 81, 90, airhockey.P_GAME_MYWIN, 79, 90, 92, 75, 90, 91, 31, 124, 80, 81, 75, 90, 81, 75, 18, 109, 94, 81, 88, 90, 31, airhockey.J_ONREWARDED, airhockey.P_GAME_MYWIN, 124, 119, airhockey.J_GAME_EXIT, airhockey.J_NATION, 119, airhockey.J_BACK, 102, 119, airhockey.J_REWARD, 50, 119, 96, 96, 125, 96, 50, airhockey.J_GAME_STANDBY, airhockey.J_PURCHASE, 123, 126, 119, 50, airhockey.J_REWARD, 123, airhockey.J_SDKVER, airhockey.J_BACK, 125, 124, 124, 119, airhockey.J_BACK, 102, 123, 124, airhockey.J_ERROR, 96, 91, airhockey.P_GAME_BREAKBALLCOUNT, 64, airhockey.P_GAME_STANDBY, airhockey.P_GAME_STANDBY, 90, airhockey.P_GAME_MYWIN, 65, 80, 81, 21, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, 90, 65, 90, 86, 90, 89, 21, airhockey.P_GAME_MYWIN, 80, 81, 92, airhockey.P_GAME_MYWIN, 80, 86, 65, 15, 21, airhockey.P_GAME_EXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_PURCHASE, 109, 50, 94, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, 86, airhockey.J_ENEMYLOSE, 21, airhockey.J_INVITE, airhockey.J_REWARD, airhockey.P_GAME_EXIT, 81, 92, 77, 91, 8, 0, airhockey.J_DISCONNECT, 76, 3, 1, 5, 0, airhockey.J_DISCONNECT, 76, 3, 1, 7, 0, airhockey.J_DISCONNECT, 76, 3, 1, 12, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, airhockey.J_NATION, 44, 28, 16, 18, 81, 30, 17, 27, 13, 16, 22, 27, 81, 16, 20, 23, 11, 11, 15, 81, 22, 17, 11, 26, 13, 17, 30, 19, 81, 23, 11, 11, 15, 81, 55, 11, 11, 15, 43, 13, 30, 17, 12, 15, 16, 13, 11, 91, 60, 23, 10, 17, 20, 26, 27, 54, 17, 15, 10, 11, 44, 11, 13, 26, 30, 18, 77, 65, airhockey.P_GAME_MYSCORE, 0, 79, 64, airhockey.P_GAME_EXIT, 92, 65, airhockey.P_GAME_MYWIN, airhockey.P_GAME_EXIT, 0, 65, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, 90, 90, 94, 0, airhockey.P_GAME_MYWIN, 64, 90, 75, 92, 64, 79, airhockey.P_NATION, 0, airhockey.P_GAME_BREAKBALLCOUNT, 90, 90, 94, 0, 102, 90, 90, 94, airhockey.J_PURCHASE, 92, 79, 64, 93, 94, 65, 92, 90, 10, airhockey.J_ENEMYLOSE, airhockey.P_GAME_MYWIN, 86, 75, airhockey.P_GAME_EXIT, airhockey.J_NATION, 75, 64, airhockey.P_GAME_REMATCH, 90, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.J_ENEMYWIN, 64, 94, 91, 90, 125, 90, 92, 75, 79, airhockey.P_GAME_MYSCORE, 57, 37, 37, 33, 65, 93, 93, 89, 90, airhockey.J_NATION, 111, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, airhockey.J_SAVEDGAME_RELOAD, 124, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_BACK, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_EXIT, 125, airhockey.J_GAME_DISCONNECT, 109, 76, airhockey.J_ENEMYWIN, 109, airhockey.P_GAME_BREAKBALLCOUNT, 111, 64, airhockey.J_ENEMYWIN, airhockey.J_WAIT, 124, 125};
    }

    static {
        A09();
        A0J = Pattern.compile(A03(HttpStatus.SC_MULTIPLE_CHOICES, 25, 17));
        A0I = new AtomicReference<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DefaultHttpDataSource> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.He != com.facebook.ads.internal.exoplayer2.thirdparty.util.Predicate<java.lang.String> */
    public C0338As(String str, @Nullable InterfaceC0485He<String> interfaceC0485He, @Nullable InterfaceC0474Gt<? super C0338As> interfaceC0474Gt, int i, int i2, boolean z, @Nullable C0463Gi c0463Gi) {
        this.A0E = HD.A02(str);
        this.A0D = interfaceC0485He;
        this.A0C = interfaceC0474Gt;
        this.A08 = i;
        this.A09 = i2;
        this.A0F = z;
        this.A0A = c0463Gi;
    }

    private int A00(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A02;
        if (j != -1) {
            long bytesRemaining = j - this.A00;
            if (bytesRemaining == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, bytesRemaining);
        }
        int read = this.A05.read(bArr, i, i2);
        if (read == -1) {
            int read2 = (this.A02 > (-1L) ? 1 : (this.A02 == (-1L) ? 0 : -1));
            if (read2 == 0) {
                return -1;
            }
            throw new EOFException();
        }
        this.A00 += read;
        InterfaceC0474Gt<? super C0338As> interfaceC0474Gt = this.A0C;
        if (interfaceC0474Gt != null) {
            interfaceC0474Gt.AAS(this, read);
        }
        return read;
    }

    private final long A01() {
        long j = this.A02;
        return j == -1 ? j : j - this.A00;
    }

    public static long A02(HttpURLConnection httpURLConnection) {
        long j = -1;
        String headerField = httpURLConnection.getHeaderField(A03(16, 14, 75));
        boolean isEmpty = TextUtils.isEmpty(headerField);
        String A03 = A03(296, 1, 50);
        String A032 = A03(43, 21, 67);
        if (!isEmpty) {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(A032, A03(166, 27, 62) + headerField + A03);
            }
        }
        String headerField2 = httpURLConnection.getHeaderField(A03(30, 13, 64));
        if (!TextUtils.isEmpty(headerField2)) {
            Matcher matcher = A0J.matcher(headerField2);
            if (matcher.find()) {
                try {
                    long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                    if (j >= 0) {
                        if (j != parseLong) {
                            Log.w(A032, A03(64, 22, 5) + headerField + A03(297, 3, 12) + headerField2 + A03);
                            j = Math.max(j, parseLong);
                            return j;
                        }
                        return j;
                    }
                    return parseLong;
                } catch (NumberFormatException unused2) {
                    Log.e(A032, A03(193, 26, 6) + headerField2 + A03);
                    return j;
                }
            }
            return j;
        }
        return j;
    }

    private HttpURLConnection A05(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A08);
        httpURLConnection.setReadTimeout(this.A09);
        C0463Gi c0463Gi = this.A0A;
        if (c0463Gi != null) {
            for (Map.Entry<String, String> entry : c0463Gi.A00().entrySet()) {
                if (A0H[5].length() != 26) {
                    throw new RuntimeException();
                }
                A0H[2] = "kwRG9UknWr0Wgg7Rclu7tRHvEyTV8TJk";
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.A0B.A00().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = A03(325, 6, 40) + j + A03(0, 1, 23);
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty(A03(120, 5, 5), str);
        }
        httpURLConnection.setRequestProperty(A03(286, 10, 38), this.A0E);
        if (!z) {
            httpURLConnection.setRequestProperty(A03(1, 15, 106), A03(474, 8, 50));
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(A03(116, 4, 115));
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static URL A06(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!A03(469, 5, 16).equals(protocol)) {
                if (A0H[5].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "w50J2iwlOiToEn9H8bpLD3B1mxiX4OkW";
                strArr[4] = "U5WpLDBGoG2FZlKlieC8pMIdD1ZiOapt";
                if (!A03(465, 4, 104).equals(protocol)) {
                    String protocol2 = A03(255, 31, 12) + protocol;
                    throw new ProtocolException(protocol2);
                }
            }
            return url2;
        }
        throw new ProtocolException(A03(94, 22, 62));
    }

    private void A07() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(A03(43, 21, 67), A03(219, 36, 43), e);
            }
            this.A06 = null;
        }
    }

    private void A08() throws IOException {
        if (this.A01 == this.A03) {
            return;
        }
        byte[] andSet = A0I.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.A01;
            long j2 = this.A03;
            if (j != j2) {
                int readLength = (int) Math.min(j2 - j, andSet.length);
                int read = this.A05.read(andSet, 0, readLength);
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        this.A01 += read;
                        InterfaceC0474Gt<? super C0338As> interfaceC0474Gt = this.A0C;
                        if (interfaceC0474Gt != null) {
                            interfaceC0474Gt.AAS(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                A0I.set(andSet);
                return;
            }
        }
    }

    public static void A0A(HttpURLConnection httpURLConnection, long j) {
        if (C0499Hs.A02 != 19) {
            int i = C0499Hs.A02;
            String[] strArr = A0H;
            if (strArr[6].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0H[5] = "h9vUSf3vBaluOAcyH2LsyeRcof";
            if (i != 20) {
                return;
            }
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if (A03(331, 65, 70).equals(name) || A03(396, 69, 23).equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                String className = A03(482, 20, 48);
                Method declaredMethod = superclass.getDeclaredMethod(className, new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        HttpURLConnection httpURLConnection = this.A06;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws C0462Gh {
        String A03 = A03(145, 21, 68);
        this.A04 = c0458Gb;
        long j = 0;
        this.A00 = 0L;
        this.A01 = 0L;
        try {
            this.A06 = A04(c0458Gb);
            try {
                A03 = this.A06.getResponseCode();
                if (A03 < 200 || A03 > 299) {
                    Map<String, List<String>> headerFields = this.A06.getHeaderFields();
                    A07();
                    C0812Uc exception = new C0812Uc(A03, headerFields, c0458Gb);
                    if (A03 == 416) {
                        exception.initCause(new GY(0));
                    }
                    throw exception;
                }
                String contentType = this.A06.getContentType();
                InterfaceC0485He<String> interfaceC0485He = this.A0D;
                if (interfaceC0485He == null || interfaceC0485He.A5J(contentType)) {
                    if (A03 == 200) {
                        int responseCode = (c0458Gb.A03 > 0L ? 1 : (c0458Gb.A03 == 0L ? 0 : -1));
                        if (responseCode != 0) {
                            j = c0458Gb.A03;
                        }
                    }
                    this.A03 = j;
                    if (!c0458Gb.A02(1)) {
                        int responseCode2 = (c0458Gb.A02 > (-1L) ? 1 : (c0458Gb.A02 == (-1L) ? 0 : -1));
                        if (responseCode2 != 0) {
                            this.A02 = c0458Gb.A02;
                        } else {
                            long A02 = A02(this.A06);
                            int responseCode3 = (A02 > (-1L) ? 1 : (A02 == (-1L) ? 0 : -1));
                            this.A02 = responseCode3 != 0 ? A02 - this.A03 : -1L;
                        }
                    } else {
                        this.A02 = c0458Gb.A02;
                    }
                    try {
                        this.A05 = this.A06.getInputStream();
                        this.A07 = true;
                        if (A0H[3].length() != 12) {
                            A0H[5] = "XiMfcr3WVIXoNOmeCAyNU6k9qp";
                            InterfaceC0474Gt<? super C0338As> interfaceC0474Gt = this.A0C;
                            if (interfaceC0474Gt != null) {
                                interfaceC0474Gt.ACq(this, c0458Gb);
                            }
                            return this.A02;
                        }
                        throw new RuntimeException();
                    } catch (IOException e) {
                        A07();
                        throw new C0462Gh(e, c0458Gb, 1);
                    }
                }
                A07();
                throw new C0813Ud(contentType, c0458Gb);
            } catch (IOException e2) {
                A07();
                throw new C0462Gh(A03 + c0458Gb.A04.toString(), e2, c0458Gb, 1);
            }
        } catch (IOException e3) {
            throw new C0462Gh(((String) A03) + c0458Gb.A04.toString(), e3, c0458Gb, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws C0462Gh {
        try {
            if (this.A05 != null) {
                A0A(this.A06, A01());
                try {
                    this.A05.close();
                } catch (IOException e) {
                    throw new C0462Gh(e, this.A04, 3);
                }
            }
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                if (A0H[3].length() == 12) {
                    throw new RuntimeException();
                }
                A0H[2] = "ZeceMaPZKUeIsAeOgTMm1DjiML2ItOMm";
                InterfaceC0474Gt<? super C0338As> interfaceC0474Gt = this.A0C;
                if (interfaceC0474Gt != null) {
                    interfaceC0474Gt.ACp(this);
                }
            }
        } catch (Throwable th) {
            this.A05 = null;
            A07();
            if (this.A07) {
                this.A07 = false;
                InterfaceC0474Gt<? super C0338As> interfaceC0474Gt2 = this.A0C;
                if (interfaceC0474Gt2 != null) {
                    interfaceC0474Gt2.ACp(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws C0462Gh {
        try {
            A08();
            return A00(bArr, i, i2);
        } catch (IOException e) {
            throw new C0462Gh(e, this.A04, 2);
        }
    }
}
