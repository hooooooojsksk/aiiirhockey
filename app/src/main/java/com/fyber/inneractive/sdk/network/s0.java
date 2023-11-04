package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.loopj.android.http.AsyncHttpClient;
import cz.msebera.android.httpclient.HttpHeaders;
import cz.msebera.android.httpclient.HttpHost;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes.dex */
public class s0 extends h implements g {
    public final OkHttpClient a = new OkHttpClient().newBuilder().build();

    /* loaded from: classes.dex */
    public static class a extends j {
        public final Response g;

        public a(j jVar, Response response) {
            this.g = response;
            a(jVar.d());
            a(jVar.b());
            a(jVar.c());
            a(jVar.e());
        }

        @Override // com.fyber.inneractive.sdk.network.j
        public void a() throws IOException {
            super.a();
            Response response = this.g;
            if (response != null) {
                response.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[LOOP:1: B:65:0x00bd->B:67:0x00c3, LOOP_END] */
    @Override // com.fyber.inneractive.sdk.network.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.fyber.inneractive.sdk.network.j a(com.fyber.inneractive.sdk.network.a0<T> r10, java.lang.String r11, java.lang.String r12) throws java.lang.Exception {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "OkHttpExecutorImpl"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "%s okhttp network stack is in use"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = r10.a()
            r6.add(r0)
            java.lang.String r4 = r10.a()
            r3 = r9
            r5 = r10
            r7 = r11
            r8 = r12
            android.util.Pair r10 = r3.a(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r10.second
            if (r11 == 0) goto L30
            okhttp3.Response r11 = (okhttp3.Response) r11
            java.lang.String r11 = r11.message()
            goto L32
        L30:
            java.lang.String r11 = ""
        L32:
            r6 = r11
            java.lang.Object r11 = r10.second
            okhttp3.Response r11 = (okhttp3.Response) r11
            r12 = 0
            if (r11 == 0) goto L5e
            okhttp3.ResponseBody r0 = r11.body()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L5e
            java.lang.String r0 = "gzip"
            java.lang.String r1 = "content-encoding"
            okhttp3.Headers r3 = r11.headers()     // Catch: java.lang.Exception -> L5e
            java.lang.String r1 = r3.get(r1)     // Catch: java.lang.Exception -> L5e
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Exception -> L5e
            okhttp3.ResponseBody r11 = r11.body()     // Catch: java.lang.Exception -> L5e
            java.io.InputStream r11 = r11.byteStream()     // Catch: java.lang.Exception -> L5e
            java.io.InputStream r11 = r9.a(r11, r0)     // Catch: java.lang.Exception -> L5e
            r4 = r11
            goto L5f
        L5e:
            r4 = r12
        L5f:
            java.lang.Object r11 = r10.second
            if (r11 != 0) goto L66
            r11 = -1
            r5 = -1
            goto L6d
        L66:
            okhttp3.Response r11 = (okhttp3.Response) r11
            int r11 = r11.code()
            r5 = r11
        L6d:
            java.lang.Object r11 = r10.second
            okhttp3.Response r11 = (okhttp3.Response) r11
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r11 == 0) goto L94
            okhttp3.Headers r11 = r11.headers()
        L7c:
            int r0 = r11.size()
            if (r2 >= r0) goto L94
            java.lang.String r0 = r11.name(r2)
            java.lang.String r1 = r11.get(r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r7.put(r0, r1)
            int r2 = r2 + 1
            goto L7c
        L94:
            java.lang.Object r11 = r10.second
            okhttp3.Response r11 = (okhttp3.Response) r11
            if (r11 == 0) goto La6
            okhttp3.Headers r11 = r11.headers()
            java.lang.String r12 = "Last-Modified"
            java.lang.String r11 = r11.get(r12)
            r8 = r11
            goto La7
        La6:
            r8 = r12
        La7:
            r3 = r9
            com.fyber.inneractive.sdk.network.j r11 = r3.a(r4, r5, r6, r7, r8)
            com.fyber.inneractive.sdk.network.s0$a r12 = new com.fyber.inneractive.sdk.network.s0$a
            java.lang.Object r0 = r10.second
            okhttp3.Response r0 = (okhttp3.Response) r0
            r12.<init>(r11, r0)
            java.lang.Object r10 = r10.first
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        Lbd:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lcf
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.List<java.lang.String> r0 = r12.f
            r0.add(r11)
            goto Lbd
        Lcf:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.s0.a(com.fyber.inneractive.sdk.network.a0, java.lang.String, java.lang.String):com.fyber.inneractive.sdk.network.j");
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public void b() {
    }

    public final <T> Pair<List<String>, Response> a(String str, a0<T> a0Var, List<String> list, String str2, String str3) throws Exception {
        String header;
        q0 k = a0Var.k();
        Request.Builder builder = new Request.Builder();
        a(builder, "Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
        a(builder, "User-Agent", str2);
        a(builder, "If-Modified-Since", str3);
        Map<String, String> s = a0Var.s();
        if (s != null) {
            for (String str4 : s.keySet()) {
                a(builder, str4, s.get(str4));
            }
        }
        builder.url(str);
        if (a0Var.o() == x.POST || a0Var.o() == x.PUT) {
            byte[] q = a0Var.q();
            if (q != null) {
                builder.post(RequestBody.create(q, MediaType.parse(a0Var.n())));
            } else {
                throw new Exception("Could not create ok http request. post payload is null");
            }
        }
        Request build = builder.build();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Response execute = this.a.newBuilder().followRedirects(a0Var.i()).followSslRedirects(a0Var.i()).connectTimeout(k.a, timeUnit).readTimeout(k.b, timeUnit).build().newCall(build).execute();
        if (!a0Var.i() && (((execute.code() > 300 && execute.code() < 304) || execute.code() == 307 || execute.code() == 308) && (header = execute.header(HttpHeaders.LOCATION, "")) != null)) {
            if (!header.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && !header.contains("://") && list.size() > 0) {
                Uri parse = Uri.parse(list.get(list.size() - 1));
                header = String.format(header.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), header);
            }
            String str5 = header;
            list.add(str5);
            if (list.size() <= 5) {
                return a(str5, a0Var, list, str2, str3);
            }
            throw new b("Url chain too big for us");
        }
        return new Pair<>(list, execute);
    }

    public final void a(Request.Builder builder, String str, String str2) {
        int i = IAlog.a;
        IAlog.a(1, null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
