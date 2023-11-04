package cz.msebera.android.httpclient.impl.client;

import cz.msebera.android.httpclient.client.protocol.RequestAcceptEncoding;
import cz.msebera.android.httpclient.client.protocol.ResponseContentEncoding;
import cz.msebera.android.httpclient.conn.ClientConnectionManager;
import cz.msebera.android.httpclient.params.HttpParams;
import cz.msebera.android.httpclient.protocol.BasicHttpProcessor;

@Deprecated
/* loaded from: classes2.dex */
public class ContentEncodingHttpClient extends DefaultHttpClient {
    public ContentEncodingHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
    }

    public ContentEncodingHttpClient(HttpParams httpParams) {
        this(null, httpParams);
    }

    public ContentEncodingHttpClient() {
        this(null);
    }

    @Override // cz.msebera.android.httpclient.impl.client.DefaultHttpClient, cz.msebera.android.httpclient.impl.client.AbstractHttpClient
    public BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(new RequestAcceptEncoding());
        createHttpProcessor.addResponseInterceptor(new ResponseContentEncoding());
        return createHttpProcessor;
    }
}
