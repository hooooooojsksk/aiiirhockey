package org.cocos2dx.lib;

import java.util.concurrent.CountDownLatch;

/* compiled from: Cocos2dxWebView.java */
/* loaded from: classes2.dex */
class ShouldStartLoadingWorker implements Runnable {
    private CountDownLatch mLatch;
    private boolean[] mResult;
    private final String mUrlString;
    private final int mViewTag;

    public ShouldStartLoadingWorker(CountDownLatch countDownLatch, boolean[] zArr, int i, String str) {
        this.mLatch = countDownLatch;
        this.mResult = zArr;
        this.mViewTag = i;
        this.mUrlString = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mResult[0] = Cocos2dxWebViewHelper._shouldStartLoading(this.mViewTag, this.mUrlString);
        this.mLatch.countDown();
    }
}
