package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdph {
    final /* synthetic */ zzdpi zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdph(zzdpi zzdpiVar) {
        this.zza = zzdpiVar;
    }

    public static /* bridge */ /* synthetic */ zzdph zza(zzdph zzdphVar) {
        Map map;
        Map map2 = zzdphVar.zzb;
        map = zzdphVar.zza.zzc;
        map2.putAll(map);
        return zzdphVar;
    }

    public final zzdph zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdph zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdph zzd(zzeyc zzeycVar) {
        this.zzb.put("aai", zzeycVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgC)).booleanValue()) {
            zzc("rid", zzeycVar.zzao);
        }
        return this;
    }

    public final zzdph zze(zzeyf zzeyfVar) {
        this.zzb.put("gqi", zzeyfVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdpn zzdpnVar;
        zzdpnVar = this.zza.zza;
        return zzdpnVar.zzb(this.zzb);
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // java.lang.Runnable
            public final void run() {
                zzdph.this.zzi();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // java.lang.Runnable
            public final void run() {
                zzdph.this.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdpn zzdpnVar;
        zzdpnVar = this.zza.zza;
        zzdpnVar.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdpn zzdpnVar;
        zzdpnVar = this.zza.zza;
        zzdpnVar.zzd(this.zzb);
    }
}
