package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.9l */
/* loaded from: assets/audience_network.dex */
public final class C03069l {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC03049j A0A;
    public final InterfaceC03059k A0B;
    public final AbstractC03149u A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C03069l(InterfaceC03049j interfaceC03049j, InterfaceC03059k interfaceC03059k, AbstractC03149u abstractC03149u, int i, Handler handler) {
        this.A0A = interfaceC03049j;
        this.A0B = interfaceC03059k;
        this.A0C = abstractC03149u;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC03059k A04() {
        return this.A0B;
    }

    public final C03069l A05() {
        HD.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            HD.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AEk(this);
        return this;
    }

    public final C03069l A06(int i) {
        HD.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final C03069l A07(@Nullable Object obj) {
        HD.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC03149u A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        HD.A04(this.A09);
        HD.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
