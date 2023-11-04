package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzflv extends zzfml {
    final /* synthetic */ zzfme zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzflx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzflv(zzflx zzflxVar, TaskCompletionSource taskCompletionSource, zzfme zzfmeVar, int i, zzfmc zzfmcVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zze = zzflxVar;
        this.zza = zzfmeVar;
        this.zzb = i;
        this.zzc = zzfmcVar;
        this.zzd = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfmh, android.os.IInterface] */
    @Override // com.google.android.gms.internal.ads.zzfml
    protected final void zza() {
        zzfmk zzfmkVar;
        String str;
        String str2;
        try {
            ?? zze = this.zze.zza.zze();
            zzfme zzfmeVar = this.zza;
            str2 = this.zze.zzd;
            int i = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfmeVar.zzb());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", zzfmeVar.zza());
            zze.zzg(bundle, new zzflw(this.zze, this.zzc));
        } catch (RemoteException e) {
            zzfmkVar = zzflx.zzb;
            str = this.zze.zzd;
            zzfmkVar.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.zzb), str);
            this.zzd.trySetException(new RuntimeException(e));
        }
    }
}
