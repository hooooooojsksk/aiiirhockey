package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZK extends AbstractC00890o {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ ZI A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_ENEMYEXIT, 29, 17, 16, 10, 12, 17, 18, 18, 27, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public ZK(ZI zi) {
        this.A00 = zi;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A06 = false;
            interstitialAdExtendedListener = this.A00.A09;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C0425Es c0425Es;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        LD ld;
        C0425Es c0425Es2;
        C0425Es c0425Es3;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A06 = false;
        c0425Es = this.A00.A03;
        if (c0425Es != null) {
            c0425Es2 = this.A00.A03;
            c0425Es2.A0O(new ZL(this));
            c0425Es3 = this.A00.A03;
            c0425Es3.A0J();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDismissed(anonymousClass20.A01());
        ld = this.A00.A05;
        ld.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDisplayed(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        this.A00.A08.A0E().A2Y();
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onAdClicked(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onLoggingImpression(anonymousClass20.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
        if (r4 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
        r5 = new com.facebook.ads.redexgen.X.KU();
        r3 = r6.A00.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A07();
        r0 = r6.A00.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r5.A09(r3, r1, r0.A0f()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
        r5.A08(r6.A00.A08, true);
        r4 = r6.A00;
        r3 = r4.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A09();
        r0 = r6.A00.A0A;
        r4.A01 = r5.A06(r3, r1, r0.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
        r5.A08(r6.A00.A08, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0148, code lost:
        if (r4 > 0) goto L16;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(com.facebook.ads.redexgen.X.InterfaceC00880n r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZK.A0F(com.facebook.ads.redexgen.X.0n):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0G(JA ja) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass20 anonymousClass20;
        C0R A0E = this.A00.A08.A0E();
        j = this.A00.A00;
        A0E.A2b(LC.A01(j), ja.A03().getErrorCode(), ja.A04());
        interstitialAdExtendedListener = this.A00.A09;
        anonymousClass20 = this.A00.A0A;
        interstitialAdExtendedListener.onError(anonymousClass20.A01(), KW.A00(ja));
    }
}
