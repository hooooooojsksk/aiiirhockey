package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbgj implements zzbhp {
    private final zzbgk zza;

    public zzbgj(zzbgk zzbgkVar) {
        this.zza = zzbgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzbza.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbz(str, (String) map.get("info"));
        }
    }
}
