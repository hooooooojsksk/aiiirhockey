package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgqb {
    private static final zzgpz zza = new zzgqa();
    private static final zzgpz zzb;

    static {
        zzgpz zzgpzVar;
        try {
            zzgpzVar = (zzgpz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgpzVar = null;
        }
        zzb = zzgpzVar;
    }

    public static zzgpz zza() {
        zzgpz zzgpzVar = zzb;
        if (zzgpzVar != null) {
            return zzgpzVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgpz zzb() {
        return zza;
    }
}
