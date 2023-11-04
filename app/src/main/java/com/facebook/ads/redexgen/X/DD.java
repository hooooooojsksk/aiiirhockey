package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;

/* loaded from: assets/audience_network.dex */
public class DD implements Parcelable.Creator<EventMessage> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final EventMessage createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final EventMessage[] newArray(int i) {
        return new EventMessage[i];
    }
}
