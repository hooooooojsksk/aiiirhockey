package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zztk extends zzsb {
    private static final zzbg zza;
    private final zzsu[] zzb;
    private final zzcn[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfrg zzf;
    private int zzg;
    private long[][] zzh;
    private zztj zzi;
    private final zzsd zzj;

    static {
        zzaj zzajVar = new zzaj();
        zzajVar.zza("MergingMediaSource");
        zza = zzajVar.zzc();
    }

    public zztk(boolean z, boolean z2, zzsu... zzsuVarArr) {
        zzsd zzsdVar = new zzsd();
        this.zzb = zzsuVarArr;
        this.zzj = zzsdVar;
        this.zzd = new ArrayList(Arrays.asList(zzsuVarArr));
        this.zzg = -1;
        this.zzc = new zzcn[zzsuVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfrn.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzF(zzsq zzsqVar) {
        zzti zztiVar = (zzti) zzsqVar;
        int i = 0;
        while (true) {
            zzsu[] zzsuVarArr = this.zzb;
            if (i >= zzsuVarArr.length) {
                return;
            }
            zzsuVarArr[i].zzF(zztiVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final zzsq zzH(zzss zzssVar, zzwt zzwtVar, long j) {
        int length = this.zzb.length;
        zzsq[] zzsqVarArr = new zzsq[length];
        int zza2 = this.zzc[0].zza(zzssVar.zza);
        for (int i = 0; i < length; i++) {
            zzsqVarArr[i] = this.zzb[i].zzH(zzssVar.zzc(this.zzc[i].zzf(zza2)), zzwtVar, j - this.zzh[zza2][i]);
        }
        return new zzti(this.zzj, this.zzh[zza2], zzsqVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final zzbg zzI() {
        zzsu[] zzsuVarArr = this.zzb;
        return zzsuVarArr.length > 0 ? zzsuVarArr[0].zzI() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsb, com.google.android.gms.internal.ads.zzrt
    public final void zzn(zzgi zzgiVar) {
        super.zzn(zzgiVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzA(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsb, com.google.android.gms.internal.ads.zzrt
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final /* bridge */ /* synthetic */ zzss zzx(Object obj, zzss zzssVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzssVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsb, com.google.android.gms.internal.ads.zzsu
    public final void zzy() throws IOException {
        zztj zztjVar = this.zzi;
        if (zztjVar != null) {
            throw zztjVar;
        }
        super.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final /* bridge */ /* synthetic */ void zzz(Object obj, zzsu zzsuVar, zzcn zzcnVar) {
        int i;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i = zzcnVar.zzb();
            this.zzg = i;
        } else {
            int zzb = zzcnVar.zzb();
            int i2 = this.zzg;
            if (zzb != i2) {
                this.zzi = new zztj(0);
                return;
            }
            i = i2;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(long.class, i, this.zzc.length);
        }
        this.zzd.remove(zzsuVar);
        this.zzc[((Integer) obj).intValue()] = zzcnVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }
}
