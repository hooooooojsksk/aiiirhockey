package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzgri extends zzgrk {
    private zzgri() {
        super(null);
    }

    public /* synthetic */ zzgri(zzgrh zzgrhVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final List zza(Object obj, long j) {
        zzgqv zzgqvVar = (zzgqv) zzgtq.zzh(obj, j);
        if (zzgqvVar.zzc()) {
            return zzgqvVar;
        }
        int size = zzgqvVar.size();
        zzgqv zzd = zzgqvVar.zzd(size == 0 ? 10 : size + size);
        zzgtq.zzv(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final void zzb(Object obj, long j) {
        ((zzgqv) zzgtq.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgrk
    public final void zzc(Object obj, Object obj2, long j) {
        zzgqv zzgqvVar = (zzgqv) zzgtq.zzh(obj, j);
        zzgqv zzgqvVar2 = (zzgqv) zzgtq.zzh(obj2, j);
        int size = zzgqvVar.size();
        int size2 = zzgqvVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgqvVar.zzc()) {
                zzgqvVar = zzgqvVar.zzd(size2 + size);
            }
            zzgqvVar.addAll(zzgqvVar2);
        }
        if (size > 0) {
            zzgqvVar2 = zzgqvVar;
        }
        zzgtq.zzv(obj, j, zzgqvVar2);
    }
}
