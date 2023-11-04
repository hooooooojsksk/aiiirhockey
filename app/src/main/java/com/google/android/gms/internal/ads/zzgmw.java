package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgmw implements zzfvo {
    private final zzgal zza;

    public zzgmw(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzgal(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.zza.zzc(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] zza = zzgoe.zza(12);
        allocate.put(zza);
        this.zza.zzb(allocate, zza, bArr, bArr2);
        return allocate.array();
    }
}
