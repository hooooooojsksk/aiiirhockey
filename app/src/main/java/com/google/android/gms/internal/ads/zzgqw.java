package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgqw {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzgpm zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i = zzgpm.zzd;
        zzf = zzgpm.zzI(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzd(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zze(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    public static Object zzf(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static String zzg(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzh(byte[] bArr) {
        return zzgtv.zzi(bArr);
    }
}
