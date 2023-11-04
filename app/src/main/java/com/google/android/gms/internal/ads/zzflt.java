package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzflt extends zzfml {
    final /* synthetic */ zzflz zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzflx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzflt(zzflx zzflxVar, TaskCompletionSource taskCompletionSource, zzflz zzflzVar, zzfmc zzfmcVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzflxVar;
        this.zza = zzflzVar;
        this.zzb = zzfmcVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzfmh, android.os.IInterface] */
    @Override // com.google.android.gms.internal.ads.zzfml
    protected final void zza() {
        zzfmk zzfmkVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.zzd.zza.zze();
            zzflx zzflxVar = this.zzd;
            str2 = zzflxVar.zzd;
            zzflz zzflzVar = this.zza;
            str3 = zzflxVar.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzflzVar.zze());
            bundle.putString("adFieldEnifd", zzflzVar.zzf());
            bundle.putInt("layoutGravity", zzflzVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzflzVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", zzflzVar.zzd());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (zzflzVar.zzg() != null) {
                bundle.putString("appId", zzflzVar.zzg());
            }
            zze.zzf(str2, bundle, new zzflw(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfmkVar = zzflx.zzb;
            str = this.zzd.zzd;
            zzfmkVar.zzb(e, "show overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
