package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.stats.PlayerStatsBuffer;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzbm extends zza {
    private final TaskCompletionSource zza;

    public zzbm(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzl(DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 0 || statusCode == 3) {
            PlayerStatsBuffer playerStatsBuffer = new PlayerStatsBuffer(dataHolder);
            try {
                PlayerStatsEntity playerStatsEntity = playerStatsBuffer.getCount() > 0 ? new PlayerStatsEntity(playerStatsBuffer.get(0)) : null;
                playerStatsBuffer.close();
                this.zza.setResult(new AnnotatedData(playerStatsEntity, statusCode == 3));
                return;
            } catch (Throwable th) {
                try {
                    playerStatsBuffer.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        }
        GamesStatusUtils.zza(this.zza, statusCode);
        dataHolder.close();
    }
}
