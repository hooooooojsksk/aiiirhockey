package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Uu */
/* loaded from: assets/audience_network.dex */
public final class C0830Uu implements FR {
    public static byte[] A04;
    public final int A00;
    public final List<C0831Uv> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{19};
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0830Uu(java.util.List<com.facebook.ads.redexgen.X.C0831Uv> r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.A01 = r8
            int r0 = r8.size()
            r7.A00 = r0
            int r0 = r7.A00
            int r0 = r0 * 2
            long[] r0 = new long[r0]
            r7.A02 = r0
            r6 = 0
        L14:
            int r0 = r7.A00
            if (r6 >= r0) goto L31
            java.lang.Object r5 = r8.get(r6)
            com.facebook.ads.redexgen.X.Uv r5 = (com.facebook.ads.redexgen.X.C0831Uv) r5
            int r4 = r6 * 2
            long[] r2 = r7.A02
            long r0 = r5.A01
            r2[r4] = r0
            long[] r3 = r7.A02
            int r2 = r4 + 1
            long r0 = r5.A00
            r3[r2] = r0
            int r6 = r6 + 1
            goto L14
        L31:
            long[] r1 = r7.A02
            int r0 = r1.length
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r7.A03 = r0
            long[] r0 = r7.A03
            java.util.Arrays.sort(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0830Uu.<init>(java.util.List):void");
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final List<FQ> A6H(long j) {
        ArrayList arrayList = null;
        C0831Uv c0831Uv = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C0831Uv c0831Uv2 = this.A01.get(i);
                if (c0831Uv2.A00()) {
                    if (c0831Uv == null) {
                        c0831Uv = c0831Uv2;
                    } else {
                        String A00 = A00(0, 1, 53);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(c0831Uv.A0C).append((CharSequence) A00).append(c0831Uv2.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(c0831Uv2.A0C);
                        }
                    }
                } else {
                    arrayList.add(c0831Uv2);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new C0831Uv(normalCueTextBuilder));
        } else if (c0831Uv != null) {
            arrayList.add(c0831Uv);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final long A6i(int i) {
        boolean z = true;
        HD.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        HD.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A6j() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final int A7A(long j) {
        int A0A = C0499Hs.A0A(this.A03, j, false, false);
        int index = this.A03.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
