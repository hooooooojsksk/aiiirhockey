package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbak {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbaj zzbajVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbav.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbaj zzbajVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbav.zzb());
        return zza;
    }

    public final void zzc(zzbaj zzbajVar) {
        this.zzb.add(zzbajVar);
    }

    public final void zzd(zzbaj zzbajVar) {
        this.zza.add(zzbajVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbaj zzbajVar : this.zza) {
            if (zzbajVar.zze() == 1) {
                zzbajVar.zzd(editor, zzbajVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbza.zzg("Flag Json is null.");
        }
    }
}
