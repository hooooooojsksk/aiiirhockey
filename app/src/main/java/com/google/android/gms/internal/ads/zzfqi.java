package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfqi extends zzfom {
    private final zzfqk zza;

    public zzfqi(zzfqk zzfqkVar, int i) {
        super(zzfqkVar.size(), i);
        this.zza = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
