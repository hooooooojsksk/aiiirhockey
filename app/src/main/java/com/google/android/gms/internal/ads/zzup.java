package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzup {
    private int zza;
    private final SparseArray zzb;
    private final zzdp zzc;

    public zzup() {
        zzuo zzuoVar = new zzdp() { // from class: com.google.android.gms.internal.ads.zzuo
        };
        throw null;
    }

    public final Object zzb() {
        SparseArray sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        if (this.zza == -1) {
            zzdl.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            SparseArray sparseArray = this.zzb;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzdl.zzd(i >= keyAt);
            if (keyAt == i) {
                SparseArray sparseArray2 = this.zzb;
                zzui.zzl((zzug) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzui.zzl((zzug) this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.zzb.keyAt(i3)) {
                return;
            }
            zzui.zzl((zzug) this.zzb.valueAt(i2));
            this.zzb.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzup(zzdp zzdpVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdpVar;
        this.zza = -1;
    }

    public final Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 > 0 && i < this.zzb.keyAt(i2)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }
}
