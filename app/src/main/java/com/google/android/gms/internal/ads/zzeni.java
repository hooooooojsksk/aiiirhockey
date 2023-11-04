package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeni implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeni(zzfuu zzfuuVar, zzeyx zzeyxVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfuuVar;
        this.zzb = zzeyxVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzenj zzc(zzeni zzeniVar) {
        final ArrayList arrayList = zzeniVar.zzb.zzg;
        return arrayList == null ? new zzenj() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                Bundle bundle = (Bundle) obj;
            }
        } : arrayList.isEmpty() ? new zzenj() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzenj() { // from class: com.google.android.gms.internal.ads.zzeng
            @Override // com.google.android.gms.internal.ads.zzepm
            public final void zzh(Object obj) {
                zzeni.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeni.zzc(zzeni.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00fc, code lost:
        if (r9 == 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeni.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
