package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class AY extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C0872Wn A01;

    public AY(C0872Wn c0872Wn, AudioTrack audioTrack) {
        this.A01 = c0872Wn;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
