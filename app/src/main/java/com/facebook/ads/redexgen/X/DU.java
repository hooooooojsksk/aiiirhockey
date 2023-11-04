package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceNullCommand;

/* loaded from: assets/audience_network.dex */
public class DU implements Parcelable.Creator<SpliceNullCommand> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SpliceNullCommand createFromParcel(Parcel parcel) {
        return new SpliceNullCommand();
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SpliceNullCommand[] newArray(int i) {
        return new SpliceNullCommand[i];
    }
}
