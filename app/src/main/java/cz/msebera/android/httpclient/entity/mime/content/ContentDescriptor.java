package cz.msebera.android.httpclient.entity.mime.content;

/* loaded from: classes2.dex */
public interface ContentDescriptor {
    String getCharset();

    long getContentLength();

    String getMediaType();

    String getMimeType();

    String getSubType();

    String getTransferEncoding();
}
