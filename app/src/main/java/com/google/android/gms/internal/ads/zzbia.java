package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbia implements zzbhp {
    private final zzdsz zza;

    public zzbia(zzdsz zzdszVar) {
        this.zza = zzdszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziB)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (!str.equals("load") || TextUtils.isEmpty(str4)) {
                if (str.equals("show")) {
                    this.zza.zzi(str2, str3);
                    return;
                }
                return;
            }
            this.zza.zzh(str2, str4, str3);
        }
    }
}
