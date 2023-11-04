package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.games.zzfq;
import com.google.android.gms.internal.games.zzft;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzcf implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final zzbz zza;
    private final zzfq zzb;
    private WeakReference zzc;
    private boolean zzd = false;

    private zzcf(zzbz zzbzVar, int i) {
        this.zza = zzbzVar;
        this.zzb = new zzfq(i, null);
    }

    public static zzcf zzc(zzbz zzbzVar, int i) {
        return new zzcf(zzbzVar, i);
    }

    private final void zzh(View view) {
        Display display;
        int i = -1;
        if (PlatformVersion.isAtLeastJellyBeanMR1() && (display = view.getDisplay()) != null) {
            i = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        zzfq zzfqVar = this.zzb;
        zzfqVar.zzc = i;
        zzfqVar.zza = windowToken;
        int i2 = iArr[0];
        zzfqVar.zzd = i2;
        int i3 = iArr[1];
        zzfqVar.zze = i3;
        zzfqVar.zzf = i2 + width;
        zzfqVar.zzg = i3 + height;
        if (this.zzd) {
            zzg();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        zzh(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        zzh(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zza.zzN();
        view.removeOnAttachStateChangeListener(this);
    }

    public final Bundle zza() {
        return this.zzb.zza();
    }

    public final IBinder zzb() {
        return this.zzb.zza;
    }

    public final zzfq zzd() {
        return this.zzb;
    }

    public final void zze(View view) {
        this.zza.zzN();
        WeakReference weakReference = this.zzc;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            Context context = this.zza.getContext();
            if (view2 == null && (context instanceof Activity)) {
                view2 = ((Activity) context).getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (PlatformVersion.isAtLeastJellyBean()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.zzc = null;
        Context context2 = this.zza.getContext();
        if (view == null && (context2 instanceof Activity)) {
            Activity activity = (Activity) context2;
            try {
                view = activity.findViewById(16908290);
            } catch (IllegalStateException unused) {
            }
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            zzft.zzd("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view != null) {
            zzh(view);
            this.zzc = new WeakReference(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        zzft.zza("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
    }

    public final void zzf(int i) {
        this.zzb.zzb = i;
    }

    public final void zzg() {
        boolean z;
        zzfq zzfqVar = this.zzb;
        IBinder iBinder = zzfqVar.zza;
        if (iBinder != null) {
            this.zza.zzaU(iBinder, zzfqVar.zza());
            z = false;
        } else {
            z = true;
        }
        this.zzd = z;
    }
}
