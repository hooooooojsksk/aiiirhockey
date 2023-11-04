package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uq */
/* loaded from: assets/audience_network.dex */
public final class C0826Uq implements GX {
    public static byte[] A06;
    public static String[] A07 = {"LZDHzUEPY8huLib8qPH1v7czaaxlCYVW", "Hfajs1uaSYD8XiY9EEWii1aSJKbCXH1k", "56ilEDtV1sbTjQDLh", "Yd2dmsZ5", "tr3yrs0rtPd5aa0L", "Zl3VJckSqinxve9JbD33GDfHo4YeuNba", "", ""};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    @Nullable
    public final InterfaceC0474Gt<? super C0826Uq> A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[3] = "kcdTjQCUlglhSnU2yukjc";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
            i4++;
        }
    }

    public static void A01() {
        A06 = new byte[]{airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, -99, -86, -96, -82, -85, -91, -96, -101, -99, -81, -81, -95, -80, airhockey.J_GAME_ENEMYEXIT};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws GQ {
        try {
            this.A01 = c0458Gb.A04;
            String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, 19))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 12))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            if (this.A02.skip(c0458Gb.A03) >= c0458Gb.A03) {
                if (c0458Gb.A02 != -1) {
                    this.A00 = c0458Gb.A02;
                } else {
                    this.A00 = this.A02.available();
                    long j = this.A00;
                    if (A07[4].length() == 18) {
                        throw new RuntimeException();
                    }
                    A07[2] = "Oz0AMtwZCktDi2SsP";
                    if (j == 2147483647L) {
                        this.A00 = -1L;
                    }
                }
                this.A03 = true;
                InterfaceC0474Gt<? super C0826Uq> interfaceC0474Gt = this.A05;
                if (interfaceC0474Gt != null) {
                    interfaceC0474Gt.ACq(this, c0458Gb);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new GQ(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gt != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public C0826Uq(Context context, @Nullable InterfaceC0474Gt<? super C0826Uq> interfaceC0474Gt) {
        this.A04 = context.getAssets();
        this.A05 = interfaceC0474Gt;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws GQ {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new GQ(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0474Gt<? super C0826Uq> interfaceC0474Gt = this.A05;
                if (interfaceC0474Gt != null) {
                    interfaceC0474Gt.ACp(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws GQ {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new GQ(e);
            }
        }
        int read = this.A02.read(bArr, i, i2);
        if (read == -1) {
            int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead == 0) {
                return -1;
            }
            throw new GQ(new EOFException());
        }
        long j2 = this.A00;
        int bytesRead2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (bytesRead2 != 0) {
            long j3 = read;
            if (A07[3].length() == 13) {
                throw new RuntimeException();
            }
            A07[4] = "Doxe12teItAf98KBLMhQOs4gzgBHzz";
            this.A00 = j2 - j3;
        }
        InterfaceC0474Gt<? super C0826Uq> interfaceC0474Gt = this.A05;
        if (interfaceC0474Gt != null) {
            interfaceC0474Gt.AAS(this, read);
        }
        return read;
    }
}
