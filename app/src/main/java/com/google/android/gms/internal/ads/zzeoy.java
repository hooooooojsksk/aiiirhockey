package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeoy implements zzepn {
    private final zzbxf zza;
    private final zzfuu zzb;
    private final Context zzc;

    public zzeoy(zzbxf zzbxfVar, zzfuu zzfuuVar, Context context) {
        this.zza = zzbxfVar;
        this.zzb = zzfuuVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeox
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoy.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeoz zzc() throws Exception {
        if (this.zza.zzu(this.zzc)) {
            String zze = this.zza.zze(this.zzc);
            String str = zze == null ? "" : zze;
            String zzc = this.zza.zzc(this.zzc);
            String str2 = zzc == null ? "" : zzc;
            String zza = this.zza.zza(this.zzc);
            String str3 = zza == null ? "" : zza;
            String zzb = this.zza.zzb(this.zzc);
            return new zzeoz(str, str2, str3, zzb == null ? "" : zzb, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzad) : null);
        }
        return new zzeoz(null, null, null, null, null);
    }
}
