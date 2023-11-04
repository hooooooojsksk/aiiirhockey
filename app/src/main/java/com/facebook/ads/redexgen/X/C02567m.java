package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7m */
/* loaded from: assets/audience_network.dex */
public final class C02567m {
    @VisibleForTesting
    public static SparseIntArray A00;
    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C02577n> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<C7k> A0A;
    public static final AtomicReference<InterfaceC02557l> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, airhockey.J_SAVEDGAME_RELOAD, -98, -109, -108, 79, airhockey.J_GAME_DISCONNECT, 79, airhockey.J_DISCONNECT, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, airhockey.J_INVITE, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, airhockey.J_GAME_DISCONNECT, -97, -118, -116, -116, -117, -116, -117, airhockey.P_GAME_MYWIN, -112, -107, 84, -108, -116, -108, -106, -103, -96, airhockey.P_GAME_MYWIN, -109, -106, -114, airhockey.P_GAME_MYWIN, -109, -112, -108, -112, -101, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, airhockey.J_SAVEDGAME_SAVE, -120, -102, -101, airhockey.P_GAME_MYWIN, -116, -99, -116, -107, -101, airhockey.J_SDKVER, airhockey.P_GAME_MYWIN, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, airhockey.J_PURCHASE, -66, -49, -52, -61, -56, -63, airhockey.J_PURCHASE, -58, -55, -63, -63, -61, -56, -63, airhockey.J_PURCHASE, -66, -65, -68, -49, -63, airhockey.J_PURCHASE, -65, -48, -65, -56, -50, -120, -27, 24, 3, 5, 16, 20, 9, 15, 14, -64, 19, 8, 15, 21, 12, 4, -64, 14, 15, 20, -64, 8, 1, 16, 16, 5, 14, -64, 8, 5, 18, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, 15, -69, 18, 4, 15, 3, -69, 14, 16, -3, 15, 20, 11, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, 13, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, -39};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i, C7N c7n) {
        if ((A01(457, 7, 71).equals(str) && C02627s.A1z == i) || A01(HttpStatus.SC_UNPROCESSABLE_ENTITY, 5, 56).equals(str) || A01(437, 6, 113).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return IM.A05(c7n);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C02577n> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() != strArr[0].length()) {
            A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
            return list;
        }
        throw new RuntimeException();
    }

    public static void A05(C7N c7n, int i, int i2) {
        c7n.A07().A9C(A01(427, 10, 60), C02627s.A2W, new C02637t(A01(338, 33, 80) + i, A01(87, 9, 13) + i2));
    }

    @Deprecated
    public static void A06(@Nullable C7N c7n, String str, int i, C02637t c02637t) {
        if (c7n == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C7M.A01(c7n.A01());
        if (A02 && c02637t.A00() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i, c02637t));
        }
        try {
            if (A0I(c7n, str, i, Math.random(), c02637t)) {
                A09(c7n, str, i, c02637t);
            }
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A07(C7N c7n, String str, int i, C02637t c02637t) {
        try {
            c02637t.A03(2);
            c02637t.A08(false);
            c02637t.A04(1);
            if (IM.A0Q(c7n)) {
                c02637t.A06(true);
            } else {
                c02637t.A06(false);
            }
            A06(c7n, str, i, c02637t);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @Deprecated
    public static void A08(C7N c7n, String str, int i, C02637t c02637t) {
        try {
            c02637t.A03(2);
            c02637t.A06(false);
            A06(c7n, str, i, c02637t);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    public static void A09(C7N c7n, String str, int i, C02637t c02637t) {
        synchronized (C02567m.class) {
            if (!A03) {
                int A012 = IM.A01(c7n);
                int threshold = A09.getAndIncrement();
                if (threshold < A012 - 1) {
                    A07.add(new C02577n(str, i, c02637t));
                } else if (A09.get() == A012) {
                    List<C02577n> list = A07;
                    String A013 = A01(427, 10, 60);
                    int i2 = C02627s.A2T;
                    list.add(new C02577n(A013, i2, new C02637t(A01(140, 42, 0) + str + A01(47, 1, 19) + i)));
                }
            } else {
                A0A(c7n, str, i, c02637t, true);
            }
        }
    }

    public static void A0A(C7N c7n, String str, int i, C02637t c02637t, boolean z) {
        InterfaceC02557l interfaceC02557l = A0B.get();
        boolean z2 = interfaceC02557l != null && interfaceC02557l.A8t();
        if (A08.get() || z2) {
            int A002 = c02637t.A00();
            String A012 = A01(289, 17, 46);
            String A013 = A01(31, 16, 8);
            if (A002 == 0) {
                Log.e(A012, A01(182, 37, 40) + str + A013 + i, c02637t);
            } else {
                Log.i(A012, A01(306, 32, 116) + str + A013 + i + A01(19, 12, 63) + c02637t.getMessage() + A01(0, 19, 80) + c02637t.A02());
            }
        }
        XT xt = new XT(c7n, str, i, c02637t, interfaceC02557l);
        if (z) {
            A01.execute(xt);
        } else {
            xt.run();
        }
    }

    public static void A0C(C0886Xb c0886Xb, InterfaceC02557l interfaceC02557l, C7k c7k, boolean z) {
        A0A.set(c7k);
        A0B.set(interfaceC02557l);
        A08.set(z);
        synchronized (C02567m.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new XU(c0886Xb));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.7j
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(C7N c7n) {
        Boolean shouldLogFunnelEvents = A0C.get();
        if (shouldLogFunnelEvents != null) {
            return shouldLogFunnelEvents.booleanValue();
        }
        return IM.A0A(c7n) != 0;
    }

    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static boolean A0I(C7N c7n, String str, int i, double d, C02637t c02637t) {
        double d2;
        int additionalDebugLoggingSamplingPercentage;
        int additionalDebugLoggingSamplingPercentage2;
        try {
            int A042 = IM.A04(c7n);
            if (A042 < 1) {
                return false;
            }
            HashMap<String, Integer> blackListEventsHashMap = IM.A0M(c7n);
            Set<String> additionalDebugLoggingBlackList = blackListEventsHashMap.keySet();
            String str2 = str + A01(47, 1, 19) + i;
            boolean contains = additionalDebugLoggingBlackList.contains(str2);
            if (contains) {
                Integer num = blackListEventsHashMap.get(str2);
                int additionalDebugLoggingSamplingPercentage3 = num != null ? num.intValue() : -1;
                if (additionalDebugLoggingSamplingPercentage3 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage3 > 0) {
                    return d <= 1.0d / ((double) additionalDebugLoggingSamplingPercentage3);
                }
                if (IM.A03(c7n) < 1) {
                    return false;
                }
                d2 = (A042 * additionalDebugLoggingSamplingPercentage2) / 10000.0d;
            } else if (!c02637t.A09()) {
                d2 = 0.0d;
            } else {
                d2 = A042 / 100.0d;
            }
            double A002 = c7n.A08().A00();
            if (A01(HttpStatus.SC_UNPROCESSABLE_ENTITY, 5, 56).equals(str)) {
                if (c7n.A04().A8f()) {
                    return true;
                }
                int additionalDebugLoggingSamplingPercentage4 = IM.A06(c7n);
                if (additionalDebugLoggingSamplingPercentage4 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage4 > 0) {
                    double d3 = 1.0d / additionalDebugLoggingSamplingPercentage4;
                    if (contains) {
                        return A002 <= d3 * d2;
                    }
                    return A002 <= d3;
                }
            }
            if (A01(457, 7, 71).equals(str)) {
                if (C02627s.A1z == i) {
                    if (!A08.get()) {
                        additionalDebugLoggingSamplingPercentage = IM.A0E(c7n);
                    } else {
                        additionalDebugLoggingSamplingPercentage = 1;
                    }
                    if (additionalDebugLoggingSamplingPercentage == 0) {
                        return false;
                    }
                    if (additionalDebugLoggingSamplingPercentage > 0) {
                        double d4 = 1.0d / additionalDebugLoggingSamplingPercentage;
                        if (contains) {
                            return A002 <= d4 * d2;
                        }
                        int i2 = (A002 > d4 ? 1 : (A002 == d4 ? 0 : -1));
                        String[] strArr = A05;
                        if (strArr[4].length() != strArr[0].length()) {
                            String[] strArr2 = A05;
                            strArr2[4] = "UCVKOFALDBGOqUDhQrKLO3Bmgt3EZK";
                            strArr2[0] = "0av5HRm0swjvR429TUKJ";
                            return i2 <= 0;
                        }
                        throw new RuntimeException();
                    }
                }
            }
            if (A01(437, 6, 113).equals(str)) {
                if (IM.A0S(c7n) && c02637t.A0A()) {
                    if (contains) {
                        return d >= 1.0d - d2;
                    }
                    return true;
                }
                Boolean bool = A0C.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int additionalDebugLoggingSamplingPercentage5 = IM.A0A(c7n);
                if (additionalDebugLoggingSamplingPercentage5 == 0) {
                    A0C.set(false);
                    return false;
                } else if (additionalDebugLoggingSamplingPercentage5 > 0) {
                    double d5 = 1.0d / additionalDebugLoggingSamplingPercentage5;
                    if (contains) {
                        return A002 <= d5 * d2;
                    }
                    return A002 <= d5;
                }
            }
            if (A01(443, 14, 63).equals(str)) {
                if (c7n.A04().A8f()) {
                    return true;
                }
                int additionalDebugLoggingSamplingPercentage6 = IM.A0B(c7n);
                if (additionalDebugLoggingSamplingPercentage6 == 0) {
                    return false;
                }
                if (additionalDebugLoggingSamplingPercentage6 > 0) {
                    double d6 = 1.0d / additionalDebugLoggingSamplingPercentage6;
                    if (contains) {
                        return A002 <= d6 * d2;
                    }
                    return A002 <= d6;
                }
            }
            return d >= 1.0d - d2;
        } catch (Throwable t) {
            A0F(t);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0J(C7N c7n, String str, int i, C02637t c02637t) {
        if (IM.A0P(c7n)) {
            int customLimit = A00.get(i);
            int eventsLimit = IM.A00(c7n);
            if (c02637t.A01() != -1) {
                eventsLimit = c02637t.A01();
            } else {
                int currentCounter = A00(str, i, c7n);
                if (eventsLimit < currentCounter) {
                    eventsLimit = currentCounter;
                }
            }
            if (customLimit >= eventsLimit) {
                if (A06.contains(Integer.valueOf(customLimit))) {
                    boolean A0B2 = c02637t.A0B();
                    if (A05[3].charAt(3) != 'Y') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "DtDXz8TrFQQZw1pkgy";
                    strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                    if (A0B2) {
                        A05(c7n, i, customLimit);
                    }
                }
                A00.put(i, customLimit + 1);
                return true;
            }
            A00.put(i, customLimit + 1);
            return false;
        }
        return true;
    }
}
