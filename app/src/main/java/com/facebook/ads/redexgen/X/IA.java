package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IA implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ IF A01;

    public IA(IF r1, Format format) {
        this.A01 = r1;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IG ig;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            ig = this.A01.A01;
            ig.AD3(this.A00);
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
