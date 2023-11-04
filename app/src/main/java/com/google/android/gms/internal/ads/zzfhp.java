package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfhp {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    zzfhp(Context context, Executor executor, Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfhp zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhl
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfjr.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhm
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzfjr.zzc());
                }
            });
        }
        return new zzfhp(context, executor, taskCompletionSource.getTask(), z);
    }

    public static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (this.zze) {
            final zzamh zza2 = zzaml.zza();
            zza2.zza(this.zzb.getPackageName());
            zza2.zze(j);
            zza2.zzg(zzf);
            if (exc != null) {
                zza2.zzf(zzfol.zza(exc));
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zzb(str2);
            }
            if (str != null) {
                zza2.zzc(str);
            }
            return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfho
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    zzamh zzamhVar = zzamh.this;
                    int i2 = i;
                    int i3 = zzfhp.zza;
                    if (task.isSuccessful()) {
                        zzfjq zza3 = ((zzfjr) task.getResult()).zza(((zzaml) zzamhVar.zzal()).zzax());
                        zza3.zza(i2);
                        zza3.zzc();
                        return true;
                    }
                    return false;
                }
            });
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfhn
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Boolean.valueOf(task.isSuccessful());
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task zze(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }
}
