package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.android.gms.games.GamesStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfjn {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfjo zzc;
    private final zzfhp zzd;
    private final zzfhk zze;
    private zzfjc zzf;
    private final Object zzg = new Object();

    public zzfjn(Context context, zzfjo zzfjoVar, zzfhp zzfhpVar, zzfhk zzfhkVar) {
        this.zzb = context;
        this.zzc = zzfjoVar;
        this.zzd = zzfhpVar;
        this.zze = zzfhkVar;
    }

    private final synchronized Class zzd(zzfjd zzfjdVar) throws zzfjm {
        String zzk = zzfjdVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfjdVar.zzc())) {
                try {
                    File zzb = zzfjdVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(zzfjdVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new zzfjm((int) AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            }
            throw new zzfjm(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzfjm(2026, e2);
        }
    }

    public final zzfhs zza() {
        zzfjc zzfjcVar;
        synchronized (this.zzg) {
            zzfjcVar = this.zzf;
        }
        return zzfjcVar;
    }

    public final zzfjd zzb() {
        synchronized (this.zzg) {
            zzfjc zzfjcVar = this.zzf;
            if (zzfjcVar != null) {
                return zzfjcVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfjd zzfjdVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfjc zzfjcVar = new zzfjc(zzd(zzfjdVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfjdVar.zze(), null, new Bundle(), 2), zzfjdVar, this.zzc, this.zzd);
                if (!zzfjcVar.zzh()) {
                    throw new zzfjm((int) GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND, "init failed");
                }
                int zze = zzfjcVar.zze();
                if (zze == 0) {
                    synchronized (this.zzg) {
                        zzfjc zzfjcVar2 = this.zzf;
                        if (zzfjcVar2 != null) {
                            try {
                                zzfjcVar2.zzg();
                            } catch (zzfjm e) {
                                this.zzd.zzc(e.zza(), -1L, e);
                            }
                        }
                        this.zzf = zzfjcVar;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfjm((int) GamesStatusCodes.STATUS_SNAPSHOT_CREATION_FAILED, "ci: " + zze);
            } catch (Exception e2) {
                throw new zzfjm((int) AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfjm e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
