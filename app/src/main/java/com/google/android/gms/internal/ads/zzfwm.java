package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfwm {
    private final List zza = new ArrayList();

    public final void zzd() {
        for (zzfwk zzfwkVar : this.zza) {
            zzfwkVar.zza = false;
        }
    }

    public final zzfwm zza(zzfwk zzfwkVar) {
        zzfwm zzfwmVar;
        boolean z;
        zzfwmVar = zzfwkVar.zzf;
        if (zzfwmVar != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        z = zzfwkVar.zza;
        if (z) {
            zzd();
        }
        zzfwkVar.zzf = this;
        this.zza.add(zzfwkVar);
        return this;
    }

    public final zzfwp zzb() throws GeneralSecurityException {
        zzfwl zzfwlVar;
        zzfwl zzfwlVar2;
        zzfwl zzfwlVar3;
        int i;
        zzfwu zzfwuVar;
        int i2;
        boolean z;
        zzfwl zzfwlVar4;
        zzfwl zzfwlVar5;
        zzfwl zzfwlVar6;
        zzfwl zzfwlVar7;
        zzfwg unused;
        zzfwl unused2;
        zzgli zzd = zzgll.zzd();
        List list = this.zza;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            zzfwlVar4 = ((zzfwk) list.get(i3)).zze;
            zzfwlVar5 = zzfwl.zza;
            if (zzfwlVar4 == zzfwlVar5) {
                zzfwlVar6 = ((zzfwk) list.get(i3 + 1)).zze;
                zzfwlVar7 = zzfwl.zza;
                if (zzfwlVar6 != zzfwlVar7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzfwk zzfwkVar : this.zza) {
            unused = zzfwkVar.zzb;
            zzfwlVar = zzfwkVar.zze;
            if (zzfwlVar != null) {
                zzfwlVar2 = zzfwkVar.zze;
                zzfwlVar3 = zzfwl.zza;
                if (zzfwlVar2 == zzfwlVar3) {
                    i = 0;
                    while (true) {
                        if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                            break;
                        }
                        i = zzgek.zza();
                    }
                } else {
                    unused2 = zzfwkVar.zze;
                    i = 0;
                }
                Integer valueOf = Integer.valueOf(i);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    zzfwk.zza(zzfwkVar);
                    zzfwuVar = zzfwkVar.zzd;
                    zzfwg zzc = zzfwkVar.zzc();
                    if (zzfwg.zza.equals(zzc)) {
                        i2 = 3;
                    } else if (zzfwg.zzb.equals(zzc)) {
                        i2 = 4;
                    } else if (!zzfwg.zzc.equals(zzc)) {
                        throw new IllegalStateException("Unknown key status");
                    } else {
                        i2 = 5;
                    }
                    zzgea zza = ((zzgcx) zzfwuVar).zza();
                    zzgky zzc2 = zzfxf.zzc(zza.zzb());
                    zzglj zzd2 = zzglk.zzd();
                    zzd2.zzb(i);
                    zzd2.zzd(i2);
                    zzd2.zza(zzc2);
                    zzd2.zzc(zza.zzb().zze());
                    zzd.zza((zzglk) zzd2.zzal());
                    z = zzfwkVar.zza;
                    if (z) {
                        if (num != null) {
                            throw new GeneralSecurityException("Two primaries were set");
                        }
                        num = valueOf;
                    }
                } else {
                    throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
                }
            } else {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzd.zzb(num.intValue());
        return zzfwp.zza((zzgll) zzd.zzal());
    }
}
