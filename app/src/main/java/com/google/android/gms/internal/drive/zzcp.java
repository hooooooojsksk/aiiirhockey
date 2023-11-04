package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcp extends RegisterListenerMethod<zzaw, zzdi> {
    private final /* synthetic */ DriveResource zzfq;
    private final /* synthetic */ zzdi zzfr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzch zzchVar, ListenerHolder listenerHolder, DriveResource driveResource, zzdi zzdiVar) {
        super(listenerHolder);
        this.zzfq = driveResource;
        this.zzfr = zzdiVar;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final /* synthetic */ void registerListener(zzaw zzawVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzee zzeeVar;
        zzj zzjVar = new zzj(1, this.zzfq.getDriveId());
        zzeeVar = this.zzfr.zzgh;
        ((zzeo) zzawVar.getService()).zza(zzjVar, zzeeVar, (String) null, new zzhr(taskCompletionSource));
    }
}
