package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* loaded from: assets/audience_network.dex */
public class B9 implements Parcelable.Creator<DrmInitData.SchemeData> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DrmInitData.SchemeData createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DrmInitData.SchemeData[] newArray(int i) {
        return new DrmInitData.SchemeData[i];
    }
}
