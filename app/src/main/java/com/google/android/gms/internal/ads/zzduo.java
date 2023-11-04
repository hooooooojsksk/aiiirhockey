package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.os.EnvironmentCompat;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzduo {
    private final zzcgd zza;
    private final Context zzb;
    private final zzbzg zzc;
    private final zzeyx zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfen zzg;
    private final zzezj zzh;
    private final zzdpd zzi;

    public zzduo(zzcgd zzcgdVar, Context context, zzbzg zzbzgVar, zzeyx zzeyxVar, Executor executor, String str, zzfen zzfenVar, zzdpd zzdpdVar) {
        this.zza = zzcgdVar;
        this.zzb = context;
        this.zzc = zzbzgVar;
        this.zzd = zzeyxVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfenVar;
        this.zzh = zzcgdVar.zzv();
        this.zzi = zzdpdVar;
    }

    private final zzfut zzc(final String str, final String str2) {
        zzfec zza = zzfeb.zza(this.zzb, 11);
        zza.zzh();
        final zzblv zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy()).zza("google.afma.response.normalize", zzbmc.zza, zzbmc.zza);
        zzfut zzm = zzfuj.zzm(zzfuj.zzm(zzfuj.zzm(zzfuj.zzh(""), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdul
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfuj.zzh(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdum
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzblv.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdun
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzduo.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfem.zza(zzm, this.zzg, zza);
        return zzm;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzbza.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzfut zza() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzduo.zza():com.google.android.gms.internal.ads.zzfut");
    }

    public final /* synthetic */ zzfut zzb(JSONObject jSONObject) throws Exception {
        return zzfuj.zzh(new zzeyo(new zzeyl(this.zzd), zzeyn.zza(new StringReader(jSONObject.toString()))));
    }
}
