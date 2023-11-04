package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzahj implements zzahn {
    private static final byte[] zza = {airhockey.P_GAME_REMATCH, airhockey.P_GAME_SELECTMAP, 51};
    private final boolean zzb;
    private final zzem zzc = new zzem(new byte[7], 7);
    private final zzen zzd = new zzen(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzabb zzg;
    private zzabb zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzabb zzu;
    private long zzv;

    public zzahj(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzabb zzabbVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzabbVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzen zzenVar, byte[] bArr, int i) {
        int min = Math.min(zzenVar.zza(), i - this.zzj);
        zzenVar.zzB(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & UByte.MAX_VALUE) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzen zzenVar, byte[] bArr, int i) {
        if (zzenVar.zza() < i) {
            return false;
        }
        zzenVar.zzB(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzen zzenVar) throws zzbu {
        int i;
        int i2;
        int i3;
        Objects.requireNonNull(this.zzg);
        int i4 = zzew.zza;
        while (zzenVar.zza() > 0) {
            int i5 = this.zzi;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzH = zzenVar.zzH();
                int zzc = zzenVar.zzc();
                int zzd = zzenVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        i = zzc + 1;
                        i2 = zzH[zzc] & UByte.MAX_VALUE;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i2)) {
                            if (!this.zzm) {
                                int i8 = i - 2;
                                zzenVar.zzF(i8 + 1);
                                if (zzm(zzenVar, this.zzc.zza, 1)) {
                                    this.zzc.zzj(4);
                                    int zzd2 = this.zzc.zzd(1);
                                    int i9 = this.zzn;
                                    if (i9 == -1 || zzd2 == i9) {
                                        if (this.zzo != -1) {
                                            if (!zzm(zzenVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzj(i7);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzenVar.zzF(i8 + 2);
                                            }
                                        }
                                        if (!zzm(zzenVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzj(14);
                                        int zzd3 = this.zzc.zzd(i6);
                                        if (zzd3 >= 7) {
                                            byte[] zzH2 = zzenVar.zzH();
                                            int zzd4 = zzenVar.zzd();
                                            int i10 = i8 + zzd3;
                                            if (i10 < zzd4) {
                                                byte b = zzH2[i10];
                                                if (b != -1) {
                                                    if (b == 73) {
                                                        int i11 = i10 + 1;
                                                        if (i11 == zzd4) {
                                                            break;
                                                        } else if (zzH2[i11] == 68) {
                                                            int i12 = i10 + 2;
                                                            if (i12 == zzd4) {
                                                                break;
                                                            } else if (zzH2[i12] == 51) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i13 = i10 + 1;
                                                    if (i13 == zzd4) {
                                                        break;
                                                    }
                                                    byte b2 = zzH2[i13];
                                                    if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzd2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i14 = this.zzk;
                        int i15 = i14 | i2;
                        if (i15 == 329) {
                            i3 = 768;
                        } else if (i15 == 511) {
                            i3 = 512;
                        } else if (i15 == 836) {
                            i3 = 1024;
                        } else if (i15 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzF(0);
                            zzenVar.zzF(i);
                            break;
                        } else if (i14 != 256) {
                            this.zzk = 256;
                            zzc = i - 1;
                            i6 = 13;
                            i7 = 2;
                        } else {
                            zzc = i;
                            i6 = 13;
                            i7 = 2;
                        }
                        this.zzk = i3;
                        zzc = i;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        zzenVar.zzF(zzc);
                        break;
                    }
                }
                this.zzp = (i2 & 8) >> 3;
                this.zzl = 1 == ((i2 & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzenVar.zzF(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(zzenVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzenVar, min);
                        int i16 = this.zzj + min;
                        this.zzj = i16;
                        int i17 = this.zzs;
                        if (i16 == i17) {
                            long j = this.zzt;
                            if (j != -9223372036854775807L) {
                                this.zzu.zzs(j, 1, i17, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzenVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (!this.zzq) {
                                int zzd5 = this.zzc.zzd(2) + 1;
                                if (zzd5 != 2) {
                                    zzee.zze("AdtsReader", "Detected audio object type: " + zzd5 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int zzd6 = this.zzc.zzd(3);
                                int i18 = this.zzo;
                                int i19 = zzys.zza;
                                byte[] bArr = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((zzd6 << 3) & 120) | ((i18 << 7) & 128))};
                                zzyr zza2 = zzys.zza(bArr);
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(this.zzf);
                                zzadVar.zzS("audio/mp4a-latm");
                                zzadVar.zzx(zza2.zzc);
                                zzadVar.zzw(zza2.zzb);
                                zzadVar.zzT(zza2.zza);
                                zzadVar.zzI(Collections.singletonList(bArr));
                                zzadVar.zzK(this.zze);
                                zzaf zzY = zzadVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            } else {
                                this.zzc.zzl(10);
                            }
                            this.zzc.zzl(4);
                            int zzd7 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                zzd7 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzd7);
                        }
                    }
                } else if (zzk(zzenVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzj());
                }
            } else if (zzenVar.zza() != 0) {
                zzem zzemVar = this.zzc;
                zzemVar.zza[0] = zzenVar.zzH()[zzenVar.zzc()];
                zzemVar.zzj(2);
                int zzd8 = this.zzc.zzd(4);
                int i20 = this.zzo;
                if (i20 == -1 || zzd8 == i20) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd8;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzf = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzzt();
            return;
        }
        zzaizVar.zzc();
        zzabb zzv2 = zzzxVar.zzv(zzaizVar.zza(), 5);
        this.zzh = zzv2;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzaizVar.zzb());
        zzadVar.zzS("application/id3");
        zzv2.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
