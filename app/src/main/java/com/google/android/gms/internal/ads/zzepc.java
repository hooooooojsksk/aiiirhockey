package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzepc implements zzepn {
    private final zzfuu zza;
    private final Context zzb;
    private final zzbzg zzc;

    public zzepc(zzfuu zzfuuVar, Context context, zzbzg zzbzgVar) {
        this.zza = zzfuuVar;
        this.zzb = context;
        this.zzc = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepc.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepd zzc() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        String str = this.zzc.zza;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzB = com.google.android.gms.ads.internal.util.zzs.zzB();
        com.google.android.gms.ads.internal.zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        return new zzepd(isCallerInstantApp, zzA, str, zzB, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
