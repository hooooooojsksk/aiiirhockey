package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzeso implements zzepn {
    public static final /* synthetic */ zzeso zza = new zzeso();

    private /* synthetic */ zzeso() {
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return zzfuj.zzh(new zzepm() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
