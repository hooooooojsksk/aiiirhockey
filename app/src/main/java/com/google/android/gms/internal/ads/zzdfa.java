package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdfa implements zzbhp {
    private final WeakReference zza;

    public /* synthetic */ zzdfa(zzdff zzdffVar, zzdez zzdezVar) {
        this.zza = new WeakReference(zzdffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        zzcum zzcumVar;
        zzdca zzdcaVar;
        zzdca zzdcaVar2;
        zzdff zzdffVar = (zzdff) this.zza.get();
        if (zzdffVar != null && "_ac".equals((String) map.get("eventName"))) {
            zzcumVar = zzdffVar.zzh;
            zzcumVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjf)).booleanValue()) {
                zzdcaVar = zzdffVar.zzi;
                zzdcaVar.zzr();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdcaVar2 = zzdffVar.zzi;
                zzdcaVar2.zzs();
            }
        }
    }
}
