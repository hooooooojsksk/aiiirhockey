package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WY implements BW {
    public static String[] A07 = {"WXHfHzHth2Al5uPNAeAj07mTCizYfL", "Ea4PVszhPWUkUOAzwMvLCDFSUaducjj7", "YmMP3hbiPsyrKpNosY6PcrNT297v1Qrn", "DJcyMwta", "hLB8mG9dKKyMH1LM5ESzC", "Vr0ZnTk4fnCFSbIFCLxfH748g1DMsTn2", "7kDa6eDxYJ9kj6HJXeCECzm6I99XwLPU", "QseCjdkBkHi9C8DCiNRIrV91qCtwuZnL"};
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final GX A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public WY(GX gx, long j, long j2) {
        this.A05 = gx;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(int i) {
        int bytesSkipped = Math.min(this.A00, i);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.A03, 0, bArr, i, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int requiredLength = bArr.length;
        if (i2 > requiredLength) {
            int requiredLength2 = bArr.length;
            int requiredLength3 = 524288 + i2;
            int newPeekCapacity = C0499Hs.A06(requiredLength2 * 2, 65536 + i2, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        int i2 = this.A00;
        if (i2 < this.A03.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        System.arraycopy(newPeekBuffer, i, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws IOException, InterruptedException {
        A04(i);
        int min = Math.min(this.A00 - this.A01, i);
        while (min < i) {
            min = A02(this.A03, this.A01, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int bytesPeeked = this.A01;
        this.A01 = bytesPeeked + i;
        int i2 = this.A00;
        int bytesPeeked2 = this.A01;
        this.A00 = Math.max(i2, bytesPeeked2);
        return true;
    }

    public final boolean A07(int i, boolean z) throws IOException, InterruptedException {
        int A00 = A00(i);
        while (A00 < i && A00 != -1) {
            int bytesSkipped = this.A06.length;
            A00 = A02(this.A06, -A00, Math.min(i, bytesSkipped + A00), A00, z);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final void A3L(int i) throws IOException, InterruptedException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final long A70() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final long A7K() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final long A7P() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final void ADP(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        ADQ(bArr, i, i2, false);
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final boolean ADQ(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!A06(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.BW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ADu(byte[] r10, int r11, int r12, boolean r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            r4 = r10
            r5 = r11
            r6 = r12
            int r7 = r9.A01(r4, r5, r6)
        L7:
            r3 = -1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WY.A07
            r0 = 5
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WY.A07
            java.lang.String r1 = "Jrnjt2kK808bOfAL2dwi4gGQEivMT1gd"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "BeMd7gkFpNMGNNjn1C0ltMDP7X04qF1j"
            r0 = 7
            r2[r0] = r1
            if (r7 >= r6) goto L38
            if (r7 == r3) goto L38
            r3 = r9
            r8 = r13
            int r7 = r3.A02(r4, r5, r6, r7, r8)
            goto L7
        L38:
            r9.A03(r7)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WY.A07
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L53
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WY.A07
            java.lang.String r1 = "kVyK5NlwbVR8i9TPL7EEmQ28yX1F3goU"
            r0 = 6
            r2[r0] = r1
            if (r7 == r3) goto L56
        L51:
            r0 = 1
        L52:
            return r0
        L53:
            if (r7 == r3) goto L56
            goto L51
        L56:
            r0 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WY.ADu(byte[], int, int, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final void AES() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final int AFG(int i) throws IOException, InterruptedException {
        int bytesSkipped = A00(i);
        if (bytesSkipped == 0) {
            byte[] bArr = this.A06;
            bytesSkipped = A02(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final void AFJ(int i) throws IOException, InterruptedException {
        A07(i, false);
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int bytesRead = A01(bArr, i, i2);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i, i2, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.X.BW
    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        ADu(bArr, i, i2, false);
    }
}
