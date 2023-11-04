package cz.msebera.android.httpclient.client.protocol;

import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.HttpHost;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpResponseInterceptor;
import cz.msebera.android.httpclient.auth.AuthProtocolState;
import cz.msebera.android.httpclient.auth.AuthScheme;
import cz.msebera.android.httpclient.auth.AuthState;
import cz.msebera.android.httpclient.client.AuthCache;
import cz.msebera.android.httpclient.conn.scheme.SchemeRegistry;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.impl.client.BasicAuthCache;
import cz.msebera.android.httpclient.protocol.ExecutionContext;
import cz.msebera.android.httpclient.protocol.HttpContext;
import cz.msebera.android.httpclient.util.Args;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public class ResponseAuthCache implements HttpResponseInterceptor {
    public HttpClientAndroidLog log = new HttpClientAndroidLog(getClass());

    @Override // cz.msebera.android.httpclient.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (httpHost != null && authState != null) {
            if (this.log.isDebugEnabled()) {
                HttpClientAndroidLog httpClientAndroidLog = this.log;
                httpClientAndroidLog.debug("Target auth state: " + authState.getState());
            }
            if (isCachable(authState)) {
                SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
                if (httpHost.getPort() < 0) {
                    httpHost = new HttpHost(httpHost.getHostName(), schemeRegistry.getScheme(httpHost).resolvePort(httpHost.getPort()), httpHost.getSchemeName());
                }
                if (authCache == null) {
                    authCache = new BasicAuthCache();
                    httpContext.setAttribute("http.auth.auth-cache", authCache);
                }
                int i = AnonymousClass1.$SwitchMap$cz$msebera$android$httpclient$auth$AuthProtocolState[authState.getState().ordinal()];
                if (i == 1) {
                    cache(authCache, httpHost, authState.getAuthScheme());
                } else if (i == 2) {
                    uncache(authCache, httpHost, authState.getAuthScheme());
                }
            }
        }
        HttpHost httpHost2 = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_PROXY_HOST);
        AuthState authState2 = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
        if (httpHost2 == null || authState2 == null) {
            return;
        }
        if (this.log.isDebugEnabled()) {
            HttpClientAndroidLog httpClientAndroidLog2 = this.log;
            httpClientAndroidLog2.debug("Proxy auth state: " + authState2.getState());
        }
        if (isCachable(authState2)) {
            if (authCache == null) {
                authCache = new BasicAuthCache();
                httpContext.setAttribute("http.auth.auth-cache", authCache);
            }
            int i2 = AnonymousClass1.$SwitchMap$cz$msebera$android$httpclient$auth$AuthProtocolState[authState2.getState().ordinal()];
            if (i2 == 1) {
                cache(authCache, httpHost2, authState2.getAuthScheme());
            } else if (i2 != 2) {
            } else {
                uncache(authCache, httpHost2, authState2.getAuthScheme());
            }
        }
    }

    /* renamed from: cz.msebera.android.httpclient.client.protocol.ResponseAuthCache$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cz$msebera$android$httpclient$auth$AuthProtocolState;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            $SwitchMap$cz$msebera$android$httpclient$auth$AuthProtocolState = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cz$msebera$android$httpclient$auth$AuthProtocolState[AuthProtocolState.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean isCachable(AuthState authState) {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        return schemeName.equalsIgnoreCase("Basic") || schemeName.equalsIgnoreCase("Digest");
    }

    private void cache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.log.isDebugEnabled()) {
            HttpClientAndroidLog httpClientAndroidLog = this.log;
            httpClientAndroidLog.debug("Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.put(httpHost, authScheme);
    }

    private void uncache(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.log.isDebugEnabled()) {
            HttpClientAndroidLog httpClientAndroidLog = this.log;
            httpClientAndroidLog.debug("Removing from cache '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }
}
