package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzfpp extends AbstractSet {
    final /* synthetic */ zzfpu zza;

    public zzfpp(zzfpu zzfpuVar) {
        this.zza = zzfpuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzp;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzp = this.zza.zzp(entry.getKey());
            if (zzp != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfnp.zza(objArr[zzp], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfpu zzfpuVar = this.zza;
        Map zzj = zzfpuVar.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new zzfpn(zzfpuVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzo;
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzfpu zzfpuVar = this.zza;
            if (zzfpuVar.zzn()) {
                return false;
            }
            zzo = zzfpuVar.zzo();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzi = zzfpu.zzi(this.zza);
            zzfpu zzfpuVar2 = this.zza;
            int[] iArr = zzfpuVar2.zza;
            iArr.getClass();
            Object[] objArr = zzfpuVar2.zzb;
            objArr.getClass();
            Object[] objArr2 = zzfpuVar2.zzc;
            objArr2.getClass();
            int zzb = zzfpv.zzb(key, value, zzo, zzi, iArr, objArr, objArr2);
            if (zzb == -1) {
                return false;
            }
            this.zza.zzm(zzb, zzo);
            zzfpu.zzb(this.zza);
            this.zza.zzk();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
