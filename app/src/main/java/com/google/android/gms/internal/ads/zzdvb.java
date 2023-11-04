package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdvb implements zzcxj {
    private final Context zza;
    private final zzbxf zzb;

    public zzdvb(Context context, zzbxf zzbxfVar) {
        this.zza = context;
        this.zzb = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzb(zzeyo zzeyoVar) {
        if (TextUtils.isEmpty(zzeyoVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzeyoVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzeyoVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zzbA(zzbtn zzbtnVar) {
    }
}
