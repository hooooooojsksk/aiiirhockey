package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.games.zzfr;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzcc extends com.google.android.gms.internal.games.zzb implements zzcd {
    public zzcc() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1001) {
            zzfr zzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.games.zzc.zze(parcel2, zzb);
            return true;
        }
        return false;
    }
}
