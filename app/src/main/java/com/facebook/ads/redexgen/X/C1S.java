package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1S */
/* loaded from: assets/audience_network.dex */
public final class C1S implements Serializable {
    public static byte[] A04 = null;
    public static String[] A05 = {"fMgCBjwnSPLlGmCQgsSLupdT7pqDzyp4", "yUS8gRlB2MWxUDhPAJrAYtkWaSt8qz4B", "dBasyOwTmlOZTCbIWWmvB1g7E", "RqaXhgYUvoqEq", "F0nm8JPdbdm", "Y401XUNRFDrr9SfWxNZZjZ9oz", "LA5HjnpgcUFB3", "MK9sfwjFqBk"};
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{airhockey.J_WAIT, -7, -31, -13, -16, -16, -29, -20, -31, -9, -5, -23, -33, -29, -49, -36, -30, -41, -30, -25, -21};
    }

    static {
        A02();
    }

    public C1S(C1R c1r) {
        String str;
        String str2;
        String str3;
        String str4;
        str = c1r.A02;
        this.A02 = str;
        str2 = c1r.A03;
        this.A03 = str2;
        str3 = c1r.A00;
        this.A00 = str3;
        str4 = c1r.A01;
        this.A01 = str4;
    }

    public static String A01(String str, String str2, int i) {
        String replace = str.replace(A00(1, 10, 49), str2);
        String A00 = A00(0, 0, 15);
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            String updatedString = A00(0, 1, 12);
            sb.append(updatedString);
            A00 = sb.toString();
        }
        String updatedString2 = A00(11, 10, 33);
        String replace2 = replace.replace(updatedString2, A00);
        String updatedString3 = A05[7];
        if (updatedString3.length() != 29) {
            A05[4] = "HwfJGa76I4tQ";
            return replace2;
        }
        throw new RuntimeException();
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i) {
        return A01(this.A03, str, i);
    }
}
