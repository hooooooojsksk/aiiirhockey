package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzada extends zzadp {
    public static final Parcelable.Creator<zzada> CREATOR = new zzacz();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzada(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzada zzadaVar = (zzada) obj;
            if (this.zzc == zzadaVar.zzc && zzew.zzU(this.zza, zzadaVar.zza) && zzew.zzU(this.zzb, zzadaVar.zzb) && Arrays.equals(this.zzd, zzadaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc + 527;
        String str = this.zza;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = i * 31;
        String str2 = this.zzb;
        return ((((i2 + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzadp, com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        zzbkVar.zza(this.zzd, this.zzc);
    }

    public zzada(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
