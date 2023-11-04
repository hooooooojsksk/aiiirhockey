package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaal {
    private final zzen zza = new zzen(10);

    public final zzbq zza(zzzv zzzvVar, zzadm zzadmVar) throws IOException {
        zzbq zzbqVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzzk) zzzvVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzbqVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzzk) zzzvVar).zzm(bArr, 10, zzj, false);
                    zzbqVar = zzado.zza(bArr, i2, zzadmVar, new zzacp());
                } else {
                    ((zzzk) zzzvVar).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzzvVar.zzj();
        ((zzzk) zzzvVar).zzl(i, false);
        return zzbqVar;
    }
}
