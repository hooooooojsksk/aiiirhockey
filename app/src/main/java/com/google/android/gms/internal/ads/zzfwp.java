package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfwp {
    private final zzgll zza;
    private final List zzb;
    private final zzggl zzc = zzggl.zza;

    private zzfwp(zzgll zzgllVar, List list) {
        this.zza = zzgllVar;
        this.zzb = list;
    }

    public static final zzfwp zza(zzgll zzgllVar) throws GeneralSecurityException {
        if (zzgllVar == null || zzgllVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfwp(zzgllVar, zzg(zzgllVar));
    }

    public static final zzfwp zzb(zzfwh zzfwhVar) throws GeneralSecurityException {
        zzgcx zzgcxVar = new zzgcx(zzgea.zza(zzfwhVar.zza()));
        zzfwm zzfwmVar = new zzfwm();
        zzfwk zzfwkVar = new zzfwk(zzgcxVar, null);
        zzfwkVar.zzd();
        zzfwkVar.zze();
        zzfwmVar.zza(zzfwkVar);
        return zzfwmVar.zzb();
    }

    private static zzgdz zze(zzglk zzglkVar) {
        try {
            return zzgdz.zza(zzglkVar.zzc().zzg(), zzglkVar.zzc().zzf(), zzglkVar.zzc().zzc(), zzglkVar.zzf(), zzglkVar.zzf() == zzgme.RAW ? null : Integer.valueOf(zzglkVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzgej("Creating a protokey serialization failed", e);
        }
    }

    @Nullable
    private static Object zzf(zzglk zzglkVar, Class cls) throws GeneralSecurityException {
        try {
            return zzfxf.zzg(zzglkVar.zzc(), cls);
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzg(zzgll zzgllVar) {
        zzfwg zzfwgVar;
        ArrayList arrayList = new ArrayList(zzgllVar.zza());
        for (zzglk zzglkVar : zzgllVar.zzi()) {
            int zza = zzglkVar.zza();
            try {
                zzfvx zza2 = zzgdf.zzb().zza(zze(zzglkVar), zzfxg.zza());
                int zzk = zzglkVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzfwgVar = zzfwg.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzfwgVar = zzfwg.zzb;
                    }
                } else {
                    zzfwgVar = zzfwg.zza;
                }
                arrayList.add(new zzfwo(zza2, zzfwgVar, zza, zza == zzgllVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    private static final Object zzh(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        try {
            return zzfxf.zzf(zzfvxVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        return zzfxh.zza(this.zza).toString();
    }

    public final zzgll zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzfxf.zze(cls);
        if (zze == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzfxh.zzb(this.zza);
        zzfww zzfwwVar = new zzfww(zze, null);
        zzfwwVar.zzc(this.zzc);
        for (int i = 0; i < this.zza.zza(); i++) {
            zzglk zze2 = this.zza.zze(i);
            if (zze2.zzk() == 3) {
                Object zzf = zzf(zze2, zze);
                Object zzh = this.zzb.get(i) != null ? zzh(((zzfwo) this.zzb.get(i)).zza(), zze) : null;
                if (zze2.zza() == this.zza.zzc()) {
                    zzfwwVar.zzb(zzh, zzf, zze2);
                } else {
                    zzfwwVar.zza(zzh, zzf, zze2);
                }
            }
        }
        return zzfxf.zzk(zzfwwVar.zzd(), cls);
    }
}
