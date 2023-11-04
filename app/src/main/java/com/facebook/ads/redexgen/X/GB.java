package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* loaded from: assets/audience_network.dex */
public class GB implements Parcelable.Creator<DefaultTrackSelector$Parameters> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DefaultTrackSelector$Parameters createFromParcel(Parcel parcel) {
        return new DefaultTrackSelector$Parameters(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DefaultTrackSelector$Parameters[] newArray(int i) {
        return new DefaultTrackSelector$Parameters[i];
    }
}
