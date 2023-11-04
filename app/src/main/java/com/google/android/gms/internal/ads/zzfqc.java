package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes.dex */
final class zzfqc {
    public static int zza(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int zzb(@CheckForNull Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
