package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* loaded from: assets/audience_network.dex */
public class AZ extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C0872Wn A01;

    public AZ(C0872Wn c0872Wn, AudioTrack audioTrack) {
        this.A01 = c0872Wn;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
