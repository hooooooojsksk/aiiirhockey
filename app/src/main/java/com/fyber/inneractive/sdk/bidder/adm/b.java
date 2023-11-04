package com.fyber.inneractive.sdk.bidder.adm;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.adm.f;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;

/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ f.a a;
    public final /* synthetic */ f b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Exception a;

        public a(Exception exc) {
            b.this = r1;
            this.a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.a aVar = b.this.a;
            if (aVar != null) {
                ((r.a) aVar).a(this.a, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
            }
        }
    }

    public b(f fVar, f.a aVar) {
        this.b = fVar;
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.b.a = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.b.b, 0));
            f.a(this.b, this.a);
        } catch (Exception e) {
            IAlog.e("failed to parse ad markup payload %s", e.getMessage());
            m.b.post(new a(e));
        }
    }
}
