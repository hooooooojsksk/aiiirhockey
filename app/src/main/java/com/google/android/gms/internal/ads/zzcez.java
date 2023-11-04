package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzcez implements zzbhp {
    final /* synthetic */ zzcfb zza;

    public zzcez(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        zzcei zzceiVar = (zzcei) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    zzcfb zzcfbVar = this.zza;
                    i = zzcfbVar.zzG;
                    if (i != parseInt) {
                        zzcfbVar.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzbza.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }
}
