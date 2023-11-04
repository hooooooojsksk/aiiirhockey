package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzait implements zzaim {
    final /* synthetic */ zzaiv zza;
    private final zzem zzb = new zzem(new byte[4], 4);

    public zzait(zzaiv zzaivVar) {
        this.zza = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zza(zzen zzenVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (zzenVar.zzk() == 0 && (zzenVar.zzk() & 128) != 0) {
            zzenVar.zzG(6);
            int zza = zzenVar.zza() / 4;
            for (int i2 = 0; i2 < zza; i2++) {
                zzenVar.zzA(this.zzb, 4);
                int zzd = this.zzb.zzd(16);
                this.zzb.zzl(3);
                if (zzd == 0) {
                    this.zzb.zzl(13);
                } else {
                    int zzd2 = this.zzb.zzd(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzd2) == null) {
                        zzaiv zzaivVar = this.zza;
                        sparseArray3 = zzaivVar.zzf;
                        sparseArray3.put(zzd2, new zzain(new zzaiu(zzaivVar, zzd2)));
                        zzaiv zzaivVar2 = this.zza;
                        i = zzaivVar2.zzl;
                        zzaivVar2.zzl = i + 1;
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzb(zzeu zzeuVar, zzzx zzzxVar, zzaiz zzaizVar) {
    }
}
