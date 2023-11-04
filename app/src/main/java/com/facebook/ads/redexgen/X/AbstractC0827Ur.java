package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Ur */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0827Ur extends GM {
    public static String[] A01 = {"JXADnguvwbjBsYgslHoSHgr2xxMnawNn", "", "jNEAQ3UZ70aM1hHDYV2CS20ieNSkmYbb", "bnkACY5tQbsoiCdyBJgaOjSRI0w0kmrQ", "gVGuKveDeddXJzh5PaouiQlIwgfOoZnh", "qzMEUGGJ0FpDLYRljtzJ24rj8XT6rBKz", "LijUR", "ZVB7ZDT4TSe2rtQPBLBW6RwhtV59NTLq"};
    @Nullable
    public GH A00;

    public abstract Pair<C03099o[], GJ[]> A0V(GH gh, int[][][] iArr, int[] iArr2) throws C9F;

    /* JADX WARN: Incorrect condition in loop: B:25:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:28:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Q(com.facebook.ads.redexgen.X.InterfaceC03089n[] r6, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r7) throws com.facebook.ads.redexgen.X.C9F {
        /*
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L3:
            int r0 = r6.length
            if (r3 >= r0) goto L25
            r2 = r6[r3]
            r1 = 0
        L9:
            int r0 = r7.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A01(r1)
            int r0 = r2.AFY(r0)
            r0 = r0 & 7
            if (r0 <= r4) goto L1f
            r5 = r3
            r4 = r0
            r0 = 4
            if (r4 != r0) goto L1f
            return r5
        L1f:
            int r1 = r1 + 1
            goto L9
        L22:
            int r3 = r3 + 1
            goto L3
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0827Ur.A0Q(com.facebook.ads.redexgen.X.9n[], com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup):int");
    }

    public static int[] A0R(InterfaceC03089n interfaceC03089n, TrackGroup trackGroup) throws C9F {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = interfaceC03089n.AFY(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC03089n[] interfaceC03089nArr) throws C9F {
        int[] iArr = new int[interfaceC03089nArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = interfaceC03089nArr[i].AFa();
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
        if (r6 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
        r3 = new int[r7.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
        if (r6 == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008d, code lost:
        r5 = r13[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009b, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC0827Ur.A01[4].charAt(3) == 'u') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009d, code lost:
        r3 = A0R(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a2, code lost:
        com.facebook.ads.redexgen.X.AbstractC0827Ur.A01[1] = "";
        r3 = A0R(r5, r7);
     */
    @Override // com.facebook.ads.redexgen.X.GM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.GN A0T(com.facebook.ads.redexgen.X.InterfaceC03089n[] r13, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r14) throws com.facebook.ads.redexgen.X.C9F {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0827Ur.A0T(com.facebook.ads.redexgen.X.9n[], com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray):com.facebook.ads.redexgen.X.GN");
    }

    @Override // com.facebook.ads.redexgen.X.GM
    public final void A0U(Object obj) {
        this.A00 = (GH) obj;
    }
}
