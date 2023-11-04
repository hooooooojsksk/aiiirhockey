package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbp extends zza {
    private final TaskCompletionSource zza;

    public zzbp(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzm(DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 0 || statusCode == 3) {
            PlayerBuffer playerBuffer = new PlayerBuffer(dataHolder);
            try {
                this.zza.setResult(new AnnotatedData(playerBuffer.getCount() > 0 ? new PlayerEntity(playerBuffer.get(0)) : null, statusCode == 3));
                return;
            } finally {
                playerBuffer.release();
            }
        }
        GamesStatusUtils.zza(this.zza, statusCode);
        dataHolder.close();
    }
}
