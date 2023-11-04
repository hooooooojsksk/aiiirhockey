package com.fyber.inneractive.sdk.ignite;

import android.os.RemoteException;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.ignite.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.t;

/* loaded from: classes.dex */
public class b extends IIgniteServiceCallback.Stub {
    public final g.b a;

    public b(g.b bVar) {
        this.a = bVar;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onError(String str) throws RemoteException {
        IAlog.a("CancelTaskCallback onError %s", str);
        ((t.e) this.a).a(false);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onProgress(String str) throws RemoteException {
        IAlog.a("CancelTaskCallback onProgress %s", str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onScheduled(String str) throws RemoteException {
        IAlog.a("CancelTaskCallback onScheduled %s", str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onStart(String str) throws RemoteException {
        IAlog.a("CancelTaskCallback onStart %s", str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public void onSuccess(String str) throws RemoteException {
        IAlog.a("CancelTaskCallback onSuccess %s", str);
        ((t.e) this.a).a(true);
    }
}
