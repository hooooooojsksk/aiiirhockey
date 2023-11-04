package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzarg implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzarh zza;

    public zzarg(zzarh zzarhVar) {
        this.zza = zzarhVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzarh zzarhVar = this.zza;
        j = zzarhVar.zzc;
        if (j > 0) {
            j2 = zzarhVar.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzarhVar.zzc;
                zzarhVar.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
