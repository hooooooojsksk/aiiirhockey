package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzuc {
    private final zzen zza = new zzen(32);
    private zzub zzb;
    private zzub zzc;
    private zzub zzd;
    private long zze;
    private final zzwt zzf;

    public zzuc(zzwt zzwtVar, byte[] bArr) {
        this.zzf = zzwtVar;
        zzub zzubVar = new zzub(0L, 65536);
        this.zzb = zzubVar;
        this.zzc = zzubVar;
        this.zzd = zzubVar;
    }

    private final int zzi(int i) {
        zzub zzubVar = this.zzd;
        if (zzubVar.zzc == null) {
            zzwm zzb = this.zzf.zzb();
            zzub zzubVar2 = new zzub(this.zzd.zzb, 65536);
            zzubVar.zzc = zzb;
            zzubVar.zzd = zzubVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzub zzj(zzub zzubVar, long j) {
        while (j >= zzubVar.zzb) {
            zzubVar = zzubVar.zzd;
        }
        return zzubVar;
    }

    private static zzub zzk(zzub zzubVar, long j, ByteBuffer byteBuffer, int i) {
        zzub zzj = zzj(zzubVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzub zzl(zzub zzubVar, long j, byte[] bArr, int i) {
        zzub zzj = zzj(zzubVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzub zzm(zzub zzubVar, zzgr zzgrVar, zzue zzueVar, zzen zzenVar) {
        zzub zzubVar2;
        int i;
        if (zzgrVar.zzk()) {
            long j = zzueVar.zzb;
            zzenVar.zzC(1);
            zzub zzl = zzl(zzubVar, j, zzenVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzenVar.zzH()[0];
            int i2 = b & ByteCompanionObject.MIN_VALUE;
            int i3 = b & ByteCompanionObject.MAX_VALUE;
            zzgo zzgoVar = zzgrVar.zza;
            byte[] bArr = zzgoVar.zza;
            if (bArr == null) {
                zzgoVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzubVar2 = zzl(zzl, j2, zzgoVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzenVar.zzC(2);
                zzubVar2 = zzl(zzubVar2, j3, zzenVar.zzH(), 2);
                j3 += 2;
                i = zzenVar.zzo();
            } else {
                i = 1;
            }
            int[] iArr = zzgoVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgoVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                zzenVar.zzC(i4);
                zzubVar2 = zzl(zzubVar2, j3, zzenVar.zzH(), i4);
                j3 += i4;
                zzenVar.zzF(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzenVar.zzo();
                    iArr4[i5] = zzenVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzueVar.zza - ((int) (j3 - zzueVar.zzb));
            }
            zzaba zzabaVar = zzueVar.zzc;
            int i6 = zzew.zza;
            zzgoVar.zzc(i, iArr2, iArr4, zzabaVar.zzb, zzgoVar.zza, zzabaVar.zza, zzabaVar.zzc, zzabaVar.zzd);
            long j4 = zzueVar.zzb;
            int i7 = (int) (j3 - j4);
            zzueVar.zzb = j4 + i7;
            zzueVar.zza -= i7;
        } else {
            zzubVar2 = zzubVar;
        }
        if (zzgrVar.zze()) {
            zzenVar.zzC(4);
            zzub zzl2 = zzl(zzubVar2, zzueVar.zzb, zzenVar.zzH(), 4);
            int zzn = zzenVar.zzn();
            zzueVar.zzb += 4;
            zzueVar.zza -= 4;
            zzgrVar.zzi(zzn);
            zzub zzk = zzk(zzl2, zzueVar.zzb, zzgrVar.zzb, zzn);
            zzueVar.zzb += zzn;
            int i8 = zzueVar.zza - zzn;
            zzueVar.zza = i8;
            ByteBuffer byteBuffer = zzgrVar.zze;
            if (byteBuffer == null || byteBuffer.capacity() < i8) {
                zzgrVar.zze = ByteBuffer.allocate(i8);
            } else {
                zzgrVar.zze.clear();
            }
            return zzk(zzk, zzueVar.zzb, zzgrVar.zze, zzueVar.zza);
        }
        zzgrVar.zzi(zzueVar.zza);
        return zzk(zzubVar2, zzueVar.zzb, zzgrVar.zzb, zzueVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zzub zzubVar = this.zzd;
        if (j == zzubVar.zzb) {
            this.zzd = zzubVar.zzd;
        }
    }

    public final int zza(zzr zzrVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzub zzubVar = this.zzd;
        int zza = zzrVar.zza(zzubVar.zzc.zza, zzubVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzub zzubVar;
        if (j != -1) {
            while (true) {
                zzubVar = this.zzb;
                if (j < zzubVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzubVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzubVar.zza) {
                this.zzc = zzubVar;
            }
        }
    }

    public final void zzd(zzgr zzgrVar, zzue zzueVar) {
        zzm(this.zzc, zzgrVar, zzueVar, this.zza);
    }

    public final void zze(zzgr zzgrVar, zzue zzueVar) {
        this.zzc = zzm(this.zzc, zzgrVar, zzueVar, this.zza);
    }

    public final void zzf() {
        zzub zzubVar = this.zzb;
        if (zzubVar.zzc != null) {
            this.zzf.zzd(zzubVar);
            zzubVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzub zzubVar2 = this.zzb;
        this.zzc = zzubVar2;
        this.zzd = zzubVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzen zzenVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzub zzubVar = this.zzd;
            zzenVar.zzB(zzubVar.zzc.zza, zzubVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
