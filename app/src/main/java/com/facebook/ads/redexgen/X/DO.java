package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;

/* loaded from: assets/audience_network.dex */
public class DO implements Parcelable.Creator<PrivFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final PrivFrame createFromParcel(Parcel parcel) {
        return new PrivFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final PrivFrame[] newArray(int i) {
        return new PrivFrame[i];
    }
}
