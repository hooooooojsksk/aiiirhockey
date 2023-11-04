package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.aL */
/* loaded from: assets/audience_network.dex */
public final class C0981aL extends AbstractC00810f {
    public static byte[] A02;
    public static String[] A03 = {"jy5CHS8ciK95qvgyZPKNzTZ", "EsJYGwS5VmRo2OpDKfhEPxAAyWa", "TXamSNcIJ7UnME9", "aAqXHcETEDrJIQ0", "iKc7fPJ", "AeuUMR7bsIhvkygvb", "MOi5LCZvXht1yXQHfTxaoFALkw", "2sehTzR2RD89PLQKMZ0CUhyomJdrMDfZ"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {42, 40, 51, 53, 40, 51, 46, 35, 75, airhockey.P_GAME_BREAKBALLCOUNT, 79, 90};
        String[] strArr = A03;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A03[5] = "wR51MZdRiuTx9tajcMEJR1ABXy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0981aL.class.getSimpleName();
    }

    public C0981aL(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, String str, Uri uri, Map<String, String> mExtraData) {
        super(c0887Xc, interfaceC0505Ia, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00810f
    public final void A0C() {
        EnumC0507Ic enumC0507Ic = EnumC0507Ic.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 58));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                enumC0507Ic = EnumC0507Ic.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        super.A01.A9O(this.A02, this.A01, this.A00.getQueryParameter(A00(8, 4, 95)), enumC0507Ic);
    }
}
