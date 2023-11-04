package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class IF {
    @Nullable
    public final Handler A00;
    @Nullable
    public final IG A01;

    public IF(@Nullable Handler handler, @Nullable IG ig) {
        this.A00 = ig != null ? (Handler) HD.A01(handler) : null;
        this.A01 = ig;
    }

    public final void A01(int i, int i2, int i3, float f) {
        if (this.A01 != null) {
            this.A00.post(new IC(this, i, i2, i3, f));
        }
    }

    public final void A02(int i, long j) {
        if (this.A01 != null) {
            this.A00.post(new IB(this, i, j));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new ID(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new IA(this, format));
        }
    }

    public final void A05(C0335Ap c0335Ap) {
        if (this.A01 != null) {
            this.A00.post(new IE(this, c0335Ap));
        }
    }

    public final void A06(C0335Ap c0335Ap) {
        if (this.A01 != null) {
            this.A00.post(new I8(this, c0335Ap));
        }
    }

    public final void A07(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new I9(this, str, j, j2));
        }
    }
}
