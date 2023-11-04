package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.aH */
/* loaded from: assets/audience_network.dex */
public class C0977aH extends K1 {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C00950u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C0977aH(C00950u c00950u, String str) {
        this.A00 = c00950u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C7N c7n;
        C7N c7n2;
        CountDownLatch countDownLatch;
        C00940t c00940t;
        C00940t c00940t2;
        C00940t c00940t3;
        boolean A0J;
        C00940t c00940t4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c00940t = this.A00.A02;
            synchronized (c00940t) {
                c00940t2 = this.A00.A02;
                Iterator<String> keys = c00940t2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C00950u c00950u = this.A00;
                        c00940t4 = this.A00.A02;
                        c00950u.A0E((C1P) c00940t4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c00940t3 = this.A00.A02;
                c00940t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c7n2 = this.A00.A03;
            c7n2.A07().A9C(A00(0, 17, 8), C02627s.A1B, new C02637t(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7n = this.A00.A03;
            c7n.A07().A9C(A00(0, 17, 8), C02627s.A1A, new C02637t(e2));
        }
    }
}
