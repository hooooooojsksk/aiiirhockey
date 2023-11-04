package cz.msebera.android.httpclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface HttpEntity {
    @Deprecated
    void consumeContent() throws IOException;

    InputStream getContent() throws IOException, UnsupportedOperationException;

    Header getContentEncoding();

    long getContentLength();

    Header getContentType();

    boolean isChunked();

    boolean isRepeatable();

    boolean isStreaming();

    void writeTo(OutputStream outputStream) throws IOException;
}
