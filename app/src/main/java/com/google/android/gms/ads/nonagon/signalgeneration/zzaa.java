package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfuf;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzaa implements zzfuf {
    final /* synthetic */ zzac zza;

    public zzaa(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzdpn zzdpnVar;
        zzdpd zzdpdVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzac zzacVar = this.zza;
        zzdpnVar = zzacVar.zzr;
        zzdpdVar = zzacVar.zzj;
        zzf.zzc(zzdpnVar, zzdpdVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzbza.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* synthetic */ void zzb(Object obj) {
        zzao zzaoVar = (zzao) obj;
        zzbza.zze("Initialized webview successfully for SDKCore.");
    }
}
