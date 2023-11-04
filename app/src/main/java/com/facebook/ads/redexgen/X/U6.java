package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* loaded from: assets/audience_network.dex */
public class U6 implements InterfaceC0524It {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ U1 A01;

    public U6(U1 u1, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = u1;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0524It
    public final void AEx() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0524It
    public final void AF2(NativeAd nativeAd) {
        this.A01.A0I(C0799Tp.A0L(nativeAd.getInternalNativeAd()), new U2(C0799Tp.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0524It
    public final void AFh() {
        this.A01.A0D();
    }
}
