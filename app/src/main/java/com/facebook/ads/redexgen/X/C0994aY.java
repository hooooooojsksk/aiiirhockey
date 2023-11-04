package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.aY */
/* loaded from: assets/audience_network.dex */
public final class C0994aY implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C0994aY(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ADG(int i) throws C0993aX {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C0993aX {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C0993aX {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C0993aX {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
