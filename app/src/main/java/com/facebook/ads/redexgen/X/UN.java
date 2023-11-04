package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class UN implements HG {
    @Override // com.facebook.ads.redexgen.X.HG
    public final HQ A4M(Looper looper, @Nullable Handler.Callback callback) {
        return new UM(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.HG
    public final long A5B() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.HG
    public final long AFm() {
        return SystemClock.uptimeMillis();
    }
}
