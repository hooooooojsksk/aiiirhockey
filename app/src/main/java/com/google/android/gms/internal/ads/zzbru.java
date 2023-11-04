package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbru extends zzbrq {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbru(zzbrz zzbrzVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
