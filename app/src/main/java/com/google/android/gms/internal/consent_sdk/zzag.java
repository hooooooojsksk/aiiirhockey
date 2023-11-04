package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzag {
    private Application zza;

    private zzag() {
    }

    public /* synthetic */ zzag(zzaf zzafVar) {
    }

    public final zzd zza() {
        zzck.zzb(this.zza, Application.class);
        return new zzaj(this.zza, null);
    }

    public final zzag zzb(Application application) {
        Objects.requireNonNull(application);
        this.zza = application;
        return this;
    }
}
