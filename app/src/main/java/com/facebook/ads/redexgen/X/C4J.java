package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4J */
/* loaded from: assets/audience_network.dex */
public abstract class C4J {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final C4Z A02;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{84, 83, 75, 92, 81, 84, 89, 29, 82, 79, 84, 88, 83, airhockey.P_GAME_REMATCH, 92, airhockey.P_GAME_REMATCH, 84, 82, 83};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public C4J(C4Z c4z) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = c4z;
    }

    public /* synthetic */ C4J(C4Z c4z, C0913Yc c0913Yc) {
        this(c4z);
    }

    public static C4J A00(C4Z c4z) {
        return new C0913Yc(c4z);
    }

    public static C4J A01(C4Z c4z) {
        return new C0912Yb(c4z);
    }

    public static C4J A02(C4Z c4z, int i) {
        if (i != 0) {
            if (i == 1) {
                return A01(c4z);
            }
            throw new IllegalArgumentException(A03(0, 19, 11));
        }
        return A00(c4z);
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
