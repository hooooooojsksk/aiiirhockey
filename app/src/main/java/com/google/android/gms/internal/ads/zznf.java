package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zznf implements zzlb {
    private final zzdm zza;
    private final zzck zzb;
    private final zzcm zzc;
    private final zzne zzd;
    private final SparseArray zze;
    private zzeb zzf;
    private zzcg zzg;
    private zzdv zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zznf zznfVar) {
        final zzlc zzU = zznfVar.zzU();
        zznfVar.zzZ(zzU, 1028, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
        zznfVar.zzf.zze();
    }

    private final zzlc zzab(int i, zzss zzssVar) {
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        if (zzssVar != null) {
            if (this.zzd.zza(zzssVar) != null) {
                return zzaa(zzssVar);
            }
            return zzV(zzcn.zza, i, zzssVar);
        }
        zzcn zzq = zzcgVar.zzq();
        if (i >= zzq.zzc()) {
            zzq = zzcn.zza;
        }
        return zzV(zzq, i, null);
    }

    private final zzlc zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzlc zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzlc zzae(zzbw zzbwVar) {
        zzbn zzbnVar;
        if (!(zzbwVar instanceof zzhj) || (zzbnVar = ((zzhj) zzbwVar).zzj) == null) {
            return zzU();
        }
        return zzaa(new zzss(zzbnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzA(final String str) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1012, new zzdy() { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzB(final zzhb zzhbVar) {
        final zzlc zzac = zzac();
        zzZ(zzac, 1013, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzC(final zzhb zzhbVar) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1007, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzD(final zzaf zzafVar, final zzhc zzhcVar) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1009, new zzdy() { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zze(zzlc.this, zzafVar, zzhcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzE(long j) {
        zzlc zzad = zzad();
        zzZ(zzad, 1010, new zzdy(j) { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzF(final Exception exc) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1014, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzG(int i, long j, long j2) {
        zzlc zzad = zzad();
        zzZ(zzad, 1011, new zzdy(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzli
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzH(final int i, final long j) {
        final zzlc zzac = zzac();
        zzZ(zzac, 1018, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzh(zzlc.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzI(final Object obj, final long j) {
        final zzlc zzad = zzad();
        zzZ(zzad, 26, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj2) {
                ((zzle) obj2).zzn(zzlc.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzJ(final Exception exc) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1030, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlo
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzK(String str, long j, long j2) {
        zzlc zzad = zzad();
        zzZ(zzad, 1016, new zzdy(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzlz
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzL(final String str) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1019, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzM(final zzhb zzhbVar) {
        final zzlc zzac = zzac();
        zzZ(zzac, 1020, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzo(zzlc.this, zzhbVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzN(final zzhb zzhbVar) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1015, new zzdy() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzO(long j, int i) {
        zzlc zzac = zzac();
        zzZ(zzac, 1021, new zzdy(j, i) { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzP(final zzaf zzafVar, final zzhc zzhcVar) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1017, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzp(zzlc.this, zzafVar, zzhcVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzQ() {
        zzdv zzdvVar = this.zzh;
        zzdl.zzb(zzdvVar);
        zzdvVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // java.lang.Runnable
            public final void run() {
                zznf.zzW(zznf.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzR(zzle zzleVar) {
        this.zzf.zzf(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzS(final zzcg zzcgVar, Looper looper) {
        zzfqk zzfqkVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfqkVar = this.zzd.zzb;
            if (!zzfqkVar.isEmpty()) {
                z = false;
            }
        }
        zzdl.zzf(z);
        Objects.requireNonNull(zzcgVar);
        this.zzg = zzcgVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdz() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdz
            public final void zza(Object obj, zzaa zzaaVar) {
                zznf.this.zzX(zzcgVar, (zzle) obj, zzaaVar);
            }
        });
    }

    protected final zzlc zzU() {
        return zzaa(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzlc zzV(zzcn zzcnVar, int i, zzss zzssVar) {
        boolean z = true;
        zzss zzssVar2 = true == zzcnVar.zzo() ? null : zzssVar;
        long zza = this.zza.zza();
        z = (zzcnVar.equals(this.zzg.zzq()) && i == this.zzg.zzg()) ? false : false;
        long j = 0;
        if (zzssVar2 == null || !zzssVar2.zzb()) {
            if (z) {
                j = this.zzg.zzm();
            } else if (!zzcnVar.zzo()) {
                long j2 = zzcnVar.zze(i, this.zzc, 0L).zzm;
                j = zzew.zzz(0L);
            }
        } else if (z && this.zzg.zze() == zzssVar2.zzb && this.zzg.zzf() == zzssVar2.zzc) {
            j = this.zzg.zzn();
        }
        return new zzlc(zza, zzcnVar, i, zzssVar2, j, this.zzg.zzq(), this.zzg.zzg(), this.zzd.zzb(), this.zzg.zzn(), this.zzg.zzp());
    }

    public final /* synthetic */ void zzX(zzcg zzcgVar, zzle zzleVar, zzaa zzaaVar) {
        zzleVar.zzi(zzcgVar, new zzld(zzaaVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzY(final int i, final long j, final long j2) {
        final zzlc zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, 1006, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzf(zzlc.this, i, j, j2);
            }
        });
    }

    protected final void zzZ(zzlc zzlcVar, int i, zzdy zzdyVar) {
        this.zze.put(i, zzlcVar);
        zzeb zzebVar = this.zzf;
        zzebVar.zzd(i, zzdyVar);
        zzebVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zza(final zzcc zzccVar) {
        final zzlc zzU = zzU();
        zzZ(zzU, 13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaf(int i, zzss zzssVar, final zzso zzsoVar) {
        final zzlc zzab = zzab(i, zzssVar);
        zzZ(zzab, 1004, new zzdy() { // from class: com.google.android.gms.internal.ads.zzln
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzg(zzlc.this, zzsoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzag(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final zzlc zzab = zzab(i, zzssVar);
        zzZ(zzab, 1002, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzah(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final zzlc zzab = zzab(i, zzssVar);
        zzZ(zzab, 1001, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzai(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar, final IOException iOException, final boolean z) {
        final zzlc zzab = zzab(i, zzssVar);
        zzZ(zzab, 1003, new zzdy() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzj(zzlc.this, zzsjVar, zzsoVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zztc
    public final void zzaj(int i, zzss zzssVar, final zzsj zzsjVar, final zzso zzsoVar) {
        final zzlc zzab = zzab(i, zzssVar);
        zzZ(zzab, 1000, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzb(final zzt zztVar) {
        final zzlc zzU = zzU();
        zzZ(zzU, 29, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlu
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzc(int i, boolean z) {
        zzlc zzU = zzU();
        zzZ(zzU, 30, new zzdy(i, z) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzd(boolean z) {
        zzlc zzU = zzU();
        zzZ(zzU, 3, new zzdy(z) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zze(boolean z) {
        zzlc zzU = zzU();
        zzZ(zzU, 7, new zzdy(z) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzf(zzbg zzbgVar, int i) {
        zzlc zzU = zzU();
        zzZ(zzU, 1, new zzdy(zzbgVar, i) { // from class: com.google.android.gms.internal.ads.zzmo
            public final /* synthetic */ zzbg zzb;

            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzg(final zzbm zzbmVar) {
        final zzlc zzU = zzU();
        zzZ(zzU, 14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzh(boolean z, int i) {
        zzlc zzU = zzU();
        zzZ(zzU, 5, new zzdy(z, i) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzi(final zzby zzbyVar) {
        final zzlc zzU = zzU();
        zzZ(zzU, 12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlk
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzj(final int i) {
        final zzlc zzU = zzU();
        zzZ(zzU, 4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzk(zzlc.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzk(int i) {
        zzlc zzU = zzU();
        zzZ(zzU, 6, new zzdy(i) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzl(final zzbw zzbwVar) {
        final zzlc zzae = zzae(zzbwVar);
        zzZ(zzae, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                ((zzle) obj).zzl(zzlc.this, zzbwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzm(final zzbw zzbwVar) {
        final zzlc zzae = zzae(zzbwVar);
        zzZ(zzae, 10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzn(boolean z, int i) {
        zzlc zzU = zzU();
        zzZ(zzU, -1, new zzdy(z, i) { // from class: com.google.android.gms.internal.ads.zzlf
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzp() {
        final zzlc zzU = zzU();
        zzZ(zzU, -1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzq(boolean z) {
        zzlc zzad = zzad();
        zzZ(zzad, 23, new zzdy(z) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzr(int i, int i2) {
        zzlc zzad = zzad();
        zzZ(zzad, 24, new zzdy(i, i2) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzt(final zzcy zzcyVar) {
        final zzlc zzU = zzU();
        zzZ(zzU, 2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzu(final zzda zzdaVar) {
        final zzlc zzad = zzad();
        zzZ(zzad, 25, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzlc zzlcVar = zzlc.this;
                zzda zzdaVar2 = zzdaVar;
                ((zzle) obj).zzq(zzlcVar, zzdaVar2);
                int i = zzdaVar2.zzc;
                int i2 = zzdaVar2.zzd;
                int i3 = zzdaVar2.zze;
                float f = zzdaVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzv(float f) {
        zzlc zzad = zzad();
        zzZ(zzad, 22, new zzdy(f) { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzw(zzle zzleVar) {
        this.zzf.zzb(zzleVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzx() {
        if (this.zzi) {
            return;
        }
        final zzlc zzU = zzU();
        this.zzi = true;
        zzZ(zzU, -1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzy(final Exception exc) {
        final zzlc zzad = zzad();
        zzZ(zzad, 1029, new zzdy() { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzz(String str, long j, long j2) {
        zzlc zzad = zzad();
        zzZ(zzad, 1008, new zzdy(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmh
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    private final zzlc zzaa(zzss zzssVar) {
        Objects.requireNonNull(this.zzg);
        zzcn zza = zzssVar == null ? null : this.zzd.zza(zzssVar);
        if (zzssVar == null || zza == null) {
            int zzg = this.zzg.zzg();
            zzcn zzq = this.zzg.zzq();
            if (zzg >= zzq.zzc()) {
                zzq = zzcn.zza;
            }
            return zzV(zzq, zzg, null);
        }
        return zzV(zza, zza.zzn(zzssVar.zza, this.zzb).zzd, zzssVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzT(List list, zzss zzssVar) {
        zzne zzneVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        zzneVar.zzh(list, zzssVar, zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzo(final zzcf zzcfVar, final zzcf zzcfVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzne zzneVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        zzneVar.zzg(zzcgVar);
        final zzlc zzU = zzU();
        zzZ(zzU, 11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzls
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
                zzleVar.zzm(zzlc.this, zzcfVar, zzcfVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzs(zzcn zzcnVar, int i) {
        zzne zzneVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        zzneVar.zzi(zzcgVar);
        zzlc zzU = zzU();
        zzZ(zzU, 0, new zzdy(i) { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final void zza(Object obj) {
                zzle zzleVar = (zzle) obj;
            }
        });
    }

    public zznf(zzdm zzdmVar) {
        Objects.requireNonNull(zzdmVar);
        this.zza = zzdmVar;
        this.zzf = new zzeb(zzew.zzE(), zzdmVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzdz
            public final void zza(Object obj, zzaa zzaaVar) {
                zzle zzleVar = (zzle) obj;
            }
        });
        zzck zzckVar = new zzck();
        this.zzb = zzckVar;
        this.zzc = new zzcm();
        this.zzd = new zzne(zzckVar);
        this.zze = new SparseArray();
    }
}
