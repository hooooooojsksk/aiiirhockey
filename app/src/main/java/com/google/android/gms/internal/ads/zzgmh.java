package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgmh extends zzgqm implements zzgrx {
    private static final zzgmh zzb;
    private String zzd = "";
    private zzgqv zze = zzaM();

    static {
        zzgmh zzgmhVar = new zzgmh();
        zzb = zzgmhVar;
        zzgqm.zzaT(zzgmh.class, zzgmhVar);
    }

    private zzgmh() {
    }

    public static zzgmh zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgmg(null);
                }
                return new zzgmh();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzglg.class});
        }
        return (byte) 1;
    }

    public final List zzd() {
        return this.zze;
    }
}
