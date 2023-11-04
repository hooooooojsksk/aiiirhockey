package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdsz extends com.google.android.gms.ads.internal.client.zzdi {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsn zzc;
    private final zzfuu zzd;
    private final zzdta zze;
    private zzdsf zzf;

    public zzdsz(Context context, zzdsn zzdsnVar, zzdta zzdtaVar, zzfuu zzfuuVar) {
        this.zzb = context;
        this.zzc = zzdsnVar;
        this.zzd = zzfuuVar;
        this.zze = zzdtaVar;
    }

    private static AdRequest zzj() {
        return new AdRequest.Builder().build();
    }

    public static String zzk(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdn zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (obj instanceof NativeAd) {
                responseInfo = ((NativeAd) obj).getResponseInfo();
            }
            return "";
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void zzl(String str, String str2) {
        try {
            zzfuj.zzq(this.zzf.zzb(str), new zzdsx(this, str2), this.zzd);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzc.zzk(str2);
        }
    }

    private final synchronized void zzm(String str, String str2) {
        try {
            zzfuj.zzq(this.zzf.zzb(str), new zzdsy(this, str2), this.zzd);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "OutOfContextTester.setAdAsShown");
            this.zzc.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzdta.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdta.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdsf zzdsfVar) {
        this.zzf = zzdsfVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzl(zzk(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            AppOpenAd.load(this.zzb, str, zzj(), 1, new zzdsr(this, str, str3));
        } else if (c == 1) {
            AdView adView = new AdView(this.zzb);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzdss(this, str, adView, str3));
            adView.loadAd(zzj());
        } else if (c == 2) {
            InterstitialAd.load(this.zzb, str, zzj(), new zzdst(this, str, str3));
        } else if (c == 3) {
            AdLoader.Builder builder = new AdLoader.Builder(this.zzb, str);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdsq
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    zzdsz.this.zzg(str, nativeAd, str3);
                }
            });
            builder.withAdListener(new zzdsw(this, str3));
            builder.build().loadAd(zzj());
        } else if (c == 4) {
            RewardedAd.load(this.zzb, str, zzj(), new zzdsu(this, str, str3));
        } else if (c != 5) {
        } else {
            RewardedInterstitialAd.load(this.zzb, str, zzj(), new zzdsv(this, str, str3));
        }
    }

    public final synchronized void zzi(String str, String str2) {
        Activity zzg = this.zzc.zzg();
        if (zzg == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziC)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
            this.zza.remove(str);
        }
        zzm(zzk(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(zzg);
        } else if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(zzg);
        } else if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdso
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdsp
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziC)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                intent.setClassName(this.zzb, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzb, intent);
            }
        }
    }
}
