package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
abstract class zzab extends com.google.android.gms.games.zzj {
    private final String zza;

    public zzab(String str, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzaa(this, status);
    }
}
