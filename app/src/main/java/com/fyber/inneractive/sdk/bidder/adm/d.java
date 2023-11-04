package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.a0;

/* loaded from: classes.dex */
public class d implements a0.a {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // com.fyber.inneractive.sdk.network.a0.a
    public void a(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1392135285:
                if (str.equals("sdkInitNetworkRequest")) {
                    c = 0;
                    break;
                }
                break;
            case 740780854:
                if (str.equals("sdkGotServerResponse")) {
                    c = 1;
                    break;
                }
                break;
            case 1745989196:
                if (str.equals("sdkParsedResponse")) {
                    c = 2;
                    break;
                }
                break;
            case 1903994790:
                if (str.equals("sdkRequestEndedButWillBeRetried")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                com.fyber.inneractive.sdk.metrics.c cVar = com.fyber.inneractive.sdk.metrics.c.d;
                cVar.a(this.a.d).f();
                cVar.b(this.a.d).b();
                return;
            case 1:
                com.fyber.inneractive.sdk.metrics.c.d.a(this.a.d).h();
                return;
            case 2:
                com.fyber.inneractive.sdk.metrics.c.d.a(this.a.d).d();
                return;
            case 3:
                com.fyber.inneractive.sdk.metrics.c.d.b(this.a.d).b("retrying");
                return;
            default:
                return;
        }
    }
}
