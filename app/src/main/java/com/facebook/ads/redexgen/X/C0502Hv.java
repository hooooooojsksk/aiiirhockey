package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo;

/* renamed from: com.facebook.ads.redexgen.X.Hv */
/* loaded from: assets/audience_network.dex */
public class C0502Hv implements Parcelable.Creator<ColorInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ColorInfo createFromParcel(Parcel parcel) {
        return new ColorInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ColorInfo[] newArray(int i) {
        return new ColorInfo[0];
    }
}
