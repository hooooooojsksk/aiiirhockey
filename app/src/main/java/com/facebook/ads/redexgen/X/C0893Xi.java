package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Xi */
/* loaded from: assets/audience_network.dex */
public class C0893Xi extends K1 {
    public static byte[] A02;
    public final /* synthetic */ C0892Xh A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{airhockey.J_ERROR, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, airhockey.J_GAME_ENEMYEXIT, 46, 125, 123, 109, 109, airhockey.J_GAME_ENEMYEXIT, 125, 125, 32};
    }

    public C0893Xi(C0892Xh c0892Xh, AtomicBoolean atomicBoolean) {
        this.A00 = c0892Xh;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C7N c7n;
        long j;
        C7N c7n2;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(EnumC0512Ih.A0H);
                c7n2 = this.A00.A02.A04;
                C6F c6f = this.A00.A01;
                int i = C6P.A00;
                j2 = this.A00.A02.A00;
                C6P.A02(c7n2, c6f, i, A00(11, 14, 17), j2);
                this.A00.A02.A0T();
                this.A00.A00.AAb();
                return;
            }
            this.A00.A02.A0I(EnumC0512Ih.A0G);
            c7n = this.A00.A02.A04;
            C6F c6f2 = this.A00.A01;
            int i2 = C6P.A04;
            j = this.A00.A02.A00;
            C6P.A02(c7n, c6f2, i2, A00(0, 11, 41), j);
            this.A00.A02.A0U();
            this.A00.A00.AAT();
        }
    }
}
