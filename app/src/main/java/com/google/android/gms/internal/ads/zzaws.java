package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaws extends zzgqm implements zzgrx {
    private static final zzaws zzb;
    private int zzd;
    private int zze;
    private zzaww zzf;
    private zzawy zzg;

    static {
        zzaws zzawsVar = new zzaws();
        zzb = zzawsVar;
        zzgqm.zzaT(zzaws.class, zzawsVar);
    }

    private zzaws() {
    }

    public static zzawr zza() {
        return (zzawr) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaws zzawsVar, zzaww zzawwVar) {
        zzawwVar.getClass();
        zzawsVar.zzf = zzawwVar;
        zzawsVar.zzd |= 2;
    }

    public static /* synthetic */ void zze(zzaws zzawsVar, zzawy zzawyVar) {
        zzawyVar.getClass();
        zzawsVar.zzg = zzawyVar;
        zzawsVar.zzd |= 4;
    }

    public static /* synthetic */ void zzf(zzaws zzawsVar, int i) {
        zzawsVar.zze = 1;
        zzawsVar.zzd = 1 | zzawsVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzawr(null);
                }
                return new zzaws();
            }
            return zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzawu.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
