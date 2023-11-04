package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Ew */
/* loaded from: assets/audience_network.dex */
public class C0429Ew implements Parcelable.Creator<TrackGroup> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final TrackGroup createFromParcel(Parcel parcel) {
        return new TrackGroup(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final TrackGroup[] newArray(int i) {
        return new TrackGroup[i];
    }
}
