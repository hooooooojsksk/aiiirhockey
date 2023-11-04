package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.f;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.r;

/* loaded from: classes.dex */
public class e implements Runnable {
    public final /* synthetic */ f.a a;

    public e(f fVar, f.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a aVar = this.a;
        if (aVar != null) {
            ((r.a) aVar).a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
