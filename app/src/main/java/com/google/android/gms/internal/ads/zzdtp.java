package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdtp implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdtp(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfcu zzfcuVar = zzfcu.WEBVIEW_COOKIE;
        zzfcr zzi = zzfck.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzaH));
            }
        }, zzfcuVar, (zzfda) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzdtn zzdtnVar = new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdtn
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzftq() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzfuj.zzh("");
            }
        }).zza();
    }
}
