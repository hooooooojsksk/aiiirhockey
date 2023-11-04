package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayerEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: zza */
    public PlayerEntity createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        zzv zzvVar = null;
        zza zzaVar = null;
        String str10 = null;
        long j3 = -1;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 14:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) SafeParcelReader.createParcelable(parcel, readHeader, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) SafeParcelReader.createParcelable(parcel, readHeader, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 20:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 21:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 22:
                    uri3 = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                case 23:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 24:
                    uri4 = (Uri) SafeParcelReader.createParcelable(parcel, readHeader, Uri.CREATOR);
                    break;
                case 25:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 29:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 33:
                    zzvVar = (zzv) SafeParcelReader.createParcelable(parcel, readHeader, zzv.CREATOR);
                    break;
                case 35:
                    zzaVar = (zza) SafeParcelReader.createParcelable(parcel, readHeader, zza.CREATOR);
                    break;
                case 36:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 37:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PlayerEntity(str, str2, uri, uri2, j, i, j2, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z, z2, str6, str7, uri3, str8, uri4, str9, j3, zzvVar, zzaVar, z3, str10);
    }
}
