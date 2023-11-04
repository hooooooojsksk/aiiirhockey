package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.SpliceScheduleCommand;

/* loaded from: assets/audience_network.dex */
public class DV implements Parcelable.Creator<SpliceScheduleCommand> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SpliceScheduleCommand[] newArray(int i) {
        return new SpliceScheduleCommand[i];
    }
}
