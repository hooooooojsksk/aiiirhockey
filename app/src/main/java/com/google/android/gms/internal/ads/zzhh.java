package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzhh implements zzjq {
    private final zzkt zza;
    private final zzhg zzb;
    private zzkn zzc;
    private zzjq zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhh(zzhg zzhgVar, zzdm zzdmVar) {
        this.zzb = zzhgVar;
        this.zza = new zzkt(zzdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzkn zzknVar = this.zzc;
        if (zzknVar == null || zzknVar.zzM() || (!this.zzc.zzN() && (z || this.zzc.zzG()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzjq zzjqVar = this.zzd;
            Objects.requireNonNull(zzjqVar);
            long zza = zzjqVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzby zzc = zzjqVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjq zzjqVar2 = this.zzd;
        Objects.requireNonNull(zzjqVar2);
        return zzjqVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final zzby zzc() {
        zzjq zzjqVar = this.zzd;
        return zzjqVar != null ? zzjqVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzkn zzknVar) {
        if (zzknVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzkn zzknVar) throws zzhj {
        zzjq zzjqVar;
        zzjq zzi = zzknVar.zzi();
        if (zzi == null || zzi == (zzjqVar = this.zzd)) {
            return;
        }
        if (zzjqVar == null) {
            this.zzd = zzi;
            this.zzc = zzknVar;
            zzi.zzg(this.zza.zzc());
            return;
        }
        throw zzhj.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final void zzg(zzby zzbyVar) {
        zzjq zzjqVar = this.zzd;
        if (zzjqVar != null) {
            zzjqVar.zzg(zzbyVar);
            zzbyVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbyVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
