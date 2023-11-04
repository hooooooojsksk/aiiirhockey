package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.Sq */
/* loaded from: assets/audience_network.dex */
public final class C0775Sq extends N0 {
    @Nullable
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static final String A0C;
    public static final Set<String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C0887Xc A04;
    public C0621Mr A05;
    public InterfaceC0624Mu A06;
    public C0627Mx A07;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{83, 79, 79, 75, 49, 45, 45, 41, 42};
    }

    static {
        A08();
        A0C = C0775Sq.class.getSimpleName();
        A0D = new HashSet(2);
        A09 = false;
        A0A = false;
        A0D.add(A05(0, 4, 102));
        A0D.add(A05(4, 5, 4));
    }

    public C0775Sq(C0887Xc c0887Xc, Activity activity, InterfaceC0624Mu interfaceC0624Mu) {
        super(activity, c0887Xc);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c0887Xc, interfaceC0624Mu);
    }

    public C0775Sq(C0887Xc c0887Xc, InterfaceC0624Mu interfaceC0624Mu) {
        super(c0887Xc);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c0887Xc, interfaceC0624Mu);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    /* renamed from: A04 */
    public final C0627Mx A0E() {
        return new C0627Mx(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i, int i2, Intent intent) {
        if (A08 != null && i == 1001) {
            if (Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(C0887Xc c0887Xc, InterfaceC0624Mu interfaceC0624Mu) {
        this.A04 = c0887Xc;
        this.A06 = interfaceC0624Mu;
        this.A05 = new C0621Mr(this);
        A09 = IL.A03(this.A04);
        A0A = IL.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        this.A07 = A0E();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.N0
    public final WebChromeClient A0D() {
        return new C0626Mw(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j) {
        if (this.A00 < 0) {
            this.A00 = j;
        }
        A07();
    }

    public final void A0G(long j) {
        if (this.A01 < 0) {
            this.A01 = j;
        }
        A07();
    }

    public final void A0H(long j) {
        if (this.A02 < 0) {
            this.A02 = j;
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.N0, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        N6.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC0625Mv interfaceC0625Mv) {
        this.A07.A04(new WeakReference<>(interfaceC0625Mv));
    }
}
