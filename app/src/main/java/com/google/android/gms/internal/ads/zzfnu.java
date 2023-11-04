package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* loaded from: classes.dex */
public final class zzfnu {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zzb = zzfoj.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                zzb = zzfoj.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
        return i;
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzj(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static Object zzc(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(@CheckForNull Object obj, String str, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfoj.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i, int i2, int i3) {
        String zzj;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzj = zzj(i, i3, "start index");
            } else {
                zzj = (i2 < 0 || i2 > i3) ? zzj(i2, i3, "end index") : zzfoj.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zzj);
        }
    }

    public static void zzh(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i, int i2, String str) {
        if (i < 0) {
            return zzfoj.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfoj.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
