package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4g */
/* loaded from: assets/audience_network.dex */
public class C4g {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C01824f> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        long j3 = j / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j3 * 3) + (j2 / 4);
    }

    private C01824f A01(int i) {
        C01824f c01824f = this.A00.get(i);
        if (c01824f == null) {
            C01824f c01824f2 = new C01824f();
            this.A00.put(i, c01824f2);
            return c01824f2;
        }
        return c01824f;
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.4f> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.4f> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.4f r0 = (com.facebook.ads.redexgen.X.C01824f) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.4r> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4g.A02():void");
    }

    public final AbstractC01934r A03(int i) {
        C01824f c01824f = this.A00.get(i);
        if (c01824f != null && !c01824f.A03.isEmpty()) {
            ArrayList<AbstractC01934r> arrayList = c01824f.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C01824f A01 = A01(i);
        A01.A01 = A00(A01.A01, j);
    }

    public final void A06(int i, long j) {
        C01824f A01 = A01(i);
        A01.A02 = A00(A01.A02, j);
    }

    public final void A07(C4N c4n) {
        this.A01++;
    }

    public final void A08(C4N c4n, C4N c4n2, boolean z) {
        if (c4n != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (c4n2 != null) {
            A07(c4n2);
        }
    }

    public final void A09(AbstractC01934r abstractC01934r) {
        int A0H = abstractC01934r.A0H();
        ArrayList<AbstractC01934r> arrayList = A01(A0H).A03;
        int i = this.A00.get(A0H).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        abstractC01934r.A0Q();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[7];
        int charAt = str.charAt(9);
        int viewType2 = str2.charAt(9);
        if (charAt != viewType2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC01934r);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
