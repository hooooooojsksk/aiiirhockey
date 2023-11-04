package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzkg {
    private final zzno zza;
    private final zzkf zze;
    private final zzlb zzh;
    private final zzdv zzi;
    private boolean zzj;
    private zzgi zzk;
    private zzum zzl = new zzum(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzkg(zzkf zzkfVar, zzlb zzlbVar, zzdv zzdvVar, zzno zznoVar) {
        this.zza = zznoVar;
        this.zze = zzkfVar;
        this.zzh = zzlbVar;
        this.zzi = zzdvVar;
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzke) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzke zzkeVar) {
        zzkd zzkdVar = (zzkd) this.zzf.get(zzkeVar);
        if (zzkdVar != null) {
            zzkdVar.zza.zzi(zzkdVar.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzke zzkeVar = (zzke) it.next();
            if (zzkeVar.zzc.isEmpty()) {
                zzq(zzkeVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzke zzkeVar) {
        if (zzkeVar.zze && zzkeVar.zzc.isEmpty()) {
            zzkd zzkdVar = (zzkd) this.zzf.remove(zzkeVar);
            Objects.requireNonNull(zzkdVar);
            zzkdVar.zza.zzp(zzkdVar.zzb);
            zzkdVar.zza.zzs(zzkdVar.zzc);
            zzkdVar.zza.zzr(zzkdVar.zzc);
            this.zzg.remove(zzkeVar);
        }
    }

    private final void zzt(zzke zzkeVar) {
        zzsn zzsnVar = zzkeVar.zza;
        zzst zzstVar = new zzst() { // from class: com.google.android.gms.internal.ads.zzjw
            @Override // com.google.android.gms.internal.ads.zzst
            public final void zza(zzsu zzsuVar, zzcn zzcnVar) {
                zzkg.this.zze(zzsuVar, zzcnVar);
            }
        };
        zzkc zzkcVar = new zzkc(this, zzkeVar);
        this.zzf.put(zzkeVar, new zzkd(zzsnVar, zzstVar, zzkcVar));
        zzsnVar.zzh(new Handler(zzew.zzE(), null), zzkcVar);
        zzsnVar.zzg(new Handler(zzew.zzE(), null), zzkcVar);
        zzsnVar.zzm(zzstVar, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzke zzkeVar = (zzke) this.zzb.remove(i2);
            this.zzd.remove(zzkeVar.zzb);
            zzp(i2, -zzkeVar.zza.zzB().zzc());
            zzkeVar.zze = true;
            if (this.zzj) {
                zzs(zzkeVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzcn zzb() {
        if (!this.zzb.isEmpty()) {
            int i = 0;
            for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                zzke zzkeVar = (zzke) this.zzb.get(i2);
                zzkeVar.zzd = i;
                i += zzkeVar.zza.zzB().zzc();
            }
            return new zzkl(this.zzb, this.zzl, null);
        }
        return zzcn.zza;
    }

    public final /* synthetic */ void zze(zzsu zzsuVar, zzcn zzcnVar) {
        this.zze.zzh();
    }

    public final void zzf(zzgi zzgiVar) {
        zzdl.zzf(!this.zzj);
        this.zzk = zzgiVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzke zzkeVar = (zzke) this.zzb.get(i);
            zzt(zzkeVar);
            this.zzg.add(zzkeVar);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzkd zzkdVar : this.zzf.values()) {
            try {
                zzkdVar.zza.zzp(zzkdVar.zzb);
            } catch (RuntimeException e) {
                zzee.zzc("MediaSourceList", "Failed to release child source.", e);
            }
            zzkdVar.zza.zzs(zzkdVar.zzc);
            zzkdVar.zza.zzr(zzkdVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzh(zzsq zzsqVar) {
        zzke zzkeVar = (zzke) this.zzc.remove(zzsqVar);
        Objects.requireNonNull(zzkeVar);
        zzkeVar.zza.zzF(zzsqVar);
        zzkeVar.zzc.remove(((zzsk) zzsqVar).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzkeVar);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzcn zzj(int i, List list, zzum zzumVar) {
        if (!list.isEmpty()) {
            this.zzl = zzumVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzke zzkeVar = (zzke) list.get(i2 - i);
                if (i2 > 0) {
                    zzke zzkeVar2 = (zzke) this.zzb.get(i2 - 1);
                    zzkeVar.zzc(zzkeVar2.zzd + zzkeVar2.zza.zzB().zzc());
                } else {
                    zzkeVar.zzc(0);
                }
                zzp(i2, zzkeVar.zza.zzB().zzc());
                this.zzb.add(i2, zzkeVar);
                this.zzd.put(zzkeVar.zzb, zzkeVar);
                if (this.zzj) {
                    zzt(zzkeVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkeVar);
                    } else {
                        zzq(zzkeVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzcn zzk(int i, int i2, int i3, zzum zzumVar) {
        zzdl.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzcn zzl(int i, int i2, zzum zzumVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdl.zzd(z);
        this.zzl = zzumVar;
        zzu(i, i2);
        return zzb();
    }

    public final zzcn zzm(List list, zzum zzumVar) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzumVar);
    }

    public final zzcn zzn(zzum zzumVar) {
        int zza = zza();
        if (zzumVar.zzc() != zza) {
            zzumVar = zzumVar.zzf().zzg(0, zza);
        }
        this.zzl = zzumVar;
        return zzb();
    }

    public final zzsq zzo(zzss zzssVar, zzwt zzwtVar, long j) {
        Object obj = zzssVar.zza;
        int i = zzkl.zzc;
        Object obj2 = ((Pair) obj).first;
        zzss zzc = zzssVar.zzc(((Pair) zzssVar.zza).second);
        zzke zzkeVar = (zzke) this.zzd.get(obj2);
        Objects.requireNonNull(zzkeVar);
        this.zzg.add(zzkeVar);
        zzkd zzkdVar = (zzkd) this.zzf.get(zzkeVar);
        if (zzkdVar != null) {
            zzkdVar.zza.zzk(zzkdVar.zzb);
        }
        zzkeVar.zzc.add(zzc);
        zzsk zzH = zzkeVar.zza.zzH(zzc, zzwtVar, j);
        this.zzc.put(zzH, zzkeVar);
        zzr();
        return zzH;
    }
}
