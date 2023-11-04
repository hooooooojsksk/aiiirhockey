package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfzk {
    @Nullable
    private Integer zza;
    private zzfzl zzb;

    private zzfzk() {
        this.zza = null;
        throw null;
    }

    public /* synthetic */ zzfzk(zzfzj zzfzjVar) {
        this.zza = null;
        this.zzb = zzfzl.zzc;
    }

    public final zzfzk zzb(zzfzl zzfzlVar) {
        this.zzb = zzfzlVar;
        return this;
    }

    public final zzfzn zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzfzn(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final zzfzk zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
    }
}
