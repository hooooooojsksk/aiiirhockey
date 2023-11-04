package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceInsertCommand;

/* loaded from: assets/audience_network.dex */
public class DS implements Parcelable.Creator<SpliceInsertCommand> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SpliceInsertCommand createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SpliceInsertCommand[] newArray(int i) {
        return new SpliceInsertCommand[i];
    }
}
