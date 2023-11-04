package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzglg extends zzgqm implements zzgrx {
    private static final zzglg zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzglg zzglgVar = new zzglg();
        zzb = zzglgVar;
        zzgqm.zzaT(zzglg.class, zzglgVar);
    }

    private zzglg() {
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
                    return new zzglf(null);
                }
                return new zzglg();
            }
            return zzaQ(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzg;
    }
}
