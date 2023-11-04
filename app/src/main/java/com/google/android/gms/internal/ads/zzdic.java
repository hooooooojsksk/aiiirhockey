package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzdic {
    private final zzdmq zza;
    private final zzdlf zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdic(zzdmq zzdmqVar, zzdlf zzdlfVar) {
        this.zza = zzdmqVar;
        this.zzb = zzdlfVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbyt.zzy(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcet {
        zzcei zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzad("/sendMessageToSdk", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhy
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdic.this.zzb((zzcei) obj, map);
            }
        });
        zza.zzad("/hideValidatorOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdic.this.zzc(windowManager, view, (zzcei) obj, map);
            }
        });
        zza.zzad("/open", new zzbhz(null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdic.this.zze(view, windowManager, (zzcei) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdib
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzbza.zze("Show native ad policy validator overlay.");
                ((zzcei) obj).zzF().setVisibility(0);
            }
        });
        return view2;
    }

    public final /* synthetic */ void zzb(zzcei zzceiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcei zzceiVar, Map map) {
        zzbza.zze("Hide native ad policy validator overlay.");
        zzceiVar.zzF().setVisibility(8);
        if (zzceiVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzceiVar.zzF());
        }
        zzceiVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcei zzceiVar, final Map map) {
        int i;
        zzceiVar.zzN().zzA(new zzcft() { // from class: com.google.android.gms.internal.ads.zzdhw
            @Override // com.google.android.gms.internal.ads.zzcft
            public final void zza(boolean z) {
                zzdic.this.zzd(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhu)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhv)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzceiVar.zzag(zzcfx.zzb(zzf, zzf2));
        try {
            zzceiVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhw)).booleanValue());
            zzceiVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhx)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzceiVar.zzF(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if ("1".equals(str) || "2".equals(str)) {
                i = rect.bottom;
            } else {
                i = rect.top;
            }
            final int i2 = i - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdhx
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcei zzceiVar2 = zzceiVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i3 = i2;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzceiVar2.zzF().getWindowToken() == null) {
                        return;
                    }
                    if ("1".equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i3;
                    } else {
                        layoutParams.y = rect2.top - i3;
                    }
                    windowManager2.updateViewLayout(zzceiVar2.zzF(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzceiVar.loadUrl(str2);
    }
}
