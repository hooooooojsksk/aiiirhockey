package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcw extends TaskApiCall<zzaw, DriveContents> {
    private final /* synthetic */ int zzdv = DriveFile.MODE_WRITE_ONLY;

    public zzcw(zzch zzchVar, int i) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<DriveContents> taskCompletionSource) throws RemoteException {
        ((zzeo) zzawVar.getService()).zza(new zzr(this.zzdv), new zzhi(taskCompletionSource));
    }
}
