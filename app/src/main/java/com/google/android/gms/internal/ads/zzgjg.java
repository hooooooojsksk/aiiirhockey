package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgjg extends zzgqm implements zzgrx {
    private static final zzgjg zzb;
    private zzgjj zzd;

    static {
        zzgjg zzgjgVar = new zzgjg();
        zzb = zzgjgVar;
        zzgqm.zzaT(zzgjg.class, zzgjgVar);
    }

    private zzgjg() {
    }

    public static zzgjf zza() {
        return (zzgjf) zzb.zzaA();
    }

    public static zzgjg zzd(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzgjg) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzf(zzgjg zzgjgVar, zzgjj zzgjjVar) {
        zzgjjVar.getClass();
        zzgjgVar.zzd = zzgjjVar;
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
                    return new zzgjf(null);
                }
                return new zzgjg();
            }
            return zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final zzgjj zze() {
        zzgjj zzgjjVar = this.zzd;
        return zzgjjVar == null ? zzgjj.zze() : zzgjjVar;
    }
}
