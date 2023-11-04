package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.aI */
/* loaded from: assets/audience_network.dex */
public class C0978aI extends K1 {
    public static byte[] A02;
    public final /* synthetic */ C00950u A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C0978aI(C00950u c00950u, JSONObject jSONObject) {
        this.A00 = c00950u;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C7N c7n;
        C7N c7n2;
        CountDownLatch countDownLatch;
        C00940t c00940t;
        C00940t c00940t2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c00940t = this.A00.A02;
            synchronized (c00940t) {
                c00940t2 = this.A00.A02;
                c00940t2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c7n2 = this.A00.A03;
            c7n2.A07().A9C(A00(0, 17, 116), C02627s.A1B, new C02637t(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7n = this.A00.A03;
            c7n.A07().A9C(A00(0, 17, 116), C02627s.A1A, new C02637t(e2));
        }
    }
}
