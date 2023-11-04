package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfzz implements zzfvo {
    private static final byte[] zza = new byte[0];
    private final zzgld zzb;
    private final zzfvo zzc;

    public zzfzz(zzgld zzgldVar, zzfvo zzfvoVar) {
        this.zzb = zzgldVar;
        this.zzc = zzfvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzfvo) zzfxf.zzj(this.zzb.zzg(), this.zzc.zza(bArr3, zza), zzfvo.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzax = zzfxf.zzd(this.zzb).zzax();
        byte[] zzb = this.zzc.zzb(zzax, zza);
        byte[] zzb2 = ((zzfvo) zzfxf.zzj(this.zzb.zzg(), zzax, zzfvo.class)).zzb(bArr, bArr2);
        int length = zzb.length;
        return ByteBuffer.allocate(length + 4 + zzb2.length).putInt(length).put(zzb).put(zzb2).array();
    }
}
