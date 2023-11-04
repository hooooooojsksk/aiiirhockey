package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzawy extends zzgqm implements zzgrx {
    private static final zzawy zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzawy zzawyVar = new zzawy();
        zzb = zzawyVar;
        zzgqm.zzaT(zzawy.class, zzawyVar);
    }

    private zzawy() {
    }

    public static zzawx zza() {
        return (zzawx) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzawy zzawyVar, boolean z) {
        zzawyVar.zzd |= 1;
        zzawyVar.zze = z;
    }

    public static /* synthetic */ void zze(zzawy zzawyVar, boolean z) {
        zzawyVar.zzd |= 2;
        zzawyVar.zzf = z;
    }

    public static /* synthetic */ void zzf(zzawy zzawyVar, int i) {
        zzawyVar.zzd |= 4;
        zzawyVar.zzg = i;
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
                    return new zzawx(null);
                }
                return new zzawy();
            }
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
