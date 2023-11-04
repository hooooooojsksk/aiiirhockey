package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.achievement.Achievements;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzby implements Achievements.UpdateAchievementResult {
    private final Status zza;
    private final String zzb;

    public zzby(int i, String str) {
        this.zza = GamesStatusCodes.zza(i);
        this.zzb = str;
    }

    @Override // com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    public final String getAchievementId() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
