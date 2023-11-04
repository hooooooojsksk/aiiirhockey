package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzrw implements zzuj {
    public final zzuj zza;
    final /* synthetic */ zzrx zzb;
    private boolean zzc;

    public zzrw(zzrx zzrxVar, zzuj zzujVar) {
        this.zzb = zzrxVar;
        this.zza = zzujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zza(zzjo zzjoVar, zzgr zzgrVar, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgrVar.zzc(4);
            return -4;
        }
        int zza = this.zza.zza(zzjoVar, zzgrVar, i);
        if (zza == -5) {
            zzaf zzafVar = zzjoVar.zza;
            Objects.requireNonNull(zzafVar);
            int i2 = zzafVar.zzC;
            if (i2 == 0) {
                if (zzafVar.zzD != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzafVar.zzD : 0;
            zzad zzb = zzafVar.zzb();
            zzb.zzC(i2);
            zzb.zzD(i3);
            zzjoVar.zza = zzb.zzY();
            return -5;
        }
        zzrx zzrxVar = this.zzb;
        long j = zzrxVar.zzb;
        if (j == Long.MIN_VALUE || ((zza != -4 || zzgrVar.zzd < j) && !(zza == -3 && zzrxVar.zzb() == Long.MIN_VALUE && !zzgrVar.zzc))) {
            return zza;
        }
        zzgrVar.zzb();
        zzgrVar.zzc(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
