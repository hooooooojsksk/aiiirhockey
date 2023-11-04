package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzepu implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzepu(zzfuu zzfuuVar, Context context) {
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzept
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepu.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(3:3|(2:6|4)|7)|8|(3:52|53|(16:55|11|12|13|(12:15|16|17|(1:19)(2:35|(3:38|(3:41|(2:44|45)(1:43)|39)|46))|20|21|(2:23|(5:25|(1:27)(1:33)|(1:29)|30|31))|34|(0)(0)|(0)|30|31)|48|17|(0)(0)|20|21|(0)|34|(0)(0)|(0)|30|31))|10|11|12|13|(0)|48|17|(0)(0)|20|21|(0)|34|(0)(0)|(0)|30|31) */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a0 A[Catch: Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:78:0x0092, B:80:0x00a0), top: B:115:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeps zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepu.zzc():com.google.android.gms.internal.ads.zzeps");
    }
}
