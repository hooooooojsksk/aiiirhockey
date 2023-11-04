package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfim extends zzgqm implements zzgrx {
    private static final zzgqs zzb = new zzfij();
    private static final zzfim zzd;
    private int zze;
    private zzgqr zzf = zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfim zzfimVar = new zzfim();
        zzd = zzfimVar;
        zzgqm.zzaT(zzfim.class, zzfimVar);
    }

    private zzfim() {
    }

    public static zzfil zza() {
        return (zzfil) zzd.zzaA();
    }

    public static /* synthetic */ void zzd(zzfim zzfimVar, String str) {
        str.getClass();
        zzfimVar.zze |= 1;
        zzfimVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzfim zzfimVar, int i) {
        zzgqr zzgqrVar = zzfimVar.zzf;
        if (!zzgqrVar.zzc()) {
            zzfimVar.zzf = zzgqm.zzaK(zzgqrVar);
        }
        zzfimVar.zzf.zzh(2);
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
                        return zzd;
                    }
                    return new zzfil(null);
                }
                return new zzfim();
            }
            return zzaQ(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfik.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
