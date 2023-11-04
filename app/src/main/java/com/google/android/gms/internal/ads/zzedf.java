package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedf implements zzeba {
    private final Context zza;
    private final zzddw zzb;

    public zzedf(Context context, zzddw zzddwVar) {
        this.zza = context;
        this.zzb = zzddwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        zzecz zzeczVar = new zzecz(zzeycVar, (zzbpc) zzeawVar.zzb, AdFormat.INTERSTITIAL);
        zzdcw zze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdcz(zzeczVar, null));
        zzeczVar.zzb(zze.zzc());
        ((zzecq) zzeawVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            ((zzbpc) zzeawVar.zzb).zzq(zzeycVar.zzaa);
            ((zzbpc) zzeawVar.zzb).zzl(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzede(this, zzeawVar, null), (zzbnl) zzeawVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzezc(e);
        }
    }
}
