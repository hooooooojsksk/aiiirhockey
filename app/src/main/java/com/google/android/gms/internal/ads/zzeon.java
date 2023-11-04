package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeon implements zzepn {
    final String zza;
    private final zzfuu zzb;
    private final ScheduledExecutorService zzc;
    private final zzegx zzd;
    private final Context zze;
    private final zzeyx zzf;
    private final zzegt zzg;
    private final zzdnd zzh;
    private final zzdrm zzi;

    public zzeon(zzfuu zzfuuVar, ScheduledExecutorService scheduledExecutorService, String str, zzegx zzegxVar, Context context, zzeyx zzeyxVar, zzegt zzegtVar, zzdnd zzdndVar, zzdrm zzdrmVar) {
        this.zzb = zzfuuVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzegxVar;
        this.zze = context;
        this.zzf = zzeyxVar;
        this.zzg = zzegtVar;
        this.zzh = zzdndVar;
        this.zzi = zzdrmVar;
    }

    public static /* synthetic */ zzfut zzc(zzeon zzeonVar) {
        String str;
        final Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzji)).booleanValue()) {
            str = zzeonVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzeonVar.zzf.zzf;
        }
        Map zza = zzeonVar.zzd.zza(zzeonVar.zza, str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbw)).booleanValue()) {
            bundle = zzeonVar.zzi.zzg();
        } else {
            bundle = new Bundle();
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfqn) zza).entrySet().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle3 = zzeonVar.zzf.zzd.zzm;
            if (bundle3 != null) {
                bundle2 = bundle3.getBundle(str2);
            }
            arrayList.add(zzeonVar.zzf(str2, list, bundle2, true, true));
        }
        for (Map.Entry entry2 : ((zzfqn) zzeonVar.zzd.zzb()).entrySet()) {
            zzehb zzehbVar = (zzehb) entry2.getValue();
            String str3 = zzehbVar.zza;
            Bundle bundle4 = zzeonVar.zzf.zzd.zzm;
            arrayList.add(zzeonVar.zzf(str3, Collections.singletonList(zzehbVar.zzd), bundle4 != null ? bundle4.getBundle(str3) : null, zzehbVar.zzb, zzehbVar.zzc));
        }
        return zzfuj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfut> list2 = arrayList;
                Bundle bundle5 = bundle;
                JSONArray jSONArray = new JSONArray();
                for (zzfut zzfutVar : list2) {
                    if (((JSONObject) zzfutVar.get()) != null) {
                        jSONArray.put(zzfutVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeoo(jSONArray.toString(), bundle5);
            }
        }, zzeonVar.zzb);
    }

    private final zzfua zzf(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfua zzv = zzfua.zzv(zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return zzeon.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbs)).booleanValue()) {
            zzv = (zzfua) zzfuj.zzn(zzv, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfua) zzfuj.zze(zzv, Throwable.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbza.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzg(zzbpc zzbpcVar, Bundle bundle, List list, zzeha zzehaVar) throws RemoteException {
        zzbpcVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzehaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzk(new zzftp() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzftp
            public final zzfut zza() {
                return zzeon.zzc(zzeon.this);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfut zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbpc zzbpcVar;
        final zzbzs zzbzsVar = new zzbzs();
        if (z2) {
            this.zzg.zzb(str);
            zzbpcVar = this.zzg.zza(str);
        } else {
            try {
                zzbpcVar = this.zzh.zzb(str);
            } catch (RemoteException e) {
                zzbza.zzh("Couldn't create RTB adapter : ", e);
                zzbpcVar = null;
            }
        }
        if (zzbpcVar == null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbn)).booleanValue()) {
                zzeha.zzb(str, zzbzsVar);
            } else {
                throw null;
            }
        } else {
            final zzeha zzehaVar = new zzeha(str, zzbpcVar, zzbzsVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbs)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeha.this.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbx)).booleanValue()) {
                    final zzbpc zzbpcVar2 = zzbpcVar;
                    this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeon.this.zze(zzbpcVar2, bundle, list, zzehaVar, zzbzsVar);
                        }
                    });
                } else {
                    zzg(zzbpcVar, bundle, list, zzehaVar);
                }
            } else {
                zzehaVar.zzd();
            }
        }
        return zzbzsVar;
    }

    public final /* synthetic */ void zze(zzbpc zzbpcVar, Bundle bundle, List list, zzeha zzehaVar, zzbzs zzbzsVar) {
        try {
            zzg(zzbpcVar, bundle, list, zzehaVar);
        } catch (RemoteException e) {
            zzbzsVar.zze(e);
        }
    }
}
