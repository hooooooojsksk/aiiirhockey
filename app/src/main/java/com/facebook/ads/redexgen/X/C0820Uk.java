package com.facebook.ads.redexgen.X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.Uk */
/* loaded from: assets/audience_network.dex */
public final class C0820Uk implements GW {
    public final Context A00;
    public final GW A01;
    public final InterfaceC0474Gt<? super GX> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C0820Uk(Context context, InterfaceC0474Gt<? super GX> interfaceC0474Gt, GW gw) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC0474Gt;
        this.A01 = gw;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C0820Uk(Context context, String str, InterfaceC0474Gt<? super GX> interfaceC0474Gt) {
        this(context, interfaceC0474Gt, new C2N(str, interfaceC0474Gt));
    }

    @Override // com.facebook.ads.redexgen.X.GW
    /* renamed from: A00 */
    public final C0821Ul A4H() {
        return new C0821Ul(this.A00, this.A02, this.A01.A4H());
    }
}
