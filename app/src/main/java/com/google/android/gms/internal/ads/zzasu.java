package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzasu extends zzgqm implements zzgrx {
    private static final zzasu zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzasu zzasuVar = new zzasu();
        zzb = zzasuVar;
        zzgqm.zzaT(zzasu.class, zzasuVar);
    }

    private zzasu() {
    }

    public static zzast zze() {
        return (zzast) zzb.zzaA();
    }

    public static zzasu zzg() {
        return zzb;
    }

    public static zzasu zzh(zzgpe zzgpeVar) throws zzgqy {
        return (zzasu) zzgqm.zzaE(zzb, zzgpeVar);
    }

    public static zzasu zzi(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzasu) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzl(zzasu zzasuVar, String str) {
        str.getClass();
        zzasuVar.zzd |= 1;
        zzasuVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzasu zzasuVar, long j) {
        zzasuVar.zzd |= 16;
        zzasuVar.zzi = j;
    }

    public static /* synthetic */ void zzn(zzasu zzasuVar, String str) {
        str.getClass();
        zzasuVar.zzd |= 2;
        zzasuVar.zzf = str;
    }

    public static /* synthetic */ void zzo(zzasu zzasuVar, long j) {
        zzasuVar.zzd |= 4;
        zzasuVar.zzg = j;
    }

    public static /* synthetic */ void zzp(zzasu zzasuVar, long j) {
        zzasuVar.zzd |= 8;
        zzasuVar.zzh = j;
    }

    public final long zza() {
        return this.zzh;
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
                    return new zzast(null);
                }
                return new zzasu();
            }
            return zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
