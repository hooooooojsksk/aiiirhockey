package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzacw implements zzbp {
    public static final Parcelable.Creator<zzacw> CREATOR = new zzacv();
    public final String zza;
    public final String zzb;

    public zzacw(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzew.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    public zzacw(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
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
            zzacw zzacwVar = (zzacw) obj;
            if (this.zza.equals(zzacwVar.zza) && this.zzb.equals(zzacwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "VC: " + str + "=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zzbkVar.zzq(this.zzb);
        } else if (c == 1) {
            zzbkVar.zze(this.zzb);
        } else if (c == 2) {
            zzbkVar.zzd(this.zzb);
        } else if (c == 3) {
            zzbkVar.zzc(this.zzb);
        } else if (c != 4) {
        } else {
            zzbkVar.zzh(this.zzb);
        }
    }
}
