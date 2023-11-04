package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgrs {
    private static final zzgrr zza;
    private static final zzgrr zzb;

    static {
        zzgrr zzgrrVar;
        try {
            zzgrrVar = (zzgrr) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgrrVar = null;
        }
        zza = zzgrrVar;
        zzb = new zzgrr();
    }

    public static zzgrr zza() {
        return zza;
    }

    public static zzgrr zzb() {
        return zzb;
    }
}
