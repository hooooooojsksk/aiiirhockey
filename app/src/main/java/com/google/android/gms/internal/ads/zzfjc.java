package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfjc implements zzfhs {
    private final Object zza;
    private final zzfjd zzb;
    private final zzfjo zzc;
    private final zzfhp zzd;

    public zzfjc(Object obj, zzfjd zzfjdVar, zzfjo zzfjoVar, zzfhp zzfhpVar) {
        this.zza = obj;
        this.zzb = zzfjdVar;
        this.zzc = zzfjoVar;
        this.zzd = zzfhpVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaoe zza = zzaof.zza();
        zza.zzc(5);
        zza.zza(zzgpe.zzv(bArr));
        return Base64.encodeToString(((zzaof) zza.zzal()).zzax(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put(InneractiveMediationDefs.GENDER_FEMALE, "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfjm {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfjm(2005, e);
        }
    }

    public final synchronized int zze() throws zzfjm {
        try {
        } catch (Exception e) {
            throw new zzfjm((int) AdError.INTERNAL_ERROR_2006, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfjd zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfjm {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfjm((int) AdError.INTERNAL_ERROR_2003, e);
        }
    }

    public final synchronized boolean zzh() throws zzfjm {
        try {
        } catch (Exception e) {
            throw new zzfjm(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
