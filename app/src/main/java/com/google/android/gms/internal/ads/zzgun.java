package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgun extends zzgqm implements zzgrx {
    private static final zzgun zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgun zzgunVar = new zzgun();
        zzb = zzgunVar;
        zzgqm.zzaT(zzgun.class, zzgunVar);
    }

    private zzgun() {
    }

    public static zzgum zza() {
        return (zzgum) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgun zzgunVar, String str) {
        zzgunVar.zzd |= 1;
        zzgunVar.zze = str;
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
                    return new zzgum(null);
                }
                return new zzgun();
            }
            return zzaQ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
