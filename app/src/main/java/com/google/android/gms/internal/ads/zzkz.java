package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzkz {
    private final PowerManager zza;

    public zzkz(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
