package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* loaded from: classes.dex */
public class f extends com.fyber.inneractive.sdk.response.e {
    public String I;

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest) {
        if (this.I == null) {
            return InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, s sVar) {
        if (this.I == null) {
            return InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        return null;
    }
}
