package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbof extends zzbnh {
    private final Object zza;
    private zzboh zzb;
    private zzbuo zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private MediationRewardedAd zzh;
    private MediationInterscrollerAd zzi;
    private MediationAppOpenAd zzj;
    private final String zzk = "";

    public zzbof(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzU(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) throws RemoteException {
        zzbza.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbza.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzW(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbyt.zzs();
    }

    private static final String zzX(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Requesting rewarded ad from adapter.");
        try {
            ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbod(this, zzbnlVar));
        } catch (Exception e) {
            zzbza.zzh("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzA(this.zzd, zzlVar, str, new zzboi((Adapter) obj, this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Requesting rewarded interstitial ad from adapter.");
        try {
            ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzbod(this, zzbnlVar));
        } catch (Exception e) {
            zzbza.zzh("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbza.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbza.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzbza.zzh("", th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbza.zze(canonicalName + " #009 Class mismatch: " + canonicalName2);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzj;
        if (mediationAppOpenAd != null) {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzbza.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzI() throws RemoteException {
        if (!(this.zza instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zza).showInterstitial();
        } catch (Throwable th) {
            zzbza.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzI();
                return;
            }
            zzbza.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.zzf;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } else {
                zzbza.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzh;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzbza.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzL() throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.zzh;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
        } else {
            zzbza.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final boolean zzN() throws RemoteException {
        if (this.zza instanceof Adapter) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnq zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnr zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                zzbza.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzber zzi() {
        zzboh zzbohVar = this.zzb;
        if (zzbohVar != null) {
            NativeCustomTemplateAd zza = zzbohVar.zza();
            if (zza instanceof zzbes) {
                return ((zzbes) zza).zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbno zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzi;
        if (mediationInterscrollerAd != null) {
            return new zzbog(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbnu zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.zzg) == null) {
                return null;
            }
            return new zzbok(unifiedNativeAdMapper);
        }
        zzboh zzbohVar = this.zzb;
        if (zzbohVar == null || (zzb = zzbohVar.zzb()) == null) {
            return null;
        }
        return new zzbok(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbpq zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbpq.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzbpq zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbpq.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbza.zzh("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbza.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbuo zzbuoVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbuoVar;
        zzbuoVar.zzl(ObjectWrapper.wrap(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzq(IObjectWrapper iObjectWrapper, zzbjp zzbjpVar, List list) throws RemoteException {
        char c;
        AdFormat adFormat;
        if (this.zza instanceof Adapter) {
            zzbnz zzbnzVar = new zzbnz(this, zzbjpVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbjv zzbjvVar = (zzbjv) it.next();
                String str = zzbjvVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1167692200:
                        if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    adFormat = AdFormat.BANNER;
                } else if (c == 1) {
                    adFormat = AdFormat.INTERSTITIAL;
                } else if (c == 2) {
                    adFormat = AdFormat.REWARDED;
                } else if (c == 3) {
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                } else if (c != 4) {
                    adFormat = c != 5 ? null : AdFormat.APP_OPEN_AD;
                } else {
                    adFormat = AdFormat.NATIVE;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbjvVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnzVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzr(IObjectWrapper iObjectWrapper, zzbuo zzbuoVar, List list) throws RemoteException {
        zzbza.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Requesting app open ad from adapter.");
        try {
            ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, null), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), ""), new zzboe(this, zzbnlVar));
        } catch (Exception e) {
            zzbza.zzh("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzbnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        AdSize zzc;
        RemoteException remoteException;
        Object obj = this.zza;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            zzbza.zze("Requesting banner ad from adapter.");
            if (zzqVar.zzn) {
                zzc = com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb);
            } else {
                zzc = com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
            }
            AdSize adSize = zzc;
            Object obj2 = this.zza;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = zzlVar.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzlVar.zzb;
                    zzbnx zzbnxVar = new zzbnx(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                    Bundle bundle = zzlVar.zzm;
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzboh(zzbnlVar), zzV(str, zzlVar, str2), adSize, zzbnxVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                    return;
                } finally {
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), adSize, this.zzk), new zzboa(this, zzbnlVar));
                    return;
                } finally {
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        if (!(this.zza instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zza.getClass().getCanonicalName();
            zzbza.zzj(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
        zzbza.zze("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) this.zza;
            adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbny(this, zzbnlVar, adapter));
        } catch (Exception e) {
            zzbza.zzh("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbnl zzbnlVar) throws RemoteException {
        zzy(iObjectWrapper, zzlVar, str, null, zzbnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            zzbza.zze("Requesting interstitial ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = zzlVar.zze;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzlVar.zzb;
                    zzbnx zzbnxVar = new zzbnx(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                    Bundle bundle = zzlVar.zzm;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzboh(zzbnlVar), zzV(str, zzlVar, str2), zzbnxVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                    return;
                } finally {
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk), new zzbob(this, zzbnlVar));
                    return;
                } finally {
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbnl zzbnlVar, zzbdl zzbdlVar, List list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.zza;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            zzbza.zze("Requesting native ad from adapter.");
            Object obj2 = this.zza;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = zzlVar.zze;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzlVar.zzb;
                    zzboj zzbojVar = new zzboj(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, zzW(zzlVar), zzlVar.zzg, zzbdlVar, list, zzlVar.zzr, zzlVar.zzt, zzX(str, zzlVar));
                    Bundle bundle = zzlVar.zzm;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.zzb = new zzboh(zzbnlVar);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzV(str, zzlVar, str2), zzbojVar, bundle2);
                    return;
                } finally {
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzV(str, zzlVar, str2), zzU(zzlVar), zzW(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzX(str, zzlVar), this.zzk, zzbdlVar), new zzboc(this, zzbnlVar));
                    return;
                } finally {
                }
            } else {
                return;
            }
        }
        String canonicalName = MediationNativeAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zza.getClass().getCanonicalName();
        zzbza.zzj(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
        throw new RemoteException();
    }

    public zzbof(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
