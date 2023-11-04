package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzccr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzccu zzd;

    public zzccr(zzccu zzccuVar, String str, String str2, int i) {
        this.zzd = zzccuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzccu.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
