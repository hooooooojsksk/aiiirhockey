package cz.msebera.android.httpclient.client;

import cz.msebera.android.httpclient.conn.routing.HttpRoute;

/* loaded from: classes2.dex */
public interface BackoffManager {
    void backOff(HttpRoute httpRoute);

    void probe(HttpRoute httpRoute);
}
