package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaww extends zzgqm implements zzgrx {
    private static final zzaww zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaww zzawwVar = new zzaww();
        zzb = zzawwVar;
        zzgqm.zzaT(zzaww.class, zzawwVar);
    }

    private zzaww() {
    }

    public static zzawv zza() {
        return (zzawv) zzb.zzaA();
    }

    public static zzaww zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzaww zzawwVar, boolean z) {
        zzawwVar.zzd |= 1;
        zzawwVar.zze = z;
    }

    public static /* synthetic */ void zzf(zzaww zzawwVar, int i) {
        zzawwVar.zzd |= 2;
        zzawwVar.zzf = i;
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
                    return new zzawv(null);
                }
                return new zzaww();
            }
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
