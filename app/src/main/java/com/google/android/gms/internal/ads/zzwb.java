package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzwb extends zzvy {
    private final boolean zze;
    private final zzvq zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0031, code lost:
        if (r2 <= 2.1474836E9f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0048, code lost:
        if (r1 >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0050, code lost:
        if (r1 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x005d, code lost:
        if (r1 >= 0.0f) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0065, code lost:
        if (r7 >= 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzwb(int r5, com.google.android.gms.internal.ads.zzcp r6, int r7, com.google.android.gms.internal.ads.zzvq r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwb.<init>(int, com.google.android.gms.internal.ads.zzcp, int, com.google.android.gms.internal.ads.zzvq, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzwb zzwbVar, zzwb zzwbVar2) {
        zzfrs zzfrsVar;
        zzfrs zza;
        zzfrs zzfrsVar2;
        if (!zzwbVar.zze || !zzwbVar.zzh) {
            zzfrsVar = zzwc.zzc;
            zza = zzfrsVar.zza();
        } else {
            zza = zzwc.zzc;
        }
        zzfpz zzj = zzfpz.zzj();
        Integer valueOf = Integer.valueOf(zzwbVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzwbVar2.zzi);
        boolean z = zzwbVar.zzf.zzz;
        zzfrsVar2 = zzwc.zzd;
        return zzj.zzc(valueOf, valueOf2, zzfrsVar2).zzc(Integer.valueOf(zzwbVar.zzj), Integer.valueOf(zzwbVar2.zzj), zza).zzc(Integer.valueOf(zzwbVar.zzi), Integer.valueOf(zzwbVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzwb zzwbVar, zzwb zzwbVar2) {
        zzfpz zzb = zzfpz.zzj().zzd(zzwbVar.zzh, zzwbVar2.zzh).zzb(zzwbVar.zzl, zzwbVar2.zzl);
        boolean z = zzwbVar.zzm;
        boolean z2 = zzwbVar2.zzm;
        zzfpz zzc = zzb.zzd(true, true).zzd(zzwbVar.zze, zzwbVar2.zze).zzd(zzwbVar.zzg, zzwbVar2.zzg).zzc(Integer.valueOf(zzwbVar.zzk), Integer.valueOf(zzwbVar2.zzk), zzfrs.zzc().zza());
        boolean z3 = zzwbVar.zzo;
        zzfpz zzd = zzc.zzd(z3, zzwbVar2.zzo);
        boolean z4 = zzwbVar.zzp;
        zzfpz zzd2 = zzd.zzd(z4, zzwbVar2.zzp);
        if (z3 && z4) {
            zzd2 = zzd2.zzb(zzwbVar.zzq, zzwbVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzwb zzwbVar = (zzwb) zzvyVar;
        if (zzew.zzU(this.zzd.zzm, zzwbVar.zzd.zzm)) {
            boolean z = this.zzf.zzJ;
            return this.zzo == zzwbVar.zzo && this.zzp == zzwbVar.zzp;
        }
        return false;
    }
}
