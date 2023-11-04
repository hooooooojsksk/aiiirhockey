package com.facebook.ads.redexgen.X;

import com.google.android.gms.games.GamesStatusCodes;

/* renamed from: com.facebook.ads.redexgen.X.2N */
/* loaded from: assets/audience_network.dex */
public final class C2N extends AbstractC0336Aq {
    public final int A00;
    public final int A01;
    public final InterfaceC0474Gt<? super GX> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C2N(String str, InterfaceC0474Gt<? super GX> interfaceC0474Gt) {
        this(str, interfaceC0474Gt, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C2N(String str, InterfaceC0474Gt<? super GX> interfaceC0474Gt, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = interfaceC0474Gt;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0336Aq
    /* renamed from: A00 */
    public final C0338As A01(C0463Gi c0463Gi) {
        return new C0338As(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0463Gi);
    }
}
