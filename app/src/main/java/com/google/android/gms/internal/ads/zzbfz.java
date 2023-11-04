package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbfz extends zzbfa {
    final /* synthetic */ zzbgc zza;

    public /* synthetic */ zzbfz(zzbgc zzbgcVar, zzbfy zzbfyVar) {
        this.zza = zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) {
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener2;
        zzbgc zzbgcVar = this.zza;
        onCustomClickListener = zzbgcVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbgcVar.zzb;
        onCustomClickListener2.onCustomClick(zzbgcVar.zzf(zzberVar), str);
    }
}
