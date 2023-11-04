package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzgeu {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    private zzgev zzc;

    private zzgeu() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    public /* synthetic */ zzgeu(zzget zzgetVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgev.zzd;
    }

    public final zzgeu zzc(zzgev zzgevVar) {
        this.zzc = zzgevVar;
        return this;
    }

    public final zzgex zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgex(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public final zzgeu zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
    }

    public final zzgeu zzb(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }
}
