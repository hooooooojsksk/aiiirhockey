package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdiw {
    private final zzfuu zza;
    private final zzdjj zzb;
    private final zzdjo zzc;

    public zzdiw(zzfuu zzfuuVar, zzdjj zzdjjVar, zzdjo zzdjoVar) {
        this.zza = zzfuuVar;
        this.zzb = zzdjjVar;
        this.zzc = zzdjoVar;
    }

    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar, final JSONObject jSONObject) {
        zzfut zzm;
        final zzfut zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdiu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeyo zzeyoVar2 = zzeyoVar;
                zzeyc zzeycVar2 = zzeycVar;
                JSONObject jSONObject2 = jSONObject;
                zzdgi zzdgiVar = new zzdgi();
                zzdgiVar.zzX(jSONObject2.optInt("template_id", -1));
                zzdgiVar.zzJ(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzdgiVar.zzU(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzeyx zzeyxVar = zzeyoVar2.zza.zza;
                if (zzeyxVar.zzg.contains(Integer.toString(zzdgiVar.zzc()))) {
                    if (zzdgiVar.zzc() == 3) {
                        if (zzdgiVar.zzz() == null) {
                            throw new zzeek(1, "No custom template id for custom template ad response.");
                        }
                        if (!zzeyxVar.zzh.contains(zzdgiVar.zzz())) {
                            throw new zzeek(1, "Unexpected custom template id in the response.");
                        }
                    }
                    zzdgiVar.zzV(jSONObject2.optDouble("rating", -1.0d));
                    String optString = jSONObject2.optString("headline", null);
                    if (zzeycVar2.zzN) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        optString = com.google.android.gms.ads.internal.util.zzs.zzu() + " : " + optString;
                    }
                    zzdgiVar.zzW("headline", optString);
                    zzdgiVar.zzW("body", jSONObject2.optString("body", null));
                    zzdgiVar.zzW("call_to_action", jSONObject2.optString("call_to_action", null));
                    zzdgiVar.zzW("store", jSONObject2.optString("store", null));
                    zzdgiVar.zzW(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                    zzdgiVar.zzW("advertiser", jSONObject2.optString("advertiser", null));
                    return zzdgiVar;
                }
                throw new zzeek(1, "Invalid template ID: " + zzdgiVar.zzc());
            }
        });
        final zzfut zzf = this.zzb.zzf(jSONObject, "images");
        final zzfut zzg = this.zzb.zzg(jSONObject, "images", zzeycVar, zzeyoVar.zzb.zzb);
        final zzfut zze = this.zzb.zze(jSONObject, "secondary_image");
        final zzfut zze2 = this.zzb.zze(jSONObject, "app_icon");
        final zzfut zzd = this.zzb.zzd(jSONObject, "attribution");
        final zzfut zzh = this.zzb.zzh(jSONObject, zzeycVar, zzeyoVar.zzb.zzb);
        final zzfut zza = this.zzc.zza(jSONObject, "custom_assets");
        final zzdjj zzdjjVar = this.zzb;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzm = zzfuj.zzh(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzm = zzfuj.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzm = zzfuj.zzh(null);
                } else {
                    zzm = zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzdiy
                        @Override // com.google.android.gms.internal.ads.zzftq
                        public final zzfut zza(Object obj) {
                            return zzdjj.this.zzc(optString, obj);
                        }
                    }, zzbzn.zze);
                }
            }
        }
        final zzfut zzfutVar = zzm;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeI)).booleanValue()) {
            arrayList.add(zzfutVar);
        }
        return zzfuj.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdiv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfut zzfutVar2 = zzb;
                zzfut zzfutVar3 = zzf;
                zzfut zzfutVar4 = zze2;
                zzfut zzfutVar5 = zze;
                zzfut zzfutVar6 = zzd;
                JSONObject jSONObject2 = jSONObject;
                zzfut zzfutVar7 = zzh;
                zzfut zzfutVar8 = zzg;
                zzfut zzfutVar9 = zzfutVar;
                zzfut zzfutVar10 = zza;
                zzdgi zzdgiVar = (zzdgi) zzfutVar2.get();
                zzdgiVar.zzO((List) zzfutVar3.get());
                zzdgiVar.zzL((zzbdx) zzfutVar4.get());
                zzdgiVar.zzP((zzbdx) zzfutVar5.get());
                zzdgiVar.zzI((zzbdp) zzfutVar6.get());
                zzdgiVar.zzR(zzdjj.zzj(jSONObject2));
                zzdgiVar.zzK(zzdjj.zzi(jSONObject2));
                zzcei zzceiVar = (zzcei) zzfutVar7.get();
                if (zzceiVar != null) {
                    zzdgiVar.zzaa(zzceiVar);
                    zzdgiVar.zzZ(zzceiVar.zzF());
                    zzdgiVar.zzY(zzceiVar.zzq());
                }
                zzcei zzceiVar2 = (zzcei) zzfutVar8.get();
                if (zzceiVar2 != null) {
                    zzdgiVar.zzN(zzceiVar2);
                    zzdgiVar.zzab(zzceiVar2.zzF());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeI)).booleanValue()) {
                    zzdgiVar.zzT(zzfutVar9);
                } else {
                    zzcei zzceiVar3 = (zzcei) zzfutVar9.get();
                    if (zzceiVar3 != null) {
                        zzdgiVar.zzS(zzceiVar3);
                    }
                }
                for (zzdjn zzdjnVar : (List) zzfutVar10.get()) {
                    if (zzdjnVar.zza != 1) {
                        zzdgiVar.zzM(zzdjnVar.zzb, zzdjnVar.zzd);
                    } else {
                        zzdgiVar.zzW(zzdjnVar.zzb, zzdjnVar.zzc);
                    }
                }
                return zzdgiVar;
            }
        }, this.zza);
    }
}
