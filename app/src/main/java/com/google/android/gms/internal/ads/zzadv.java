package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzadv extends zzadp {
    public static final Parcelable.Creator<zzadv> CREATOR = new zzadu();
    public final String zza;
    public final byte[] zzb;

    public zzadv(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzew.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzew.zzH(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadv zzadvVar = (zzadv) obj;
            if (zzew.zzU(this.zza, zzadvVar.zza) && Arrays.equals(this.zzb, zzadvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        return str + ": owner=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzadv(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
