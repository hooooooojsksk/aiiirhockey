package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.loopj.android.http.AsyncHttpClient;
import cz.msebera.android.httpclient.HttpHeaders;
import cz.msebera.android.httpclient.HttpHost;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends h implements g {

    /* loaded from: classes.dex */
    public static class a extends j {
        public final HttpURLConnection g;

        public a(HttpURLConnection httpURLConnection, int i, InputStream inputStream, Map<String, List<String>> map, String str) {
            this.g = httpURLConnection;
            a(i);
            a(inputStream);
            a(map);
            a(str);
        }

        @Override // com.fyber.inneractive.sdk.network.j
        public void a() throws IOException {
            try {
                HttpURLConnection httpURLConnection = this.g;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            super.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public <T> j a(a0<T> a0Var, String str, String str2) throws Exception {
        InputStream inputStream;
        j a2;
        IAlog.a("%s hurl network stack is in use", "HttpExecutorImpl");
        URL url = new URL(a0Var.a());
        ArrayList arrayList = new ArrayList();
        arrayList.add(a0Var.a());
        Pair<List<String>, HttpURLConnection> a3 = a(a0Var, arrayList, url, str, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) a3.second;
        List<String> list = (List) a3.first;
        if (httpURLConnection == null) {
            try {
                if (list.size() <= 0) {
                    throw new t0("failed reading network response connection null");
                }
            } catch (SocketTimeoutException e) {
                throw new w0(e);
            } catch (IOException e2) {
                IAlog.a("failed reading network response", e2, new Object[0]);
                throw new t0(e2);
            }
        }
        if (httpURLConnection == null) {
            a2 = a((InputStream) null, 200, "", (Map<String, List<String>>) null, (String) null);
        } else {
            try {
                inputStream = a(httpURLConnection.getInputStream(), TextUtils.equals(AsyncHttpClient.ENCODING_GZIP, httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
                inputStream = null;
            }
            a2 = a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField("Last-Modified"));
        }
        a aVar = new a(httpURLConnection, a2.a, a2.c, a2.d, a2.e);
        for (String str3 : list) {
            aVar.f.add(str3);
        }
        return aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public void b() {
    }

    public final <T> Pair<List<String>, HttpURLConnection> a(a0<T> a0Var, List<String> list, URL url, String str, String str2) throws b {
        String headerField;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if (!a0Var.i()) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            q0 k = a0Var.k();
            httpURLConnection.setConnectTimeout(k.a);
            httpURLConnection.setReadTimeout(k.b);
            a(httpURLConnection, "User-Agent", str);
            a(httpURLConnection, "If-Modified-Since", str2);
            a(httpURLConnection, "Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
            Map<String, String> s = a0Var.s();
            if (s != null) {
                for (String str3 : s.keySet()) {
                    a(httpURLConnection, str3, s.get(str3));
                }
            }
            if (a0Var.o() != x.POST && a0Var.o() != x.PUT) {
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                IAlog.a("%s (%s) response code - %d", a0Var.toString(), url, Integer.valueOf(responseCode));
                if (a0Var.i() && (((responseCode > 300 && responseCode < 304) || responseCode == 307 || responseCode == 308) && (headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION)) != null)) {
                    if (!headerField.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && !headerField.contains("://") && list.size() > 0) {
                        Uri parse = Uri.parse(list.get(list.size() - 1));
                        headerField = String.format(headerField.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), headerField);
                    }
                    list.add(headerField);
                    if (list.size() <= 5) {
                        if (headerField.startsWith(HttpHost.DEFAULT_SCHEME_NAME)) {
                            return a(a0Var, list, new URL(headerField), str, str2);
                        }
                        return Pair.create(list, null);
                    }
                    throw new b("Url chain too big for us");
                }
                return new Pair<>(list, httpURLConnection);
            }
            a(httpURLConnection, (a0<?>) a0Var);
            int responseCode2 = httpURLConnection.getResponseCode();
            IAlog.a("%s (%s) response code - %d", a0Var.toString(), url, Integer.valueOf(responseCode2));
            if (a0Var.i()) {
            }
            return new Pair<>(list, httpURLConnection);
        } catch (Exception e) {
            IAlog.a("failed executing network request", e, new Object[0]);
            throw new b(e);
        }
    }

    public final void a(HttpURLConnection httpURLConnection, a0<?> a0Var) throws Exception {
        httpURLConnection.setRequestMethod(a0Var.o().key);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] q = a0Var.q();
        int length = q != null ? q.length : 0;
        httpURLConnection.setRequestProperty("Content-Length", "" + length);
        httpURLConnection.setRequestProperty("Content-Type", a0Var.n());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(q);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final void a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        int i = IAlog.a;
        IAlog.a(1, null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }
}
