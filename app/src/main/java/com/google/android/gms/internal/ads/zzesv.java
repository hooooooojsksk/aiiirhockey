package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzesv implements zzepn {
    private final zzbyj zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzfuu zze;
    private final String zzf;
    private final zzbxy zzg;

    public zzesv(zzbyj zzbyjVar, boolean z, boolean z2, zzbxy zzbxyVar, zzfuu zzfuuVar, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzbyjVar;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzbxyVar;
        this.zze = zzfuuVar;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgK)).booleanValue() || !this.zzc) {
            if (this.zzb) {
                return zzfuj.zze(zzfuj.zzn(zzfuj.zzl(zzfuj.zzh(null), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzest
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        String str = (String) obj;
                        if (str == null) {
                            return null;
                        }
                        return new zzesw(str);
                    }
                }, this.zze), ((Long) zzbcy.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfnj() { // from class: com.google.android.gms.internal.ads.zzesu
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        zzesv.this.zzc((Exception) obj);
                        return null;
                    }
                }, this.zze);
            }
            return zzfuj.zzh(null);
        }
        return zzfuj.zzh(null);
    }

    public final /* synthetic */ zzesw zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
