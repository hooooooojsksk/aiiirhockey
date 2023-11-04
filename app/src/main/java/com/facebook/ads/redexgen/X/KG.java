package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.android.gms.drive.DriveFile;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class KG {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C0887Xc> A06;
    public static final AtomicReference<KP> A07;
    public static final AtomicReference<KR> A08;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-68, -49, -46, -36, -27, -19, -49, -46, -19, -35, -48, -40, -19, -41, -46, -19, -39, -45, -25, 102, airhockey.J_WAIT, 124, -122, -113, -105, -121, -118, -127, ByteCompanionObject.MAX_VALUE, -127, -122, airhockey.J_WAIT, -124, -105, 125, -112, -116, -118, airhockey.J_WAIT, -117, -94, -75, -72, -62, -53, -45, -57, -75, -54, -71, -72, -45, -57, -56, -75, -56, -71, -45, -72, -75, -56, -75, -33, -19, 2, -15, -16, -84, -1, 0, -19, 0, -15, -84, -18, 1, -6, -16, -8, -15, -84, -11, -1, -84, -15, -7, -4, 0, 5, -83, -77, -75, -58, -79, -57, -58, -69, -66, -82, -69, -84, -80, -71, -74, -78, -69, -63, -84, -63, -68, -72, -78, -69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String uri = data.toString();
        for (String str : set) {
            if (uri.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    static {
        A07();
        A02 = KG.class.getPackage();
        A04 = A02 + A06(40, 22, 98);
        A03 = A02 + A06(0, 19, 124);
        A05 = A02 + A06(19, 21, 38);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent intent) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(intent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent intent, ClassLoader classLoader) {
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            audienceNetworkActivityBundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(audienceNetworkActivityBundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            obtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 122));
    }

    @Nullable
    public static C0887Xc A03(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C0887Xc c0887Xc : A06) {
                String adId = c0887Xc.A0E().getId();
                if (stringExtra.equals(adId)) {
                    return c0887Xc;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C0887Xc c0887Xc) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c0887Xc.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c0887Xc.A0E().getId());
        A06.add(c0887Xc);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A09(C0887Xc c0887Xc, AdActivityIntent adActivityIntent) throws KE {
        Context launchContext;
        Context applicationContext = c0887Xc.getApplicationContext();
        if (IK.A1u(c0887Xc) && (launchContext = c0887Xc.A0D()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & DriveFile.MODE_READ_ONLY) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ DriveFile.MODE_READ_ONLY);
            }
        }
        try {
            applicationContext.startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e) {
            throw new KE(e);
        }
    }

    public static boolean A0B(C0887Xc c0887Xc, Intent intent) throws KE {
        KP externalActivityLauncher = A07.get();
        return A0D(c0887Xc, intent, externalActivityLauncher);
    }

    public static boolean A0C(C0887Xc c0887Xc, Intent intent) throws KE {
        KP kp = A07.get();
        if (kp == null || c0887Xc.A0D() == null) {
            return false;
        }
        String A0B = c0887Xc.A0B();
        try {
            Activity A0D = c0887Xc.A0D();
            if (A0B == null) {
                A0B = A06(0, 0, 81);
            }
            return kp.startActivityForResult(intent, 0, A0D, A0B);
        } catch (ActivityNotFoundException e) {
            throw new KE(e);
        } catch (Exception e2) {
            c0887Xc.A07().A9C(A06(90, 8, 64), C02627s.A07, new C02637t(e2));
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0D(C0887Xc c0887Xc, Intent intent, @Nullable KP kp) throws KE {
        if (A0A(intent, IK.A0X(c0887Xc))) {
            return false;
        }
        Context context = c0887Xc;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Context startContext = c0887Xc.A0D();
        if (startContext != null) {
            context = startContext;
        } else {
            intent.addFlags(DriveFile.MODE_READ_ONLY);
        }
        if (kp != null && !A0A(intent, IK.A0Z(c0887Xc))) {
            String A0B = c0887Xc.A0B();
            if (A0B == null) {
                try {
                    A0B = A06(0, 0, 81);
                } catch (ActivityNotFoundException e) {
                    throw new KE(e);
                } catch (Exception e2) {
                    c0887Xc.A07().A9C(A06(90, 8, 64), C02627s.A08, new C02637t(e2));
                    return false;
                }
            }
            return kp.startActivity(context, intent, A0B);
        }
        try {
            context.startActivity(intent);
            String[] strArr2 = A01;
            if (strArr2[6].length() != strArr2[7].length()) {
                return true;
            }
            String[] strArr3 = A01;
            strArr3[2] = "WDCv4eIjUMWn9vBjM5X6LVautGW56wKG";
            strArr3[0] = "ucZAZ4xNymzGZ0fLzzKXI63vhQI9uDah";
            return true;
        } catch (ActivityNotFoundException e3) {
            throw new KE(e3);
        }
    }

    public static boolean A0E(C0887Xc c0887Xc, Uri uri, String str) throws ActivityNotFoundException {
        KR onsiteUriHandler = A08.get();
        return A0F(c0887Xc, uri, str, onsiteUriHandler);
    }

    @VisibleForTesting
    public static boolean A0F(C0887Xc c0887Xc, Uri uri, String str, @Nullable KR kr) throws ActivityNotFoundException {
        if (kr == null || c0887Xc.A0D() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(98, 15, 59), str);
        return kr.handleUriForResult(c0887Xc, uri.toString(), bundle, null, 0, c0887Xc.A0D());
    }
}
