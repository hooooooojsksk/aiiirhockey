package cz.msebera.android.httpclient.impl.client;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import cz.msebera.android.httpclient.ConnectionReuseStrategy;
import cz.msebera.android.httpclient.conn.ClientConnectionManager;
import cz.msebera.android.httpclient.conn.routing.HttpRoutePlanner;
import cz.msebera.android.httpclient.impl.DefaultConnectionReuseStrategy;
import cz.msebera.android.httpclient.impl.NoConnectionReuseStrategy;
import cz.msebera.android.httpclient.impl.conn.PoolingClientConnectionManager;
import cz.msebera.android.httpclient.impl.conn.ProxySelectorRoutePlanner;
import cz.msebera.android.httpclient.impl.conn.SchemeRegistryFactory;
import cz.msebera.android.httpclient.params.HttpParams;
import java.net.ProxySelector;

@Deprecated
/* loaded from: classes2.dex */
public class SystemDefaultHttpClient extends DefaultHttpClient {
    public SystemDefaultHttpClient(HttpParams httpParams) {
        super(null, httpParams);
    }

    public SystemDefaultHttpClient() {
        super(null, null);
    }

    @Override // cz.msebera.android.httpclient.impl.client.AbstractHttpClient
    protected ClientConnectionManager createClientConnectionManager() {
        PoolingClientConnectionManager poolingClientConnectionManager = new PoolingClientConnectionManager(SchemeRegistryFactory.createSystemDefault());
        if (InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase(System.getProperty("http.keepAlive", InneractiveMediationDefs.SHOW_HOUSE_AD_YES))) {
            int parseInt = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
            poolingClientConnectionManager.setDefaultMaxPerRoute(parseInt);
            poolingClientConnectionManager.setMaxTotal(parseInt * 2);
        }
        return poolingClientConnectionManager;
    }

    @Override // cz.msebera.android.httpclient.impl.client.AbstractHttpClient
    protected HttpRoutePlanner createHttpRoutePlanner() {
        return new ProxySelectorRoutePlanner(getConnectionManager().getSchemeRegistry(), ProxySelector.getDefault());
    }

    @Override // cz.msebera.android.httpclient.impl.client.AbstractHttpClient
    protected ConnectionReuseStrategy createConnectionReuseStrategy() {
        if (InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase(System.getProperty("http.keepAlive", InneractiveMediationDefs.SHOW_HOUSE_AD_YES))) {
            return new DefaultConnectionReuseStrategy();
        }
        return new NoConnectionReuseStrategy();
    }
}
