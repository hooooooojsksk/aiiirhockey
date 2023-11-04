package com.google.android.gms.internal.ads;

import android.os.Build;
import com.mobirix.airhockey.airhockey;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzfhk {
    protected static final byte[] zza = {61, airhockey.J_PURCHASE, 18, 35, 1, -102, -93, -99, -98, -96, -29, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_EXIT, -73, -64, -119, airhockey.J_GAME_ENEMYEXIT, -5, 79, -74, airhockey.J_WAIT, -12, -34, 95, -25, -62, 63, 50, airhockey.J_GAME_DISCONNECT, -113, -103, airhockey.P_GAME_EXIT};
    protected static final byte[] zzb = {-110, -13, -34, airhockey.P_GAME_BREAKBALLCOUNT, -83, 43, airhockey.J_SDKVER, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, airhockey.J_DISCONNECT, -121, -79, 43, -13, airhockey.J_ACHIEVEMENTCALLBACK, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] zza2 = zzaju.zza(file.getAbsolutePath());
            if (zza2.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(zza2[0][0].getEncoded());
            if (Arrays.equals(this.zzd, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.zzc, digest);
        } catch (zzajr e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
