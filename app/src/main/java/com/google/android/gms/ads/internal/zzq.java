package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzbza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        WebView webView;
        WebView webView2;
        String str = (String) obj;
        zzs zzsVar = this.zza;
        webView = zzsVar.zzf;
        if (webView == null || str == null) {
            return;
        }
        webView2 = zzsVar.zzf;
        webView2.loadUrl(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzs zzsVar = this.zza;
            future = zzsVar.zzc;
            zzsVar.zzh = (zzapw) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            zzbza.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            zzbza.zzk("", e);
        } catch (TimeoutException e3) {
            zzbza.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
