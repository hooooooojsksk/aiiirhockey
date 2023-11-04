package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbhd implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        try {
            zzfkv.zzj(zzceiVar.getContext()).zzk();
            zzfkw.zzi(zzceiVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
