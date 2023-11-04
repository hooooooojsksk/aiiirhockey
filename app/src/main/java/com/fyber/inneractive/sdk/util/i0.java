package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class i0 extends Handler {
    public final WeakReference<j0> a;

    public i0(Looper looper, j0 j0Var) {
        super(looper);
        this.a = new WeakReference<>(j0Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        j0 j0Var = (j0) q.a(this.a);
        if (j0Var != null) {
            j0Var.handleMessage(message);
        }
    }
}
