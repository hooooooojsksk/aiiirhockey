package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: assets/audience_network.dex */
public final class UM implements HQ {
    public final Handler A00;

    public UM(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final Looper A72() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final Message A9w(int i, int i2, int i3) {
        return this.A00.obtainMessage(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final Message A9x(int i, int i2, int i3, Object obj) {
        return this.A00.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final Message A9y(int i, Object obj) {
        return this.A00.obtainMessage(i, obj);
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final void AEE(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final boolean AEi(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final boolean AEj(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }
}
