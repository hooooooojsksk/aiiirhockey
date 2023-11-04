package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Xe */
/* loaded from: assets/audience_network.dex */
public class C0889Xe implements InterfaceC0704Px {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6H A02;
    public final /* synthetic */ C6I A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{24, 3, 6, 3, 2, 26, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C0889Xe(C6H c6h, C6I c6i, long j, long j2) {
        this.A02 = c6h;
        this.A03 = c6i;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Px
    public final void AAl(boolean z) {
        C7N c7n;
        BlockingQueue blockingQueue;
        C7N c7n2;
        Map map;
        C7N c7n3;
        c7n = this.A02.A01.A04;
        if (C6P.A06(c7n)) {
            C6O c6o = new C6O(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c7n2 = this.A02.A01.A04;
            C6P.A04(c7n2, c6o, z);
            if (!z) {
                c7n3 = this.A02.A01.A04;
                C6P.A05(c7n3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C6M.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c6o.A04, c6o);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Px
    public final void AAx(@Nullable Throwable th) {
        C7N c7n;
        BlockingQueue blockingQueue;
        C7N c7n2;
        c7n = this.A02.A01.A04;
        if (C6P.A06(c7n)) {
            c7n2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String str4 = this.A03.A02;
            String th2 = th != null ? th.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C6P.A05(c7n2, str, str2, str3, A00(7, 5, 22), str4, 2119, th2, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
