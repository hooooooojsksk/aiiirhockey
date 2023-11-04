package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzejl implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;
    private final zzezj zzc;

    public zzejl(zzfuu zzfuuVar, zzeyx zzeyxVar, zzezj zzezjVar) {
        this.zza = zzfuuVar;
        this.zzb = zzeyxVar;
        this.zzc = zzezjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzejl.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzejm zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgL)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzezj.zza();
        }
        return new zzejm(str);
    }
}
