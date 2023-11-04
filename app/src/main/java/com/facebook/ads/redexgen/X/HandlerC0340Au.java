package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Au */
/* loaded from: assets/audience_network.dex */
public class HandlerC0340Au extends Handler {
    public static String[] A01 = {"19chgsqBzMImuF0gwnX2kWBGh", "0va0RllBKLagHwkqX9d70BpModZgILa7", "XpojMROpw9tVkn", "wcizW", "UvDBMI562EynJYmanZ8wO6TzDmvB3zda", "jZLpPncA8U18qC4rrohpR2MIc", "dSPbX", "wnd1v8XwPzGQd7q91R22pRoLt2u"};
    public final /* synthetic */ C0862Wd A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A01(Message message) {
        int i;
        if (message.arg1 == 1) {
            int i2 = message.arg2 + 1;
            i = this.A00.A0D;
            if (i2 > i) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i2;
            sendMessageDelayed(obtain, A00(i2));
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (BL) obj);
                } else if (i != 1) {
                    throw new RuntimeException();
                } else {
                    Pair pair = (Pair) obj;
                    e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (BH) pair.first, (String) pair.second);
                }
            } catch (Exception e) {
                e = e;
                if (A01(message)) {
                    return;
                }
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Qv5YLOa2TifOFD04FKBpDBiu6ZOimxtA";
            strArr2[4] = "EvRrjcZjHPEeu1iGM0yZj3H6zHpxg3cX";
            C0548Jt.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Au != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC0340Au(C0862Wd c0862Wd, Looper looper) {
        super(looper);
        this.A00 = c0862Wd;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Au != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Au != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int i, Object obj, boolean z) {
        obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
    }
}
