package com.google.android.gms.internal.drive;

/* loaded from: classes2.dex */
final class zzix {
    private static final Class<?> zzni = zzj("libcore.io.Memory");
    private static final boolean zznj;

    public static boolean zzbr() {
        return (zzni == null || zznj) ? false : true;
    }

    public static Class<?> zzbs() {
        return zzni;
    }

    private static <T> Class<T> zzj(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        zznj = zzj("org.robolectric.Robolectric") != null;
    }
}
