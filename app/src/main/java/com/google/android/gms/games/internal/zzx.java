package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzx implements BaseImplementation.ResultHolder {
    final /* synthetic */ BaseGmsClient.SignOutCallbacks zza;

    public zzx(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        this.zza = signOutCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.zza.onSignOutComplete();
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        Status status = (Status) obj;
        this.zza.onSignOutComplete();
    }
}
