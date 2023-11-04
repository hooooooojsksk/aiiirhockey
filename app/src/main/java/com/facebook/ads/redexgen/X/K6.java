package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class K6 {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<K6> A02 = new ThreadLocal<>();
    public final C0544Jp A00 = new C0544Jp();

    public static C0544Jp A00() {
        return A02().A00;
    }

    public static C0544Jp A01(K5 k5) {
        C0544Jp currentStackTraces = new C0544Jp(A00());
        currentStackTraces.add(k5);
        return currentStackTraces;
    }

    public static K6 A02() {
        K6 k6 = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) != strArr[2].charAt(1)) {
            String[] strArr2 = A01;
            strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
            strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
            if (k6 == null) {
                K6 k62 = new K6();
                A02.set(k62);
                return k62;
            }
            return k6;
        }
        throw new RuntimeException();
    }

    public static void A03(K1 k1) {
        C0544Jp A05 = k1.A05();
        if (A05 != null) {
            C0544Jp createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A05);
        }
    }

    public static void A04(K1 k1) {
        C0544Jp A05 = k1.A05();
        if (A05 != null) {
            C0544Jp createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.removeAll(A05);
        }
    }
}
