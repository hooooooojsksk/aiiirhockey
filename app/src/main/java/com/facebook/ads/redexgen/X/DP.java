package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;

/* loaded from: assets/audience_network.dex */
public class DP implements Parcelable.Creator<TextInformationFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final TextInformationFrame createFromParcel(Parcel parcel) {
        return new TextInformationFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final TextInformationFrame[] newArray(int i) {
        return new TextInformationFrame[i];
    }
}
