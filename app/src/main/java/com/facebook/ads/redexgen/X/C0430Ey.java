package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.Ey */
/* loaded from: assets/audience_network.dex */
public class C0430Ey implements Parcelable.Creator<TrackGroupArray> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final TrackGroupArray createFromParcel(Parcel parcel) {
        return new TrackGroupArray(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final TrackGroupArray[] newArray(int i) {
        return new TrackGroupArray[i];
    }
}
