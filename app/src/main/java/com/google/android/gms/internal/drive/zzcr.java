package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcr extends TaskApiCall<zzaw, Void> {
    private final /* synthetic */ DriveResource zzfq;

    public zzcr(zzch zzchVar, DriveResource driveResource) {
        this.zzfq = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        if (!zzawVar2.zzec) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        }
        ((zzeo) zzawVar2.getService()).zza(new zzj(1, this.zzfq.getDriveId()), (zzes) null, (String) null, new zzhr(taskCompletionSource));
    }
}
