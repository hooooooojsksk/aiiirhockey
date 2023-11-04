package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzedu implements zzeba {
    private final Context zza;
    private final zzdes zzb;
    private zzbnu zzc;
    private final zzbzg zzd;

    public zzedu(Context context, zzdes zzdesVar, zzbzg zzbzgVar) {
        this.zza = context;
        this.zzb = zzdesVar;
        this.zzd = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        if (!zzeyoVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzeek(2, "Unified must be used for RTB.");
        }
        zzdgi zzs = zzdgi.zzs(this.zzc);
        if (!zzeyoVar.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
            throw new zzeek(1, "No corresponding native ad listener");
        }
        zzdgk zze = this.zzb.zze(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzdgu(zzs), new zzdij(null, null, this.zzc, null));
        ((zzecq) zzeawVar.zzc).zzc(zze.zzi());
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            ((zzbpc) zzeawVar.zzb).zzq(zzeycVar.zzaa);
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzby)).intValue()) {
                ((zzbpc) zzeawVar.zzb).zzm(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedt(this, zzeawVar, null), (zzbnl) zzeawVar.zzc);
            } else {
                ((zzbpc) zzeawVar.zzb).zzn(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedt(this, zzeawVar, null), (zzbnl) zzeawVar.zzc, zzeyoVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzezc(e);
        }
    }
}
