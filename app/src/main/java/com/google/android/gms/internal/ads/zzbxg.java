package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbxg {
    static zzbxg zza;

    public static synchronized zzbxg zzd(Context context) {
        synchronized (zzbxg.class) {
            zzbxg zzbxgVar = zza;
            if (zzbxgVar != null) {
                return zzbxgVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbar.zzc(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzbwk zzbwkVar = new zzbwk(null);
            zzbwkVar.zzb(applicationContext);
            zzbwkVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
            zzbwkVar.zza(zzh);
            zzbwkVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzbxg zze = zzbwkVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbxk zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzao)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaq));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String str : hashMap.keySet()) {
                        zzc.zzc(str);
                    }
                    zzc.zzd(new zzbxi(zzc, hashMap));
                } catch (JSONException e) {
                    zzbza.zzf("Failed to parse listening list", e);
                }
            }
            return zza;
        }
    }

    abstract zzbwd zza();

    public abstract zzbwh zzb();

    abstract zzbxk zzc();
}
