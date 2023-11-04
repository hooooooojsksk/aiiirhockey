package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class TT implements L1 {
    public static byte[] A03;
    public static String[] A04 = {"3JpGgMVfhEKs4h1tr8RMzDA7DOHokops", "dXqQ9QAcXKU8whF3kmnzOWjNbVMrrIOv", "otwaAvusvekoag06qMT5pISHPHVrRcMV", "WpvUEDFnYdSXMC7RGaJnlQQN5lPpeUoV", "uIVwlH6eBNHvEYk4kE6nlnhEt8muXj04", "pYVE6LchgLxW1usH7NIdAbU6pOe1Iyyx", "cgHZB3wyyqxQlT2ShG9pTXiCyg", "w9qB75SnMFWvoXL9CpdnGLUKrWLPOybN"};
    public int A00;
    @Nullable
    public String A01;
    public final L1 A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A04;
            if (strArr[5].charAt(25) == strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "Ai5XpAh7M4hRkPfPQf54GYnUnAkHicBv";
            strArr2[3] = "aIcIWiLMc3Hy2WApHOm5eO35KvTaoUWD";
            copyOfRange[i4] = (byte) ((b - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-117, -117, 125, ByteCompanionObject.MIN_VALUE};
    }

    static {
        A02();
    }

    public TT(L1 l1) {
        this.A02 = l1;
    }

    private void A01() {
        if (this.A01 != null) {
            L1 l1 = this.A02;
            l1.ADc(this.A01 + A00(0, 4, 10) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void ADc(String str) {
        boolean A0A;
        String A042;
        A0A = L3.A0A(str);
        if (!A0A) {
            A042 = L3.A04(str);
            String filtered = this.A01;
            if (A042.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A042;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.ADc(str);
    }

    @Override // com.facebook.ads.redexgen.X.L1
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
