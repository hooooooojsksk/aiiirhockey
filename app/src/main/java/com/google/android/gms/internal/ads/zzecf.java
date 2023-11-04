package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzecf implements zzeba {
    private final Context zza;
    private final zzcph zzb;
    private View zzc;
    private zzbno zzd;

    public zzecf(Context context, zzcph zzcphVar) {
        this.zza = context;
        this.zzb = zzcphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, final zzeyc zzeycVar, final zzeaw zzeawVar) throws zzezc, zzeek {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() && zzeycVar.zzah) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzezc(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzecb
                            @Override // com.google.android.gms.internal.ads.zzftq
                            public final zzfut zza(Object obj) {
                                return zzecf.this.zzc(view, zzeycVar, obj);
                            }
                        }, zzbzn.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzezc(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzezc(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcol zza = this.zzb.zza(new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza), new zzcor(view, null, new zzcqk() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzcqk
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbpc) zzeaw.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzezc(e3);
                }
            }
        }, (zzeyd) zzeycVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzecq) zzeawVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        try {
            ((zzbpc) zzeawVar.zzb).zzq(zzeycVar.zzaa);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() || !zzeycVar.zzah) {
                ((zzbpc) zzeawVar.zzb).zzj(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzece(this, zzeawVar, null), (zzbnl) zzeawVar.zzc, zzeyoVar.zza.zza.zze);
            } else {
                ((zzbpc) zzeawVar.zzb).zzk(zzeycVar.zzV, zzeycVar.zzw.toString(), zzeyoVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzece(this, zzeawVar, null), (zzbnl) zzeawVar.zzc, zzeyoVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzezc(e);
        }
    }

    public final /* synthetic */ zzfut zzc(View view, zzeyc zzeycVar, Object obj) throws Exception {
        return zzfuj.zzh(zzcpy.zza(this.zza, view, zzeycVar));
    }
}
