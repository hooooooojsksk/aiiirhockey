package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzas;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzg extends RelativeLayout {
    final zzas zza;
    boolean zzb;

    public zzg(Context context, String str, String str2, String str3) {
        super(context);
        zzas zzasVar = new zzas(context, str);
        this.zza = zzasVar;
        zzasVar.zzo(str2);
        zzasVar.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzb) {
            return false;
        }
        this.zza.zzm(motionEvent);
        return false;
    }
}
