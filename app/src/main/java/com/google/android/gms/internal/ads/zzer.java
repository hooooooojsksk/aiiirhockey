package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzer implements zzdu {
    private Message zza;
    private zzes zzb;

    private zzer() {
    }

    public /* synthetic */ zzer(zzeq zzeqVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzes.zzl(this);
    }

    public final zzer zzb(Message message, zzes zzesVar) {
        this.zza = message;
        this.zzb = zzesVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    public final void zza() {
        Message message = this.zza;
        Objects.requireNonNull(message);
        message.sendToTarget();
        zzd();
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
