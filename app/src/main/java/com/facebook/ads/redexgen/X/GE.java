package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride;

/* loaded from: assets/audience_network.dex */
public class GE implements Parcelable.Creator<DefaultTrackSelector$SelectionOverride> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DefaultTrackSelector$SelectionOverride createFromParcel(Parcel parcel) {
        return new DefaultTrackSelector$SelectionOverride(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DefaultTrackSelector$SelectionOverride[] newArray(int i) {
        return new DefaultTrackSelector$SelectionOverride[i];
    }
}
