package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AchievementsClient;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzn extends zzad implements AchievementsClient {
    public static final /* synthetic */ int zza = 0;

    public zzn(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Intent> getAchievementsIntent() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzk
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    taskCompletionSource.setResult(((com.google.android.gms.games.internal.zzce) ((com.google.android.gms.games.internal.zzbz) obj).getService()).zzg());
                } catch (SecurityException e) {
                    GamesStatusUtils.zzb(taskCompletionSource, e);
                }
            }
        }).setMethodKey(6601).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void increment(final String str, final int i) {
        doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                int i2 = i;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                int i3 = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaa(null, str2, i2);
            }
        }).setMethodKey(6607).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Boolean> incrementImmediate(final String str, final int i) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzi
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                int i2 = i;
                int i3 = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaa((TaskCompletionSource) obj2, str2, i2);
            }
        }).setMethodKey(6608).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<AnnotatedData<AchievementBuffer>> load(final boolean z) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                boolean z2 = z;
                int i = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaf((TaskCompletionSource) obj2, z2);
            }
        }).setMethodKey(6602).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void reveal(final String str) {
        doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zze
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                int i = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaP(null, str2);
            }
        }).setMethodKey(6603).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Void> revealImmediate(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzm
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                int i = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaP((TaskCompletionSource) obj2, str2);
            }
        }).setMethodKey(6604).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void setSteps(final String str, final int i) {
        doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                int i2 = i;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                int i3 = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaR(null, str2, i2);
            }
        }).setMethodKey(6609).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Boolean> setStepsImmediate(final String str, final int i) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                int i2 = i;
                int i3 = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzaR((TaskCompletionSource) obj2, str2, i2);
            }
        }).setMethodKey(6610).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final void unlock(final String str) {
        doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                int i = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzba(null, str2);
            }
        }).setMethodKey(6605).build());
    }

    @Override // com.google.android.gms.games.AchievementsClient
    public final Task<Void> unlockImmediate(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.games.zzh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                String str2 = str;
                int i = zzn.zza;
                ((com.google.android.gms.games.internal.zzbz) obj).zzba((TaskCompletionSource) obj2, str2);
            }
        }).setMethodKey(6606).build());
    }

    public zzn(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }
}
