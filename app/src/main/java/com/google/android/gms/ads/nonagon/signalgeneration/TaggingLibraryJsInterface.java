package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfuu;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzapw zzc;
    private final int zzd;
    private final zzdpn zze;
    private final boolean zzf;
    private final zzfuu zzg = zzbzn.zze;
    private final zzfff zzh;

    public TaggingLibraryJsInterface(WebView webView, zzapw zzapwVar, zzdpn zzdpnVar, zzfff zzfffVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzapwVar;
        this.zze = zzdpnVar;
        zzbar.zzc(context);
        this.zzd = ((Integer) zzba.zzc().zzb(zzbar.zziG)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbar.zziH)).booleanValue();
        this.zzh = zzfffVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e) {
            zzbza.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            zzbza.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzn.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbza.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzat zzatVar = new zzat(this, uuid);
        if (((Boolean) zzba.zzc().zzb(zzbar.zziJ)).booleanValue()) {
            this.zzg.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.this.zzb(bundle, zzatVar);
                }
            });
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzatVar);
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            zzbza.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzbza.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzn.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzar
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbza.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().zzb(zzbar.zziN)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.this.zzc(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            i4 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.zzc.zzd(MotionEvent.obtain(0L, i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            zzbza.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e3) {
            e = e3;
            zzbza.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    public final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", zzb != null ? zzb.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzc(String str) {
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzc.zza(parse, this.zza, this.zzb, null);
        } catch (zzapx e) {
            zzbza.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(parse.toString(), null);
    }
}
