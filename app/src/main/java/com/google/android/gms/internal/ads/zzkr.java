package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzkr {
    private final zzht zza;

    @Deprecated
    public zzkr(Context context, zzcdr zzcdrVar, byte[] bArr) {
        this.zza = new zzht(context, zzcdrVar, null);
    }

    @Deprecated
    public final zzkr zza(final zzjp zzjpVar) {
        zzht zzhtVar = this.zza;
        zzdl.zzf(!zzhtVar.zzq);
        Objects.requireNonNull(zzjpVar);
        zzhtVar.zzf = new zzfok() { // from class: com.google.android.gms.internal.ads.zzhl
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzjp.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzkr zzb(final zzwk zzwkVar) {
        zzht zzhtVar = this.zza;
        zzdl.zzf(!zzhtVar.zzq);
        Objects.requireNonNull(zzwkVar);
        zzhtVar.zze = new zzfok() { // from class: com.google.android.gms.internal.ads.zzhm
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzwk.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzks zzc() {
        zzht zzhtVar = this.zza;
        zzdl.zzf(!zzhtVar.zzq);
        zzhtVar.zzq = true;
        return new zzks(zzhtVar);
    }
}
