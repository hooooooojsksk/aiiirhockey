package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzflu extends zzfml {
    final /* synthetic */ zzflo zza;
    final /* synthetic */ zzfmc zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzflx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzflu(zzflx zzflxVar, TaskCompletionSource taskCompletionSource, zzflo zzfloVar, zzfmc zzfmcVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zzd = zzflxVar;
        this.zza = zzfloVar;
        this.zzb = zzfmcVar;
        this.zzc = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfmh, android.os.IInterface] */
    @Override // com.google.android.gms.internal.ads.zzfml
    protected final void zza() {
        zzfmk zzfmkVar;
        String str;
        String str2;
        try {
            ?? zze = this.zzd.zza.zze();
            zzflo zzfloVar = this.zza;
            str2 = this.zzd.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfloVar.zzb());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfloVar.zza());
            zze.zze(bundle, new zzflw(this.zzd, this.zzb));
        } catch (RemoteException e) {
            zzfmkVar = zzflx.zzb;
            str = this.zzd.zzd;
            zzfmkVar.zzb(e, "dismiss overlay display from: %s", str);
            this.zzc.trySetException(new RuntimeException(e));
        }
    }
}
