package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Kg */
/* loaded from: assets/audience_network.dex */
public final class C0560Kg {
    public static byte[] A00;
    public static final String A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{airhockey.J_SAVEDGAME_SAVE, -73, -67, -73, -72, -87, -79, airhockey.J_SAVEDGAME_SAVE, -91, -76, -76, airhockey.J_SAVEDGAME_SAVE, -105, -71, -76, -87, -74, -71, -73, -87, -74, airhockey.J_SAVEDGAME_RELOAD, -91, -76, -81, -65, -108, -75, -90, -71, -83, 0, 29, 29, 34, 19, 18, -50, 17, 22, 19, 17, 25, -50, 20, 15, 23, 26, 19, 18, -52, -63, -70, -86, -89, 125, -124, ByteCompanionObject.MAX_VALUE, -120, -93, -91, 6, -9, 5, 6, -65, -3, -9, 11, 5};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A08(String str) {
        File[] listFiles;
        for (String str2 : System.getenv(A01(27, 4, 54)).split(A01(25, 1, 86))) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    static {
        A05();
        A01 = C0560Kg.class.getSimpleName();
    }

    public static EnumC0559Kf A00(boolean z) {
        try {
            boolean isRooted = A07() || A06() || A08(A01(59, 2, 1));
            return isRooted ? EnumC0559Kf.A04 : EnumC0559Kf.A06;
        } catch (Throwable th) {
            if (z) {
                Log.e(A01, A01(31, 19, 127), th);
            }
            return EnumC0559Kf.A05;
        }
    }

    @Nullable
    public static String A02(Context context) {
        try {
            return A03(context);
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String A03(Context context) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        StringBuilder sb = new StringBuilder();
        for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
            sb.append(C0565Kn.A04(MessageDigest.getInstance(A01(50, 4, 74)).digest(A04(signature).getEncoded())));
            sb.append(A01(26, 1, 42));
        }
        return sb.toString();
    }

    public static PublicKey A04(Signature signature) throws CertificateException {
        return CertificateFactory.getInstance(A01(54, 5, 32)).generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        String str = Build.TAGS;
        if (str != null) {
            String buildTags = A01(61, 9, 99);
            if (str.contains(buildTags)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07() {
        File superUserApk = new File(A01(0, 25, 21));
        return superUserApk.exists();
    }
}
