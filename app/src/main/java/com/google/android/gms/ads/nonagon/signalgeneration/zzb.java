package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzb extends LinkedHashMap {
    final /* synthetic */ zzc zza;

    public zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            int size = size();
            zzc zzcVar = this.zza;
            i = zzcVar.zza;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzcVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i2 = this.zza.zza;
            return size2 > i2;
        }
    }
}
