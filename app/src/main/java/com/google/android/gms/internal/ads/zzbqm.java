package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqm extends zzbfa {
    final /* synthetic */ zzbqp zza;

    public /* synthetic */ zzbqm(zzbqp zzbqpVar, zzbql zzbqlVar) {
        this.zza = zzbqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbqp zzbqpVar = this.zza;
        onCustomClickListener = zzbqpVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbqpVar.zzb;
        zzf = zzbqpVar.zzf(zzberVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
