package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdhe;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzetc;
import com.google.android.gms.internal.ads.zzetd;
import com.google.android.gms.internal.ads.zzeuq;
import com.google.android.gms.internal.ads.zzewh;
import com.google.android.gms.internal.ads.zzexv;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbnf zzbnfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzehe(zzcgd.zza(context, zzbnfVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbnf zzbnfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzetc zzr = zzcgd.zza(context, zzbnfVar, i).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        zzetd zzc = zzr.zzc();
        if (i >= ((Integer) zzba.zzc().zzb(zzbar.zzeN)).intValue()) {
            return zzc.zza();
        }
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbnf zzbnfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeuq zzs = zzcgd.zza(context, zzbnfVar, i).zzs();
        zzs.zzc(context);
        zzs.zza(zzqVar);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbnf zzbnfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewh zzt = zzcgd.zza(context, zzbnfVar, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzqVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzbzg(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcgd.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) {
        return zzcgd.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnfVar, i).zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeb zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdhe((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeh zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdhc((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbip zzk(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i, zzbim zzbimVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdqq zzi = zzcgd.zza(context, zzbnfVar, i).zzi();
        zzi.zzb(context);
        zzi.zza(zzbimVar);
        return zzi.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbqv zzl(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) {
        return zzcgd.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnfVar, i).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrc zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = zza.zzk;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new zzac(activity);
                        }
                        return new com.google.android.gms.ads.internal.overlay.zzt(activity);
                    }
                    return new zzy(activity, zza);
                }
                return new zzaf(activity);
            }
            return new zzae(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbug zzn(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexv zzu = zzcgd.zza(context, zzbnfVar, i).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuw zzo(IObjectWrapper iObjectWrapper, String str, zzbnf zzbnfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexv zzu = zzcgd.zza(context, zzbnfVar, i).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxr zzp(IObjectWrapper iObjectWrapper, zzbnf zzbnfVar, int i) {
        return zzcgd.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnfVar, i).zzo();
    }
}
