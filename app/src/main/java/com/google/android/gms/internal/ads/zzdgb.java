package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdgb implements zzatf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgd zzb;

    public zzdgb(zzdgd zzdgdVar, String str) {
        this.zzb = zzdgdVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        Map map;
        zzdie zzdieVar;
        zzdie zzdieVar2;
        zzdie zzdieVar3;
        zzdie zzdieVar4;
        Map map2;
        zzdie zzdieVar5;
        zzdie zzdieVar6;
        zzdie zzdieVar7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbA)).booleanValue()) {
            synchronized (this) {
                if (zzateVar.zzj) {
                    zzdgd zzdgdVar = this.zzb;
                    zzdieVar4 = zzdgdVar.zzo;
                    if (zzdieVar4 == null) {
                        return;
                    }
                    map2 = zzdgdVar.zzy;
                    map2.put(this.zza, true);
                    zzdgd zzdgdVar2 = this.zzb;
                    zzdieVar5 = zzdgdVar2.zzo;
                    View zzf = zzdieVar5.zzf();
                    zzdieVar6 = this.zzb.zzo;
                    Map zzl = zzdieVar6.zzl();
                    zzdieVar7 = this.zzb.zzo;
                    zzdgdVar2.zzA(zzf, zzl, zzdieVar7.zzm(), true);
                }
            }
        } else if (zzateVar.zzj) {
            map = this.zzb.zzy;
            map.put(this.zza, true);
            zzdgd zzdgdVar3 = this.zzb;
            zzdieVar = zzdgdVar3.zzo;
            View zzf2 = zzdieVar.zzf();
            zzdieVar2 = this.zzb.zzo;
            Map zzl2 = zzdieVar2.zzl();
            zzdieVar3 = this.zzb.zzo;
            zzdgdVar3.zzA(zzf2, zzl2, zzdieVar3.zzm(), true);
        }
    }
}
