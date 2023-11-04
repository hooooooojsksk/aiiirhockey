package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdjo {
    private final Executor zza;
    private final zzdjj zzb;

    public zzdjo(Executor executor, zzdjj zzdjjVar) {
        this.zza = executor;
        this.zzb = zzdjjVar;
    }

    public final zzfut zza(JSONObject jSONObject, String str) {
        zzfut zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfuj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzh = zzfuj.zzh(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zzh = zzfuj.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzh = zzfuj.zzh(new zzdjn(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzfuj.zzl(this.zzb.zze(optJSONObject, "image_value"), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjl
                            @Override // com.google.android.gms.internal.ads.zzfnj
                            public final Object apply(Object obj) {
                                return new zzdjn(optString, (zzbdj) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzfuj.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzfuj.zzl(zzfuj.zzd(arrayList), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdjn zzdjnVar : (List) obj) {
                    if (zzdjnVar != null) {
                        arrayList2.add(zzdjnVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
