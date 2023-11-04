package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzti implements zzsq, zzsp {
    private final zzsq[] zza;
    private zzsp zze;
    private zzur zzf;
    private final zzsd zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzul zzh = new zzsc(new zzul[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzsq[] zzg = new zzsq[0];

    public zzti(zzsd zzsdVar, long[] jArr, zzsq[] zzsqVarArr, byte... bArr) {
        this.zzi = zzsdVar;
        this.zza = zzsqVarArr;
        for (int i = 0; i < zzsqVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zztg(zzsqVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zza(long j, zzkq zzkqVar) {
        zzsq[] zzsqVarArr = this.zzg;
        return (zzsqVarArr.length > 0 ? zzsqVarArr[0] : this.zza[0]).zza(j, zzkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzd() {
        zzsq[] zzsqVarArr;
        zzsq[] zzsqVarArr2;
        long j = -9223372036854775807L;
        for (zzsq zzsqVar : this.zzg) {
            long zzd = zzsqVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzsq zzsqVar2 : this.zzg) {
                        if (zzsqVar2 == zzsqVar) {
                            break;
                        } else if (zzsqVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzsqVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzsq[] zzsqVarArr = this.zzg;
            if (i >= zzsqVarArr.length) {
                return zze;
            }
            if (zzsqVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final long zzf(zzwe[] zzweVarArr, boolean[] zArr, zzuj[] zzujVarArr, boolean[] zArr2, long j) {
        int length;
        zzwe zzweVar;
        int length2 = zzweVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzweVarArr.length;
            zzweVar = null;
            if (i >= length) {
                break;
            }
            zzuj zzujVar = zzujVarArr[i];
            Integer num = zzujVar != null ? (Integer) this.zzb.get(zzujVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzwe zzweVar2 = zzweVarArr[i];
            if (zzweVar2 != null) {
                zzcp zzcpVar = (zzcp) this.zzd.get(zzweVar2.zze());
                Objects.requireNonNull(zzcpVar);
                int i2 = 0;
                while (true) {
                    zzsq[] zzsqVarArr = this.zza;
                    if (i2 >= zzsqVarArr.length) {
                        break;
                    } else if (zzsqVarArr[i2].zzh().zza(zzcpVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.zzb.clear();
        zzuj[] zzujVarArr2 = new zzuj[length];
        zzuj[] zzujVarArr3 = new zzuj[length];
        zzwe[] zzweVarArr2 = new zzwe[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = 0; i4 < zzweVarArr.length; i4++) {
                zzujVarArr3[i4] = iArr[i4] == i3 ? zzujVarArr[i4] : zzweVar;
                if (iArr2[i4] == i3) {
                    zzwe zzweVar3 = zzweVarArr[i4];
                    Objects.requireNonNull(zzweVar3);
                    zzcp zzcpVar2 = (zzcp) this.zzd.get(zzweVar3.zze());
                    Objects.requireNonNull(zzcpVar2);
                    zzweVarArr2[i4] = new zztf(zzweVar3, zzcpVar2);
                } else {
                    zzweVarArr2[i4] = zzweVar;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zzuj[] zzujVarArr4 = zzujVarArr3;
            zzwe[] zzweVarArr3 = zzweVarArr2;
            long zzf = this.zza[i3].zzf(zzweVarArr2, zArr, zzujVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzweVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzuj zzujVar2 = zzujVarArr4[i6];
                    Objects.requireNonNull(zzujVar2);
                    zzujVarArr2[i6] = zzujVar2;
                    this.zzb.put(zzujVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzdl.zzf(zzujVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzujVarArr3 = zzujVarArr4;
            zzweVarArr2 = zzweVarArr3;
            zzweVar = null;
        }
        System.arraycopy(zzujVarArr2, 0, zzujVarArr, 0, length);
        zzsq[] zzsqVarArr2 = (zzsq[]) arrayList.toArray(new zzsq[0]);
        this.zzg = zzsqVarArr2;
        this.zzh = new zzsc(zzsqVarArr2);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final /* bridge */ /* synthetic */ void zzg(zzul zzulVar) {
        zzsq zzsqVar = (zzsq) zzulVar;
        zzsp zzspVar = this.zze;
        Objects.requireNonNull(zzspVar);
        zzspVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final zzur zzh() {
        zzur zzurVar = this.zzf;
        Objects.requireNonNull(zzurVar);
        return zzurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsp
    public final void zzi(zzsq zzsqVar) {
        this.zzc.remove(zzsqVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzsq zzsqVar2 : this.zza) {
            i += zzsqVar2.zzh().zzc;
        }
        zzcp[] zzcpVarArr = new zzcp[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzsq[] zzsqVarArr = this.zza;
            if (i2 < zzsqVarArr.length) {
                zzur zzh = zzsqVarArr[i2].zzh();
                int i4 = zzh.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzcp zzb = zzh.zzb(i5);
                    zzcp zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                    this.zzd.put(zzc, zzb);
                    zzcpVarArr[i3] = zzc;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.zzf = new zzur(zzcpVarArr);
                zzsp zzspVar = this.zze;
                Objects.requireNonNull(zzspVar);
                zzspVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzj(long j, boolean z) {
        for (zzsq zzsqVar : this.zzg) {
            zzsqVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzk() throws IOException {
        for (zzsq zzsqVar : this.zza) {
            zzsqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzl(zzsp zzspVar, long j) {
        this.zze = zzspVar;
        Collections.addAll(this.zzc, this.zza);
        for (zzsq zzsqVar : this.zza) {
            zzsqVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzsq zzn(int i) {
        zzsq zzsqVar;
        zzsq zzsqVar2 = this.zza[i];
        if (zzsqVar2 instanceof zztg) {
            zzsqVar = ((zztg) zzsqVar2).zza;
            return zzsqVar;
        }
        return zzsqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i = 0; i < size; i++) {
                ((zzsq) this.zzc.get(i)).zzo(j);
            }
            return false;
        }
        return this.zzh.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsq, com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
