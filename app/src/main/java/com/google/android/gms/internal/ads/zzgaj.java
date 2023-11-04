package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgaj extends zzgak {
    public zzgaj(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final int[] zzb(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzgag.zzb(iArr2, this.zza);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
