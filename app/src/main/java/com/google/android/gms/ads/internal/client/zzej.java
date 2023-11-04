package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();
    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            zzbza.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    public static InitializationStatus zzx(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbjl zzbjlVar = (zzbjl) it.next();
            hashMap.put(zzbjlVar.zza, new zzbjt(zzbjlVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbjlVar.zzd, zzbjlVar.zzc));
        }
        return new zzbju(hashMap);
    }

    private final void zzy(Context context, @Nullable String str) {
        try {
            zzbmy.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzbza.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzz(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzx;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzx = zzx(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzej zzejVar = zzej.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzee(zzejVar));
                        return hashMap;
                    }
                };
            }
        }
        return zzx;
    }

    public final void zzk(Context context) {
        synchronized (this.zzf) {
            zzz(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzl(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z);
            } catch (RemoteException e) {
                String str = z ? "enable" : "disable";
                zzbza.zzh("Unable to " + str + " Same App Key.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public final void zzm(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
            } else if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
            } else {
                this.zzd = true;
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                if (context != null) {
                    synchronized (this.zzf) {
                        try {
                            zzz(context);
                            this.zzg.zzs(new zzei(this, null));
                            this.zzg.zzo(new zzbnc());
                            if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                                zzA(this.zzi);
                            }
                        } catch (RemoteException e) {
                            zzbza.zzk("MobileAdsSettingManager initialization failed", e);
                        }
                        zzbar.zzc(context);
                        if (((Boolean) zzbci.zza.zze()).booleanValue()) {
                            if (((Boolean) zzba.zzc().zzb(zzbar.zzjv)).booleanValue()) {
                                zzbza.zze("Initializing on bg thread");
                                zzbyp.zza.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzec
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzej.this.zzn(this.zzb, null);
                                    }
                                });
                            }
                        }
                        if (((Boolean) zzbci.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzba.zzc().zzb(zzbar.zzjv)).booleanValue()) {
                                zzbyp.zzb.execute(new Runnable(context, null) { // from class: com.google.android.gms.ads.internal.client.zzed
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzej.this.zzo(this.zzb, null);
                                    }
                                });
                            }
                        }
                        zzbza.zze("Initializing on calling thread");
                        zzy(context, null);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public final /* synthetic */ void zzn(Context context, String str) {
        synchronized (this.zzf) {
            zzy(context, null);
        }
    }

    public final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzy(context, null);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzz(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzbza.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzt(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzu(String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzv(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzA(requestConfiguration);
            }
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float f = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f = zzcoVar.zze();
            } catch (RemoteException e) {
                zzbza.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final boolean zzw() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean z = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z = zzcoVar.zzv();
            } catch (RemoteException e) {
                zzbza.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
