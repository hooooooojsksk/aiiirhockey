package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;

/* loaded from: assets/audience_network.dex */
public class DH implements Parcelable.Creator<ChapterFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ChapterFrame createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ChapterFrame[] newArray(int i) {
        return new ChapterFrame[i];
    }
}
