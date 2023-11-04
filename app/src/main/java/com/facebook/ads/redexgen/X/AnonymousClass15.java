package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.15 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass15 extends BroadcastReceiver {
    public static String[] A03 = {"JgmY627JJ4fVvMUsUI7dBJzvca", "2Fivc7ze9Y6M7vLBAhVCw66dd2zEUTp", "oqNyJxLxp23hnAfKGRpFUMlaCTnSy4au", "HRO7fC4J0U3bXqsrOiWljP6J940cuLTJ", "rhEs9JkkityiMJcgD18RNPKtdGmllPs6", "c8I5EiJJKjWgwuyghylYWruaZ4nXJiut", "YeKDqRnNq5JcEGU0HYsnt6sxK1D4K6hE", "zIQMBMVVQmczFglCifMrZtV9RNUhKeCf"};
    public AbstractC0956Zw A00;
    public AnonymousClass14 A01;
    public String A02;

    public AnonymousClass15(String str, AbstractC0956Zw abstractC0956Zw, AnonymousClass14 anonymousClass14) {
        this.A00 = abstractC0956Zw;
        this.A01 = anonymousClass14;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PN.A06.A03(this.A02));
        intentFilter.addAction(PN.A09.A03(this.A02));
        intentFilter.addAction(PN.A04.A03(this.A02));
        intentFilter.addAction(PN.A0A.A03(this.A02));
        intentFilter.addAction(PN.A05.A03(this.A02));
        intentFilter.addAction(PN.A0C.A03(this.A02));
        intentFilter.addAction(PN.A0B.A03(this.A02));
        intentFilter.addAction(PN.A03.A03(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        PN pn = PN.A06;
        String action2 = this.A02;
        if (pn.A03(action2).equals(action)) {
            AnonymousClass14 anonymousClass14 = this.A01;
            AbstractC0956Zw abstractC0956Zw = this.A00;
            String action3 = A03[1];
            if (action3.length() != 11) {
                A03[0] = "z37hhVYNur1y5njE4t22VYTMbB";
                anonymousClass14.ACS(abstractC0956Zw);
                return;
            }
        } else {
            PN pn2 = PN.A09;
            String action4 = this.A02;
            if (pn2.A03(action4).equals(action)) {
                boolean A1P = IK.A1P(context);
                String[] strArr = A03;
                if (strArr[3].charAt(16) != strArr[4].charAt(16)) {
                    A03[0] = "a2nbOp8yH430aeg70B0MHQFnwN";
                    if (A1P) {
                        AnonymousClass14 anonymousClass142 = this.A01;
                        AbstractC0956Zw abstractC0956Zw2 = this.A00;
                        AdError adError = AdError.AD_PRESENTATION_ERROR;
                        String[] strArr2 = A03;
                        if (strArr2[3].charAt(16) != strArr2[4].charAt(16)) {
                            String[] strArr3 = A03;
                            strArr3[2] = "Smm3aT6IchFgLH9ob00fwQqxHFnPPG6O";
                            strArr3[5] = "wzZfDEncWZ9M4YUYJFr8Gzf2lfnMb6hd";
                            anonymousClass142.ACT(abstractC0956Zw2, adError);
                            return;
                        }
                        String[] strArr4 = A03;
                        strArr4[6] = "douVyTcHxmEKv1YyJqQbVTsvWWCOpXBn";
                        strArr4[7] = "x6yn97aV8hj96Z0WREVv4HAdEeLr9VIY";
                        anonymousClass142.ACT(abstractC0956Zw2, adError);
                        return;
                    }
                    this.A01.ACT(this.A00, AdError.INTERNAL_ERROR);
                    return;
                }
            } else {
                PN pn3 = PN.A04;
                String action5 = this.A02;
                if (pn3.A03(action5).equals(action)) {
                    this.A01.ACP(this.A00);
                    return;
                }
                PN pn4 = PN.A0A;
                String action6 = this.A02;
                if (pn4.A03(action6).equals(action)) {
                    this.A01.ACR(this.A00);
                    return;
                }
                PN pn5 = PN.A05;
                String action7 = this.A02;
                if (pn5.A03(action7).equals(action)) {
                    this.A01.onRewardedVideoClosed();
                    return;
                }
                PN pn6 = PN.A0B;
                String action8 = this.A02;
                if (pn6.A03(action8).equals(action)) {
                    this.A01.ACN(this.A00);
                    return;
                }
                PN pn7 = PN.A0C;
                String action9 = this.A02;
                if (pn7.A03(action9).equals(action)) {
                    this.A01.ACO(this.A00);
                    return;
                }
                PN pn8 = PN.A03;
                String action10 = this.A02;
                if (!pn8.A03(action10).equals(action)) {
                    return;
                }
                this.A01.onRewardedVideoActivityDestroyed();
                return;
            }
        }
        throw new RuntimeException();
    }
}
