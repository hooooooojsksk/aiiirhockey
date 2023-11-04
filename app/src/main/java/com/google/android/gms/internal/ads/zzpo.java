package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzpo extends zzdf {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzew.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzdf, com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.zzi) > 0) {
            zzj(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.zzi + i2) - this.zzh.length;
        ByteBuffer zzj = zzj(length);
        int zzf = zzew.zzf(length, 0, this.zzi);
        zzj.put(this.zzh, 0, zzf);
        int zzf2 = zzew.zzf(length - zzf, 0, i2);
        byteBuffer.limit(byteBuffer.position() + zzf2);
        zzj.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - zzf2;
        int i4 = this.zzi - zzf;
        this.zzi = i4;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, zzf, bArr, 0, i4);
        byteBuffer.get(this.zzh, this.zzi, i3);
        this.zzi += i3;
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdf, com.google.android.gms.internal.ads.zzde
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final zzdc zzi(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd == 2) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzdc.zza : zzdcVar;
        }
        throw new zzdd(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzl() {
        int i;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzm() {
        this.zzh = zzew.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }
}
