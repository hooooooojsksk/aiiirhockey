package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;

/* loaded from: assets/audience_network.dex */
public class DQ implements Parcelable.Creator<UrlLinkFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final UrlLinkFrame createFromParcel(Parcel parcel) {
        return new UrlLinkFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final UrlLinkFrame[] newArray(int i) {
        return new UrlLinkFrame[i];
    }
}
