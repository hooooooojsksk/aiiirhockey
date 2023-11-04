package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgsa implements zzgsp {
    private final zzgrw zza;
    private final zzgtg zzb;
    private final boolean zzc;
    private final zzgpz zzd;

    private zzgsa(zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrw zzgrwVar) {
        this.zzb = zzgtgVar;
        this.zzc = zzgpzVar.zzh(zzgrwVar);
        this.zzd = zzgpzVar;
        this.zza = zzgrwVar;
    }

    public static zzgsa zzc(zzgtg zzgtgVar, zzgpz zzgpzVar, zzgrw zzgrwVar) {
        return new zzgsa(zzgtgVar, zzgpzVar, zzgrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zza(Object obj) {
        zzgtg zzgtgVar = this.zzb;
        int zzb = zzgtgVar.zzb(zzgtgVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final Object zze() {
        zzgrw zzgrwVar = this.zza;
        if (zzgrwVar instanceof zzgqm) {
            return ((zzgqm) zzgrwVar).zzaD();
        }
        return zzgrwVar.zzaO().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzg(Object obj, Object obj2) {
        zzgsr.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgsr.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzh(Object obj, zzgsh zzgshVar, zzgpy zzgpyVar) throws IOException {
        boolean zzO;
        zzgtg zzgtgVar = this.zzb;
        zzgpz zzgpzVar = this.zzd;
        Object zzc = zzgtgVar.zzc(obj);
        zzgqd zzb = zzgpzVar.zzb(obj);
        while (zzgshVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgshVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgpzVar.zzc(zzgpyVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgpzVar.zzf(zzgshVar, zzc2, zzgpyVar, zzb);
                        } else {
                            zzO = zzgtgVar.zzp(zzc, zzgshVar);
                        }
                    } else {
                        zzO = zzgshVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj2 = null;
                    zzgpe zzgpeVar = null;
                    while (zzgshVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgshVar.zzd();
                        if (zzd2 == 16) {
                            i = zzgshVar.zzj();
                            obj2 = zzgpzVar.zzc(zzgpyVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgpzVar.zzf(zzgshVar, obj2, zzgpyVar, zzb);
                            } else {
                                zzgpeVar = zzgshVar.zzp();
                            }
                        } else if (!zzgshVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgshVar.zzd() != 12) {
                        throw zzgqy.zzb();
                    } else if (zzgpeVar != null) {
                        if (obj2 != null) {
                            zzgpzVar.zzg(zzgpeVar, obj2, zzgpyVar, zzb);
                        } else {
                            zzgtgVar.zzk(zzc, i, zzgpeVar);
                        }
                    }
                }
            } finally {
                zzgtgVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgoq zzgoqVar) throws IOException {
        zzgqm zzgqmVar = (zzgqm) obj;
        if (zzgqmVar.zzc == zzgth.zzc()) {
            zzgqmVar.zzc = zzgth.zzf();
        }
        zzgqj zzgqjVar = (zzgqj) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzj(Object obj, Object obj2) {
        if (this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final void zzm(Object obj, zzgpu zzgpuVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
