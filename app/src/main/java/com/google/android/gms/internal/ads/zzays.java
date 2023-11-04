package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzays extends zzgqm implements zzgrx {
    private static final zzays zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgqv zze = zzaM();
    private String zzi = "";
    private String zzj = "";

    static {
        zzays zzaysVar = new zzays();
        zzb = zzaysVar;
        zzgqm.zzaT(zzays.class, zzaysVar);
    }

    private zzays() {
    }

    public static zzayo zza() {
        return (zzayo) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzays zzaysVar, Iterable iterable) {
        zzgqv zzgqvVar = zzaysVar.zze;
        if (!zzgqvVar.zzc()) {
            zzaysVar.zze = zzgqm.zzaN(zzgqvVar);
        }
        zzgon.zzav(iterable, zzaysVar.zze);
    }

    public static /* synthetic */ void zze(zzays zzaysVar, int i) {
        zzaysVar.zzd |= 1;
        zzaysVar.zzf = i;
    }

    public static /* synthetic */ void zzf(zzays zzaysVar, int i) {
        zzaysVar.zzd |= 2;
        zzaysVar.zzg = i;
    }

    public static /* synthetic */ void zzg(zzays zzaysVar, long j) {
        zzaysVar.zzd |= 4;
        zzaysVar.zzh = j;
    }

    public static /* synthetic */ void zzh(zzays zzaysVar, String str) {
        str.getClass();
        zzaysVar.zzd |= 8;
        zzaysVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzays zzaysVar, String str) {
        str.getClass();
        zzaysVar.zzd |= 16;
        zzaysVar.zzj = str;
    }

    public static /* synthetic */ void zzj(zzays zzaysVar, long j) {
        zzaysVar.zzd |= 32;
        zzaysVar.zzk = j;
    }

    public static /* synthetic */ void zzk(zzays zzaysVar, int i) {
        zzaysVar.zzd |= 64;
        zzaysVar.zzl = i;
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
                    return new zzayo(null);
                }
                return new zzays();
            }
            return zzaQ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzayn.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
