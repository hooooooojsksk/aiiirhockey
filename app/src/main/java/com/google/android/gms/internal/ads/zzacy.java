package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzacy implements zzbp {
    public static final Parcelable.Creator<zzacy> CREATOR = new zzacx();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzacy(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzdl.zzd(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacy zzacyVar = (zzacy) obj;
            if (this.zza == zzacyVar.zza && zzew.zzU(this.zzb, zzacyVar.zzb) && zzew.zzU(this.zzc, zzacyVar.zzc) && zzew.zzU(this.zzd, zzacyVar.zzd) && this.zze == zzacyVar.zze && this.zzf == zzacyVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        String str = this.zzb;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = i * 31;
        String str2 = this.zzc;
        int hashCode2 = (((i2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i = this.zza;
        int i2 = this.zzf;
        return "IcyHeaders: name=\"" + str + "\", genre=\"" + str2 + "\", bitrate=" + i + ", metadataInterval=" + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzew.zzT(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        String str = this.zzc;
        if (str != null) {
            zzbkVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbkVar.zzi(str2);
        }
    }

    public zzacy(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzew.zzaa(parcel);
        this.zzf = parcel.readInt();
    }
}
