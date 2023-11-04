package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Wh */
/* loaded from: assets/audience_network.dex */
public final class C0866Wh implements AE {
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public boolean A08;
    public boolean A09;
    public ByteBuffer A06 = AE.A00;
    public ByteBuffer A07 = AE.A00;
    public int A00 = -1;
    public int A03 = -1;
    public byte[] A0A = new byte[0];

    public final void A00(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A4A(int i, int i2, int i3) throws AD {
        if (i3 == 2) {
            this.A00 = i2;
            this.A03 = i;
            int i4 = this.A04;
            this.A0A = new byte[i4 * i2 * 2];
            this.A01 = 0;
            int i5 = this.A05;
            this.A02 = i5 * i2 * 2;
            boolean z = this.A09;
            boolean wasActive = (i5 == 0 && i4 == 0) ? false : true;
            this.A09 = wasActive;
            boolean wasActive2 = this.A09;
            return z != wasActive2;
        }
        throw new AD(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final ByteBuffer A7D() {
        ByteBuffer byteBuffer = this.A07;
        ByteBuffer outputBuffer = AE.A00;
        this.A07 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final int A7E() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final int A7F() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final int A7G() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A8c() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A8h() {
        return this.A08 && this.A07 == AE.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ADm() {
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ADn(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.position();
        int endBufferBytesToOutput = byteBuffer.limit();
        int trimBytes = endBufferBytesToOutput - remaining;
        int position = this.A02;
        int limit = Math.min(trimBytes, position);
        int position2 = this.A02;
        this.A02 = position2 - limit;
        byteBuffer.position(remaining + limit);
        int position3 = this.A02;
        if (position3 > 0) {
            return;
        }
        int trimBytes2 = trimBytes - limit;
        int position4 = this.A0A.length;
        int i = (this.A01 + trimBytes2) - position4;
        int position5 = this.A06.capacity();
        if (position5 < i) {
            this.A06 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A06.clear();
        }
        int position6 = this.A01;
        int remaining2 = C0499Hs.A06(i, 0, position6);
        this.A06.put(this.A0A, 0, remaining2);
        int limit2 = C0499Hs.A06(i - remaining2, 0, trimBytes2);
        int position7 = byteBuffer.position();
        byteBuffer.limit(position7 + limit2);
        this.A06.put(byteBuffer);
        byteBuffer.limit(endBufferBytesToOutput);
        int trimBytes3 = trimBytes2 - limit2;
        int position8 = this.A01;
        this.A01 = position8 - remaining2;
        byte[] bArr = this.A0A;
        int position9 = this.A01;
        System.arraycopy(bArr, remaining2, bArr, 0, position9);
        byte[] bArr2 = this.A0A;
        int position10 = this.A01;
        byteBuffer.get(bArr2, position10, trimBytes3);
        int position11 = this.A01;
        this.A01 = position11 + trimBytes3;
        this.A06.flip();
        this.A07 = this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void flush() {
        this.A07 = AE.A00;
        this.A08 = false;
        this.A02 = 0;
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void reset() {
        flush();
        this.A06 = AE.A00;
        this.A00 = -1;
        this.A03 = -1;
        this.A0A = new byte[0];
    }
}
