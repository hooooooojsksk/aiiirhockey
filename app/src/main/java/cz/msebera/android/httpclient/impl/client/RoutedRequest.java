package cz.msebera.android.httpclient.impl.client;

import cz.msebera.android.httpclient.conn.routing.HttpRoute;

@Deprecated
/* loaded from: classes2.dex */
public class RoutedRequest {
    protected final RequestWrapper request;
    protected final HttpRoute route;

    public RoutedRequest(RequestWrapper requestWrapper, HttpRoute httpRoute) {
        this.request = requestWrapper;
        this.route = httpRoute;
    }

    public final RequestWrapper getRequest() {
        return this.request;
    }

    public final HttpRoute getRoute() {
        return this.route;
    }
}
