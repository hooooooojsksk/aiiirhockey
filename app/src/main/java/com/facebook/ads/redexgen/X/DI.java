package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;

/* loaded from: assets/audience_network.dex */
public class DI implements Parcelable.Creator<ChapterTocFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ChapterTocFrame createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ChapterTocFrame[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
