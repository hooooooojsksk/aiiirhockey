package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.Wx */
/* loaded from: assets/audience_network.dex */
public final class C0882Wx implements HT {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    @Nullable
    public InterfaceC0879Wu A00;
    @Nullable
    public HT A01;
    public final C9C A02;
    public final UO A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, ByteCompanionObject.MAX_VALUE, -47, -60, -51, -61, -60, -47, -60, -47, ByteCompanionObject.MAX_VALUE, -52, -60, -61, -56, -64, ByteCompanionObject.MAX_VALUE, -62, -53, -50, -62, -54, -46, ByteCompanionObject.MAX_VALUE, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public C0882Wx(C9C c9c, HG hg) {
        this.A02 = c9c;
        this.A03 = new UO(hg);
    }

    private void A01() {
        this.A03.A02(this.A01.A7R());
        C02959a A7O = this.A01.A7O();
        if (!A7O.equals(this.A03.A7O())) {
            this.A03.AF4(A7O);
            this.A02.AC1(A7O);
        }
    }

    private boolean A03() {
        InterfaceC0879Wu interfaceC0879Wu = this.A00;
        if (interfaceC0879Wu != null && !interfaceC0879Wu.A8h()) {
            boolean A8r = this.A00.A8r();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (A8r || !this.A00.A8H()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long A7R = this.A01.A7R();
            if (A05[7].length() != 18) {
                A05[7] = "L098bBK7xK";
                return A7R;
            }
            throw new RuntimeException();
        }
        return this.A03.A7R();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(InterfaceC0879Wu interfaceC0879Wu) {
        if (interfaceC0879Wu == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(InterfaceC0879Wu interfaceC0879Wu) throws C9F {
        HT A74 = interfaceC0879Wu.A74();
        if (A74 != null) {
            HT ht = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (A74 != ht) {
                if (ht == null) {
                    this.A01 = A74;
                    this.A00 = interfaceC0879Wu;
                    HT ht2 = this.A01;
                    HT rendererMediaClock = this.A03;
                    ht2.AF4(rendererMediaClock.A7O());
                    A01();
                    return;
                }
                throw C9F.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final C02959a A7O() {
        HT ht = this.A01;
        if (ht != null) {
            return ht.A7O();
        }
        return this.A03.A7O();
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final long A7R() {
        if (A03()) {
            return this.A01.A7R();
        }
        return this.A03.A7R();
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final C02959a AF4(C02959a c02959a) {
        HT ht = this.A01;
        if (ht != null) {
            c02959a = ht.AF4(c02959a);
        }
        this.A03.AF4(c02959a);
        this.A02.AC1(c02959a);
        return c02959a;
    }
}
