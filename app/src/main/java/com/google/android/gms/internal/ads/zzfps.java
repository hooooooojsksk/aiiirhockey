package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
final class zzfps extends zzfpg {
    final /* synthetic */ zzfpu zza;
    private final Object zzb;
    private int zzc;

    public zzfps(zzfpu zzfpuVar, int i) {
        this.zza = zzfpuVar;
        Object[] objArr = zzfpuVar.zzb;
        objArr.getClass();
        this.zzb = objArr[i];
        this.zzc = i;
    }

    private final void zza() {
        int zzp;
        int i = this.zzc;
        if (i != -1 && i < this.zza.size()) {
            Object obj = this.zzb;
            zzfpu zzfpuVar = this.zza;
            int i2 = this.zzc;
            Object[] objArr = zzfpuVar.zzb;
            objArr.getClass();
            if (zzfnp.zza(obj, objArr[i2])) {
                return;
            }
        }
        zzp = this.zza.zzp(this.zzb);
        this.zzc = zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzfpg, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfpg, java.util.Map.Entry
    public final Object getValue() {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        return objArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzfpg, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr.getClass();
        objArr[i] = obj;
        return obj2;
    }
}
