package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcly implements zzcls {
    private final zzdsf zza;

    public zzcly(zzdsf zzdsfVar) {
        this.zza = zzdsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zzk(zzdsb.SHAKE);
        } else if (c == 1) {
            this.zza.zzk(zzdsb.FLICK);
        } else {
            this.zza.zzk(zzdsb.NONE);
        }
    }
}
