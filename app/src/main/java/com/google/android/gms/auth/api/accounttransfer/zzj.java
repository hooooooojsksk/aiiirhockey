package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes.dex */
public class zzj extends zzan {
    final zzl zzb;

    public zzj(zzl zzlVar) {
        this.zzb = zzlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(Status status) {
        TaskCompletionSource taskCompletionSource = this.zzb.zzb;
        int i = AccountTransferClient.zza;
        taskCompletionSource.setException(new AccountTransferException(status));
    }
}
