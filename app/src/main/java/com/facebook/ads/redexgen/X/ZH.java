package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZH extends AbstractC00890o {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ ZF A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public ZH(ZF zf) {
        this.A00 = zf;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0A;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0A;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        LD ld;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C02115j c02115j = (C02115j) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A02;
            c02115j.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c02115j.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
        ld = this.A00.A07;
        ld.A05();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        anonymousClass24 = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onAdClicked(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass24;
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        anonymousClass24 = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(anonymousClass24.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0F(InterfaceC00880n interfaceC00880n) {
        C0408Eb c0408Eb;
        AnonymousClass24 anonymousClass24;
        AnonymousClass24 anonymousClass242;
        C0408Eb c0408Eb2;
        C1B c1b;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass243;
        C1B c1b2;
        RewardedVideoAd rewardedVideoAd2;
        C1B c1b3;
        AnonymousClass24 anonymousClass244;
        RewardedVideoAd rewardedVideoAd3;
        C1B c1b4;
        AnonymousClass24 anonymousClass245;
        AnonymousClass24 anonymousClass246;
        AnonymousClass24 anonymousClass247;
        C1B c1b5;
        AnonymousClass24 anonymousClass248;
        c0408Eb = this.A00.A05;
        if (c0408Eb == null) {
            this.A00.A09.A07().A9C(A00(0, 3, 70), C02627s.A0N, new C02637t(A00(3, 18, 43)));
            return;
        }
        AbstractC0956Zw abstractC0956Zw = (AbstractC0956Zw) interfaceC00880n;
        anonymousClass24 = this.A00.A0B;
        if (anonymousClass24.A03 != null) {
            anonymousClass248 = this.A00.A0B;
            abstractC0956Zw.A02(anonymousClass248.A03);
        }
        anonymousClass242 = this.A00.A0B;
        int A0G = abstractC0956Zw.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        anonymousClass242.A00 = A0G;
        this.A00.A08 = true;
        ZF zf = this.A00;
        c0408Eb2 = zf.A05;
        zf.A04 = c0408Eb2.A0F();
        c1b = this.A00.A04;
        if (c1b != null) {
            int i = 0;
            c1b4 = this.A00.A04;
            if (!c1b4.A0Z()) {
                c1b5 = this.A00.A04;
                i = ((AbstractC0952Zs) c1b5).A0f();
            }
            if (i > 0) {
                KU chainer = new KU();
                C0887Xc c0887Xc = this.A00.A09;
                anonymousClass245 = this.A00.A0B;
                if (chainer.A09(c0887Xc, anonymousClass245.A06, i)) {
                    chainer.A08(this.A00.A09, true);
                    ZF zf2 = this.A00;
                    C0887Xc c0887Xc2 = zf2.A09;
                    anonymousClass246 = this.A00.A0B;
                    String str = anonymousClass246.A0C;
                    anonymousClass247 = this.A00.A0B;
                    zf2.A03 = chainer.A07(c0887Xc2, str, anonymousClass247.A06);
                } else {
                    ZF zf3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        chainer.A08(zf3.A09, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        chainer.A08(zf3.A09, false);
                    }
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0A;
            anonymousClass243 = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(anonymousClass243.A00());
            return;
        }
        c1b2 = this.A00.A04;
        ((AbstractC0952Zs) c1b2).A0r(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c1b3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c1b3.A0F());
        anonymousClass244 = this.A00.A0B;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(anonymousClass244.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.1z
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(com.facebook.ads.Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(com.facebook.ads.Ad ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass24 anonymousClass249;
                s2SRewardedVideoAdExtendedListener2 = ZH.this.A00.A0A;
                anonymousClass249 = ZH.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass249.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(com.facebook.ads.Ad ad, AdError adError) {
                C1B c1b6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                AnonymousClass24 anonymousClass249;
                ZH.this.A00.A03 = null;
                c1b6 = ZH.this.A00.A04;
                ((AbstractC0952Zs) c1b6).A0r(false);
                s2SRewardedVideoAdExtendedListener2 = ZH.this.A00.A0A;
                anonymousClass249 = ZH.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(anonymousClass249.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(com.facebook.ads.Ad ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                LD ld;
                s2SRewardedVideoAdExtendedListener2 = ZH.this.A00.A0A;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
                ld = ZH.this.A00.A07;
                ld.A05();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = ZH.this.A00.A0A;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00890o
    public final void A0G(JA ja) {
        AnonymousClass24 anonymousClass24;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        AnonymousClass24 anonymousClass242;
        this.A00.A0E(true);
        anonymousClass24 = this.A00.A0B;
        C0R A0E = anonymousClass24.A0B.A0E();
        j = this.A00.A01;
        A0E.A2b(LC.A01(j), ja.A03().getErrorCode(), ja.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A0A;
        anonymousClass242 = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onError(anonymousClass242.A00(), KW.A00(ja));
    }
}
