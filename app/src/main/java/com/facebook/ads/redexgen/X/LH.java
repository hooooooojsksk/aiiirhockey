package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public final class LH {
    public static PK A00(VideoStartReason videoStartReason) {
        int i = LG.A00[videoStartReason.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return PK.A03;
                }
                return PK.A04;
            }
            return PK.A03;
        }
        return PK.A02;
    }
}
