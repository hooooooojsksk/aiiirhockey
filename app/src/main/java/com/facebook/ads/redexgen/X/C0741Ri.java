package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ri */
/* loaded from: assets/audience_network.dex */
public class C0741Ri extends K1 {
    public static byte[] A01;
    public static String[] A02 = {"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    public final /* synthetic */ C7J A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "csAIefbP6dEHufce3C5MSz";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{airhockey.P_GAME_MYSCORE, 86, 81, 82, 92, 13, 91, 82, 99, 82, 95, 13, 96, airhockey.J_SDKVER, 78, 95, airhockey.J_SDKVER, 82, 81, 13, 93, 89, 78, 102, 86, 91, 84};
    }

    static {
        A02();
    }

    public C0741Ri(C7J c7j) {
        this.A00 = c7j;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        boolean z;
        z = this.A00.A08;
        if (!z) {
            this.A00.A0G(A00(0, 27, 120));
        }
    }
}
