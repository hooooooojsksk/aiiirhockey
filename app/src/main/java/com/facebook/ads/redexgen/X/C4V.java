package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4V */
/* loaded from: assets/audience_network.dex */
public abstract class C4V {
    public static byte[] A06;
    public static String[] A07 = {"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", "n3", "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    public C4T A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{85, 84, 123, 84, 83, 87, 91, 78, 83, 85, 84, airhockey.P_GAME_REMATCH, 124, 83, 84, 83, airhockey.P_GAME_REMATCH, 82, 95, 94};
    }

    public abstract boolean A0E(@NonNull AbstractC01934r abstractC01934r, @Nullable C4U c4u, @NonNull C4U c4u2);

    public abstract boolean A0F(@NonNull AbstractC01934r abstractC01934r, @NonNull C4U c4u, @Nullable C4U c4u2);

    public abstract boolean A0G(@NonNull AbstractC01934r abstractC01934r, @NonNull C4U c4u, @NonNull C4U c4u2);

    public abstract boolean A0H(@NonNull AbstractC01934r abstractC01934r, @NonNull AbstractC01934r abstractC01934r2, @NonNull C4U c4u, @NonNull C4U c4u2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AbstractC01934r abstractC01934r);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AbstractC01934r abstractC01934r) {
        int i;
        i = abstractC01934r.A0C;
        int i2 = i & 14;
        if (abstractC01934r.A0b()) {
            return 4;
        }
        int flags = i2 & 4;
        if (flags == 0) {
            int A0J = abstractC01934r.A0J();
            int A0G = abstractC01934r.A0G();
            String[] strArr = A07;
            String str = strArr[3];
            String str2 = strArr[1];
            int oldPos = str.length();
            int flags2 = str2.length();
            if (oldPos != flags2) {
                A07[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
                if (A0J != -1 && A0G != -1 && A0J != A0G) {
                    return i2 | 2048;
                }
                return i2;
            }
            throw new RuntimeException();
        }
        return i2;
    }

    private final C4U A01() {
        return new C4U();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    @NonNull
    public final C4U A08(@NonNull C01904o c01904o, @NonNull AbstractC01934r abstractC01934r) {
        return A01().A01(abstractC01934r);
    }

    @NonNull
    public final C4U A09(@NonNull C01904o c01904o, @NonNull AbstractC01934r abstractC01934r, int i, @NonNull List<Object> payloads) {
        return A01().A01(abstractC01934r);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 16));
        } else {
            this.A05.clear();
        }
    }

    public final void A0B(C4T c4t) {
        this.A04 = c4t;
    }

    public final void A0C(AbstractC01934r abstractC01934r) {
        C4T c4t = this.A04;
        if (c4t != null) {
            c4t.AAB(abstractC01934r);
        }
    }

    public boolean A0D(@NonNull AbstractC01934r abstractC01934r) {
        return true;
    }

    public boolean A0M(@NonNull AbstractC01934r abstractC01934r, @NonNull List<Object> payloads) {
        return A0D(abstractC01934r);
    }
}
