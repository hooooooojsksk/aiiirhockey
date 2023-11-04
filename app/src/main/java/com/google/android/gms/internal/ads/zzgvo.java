package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgvo extends zzgqm implements zzgrx {
    private static final zzgvo zzb;
    private int zzd;
    private int zze;
    private zzgvb zzg;
    private zzgvf zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgqr zzj = zzaJ();
    private String zzk = "";
    private zzgqv zzm = zzgqm.zzaM();

    static {
        zzgvo zzgvoVar = new zzgvo();
        zzb = zzgvoVar;
        zzgqm.zzaT(zzgvo.class, zzgvoVar);
    }

    private zzgvo() {
    }

    public static zzgvn zzc() {
        return (zzgvn) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzgvo zzgvoVar, int i) {
        zzgvoVar.zzd |= 1;
        zzgvoVar.zze = i;
    }

    public static /* synthetic */ void zzg(zzgvo zzgvoVar, String str) {
        str.getClass();
        zzgvoVar.zzd |= 2;
        zzgvoVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgvo zzgvoVar, zzgvb zzgvbVar) {
        zzgvbVar.getClass();
        zzgvoVar.zzg = zzgvbVar;
        zzgvoVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzgvo zzgvoVar, String str) {
        str.getClass();
        zzgqv zzgqvVar = zzgvoVar.zzm;
        if (!zzgqvVar.zzc()) {
            zzgvoVar.zzm = zzgqm.zzaN(zzgqvVar);
        }
        zzgvoVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzgvo zzgvoVar, int i) {
        zzgvoVar.zzl = i - 1;
        zzgvoVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final String zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        this.zzn = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return new zzgvn(null);
                }
                return new zzgvo();
            }
            return zzaQ(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgvl.zza, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }
}
