package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Eb */
/* loaded from: assets/audience_network.dex */
public final class C0408Eb extends AbstractC0934Za {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public C0408Eb(C0887Xc c0887Xc, C01161p c01161p) {
        super(c0887Xc, c01161p);
    }

    private AnonymousClass14 A00(Runnable runnable) {
        return new ZS(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0L() {
        AbstractC0956Zw abstractC0956Zw = (AbstractC0956Zw) this.A01;
        abstractC0956Zw.A00(this.A07.A00);
        abstractC0956Zw.A01(this.A07.A01);
        abstractC0956Zw.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0934Za
    public final void A0N(InterfaceC00880n interfaceC00880n, C8A c8a, AnonymousClass88 anonymousClass88, C01171q c01171q) {
        F6 f6 = (F6) interfaceC00880n;
        ZT zt = new ZT(this, c01171q, f6);
        if (IK.A1w(this.A0B)) {
            A0E().postDelayed(zt, c8a.A05().A05());
        }
        C0887Xc c0887Xc = this.A0B;
        AnonymousClass14 A002 = A00(zt);
        boolean z = this.A07.A06;
        String str = this.A07.A04;
        C01161p c01161p = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        f6.A0J(c0887Xc, A002, c01171q, z, str, c01161p.A05);
    }

    public final void A0V(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7L() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC0956Zw rewardedVideoAdapter = (AbstractC0956Zw) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
