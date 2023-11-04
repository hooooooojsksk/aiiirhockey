package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public enum zzgkx implements zzgqo {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzgqp zzg = new zzgqp() { // from class: com.google.android.gms.internal.ads.zzgkw
    };
    private final int zzi;

    zzgkx(int i) {
        this.zzi = i;
    }

    public static zzgkx zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return REMOTE;
                    }
                    return ASYMMETRIC_PUBLIC;
                }
                return ASYMMETRIC_PRIVATE;
            }
            return SYMMETRIC;
        }
        return UNKNOWN_KEYMATERIAL;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
