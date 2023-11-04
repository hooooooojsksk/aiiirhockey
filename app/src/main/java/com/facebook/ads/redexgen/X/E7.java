package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class E7 extends YL {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public E7(C5F c5f) {
        super(c5f);
    }

    @Override // com.facebook.ads.redexgen.X.YL, com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public final void A3t(String str) {
        if (this.A00.get() == null) {
            return;
        }
        C5F c5f = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c5f.A0D(str);
        String A02 = PN.A08.A02();
        String rewardedVideoError = PN.A09.A02();
        if (str.equals(A02)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.YL, com.facebook.ads.redexgen.X.InterfaceC0587Lj
    public final void A3u(String str, C8T c8t) {
        super.A3u(str, c8t);
    }
}
