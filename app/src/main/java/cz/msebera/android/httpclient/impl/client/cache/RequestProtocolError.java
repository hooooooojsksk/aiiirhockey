package cz.msebera.android.httpclient.impl.client.cache;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public enum RequestProtocolError {
    UNKNOWN,
    BODY_BUT_NO_LENGTH_ERROR,
    WEAK_ETAG_ON_PUTDELETE_METHOD_ERROR,
    WEAK_ETAG_AND_RANGE_ERROR,
    NO_CACHE_DIRECTIVE_WITH_FIELD_NAME
}
