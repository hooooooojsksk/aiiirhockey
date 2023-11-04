package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzcfi {
    private final zzcfj zza;
    private final zzcfh zzb;

    public zzcfi(zzcfj zzcfjVar, zzcfh zzcfhVar, byte[] bArr) {
        this.zzb = zzcfhVar;
        this.zza = zzcfjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzapw zzI = r0.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaps zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcfj zzcfjVar = this.zza;
            return zzc.zzf(context, str, (View) zzcfjVar, zzcfjVar.zzi());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzapw zzI = r0.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaps zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcfj zzcfjVar = this.zza;
            return zzc.zzh(context, (View) zzcfjVar, zzcfjVar.zzi());
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzbza.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        zzcfh zzcfhVar = this.zzb;
        Uri parse = Uri.parse(str);
        zzcep zzaJ = ((zzcfb) zzcfhVar.zza).zzaJ();
        if (zzaJ == null) {
            zzbza.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
