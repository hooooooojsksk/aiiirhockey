package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.drive.events.OpenFileCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcv extends UnregisterListenerMethod<zzaw, OpenFileCallback> {
    private final /* synthetic */ zzg zzfu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzch zzchVar, ListenerHolder.ListenerKey listenerKey, zzg zzgVar) {
        super(listenerKey);
        this.zzfu = zzgVar;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final /* synthetic */ void unregisterListener(zzaw zzawVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(Boolean.valueOf(this.zzfu.cancel()));
    }
}
