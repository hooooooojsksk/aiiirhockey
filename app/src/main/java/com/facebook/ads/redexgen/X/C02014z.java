package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4z */
/* loaded from: assets/audience_network.dex */
public final class C02014z {
    public static byte[] A02;
    public static String[] A03 = {"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};
    @VisibleForTesting
    public final C0931Yx<AbstractC01934r, C01994x> A00 = new C0931Yx<>();
    @VisibleForTesting
    public final C01302d<AbstractC01934r> A01 = new C01302d<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, airhockey.J_GOO, -64, -62, -65, -58, -71, -76, -75, airhockey.J_GOO, -74, -68, -79, -73, airhockey.J_GOO, -96, -94, -107, airhockey.J_GOO, -65, -62, airhockey.J_GOO, -96, -97, -93, -92};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0041, code lost:
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0043, code lost:
        r0 = r9 ^ (-1);
        r3.A00 &= r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004b, code lost:
        if (r9 != 4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004d, code lost:
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
        if (com.facebook.ads.redexgen.X.C02014z.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
        r2 = com.facebook.ads.redexgen.X.C02014z.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
        r7.A00.A0A(r4);
        com.facebook.ads.redexgen.X.C01994x.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0078, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
        r2 = com.facebook.ads.redexgen.X.C02014z.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
        r0 = r6 & 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0087, code lost:
        if (r0 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008a, code lost:
        r2 = com.facebook.ads.redexgen.X.C02014z.A03;
        r1 = r2[7];
        r2 = r2[2];
        r1 = r1.charAt(19);
        r0 = r2.charAt(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009e, code lost:
        if (r1 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a5, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a6, code lost:
        r2 = com.facebook.ads.redexgen.X.C02014z.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b2, code lost:
        if (r9 != 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b4, code lost:
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c3, code lost:
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d5, code lost:
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.C4U A00(com.facebook.ads.redexgen.X.AbstractC01934r r8, int r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02014z.A00(com.facebook.ads.redexgen.X.4r, int):com.facebook.ads.redexgen.X.4U");
    }

    @Nullable
    public final C4U A03(AbstractC01934r abstractC01934r) {
        return A00(abstractC01934r, 8);
    }

    @Nullable
    public final C4U A04(AbstractC01934r abstractC01934r) {
        return A00(abstractC01934r, 4);
    }

    public final AbstractC01934r A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C01994x.A01();
    }

    public final void A08(long j, AbstractC01934r abstractC01934r) {
        this.A01.A0B(j, abstractC01934r);
    }

    public final void A09(AbstractC01934r abstractC01934r) {
        C01994x c01994x = this.A00.get(abstractC01934r);
        if (c01994x == null) {
            c01994x = C01994x.A00();
            this.A00.put(abstractC01934r, c01994x);
        }
        c01994x.A00 |= 1;
    }

    public final void A0A(AbstractC01934r abstractC01934r) {
        C01994x c01994x = this.A00.get(abstractC01934r);
        if (c01994x == null) {
            return;
        }
        c01994x.A00 &= -2;
    }

    public final void A0B(AbstractC01934r abstractC01934r) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            } else if (abstractC01934r == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            } else {
                A06--;
            }
        }
        C01994x info = this.A00.remove(abstractC01934r);
        if (info != null) {
            C01994x.A02(info);
        }
    }

    public final void A0C(AbstractC01934r abstractC01934r) {
        A0A(abstractC01934r);
    }

    public final void A0D(AbstractC01934r abstractC01934r, C4U c4u) {
        C01994x c01994x = this.A00.get(abstractC01934r);
        if (c01994x == null) {
            c01994x = C01994x.A00();
            this.A00.put(abstractC01934r, c01994x);
        }
        c01994x.A00 |= 2;
        c01994x.A02 = c4u;
    }

    public final void A0E(AbstractC01934r abstractC01934r, C4U c4u) {
        C01994x c01994x = this.A00.get(abstractC01934r);
        if (c01994x == null) {
            c01994x = C01994x.A00();
            this.A00.put(abstractC01934r, c01994x);
        }
        c01994x.A01 = c4u;
        c01994x.A00 |= 8;
    }

    public final void A0F(AbstractC01934r abstractC01934r, C4U c4u) {
        C01994x c01994x = this.A00.get(abstractC01934r);
        if (c01994x == null) {
            c01994x = C01994x.A00();
            this.A00.put(abstractC01934r, c01994x);
        }
        c01994x.A02 = c4u;
        c01994x.A00 |= 4;
    }

    public final void A0G(InterfaceC02004y interfaceC02004y) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC01934r A09 = this.A00.A09(size);
            C01994x record = this.A00.A0A(size);
            if ((record.A00 & 3) == 3) {
                interfaceC02004y.AFi(A09);
            } else {
                int index = record.A00;
                if ((index & 1) != 0) {
                    if (record.A02 == null) {
                        interfaceC02004y.AFi(A09);
                    } else {
                        C4U c4u = record.A02;
                        C4U c4u2 = record.A01;
                        if (A03[5].charAt(20) == 'R') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[1] = "fJVAe19tdP";
                        strArr[3] = "3fJsXDGb";
                        interfaceC02004y.ADf(A09, c4u, c4u2);
                    }
                } else if ((record.A00 & 14) == 14) {
                    interfaceC02004y.ADd(A09, record.A02, record.A01);
                } else if ((record.A00 & 12) == 12) {
                    interfaceC02004y.ADh(A09, record.A02, record.A01);
                } else {
                    int index2 = record.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC02004y.ADf(A09, record.A02, null);
                    } else {
                        int index3 = record.A00;
                        if ((index3 & 8) != 0) {
                            interfaceC02004y.ADd(A09, record.A02, record.A01);
                        }
                    }
                }
            }
            C01994x.A02(record);
        }
    }

    public final boolean A0H(AbstractC01934r abstractC01934r) {
        C01994x record = this.A00.get(abstractC01934r);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC01934r abstractC01934r) {
        C01994x record = this.A00.get(abstractC01934r);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
