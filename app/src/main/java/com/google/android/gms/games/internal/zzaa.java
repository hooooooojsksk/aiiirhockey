package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzaa extends zza {
    private final TaskCompletionSource zza;

    public zzaa(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzb(int i, String str) {
        if (i == 0 || i == 3003) {
            this.zza.setResult(Boolean.valueOf(i == 3003));
        } else {
            GamesStatusUtils.zza(this.zza, i);
        }
    }
}
