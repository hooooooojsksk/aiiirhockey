package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbrx extends zzbrq {
    final /* synthetic */ List zza;

    public zzbrx(zzbrz zzbrzVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zze(String str) {
        zzbza.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zzf(List list) {
        zzbza.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
