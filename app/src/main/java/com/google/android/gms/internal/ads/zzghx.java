package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzghx extends zzgqm implements zzgrx {
    private static final zzghx zzb;
    private zzgia zzd;
    private int zze;

    static {
        zzghx zzghxVar = new zzghx();
        zzb = zzghxVar;
        zzgqm.zzaT(zzghx.class, zzghxVar);
    }

    private zzghx() {
    }

    public static zzghw zzc() {
        return (zzghw) zzb.zzaA();
    }

    public static zzghx zze(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzghx) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    public static /* synthetic */ void zzg(zzghx zzghxVar, zzgia zzgiaVar) {
        zzgiaVar.getClass();
        zzghxVar.zzd = zzgiaVar;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzghw(null);
                }
                return new zzghx();
            }
            return zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgia zzf() {
        zzgia zzgiaVar = this.zzd;
        return zzgiaVar == null ? zzgia.zze() : zzgiaVar;
    }
}
