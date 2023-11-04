package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzvk extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzvq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzvk(int i, zzcp zzcpVar, int i2, zzvq zzvqVar, int i3, boolean z, zzfnv zzfnvVar) {
        super(i, zzcpVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzvqVar;
        this.zzg = zzwc.zzf(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzwc.zzm(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzvqVar.zzq.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = zzwc.zza(this.zzd, (String) zzvqVar.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        int i10 = zzvqVar.zzr;
        this.zzl = Integer.bitCount(0);
        zzaf zzafVar = this.zzd;
        int i11 = zzafVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzafVar.zze & 1);
        this.zzq = zzafVar.zzz;
        this.zzr = zzafVar.zzA;
        this.zzs = zzafVar.zzi;
        if (zzafVar.zzi != -1) {
            int i12 = zzvqVar.zzt;
        }
        if (zzafVar.zzz != -1) {
            int i13 = zzvqVar.zzs;
        }
        this.zzf = zzfnvVar.zza(zzafVar);
        String[] zzag = zzew.zzag();
        int i14 = 0;
        while (true) {
            if (i14 >= zzag.length) {
                i14 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = zzwc.zza(this.zzd, zzag[i14], false);
            if (i6 > 0) {
                break;
            }
            i14++;
        }
        this.zzn = i14;
        this.zzo = i6;
        int i15 = 0;
        while (true) {
            if (i15 < zzvqVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzvqVar.zzu.get(i15))) {
                    i4 = i15;
                    break;
                }
                i15++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzvq zzvqVar2 = this.zzh;
        if (zzwc.zzm(i3, zzvqVar2.zzQ) && ((z2 = this.zzf) || zzvqVar2.zzK)) {
            if (zzwc.zzm(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z3 = zzvqVar2.zzA;
                boolean z4 = zzvqVar2.zzz;
                if (zzvqVar2.zzS || !z) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzvk zzvkVar = (zzvk) zzvyVar;
        zzvq zzvqVar = this.zzh;
        boolean z = zzvqVar.zzN;
        zzaf zzafVar = this.zzd;
        int i = zzafVar.zzz;
        if (i != -1) {
            zzaf zzafVar2 = zzvkVar.zzd;
            if (i == zzafVar2.zzz) {
                boolean z2 = zzvqVar.zzL;
                String str = zzafVar.zzm;
                if (str == null || !TextUtils.equals(str, zzafVar2.zzm)) {
                    return false;
                }
                zzvq zzvqVar2 = this.zzh;
                boolean z3 = zzvqVar2.zzM;
                int i2 = this.zzd.zzA;
                if (i2 == -1 || i2 != zzvkVar.zzd.zzA) {
                    return false;
                }
                boolean z4 = zzvqVar2.zzO;
                return this.zzu == zzvkVar.zzu && this.zzv == zzvkVar.zzv;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzvk zzvkVar) {
        zzfrs zzfrsVar;
        zzfrs zza;
        zzfrs zzfrsVar2;
        if (this.zzf && this.zzi) {
            zza = zzwc.zzc;
        } else {
            zzfrsVar = zzwc.zzc;
            zza = zzfrsVar.zza();
        }
        zzfpz zzd = zzfpz.zzj().zzd(this.zzi, zzvkVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzvkVar.zzk), zzfrs.zzc().zza()).zzb(this.zzj, zzvkVar.zzj).zzb(this.zzl, zzvkVar.zzl).zzd(this.zzp, zzvkVar.zzp);
        boolean z = zzvkVar.zzm;
        zzfpz zzc = zzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzvkVar.zzn), zzfrs.zzc().zza()).zzb(this.zzo, zzvkVar.zzo).zzd(this.zzf, zzvkVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzvkVar.zzt), zzfrs.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzvkVar.zzs);
        boolean z2 = this.zzh.zzz;
        zzfrsVar2 = zzwc.zzd;
        zzfpz zzc2 = zzc.zzc(valueOf, valueOf2, zzfrsVar2).zzd(this.zzu, zzvkVar.zzu).zzd(this.zzv, zzvkVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzvkVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzvkVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzvkVar.zzs);
        if (!zzew.zzU(this.zzg, zzvkVar.zzg)) {
            zza = zzwc.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }
}
