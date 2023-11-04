package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzbqh extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbqh(zzbdp zzbdpVar) {
        try {
            this.zzb = zzbdpVar.zzg();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbdpVar.zzh()) {
                zzbdx zzg = obj instanceof IBinder ? zzbdw.zzg((IBinder) obj) : null;
                if (zzg != null) {
                    this.zza.add(new zzbqj(zzg));
                }
            }
        } catch (RemoteException e2) {
            zzbza.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
