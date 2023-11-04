package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6B */
/* loaded from: assets/audience_network.dex */
public final class C6B {
    public static boolean A04;
    public static byte[] A05;
    public static final String A06;
    public final C6C A00;
    public final C6D A01;
    public final C0886Xb A02;
    public final InterfaceC0712Qf A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{46, 56, 19, 41, 52, 56, 62, 45, 63};
    }

    static {
        A01();
        A06 = C6B.class.getSimpleName();
    }

    public C6B(C0886Xb c0886Xb, InterfaceC0457Ga interfaceC0457Ga, C6C c6c, C6D c6d) {
        this.A02 = c0886Xb;
        this.A03 = interfaceC0457Ga.A4R(EnumC0713Qg.A06);
        this.A00 = c6c;
        this.A01 = c6d;
        this.A03.A3G(new C0895Xk(this));
        A02();
    }

    public synchronized void A02() {
        if (C0548Jt.A02(this)) {
            return;
        }
        if (!this.A03.A8r()) {
            this.A02.A04().A8f();
            return;
        }
        String btExtras = this.A03.A6P().optString(A00(0, 9, 62));
        if (!TextUtils.isEmpty(btExtras)) {
            this.A00.A04(this.A02, btExtras);
            if (!A04 || IK.A0h(this.A02)) {
                A04 = true;
                this.A01.A07();
            }
        }
    }
}
