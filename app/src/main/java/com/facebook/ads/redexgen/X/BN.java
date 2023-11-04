package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class BN extends AbstractC0863We<BK, BJ, FS> implements V6 {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract FR A0b(byte[] bArr, int i, boolean z) throws FS;

    public BN(String str) {
        super(new BK[2], new BJ[2]);
        this.A00 = str;
        A0Y(1024);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0863We
    /* renamed from: A0E */
    public final FS A0W(BK bk, BJ bj, boolean z) {
        try {
            ByteBuffer inputData = bk.A01;
            bj.A09(((C0865Wg) bk).A00, A0b(inputData.array(), inputData.limit(), z), bk.A00);
            bj.A01(Integer.MIN_VALUE);
            return null;
        } catch (FS e) {
            return e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0863We
    /* renamed from: A0F */
    public final FS A0X(Throwable th) {
        return new FS(A0I(0, 23, 36), th);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0863We
    /* renamed from: A0G */
    public final BK A0T() {
        return new BK();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0863We
    /* renamed from: A0H */
    public final BJ A0V() {
        return new BJ(this) { // from class: com.facebook.ads.redexgen.X.3A
            public final BN A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.X.BJ
            public final void A08() {
                this.A00.A0a(this);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0863We
    /* renamed from: A0c */
    public final void A0a(BJ bj) {
        super.A0a(bj);
    }

    @Override // com.facebook.ads.redexgen.X.V6
    public final void AF5(long j) {
    }
}
