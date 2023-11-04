package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35.PrivateCommand;

/* loaded from: assets/audience_network.dex */
public class DR implements Parcelable.Creator<PrivateCommand> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final PrivateCommand createFromParcel(Parcel parcel) {
        return new PrivateCommand(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final PrivateCommand[] newArray(int i) {
        return new PrivateCommand[i];
    }
}
