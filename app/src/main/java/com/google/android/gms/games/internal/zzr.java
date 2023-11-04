package com.google.android.gms.games.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzr extends zzay {
    final /* synthetic */ zzbq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzbq zzbqVar) {
        super(null);
        this.zza = zzbqVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(Object obj) {
        this.zza.zza(obj);
    }
}
