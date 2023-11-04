package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzahy implements zzahn {
    private final zzaio zza;
    private String zzb;
    private zzabb zzc;
    private zzahx zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaic zzg = new zzaic(32, 128);
    private final zzaic zzh = new zzaic(33, 128);
    private final zzaic zzi = new zzaic(34, 128);
    private final zzaic zzj = new zzaic(39, 128);
    private final zzaic zzk = new zzaic(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzahy(zzaio zzaioVar) {
        this.zza = zzaioVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x03a5  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r38) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzb = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzahx(zzv);
        this.zza.zzb(zzzxVar, zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzaar.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzahx zzahxVar = this.zzd;
        if (zzahxVar != null) {
            zzahxVar.zzc();
        }
    }
}
