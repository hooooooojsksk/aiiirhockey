package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzayi extends zzgqm implements zzgrx {
    private static final zzayi zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzayi zzayiVar = new zzayi();
        zzb = zzayiVar;
        zzgqm.zzaT(zzayi.class, zzayiVar);
    }

    private zzayi() {
    }

    public static zzayb zza() {
        return (zzayb) zzb.zzaA();
    }

    public static zzayi zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzayi zzayiVar, int i) {
        zzayiVar.zze = i - 1;
        zzayiVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzayi zzayiVar, int i) {
        zzayiVar.zzf = i - 1;
        zzayiVar.zzd |= 2;
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
                    return new zzayb(null);
                }
                return new zzayi();
            }
            return zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", zzayg.zza, "zzf", zzayd.zza});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzaye.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzayh.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
