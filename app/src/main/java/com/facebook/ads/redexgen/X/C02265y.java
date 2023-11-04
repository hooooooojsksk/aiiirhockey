package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.5y */
/* loaded from: assets/audience_network.dex */
public final class C02265y {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C02245w> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C02245w A00() {
        C02245w c02245w = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C02245w c02245w2 = c02245w;
            if (c02245w2 == null) {
                C02245w A002 = C02245w.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c02245w2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C02245w A01(com.facebook.ads.redexgen.X.C7N r5, com.facebook.ads.redexgen.X.C02245w r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5w r0 = com.facebook.ads.redexgen.X.AnonymousClass64.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.7r r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.X.C02627s.A1Q
            com.facebook.ads.redexgen.X.7t r3 = new com.facebook.ads.redexgen.X.7t
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A9C(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02265y.A01(com.facebook.ads.redexgen.X.7N, com.facebook.ads.redexgen.X.5w):com.facebook.ads.redexgen.X.5w");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C02245w A02(C7N c7n, C02245w c02245w, C02255x c02255x) {
        C02275z c02275z = null;
        try {
            if (IJ.A06(c7n) && (c02245w == null || TextUtils.isEmpty(c02245w.A03()))) {
                c02275z = AnonymousClass60.A00(c7n.getContentResolver());
            }
        } catch (Throwable th) {
            c7n.A07().A9C(A04(12, 7, 6), C02627s.A1S, new C02637t(th));
        }
        if (c02275z != null && c02275z.A01 != null) {
            A03.set(c02275z.A01);
            c02255x.A05(c02275z.A01);
        }
        if (c02245w == null && c02275z != null && !TextUtils.isEmpty(c02275z.A00)) {
            return new C02245w(c02275z.A00, c02275z.A02, EnumC02235v.A05);
        }
        return c02245w;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C02255x c02255x) {
        A02.set(c02255x.A02());
        A03.set(c02255x.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C7N c7n) {
        long j;
        C02245w advertisingIdInfo;
        try {
            C02255x c02255x = new C02255x(c7n);
            A06(c02255x);
            if (A08()) {
                return;
            }
            C02245w advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j = advertisingIdInfo2.A01();
            } else {
                j = -1;
            }
            if (j > 0 && System.currentTimeMillis() - j < IJ.A00(c7n)) {
                return;
            }
            if (IJ.A07(c7n)) {
                advertisingIdInfo = A01(c7n, A02(c7n, null, c02255x));
            } else {
                advertisingIdInfo = A02(c7n, A01(c7n, null), c02255x);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c02255x.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            c7n.A07().A9C(A04(12, 7, 6), C02627s.A1R, new C02637t(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = KV.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            boolean updated2 = KV.A05(A04);
            if (updated2) {
                A03.set(KV.A01(A04));
                z = true;
            }
        }
        boolean A042 = KV.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return z;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return z;
            }
        }
        String A043 = A04(19, 13, 79);
        boolean updated3 = KV.A05(A043);
        if (updated3) {
            String A012 = KV.A01(A043);
            AtomicReference<C02245w> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C02245w(A012, false, EnumC02235v.A04));
            return true;
        }
        return z;
    }
}
