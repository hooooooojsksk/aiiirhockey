package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-auth@@20.3.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbu */
/* loaded from: classes2.dex */
public final class zbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbu> CREATOR = new zbv();
    private final Credential zba;

    public zbu(Credential credential) {
        this.zba = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zba, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
