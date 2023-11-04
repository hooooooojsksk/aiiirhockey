package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcmk implements zzcls {
    private final zzdsf zza;

    public zzcmk(zzdsf zzdsfVar) {
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzm(str.equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES));
    }
}
