package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class KW {
    public static AdError A00(JA ja) {
        if (ja.A03().isPublicError()) {
            return new AdError(ja.A03().getErrorCode(), ja.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
