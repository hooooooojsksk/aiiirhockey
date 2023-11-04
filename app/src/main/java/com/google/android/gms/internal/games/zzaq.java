package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
abstract class zzaq extends com.google.android.gms.games.zzj {
    public /* synthetic */ zzaq(GoogleApiClient googleApiClient, zzap zzapVar) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        return new zzao(this, status);
    }
}
