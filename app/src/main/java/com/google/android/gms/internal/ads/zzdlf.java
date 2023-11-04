package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdlf {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzceu zzc;
    private final Context zzd;
    private final zzdpi zze;
    private final zzfdk zzf;
    private final Executor zzg;
    private final zzapw zzh;
    private final zzbzg zzi;
    private final zzeaf zzk;
    private final zzfff zzl;
    private zzfut zzm;
    private final zzdks zza = new zzdks();
    private final zzbid zzj = new zzbid();

    public zzdlf(zzdlc zzdlcVar) {
        Context context;
        Executor executor;
        zzapw zzapwVar;
        zzbzg zzbzgVar;
        com.google.android.gms.ads.internal.zza zzaVar;
        zzceu zzceuVar;
        zzeaf zzeafVar;
        zzfff zzfffVar;
        zzdpi zzdpiVar;
        zzfdk zzfdkVar;
        context = zzdlcVar.zzc;
        this.zzd = context;
        executor = zzdlcVar.zzg;
        this.zzg = executor;
        zzapwVar = zzdlcVar.zzh;
        this.zzh = zzapwVar;
        zzbzgVar = zzdlcVar.zzi;
        this.zzi = zzbzgVar;
        zzaVar = zzdlcVar.zza;
        this.zzb = zzaVar;
        this.zza = new zzdks();
        zzceuVar = zzdlcVar.zzb;
        this.zzc = zzceuVar;
        this.zzj = new zzbid();
        zzeafVar = zzdlcVar.zzf;
        this.zzk = zzeafVar;
        zzfffVar = zzdlcVar.zzj;
        this.zzl = zzfffVar;
        zzdpiVar = zzdlcVar.zzd;
        this.zze = zzdpiVar;
        zzfdkVar = zzdlcVar.zze;
        this.zzf = zzfdkVar;
    }

    public final /* synthetic */ zzcei zza(zzcei zzceiVar) {
        zzceiVar.zzad("/result", this.zzj);
        zzcfv zzN = zzceiVar.zzN();
        zzdks zzdksVar = this.zza;
        zzN.zzM(null, zzdksVar, zzdksVar, zzdksVar, zzdksVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null);
        return zzceiVar;
    }

    public final /* synthetic */ zzfut zzc(String str, JSONObject jSONObject, zzcei zzceiVar) throws Exception {
        return this.zzj.zzb(zzceiVar, str, jSONObject);
    }

    public final synchronized zzfut zzd(final String str, final JSONObject jSONObject) {
        zzfut zzfutVar = this.zzm;
        if (zzfutVar == null) {
            return zzfuj.zzh(null);
        }
        return zzfuj.zzm(zzfutVar, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzdlf.this.zzc(str, jSONObject, (zzcei) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzeyc zzeycVar, zzeyf zzeyfVar) {
        zzfut zzfutVar = this.zzm;
        if (zzfutVar == null) {
            return;
        }
        zzfuj.zzq(zzfutVar, new zzdkz(this, zzeycVar, zzeyfVar), this.zzg);
    }

    public final synchronized void zzf() {
        zzfut zzfutVar = this.zzm;
        if (zzfutVar == null) {
            return;
        }
        zzfuj.zzq(zzfutVar, new zzdkv(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfut zzfutVar = this.zzm;
        if (zzfutVar == null) {
            return;
        }
        zzfuj.zzq(zzfutVar, new zzdky(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzbzg zzbzgVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdm);
        final zzapw zzapwVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzfut zzl = zzfuj.zzl(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzcer
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                Context context2 = context;
                zzapw zzapwVar2 = zzapwVar;
                zzbzg zzbzgVar2 = zzbzgVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcei zza = zzceu.zza(context2, zzcfx.zza(), "", false, false, zzapwVar2, null, zzbzgVar2, null, null, zzaVar2, zzawe.zza(), null, null);
                final zzbzr zza2 = zzbzr.zza(zza);
                zza.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzces
                    @Override // com.google.android.gms.internal.ads.zzcft
                    public final void zza(boolean z) {
                        zzbzr.this.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzbzn.zze), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdku
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                zzcei zzceiVar = (zzcei) obj;
                zzdlf.this.zza(zzceiVar);
                return zzceiVar;
            }
        }, this.zzg);
        this.zzm = zzl;
        zzbzq.zza(zzl, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbhp zzbhpVar) {
        zzfut zzfutVar = this.zzm;
        if (zzfutVar == null) {
            return;
        }
        zzfuj.zzq(zzfutVar, new zzdkw(this, str, zzbhpVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbhp zzbhpVar) {
        zzi(str, new zzdle(this, weakReference, str, zzbhpVar, null));
    }

    public final synchronized void zzk(String str, zzbhp zzbhpVar) {
        zzfut zzfutVar = this.zzm;
        if (zzfutVar == null) {
            return;
        }
        zzfuj.zzq(zzfutVar, new zzdkx(this, str, zzbhpVar), this.zzg);
    }
}
