package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzawz extends zzgqm implements zzgrx {
    private static final zzawz zzb;
    private zzgqv zzd = zzaM();

    static {
        zzawz zzawzVar = new zzawz();
        zzb = zzawzVar;
        zzgqm.zzaT(zzawz.class, zzawzVar);
    }

    private zzawz() {
    }

    public static zzawt zza() {
        return (zzawt) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzawz zzawzVar, zzaws zzawsVar) {
        zzawsVar.getClass();
        zzgqv zzgqvVar = zzawzVar.zzd;
        if (!zzgqvVar.zzc()) {
            zzawzVar.zzd = zzgqm.zzaN(zzgqvVar);
        }
        zzawzVar.zzd.add(zzawsVar);
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
                    return new zzawt(null);
                }
                return new zzawz();
            }
            return zzaQ(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaws.class});
        }
        return (byte) 1;
    }
}
