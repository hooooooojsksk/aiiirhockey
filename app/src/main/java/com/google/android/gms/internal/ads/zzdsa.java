package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdsa {
    private final zzdrk zza;
    private final zzdna zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdsa(zzdrk zzdrkVar, zzdna zzdnaVar) {
        this.zza = zzdrkVar;
        this.zzb = zzdnaVar;
    }

    public final void zzd(List list) {
        String str;
        boolean z;
        zzdmz zza;
        zzbpq zzbpqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbjl zzbjlVar = (zzbjl) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziz)).booleanValue()) {
                    zzdmz zza2 = this.zzb.zza(zzbjlVar.zza);
                    if (zza2 != null && (zzbpqVar = zza2.zzc) != null) {
                        str = zzbpqVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue() && (zza = this.zzb.zza(zzbjlVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbjlVar.zza;
                    list2.add(new zzdrz(str3, str2, this.zzb.zzc(str3), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbjlVar.zza;
                list22.add(new zzdrz(str32, str2, this.zzb.zzc(str32), zzbjlVar.zzb ? 1 : 0, zzbjlVar.zzd, zzbjlVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdrz zzdrzVar : this.zzd) {
                jSONArray.put(zzdrzVar.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdry(this));
    }
}
