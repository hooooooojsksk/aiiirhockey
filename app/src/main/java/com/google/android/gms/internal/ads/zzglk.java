package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzglk extends zzgqm implements zzgrx {
    private static final zzglk zzb;
    private zzgky zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzglk zzglkVar = new zzglk();
        zzb = zzglkVar;
        zzgqm.zzaT(zzglk.class, zzglkVar);
    }

    private zzglk() {
    }

    public static zzglj zzd() {
        return (zzglj) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzglk zzglkVar, zzgky zzgkyVar) {
        zzgkyVar.getClass();
        zzglkVar.zzd = zzgkyVar;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzglj(null);
                }
                return new zzglk();
            }
            return zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgky zzc() {
        zzgky zzgkyVar = this.zzd;
        return zzgkyVar == null ? zzgky.zze() : zzgkyVar;
    }

    public final zzgme zzf() {
        zzgme zzb2 = zzgme.zzb(this.zzg);
        return zzb2 == null ? zzgme.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return this.zzd != null;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
