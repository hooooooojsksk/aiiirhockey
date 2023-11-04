package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.loopj.android.http.AsyncHttpClient;

/* renamed from: com.facebook.ads.redexgen.X.Ut */
/* loaded from: assets/audience_network.dex */
public final class C0829Ut implements GI {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final GS A06;
    public final HG A07;

    public C0829Ut(GS gs) {
        this(gs, AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT, 25000, 25000, 0.75f, 0.75f, 2000L, HG.A00);
    }

    public C0829Ut(GS gs, int i, int i2, int i3, float f, float f2, long j, HG hg) {
        this.A06 = gs;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = hg;
    }

    @Override // com.facebook.ads.redexgen.X.GI
    /* renamed from: A00 */
    public final BD A4X(TrackGroup trackGroup, int... iArr) {
        return new BD(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
