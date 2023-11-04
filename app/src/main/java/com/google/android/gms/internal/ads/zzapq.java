package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzapq implements Runnable {
    final /* synthetic */ zzapr zza;

    public zzapq(zzapr zzaprVar) {
        this.zza = zzaprVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzaqx zzaqxVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzapr.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbar.zzce.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzaqxVar = this.zza.zze;
                    zzapr.zza = zzfjr.zzb(zzaqxVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzapr.zzc;
            conditionVariable2.open();
        }
    }
}
