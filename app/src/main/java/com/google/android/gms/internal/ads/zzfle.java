package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfle extends zzfly {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zza(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zzc(int i) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zzd(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zze(float f) {
        this.zzd = f;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zzf(boolean z) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zzg(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzfly zzh(int i) {
        this.zze = i;
        this.zzg = (byte) (this.zzg | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final zzflz zzi() {
        IBinder iBinder;
        if (this.zzg != 31 || (iBinder = this.zza) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" windowToken");
            }
            if ((this.zzg & 1) == 0) {
                sb.append(" stableSessionToken");
            }
            if ((this.zzg & 2) == 0) {
                sb.append(" layoutGravity");
            }
            if ((this.zzg & 4) == 0) {
                sb.append(" layoutVerticalMargin");
            }
            if ((this.zzg & 8) == 0) {
                sb.append(" displayMode");
            }
            if ((this.zzg & 16) == 0) {
                sb.append(" windowWidthPx");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzflg(iBinder, false, this.zzb, this.zzc, this.zzd, 0, null, this.zze, this.zzf, null);
    }
}
