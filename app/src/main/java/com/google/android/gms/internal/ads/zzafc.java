package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzafc implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzafa
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzafc.zza;
            return new zzzu[]{new zzafc(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final zzadm zzb = new zzadm() { // from class: com.google.android.gms.internal.ads.zzafb
    };
    private final zzen zzc;
    private final zzaan zzd;
    private final zzaaj zze;
    private final zzaal zzf;
    private final zzabb zzg;
    private zzzx zzh;
    private zzabb zzi;
    private zzabb zzj;
    private int zzk;
    private zzbq zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzafe zzq;
    private boolean zzr;

    public zzafc() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x015f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzf(com.google.android.gms.internal.ads.zzzv r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafc.zzf(com.google.android.gms.internal.ads.zzzv):int");
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzafe zzh(zzzv zzzvVar, boolean z) throws IOException {
        ((zzzk) zzzvVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzaex(zzzvVar.zzd(), zzzvVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzzv zzzvVar) throws IOException {
        zzafe zzafeVar = this.zzq;
        if (zzafeVar != null) {
            long zzb2 = zzafeVar.zzb();
            if (zzb2 != -1 && zzzvVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzzvVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzzv zzzvVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzzvVar.zzj();
        if (zzzvVar.zzf() == 0) {
            zzbq zza2 = this.zzf.zza(zzzvVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i2 = (int) zzzvVar.zze();
            if (!z) {
                ((zzzk) zzzvVar).zzo(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!zzj(zzzvVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i == 0 || zzi(zze, i)) && (zzb2 = zzaao.zzb(zze)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i = zze;
                    }
                    ((zzzk) zzzvVar).zzl(zzb2 - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzbu.zza("Searched too many bytes.", null);
                    }
                    if (!z) {
                        ((zzzk) zzzvVar).zzo(1, false);
                    } else {
                        zzzvVar.zzj();
                        ((zzzk) zzzvVar).zzl(i2 + i5, false);
                    }
                    i4 = i5;
                    i = 0;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzzk) zzzvVar).zzo(i2 + i4, false);
        } else {
            zzzvVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzi);
        int i = zzew.zza;
        int zzf = zzf(zzzvVar);
        if (zzf == -1 && (this.zzq instanceof zzaey)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzaey zzaeyVar = (zzaey) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzh = zzzxVar;
        zzabb zzv = zzzxVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzafe zzafeVar = this.zzq;
        if (zzafeVar instanceof zzaey) {
            zzaey zzaeyVar = (zzaey) zzafeVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzk(zzzvVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzafc(int i) {
        this.zzc = new zzen(10);
        this.zzd = new zzaan();
        this.zze = new zzaaj();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzaal();
        zzzt zzztVar = new zzzt();
        this.zzg = zzztVar;
        this.zzj = zzztVar;
    }
}
