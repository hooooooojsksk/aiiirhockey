package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.AbstractC01934r;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4N */
/* loaded from: assets/audience_network.dex */
public abstract class C4N<VH extends AbstractC01934r> {
    public static byte[] A02;
    public static String[] A03 = {"W324oDAhe3QD27ZyNAxx1dE4409WhTwA", "Ikg10MzvREcGgl38", "tAS262iMJzRr57vvpxPoG7SYxewns3xN", "rCt", "3uu7", "cbDGC8uMMSmc1mSYy17nilWnTwttZfvA", "2T", "U5f6pdP97"};
    public final C4O A01 = new C4O();
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "WHsKZN6zyncpMK6d";
            strArr[4] = "wlW4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-48, -44, -98, -63, -16, -29, -33, -14, -29, -44, -25, -29, -11, -54, -50, -104, -57, -26, -70, -31, -26, -36, -50, -31, -35, -17};
    }

    public abstract VH A0C(ViewGroup viewGroup, int i);

    public abstract int A0D();

    public abstract void A0E(VH vh, int i);

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    private final void A02(VH holder, int i, List<Object> payloads) {
        A0E(holder, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final int A03(int i) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final long A04(int i) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final VH A05(ViewGroup viewGroup, int i) {
        C01282b.A01(A00(0, 13, 94));
        VH holder = A0C(viewGroup, i);
        holder.A00 = i;
        C01282b.A00();
        return holder;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final void A07(C4P c4p) {
        this.A01.registerObserver(c4p);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final void A08(C4P c4p) {
        this.A01.unregisterObserver(c4p);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final void A09(VH vh, int i) {
        vh.A03 = i;
        if (A0A()) {
            long A04 = A04(i);
            String[] strArr = A03;
            if (strArr[7].length() != strArr[6].length()) {
                String[] strArr2 = A03;
                strArr2[7] = "OgtetI94x";
                strArr2[6] = "QU";
                vh.A05 = A04;
            }
            throw new RuntimeException();
        }
        vh.A0U(1, 519);
        C01282b.A01(A00(13, 13, 88));
        A02(vh, i, vh.A0L());
        vh.A0N();
        ViewGroup.LayoutParams layoutParams = vh.A0H.getLayoutParams();
        if (layoutParams instanceof C01774a) {
            ((C01774a) layoutParams).A01 = true;
        }
        C01282b.A00();
        String[] strArr3 = A03;
        if (strArr3[5].charAt(31) == strArr3[0].charAt(31)) {
            String[] strArr4 = A03;
            strArr4[7] = "GQKIQ0ZEK";
            strArr4[6] = "Zf";
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4N != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4r> */
    public final boolean A0B(VH holder) {
        return false;
    }
}
