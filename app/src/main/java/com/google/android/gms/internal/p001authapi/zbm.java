package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth@@20.3.0 */
/* renamed from: com.google.android.gms.internal.auth-api.zbm */
/* loaded from: classes2.dex */
public abstract class zbm extends BaseImplementation.ApiMethodImpl {
    public zbm(GoogleApiClient googleApiClient) {
        super(Auth.CREDENTIALS_API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zbo zboVar = (zbo) anyClient;
        zba(zboVar.getContext(), (zbt) zboVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zbm) ((Result) obj));
    }

    protected abstract void zba(Context context, zbt zbtVar) throws DeadObjectException, RemoteException;
}
