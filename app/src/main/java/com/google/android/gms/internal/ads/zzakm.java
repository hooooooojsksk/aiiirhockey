package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzakm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzako zzc;

    public zzakm(zzako zzakoVar, String str, long j) {
        this.zzc = zzakoVar;
        this.zza = str;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzakz zzakzVar;
        zzakz zzakzVar2;
        zzakzVar = this.zzc.zza;
        zzakzVar.zza(this.zza, this.zzb);
        zzako zzakoVar = this.zzc;
        zzakzVar2 = zzakoVar.zza;
        zzakzVar2.zzb(zzakoVar.toString());
    }
}
