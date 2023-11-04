package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgao extends zzgam {
    public zzgao(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    final zzgak zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgan(bArr, i);
    }
}
