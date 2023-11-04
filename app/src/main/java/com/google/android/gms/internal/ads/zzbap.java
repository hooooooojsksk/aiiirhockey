package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbap implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbaw.zza(new zzfok() { // from class: com.google.android.gms.internal.ads.zzban
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object zza() {
                    return zzbap.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbaj zzbajVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbajVar.zzm();
            }
        }
        if (zzbajVar.zze() == 2) {
            Bundle bundle = this.zzf;
            return bundle == null ? zzbajVar.zzm() : zzbajVar.zzb(bundle);
        } else if (zzbajVar.zze() != 1 || !this.zzh.has(zzbajVar.zzn())) {
            return zzbaw.zza(new zzfok() { // from class: com.google.android.gms.internal.ads.zzbam
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object zza() {
                    return zzbap.this.zzc(zzbajVar);
                }
            });
        } else {
            return zzbajVar.zza(this.zzh);
        }
    }

    public final /* synthetic */ Object zzc(zzbaj zzbajVar) {
        return zzbajVar.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null || context == null || (remoteContext = context.getApplicationContext()) != null) {
                context = remoteContext;
            }
            if (context == null) {
                this.zza = false;
                this.zzc.open();
                return;
            }
            com.google.android.gms.ads.internal.client.zzba.zzb();
            SharedPreferences zza = zzbal.zza(context);
            this.zze = zza;
            if (zza != null) {
                zza.registerOnSharedPreferenceChangeListener(this);
            }
            zzbdc.zzc(new zzbao(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }
}
