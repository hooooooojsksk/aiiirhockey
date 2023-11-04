package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;

/* loaded from: assets/audience_network.dex */
public class D6 implements Parcelable.Creator<Metadata> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final Metadata createFromParcel(Parcel parcel) {
        return new Metadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final Metadata[] newArray(int i) {
        return new Metadata[0];
    }
}
