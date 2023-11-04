package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzgci {
    public static byte[] zza(BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("n must not be negative");
        }
        return bigInteger.toByteArray();
    }
}
