package cz.msebera.android.httpclient.impl.client.cache;

/* loaded from: classes2.dex */
public interface FailureCache {
    int getErrorCount(String str);

    void increaseErrorCount(String str);

    void resetErrorCount(String str);
}
