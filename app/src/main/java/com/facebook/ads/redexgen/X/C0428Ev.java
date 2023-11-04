package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ev */
/* loaded from: assets/audience_network.dex */
public final class C0428Ev extends AbstractC0952Zs {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", "3", "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, 11, 0, 13, -4};
    }

    static {
        A04();
    }

    public C0428Ev(List<C1C> list) {
        super(list);
    }

    public static C0428Ev A02(JSONObject jSONObject, C0887Xc c0887Xc) {
        C0428Ev c0428Ev = new C0428Ev(AbstractC0952Zs.A07(jSONObject, c0887Xc, new C0948Zo()));
        c0428Ev.A0q(jSONObject);
        c0428Ev.A0S(A03(0, 6, 46));
        return c0428Ev;
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
