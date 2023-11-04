package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.achievement.Achievements;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
final class zzaa implements Achievements.UpdateAchievementResult {
    final /* synthetic */ Status zza;
    final /* synthetic */ zzab zzb;

    public zzaa(zzab zzabVar, Status status) {
        this.zzb = zzabVar;
        this.zza = status;
    }

    @Override // com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    public final String getAchievementId() {
        String str;
        str = this.zzb.zza;
        return str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
