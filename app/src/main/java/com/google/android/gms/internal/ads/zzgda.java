package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgda {
    public static final zzggm zza = new zzgcz(null);

    public static zzggs zza(zzfxb zzfxbVar) {
        zzfwg zzfwgVar;
        zzggo zzggoVar = new zzggo();
        zzggoVar.zzb(zzfxbVar.zzb());
        for (List<zzfwx> list : zzfxbVar.zzd()) {
            for (zzfwx zzfwxVar : list) {
                int zzh = zzfwxVar.zzh() - 2;
                if (zzh == 1) {
                    zzfwgVar = zzfwg.zza;
                } else if (zzh == 2) {
                    zzfwgVar = zzfwg.zzb;
                } else if (zzh == 3) {
                    zzfwgVar = zzfwg.zzc;
                } else {
                    throw new IllegalStateException("Unknown key status");
                }
                int zza2 = zzfwxVar.zza();
                String zzf = zzfwxVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzggoVar.zza(zzfwgVar, zza2, zzf, zzfwxVar.zzc().name());
            }
        }
        if (zzfxbVar.zza() != null) {
            zzggoVar.zzc(zzfxbVar.zza().zza());
        }
        try {
            return zzggoVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
