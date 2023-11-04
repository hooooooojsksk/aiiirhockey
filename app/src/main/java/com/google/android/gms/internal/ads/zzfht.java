package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfht extends zzfhq {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final zzfhq zza(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final zzfhq zzb(boolean z) {
        this.zzc = true;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final zzfhq zzc(boolean z) {
        this.zzb = z;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final zzfhr zzd() {
        String str;
        if (this.zzd != 3 || (str = this.zza) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" clientVersion");
            }
            if ((this.zzd & 1) == 0) {
                sb.append(" shouldGetAdvertisingId");
            }
            if ((this.zzd & 2) == 0) {
                sb.append(" isGooglePlayServicesAvailable");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzfhv(str, this.zzb, this.zzc, null);
    }
}
