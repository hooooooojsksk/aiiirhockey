package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.loopj.android.http.AsyncHttpClient;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class p {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    public static boolean b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            IAlog.a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
            return false;
        }
        return true;
    }

    public static String a(String str, int i, int i2, int i3) throws Exception {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            InputStream a = a((URLConnection) httpURLConnection);
            String a2 = a(httpURLConnection);
            if (TextUtils.isEmpty(a2)) {
                String stringBuffer = b(httpURLConnection) ? q.a(a, false).toString() : null;
                httpURLConnection.disconnect();
                return stringBuffer;
            } else if (i3 >= 0) {
                httpURLConnection.disconnect();
                return a(a2, i2, i, i3);
            } else {
                throw new Exception("AdServer returned HTTP redirect response more than " + i3 + " times! aborting");
            }
        } catch (Exception e) {
            IAlog.a("getBodyFromUrl failed with exception", e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            IAlog.a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    public static InputStream a(URLConnection uRLConnection) {
        InputStream bufferedInputStream;
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals(AsyncHttpClient.ENCODING_GZIP, uRLConnection.getContentEncoding())) {
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 302 || responseCode == 303 || responseCode == 307) {
            IAlog.a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
            String headerField = httpURLConnection.getHeaderField(com.fyber.inneractive.sdk.network.l.LOCATION.key);
            if (!TextUtils.isEmpty(headerField)) {
                IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
                return headerField;
            }
            throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
        }
        return null;
    }
}
