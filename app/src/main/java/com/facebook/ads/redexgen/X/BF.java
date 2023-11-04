package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.redexgen.X.BG;

@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public interface BF<T extends BG> {
    BE<T> A2Q(Looper looper, DrmInitData drmInitData);

    boolean A3y(DrmInitData drmInitData);

    void AEA(BE<T> be);
}
