package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzasj extends zzasm {
    private final View zzi;

    public zzasj(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2, View view) {
        super(zzaqxVar, "5jsrpffMyqRCbSKE996yDJ4IoI5qc646KRWjOLMSbw18UnvhA6jyNpaXxK5q8Rhj", "83UKU58KVDl1XjXA/sXoYfPwdBBAdREF/fSwIBsg4EE=", zzamvVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzasm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcV);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjl);
            zzarc zzarcVar = new zzarc((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzanq zza = zzanr.zza();
            zza.zzb(zzarcVar.zza.longValue());
            zza.zzd(zzarcVar.zzb.longValue());
            zza.zze(zzarcVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzarcVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzarcVar.zzd.longValue());
            }
            this.zze.zzY((zzanr) zza.zzal());
        }
    }
}
