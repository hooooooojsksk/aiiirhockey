package com.loopj.android.http;

import android.os.Looper;
import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.StatusLine;
import cz.msebera.android.httpclient.client.HttpResponseException;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes2.dex */
public abstract class BinaryHttpResponseHandler extends AsyncHttpResponseHandler {
    private static final String LOG_TAG = "BinaryHttpRH";
    private String[] mAllowedContentTypes;

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public abstract void onFailure(int i, Header[] headerArr, byte[] bArr, Throwable th);

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public abstract void onSuccess(int i, Header[] headerArr, byte[] bArr);

    public BinaryHttpResponseHandler() {
        this.mAllowedContentTypes = new String[]{"application/octet-stream", "image/jpeg", "image/png", "image/gif"};
    }

    public BinaryHttpResponseHandler(String[] strArr) {
        this.mAllowedContentTypes = new String[]{"application/octet-stream", "image/jpeg", "image/png", "image/gif"};
        if (strArr != null) {
            this.mAllowedContentTypes = strArr;
        } else {
            AsyncHttpClient.log.e(LOG_TAG, "Constructor passed allowedContentTypes was null !");
        }
    }

    public BinaryHttpResponseHandler(String[] strArr, Looper looper) {
        super(looper);
        this.mAllowedContentTypes = new String[]{"application/octet-stream", "image/jpeg", "image/png", "image/gif"};
        if (strArr != null) {
            this.mAllowedContentTypes = strArr;
        } else {
            AsyncHttpClient.log.e(LOG_TAG, "Constructor passed allowedContentTypes was null !");
        }
    }

    public String[] getAllowedContentTypes() {
        return this.mAllowedContentTypes;
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler, com.loopj.android.http.ResponseHandlerInterface
    public final void sendResponseMessage(HttpResponse httpResponse) throws IOException {
        String[] allowedContentTypes;
        StatusLine statusLine = httpResponse.getStatusLine();
        Header[] headers = httpResponse.getHeaders("Content-Type");
        if (headers.length != 1) {
            sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), null, new HttpResponseException(statusLine.getStatusCode(), "None, or more than one, Content-Type Header found!"));
            return;
        }
        Header header = headers[0];
        boolean z = false;
        for (String str : getAllowedContentTypes()) {
            try {
                if (Pattern.matches(str, header.getValue())) {
                    z = true;
                }
            } catch (PatternSyntaxException e) {
                AsyncHttpClient.log.e(LOG_TAG, "Given pattern is not valid: " + str, e);
            }
        }
        if (!z) {
            sendFailureMessage(statusLine.getStatusCode(), httpResponse.getAllHeaders(), null, new HttpResponseException(statusLine.getStatusCode(), "Content-Type (" + header.getValue() + ") not allowed!"));
            return;
        }
        super.sendResponseMessage(httpResponse);
    }
}
