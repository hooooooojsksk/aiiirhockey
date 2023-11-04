package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.aG */
/* loaded from: assets/audience_network.dex */
public class C0976aG extends K1 {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C00950u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C0976aG(C00950u c00950u, String str) {
        this.A00 = c00950u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C7N c7n;
        C7N c7n2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C00940t c00940t;
        C00940t c00940t2;
        C00940t c00940t3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c00940t = this.A00.A02;
                ((C1P) c00940t.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c00940t2 = this.A00.A02;
                c00940t2.A07(this.A01);
                c00940t3 = this.A00.A02;
                c00940t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c7n2 = this.A00.A03;
            c7n2.A07().A9C(A00, C02627s.A1B, new C02637t(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7n = this.A00.A03;
            c7n.A07().A9C(A00, C02627s.A1A, new C02637t(e2));
        }
    }
}
