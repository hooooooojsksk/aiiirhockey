package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class zzdv extends zzav {
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzdp zzdpVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzgq = zzdpVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(zzaw zzawVar) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzhb(this.zzgq.zzk), new zzgy(this));
    }
}
