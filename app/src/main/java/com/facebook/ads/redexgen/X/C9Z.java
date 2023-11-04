package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9Z */
/* loaded from: assets/audience_network.dex */
public final class C9Z {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC03149u A03;
    public final ER A04;
    public final TrackGroupArray A05;
    public final GN A06;
    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C9Z(AbstractC03149u abstractC03149u, long j, TrackGroupArray trackGroupArray, GN gn) {
        this(abstractC03149u, null, new ER(0), j, -9223372036854775807L, 1, false, trackGroupArray, gn);
    }

    public C9Z(AbstractC03149u abstractC03149u, @Nullable Object obj, ER er, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, GN gn) {
        this.A03 = abstractC03149u;
        this.A07 = obj;
        this.A04 = er;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = gn;
    }

    public static void A00(C9Z c9z, C9Z c9z2) {
        c9z2.A0A = c9z.A0A;
        c9z2.A09 = c9z.A09;
    }

    public final C9Z A01(int i) {
        C9Z c9z = new C9Z(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c9z);
        return c9z;
    }

    public final C9Z A02(int i) {
        C9Z playbackInfo = new C9Z(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9Z A03(AbstractC03149u abstractC03149u, Object obj) {
        C9Z playbackInfo = new C9Z(abstractC03149u, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9Z A04(ER er, long j, long j2) {
        long j3 = j2;
        AbstractC03149u abstractC03149u = this.A03;
        Object obj = this.A07;
        if (!er.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C9Z(abstractC03149u, obj, er, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C9Z A05(TrackGroupArray trackGroupArray, GN gn) {
        C9Z playbackInfo = new C9Z(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, gn);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C9Z A06(boolean z) {
        C9Z playbackInfo = new C9Z(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
