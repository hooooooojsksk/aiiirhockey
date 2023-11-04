package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WW implements InterfaceC0351Bh {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final void A5X(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final int AEW(BW bw, int i, boolean z) throws IOException, InterruptedException {
        int AFG = bw.AFG(i);
        if (AFG == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AFG;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final void AEX(C0483Hc c0483Hc, int i) {
        c0483Hc.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final void AEY(long j, int i, int i2, int i3, C0350Bg c0350Bg) {
    }
}
