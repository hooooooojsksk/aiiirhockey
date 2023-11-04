package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wq */
/* loaded from: assets/audience_network.dex */
public final class C0875Wq implements AE {
    public boolean A04;
    public boolean A05;
    @Nullable
    public int[] A06;
    @Nullable
    public int[] A07;
    public ByteBuffer A02 = AE.A00;
    public ByteBuffer A03 = AE.A00;
    public int A00 = -1;
    public int A01 = -1;

    public final void A00(@Nullable int[] iArr) {
        this.A07 = iArr;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A4A(int i, int i2, int i3) throws AD {
        boolean z = !Arrays.equals(this.A07, this.A06);
        this.A06 = this.A07;
        if (this.A06 == null) {
            this.A04 = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.A01 == i && this.A00 == i2) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            boolean outputChannelsChanged = i2 != this.A06.length;
            this.A04 = outputChannelsChanged;
            int i4 = 0;
            while (true) {
                int[] iArr = this.A06;
                if (i4 >= iArr.length) {
                    return true;
                }
                int i5 = iArr[i4];
                if (i5 < i2) {
                    boolean z2 = this.A04;
                    boolean outputChannelsChanged2 = i5 != i4;
                    this.A04 = z2 | outputChannelsChanged2;
                    i4++;
                } else {
                    throw new AD(i, i2, i3);
                }
            }
        } else {
            throw new AD(i, i2, i3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final ByteBuffer A7D() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = AE.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final int A7E() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final int A7F() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final int A7G() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A8c() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A8h() {
        return this.A05 && this.A03 == AE.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ADm() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ADn(ByteBuffer byteBuffer) {
        int[] iArr;
        HD.A04(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int position2 = this.A00;
        int i = (limit - position) / (position2 * 2);
        int position3 = this.A06.length;
        int i2 = position3 * i * 2;
        int position4 = this.A02.capacity();
        if (position4 < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int position5 : this.A06) {
                this.A02.putShort(byteBuffer.getShort((position5 * 2) + position));
            }
            int position6 = this.A00;
            position += position6 * 2;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void flush() {
        this.A03 = AE.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void reset() {
        flush();
        this.A02 = AE.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
