package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqi implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzber zza;

    public zzbqi(zzber zzberVar) {
        this.zza = zzberVar;
        try {
            zzberVar.zzm();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            return false;
        }
    }
}
