package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfkv extends zzfkt {
    private static zzfkv zzc;

    private zzfkv(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfkv zzj(Context context) {
        zzfkv zzfkvVar;
        synchronized (zzfkv.class) {
            if (zzc == null) {
                zzc = new zzfkv(context);
            }
            zzfkvVar = zzc;
        }
        return zzfkvVar;
    }

    public final zzfks zzh(long j, boolean z) throws IOException {
        zzfks zzb;
        synchronized (zzfkv.class) {
            zzb = zzb(null, null, j, z);
        }
        return zzb;
    }

    public final zzfks zzi(String str, String str2, long j, boolean z) throws IOException {
        zzfks zzb;
        synchronized (zzfkv.class) {
            zzb = zzb(str, str2, j, z);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfkv.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfkv.class) {
            zzf(true);
        }
    }
}
