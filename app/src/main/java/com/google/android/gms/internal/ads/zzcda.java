package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcda extends zzccu implements zzgi {
    private String zzd;
    private final zzcbi zze;
    private boolean zzf;
    private final zzccz zzg;
    private final zzccf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcda(zzcbj zzcbjVar, zzcbi zzcbiVar) {
        super(zzcbjVar);
        this.zze = zzcbiVar;
        this.zzg = new zzccz();
        this.zzh = new zzccf();
        this.zzk = new Object();
        this.zzl = (String) zzfnq.zzd(zzcbjVar != null ? zzcbjVar.zzbl() : null).zzb("");
        this.zzm = zzcbjVar != null ? zzcbjVar.zzf() : 0;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(zzbyt.zze(str)));
    }

    private final void zzv() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        int zzs = zzcba.zzs();
        int zzu = zzcba.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), position, zza, round, zza2, round > 0, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zza(zzfg zzfgVar, zzfl zzflVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzb(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzc(zzfg zzfgVar, zzfl zzflVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzd(zzfg zzfgVar, zzfl zzflVar, boolean z) {
        if (zzfgVar instanceof zzft) {
            this.zzg.zzb((zzft) zzfgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a7, code lost:
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d8, code lost:
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:? -> B:113:0x0142). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzccu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcda.zzt(java.lang.String):boolean");
    }
}
