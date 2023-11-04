package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgsc {
    private static final zzgsb zza;
    private static final zzgsb zzb;

    static {
        zzgsb zzgsbVar;
        try {
            zzgsbVar = (zzgsb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgsbVar = null;
        }
        zza = zzgsbVar;
        zzb = new zzgsb();
    }

    public static zzgsb zza() {
        return zza;
    }

    public static zzgsb zzb() {
        return zzb;
    }
}
