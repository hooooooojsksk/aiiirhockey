package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzgfq {
    @Nullable
    private Integer zza;
    @Nullable
    private Integer zzb;
    private zzgfr zzc;
    private zzgfs zzd;

    private zzgfq() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    public /* synthetic */ zzgfq(zzgfp zzgfpVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgfs.zzd;
    }

    public final zzgfq zza(zzgfr zzgfrVar) {
        this.zzc = zzgfrVar;
        return this;
    }

    public final zzgfq zzb(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgfq zzc(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzgfq zzd(zzgfs zzgfsVar) {
        this.zzd = zzgfsVar;
        return this;
    }

    public final zzgfu zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    if (this.zzd == null) {
                        throw new GeneralSecurityException("variant is not set");
                    }
                    if (num.intValue() < 16) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
                    }
                    int intValue = this.zzb.intValue();
                    zzgfr zzgfrVar = this.zzc;
                    if (intValue < 10) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                    }
                    if (zzgfrVar == zzgfr.zza) {
                        if (intValue > 20) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                        }
                    } else if (zzgfrVar == zzgfr.zzb) {
                        if (intValue > 28) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                        }
                    } else if (zzgfrVar == zzgfr.zzc) {
                        if (intValue > 32) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                        }
                    } else if (zzgfrVar == zzgfr.zzd) {
                        if (intValue > 48) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                        }
                    } else if (zzgfrVar != zzgfr.zze) {
                        throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                    } else {
                        if (intValue > 64) {
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                        }
                    }
                    return new zzgfu(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}
