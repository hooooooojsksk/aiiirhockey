package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdnd {
    private final zzezq zza;
    private final zzdna zzb;

    public zzdnd(zzezq zzezqVar, zzdna zzdnaVar) {
        this.zza = zzezqVar;
        this.zzb = zzdnaVar;
    }

    final zzbnf zza() throws RemoteException {
        zzbnf zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzbza.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbpc zzb(String str) throws RemoteException {
        zzbpc zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzezs zzc(String str, JSONObject jSONObject) throws zzezc {
        zzbni zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbof(new AdMobAdapter());
            } else if (!"com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbnf zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        zzbza.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            } else {
                zzb = new zzbof(new zzbpu());
            }
            zzezs zzezsVar = new zzezs(zzb);
            this.zzb.zzd(str, zzezsVar);
            return zzezsVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzezc(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
