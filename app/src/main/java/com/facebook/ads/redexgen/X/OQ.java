package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: assets/audience_network.dex */
public final class OQ extends InputStream {
    public int A00;
    public long A01;
    public GX A02;
    public final Uri A03;
    public final C0886Xb A04;
    public final GW A05;
    @Nullable
    public final String A06;

    public OQ(C0886Xb c0886Xb, Uri uri, GW gw) throws IOException {
        this.A04 = c0886Xb;
        this.A05 = gw;
        this.A03 = uri;
        this.A06 = C0705Py.A08(this.A04, this.A03);
        A00(0);
    }

    private void A00(int i) throws IOException {
        GX gx = this.A02;
        if (gx != null) {
            gx.close();
        }
        this.A02 = this.A05.A4H();
        this.A01 = (int) this.A02.ADF(new C0458Gb(this.A03, i, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.A02.read(bArr, i, i2);
        int read2 = this.A00;
        this.A00 = read2 + read;
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = this.A01 - this.A00;
        if (j2 <= 0) {
            return 0L;
        }
        if (j > j2) {
            j = j2;
        }
        this.A00 = (int) (this.A00 + j);
        A00(this.A00);
        return j;
    }
}
