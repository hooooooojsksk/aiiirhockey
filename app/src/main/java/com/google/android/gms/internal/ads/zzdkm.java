package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzdkm implements zzbdk {
    final /* synthetic */ zzdkn zza;

    public zzdkm(zzdkn zzdknVar) {
        this.zza = zzdknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final void zzc() {
        zzdgd zzdgdVar;
        zzdgd zzdgdVar2;
        zzdkn zzdknVar = this.zza;
        zzdgdVar = zzdknVar.zzd;
        if (zzdgdVar != null) {
            zzdgdVar2 = zzdknVar.zzd;
            zzdgdVar2.zzE("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final void zzd(MotionEvent motionEvent) {
    }
}
