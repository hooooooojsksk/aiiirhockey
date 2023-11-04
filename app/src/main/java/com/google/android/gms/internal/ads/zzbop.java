package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbop extends zzasw implements zzboq {
    public zzbop() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzg(asInterface);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
        } else if (i == 3) {
            zzasx.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            zzbno zzb = zzbnn.zzb(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
