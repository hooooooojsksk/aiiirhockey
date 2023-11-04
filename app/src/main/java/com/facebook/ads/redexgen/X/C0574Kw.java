package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Kw */
/* loaded from: assets/audience_network.dex */
public final class C0574Kw implements Closeable {
    @Nullable
    public C0573Kv A00;
    public boolean A01;
    public final C0572Ku A02;
    public final Runnable A03;

    public C0574Kw(long j, Runnable runnable) {
        this.A02 = new C0572Ku(j);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C0573Kv(this);
        }
    }

    public final C0572Ku A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C0573Kv(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C0573Kv executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
