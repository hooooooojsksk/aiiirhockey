package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaqv implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaqx zzb;

    public zzaqv(zzaqx zzaqxVar, int i, boolean z) {
        this.zzb = zzaqxVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzans zzansVar;
        zzaqx zzaqxVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaqxVar.zza.getPackageManager().getPackageInfo(zzaqxVar.zza.getPackageName(), 0);
            Context context = zzaqxVar.zza;
            zzansVar = zzfhx.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzansVar = null;
        }
        this.zzb.zzm = zzansVar;
        if (this.zza < 4) {
            if (zzansVar != null && zzansVar.zzaj() && !zzansVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzansVar.zzak() && zzansVar.zzf().zze() && zzansVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
