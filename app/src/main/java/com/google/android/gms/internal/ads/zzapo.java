package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzapo implements Runnable {
    final /* synthetic */ zzapp zza;

    public zzapo(zzapp zzappVar) {
        this.zza = zzappVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfhp zzfhpVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z = this.zza.zzp;
            if (z) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzapp.zzj(this.zza);
            } catch (Exception e) {
                zzfhpVar = this.zza.zzh;
                zzfhpVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
