package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.TransferPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbe extends TaskApiCall<zzaw, Void> {
    private final /* synthetic */ TransferPreferences zzep;

    public zzbe(zzbb zzbbVar, TransferPreferences transferPreferences) {
        this.zzep = transferPreferences;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzgu(new zzei(this.zzep)), new zzhr(taskCompletionSource));
    }
}
