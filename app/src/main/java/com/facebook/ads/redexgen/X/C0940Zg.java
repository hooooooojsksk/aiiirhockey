package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Zg */
/* loaded from: assets/audience_network.dex */
public class C0940Zg implements C6E {
    public final C1X A00;
    public final InterfaceC01121l A01;
    public final C6M A02;
    public final C0887Xc A03;
    public final boolean A04;

    public C0940Zg(C0887Xc c0887Xc, InterfaceC01121l interfaceC01121l, C6M c6m, C1X c1x, boolean z) {
        this.A03 = c0887Xc;
        this.A01 = interfaceC01121l;
        this.A02 = c6m;
        this.A00 = c1x;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C01131m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == C1Y.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z) {
            C6M c6m = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c6m.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.AC0();
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAT() {
        if (this.A04) {
            this.A01.ABz(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final void AAb() {
        A01(true);
    }
}
