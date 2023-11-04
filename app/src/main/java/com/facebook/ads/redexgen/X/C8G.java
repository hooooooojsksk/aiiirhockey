package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8G */
/* loaded from: assets/audience_network.dex */
public final class C8G {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-60, -58, -55, -12, -52, -56, -12, -55, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0546Jr A00() {
        return new XM();
    }

    public static K7 A01(C0886Xb c0886Xb) {
        return new XL(c0886Xb);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        LF.A01.execute(new XN(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C0886Xb c0886Xb) {
        if (IM.A0P(c0886Xb) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C02537i(Thread.getDefaultUncaughtExceptionHandler(), c0886Xb, new XJ());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e) {
                c0886Xb.A07().A9C(A02(181, 7, 62), C02627s.A1X, new C02637t(e));
            }
        }
    }

    public static void A07(C0886Xb c0886Xb) {
        A0G(c0886Xb, null, null, 3);
    }

    public static void A08(C0886Xb c0886Xb) {
        A0G(c0886Xb, null, null, 3);
    }

    public static void A09(C0886Xb c0886Xb) {
        if (IK.A1j(c0886Xb)) {
            A0E(c0886Xb, 0);
        }
        if (IK.A1q(c0886Xb)) {
            A0B(c0886Xb);
        }
    }

    public static void A0A(C0886Xb c0886Xb) {
        if (IK.A1k(c0886Xb)) {
            A0F(c0886Xb, null, 3);
        }
    }

    public static void A0B(C0886Xb c0886Xb) {
        LQ.A06.execute(new XO(c0886Xb));
    }

    public static void A0C(C0886Xb c0886Xb) {
        C02567m.A0C(c0886Xb, new XI(c0886Xb), new XS(), BuildConfigApi.isDebug());
        c0886Xb.A09();
    }

    public static void A0E(C0886Xb c0886Xb, int i) {
        C7M.A01(c0886Xb);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            JO.A02();
        }
        A06(c0886Xb);
        K4.A00(IK.A0m(c0886Xb), BuildConfigApi.isDebug(), A00(), A01(c0886Xb));
        AnonymousClass67.A03(IK.A03(c0886Xb));
        QY.A09(new XK(c0886Xb));
        if (i == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c0886Xb.A07().A9V(A02(178, 3, 33), C02627s.A0R, new C02637t(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c0886Xb, AudienceNetworkActivity.class);
        LQ.A05(c0886Xb);
        C0516Il.A05(c0886Xb);
        C00950u.A01(c0886Xb);
        if (IK.A0x(c0886Xb)) {
            AnonymousClass54.A00(c0886Xb);
        }
        if (IK.A1Q(c0886Xb)) {
            XA.A02().A7Z(c0886Xb);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C0886Xb c0886Xb, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C7M.A01(c0886Xb);
        boolean z = false;
        synchronized (C8G.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0E(c0886Xb, i);
            LQ.A08.execute(new XP(c0886Xb, initListener));
        } else if (i != 1) {
        } else {
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C8F(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C0886Xb c0886Xb, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        JO.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        QY.A06();
        A0F(c0886Xb, initListener, i);
    }

    public static synchronized boolean A0H() {
        boolean z;
        synchronized (C8G.class) {
            z = A00;
        }
        return z;
    }
}
