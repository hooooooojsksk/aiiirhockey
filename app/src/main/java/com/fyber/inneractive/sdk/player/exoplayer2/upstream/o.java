package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import cz.msebera.android.httpclient.HttpHeaders;
import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class o implements g {
    public static final Pattern q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference<byte[]> r = new AtomicReference<>();
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final w f;
    public final a0<? super o> h;
    public j i;
    public HttpURLConnection j;
    public InputStream k;
    public boolean l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m<String> e = null;
    public final w g = new w();

    public o(String str, com.fyber.inneractive.sdk.player.exoplayer2.util.m<String> mVar, a0<? super o> a0Var, int i, int i2, boolean z, w wVar) {
        this.d = com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
        this.h = a0Var;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.f = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(j jVar) throws IOException {
        HttpURLConnection a;
        URL url = new URL(jVar.a.toString());
        byte[] bArr = jVar.b;
        long j = jVar.d;
        long j2 = jVar.e;
        boolean a2 = jVar.a(1);
        if (this.a) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i <= 20) {
                    long j3 = j;
                    a = a(url, bArr, j, j2, a2, false);
                    int responseCode = a.getResponseCode();
                    if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                        bArr = null;
                        String headerField = a.getHeaderField(HttpHeaders.LOCATION);
                        a.disconnect();
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
                            }
                            url = url2;
                            i = i2;
                            j = j3;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    }
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
            }
            return a;
        }
        return a(url, bArr, j, j2, a2, true);
    }

    public final void c() throws IOException {
        if (this.o == this.m) {
            return;
        }
        byte[] andSet = r.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.o;
            long j2 = this.m;
            if (j != j2) {
                int read = this.k.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
                if (Thread.interrupted()) {
                    throw new InterruptedIOException();
                }
                if (read != -1) {
                    long j3 = read;
                    this.o += j3;
                    a0<? super o> a0Var = this.h;
                    if (a0Var != null) {
                        l lVar = (l) a0Var;
                        synchronized (lVar) {
                            lVar.d += j3;
                        }
                    }
                } else {
                    throw new EOFException();
                }
            } else {
                r.set(andSet);
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws t {
        try {
            if (this.k != null) {
                HttpURLConnection httpURLConnection = this.j;
                long j = this.n;
                if (j != -1) {
                    j -= this.p;
                }
                a(httpURLConnection, j);
                try {
                    this.k.close();
                } catch (IOException e) {
                    throw new t(e, this.i, 3);
                }
            }
        } finally {
            this.k = null;
            b();
            if (this.l) {
                this.l = false;
                a0<? super o> a0Var = this.h;
                if (a0Var != null) {
                    ((l) a0Var).a(this);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0043, code lost:
        if (r7 != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0102  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r19) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.t {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.o.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):long");
    }

    public final int b(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.n;
        if (j != -1) {
            long j2 = j - this.p;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.k.read(bArr, i, i2);
        if (read == -1) {
            if (this.n == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = read;
        this.p += j3;
        a0<? super o> a0Var = this.h;
        if (a0Var != null) {
            l lVar = (l) a0Var;
            synchronized (lVar) {
                lVar.d += j3;
            }
        }
        return read;
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.j = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws t {
        try {
            c();
            return b(bArr, i, i2);
        } catch (IOException e) {
            throw new t(e, this.i, 2);
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        Map<String, String> map;
        Map<String, String> map2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        w wVar = this.f;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.b == null) {
                    wVar.b = Collections.unmodifiableMap(new HashMap(wVar.a));
                }
                map2 = wVar.b;
            }
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        w wVar2 = this.g;
        synchronized (wVar2) {
            if (wVar2.b == null) {
                wVar2.b = Collections.unmodifiableMap(new HashMap(wVar2.a));
            }
            map = wVar2.b;
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", HTTP.IDENTITY_CODING);
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
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

    public static void a(HttpURLConnection httpURLConnection, long j) {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a;
        if (i == 19 || i == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}
