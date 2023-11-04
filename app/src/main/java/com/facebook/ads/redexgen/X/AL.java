package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class AL {
    @Nullable
    public final Handler A00;
    @Nullable
    public final AM A01;

    public AL(@Nullable Handler handler, @Nullable AM am) {
        this.A00 = am != null ? (Handler) HD.A01(handler) : null;
        this.A01 = am;
    }

    public final void A01(int i) {
        if (this.A01 != null) {
            this.A00.post(new AK(this, i));
        }
    }

    public final void A02(int i, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new AI(this, i, j, j2));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new AH(this, format));
        }
    }

    public final void A04(C0335Ap c0335Ap) {
        if (this.A01 != null) {
            this.A00.post(new AJ(this, c0335Ap));
        }
    }

    public final void A05(C0335Ap c0335Ap) {
        if (this.A01 != null) {
            this.A00.post(new AF(this, c0335Ap));
        }
    }

    public final void A06(String str, long j, long j2) {
        if (this.A01 != null) {
            this.A00.post(new AG(this, str, j, j2));
        }
    }
}
