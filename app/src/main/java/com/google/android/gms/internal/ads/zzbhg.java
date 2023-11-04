package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzbhg implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        if (zzceiVar.zzJ() != null) {
            zzceiVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzceiVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzM = zzceiVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzbza.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
