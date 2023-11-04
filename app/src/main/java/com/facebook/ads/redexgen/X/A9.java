package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class A9 extends AbstractC0623Mt {
    public static byte[] A01;
    public static String[] A02 = {"AyjpfVMH4abbuU", "C4f54F5689i8nguXYuZVyawidNrV99tP", "", "kvcj7JPhLleA0fC5", "qT9ER7mxQyIS", "DVCseFxiIzNfwa", "yADVvB6XdmuuqrvB", "b9AAn0hyeOBCYK5qzyR18"};
    public final /* synthetic */ C0783Sy A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(16) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "MNhPeHQbaIIJpJ20hNozP";
            strArr[2] = "";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{35, 22, 17, 18, 28, -10, 27, 33, 18, 31, 32, 33, 22, 33, 14, 25, -14, 35, 18, 27, 33};
    }

    static {
        A01();
    }

    public A9(C0783Sy c0783Sy) {
        this.A00 = c0783Sy;
    }

    @Override // com.facebook.ads.redexgen.X.C8V
    /* renamed from: A02 */
    public final void A03(NC nc) {
        InterfaceC0587Lj interfaceC0587Lj;
        interfaceC0587Lj = this.A00.A06;
        interfaceC0587Lj.A3u(A00(0, 21, 113), nc);
    }
}
