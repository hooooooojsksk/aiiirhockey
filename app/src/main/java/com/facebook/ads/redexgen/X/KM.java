package com.facebook.ads.redexgen.X;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;

/* loaded from: assets/audience_network.dex */
public final class KM {
    public static final KM A04 = new KM(new TZ(), new TY());
    public final KL A02;
    public final LB A03;
    public boolean A01 = true;
    public long A00 = -1;

    @VisibleForTesting
    public KM(LB lb, KL kl) {
        this.A03 = lb;
        this.A02 = kl;
    }

    public static KM A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A4j();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A6y();
        boolean z = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (KM.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A4j() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
