package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzahp implements zzahn {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzabb zzc;
    private final zzajc zzd;
    private final zzen zze;
    private final zzaic zzf;
    private final boolean[] zzg;
    private final zzaho zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzahp() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01e8  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r21) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahp.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzb = zzaizVar.zzb();
        this.zzc = zzzxVar.zzv(zzaizVar.zza(), 2);
        zzajc zzajcVar = this.zzd;
        if (zzajcVar != null) {
            zzajcVar.zzb(zzzxVar, zzaizVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        zzaar.zze(this.zzg);
        this.zzh.zzb();
        zzaic zzaicVar = this.zzf;
        if (zzaicVar != null) {
            zzaicVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    public zzahp(zzajc zzajcVar) {
        zzen zzenVar;
        this.zzd = zzajcVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaho(128);
        if (zzajcVar != null) {
            this.zzf = new zzaic(178, 128);
            zzenVar = new zzen();
        } else {
            zzenVar = null;
            this.zzf = null;
        }
        this.zze = zzenVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
