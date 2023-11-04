package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Um */
/* loaded from: assets/audience_network.dex */
public final class C0822Um implements GS, InterfaceC0474Gt<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    @Nullable
    public final Handler A06;
    @Nullable
    public final GR A07;
    public final HG A08;
    public final C0494Hn A09;

    public C0822Um() {
        this(null, null, 1000000L, 2000, HG.A00);
    }

    public C0822Um(@Nullable Handler handler, @Nullable GR gr, long j, int i, HG hg) {
        this.A06 = handler;
        this.A07 = gr;
        this.A09 = new C0494Hn(i);
        this.A08 = hg;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        Handler handler = this.A06;
        if (handler != null && this.A07 != null) {
            handler.post(new Gc(this, i, j, j2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final synchronized long A5q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0474Gt
    public final synchronized void AAS(Object obj, int i) {
        this.A02 += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
        if (r16.A04 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) goto L13;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0474Gt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void ACp(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r16
            monitor-enter(r4)
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            r9 = 1
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.facebook.ads.redexgen.X.HD.A04(r0)     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.HG r0 = r4.A08     // Catch: java.lang.Throwable -> L70
            long r2 = r0.A5B()     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A03     // Catch: java.lang.Throwable -> L70
            long r0 = r2 - r5
            int r11 = (int) r0     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A05     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A05 = r5     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A04     // Catch: java.lang.Throwable -> L70
            long r0 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A04 = r5     // Catch: java.lang.Throwable -> L70
            if (r11 <= 0) goto L59
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            r0 = 8000(0x1f40, double:3.9525E-320)
            long r5 = r5 * r0
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 / r0
            float r8 = (float) r5     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.Hn r7 = r4.A09     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            double r0 = (double) r5     // Catch: java.lang.Throwable -> L70
            double r5 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L70
            r7.A03(r0, r8)     // Catch: java.lang.Throwable -> L70
            long r7 = r4.A05     // Catch: java.lang.Throwable -> L70
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4e
            long r7 = r4.A04     // Catch: java.lang.Throwable -> L70
            r5 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L59
        L4e:
            com.facebook.ads.redexgen.X.Hn r1 = r4.A09     // Catch: java.lang.Throwable -> L70
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A02(r0)     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L70
            r4.A01 = r0     // Catch: java.lang.Throwable -> L70
        L59:
            long r12 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r14 = r4.A01     // Catch: java.lang.Throwable -> L70
            r10 = r4
            r10.A01(r11, r12, r14)     // Catch: java.lang.Throwable -> L70
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            int r0 = r0 - r9
            r4.A00 = r0     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L6a
            r4.A03 = r2     // Catch: java.lang.Throwable -> L70
        L6a:
            r0 = 0
            r4.A02 = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r4)
            return
        L70:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0822Um.ACp(java.lang.Object):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0474Gt
    public final synchronized void ACq(Object obj, C0458Gb c0458Gb) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5B();
        }
        this.A00++;
    }
}
