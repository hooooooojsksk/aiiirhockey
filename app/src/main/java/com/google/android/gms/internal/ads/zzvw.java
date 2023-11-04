package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzvw extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzvw(int i, zzcp zzcpVar, int i2, zzvq zzvqVar, int i3, String str) {
        super(i, zzcpVar, i2);
        zzfqk zzfqkVar;
        int i4;
        int i5 = 0;
        this.zzf = zzwc.zzm(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzvqVar.zzx;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        if (zzvqVar.zzv.isEmpty()) {
            zzfqkVar = zzfqk.zzp("");
        } else {
            zzfqkVar = zzvqVar.zzv;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfqkVar.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzvqVar.zzy;
            i4 = zzwc.zza(this.zzd, (String) zzfqkVar.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int i10 = zzvqVar.zzw;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i11 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzwc.zza(this.zzd, str, zzwc.zzf(str) == null);
        this.zzl = zza;
        boolean z2 = i4 > 0 || (zzvqVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzwc.zzm(i3, zzvqVar.zzQ) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzvw zzvwVar) {
        zzfpz zzb = zzfpz.zzj().zzd(this.zzf, zzvwVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzvwVar.zzi), zzfrs.zzc().zza()).zzb(this.zzj, zzvwVar.zzj).zzb(this.zzk, zzvwVar.zzk).zzd(this.zzg, zzvwVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzvwVar.zzh), this.zzj == 0 ? zzfrs.zzc() : zzfrs.zzc().zza()).zzb(this.zzl, zzvwVar.zzl);
        if (this.zzk == 0) {
            boolean z = zzvwVar.zzm;
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzvw zzvwVar = (zzvw) zzvyVar;
        return false;
    }
}
