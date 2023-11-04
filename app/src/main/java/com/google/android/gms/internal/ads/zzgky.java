package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgky extends zzgqm implements zzgrx {
    private static final zzgky zzb;
    private String zzd = "";
    private zzgpe zze = zzgpe.zzb;
    private int zzf;

    static {
        zzgky zzgkyVar = new zzgky();
        zzb = zzgkyVar;
        zzgqm.zzaT(zzgky.class, zzgkyVar);
    }

    private zzgky() {
    }

    public static zzgkv zza() {
        return (zzgkv) zzb.zzaA();
    }

    public static zzgky zze() {
        return zzb;
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
                    return new zzgkv(null);
                }
                return new zzgky();
            }
            return zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgkx zzc() {
        zzgkx zzb2 = zzgkx.zzb(this.zzf);
        return zzb2 == null ? zzgkx.UNRECOGNIZED : zzb2;
    }

    public final zzgpe zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
