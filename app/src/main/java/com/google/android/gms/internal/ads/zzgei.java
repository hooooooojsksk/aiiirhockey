package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzgei {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgei(zzgec zzgecVar, zzgeh zzgehVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgecVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgecVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgecVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgecVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzfvx zza(zzgeb zzgebVar, @Nullable zzfxg zzfxgVar) throws GeneralSecurityException {
        zzgee zzgeeVar = new zzgee(zzgebVar.getClass(), zzgebVar.zzd(), null);
        if (!this.zzb.containsKey(zzgeeVar)) {
            String obj = zzgeeVar.toString();
            throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
        }
        return ((zzgcn) this.zzb.get(zzgeeVar)).zza(zzgebVar, zzfxgVar);
    }

    public final boolean zzf(zzgeb zzgebVar) {
        return this.zzb.containsKey(new zzgee(zzgebVar.getClass(), zzgebVar.zzd(), null));
    }
}
