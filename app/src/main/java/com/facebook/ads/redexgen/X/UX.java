package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class UX implements GX {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final GV A02;
    public final GX A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws IOException {
        this.A00 = this.A03.ADF(c0458Gb);
        if (this.A00 == 0) {
            return 0L;
        }
        if (c0458Gb.A02 == -1 && this.A00 != -1) {
            c0458Gb = new C0458Gb(c0458Gb.A04, c0458Gb.A01, c0458Gb.A03, this.A00, c0458Gb.A05, c0458Gb.A00);
        }
        this.A01 = true;
        this.A02.ADH(c0458Gb);
        return this.A00;
    }

    public UX(GX gx, GV gv) {
        this.A03 = (GX) HD.A01(gx);
        this.A02 = (GV) HD.A01(gv);
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        return this.A03.A7w();
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z) {
                    this.A01 = false;
                    GV gv = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        gv.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read > 0) {
            this.A02.write(bArr, i, read);
            long j = this.A00;
            int bytesRead = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (bytesRead != 0) {
                this.A00 = j - read;
            }
        }
        return read;
    }
}
