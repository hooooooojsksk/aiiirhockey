package com.google.android.gms.internal.drive;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzkm {
    public static final byte[] zzsn;
    private static final ByteBuffer zzso;
    private static final zzjo zzsp;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    public static int zze(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zzf(zzlq zzlqVar) {
        return false;
    }

    public static int zzu(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static <T> T checkNotNull(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T zza(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean zzd(byte[] bArr) {
        return zznf.zzd(bArr);
    }

    public static String zze(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zza(Object obj, Object obj2) {
        return ((zzlq) obj).zzcy().zza((zzlq) obj2).zzde();
    }

    static {
        byte[] bArr = new byte[0];
        zzsn = bArr;
        zzso = ByteBuffer.wrap(bArr);
        zzsp = zzjo.zza(bArr, 0, bArr.length, false);
    }
}
