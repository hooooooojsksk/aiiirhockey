package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzkc implements zztc, zzpu {
    final /* synthetic */ zzkg zza;
    private final zzke zzb;

    public zzkc(zzkg zzkgVar, zzke zzkeVar) {
        this.zza = zzkgVar;
        this.zzb = zzkeVar;
    }

    private final Pair zzf(int i, zzss zzssVar) {
        zzss zzssVar2;
        zzss zzssVar3 = null;
        if (zzssVar != null) {
            zzke zzkeVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkeVar.zzc.size()) {
                    zzssVar2 = null;
                    break;
                } else if (((zzss) zzkeVar.zzc.get(i2)).zzd == zzssVar.zzd) {
                    zzssVar2 = zzssVar.zzc(Pair.create(zzkeVar.zzb, zzssVar.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzssVar2 == null) {
                return null;
            }
            zzssVar3 = zzssVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzssVar3);
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaf(int i, zzss zzssVar, final zzso zzsoVar) {
        zzdv zzdvVar;
        final Pair zzf = zzf(0, zzssVar);
        if (zzf != null) {
            zzdvVar = this.zza.zzi;
            zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar;
                    zzkc zzkcVar = zzkc.this;
                    Pair pair = zzf;
                    zzso zzsoVar2 = zzsoVar;
                    zzlbVar = zzkcVar.zza.zzh;
                    zzlbVar.zzaf(((Integer) pair.first).intValue(), (zzss) pair.second, zzsoVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzag(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        zzdv zzdvVar;
        final Pair zzf = zzf(0, zzssVar);
        if (zzf != null) {
            zzdvVar = this.zza.zzi;
            zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjz
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar;
                    zzkc zzkcVar = zzkc.this;
                    Pair pair = zzf;
                    zzsj zzsjVar2 = zzsjVar;
                    zzso zzsoVar2 = zzsoVar;
                    zzlbVar = zzkcVar.zza.zzh;
                    zzlbVar.zzag(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar2, zzsoVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzah(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        zzdv zzdvVar;
        final Pair zzf = zzf(0, zzssVar);
        if (zzf != null) {
            zzdvVar = this.zza.zzi;
            zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar;
                    zzkc zzkcVar = zzkc.this;
                    Pair pair = zzf;
                    zzsj zzsjVar2 = zzsjVar;
                    zzso zzsoVar2 = zzsoVar;
                    zzlbVar = zzkcVar.zza.zzh;
                    zzlbVar.zzah(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar2, zzsoVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzai(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar, final IOException iOException, final boolean z) {
        zzdv zzdvVar;
        final Pair zzf = zzf(0, zzssVar);
        if (zzf != null) {
            zzdvVar = this.zza.zzi;
            zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar;
                    zzkc zzkcVar = zzkc.this;
                    Pair pair = zzf;
                    zzsj zzsjVar2 = zzsjVar;
                    zzso zzsoVar2 = zzsoVar;
                    IOException iOException2 = iOException;
                    boolean z2 = z;
                    zzlbVar = zzkcVar.zza.zzh;
                    zzlbVar.zzai(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar2, zzsoVar2, iOException2, z2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaj(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        zzdv zzdvVar;
        final Pair zzf = zzf(0, zzssVar);
        if (zzf != null) {
            zzdvVar = this.zza.zzi;
            zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkb
                @Override // java.lang.Runnable
                public final void run() {
                    zzlb zzlbVar;
                    zzkc zzkcVar = zzkc.this;
                    Pair pair = zzf;
                    zzsj zzsjVar2 = zzsjVar;
                    zzso zzsoVar2 = zzsoVar;
                    zzlbVar = zzkcVar.zza.zzh;
                    zzlbVar.zzaj(((Integer) pair.first).intValue(), (zzss) pair.second, zzsjVar2, zzsoVar2);
                }
            });
        }
    }
}
