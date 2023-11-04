package com.google.android.gms.internal.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.OpenFileActivityOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbf extends TaskApiCall<zzaw, IntentSender> {
    private final /* synthetic */ OpenFileActivityOptions zzeq;

    public zzbf(zzbb zzbbVar, OpenFileActivityOptions openFileActivityOptions) {
        this.zzeq = openFileActivityOptions;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<IntentSender> taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzeo) zzawVar.getService()).zza(new zzgm(this.zzeq.zzba, this.zzeq.zzbb, this.zzeq.zzbd, this.zzeq.zzbe)));
    }
}
