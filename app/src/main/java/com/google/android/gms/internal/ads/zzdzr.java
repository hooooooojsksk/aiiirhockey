package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdzr implements zzfdb {
    private final zzdzf zza;
    private final zzdzj zzb;

    public zzdzr(zzdzf zzdzfVar, zzdzj zzdzjVar) {
        this.zza = zzdzfVar;
        this.zzb = zzdzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbB(zzfcu zzfcuVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzbC(zzfcu zzfcuVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue() && zzfcu.RENDERER == zzfcuVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzc(zzfcu zzfcuVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue()) {
            if (zzfcu.RENDERER == zzfcuVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            } else if (zzfcu.PRELOADED_LOADER == zzfcuVar || zzfcu.SERVER_TRANSACTION == zzfcuVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                final zzdzj zzdzjVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzdzjVar.zza.zza(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdzi
                    @Override // com.google.android.gms.internal.ads.zzfcd
                    public final Object zza(Object obj) {
                        zzdzj zzdzjVar2 = zzdzj.this;
                        long j = zzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzdzjVar2.zzf()) {
                            return null;
                        }
                        zzaym zzg = zzayn.zzg();
                        zzg.zzh(j);
                        byte[] zzax = ((zzayn) zzg.zzal()).zzax();
                        zzdzq.zzg(sQLiteDatabase, false, false);
                        zzdzq.zzd(sQLiteDatabase, j, zzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final void zzd(zzfcu zzfcuVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfL)).booleanValue() && zzfcu.RENDERER == zzfcuVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
