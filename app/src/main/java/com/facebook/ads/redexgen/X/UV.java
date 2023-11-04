package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: assets/audience_network.dex */
public final class UV implements GV {
    public long A00;
    public long A01;
    public C0458Gb A02;
    public C0490Hj A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC0478Gx A09;
    public final boolean A0A;

    public UV(InterfaceC0478Gx interfaceC0478Gx, long j) {
        this(interfaceC0478Gx, j, 20480, true);
    }

    public UV(InterfaceC0478Gx interfaceC0478Gx, long j, int i, boolean z) {
        this.A09 = (InterfaceC0478Gx) HD.A01(interfaceC0478Gx);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            C0499Hs.A0X(this.A06);
            this.A06 = null;
            File fileToCommit = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A47(fileToCommit);
            } else {
                fileToCommit.delete();
            }
        } catch (Throwable th) {
            C0499Hs.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A47(file);
            } else {
                file.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long maxLength;
        if (this.A02.A02 == -1) {
            maxLength = this.A08;
        } else {
            maxLength = Math.min(this.A02.A02 - this.A00, this.A08);
        }
        this.A04 = this.A09.AFN(this.A02.A05, this.A00 + this.A02.A01, maxLength);
        this.A05 = new FileOutputStream(this.A04);
        int i = this.A07;
        if (i > 0) {
            C0490Hj c0490Hj = this.A03;
            if (c0490Hj == null) {
                this.A03 = new C0490Hj(this.A05, i);
            } else {
                c0490Hj.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GV
    public final void ADH(C0458Gb c0458Gb) throws UW {
        if (c0458Gb.A02 == -1 && !c0458Gb.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0458Gb;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e) {
            throw new UW(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GV
    public final void close() throws UW {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new UW(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.GV
    public final void write(byte[] bArr, int i, int i2) throws UW {
        if (this.A02 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.A01 == this.A08) {
                    A00();
                    A01();
                }
                int bytesWritten = i2 - i3;
                int min = (int) Math.min(bytesWritten, this.A08 - this.A01);
                int bytesWritten2 = i + i3;
                this.A06.write(bArr, bytesWritten2, min);
                i3 += min;
                this.A01 += min;
                this.A00 += min;
            } catch (IOException e) {
                throw new UW(e);
            }
        }
    }
}
