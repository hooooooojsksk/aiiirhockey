package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzhi {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhh zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:64:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    static {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhi.<clinit>():void");
    }

    private zzhi() {
    }

    public static double zza(Object obj, long j) {
        return zze.zza(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zze.zzb(obj, j);
    }

    public static int zzc(Object obj, long j) {
        return zze.zzi(obj, j);
    }

    public static long zzd(Object obj, long j) {
        return zze.zzj(obj, j);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object zzf(Object obj, long j) {
        return zze.zzl(obj, j);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhe());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        zzhh zzhhVar = zze;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        int i2 = (255 << i) ^ (-1);
        zzhhVar.zzm(obj, j2, ((z ? 1 : 0) << i) | (i2 & zzhhVar.zzi(obj, j2)));
    }

    public static /* synthetic */ void zzj(Object obj, long j, boolean z) {
        long j2 = (-4) & j;
        zzhh zzhhVar = zze;
        int i = (((int) j) & 3) << 3;
        int i2 = (255 << i) ^ (-1);
        zzhhVar.zzm(obj, j2, ((z ? 1 : 0) << i) | (i2 & zzhhVar.zzi(obj, j2)));
    }

    public static void zzk(Object obj, long j, boolean z) {
        zze.zzc(obj, j, z);
    }

    public static void zzl(Object obj, long j, double d) {
        zze.zzd(obj, j, d);
    }

    public static void zzm(Object obj, long j, float f) {
        zze.zze(obj, j, f);
    }

    public static void zzn(Object obj, long j, int i) {
        zze.zzm(obj, j, i);
    }

    public static void zzo(Object obj, long j, long j2) {
        zze.zzn(obj, j, j2);
    }

    public static void zzp(Object obj, long j, Object obj2) {
        zze.zzo(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j) {
        return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j) {
        return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzs(Class cls) {
        int i = zzdr.zza;
        try {
            Class cls2 = zzc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzt(Object obj, long j) {
        return zze.zzf(obj, j);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zzg(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zzh(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i = zzdr.zza;
        Field zzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (zzz == null) {
            Field zzz2 = zzz(Buffer.class, "address");
            if (zzz2 == null || zzz2.getType() != Long.TYPE) {
                return null;
            }
            return zzz2;
        }
        return zzz;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
