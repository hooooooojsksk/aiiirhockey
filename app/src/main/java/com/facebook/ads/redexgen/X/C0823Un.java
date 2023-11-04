package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Un */
/* loaded from: assets/audience_network.dex */
public final class C0823Un implements GP {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public GO[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final GO[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, 40, 19, 24, 5, 13, 24, 30, 9, 24, 25, 93, 28, 17, 17, 18, 30, 28, 9, 20, 18, 19, airhockey.P_GAME_MYWIN, 93};
    }

    public C0823Un(boolean z, int i) {
        this(z, i, 0);
    }

    public C0823Un(boolean z, int i, int i2) {
        HD.A03(i > 0);
        HD.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new GO[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new GO(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new GO[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AFd();
        }
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final synchronized GO A3M() {
        GO go;
        this.A00++;
        if (this.A01 > 0) {
            GO[] goArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            go = goArr[i];
            this.A03[this.A01] = null;
        } else {
            go = new GO(new byte[this.A04], 0);
        }
        return go;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final int A6v() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final synchronized void AE5(GO go) {
        this.A07[0] = go;
        AE6(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final synchronized void AE6(GO[] goArr) {
        if (this.A01 + goArr.length >= this.A03.length) {
            this.A03 = (GO[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + goArr.length));
        }
        for (GO go : goArr) {
            if (go.A01 != this.A06 && go.A01.length != this.A04) {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(go.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + go.A01.length + A00(0, 2, 91) + this.A04);
            }
            GO[] goArr2 = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            goArr2[i] = go;
        }
        this.A00 -= goArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.GP
    public final synchronized void AFd() {
        int A04 = C0499Hs.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A04 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                GO highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    GO lowAllocation = this.A03[highIndex];
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        GO[] goArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(goArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
