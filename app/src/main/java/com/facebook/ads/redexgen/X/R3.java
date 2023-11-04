package com.facebook.ads.redexgen.X;

import cz.msebera.android.httpclient.HttpStatus;

/* loaded from: assets/audience_network.dex */
public class R3 extends C8V<AnonymousClass72> {
    public final /* synthetic */ AnonymousClass75 A00;

    public R3(AnonymousClass75 anonymousClass75) {
        this.A00 = anonymousClass75;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A00 */
    public final void A03(AnonymousClass72 anonymousClass72) {
        int A00 = anonymousClass72.A00();
        int duration = anonymousClass72.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + HttpStatus.SC_INTERNAL_SERVER_ERROR;
        if (duration < currentPosition3) {
            if (duration == 0) {
                AnonymousClass75 anonymousClass75 = this.A00;
                int currentPosition4 = anonymousClass75.A00;
                anonymousClass75.A0d(currentPosition4);
                return;
            }
            this.A00.A0d(duration);
            return;
        }
        this.A00.A0d(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    public final Class<AnonymousClass72> A01() {
        return AnonymousClass72.class;
    }
}
