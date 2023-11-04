package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nc */
/* loaded from: assets/audience_network.dex */
public class RunnableC0632Nc implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass95 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{63, 0, 13, 12, 6, 57, 5, 8, 16, 11, 8, 10, 2, 44, 27, 27, 6, 27};
    }

    public RunnableC0632Nc(AnonymousClass95 anonymousClass95) {
        this.A00 = anonymousClass95;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0657Ob interfaceC0657Ob;
        if (C0548Jt.A02(this)) {
            return;
        }
        try {
            interfaceC0657Ob = this.A00.A00.A0M;
            interfaceC0657Ob.ACz(A00(0, 18, 110));
        } catch (Throwable th) {
            C0548Jt.A00(th, this);
        }
    }
}
