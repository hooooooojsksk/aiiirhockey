package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfkz {
    public static zzfut zza(Task task) {
        final zzfky zzfkyVar = new zzfky(task);
        task.addOnCompleteListener(zzfva.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfkx
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfky zzfkyVar2 = zzfky.this;
                if (task2.isCanceled()) {
                    zzfkyVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfkyVar2.zzd(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzfkyVar2.zze(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfkyVar;
    }
}
