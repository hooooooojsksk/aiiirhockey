package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbpe extends zzasw implements zzbpf {
    public zzbpe() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    protected final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzasx.zzc(parcel);
            zzf(readString2);
        } else if (i != 3) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zzg((com.google.android.gms.ads.internal.client.zze) zzasx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
