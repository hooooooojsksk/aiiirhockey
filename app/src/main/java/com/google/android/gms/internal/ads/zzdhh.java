package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdhh implements zzbdk {
    final /* synthetic */ zzdie zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdhh(zzdie zzdieVar, ViewGroup viewGroup) {
        this.zza = zzdieVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final void zzc() {
        zzdie zzdieVar = this.zza;
        zzfqk zzfqkVar = zzdhe.zza;
        Map zzm = zzdieVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfqkVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzm.get((String) zzfqkVar.get(i));
            i++;
            if (obj != null) {
                this.zza.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdk
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
