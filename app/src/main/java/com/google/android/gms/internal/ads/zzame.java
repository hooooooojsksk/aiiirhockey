package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzame extends zzgwh {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgwr zzm;
    private long zzn;

    public zzame() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgwr.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgwm.zza(zzama.zzf(byteBuffer));
            this.zzh = zzgwm.zza(zzama.zzf(byteBuffer));
            this.zzi = zzama.zze(byteBuffer);
            this.zzj = zzama.zzf(byteBuffer);
        } else {
            this.zza = zzgwm.zza(zzama.zze(byteBuffer));
            this.zzh = zzgwm.zza(zzama.zze(byteBuffer));
            this.zzi = zzama.zze(byteBuffer);
            this.zzj = zzama.zze(byteBuffer);
        }
        this.zzk = zzama.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & UByte.MAX_VALUE) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzama.zzd(byteBuffer);
        zzama.zze(byteBuffer);
        zzama.zze(byteBuffer);
        double zzb = zzama.zzb(byteBuffer);
        double zzb2 = zzama.zzb(byteBuffer);
        double zza = zzama.zza(byteBuffer);
        this.zzm = new zzgwr(zzb, zzb2, zzama.zzb(byteBuffer), zzama.zzb(byteBuffer), zza, zzama.zza(byteBuffer), zzama.zza(byteBuffer), zzama.zzb(byteBuffer), zzama.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzama.zze(byteBuffer);
    }
}
