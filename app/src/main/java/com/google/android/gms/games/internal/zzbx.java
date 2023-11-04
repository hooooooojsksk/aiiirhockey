package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbx extends zzao implements Leaderboards.SubmitScoreResult {
    private final ScoreSubmissionData zza;

    public zzbx(DataHolder dataHolder) {
        super(dataHolder);
        try {
            this.zza = new ScoreSubmissionData(dataHolder);
        } finally {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    public final ScoreSubmissionData getScoreData() {
        return this.zza;
    }
}
