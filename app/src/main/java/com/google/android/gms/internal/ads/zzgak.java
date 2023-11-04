package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
abstract class zzgak {
    int[] zza;
    private final int zzb;

    public zzgak(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgag.zzd(bArr);
        this.zzb = i;
    }

    private final void zzf(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != zza()) {
            int zza = zza();
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza);
        }
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i2 >= i3) {
                return;
            }
            ByteBuffer zzc = zzc(bArr, this.zzb + i2);
            if (i2 == i3 - 1) {
                zzgmv.zza(byteBuffer, byteBuffer2, zzc, remaining % 64);
            } else {
                zzgmv.zza(byteBuffer, byteBuffer2, zzc, 64);
            }
            i2++;
        }
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i);

    public final ByteBuffer zzc(byte[] bArr, int i) {
        int[] zzb = zzb(zzgag.zzd(bArr), i);
        int[] iArr = (int[]) zzb.clone();
        zzgag.zzc(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            zzb[i2] = zzb[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zzf(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public final byte[] zze(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zzf(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
