package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzfl {
    public static String zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "ALL_TIME";
                }
                throw new IllegalArgumentException("Unknown time span " + i);
            }
            return "WEEKLY";
        }
        return "DAILY";
    }
}
