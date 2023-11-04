package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzar extends zza {
    final /* synthetic */ zzbz zza;
    private final TaskCompletionSource zzb;

    public zzar(zzbz zzbzVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzbzVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzk(DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        boolean z = statusCode == 3;
        if (statusCode == 10003) {
            zzbz.zzL(this.zza, this.zzb);
            dataHolder.close();
        } else if (statusCode == 0 || z) {
            LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
            try {
                LeaderboardScoreEntity leaderboardScoreEntity = leaderboardScoreBuffer.getCount() > 0 ? new LeaderboardScoreEntity(leaderboardScoreBuffer.get(0)) : null;
                leaderboardScoreBuffer.close();
                this.zzb.setResult(new AnnotatedData(leaderboardScoreEntity, z));
            } catch (Throwable th) {
                try {
                    leaderboardScoreBuffer.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } else {
            GamesStatusUtils.zza(this.zzb, statusCode);
            dataHolder.close();
        }
    }
}
