package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Av */
/* loaded from: assets/audience_network.dex */
public class HandlerC0341Av extends Handler {
    public final /* synthetic */ C0862Wd A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                this.A00.A0B(obj, obj2);
            } else if (i != 1) {
            } else {
                this.A00.A0A(obj, obj2);
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Av != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostResponseHandler */
    public HandlerC0341Av(C0862Wd c0862Wd, Looper looper) {
        super(looper);
        this.A00 = c0862Wd;
    }
}
