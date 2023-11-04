package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzgq extends zzke implements zzlm {
    private static final zzgq zza;
    private int zze;
    private String zzf = "";
    private zzkl zzg = zzbD();

    static {
        zzgq zzgqVar = new zzgq();
        zza = zzgqVar;
        zzke.zzbJ(zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgp(null);
                }
                return new zzgq();
            }
            return zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgx.class});
        }
        return (byte) 1;
    }
}
