package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.core.os.EnvironmentCompat;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzbx {
    private static String zza;

    public static synchronized String zza(Context context) {
        String str;
        synchronized (zzbx.class) {
            if (zza == null) {
                ContentResolver contentResolver = context.getContentResolver();
                zza = zzc(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzb()) ? "emulator" : "emulator");
            }
            str = zza;
        }
        return str;
    }

    public static boolean zzb() {
        if (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    private static String zzc(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
