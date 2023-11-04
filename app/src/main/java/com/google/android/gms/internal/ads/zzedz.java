package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzedz implements zzeat {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(zzeyo zzeyoVar, zzeyc zzeycVar) {
        String optString = zzeycVar.zzw.optString("pubid", "");
        zzeyx zzeyxVar = zzeyoVar.zza.zza;
        zzeyv zzeyvVar = new zzeyv();
        zzeyvVar.zzp(zzeyxVar);
        zzeyvVar.zzs(optString);
        Bundle zzd = zzd(zzeyxVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzeycVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzeycVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzeycVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzeycVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzeyxVar.zzd;
        zzeyvVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg, zzlVar.zzh, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzd, zzlVar.zzn, zzlVar.zzo, zzlVar.zzp, zzlVar.zzq, zzlVar.zzr, zzlVar.zzs, zzlVar.zzt, zzlVar.zzu, zzlVar.zzv, zzlVar.zzw, zzlVar.zzx));
        zzeyx zzG = zzeyvVar.zzG();
        Bundle bundle = new Bundle();
        zzeyf zzeyfVar = zzeyoVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzeyfVar.zza));
        bundle2.putInt("refresh_interval", zzeyfVar.zzc);
        bundle2.putString("gws_query_id", zzeyfVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzeyoVar.zza.zza.zzf;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzeycVar.zzx);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzeycVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzeycVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzeycVar.zzq));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzeycVar.zzn));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzeycVar.zzh));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzeycVar.zzi));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzeycVar.zzj));
        bundle3.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzeycVar.zzk);
        bundle3.putString("valid_from_timestamp", zzeycVar.zzl);
        bundle3.putBoolean("is_closable_area_disabled", zzeycVar.zzQ);
        bundle3.putString("recursive_server_response_data", zzeycVar.zzap);
        if (zzeycVar.zzm != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzeycVar.zzm.zzb);
            bundle4.putString("rb_type", zzeycVar.zzm.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzG, bundle, zzeycVar, zzeyoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        return !TextUtils.isEmpty(zzeycVar.zzw.optString("pubid", ""));
    }

    protected abstract zzfut zzc(zzeyx zzeyxVar, Bundle bundle, zzeyc zzeycVar, zzeyo zzeyoVar);
}
