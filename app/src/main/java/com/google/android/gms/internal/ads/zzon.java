package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzon extends zzdf {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    public final zzdc zzi(zzdc zzdcVar) throws zzdd {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdc.zza;
        }
        if (zzdcVar.zzd != 2) {
            throw new zzdd(zzdcVar);
        }
        boolean z = zzdcVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zzdc(zzdcVar.zzb, length, 2) : zzdc.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzdcVar.zzc) {
                throw new zzdd(zzdcVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
