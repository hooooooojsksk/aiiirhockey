package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgvq extends zzgqm implements zzgrx {
    private static final zzgvq zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzgvq zzgvqVar = new zzgvq();
        zzb = zzgvqVar;
        zzgqm.zzaT(zzgvq.class, zzgvqVar);
    }

    private zzgvq() {
    }

    public static zzgvp zza() {
        return (zzgvp) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgvq zzgvqVar, String str) {
        zzgvqVar.zzd |= 1;
        zzgvqVar.zze = str;
    }

    public static /* synthetic */ void zze(zzgvq zzgvqVar, long j) {
        zzgvqVar.zzd |= 2;
        zzgvqVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzgvq zzgvqVar, boolean z) {
        zzgvqVar.zzd |= 4;
        zzgvqVar.zzg = z;
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
                    return new zzgvp(null);
                }
                return new zzgvq();
            }
            return zzaQ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgvr.zza, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
