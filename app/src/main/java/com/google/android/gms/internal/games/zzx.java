package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzx implements Achievements.LoadAchievementsResult {
    final /* synthetic */ Status zza;

    public zzx(zzz zzzVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    public final AchievementBuffer getAchievements() {
        return new AchievementBuffer(DataHolder.empty(14));
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
