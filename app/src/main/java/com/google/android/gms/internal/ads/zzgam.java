package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
abstract class zzgam {
    private final zzgak zza;
    private final zzgak zzb;

    public zzgam(byte[] bArr) throws GeneralSecurityException {
        if (!zzgas.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    private final byte[] zze(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.zzb.zzc(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] zzf(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i = length & 15;
        int i2 = i == 0 ? length : (length + 16) - i;
        int remaining = byteBuffer.remaining();
        int i3 = remaining % 16;
        int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
        ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i2);
        order.put(byteBuffer);
        order.position(i4);
        order.putLong(length);
        order.putLong(remaining);
        return order.array();
    }

    abstract zzgak zza(byte[] bArr, int i) throws InvalidKeyException;

    public final void zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.zza.zzd(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] zza = zzgap.zza(zze(bArr), zzf(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(zza);
    }

    public final byte[] zzc(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            if (MessageDigest.isEqual(zzgap.zza(zze(bArr), zzf(bArr2, byteBuffer)), bArr3)) {
                byteBuffer.position(position);
                return this.zza.zze(bArr, byteBuffer);
            }
            throw new GeneralSecurityException("invalid MAC");
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 16);
        zzb(allocate, bArr, bArr2, bArr3);
        return allocate.array();
    }
}
