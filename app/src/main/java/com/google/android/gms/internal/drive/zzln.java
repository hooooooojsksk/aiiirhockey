package com.google.android.gms.internal.drive;

/* loaded from: classes2.dex */
final class zzln {
    private static final zzll zztz = zzeb();
    private static final zzll zzua = new zzlm();

    public static zzll zzdz() {
        return zztz;
    }

    public static zzll zzea() {
        return zzua;
    }

    private static zzll zzeb() {
        try {
            return (zzll) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
