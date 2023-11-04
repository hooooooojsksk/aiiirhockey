package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class UZ implements GX {
    public final int A00;
    public final GX A01;
    public final C0487Hg A02;

    public UZ(GX gx, C0487Hg c0487Hg, int i) {
        this.A01 = (GX) HD.A01(gx);
        this.A02 = (C0487Hg) HD.A01(c0487Hg);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    @Nullable
    public final Uri A7w() {
        return this.A01.A7w();
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADF(c0458Gb);
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
