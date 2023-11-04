package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Ah */
/* loaded from: assets/audience_network.dex */
public final class C0327Ah implements InterfaceC0798To {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0327Ah(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0519Io
    public final void AA4() {
        C0547Js.A00(new C0794Tk(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0519Io
    public final void AA8() {
        C0547Js.A00(new C0795Tl(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0519Io
    public final void AAv(JA ja) {
        C0547Js.A00(new C0797Tn(this, ja));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0519Io
    public final void ABb() {
        C0547Js.A00(new C0793Tj(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0798To
    public final void ABg() {
        C0547Js.A00(new C0796Tm(this));
    }
}
