package com.google.android.gms.internal.ads;

import com.loopj.android.http.AsyncHttpClient;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzaas {
    public static int zza(ByteBuffer byteBuffer) {
        return (int) ((zzd(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzb(byte[] bArr) {
        return zzd(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zzc(byte[] bArr) {
        int i = bArr[11] & UByte.MAX_VALUE;
        int i2 = bArr[10] & UByte.MAX_VALUE;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzf(zze((i << 8) | i2)));
        arrayList.add(zzf(zze(3840L)));
        return arrayList;
    }

    private static long zzd(byte b, byte b2) {
        int i = b & UByte.MAX_VALUE;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = b2 & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << (i5 & 1) : i5 == 3 ? 60000 : AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << i5);
    }

    private static long zze(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzf(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
