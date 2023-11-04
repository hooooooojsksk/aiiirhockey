package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdh implements zzde {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdc zze = zzdc.zza;
    private zzdc zzf;
    private zzdc zzg;
    private zzdc zzh;
    private boolean zzi;
    private zzdg zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdh() {
        zzdc zzdcVar = zzdc.zza;
        this.zzf = zzdcVar;
        this.zzg = zzdcVar;
        this.zzh = zzdcVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzdcVar.zzb;
            }
            this.zze = zzdcVar;
            zzdc zzdcVar2 = new zzdc(i, zzdcVar.zzc, 2);
            this.zzf = zzdcVar2;
            this.zzi = true;
            return zzdcVar2;
        }
        throw new zzdd(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zzb() {
        int zza;
        zzdg zzdgVar = this.zzj;
        if (zzdgVar != null && (zza = zzdgVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdgVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc() {
        if (zzg()) {
            zzdc zzdcVar = this.zze;
            this.zzg = zzdcVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzdg(zzdcVar.zzb, zzdcVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzdg zzdgVar = this.zzj;
                if (zzdgVar != null) {
                    zzdgVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzd() {
        zzdg zzdgVar = this.zzj;
        if (zzdgVar != null) {
            zzdgVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdg zzdgVar = this.zzj;
            Objects.requireNonNull(zzdgVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzdgVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdc.zza;
        zzdc zzdcVar = zzdc.zza;
        this.zzf = zzdcVar;
        this.zzg = zzdcVar;
        this.zzh = zzdcVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzh() {
        zzdg zzdgVar;
        return this.zzp && ((zzdgVar = this.zzj) == null || zzdgVar.zza() == 0);
    }

    public final long zzi(long j) {
        zzdg zzdgVar;
        long j2 = this.zzo;
        if (j2 >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long j3 = this.zzn;
            Objects.requireNonNull(this.zzj);
            long zzb = j3 - zzdgVar.zzb();
            int i = this.zzh.zzb;
            int i2 = this.zzg.zzb;
            if (i == i2) {
                return zzew.zzw(j, zzb, j2);
            }
            return zzew.zzw(j, zzb * i, j2 * i2);
        }
        double d = this.zzc;
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
