package cz.msebera.android.httpclient.conn;

import cz.msebera.android.httpclient.HttpHost;

/* loaded from: classes2.dex */
public interface SchemePortResolver {
    int resolve(HttpHost httpHost) throws UnsupportedSchemeException;
}
