package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0p */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC00900p {
    public static byte[] A04;
    public static String[] A05 = {"OqcLT37Xtir4oyEfNmT1h4Rk4YkQZZDY", "Uwe5RI", "pL0dXLjcEL0YvPTfwlaTsWSX1DbaAkE5", "xtw7OOYBvYdKgcW8WzcZrKA0PDZy4bwg", "f918FI", "0rYE8aKdqB5alUcDRGHr7byWf0zxjLED", "HJdrWZ0hD1uhwEG", "W2AWehjS6wPr2mpVEIqcODXDVwSDQEbA"};
    public boolean A00;
    public final C0887Xc A01;
    public final AbstractC00910q A02;
    public final QA A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
            String[] strArr = A05;
            if (strArr[7].charAt(19) == strArr[3].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ralyQsFIfJjHchT6ijaCYOn7xcrh9SYP";
            strArr2[0] = "lf1tsTh5P7IODA8hmkOKCVUdKtrYifbk";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-126, -90, -87, -85, -98, -84, -84, -94, -88, -89, 89, -91, -88, -96, -96, -98, -99};
    }

    public abstract void A06(Map<String, String> map);

    static {
        A01();
    }

    public AbstractC00900p(C0887Xc c0887Xc, AbstractC00910q abstractC00910q, QA qa) {
        this.A01 = c0887Xc;
        this.A02 = abstractC00910q;
        this.A03 = qa;
    }

    public final void A02() {
        if (this.A00) {
            return;
        }
        AbstractC00910q abstractC00910q = this.A02;
        if (abstractC00910q != null) {
            abstractC00910q.A00();
        }
        Map<String, String> extraData = new NA().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        KZ.A02(this.A01, A00(0, 17, 20));
        AbstractC00910q abstractC00910q2 = this.A02;
    }
}
