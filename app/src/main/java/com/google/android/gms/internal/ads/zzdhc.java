package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzdhc extends zzbeg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdie {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdgd zze;
    private zzatg zzf;

    public zzdhc(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcaa.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzatg(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            zzdgdVar.zzC(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            zzdgdVar.zzA(zzf(), zzl(), zzm(), zzdgd.zzW(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            zzdgdVar.zzA(zzf(), zzl(), zzm(), zzdgd.zzW(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            zzdgdVar.zzJ(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbeh
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzbza.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzL((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeh
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdgd)) {
            zzbza.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            zzdgdVar.zzR(this);
        }
        zzdgd zzdgdVar2 = (zzdgd) unwrap;
        if (zzdgdVar2.zzS()) {
            this.zze = zzdgdVar2;
            zzdgdVar2.zzQ(this);
            this.zze.zzI(zzf());
            return;
        }
        zzbza.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzbeh
    public final synchronized void zzd() {
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            zzdgdVar.zzR(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final zzatg zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized IObjectWrapper zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized JSONObject zzp() {
        zzdgd zzdgdVar = this.zze;
        if (zzdgdVar != null) {
            return zzdgdVar.zzk(zzf(), zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final synchronized void zzq(String str, View view, boolean z) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
