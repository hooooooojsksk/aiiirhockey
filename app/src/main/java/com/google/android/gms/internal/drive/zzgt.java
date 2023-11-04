package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.drive.DriveId;

/* loaded from: classes2.dex */
public final class zzgt implements Parcelable.Creator<zzgs> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzgs[] newArray(int i) {
        return new zzgs[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzgs createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        DriveId driveId = null;
        com.google.android.gms.drive.events.zzt zztVar = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                driveId = (DriveId) SafeParcelReader.createParcelable(parcel, readHeader, DriveId.CREATOR);
            } else if (fieldId == 3) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 4) {
                zztVar = (com.google.android.gms.drive.events.zzt) SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.zzt.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzgs(driveId, i, zztVar);
    }
}
