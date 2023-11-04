package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;

/* loaded from: assets/audience_network.dex */
public class DF implements Parcelable.Creator<ApicFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ApicFrame[] newArray(int i) {
        return new ApicFrame[i];
    }
}
