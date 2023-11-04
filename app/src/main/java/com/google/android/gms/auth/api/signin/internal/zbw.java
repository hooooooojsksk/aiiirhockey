package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth@@20.3.0 */
/* loaded from: classes.dex */
public final class zbw implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        Intent intent;
        Void r3 = (Void) obj;
        SignInHubActivity signInHubActivity = this.zba;
        i = signInHubActivity.zbe;
        intent = signInHubActivity.zbf;
        signInHubActivity.setResult(i, intent);
        this.zba.finish();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
    }
}
