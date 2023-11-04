package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ug */
/* loaded from: assets/audience_network.dex */
public final class C0816Ug implements GW {
    public final InterfaceC0474Gt<? super C0817Uh> A00;

    public C0816Ug() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C0816Ug(InterfaceC0474Gt<? super C0817Uh> interfaceC0474Gt) {
        this.A00 = interfaceC0474Gt;
    }

    @Override // com.facebook.ads.redexgen.X.GW
    public final GX A4H() {
        return new C0817Uh(this.A00);
    }
}
