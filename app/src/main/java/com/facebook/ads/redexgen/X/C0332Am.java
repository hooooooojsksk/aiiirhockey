package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* renamed from: com.facebook.ads.redexgen.X.Am */
/* loaded from: assets/audience_network.dex */
public final class C0332Am {
    public final MediaCodec.CryptoInfo.Pattern A00;
    public final MediaCodec.CryptoInfo A01;

    public C0332Am(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
        this.A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public void A00(int i, int i2) {
        this.A00.set(i, i2);
        this.A01.setPattern(this.A00);
    }
}
