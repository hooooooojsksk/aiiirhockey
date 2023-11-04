package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public class zzdpp {
    protected final Executor zzc;
    protected final zzbzf zzd;
    private final zzfdu zzf;
    protected final String zza = (String) zzbce.zzb.zze();
    protected final Map zzb = new HashMap();
    protected final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbN)).booleanValue();
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbQ)).booleanValue();
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgD)).booleanValue();

    public zzdpp(Executor executor, zzbzf zzbzfVar, zzfdu zzfduVar) {
        this.zzc = executor;
        this.zzd = zzbzfVar;
        this.zzf = zzfduVar;
    }

    private final void zza(Map map, boolean z) {
        if (!map.isEmpty()) {
            final String zza = this.zzf.zza(map);
            com.google.android.gms.ads.internal.util.zze.zza(zza);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.zze) {
                if (!z || this.zzg) {
                    if (!parseBoolean || this.zzh) {
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdpp zzdppVar = zzdpp.this;
                                zzdppVar.zzd.zza(zza);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        zzbza.zze("Empty paramMap.");
    }

    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
