package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedo implements zzedi {
    private final zzdes zza;
    private final zzfuu zzb;
    private final zzdiw zzc;
    private final zzezt zzd;
    private final zzdll zze;

    public zzedo(zzdes zzdesVar, zzfuu zzfuuVar, zzdiw zzdiwVar, zzezt zzeztVar, zzdll zzdllVar) {
        this.zza = zzdesVar;
        this.zzb = zzfuuVar;
        this.zzc = zzdiwVar;
        this.zzd = zzeztVar;
        this.zze = zzdllVar;
    }

    private final zzfut zzg(final zzeyo zzeyoVar, final zzeyc zzeycVar, final JSONObject jSONObject) {
        final zzfut zza = this.zzd.zza();
        final zzfut zza2 = this.zzc.zza(zzeyoVar, zzeycVar, jSONObject);
        return zzfuj.zzc(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedo.this.zzc(zza2, zza, zzeyoVar, zzeycVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(final zzeyo zzeyoVar, final zzeyc zzeycVar) {
        return zzfuj.zzm(zzfuj.zzm(this.zzd.zza(), new zzftq() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzedo.this.zze(zzeycVar, (zzdlf) obj);
            }
        }, this.zzb), new zzftq() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzedo.this.zzf(zzeyoVar, zzeycVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        zzeyh zzeyhVar = zzeycVar.zzt;
        return (zzeyhVar == null || zzeyhVar.zzc == null) ? false : true;
    }

    public final /* synthetic */ zzdgd zzc(zzfut zzfutVar, zzfut zzfutVar2, zzeyo zzeyoVar, zzeyc zzeycVar, JSONObject jSONObject) throws Exception {
        zzdgi zzdgiVar = (zzdgi) zzfutVar.get();
        zzdlf zzdlfVar = (zzdlf) zzfutVar2.get();
        zzdgj zzd = this.zza.zzd(new zzcrb(zzeyoVar, zzeycVar, null), new zzdgu(zzdgiVar), new zzdfh(jSONObject, zzdlfVar));
        zzd.zzh().zzb();
        zzd.zzk().zza(zzdlfVar);
        zzd.zzg().zza(zzdgiVar.zzr());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    public final /* synthetic */ zzfut zzd(zzdlf zzdlfVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfuj.zzh(zzdlfVar));
        if (!jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            throw new zzblu("process json failed");
        }
        return zzfuj.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    public final /* synthetic */ zzfut zze(zzeyc zzeycVar, final zzdlf zzdlfVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhP)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzeycVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfuj.zzm(zzdlfVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzftq() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                return zzedo.this.zzd(zzdlfVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfut zzf(zzeyo zzeyoVar, zzeyc zzeycVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfuj.zzg(new zzdtf(3));
        }
        if (zzeyoVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzeyoVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzeyoVar.zza.zza.zzk);
            for (int i = 0; i < zzeyoVar.zza.zza.zzk; i++) {
                if (i < length) {
                    arrayList.add(zzg(zzeyoVar, zzeycVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzfuj.zzg(new zzdtf(3)));
                }
            }
            return zzfuj.zzh(arrayList);
        }
        return zzfuj.zzl(zzg(zzeyoVar, zzeycVar, jSONArray.getJSONObject(0)), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return Collections.singletonList(zzfuj.zzh((zzdgd) obj));
            }
        }, this.zzb);
    }
}
