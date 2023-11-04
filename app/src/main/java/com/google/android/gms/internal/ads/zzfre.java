package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
abstract class zzfre extends AbstractMap {
    @CheckForNull
    private transient Set zza;
    @CheckForNull
    private transient Set zzb;
    @CheckForNull
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set == null) {
            Set zzb = zzb();
            this.zza = zzb;
            return zzb;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set == null) {
            Set zze = zze();
            this.zzb = zze;
            return zze;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection == null) {
            zzfrd zzfrdVar = new zzfrd(this);
            this.zzc = zzfrdVar;
            return zzfrdVar;
        }
        return collection;
    }

    abstract Set zzb();

    Set zze() {
        return new zzfrc(this);
    }
}
