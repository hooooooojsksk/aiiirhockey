package org.cocos2dx.lib;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestHandle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cocos2dxDownloader.java */
/* loaded from: classes2.dex */
public class DownloadTask {
    long bytesReceived;
    byte[] data;
    RequestHandle handle = null;
    AsyncHttpResponseHandler handler = null;
    long totalBytesExpected;
    long totalBytesReceived;

    public DownloadTask() {
        resetStatus();
    }

    public void resetStatus() {
        this.bytesReceived = 0L;
        this.totalBytesReceived = 0L;
        this.totalBytesExpected = 0L;
        this.data = null;
    }
}
