package cz.msebera.android.httpclient.impl.execchain;

import cz.msebera.android.httpclient.ConnectionReuseStrategy;
import cz.msebera.android.httpclient.ProtocolException;
import cz.msebera.android.httpclient.client.methods.HttpRequestWrapper;
import cz.msebera.android.httpclient.client.protocol.RequestClientConnControl;
import cz.msebera.android.httpclient.client.utils.URIUtils;
import cz.msebera.android.httpclient.conn.ConnectionKeepAliveStrategy;
import cz.msebera.android.httpclient.conn.HttpClientConnectionManager;
import cz.msebera.android.httpclient.conn.routing.HttpRoute;
import cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import cz.msebera.android.httpclient.protocol.HttpProcessor;
import cz.msebera.android.httpclient.protocol.HttpRequestExecutor;
import cz.msebera.android.httpclient.protocol.ImmutableHttpProcessor;
import cz.msebera.android.httpclient.protocol.RequestContent;
import cz.msebera.android.httpclient.protocol.RequestTargetHost;
import cz.msebera.android.httpclient.protocol.RequestUserAgent;
import cz.msebera.android.httpclient.util.Args;
import cz.msebera.android.httpclient.util.VersionInfo;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
public class MinimalClientExec implements ClientExecChain {
    private final HttpClientConnectionManager connManager;
    private final HttpProcessor httpProcessor;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    public HttpClientAndroidLog log = new HttpClientAndroidLog(getClass());
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;

    public MinimalClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        this.httpProcessor = new ImmutableHttpProcessor(new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(VersionInfo.getUserAgent("Apache-HttpClient", "cz.msebera.android.httpclient.client", getClass())));
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
    }

    static void rewriteRequestURI(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute) throws ProtocolException {
        URI rewriteURI;
        try {
            URI uri = httpRequestWrapper.getURI();
            if (uri != null) {
                if (uri.isAbsolute()) {
                    rewriteURI = URIUtils.rewriteURI(uri, null, true);
                } else {
                    rewriteURI = URIUtils.rewriteURI(uri);
                }
                httpRequestWrapper.setURI(rewriteURI);
            }
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + httpRequestWrapper.getRequestLine().getUri(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ac A[Catch: RuntimeException -> 0x010a, IOException -> 0x010f, HttpException -> 0x0114, ConnectionShutdownException -> 0x0119, TryCatch #3 {HttpException -> 0x0114, ConnectionShutdownException -> 0x0119, IOException -> 0x010f, RuntimeException -> 0x010a, blocks: (B:95:0x004f, B:97:0x0055, B:98:0x0059, B:99:0x0061, B:100:0x0062, B:102:0x0068, B:106:0x0072, B:107:0x007a, B:109:0x0080, B:110:0x0083, B:112:0x008b, B:114:0x0097, B:117:0x00ac, B:118:0x00b0, B:120:0x00dc, B:122:0x00ee, B:124:0x00f4, B:127:0x00fb, B:129:0x0101, B:121:0x00eb), top: B:155:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00dc A[Catch: RuntimeException -> 0x010a, IOException -> 0x010f, HttpException -> 0x0114, ConnectionShutdownException -> 0x0119, TryCatch #3 {HttpException -> 0x0114, ConnectionShutdownException -> 0x0119, IOException -> 0x010f, RuntimeException -> 0x010a, blocks: (B:95:0x004f, B:97:0x0055, B:98:0x0059, B:99:0x0061, B:100:0x0062, B:102:0x0068, B:106:0x0072, B:107:0x007a, B:109:0x0080, B:110:0x0083, B:112:0x008b, B:114:0x0097, B:117:0x00ac, B:118:0x00b0, B:120:0x00dc, B:122:0x00ee, B:124:0x00f4, B:127:0x00fb, B:129:0x0101, B:121:0x00eb), top: B:155:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00eb A[Catch: RuntimeException -> 0x010a, IOException -> 0x010f, HttpException -> 0x0114, ConnectionShutdownException -> 0x0119, TryCatch #3 {HttpException -> 0x0114, ConnectionShutdownException -> 0x0119, IOException -> 0x010f, RuntimeException -> 0x010a, blocks: (B:95:0x004f, B:97:0x0055, B:98:0x0059, B:99:0x0061, B:100:0x0062, B:102:0x0068, B:106:0x0072, B:107:0x007a, B:109:0x0080, B:110:0x0083, B:112:0x008b, B:114:0x0097, B:117:0x00ac, B:118:0x00b0, B:120:0x00dc, B:122:0x00ee, B:124:0x00f4, B:127:0x00fb, B:129:0x0101, B:121:0x00eb), top: B:155:0x004f }] */
    @Override // cz.msebera.android.httpclient.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cz.msebera.android.httpclient.client.methods.CloseableHttpResponse execute(cz.msebera.android.httpclient.conn.routing.HttpRoute r8, cz.msebera.android.httpclient.client.methods.HttpRequestWrapper r9, cz.msebera.android.httpclient.client.protocol.HttpClientContext r10, cz.msebera.android.httpclient.client.methods.HttpExecutionAware r11) throws java.io.IOException, cz.msebera.android.httpclient.HttpException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.impl.execchain.MinimalClientExec.execute(cz.msebera.android.httpclient.conn.routing.HttpRoute, cz.msebera.android.httpclient.client.methods.HttpRequestWrapper, cz.msebera.android.httpclient.client.protocol.HttpClientContext, cz.msebera.android.httpclient.client.methods.HttpExecutionAware):cz.msebera.android.httpclient.client.methods.CloseableHttpResponse");
    }
}
