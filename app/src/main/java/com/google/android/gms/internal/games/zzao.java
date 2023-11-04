package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzao implements Result {
    final /* synthetic */ Status zza;

    public zzao(zzaq zzaqVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
