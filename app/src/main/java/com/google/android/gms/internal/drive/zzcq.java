package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcq extends UnregisterListenerMethod<zzaw, zzdi> {
    private final /* synthetic */ DriveResource zzfq;
    private final /* synthetic */ zzdi zzfr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzch zzchVar, ListenerHolder.ListenerKey listenerKey, DriveResource driveResource, zzdi zzdiVar) {
        super(listenerKey);
        this.zzfq = driveResource;
        this.zzfr = zzdiVar;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final /* synthetic */ void unregisterListener(zzaw zzawVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzee zzeeVar;
        zzgs zzgsVar = new zzgs(this.zzfq.getDriveId(), 1);
        zzeeVar = this.zzfr.zzgh;
        ((zzeo) zzawVar.getService()).zza(zzgsVar, zzeeVar, (String) null, new zzhq(taskCompletionSource));
    }
}
