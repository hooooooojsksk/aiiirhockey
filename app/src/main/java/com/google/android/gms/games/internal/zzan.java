package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzan extends zza {
    private final TaskCompletionSource zza;

    public zzan(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzh(DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 0 || statusCode == 3) {
            GameBuffer gameBuffer = new GameBuffer(dataHolder);
            try {
                GameEntity gameEntity = gameBuffer.getCount() > 0 ? new GameEntity(gameBuffer.get(0)) : null;
                gameBuffer.close();
                this.zza.setResult(new AnnotatedData(gameEntity, statusCode == 3));
                return;
            } catch (Throwable th) {
                try {
                    gameBuffer.close();
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
