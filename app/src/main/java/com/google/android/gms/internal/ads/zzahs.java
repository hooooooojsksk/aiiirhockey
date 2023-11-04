package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzahs implements zzahn {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzajc zzb;
    private final zzen zzc;
    private final boolean[] zzd;
    private final zzahq zze;
    private final zzaic zzf;
    private zzahr zzg;
    private long zzh;
    private String zzi;
    private zzabb zzj;
    private boolean zzk;
    private long zzl;

    public zzahs() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) {
        int i;
        float f;
        float f2;
        zzdl.zzb(this.zzg);
        zzdl.zzb(this.zzj);
        int zzc = zzenVar.zzc();
        int zzd = zzenVar.zzd();
        byte[] zzH = zzenVar.zzH();
        this.zzh += zzenVar.zza();
        this.zzj.zzq(zzenVar, zzenVar.zza());
        while (true) {
            int zza2 = zzaar.zza(zzH, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i2 = zza2 + 3;
            int i3 = zzenVar.zzH()[i2] & UByte.MAX_VALUE;
            int i4 = zza2 - zzc;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zza(zzH, zzc, zza2);
                }
                if (this.zze.zzc(i3, i4 < 0 ? -i4 : 0)) {
                    zzabb zzabbVar = this.zzj;
                    zzahq zzahqVar = this.zze;
                    int i5 = zzahqVar.zzb;
                    String str = this.zzi;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzahqVar.zzc, zzahqVar.zza);
                    zzem zzemVar = new zzem(copyOf, copyOf.length);
                    zzemVar.zzm(i5);
                    zzemVar.zzm(4);
                    zzemVar.zzk();
                    zzemVar.zzl(8);
                    if (zzemVar.zzn()) {
                        zzemVar.zzl(4);
                        zzemVar.zzl(3);
                    }
                    int zzd2 = zzemVar.zzd(4);
                    if (zzd2 == 15) {
                        int zzd3 = zzemVar.zzd(8);
                        int zzd4 = zzemVar.zzd(8);
                        if (zzd4 == 0) {
                            zzee.zze("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = zzd3 / zzd4;
                            f2 = f;
                        }
                    } else if (zzd2 < 7) {
                        f = zza[zzd2];
                        f2 = f;
                    } else {
                        zzee.zze("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzemVar.zzn()) {
                        zzemVar.zzl(2);
                        zzemVar.zzl(1);
                        if (zzemVar.zzn()) {
                            zzemVar.zzl(15);
                            zzemVar.zzk();
                            zzemVar.zzl(15);
                            zzemVar.zzk();
                            zzemVar.zzl(15);
                            zzemVar.zzk();
                            zzemVar.zzl(3);
                            zzemVar.zzl(11);
                            zzemVar.zzk();
                            zzemVar.zzl(15);
                            zzemVar.zzk();
                        }
                    }
                    if (zzemVar.zzd(2) != 0) {
                        zzee.zze("H263Reader", "Unhandled video object layer shape");
                    }
                    zzemVar.zzk();
                    int zzd5 = zzemVar.zzd(16);
                    zzemVar.zzk();
                    if (zzemVar.zzn()) {
                        if (zzd5 == 0) {
                            zzee.zze("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i6 = zzd5 - 1;
                            int i7 = 0;
                            while (i6 > 0) {
                                i6 >>= 1;
                                i7++;
                            }
                            zzemVar.zzl(i7);
                        }
                    }
                    zzemVar.zzk();
                    int zzd6 = zzemVar.zzd(13);
                    zzemVar.zzk();
                    int zzd7 = zzemVar.zzd(13);
                    zzemVar.zzk();
                    zzemVar.zzk();
                    zzad zzadVar = new zzad();
                    zzadVar.zzH(str);
                    zzadVar.zzS("video/mp4v-es");
                    zzadVar.zzX(zzd6);
                    zzadVar.zzF(zzd7);
                    zzadVar.zzP(f2);
                    zzadVar.zzI(Collections.singletonList(copyOf));
                    zzabbVar.zzk(zzadVar.zzY());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzH, zzc, zza2);
            zzaic zzaicVar = this.zzf;
            if (i4 > 0) {
                zzaicVar.zza(zzH, zzc, zza2);
                i = 0;
            } else {
                i = -i4;
            }
            if (this.zzf.zzd(i)) {
                zzaic zzaicVar2 = this.zzf;
                int zzb = zzaar.zzb(zzaicVar2.zza, zzaicVar2.zzb);
                zzen zzenVar2 = this.zzc;
                int i8 = zzew.zza;
                zzenVar2.zzD(this.zzf.zza, zzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i3 == 178) {
                if (zzenVar.zzH()[zza2 + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i3 = 178;
            }
            int i9 = zzd - zza2;
            this.zzg.zzb(this.zzh - i9, i9, this.zzk);
            this.zzg.zzc(i3, this.zzl);
            zzc = i2;
        }
        if (!this.zzk) {
            this.zze.zza(zzH, zzc, zzd);
        }
        this.zzg.zza(zzH, zzc, zzd);
        this.zzf.zza(zzH, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzi = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzahr(zzv);
        this.zzb.zzb(zzzxVar, zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        zzaar.zze(this.zzd);
        this.zze.zzb();
        zzahr zzahrVar = this.zzg;
        if (zzahrVar != null) {
            zzahrVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzahs(zzajc zzajcVar) {
        this.zzb = zzajcVar;
        this.zzd = new boolean[4];
        this.zze = new zzahq(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzaic(178, 128);
        this.zzc = new zzen();
    }
}
