package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfym {
    @Nullable
    private zzfyw zza = null;
    @Nullable
    private zzgok zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzfym() {
    }

    public /* synthetic */ zzfym(zzfyl zzfylVar) {
    }

    public final zzfym zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfym zzb(zzgok zzgokVar) {
        this.zzb = zzgokVar;
        return this;
    }

    public final zzfym zzc(zzfyw zzfywVar) {
        this.zza = zzfywVar;
        return this;
    }

    public final zzfyo zzd() throws GeneralSecurityException {
        zzgok zzgokVar;
        zzgoj zzb;
        zzfyw zzfywVar = this.zza;
        if (zzfywVar == null || (zzgokVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzfywVar.zza() == zzgokVar.zza()) {
            if (!zzfywVar.zzc() || this.zzc != null) {
                if (this.zza.zzc() || this.zzc == null) {
                    if (this.zza.zzb() == zzfyu.zzc) {
                        zzb = zzgoj.zzb(new byte[0]);
                    } else if (this.zza.zzb() == zzfyu.zzb) {
                        zzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                    } else if (this.zza.zzb() != zzfyu.zza) {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzb()))));
                    } else {
                        zzb = zzgoj.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    }
                    return new zzfyo(this.zza, this.zzb, zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
