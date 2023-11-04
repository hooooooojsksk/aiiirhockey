package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* loaded from: assets/audience_network.dex */
public final class DW {
    public final int A00;
    public final long A01;

    public DW(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ DW(int i, long j, DV dv) {
        this(i, j);
    }

    public static DW A00(Parcel parcel) {
        return new DW(parcel.readInt(), parcel.readLong());
    }

    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
