package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzur {
    public final int zzc;
    private final zzfqk zze;
    private int zzf;
    public static final zzur zza = new zzur(new zzcp[0]);
    private static final String zzd = zzew.zzP(0);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzuq
    };

    public zzur(zzcp... zzcpVarArr) {
        this.zze = zzfqk.zzn(zzcpVarArr);
        this.zzc = zzcpVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzcp) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzee.zzc("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzur zzurVar = (zzur) obj;
            if (this.zzc == zzurVar.zzc && this.zze.equals(zzurVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i == 0) {
            int hashCode = this.zze.hashCode();
            this.zzf = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzcp zzcpVar) {
        int indexOf = this.zze.indexOf(zzcpVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcp zzb(int i) {
        return (zzcp) this.zze.get(i);
    }
}
