package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzauq implements Comparator {
    public zzauq(zzaur zzaurVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzauf zzaufVar = (zzauf) obj;
        zzauf zzaufVar2 = (zzauf) obj2;
        if (zzaufVar.zzd() >= zzaufVar2.zzd()) {
            if (zzaufVar.zzd() > zzaufVar2.zzd()) {
                return 1;
            }
            if (zzaufVar.zzb() >= zzaufVar2.zzb()) {
                if (zzaufVar.zzb() > zzaufVar2.zzb()) {
                    return 1;
                }
                float zza = (zzaufVar.zza() - zzaufVar.zzd()) * (zzaufVar.zzc() - zzaufVar.zzb());
                float zza2 = (zzaufVar2.zza() - zzaufVar2.zzd()) * (zzaufVar2.zzc() - zzaufVar2.zzb());
                if (zza <= zza2) {
                    return zza < zza2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
