package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.67 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass67 {
    @Nullable
    public static AnonymousClass68 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (AnonymousClass67.class) {
            if (A00 == null) {
                return;
            }
            C02637t c02637t = new C02637t(A00.AEK());
            c02637t.A03(1);
            C0886Xb A002 = C7M.A00();
            if (A002 != null) {
                A002.A07().A9C(A00(0, 9, 109), 3401, c02637t);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C0896Xl();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.69
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (C0548Jt.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            AnonymousClass67.A01();
                        } catch (Throwable th) {
                            C0548Jt.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
