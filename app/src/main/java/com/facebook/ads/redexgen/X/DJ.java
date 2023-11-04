package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;

/* loaded from: assets/audience_network.dex */
public class DJ implements Parcelable.Creator<CommentFrame> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final CommentFrame createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final CommentFrame[] newArray(int i) {
        return new CommentFrame[i];
    }
}
