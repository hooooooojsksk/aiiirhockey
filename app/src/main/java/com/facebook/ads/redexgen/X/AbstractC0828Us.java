package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Us */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0828Us implements GJ {
    public static String[] A06 = {"EBmdqLWecJMvF32HHOtKZq3CgXIvE452", "BdAZUE9bv2aYbX", "p2jaFpqqtq7wiSmM9WukcsLyXw4b4dtx", "1X", "vopxokSVw1ySmQXekO1RjBQd7v2xLqd9", "VPvZphdKETm07yfZNyzcurZ6EUXJ9z1S", "", "4goZxeGj3kqt5M"};
    public int A00;
    public final long[] A01;
    public final Format[] A02;
    public final int A03;
    public final TrackGroup A04;
    public final int[] A05;

    public AbstractC0828Us(TrackGroup trackGroup, int... iArr) {
        HD.A04(iArr.length > 0);
        this.A04 = (TrackGroup) HD.A01(trackGroup);
        this.A03 = iArr.length;
        this.A02 = new Format[this.A03];
        for (int i = 0; i < iArr.length; i++) {
            this.A02[i] = trackGroup.A01(iArr[i]);
        }
        Arrays.sort(this.A02, new G7());
        this.A05 = new int[this.A03];
        int i2 = 0;
        while (true) {
            int i3 = this.A03;
            if (i2 < i3) {
                this.A05[i2] = trackGroup.A00(this.A02[i2]);
                i2++;
            } else {
                this.A01 = new long[i3];
                return;
            }
        }
    }

    public final boolean A00(int i, long j) {
        return this.A01[i] > j;
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public void A5C() {
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public final Format A6o(int i) {
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public final int A6u(int i) {
        return this.A05[i];
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public final Format A7b() {
        return this.A02[A7c()];
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public final TrackGroup A7s() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public void AC2(float f) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A06[0].charAt(2) == '6') {
                throw new RuntimeException();
            }
            A06[5] = "DltTTItYFp9j4gBSYKna0NySMwUM0opE";
            if (cls == cls2) {
                AbstractC0828Us abstractC0828Us = (AbstractC0828Us) obj;
                return this.A04 == abstractC0828Us.A04 && Arrays.equals(this.A05, abstractC0828Us.A05);
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
        }
        int i = this.A00;
        if (A06[3].length() != 1) {
            A06[2] = "bVwK8O26HvXVwTm7sFYRRd9zYTspDJxL";
            return i;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.GJ
    public final int length() {
        return this.A05.length;
    }
}
