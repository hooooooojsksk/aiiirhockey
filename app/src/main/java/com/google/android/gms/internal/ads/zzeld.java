package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeld implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzeld(zzfuu zzfuuVar, Context context) {
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeld.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzele zzc() throws Exception {
        Intent registerReceiver;
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter);
        } else {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
        }
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            z = (intExtra == 2 || intExtra == 5) ? true : true;
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new zzele(d, z);
    }
}
