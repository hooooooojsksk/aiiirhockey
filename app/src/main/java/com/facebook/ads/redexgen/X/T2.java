package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T2 implements InterfaceC0557Kd {
    public static byte[] A01;
    public static String[] A02 = {"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    public final /* synthetic */ T0 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-32, -8, -22, -24, -8, -30};
    }

    static {
        A01();
    }

    public T2(T0 t0) {
        this.A00 = t0;
    }

    public /* synthetic */ T2(T0 t0, T8 t8) {
        this(t0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AAa() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            com.facebook.ads.redexgen.X.Li r3 = r0.A0Y
            r2 = 0
            r1 = 0
            r0 = 7
            java.lang.String r0 = A00(r2, r1, r0)
            r3.setToolbarActionMessage(r0)
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            com.facebook.ads.redexgen.X.T0.A0S(r0)
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.X.T0.A0d(r0)
            r3 = 0
            if (r0 == 0) goto L44
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.X.T0.A0i(r0)
            if (r0 == 0) goto L44
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            com.facebook.ads.redexgen.X.Li r1 = r0.A0Y
            r0 = 1
            r1.setToolbarActionMode(r0)
        L2c:
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            boolean r4 = com.facebook.ads.redexgen.X.T0.A0h(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.T2.A02
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 6
            if (r1 == r0) goto L4c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            com.facebook.ads.redexgen.X.Li r0 = r0.A0Y
            r0.setToolbarActionMode(r3)
            goto L2c
        L4c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.T2.A02
            java.lang.String r1 = "RNuzR8"
            r0 = 4
            r2[r0] = r1
            if (r4 != 0) goto L6d
            com.facebook.ads.redexgen.X.T0 r1 = r5.A00
            r0 = 500(0x1f4, float:7.0E-43)
            com.facebook.ads.redexgen.X.LL.A0U(r1, r0)
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            com.facebook.ads.redexgen.X.Sa r0 = com.facebook.ads.redexgen.X.T0.A0A(r0)
            if (r0 == 0) goto L6d
            com.facebook.ads.redexgen.X.T0 r0 = r5.A00
            com.facebook.ads.redexgen.X.Sa r0 = com.facebook.ads.redexgen.X.T0.A0A(r0)
            com.facebook.ads.redexgen.X.LL.A0N(r0, r3)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.T2.AAa():void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0557Kd
    public final void ACC(float f) {
        boolean z;
        C1X c1x;
        boolean z2;
        AbstractC0952Zs abstractC0952Zs;
        float A03;
        AbstractC0952Zs abstractC0952Zs2;
        AbstractC0952Zs abstractC0952Zs3;
        boolean z3;
        AbstractC0952Zs abstractC0952Zs4;
        boolean z4;
        AbstractC0952Zs abstractC0952Zs5;
        this.A00.A0Q((int) f);
        z = this.A00.A0X;
        if (!z) {
            c1x = this.A00.A0H;
            float percentage = 1.0f - (f / c1x.A07());
            this.A00.A0Y.setProgress(100.0f * percentage);
            return;
        }
        z2 = this.A00.A0C;
        if (z2) {
            abstractC0952Zs4 = this.A00.A0G;
            A03 = 1.0f - (f / abstractC0952Zs4.A0h().A0D().A02());
            z4 = this.A00.A0F;
            if (z4 || A03 < 1.0f) {
                this.A00.A0F = false;
                abstractC0952Zs5 = this.A00.A0G;
                String A022 = abstractC0952Zs5.A0l().A02();
                String[] strArr = A02;
                if (strArr[1].charAt(20) != strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "16sMGD3KF8iI";
                strArr2[5] = "yItCOMUcMHVXea4ql8lykvs7qx";
                String rewardMessage = A022.replace(A00(0, 6, 65), String.valueOf((int) f));
                this.A00.A0Y.setToolbarActionMessage(rewardMessage);
            } else {
                this.A00.A0F = true;
                this.A00.A0Y.setToolbarActionMessage(A00(0, 0, 7));
            }
        } else {
            abstractC0952Zs = this.A00.A0G;
            A03 = 1.0f - (f / abstractC0952Zs.A0h().A0D().A03());
        }
        this.A00.A0Y.setProgress(100.0f * A03);
        abstractC0952Zs2 = this.A00.A0G;
        abstractC0952Zs3 = this.A00.A0G;
        float percentageOfReward = abstractC0952Zs3.A0h().A0D().A03();
        boolean z5 = ((float) abstractC0952Zs2.A0h().A0D().A02()) - f >= percentageOfReward;
        z3 = this.A00.A0F;
        if (!z3 && z5) {
            this.A00.A0Y.setToolbarActionMode(1);
        }
    }
}
