package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgnf implements zzfvo {
    private final zzgny zza;
    private final zzfws zzb;
    private final int zzc;

    public zzgnf(zzgny zzgnyVar, zzfws zzfwsVar, int i) {
        this.zza = zzgnyVar;
        this.zzb = zzfwsVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.zzb.zza(copyOfRange2, zzgmv.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.zza.zza(copyOfRange);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb = this.zza.zzb(bArr);
        return zzgmv.zzb(zzb, this.zzb.zzb(zzgmv.zzb(bArr2, zzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
