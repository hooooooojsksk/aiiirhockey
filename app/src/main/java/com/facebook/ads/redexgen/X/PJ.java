package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class PJ extends ContentObserver {
    public final PT A00;

    public PJ(Handler handler, PT pt) {
        super(handler);
        this.A00 = pt;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0Z();
    }
}
