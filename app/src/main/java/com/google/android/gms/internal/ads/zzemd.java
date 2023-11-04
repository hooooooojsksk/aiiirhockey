package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzemd implements zzepn {
    private final Context zza;
    private final zzfuu zzb;

    public zzemd(Context context, zzfuu zzfuuVar) {
        this.zza = context;
        this.zzb = zzfuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzaue zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzg();
                Bundle bundle = null;
                if (zzg != null && (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM() || !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzatu zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzw(zzj);
                        }
                        if (zzk != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzy(zzk);
                        }
                    } else {
                        zzj = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzj();
                        zzk = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                        if (zzk == null || TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzk);
                        }
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeme(bundle);
            }
        });
    }
}
