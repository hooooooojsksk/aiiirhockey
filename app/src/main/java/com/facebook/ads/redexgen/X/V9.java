package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class V9 implements InterfaceC0351Bh {
    public static String[] A0F = {"J778k2tN1A71aNteuaiayf8W9Cwuw9", "SddvXAFvjaaaNZPS5hBFE72C4u8NAkzU", "DlS6L0Rs4yOHZbnixJzGuxf7gpgZ1", "jQlCDwUBXdtP", "ybgFHcAQFxf90xR6S9k4k72uXmSANsHZ", "TXMpPdQfareL1guTNfB0PsKfFvbJoTHv", "R2X9ywuliv1XsGmKXBlkokivcnsZ5nAf", "17XTwjN4yTPZEt52JUGlNgZMXTvW6CfX"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0419Em A04;
    public C0419Em A05;
    public C0419Em A06;
    public InterfaceC0420En A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final GP A0D;
    public final C0418El A0C = new C0418El();
    public final C0417Ek A0B = new C0417Ek();
    public final C0483Hc A0E = new C0483Hc(32);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final void AEY(long j, int i, int i2, int i3, C0350Bg c0350Bg) {
        if (this.A08) {
            A5X(this.A03);
        }
        if (this.A09) {
            if ((i & 1) == 0 || !this.A0C.A0J(j)) {
                return;
            }
            this.A09 = false;
        }
        this.A0C.A0G(j + this.A00, i, (this.A01 - i2) - i3, i2, c0350Bg);
    }

    public V9(GP gp) {
        this.A0D = gp;
        this.A0A = gp.A6v();
        this.A04 = new C0419Em(0L, this.A0A);
        C0419Em c0419Em = this.A04;
        this.A05 = c0419Em;
        this.A06 = c0419Em;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3M(), new C0419Em(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (A0F[5].charAt(18) != 'x') {
            A0F[5] = "lOB1PW6jUN1Flr4ublIocLHYYSFUXZqB";
            if (i != 0 && format.A0G != LongCompanionObject.MAX_VALUE) {
                return format.A0H(format.A0G + j);
            }
            return format;
        }
        throw new RuntimeException();
    }

    private void A02(int i) {
        this.A01 += i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            this.A0D.AE5(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int remaining = (int) (this.A05.A03 - j);
            int min = Math.min(i, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j);
            byteBuffer.put(bArr, remaining2, min);
            i -= min;
            j += min;
            int remaining3 = (j > this.A05.A03 ? 1 : (j == this.A05.A03 ? 0 : -1));
            if (remaining3 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.A05.A03 - j));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j);
            int remaining = i - i2;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i2 -= min;
            j += min;
            int remaining2 = (j > this.A05.A03 ? 1 : (j == this.A05.A03 ? 0 : -1));
            if (remaining2 == 0) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A07(C0865Wg c0865Wg, C0417Ek c0417Ek) {
        int subsampleDataLength;
        long j = c0417Ek.A01;
        this.A0E.A0W(1);
        A06(j, this.A0E.A00, 1);
        long j2 = j + 1;
        byte b = this.A0E.A00[0];
        byte signalByte = (b & ByteCompanionObject.MIN_VALUE) == 0 ? (byte) 0 : (byte) 1;
        int ivSize = b & ByteCompanionObject.MAX_VALUE;
        if (c0865Wg.A02.A04 == null) {
            c0865Wg.A02.A04 = new byte[16];
        }
        A06(j2, c0865Wg.A02.A04, ivSize);
        long j3 = j2 + ivSize;
        if (signalByte != 0) {
            this.A0E.A0W(2);
            A06(j3, this.A0E.A00, 2);
            j3 += 2;
            subsampleDataLength = this.A0E.A0I();
        } else {
            subsampleDataLength = 1;
        }
        int[] iArr = c0865Wg.A02.A06;
        if (iArr == null || iArr.length < subsampleDataLength) {
            iArr = new int[subsampleDataLength];
        }
        int[] iArr2 = c0865Wg.A02.A07;
        if (A0F[1].charAt(27) == 'T') {
            throw new RuntimeException();
        }
        A0F[3] = "l74rmj1cvzMl";
        if (iArr2 == null || iArr2.length < subsampleDataLength) {
            iArr2 = new int[subsampleDataLength];
            if (A0F[3].length() != 12) {
                A0F[5] = "mTjJh6O10GTQKtsNTzpZkGXCEgBidJyY";
            } else {
                String[] strArr = A0F;
                strArr[2] = "gGnYbSzqov18WRGS84osGLTli7oQ4";
                strArr[0] = "bcZjTvBd8pDqGicoFFRFmeT3NfcxuZ";
            }
        }
        if (signalByte != 0) {
            int i = subsampleDataLength * 6;
            this.A0E.A0W(i);
            A06(j3, this.A0E.A00, i);
            j3 += i;
            this.A0E.A0Y(0);
            for (int i2 = 0; i2 < subsampleDataLength; i2++) {
                iArr[i2] = this.A0E.A0I();
                iArr2[i2] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c0417Ek.A00 - ((int) (j3 - c0417Ek.A01));
        }
        C0350Bg c0350Bg = c0417Ek.A02;
        c0865Wg.A02.A03(subsampleDataLength, iArr, iArr2, c0350Bg.A03, c0865Wg.A02.A04, c0350Bg.A01, c0350Bg.A02, c0350Bg.A00);
        int i3 = (int) (j3 - c0417Ek.A01);
        c0417Ek.A01 += i3;
        c0417Ek.A00 -= i3;
    }

    /* JADX WARN: Incorrect condition in loop: B:25:0x002f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.C0419Em r7) {
        /*
            r6 = this;
            boolean r0 = r7.A02
            if (r0 != 0) goto L5
            return
        L5:
            com.facebook.ads.redexgen.X.Em r0 = r6.A06
            boolean r3 = r0.A02
            com.facebook.ads.redexgen.X.Em r0 = r6.A06
            long r4 = r0.A04
            long r0 = r7.A04
            long r4 = r4 - r0
            int r1 = (int) r4
            int r0 = r6.A0A
            int r1 = r1 / r0
            int r3 = r3 + r1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.V9.A0F
            r0 = 5
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L42
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.V9.A0F
            java.lang.String r1 = "iejtrz5gn5ypfg4If5spWIciPKrb2ZMM"
            r0 = 1
            r2[r0] = r1
            com.facebook.ads.redexgen.X.GO[] r2 = new com.facebook.ads.redexgen.X.GO[r3]
            r1 = 0
        L2e:
            int r0 = r2.length
            if (r1 >= r0) goto L3c
            com.facebook.ads.redexgen.X.GO r0 = r7.A01
            r2[r1] = r0
            com.facebook.ads.redexgen.X.Em r7 = r7.A01()
            int r1 = r1 + 1
            goto L2e
        L3c:
            com.facebook.ads.redexgen.X.GP r0 = r6.A0D
            r0.AE6(r2)
            return
        L42:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.V9.A08(com.facebook.ads.redexgen.X.Em):void");
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new C0419Em(0L, this.A0A);
        C0419Em c0419Em = this.A04;
        this.A05 = c0419Em;
        this.A06 = c0419Em;
        this.A01 = 0L;
        this.A0D.AFd();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(C9S c9s, C0865Wg c0865Wg, boolean z, boolean z2, long j) {
        int A09 = this.A0C.A09(c9s, c0865Wg, z, z2, this.A02, this.A0B);
        if (A09 == -5) {
            this.A02 = c9s.A00;
            return -5;
        } else if (A09 != -4) {
            if (A09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            boolean A04 = c0865Wg.A04();
            String[] strArr = A0F;
            String str = strArr[2];
            String str2 = strArr[0];
            int length = str.length();
            int result = str2.length();
            if (length != result) {
                A0F[3] = "3oC8GcXqxYNt";
                if (!A04) {
                    int result2 = (c0865Wg.A00 > j ? 1 : (c0865Wg.A00 == j ? 0 : -1));
                    if (result2 < 0) {
                        c0865Wg.A00(Integer.MIN_VALUE);
                    }
                    if (c0865Wg.A0A()) {
                        A07(c0865Wg, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    c0865Wg.A09(result3);
                    long j2 = this.A0B.A01;
                    ByteBuffer byteBuffer = c0865Wg.A01;
                    int result4 = this.A0B.A00;
                    A05(j2, byteBuffer, result4);
                }
                return -4;
            }
            throw new RuntimeException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC0420En interfaceC0420En) {
        this.A07 = interfaceC0420En;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final void A5X(Format format) {
        Format A01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0420En interfaceC0420En = this.A07;
        if (interfaceC0420En != null && formatChanged) {
            interfaceC0420En.ACt(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final int AEW(BW bw, int i, boolean z) throws IOException, InterruptedException {
        int read = bw.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        return read;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0351Bh
    public final void AEX(C0483Hc c0483Hc, int i) {
        while (i > 0) {
            int A00 = A00(i);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            c0483Hc.A0c(bArr, bytesAppended, A00);
            i -= A00;
            A02(A00);
        }
    }
}
