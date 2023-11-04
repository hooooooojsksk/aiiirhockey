package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Wk */
/* loaded from: assets/audience_network.dex */
public final class C0869Wk implements AE {
    public static String[] A06 = {"LkLK", "abA9PNMrvscgwbqokpbH2", "wszIi3vfQywtet5OFqyTWUvoUYNS5ktb", "liexkOjxlVrdDutCVl0EvpIg3k3OXdWT", "uDjcyehsvUvWAc8oFKsUcicvrdYrbu", "Yx0xuqb7ConKzBOp6wI44fmqMUTcgjwu", "2AEFdY1ASteFDfy1ihWDcuoiihyMOIox", "2HHuLOzdt0KrTaQRoJg3USXKVGpaMcoz"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = AE.A00;
    public ByteBuffer A04 = AE.A00;

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A4A(int i, int i2, int i3) throws AD {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.A02 != i || this.A00 != i2 || this.A01 != i3) {
                this.A02 = i;
                this.A00 = i2;
                this.A01 = i3;
                return true;
            }
            String[] strArr = A06;
            if (strArr[5].charAt(14) != strArr[3].charAt(14)) {
                A06[4] = "26RCfMYW5Do9ItFOuFHGepjFl0G7YQ";
                return false;
            }
            throw new RuntimeException();
        }
        throw new AD(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final ByteBuffer A7D() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = AE.A00;
        this.A04 = outputBuffer;
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
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A8c() {
        int i = this.A01;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean A8h() {
        return this.A05 && this.A04 == AE.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ADm() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ADn(ByteBuffer byteBuffer) {
        int limit;
        int i = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i;
        int position = this.A01;
        if (position == Integer.MIN_VALUE) {
            limit = (limit2 / 3) * 2;
        } else if (position == 3) {
            limit = limit2 * 2;
        } else if (position == 1073741824) {
            limit = limit2 / 2;
        } else {
            throw new IllegalStateException();
        }
        if (this.A03.capacity() < limit) {
            this.A03 = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        int i2 = this.A01;
        String[] strArr = A06;
        if (strArr[5].charAt(14) == strArr[3].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "hXv0xOe0fZxBP6BjMdwou1g9whaCh4Nv";
        strArr2[7] = "rvzJSg8TnEJLrC3bKKMSDNtobyDED6VD";
        if (i2 == Integer.MIN_VALUE) {
            while (i < resampledSize) {
                this.A03.put(byteBuffer.get(i + 1));
                this.A03.put(byteBuffer.get(i + 2));
                if (A06[0].length() != 4) {
                    String[] strArr3 = A06;
                    strArr3[5] = "E4BL66fjyhULGxaexfiDPz3mapJFS3cG";
                    strArr3[3] = "yfO0gWrxajAAEFBsdSj1hVUV9LiurAH3";
                    i++;
                } else {
                    A06[2] = "LF6WYMkflBQ3SrZEsSHTSTVRB3dg3WPN";
                    i += 3;
                }
            }
        } else if (i2 == 3) {
            while (i < resampledSize) {
                this.A03.put((byte) 0);
                this.A03.put((byte) ((byteBuffer.get(i) & 255) - 128));
                i++;
            }
        } else if (i2 == 1073741824) {
            while (i < resampledSize) {
                this.A03.put(byteBuffer.get(i + 2));
                this.A03.put(byteBuffer.get(i + 3));
                i += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void flush() {
        this.A04 = AE.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = AE.A00;
    }
}
