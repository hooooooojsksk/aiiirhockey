package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

@SuppressLint({"HandlerLeak"})
/* loaded from: assets/audience_network.dex */
public class B5 extends Handler {
    public final /* synthetic */ C0861Wc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B5 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public B5(C0861Wc c0861Wc, Looper looper) {
        super(looper);
        this.A00 = c0861Wc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B5 != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wd != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        List<C0862Wd> list;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) msg.obj;
            list = this.A00.A09;
            for (C0862Wd c0862Wd : list) {
                if (c0862Wd.A0N(bArr)) {
                    c0862Wd.A0J(msg.what);
                    return;
                }
            }
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
