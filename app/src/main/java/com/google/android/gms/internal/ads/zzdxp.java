package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdxp extends zzbsy {
    private final Context zza;
    private final zzfuu zzb;
    private final zzdyh zzc;
    private final zzclp zzd;
    private final ArrayDeque zze;
    private final zzfep zzf;
    private final zzbtz zzg;
    private final zzdye zzh;

    public zzdxp(Context context, zzfuu zzfuuVar, zzbtz zzbtzVar, zzclp zzclpVar, zzdyh zzdyhVar, ArrayDeque arrayDeque, zzdye zzdyeVar, zzfep zzfepVar, byte[] bArr) {
        zzbar.zzc(context);
        this.zza = context;
        this.zzb = zzfuuVar;
        this.zzg = zzbtzVar;
        this.zzc = zzdyhVar;
        this.zzd = zzclpVar;
        this.zze = arrayDeque;
        this.zzh = zzdyeVar;
        this.zzf = zzfepVar;
    }

    private final synchronized zzdxm zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdxm zzdxmVar = (zzdxm) it.next();
            if (zzdxmVar.zzc.equals(str)) {
                it.remove();
                return zzdxmVar;
            }
        }
        return null;
    }

    private static zzfut zzl(zzfut zzfutVar, zzfda zzfdaVar, zzbmf zzbmfVar, zzfen zzfenVar, zzfec zzfecVar) {
        zzblv zza = zzbmfVar.zza("AFMA_getAdDictionary", zzbmc.zza, new zzblx() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzblx
            public final Object zza(JSONObject jSONObject) {
                return new zzbtq(jSONObject);
            }
        });
        zzfem.zzd(zzfutVar, zzfecVar);
        zzfcf zza2 = zzfdaVar.zzb(zzfcu.BUILD_URL, zzfutVar).zzf(zza).zza();
        zzfem.zzc(zza2, zzfenVar, zzfecVar);
        return zza2;
    }

    private static zzfut zzm(zzbtn zzbtnVar, zzfda zzfdaVar, final zzeqf zzeqfVar) {
        zzftq zzftqVar = new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzeqf.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj));
            }
        };
        return zzfdaVar.zzb(zzfcu.GMS_SIGNALS, zzfuj.zzh(zzbtnVar.zza)).zzf(zzftqVar).zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzdxm zzdxmVar) {
        zzo();
        this.zze.addLast(zzdxmVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbcr.zzd.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(zzfut zzfutVar, zzbtj zzbtjVar) {
        zzfuj.zzq(zzfuj.zzm(zzfutVar, new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxj
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzfuj.zzh(zzezw.zza((InputStream) obj));
            }
        }, zzbzn.zza), new zzdxl(this, zzbtjVar), zzbzn.zzf);
    }

    public final zzfut zzb(final zzbtn zzbtnVar, int i) {
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Split request is disabled."));
        }
        zzfaq zzfaqVar = zzbtnVar.zzi;
        if (zzfaqVar == null) {
            return zzfuj.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfaqVar.zzc == 0 || zzfaqVar.zzd == 0) {
            return zzfuj.zzg(new Exception("Caching is disabled."));
        }
        zzbmf zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzg.zza(), this.zzf);
        zzeqf zzp = this.zzd.zzp(zzbtnVar, i);
        zzfda zzc = zzp.zzc();
        final zzfut zzm = zzm(zzbtnVar, zzc, zzp);
        zzfen zzd = zzp.zzd();
        final zzfec zza = zzfeb.zza(this.zza, 9);
        final zzfut zzl = zzl(zzm, zzc, zzb, zzd, zza);
        return zzc.zza(zzfcu.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdxp.this.zzj(zzl, zzm, zzbtnVar, zza);
            }
        }).zza();
    }

    public final zzfut zzc(zzbtn zzbtnVar, int i) {
        zzfec zzfecVar;
        zzfcf zza;
        zzbmf zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzg.zza(), this.zzf);
        zzeqf zzp = this.zzd.zzp(zzbtnVar, i);
        zzblv zza2 = zzb.zza("google.afma.response.normalize", zzdxo.zza, zzbmc.zzb);
        zzdxm zzdxmVar = null;
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            String str = zzbtnVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzdxmVar = zzk(zzbtnVar.zzh);
            if (zzdxmVar == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        zzdxm zzdxmVar2 = zzdxmVar;
        if (zzdxmVar2 == null) {
            zzfecVar = zzfeb.zza(this.zza, 9);
        } else {
            zzfecVar = zzdxmVar2.zze;
        }
        zzfec zzfecVar2 = zzfecVar;
        zzfen zzd = zzp.zzd();
        zzd.zzd(zzbtnVar.zza.getStringArrayList("ad_types"));
        zzdyg zzdygVar = new zzdyg(zzbtnVar.zzg, zzd, zzfecVar2);
        zzdyd zzdydVar = new zzdyd(this.zza, zzbtnVar.zzb.zza, this.zzg, i, null);
        zzfda zzc = zzp.zzc();
        zzfec zza3 = zzfeb.zza(this.zza, 11);
        if (zzdxmVar2 == null) {
            final zzfut zzm = zzm(zzbtnVar, zzc, zzp);
            final zzfut zzl = zzl(zzm, zzc, zzb, zzd, zzfecVar2);
            zzfec zza4 = zzfeb.zza(this.zza, 10);
            final zzfcf zza5 = zzc.zza(zzfcu.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdyf((JSONObject) zzfut.this.get(), (zzbtq) zzl.get());
                }
            }).zze(zzdygVar).zze(new zzfei(zza4)).zze(zzdydVar).zza();
            zzfem.zza(zza5, zzd, zza4);
            zzfem.zzd(zza5, zza3);
            zza = zzc.zza(zzfcu.PRE_PROCESS, zzm, zzl, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdxo((zzdyc) zzfut.this.get(), (JSONObject) zzm.get(), (zzbtq) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzdyf zzdyfVar = new zzdyf(zzdxmVar2.zzb, zzdxmVar2.zza);
            zzfec zza6 = zzfeb.zza(this.zza, 10);
            final zzfcf zza7 = zzc.zzb(zzfcu.HTTP, zzfuj.zzh(zzdyfVar)).zze(zzdygVar).zze(new zzfei(zza6)).zze(zzdydVar).zza();
            zzfem.zza(zza7, zzd, zza6);
            final zzfut zzh = zzfuj.zzh(zzdxmVar2);
            zzfem.zzd(zza7, zza3);
            zza = zzc.zza(zzfcu.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfut zzfutVar = zzfut.this;
                    zzfut zzfutVar2 = zzh;
                    return new zzdxo((zzdyc) zzfutVar.get(), ((zzdxm) zzfutVar2.get()).zzb, ((zzdxm) zzfutVar2.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfem.zza(zza, zzd, zza3);
        return zza;
    }

    public final zzfut zzd(zzbtn zzbtnVar, int i) {
        zzbmf zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzg.zza(), this.zzf);
        if (!((Boolean) zzbcw.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Signal collection disabled."));
        }
        zzeqf zzp = this.zzd.zzp(zzbtnVar, i);
        final zzepq zza = zzp.zza();
        zzblv zza2 = zzb.zza("google.afma.request.getSignals", zzbmc.zza, zzbmc.zzb);
        zzfec zza3 = zzfeb.zza(this.zza, 22);
        zzfcf zza4 = zzp.zzc().zzb(zzfcu.GET_SIGNALS, zzfuj.zzh(zzbtnVar.zza)).zze(new zzfei(zza3)).zzf(new zzftq() { // from class: com.google.android.gms.internal.ads.zzdxh
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzepq.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj));
            }
        }).zzb(zzfcu.JS_SIGNALS).zzf(zza2).zza();
        zzfen zzd = zzp.zzd();
        zzd.zzd(zzbtnVar.zza.getStringArrayList("ad_types"));
        zzfem.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbck.zze.zze()).booleanValue()) {
            zzdyh zzdyhVar = this.zzc;
            zzdyhVar.getClass();
            zza4.zzc(new zzdxc(zzdyhVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zze(zzbtn zzbtnVar, zzbtj zzbtjVar) {
        zzp(zzb(zzbtnVar, Binder.getCallingUid()), zzbtjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzf(zzbtn zzbtnVar, zzbtj zzbtjVar) {
        zzp(zzd(zzbtnVar, Binder.getCallingUid()), zzbtjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzbtn zzbtnVar, zzbtj zzbtjVar) {
        zzfut zzc = zzc(zzbtnVar, Binder.getCallingUid());
        zzp(zzc, zzbtjVar);
        if (((Boolean) zzbck.zzc.zze()).booleanValue()) {
            zzdyh zzdyhVar = this.zzc;
            zzdyhVar.getClass();
            zzc.zzc(new zzdxc(zzdyhVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzh(String str, zzbtj zzbtjVar) {
        zzp(zzi(str), zzbtjVar);
    }

    public final zzfut zzi(String str) {
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            return zzfuj.zzg(new Exception("Split request is disabled."));
        }
        zzdxk zzdxkVar = new zzdxk(this);
        if (zzk(str) == null) {
            return zzfuj.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzfuj.zzh(zzdxkVar);
    }

    public final /* synthetic */ InputStream zzj(zzfut zzfutVar, zzfut zzfutVar2, zzbtn zzbtnVar, zzfec zzfecVar) throws Exception {
        String zzc = ((zzbtq) zzfutVar.get()).zzc();
        String str = zzbtnVar.zzh;
        zzn(new zzdxm((zzbtq) zzfutVar.get(), (JSONObject) zzfutVar2.get(), str, zzc, zzfecVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfnh.zzc));
    }
}
