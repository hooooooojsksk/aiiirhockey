package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Xh */
/* loaded from: assets/audience_network.dex */
public class C0892Xh extends K1 {
    public final /* synthetic */ C6E A00;
    public final /* synthetic */ C6F A01;
    public final /* synthetic */ C6M A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C0892Xh(C6M c6m, ArrayList arrayList, C6E c6e, C6F c6f, ArrayList arrayList2) {
        this.A02 = c6m;
        this.A03 = arrayList;
        this.A00 = c6e;
        this.A01 = c6f;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        AtomicBoolean A0D;
        C7N c7n;
        Handler handler;
        C7N c7n2;
        long j;
        long j2;
        A0D = C6M.A0D(this.A03);
        c7n = this.A02.A04;
        if (c7n instanceof C0887Xc) {
            c7n2 = this.A02.A04;
            C0887Xc adContext = (C0887Xc) c7n2;
            if (A0D.get()) {
                C0R A0E = adContext.A0E();
                j2 = this.A02.A00;
                A0E.A3x(LC.A01(j2));
            } else {
                C0R A0E2 = adContext.A0E();
                j = this.A02.A00;
                A0E2.A3w(LC.A01(j));
            }
        }
        handler = this.A02.A02;
        handler.post(new C0893Xi(this, A0D));
        C6M.A0D(this.A04);
    }
}
