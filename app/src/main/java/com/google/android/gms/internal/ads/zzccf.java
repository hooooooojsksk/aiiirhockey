package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccf {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzame zzameVar;
        zzamd zzamdVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzalz(new zzcce(duplicate), zzcch.zzb).zze().iterator();
            while (true) {
                zzameVar = null;
                if (!it.hasNext()) {
                    zzamdVar = null;
                    break;
                }
                zzamb zzambVar = (zzamb) it.next();
                if (zzambVar instanceof zzamd) {
                    zzamdVar = (zzamd) zzambVar;
                    break;
                }
            }
            Iterator it2 = zzamdVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzamb zzambVar2 = (zzamb) it2.next();
                if (zzambVar2 instanceof zzame) {
                    zzameVar = (zzame) zzambVar2;
                    break;
                }
            }
            long zzd = (zzameVar.zzd() * 1000) / zzameVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
