package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzadz extends zzadp {
    public static final Parcelable.Creator<zzadz> CREATOR = new zzady();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzadz(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzew.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadz.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadz zzadzVar = (zzadz) obj;
            if (this.zzf.equals(zzadzVar.zzf) && zzew.zzU(this.zza, zzadzVar.zza) && zzew.zzU(this.zzb, zzadzVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i = hashCode * 31;
        String str2 = this.zzb;
        return ((i + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zzb;
        return str + ": url=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzadz(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
