package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaae {
    public static zzaag zzb(zzen zzenVar) {
        zzenVar.zzG(1);
        int zzm = zzenVar.zzm();
        long zzc = zzenVar.zzc();
        long j = zzm;
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzenVar.zzr();
            if (zzr != -1) {
                jArr[i2] = zzr;
                jArr2[i2] = zzenVar.zzr();
                zzenVar.zzG(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        zzenVar.zzG((int) ((zzc + j) - zzenVar.zzc()));
        return new zzaag(jArr, jArr2);
    }

    public static zzbq zza(zzzv zzzvVar, boolean z) throws IOException {
        zzbq zza = new zzaal().zza(zzzvVar, z ? null : zzado.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
