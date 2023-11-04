package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzacd implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzacc
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzacd.zza;
            return new zzzu[]{new zzacd()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private zzzx zzg;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private boolean zzo;
    private zzacb zzp;
    private zzach zzq;
    private final zzen zzb = new zzen(4);
    private final zzen zzc = new zzen(9);
    private final zzen zzd = new zzen(11);
    private final zzen zze = new zzen();
    private final zzace zzf = new zzace();
    private int zzh = 1;

    private final zzen zze(zzzv zzzvVar) throws IOException {
        if (this.zzm > this.zze.zzb()) {
            zzen zzenVar = this.zze;
            int zzb = zzenVar.zzb();
            zzenVar.zzD(new byte[Math.max(zzb + zzb, this.zzm)], 0);
        } else {
            this.zze.zzF(0);
        }
        this.zze.zzE(this.zzm);
        ((zzzk) zzzvVar).zzn(this.zze.zzH(), 0, this.zzm, false);
        return this.zze;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzf() {
        if (this.zzo) {
            return;
        }
        this.zzg.zzN(new zzaaw(-9223372036854775807L, 0L));
        this.zzo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r17, com.google.android.gms.internal.ads.zzaau r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacd.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzg = zzzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzh = 1;
            this.zzi = false;
        } else {
            this.zzh = 3;
        }
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        zzzk zzzkVar = (zzzk) zzzvVar;
        zzzkVar.zzm(this.zzb.zzH(), 0, 3, false);
        this.zzb.zzF(0);
        if (this.zzb.zzm() != 4607062) {
            return false;
        }
        zzzkVar.zzm(this.zzb.zzH(), 0, 2, false);
        this.zzb.zzF(0);
        if ((this.zzb.zzo() & 250) != 0) {
            return false;
        }
        zzzkVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        int zze = this.zzb.zze();
        zzzvVar.zzj();
        zzzkVar.zzl(zze, false);
        zzzkVar.zzm(this.zzb.zzH(), 0, 4, false);
        this.zzb.zzF(0);
        return this.zzb.zze() == 0;
    }
}
