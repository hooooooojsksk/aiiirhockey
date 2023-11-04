package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.TimeSignalCommand;

/* loaded from: assets/audience_network.dex */
public class DY implements Parcelable.Creator<TimeSignalCommand> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final TimeSignalCommand createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final TimeSignalCommand[] newArray(int i) {
        return new TimeSignalCommand[i];
    }
}
