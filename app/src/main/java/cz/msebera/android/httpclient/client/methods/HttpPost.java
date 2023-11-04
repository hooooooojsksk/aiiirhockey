package cz.msebera.android.httpclient.client.methods;

import java.net.URI;

/* loaded from: classes2.dex */
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    @Override // cz.msebera.android.httpclient.client.methods.HttpRequestBase, cz.msebera.android.httpclient.client.methods.HttpUriRequest
    public String getMethod() {
        return "POST";
    }

    public HttpPost() {
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    public HttpPost(String str) {
        setURI(URI.create(str));
    }
}
