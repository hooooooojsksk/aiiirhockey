package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdfe implements zzbhp {
    private final WeakReference zza;

    public /* synthetic */ zzdfe(zzdff zzdffVar, zzdfd zzdfdVar) {
        this.zza = new WeakReference(zzdffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        zzcvg zzcvgVar;
        zzdff zzdffVar = (zzdff) this.zza.get();
        if (zzdffVar == null) {
            return;
        }
        zzcvgVar = zzdffVar.zzg;
        zzcvgVar.zza();
    }
}
