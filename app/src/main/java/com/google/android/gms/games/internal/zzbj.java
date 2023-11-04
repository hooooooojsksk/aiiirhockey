package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbj extends zza {
    final TaskCompletionSource zza;

    public zzbj(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzu(int i, boolean z) {
        if (i == 0) {
            this.zza.setResult(Boolean.valueOf(z));
        } else {
            GamesStatusUtils.zza(this.zza, i);
        }
    }
}
