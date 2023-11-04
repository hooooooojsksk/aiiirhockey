package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzexz extends zzbuf {
    private final zzexp zza;
    private final zzexf zzb;
    private final zzeyp zzc;
    private zzdlu zzd;
    private boolean zze = false;

    public zzexz(zzexp zzexpVar, zzexf zzexfVar, zzeyp zzeypVar) {
        this.zza = zzexpVar;
        this.zzb = zzexfVar;
        this.zzc = zzeypVar;
    }

    private final synchronized boolean zzy() {
        boolean z;
        zzdlu zzdluVar = this.zzd;
        if (zzdluVar != null) {
            z = zzdluVar.zze() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdlu zzdluVar = this.zzd;
        return zzdluVar != null ? zzdluVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgp)).booleanValue()) {
            zzdlu zzdluVar = this.zzd;
            if (zzdluVar != null) {
                return zzdluVar.zzl();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized String zzd() throws RemoteException {
        zzdlu zzdluVar = this.zzd;
        if (zzdluVar == null || zzdluVar.zzl() == null) {
            return null;
        }
        return zzdluVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzg(zzbuk zzbukVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbukVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeV);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeX)).booleanValue()) {
                return;
            }
        }
        zzexh zzexhVar = new zzexh(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbukVar.zza, zzbukVar.zzb, zzexhVar, new zzexx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzexy(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzo(zzbuj zzbujVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final boolean zzt() {
        zzdlu zzdluVar = this.zzd;
        return zzdluVar != null && zzdluVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzu(zzbue zzbueVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzg(zzbueVar);
    }
}
