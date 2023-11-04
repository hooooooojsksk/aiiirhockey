package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class UU implements GX {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public GX A07;
    public H1 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final GX A0D;
    public final GX A0E;
    public final GX A0F;
    public final InterfaceC0478Gx A0G;
    @Nullable
    public final InterfaceC0480Gz A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, airhockey.J_ACHIEVEMENTCALLBACK, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public UU(InterfaceC0478Gx interfaceC0478Gx, GX gx, GX gx2, @Nullable GV gv, int i, @Nullable InterfaceC0480Gz interfaceC0480Gz) {
        this.A0G = interfaceC0478Gx;
        this.A0D = gx2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = gx;
        if (gv != null) {
            this.A0E = new UX(gx, gv);
        } else {
            this.A0E = null;
        }
        this.A0H = interfaceC0480Gz;
    }

    private int A00(C0458Gb c0458Gb) {
        if (this.A0K) {
            boolean z = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c0458Gb.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC0478Gx interfaceC0478Gx, String str, Uri uri) {
        H7 contentMetadata = interfaceC0478Gx.A6F(str);
        Uri A01 = H8.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        GX gx = this.A07;
        if (gx == null) {
            return;
        }
        try {
            gx.close();
            this.A07 = null;
            this.A0A = false;
            H1 h1 = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (h1 != null) {
                this.A0G.AE8(h1);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            H1 h12 = this.A08;
            if (h12 != null) {
                this.A0G.AE8(h12);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5y();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AEs(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof C0476Gv)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z) throws IOException {
        H1 AFP;
        long j;
        C0458Gb c0458Gb;
        GX nextDataSource;
        long j2;
        if (this.A0B) {
            AFP = null;
        } else if (this.A0I) {
            try {
                AFP = this.A0G.AFP(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AFP = this.A0G.AFQ(this.A09, this.A03);
        }
        if (AFP == null) {
            nextDataSource = this.A0F;
            c0458Gb = new C0458Gb(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AFP.A05) {
            Uri fromFile = Uri.fromFile(AFP.A03);
            long filePosition = this.A03 - AFP.A02;
            long length = AFP.A01 - filePosition;
            long j3 = this.A01;
            if (j3 != -1) {
                length = Math.min(length, j3);
            }
            c0458Gb = new C0458Gb(fromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AFP.A02()) {
                j = this.A01;
            } else {
                j = AFP.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    j = Math.min(j, length2);
                }
            }
            c0458Gb = new C0458Gb(this.A06, this.A03, j, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AE8(AFP);
                AFP = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j2 = this.A03 + 102400;
        } else {
            j2 = LongCompanionObject.MAX_VALUE;
        }
        this.A02 = j2;
        if (z) {
            HD.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (AFP.A01()) {
                    this.A0G.AE8(AFP);
                }
                throw th;
            }
        }
        if (AFP != null && AFP.A01()) {
            this.A08 = AFP;
        }
        this.A07 = nextDataSource;
        this.A0A = c0458Gb.A02 == -1;
        long ADF = nextDataSource.ADF(c0458Gb);
        H9 h9 = new H9();
        if (this.A0A) {
            int i = (ADF > (-1L) ? 1 : (ADF == (-1L) ? 0 : -1));
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (i != 0) {
                this.A01 = ADF;
                H8.A05(h9, this.A03 + this.A01);
            }
        }
        if (A0B()) {
            this.A05 = this.A07.A7w();
            if (true ^ this.A06.equals(this.A05)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    H8.A06(h9, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    H8.A06(h9, uri);
                }
            } else {
                H8.A04(h9);
            }
        }
        if (A0C()) {
            this.A0G.A3Q(this.A09, h9);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.facebook.ads.redexgen.X.GY
            if (r0 == 0) goto Lf
            r0 = r1
            com.facebook.ads.redexgen.X.GY r0 = (com.facebook.ads.redexgen.X.GY) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.UU.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final Uri A7w() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final long ADF(C0458Gb c0458Gb) throws IOException {
        try {
            this.A09 = H3.A02(c0458Gb);
            this.A06 = c0458Gb.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c0458Gb.A00;
            this.A03 = c0458Gb.A03;
            this.A0B = A00(c0458Gb) != -1;
            boolean z = this.A0B;
            int i = (c0458Gb.A02 > (-1L) ? 1 : (c0458Gb.A02 == (-1L) ? 0 : -1));
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            A0M[7] = "dSesbL2WrDww4Bz10U5v5xJMfaPPoRtG";
            if (i != 0 || this.A0B) {
                this.A01 = c0458Gb.A02;
            } else {
                this.A01 = this.A0G.A6E(this.A09);
                int reason = (this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1));
                if (reason != 0) {
                    this.A01 -= c0458Gb.A03;
                    int reason2 = (this.A01 > 0L ? 1 : (this.A01 == 0L ? 0 : -1));
                    if (reason2 <= 0) {
                        throw new GY(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i, i2);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A && A0D(e)) {
                A05();
                return -1;
            }
            A07(e);
            throw e;
        }
    }
}
