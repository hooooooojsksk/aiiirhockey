package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzeja implements zzepm {
    private final boolean zza;

    public zzeja(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? "0" : "1");
    }
}
