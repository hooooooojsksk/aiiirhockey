package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdhi {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzeyx zzc;
    private final zzdgn zzd;
    private final zzdgi zze;
    private final zzdhu zzf;
    private final zzdic zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbdl zzj;
    private final zzdgf zzk;

    public zzdhi(com.google.android.gms.ads.internal.util.zzg zzgVar, zzeyx zzeyxVar, zzdgn zzdgnVar, zzdgi zzdgiVar, zzdhu zzdhuVar, zzdic zzdicVar, Executor executor, Executor executor2, zzdgf zzdgfVar) {
        this.zzb = zzgVar;
        this.zzc = zzeyxVar;
        this.zzj = zzeyxVar.zzi;
        this.zzd = zzdgnVar;
        this.zze = zzdgiVar;
        this.zzf = zzdhuVar;
        this.zzg = zzdicVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgfVar;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            zzg = this.zze.zzf();
        } else {
            zzg = this.zze.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzds)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdgi zzdgiVar = this.zze;
        if (zzdgiVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdgiVar.zzc() == 2 || zzdgiVar.zzc() == 1) {
                this.zzb.zzI(this.zzc.zzf, String.valueOf(zzdgiVar.zzc()), z);
            } else if (zzdgiVar.zzc() == 6) {
                this.zzb.zzI(this.zzc.zzf, "2", z);
                this.zzb.zzI(this.zzc.zzf, "1", z);
            }
        }
    }

    public final /* synthetic */ void zzb(zzdie zzdieVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbdu zza2;
        Drawable drawable;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdieVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdieVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdgi zzdgiVar = this.zze;
        if (zzdgiVar.zze() != null) {
            view = zzdgiVar.zze();
            zzbdl zzbdlVar = this.zzj;
            if (zzbdlVar != null && viewGroup == null) {
                zzg(layoutParams, zzbdlVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (zzdgiVar.zzl() instanceof zzbdg) {
            zzbdg zzbdgVar = (zzbdg) zzdgiVar.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzbdgVar.zzc());
            }
            View zzbdhVar = new zzbdh(context, zzbdgVar, layoutParams);
            zzbdhVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzdq));
            view = zzbdhVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdieVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdieVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdieVar.zzq(zzdieVar.zzk(), view, true);
        }
        zzfqk zzfqkVar = zzdhe.zza;
        int size = zzfqkVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdieVar.zzg((String) zzfqkVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhf
            @Override // java.lang.Runnable
            public final void run() {
                zzdhi.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzh(viewGroup2, true)) {
            zzdgi zzdgiVar2 = this.zze;
            if (zzdgiVar2.zzr() != null) {
                zzdgiVar2.zzr().zzao(new zzdhh(zzdieVar, viewGroup2));
            }
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziT)).booleanValue() && zzh(viewGroup2, false)) {
            zzdgi zzdgiVar3 = this.zze;
            if (zzdgiVar3.zzp() != null) {
                zzdgiVar3.zzp().zzao(new zzdhh(zzdieVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = zzdieVar.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (zza2 = this.zzk.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzi = zza2.zzi();
                if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzj = zzdieVar != null ? zzdieVar.zzj() : null;
                if (zzj != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfK)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(zza);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                zzbza.zzj("Could not get main image drawable");
            }
        }
    }

    public final void zzc(zzdie zzdieVar) {
        if (zzdieVar == null || this.zzf == null || zzdieVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdieVar.zzh().addView(this.zzf.zza());
        } catch (zzcet e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdie zzdieVar) {
        if (zzdieVar == null) {
            return;
        }
        Context context = zzdieVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzbza.zze("Activity context is needed for policy validator.");
            } else if (this.zzg == null || zzdieVar.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzg.zza(zzdieVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
                } catch (zzcet e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final void zze(final zzdie zzdieVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhg
            @Override // java.lang.Runnable
            public final void run() {
                zzdhi.this.zzb(zzdieVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }
}
