package com.google.android.gms.internal.drive;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.drive.events.OpenFileCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdo implements ListenerHolder.Notifier<OpenFileCallback> {
    private final /* synthetic */ zzdg zzgp;

    public zzdo(zzdk zzdkVar, zzdg zzdgVar) {
        this.zzgp = zzdgVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(OpenFileCallback openFileCallback) {
        this.zzgp.accept(openFileCallback);
    }
}
