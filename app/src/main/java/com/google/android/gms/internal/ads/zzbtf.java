package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbtf extends zzasw implements zzbtg {
    public zzbtf() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzasx.zzc(parcel);
            zzf((ParcelFileDescriptor) zzasx.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzaz) zzasx.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
