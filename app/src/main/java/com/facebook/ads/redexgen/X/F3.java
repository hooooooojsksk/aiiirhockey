package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class F3 extends AbstractC0952Zs {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public F3(List<C1C> list) {
        super(list);
    }

    public static F3 A02(JSONObject jSONObject, C0887Xc c0887Xc) {
        F3 f3 = new F3(AbstractC0952Zs.A07(jSONObject, c0887Xc, new C0951Zr()));
        f3.A0q(jSONObject);
        f3.A0S(A03(0, 6, 27));
        return f3;
    }

    @Override // com.facebook.ads.redexgen.X.C1B
    public final int A0C() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1B
    public final int A0D() {
        return 0;
    }
}
