package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzapw;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    public zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzapw zzapwVar;
        zzapw zzapwVar2;
        zzs zzsVar = this.zza;
        zzapwVar = zzsVar.zzh;
        if (zzapwVar != null) {
            zzapwVar2 = zzsVar.zzh;
            zzapwVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
