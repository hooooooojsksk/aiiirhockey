package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzatx implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzaum) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzbza.zzh("", e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzaum zzaumVar : this.zzg) {
                try {
                    zzaumVar.zzb();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbza.zzh("", e);
                }
            }
        }
        this.zze = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        zzfkr zzfkrVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzatw zzatwVar = new zzatw(this);
        this.zzh = zzatwVar;
        zzfkrVar.postDelayed(zzatwVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        synchronized (this.zzc) {
            for (zzaum zzaumVar : this.zzg) {
                try {
                    zzaumVar.zzc();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbza.zzh("", e);
                }
            }
            if (z) {
                for (zzaty zzatyVar : this.zzf) {
                    try {
                        zzatyVar.zza(true);
                    } catch (Exception e2) {
                        zzbza.zzh("", e2);
                    }
                }
            } else {
                zzbza.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzaty zzatyVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzatyVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaM)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzaty zzatyVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzatyVar);
        }
    }
}
