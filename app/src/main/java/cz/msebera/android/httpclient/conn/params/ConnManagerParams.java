package cz.msebera.android.httpclient.conn.params;

import cz.msebera.android.httpclient.conn.routing.HttpRoute;
import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.util.Args;

@Deprecated
/* loaded from: classes2.dex */
public final class ConnManagerParams implements ConnManagerPNames {
    private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE = new ConnPerRoute() { // from class: cz.msebera.android.httpclient.conn.params.ConnManagerParams.1
        @Override // cz.msebera.android.httpclient.conn.params.ConnPerRoute
        public int getMaxForRoute(HttpRoute httpRoute) {
            return 2;
        }
    };
    public static final int DEFAULT_MAX_TOTAL_CONNECTIONS = 20;

    @Deprecated
    public static long getTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getLongParameter("http.conn-manager.timeout", 0L);
    }

    @Deprecated
    public static void setTimeout(HttpParams httpParams, long j) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setLongParameter("http.conn-manager.timeout", j);
    }

    public static void setMaxConnectionsPerRoute(HttpParams httpParams, ConnPerRoute connPerRoute) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE, connPerRoute);
    }

    public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        ConnPerRoute connPerRoute = (ConnPerRoute) httpParams.getParameter(ConnManagerPNames.MAX_CONNECTIONS_PER_ROUTE);
        return connPerRoute == null ? DEFAULT_CONN_PER_ROUTE : connPerRoute;
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, i);
    }

    public static int getMaxTotalConnections(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getIntParameter(ConnManagerPNames.MAX_TOTAL_CONNECTIONS, 20);
    }
}
