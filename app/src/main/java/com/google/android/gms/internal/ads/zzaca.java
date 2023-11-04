package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaca implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzabz
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzaca.zza;
            return new zzzu[]{new zzaca(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final byte[] zzb;
    private final zzen zzc;
    private final zzaac zzd;
    private zzzx zze;
    private zzabb zzf;
    private int zzg;
    private zzbq zzh;
    private zzaah zzi;
    private int zzj;
    private int zzk;
    private zzaby zzl;
    private int zzm;
    private long zzn;

    public zzaca() {
        this(0);
    }

    private final long zze(zzen zzenVar, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.zzi);
        int zzc = zzenVar.zzc();
        while (zzc <= zzenVar.zzd() - 16) {
            zzenVar.zzF(zzc);
            if (zzaad.zzc(zzenVar, this.zzi, this.zzk, this.zzd)) {
                zzenVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (z) {
            while (zzc <= zzenVar.zzd() - this.zzj) {
                zzenVar.zzF(zzc);
                try {
                    z2 = zzaad.zzc(zzenVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzenVar.zzc() <= zzenVar.zzd() && z2) {
                    zzenVar.zzF(zzc);
                    return this.zzd.zza;
                }
                zzc++;
            }
            zzenVar.zzF(zzenVar.zzd());
            return -1L;
        }
        zzenVar.zzF(zzc);
        return -1L;
    }

    private final void zzf() {
        zzaah zzaahVar = this.zzi;
        int i = zzew.zza;
        this.zzf.zzs((this.zzn * 1000000) / zzaahVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zze = zzzxVar;
        this.zzf = zzzxVar.zzv(0, 1);
        zzzxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        zzaae.zza(zzzvVar, false);
        zzen zzenVar = new zzen(4);
        ((zzzk) zzzvVar).zzm(zzenVar.zzH(), 0, 4, false);
        return zzenVar.zzs() == 1716281667;
    }

    public zzaca(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzen(new byte[32768], 0);
        this.zzd = new zzaac();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaby zzabyVar = this.zzl;
            if (zzabyVar != null) {
                zzabyVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        boolean zzn;
        zzaax zzaawVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzzvVar.zzj();
            long zze = zzzvVar.zze();
            zzbq zza2 = zzaae.zza(zzzvVar, true);
            ((zzzk) zzzvVar).zzo((int) (zzzvVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzzk) zzzvVar).zzm(this.zzb, 0, 42, false);
            zzzvVar.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzen zzenVar = new zzen(4);
            ((zzzk) zzzvVar).zzn(zzenVar.zzH(), 0, 4, false);
            if (zzenVar.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbu.zza("Failed to read FLAC stream marker.", null);
        } else if (i == 3) {
            zzaah zzaahVar = this.zzi;
            do {
                zzzvVar.zzj();
                zzem zzemVar = new zzem(new byte[4], 4);
                zzzk zzzkVar = (zzzk) zzzvVar;
                zzzkVar.zzm(zzemVar.zza, 0, 4, false);
                zzn = zzemVar.zzn();
                int zzd = zzemVar.zzd(7);
                int zzd2 = zzemVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzzkVar.zzn(bArr, 0, 38, false);
                    zzaahVar = new zzaah(bArr, 4);
                } else if (zzaahVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzd == 3) {
                        zzen zzenVar2 = new zzen(zzd2);
                        zzzkVar.zzn(zzenVar2.zzH(), 0, zzd2, false);
                        zzaahVar = zzaahVar.zzf(zzaae.zzb(zzenVar2));
                    } else if (zzd == 4) {
                        zzen zzenVar3 = new zzen(zzd2);
                        zzzkVar.zzn(zzenVar3.zzH(), 0, zzd2, false);
                        zzenVar3.zzG(4);
                        zzaahVar = zzaahVar.zzg(Arrays.asList(zzabh.zzc(zzenVar3, false, false).zzb));
                    } else if (zzd != 6) {
                        zzzkVar.zzo(zzd2, false);
                    } else {
                        zzen zzenVar4 = new zzen(zzd2);
                        zzzkVar.zzn(zzenVar4.zzH(), 0, zzd2, false);
                        zzenVar4.zzG(4);
                        zzaahVar = zzaahVar.zze(zzfqk.zzp(zzacu.zzb(zzenVar4)));
                    }
                }
                int i2 = zzew.zza;
                this.zzi = zzaahVar;
            } while (!zzn);
            Objects.requireNonNull(zzaahVar);
            this.zzj = Math.max(zzaahVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i == 4) {
            zzzvVar.zzj();
            zzen zzenVar5 = new zzen(2);
            ((zzzk) zzzvVar).zzm(zzenVar5.zzH(), 0, 2, false);
            int zzo = zzenVar5.zzo();
            if ((zzo >> 2) != 16382) {
                zzzvVar.zzj();
                throw zzbu.zza("First frame does not start with sync code.", null);
            }
            zzzvVar.zzj();
            this.zzk = zzo;
            zzzx zzzxVar = this.zze;
            int i3 = zzew.zza;
            long zzf = zzzvVar.zzf();
            long zzd3 = zzzvVar.zzd();
            zzaah zzaahVar2 = this.zzi;
            Objects.requireNonNull(zzaahVar2);
            if (zzaahVar2.zzk != null) {
                zzaawVar = new zzaaf(zzaahVar2, zzf);
            } else if (zzd3 != -1 && zzaahVar2.zzj > 0) {
                zzaby zzabyVar = new zzaby(zzaahVar2, this.zzk, zzf, zzd3);
                this.zzl = zzabyVar;
                zzaawVar = zzabyVar.zzb();
            } else {
                zzaawVar = new zzaaw(zzaahVar2.zza(), 0L);
            }
            zzzxVar.zzN(zzaawVar);
            this.zzg = 5;
            return 0;
        } else {
            Objects.requireNonNull(this.zzf);
            zzaah zzaahVar3 = this.zzi;
            Objects.requireNonNull(zzaahVar3);
            zzaby zzabyVar2 = this.zzl;
            if (zzabyVar2 == null || !zzabyVar2.zze()) {
                if (this.zzn == -1) {
                    this.zzn = zzaad.zzb(zzzvVar, zzaahVar3);
                    return 0;
                }
                zzen zzenVar6 = this.zzc;
                int zzd4 = zzenVar6.zzd();
                if (zzd4 < 32768) {
                    int zza3 = zzzvVar.zza(zzenVar6.zzH(), zzd4, 32768 - zzd4);
                    z = zza3 == -1;
                    if (!z) {
                        this.zzc.zzE(zzd4 + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzen zzenVar7 = this.zzc;
                int zzc = zzenVar7.zzc();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzenVar7.zzG(Math.min(i5 - i4, zzenVar7.zza()));
                }
                long zze2 = zze(this.zzc, z);
                zzen zzenVar8 = this.zzc;
                int zzc2 = zzenVar8.zzc() - zzc;
                zzenVar8.zzF(zzc);
                zzaaz.zzb(this.zzf, this.zzc, zzc2);
                this.zzm += zzc2;
                if (zze2 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze2;
                }
                zzen zzenVar9 = this.zzc;
                if (zzenVar9.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzenVar9.zza();
                System.arraycopy(zzenVar9.zzH(), zzenVar9.zzc(), zzenVar9.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            return zzabyVar2.zza(zzzvVar, zzaauVar);
        }
    }
}
