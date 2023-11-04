package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzvu implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzwc zza;

    public zzvu(zzvv zzvvVar, zzwc zzwcVar) {
        this.zza = zzwcVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzt();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzt();
    }
}
