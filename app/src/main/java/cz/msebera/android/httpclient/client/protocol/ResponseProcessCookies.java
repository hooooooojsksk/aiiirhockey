package cz.msebera.android.httpclient.client.protocol;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HeaderIterator;
import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpResponseInterceptor;
import cz.msebera.android.httpclient.client.CookieStore;
import cz.msebera.android.httpclient.cookie.Cookie;
import cz.msebera.android.httpclient.cookie.CookieOrigin;
import cz.msebera.android.httpclient.cookie.CookieSpec;
import cz.msebera.android.httpclient.cookie.MalformedCookieException;
import cz.msebera.android.httpclient.cookie.SM;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.protocol.HttpContext;
import cz.msebera.android.httpclient.util.Args;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ResponseProcessCookies implements HttpResponseInterceptor {
    public HttpClientAndroidLog log = new HttpClientAndroidLog(getClass());

    @Override // cz.msebera.android.httpclient.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        CookieSpec cookieSpec = adapt.getCookieSpec();
        if (cookieSpec == null) {
            this.log.debug("Cookie spec not specified in HTTP context");
            return;
        }
        CookieStore cookieStore = adapt.getCookieStore();
        if (cookieStore == null) {
            this.log.debug("Cookie store not specified in HTTP context");
            return;
        }
        CookieOrigin cookieOrigin = adapt.getCookieOrigin();
        if (cookieOrigin == null) {
            this.log.debug("Cookie origin not specified in HTTP context");
            return;
        }
        processCookies(httpResponse.headerIterator(SM.SET_COOKIE), cookieSpec, cookieOrigin, cookieStore);
        if (cookieSpec.getVersion() > 0) {
            processCookies(httpResponse.headerIterator(SM.SET_COOKIE2), cookieSpec, cookieOrigin, cookieStore);
        }
    }

    private void processCookies(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie cookie : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                        if (this.log.isDebugEnabled()) {
                            HttpClientAndroidLog httpClientAndroidLog = this.log;
                            httpClientAndroidLog.debug("Cookie accepted [" + formatCooke(cookie) + "]");
                        }
                    } catch (MalformedCookieException e) {
                        if (this.log.isWarnEnabled()) {
                            HttpClientAndroidLog httpClientAndroidLog2 = this.log;
                            httpClientAndroidLog2.warn("Cookie rejected [" + formatCooke(cookie) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (this.log.isWarnEnabled()) {
                    HttpClientAndroidLog httpClientAndroidLog3 = this.log;
                    httpClientAndroidLog3.warn("Invalid cookie header: \"" + nextHeader + "\". " + e2.getMessage());
                }
            }
        }
    }

    private static String formatCooke(Cookie cookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(cookie.getName());
        sb.append("=\"");
        String value = cookie.getValue();
        if (value != null) {
            if (value.length() > 100) {
                value = value.substring(0, 100) + "...";
            }
            sb.append(value);
        }
        sb.append("\"");
        sb.append(", version:");
        sb.append(Integer.toString(cookie.getVersion()));
        sb.append(", domain:");
        sb.append(cookie.getDomain());
        sb.append(", path:");
        sb.append(cookie.getPath());
        sb.append(", expiry:");
        sb.append(cookie.getExpiryDate());
        return sb.toString();
    }
}
