package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: assets/audience_network.dex */
public final class WL implements InterfaceC0355Bn {
    public static byte[] A07;
    public static String[] A08 = {"S6y5l6jxI9", "6mnEH66ZFffSlH4yeHJS8qNG", "YOAMbMDgHDJdJlquETda64yXe2Dsnigk", "hsyrHKVntalAWTsGKMDD", "vPfGZ", "fU8euoLNwl", "f8hQ6WKdo4yu3", "0USUeFTSnT76dGHmDwgcSkrJJgtZvyOb"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0356Bp A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0354Bm> A05 = new ArrayDeque<>();
    public final C0359Bu A04 = new C0359Bu();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{124, -95, -87, -108, -97, -100, -105, 83, -104, -97, -104, -96, -104, -95, -89, 83, -89, -84, -93, -104, 83, -100, -63, -55, -76, -65, -68, -73, airhockey.J_SAVEDGAME_SAVE, -71, -65, -62, -76, -57, airhockey.J_SAVEDGAME_SAVE, -58, -68, -51, -72, -115, airhockey.J_SAVEDGAME_SAVE, -27, 10, 18, -3, 8, 5, 0, -68, 5, 10, 16, 1, 3, 1, 14, -68, 15, 5, 22, 1, -42, -68, -127, -94, -96, -105, -100, -107, 78, -109, -102, -109, -101, -109, -100, -94, 78, -95, -105, -88, -109, airhockey.J_ENEMYLOSE, 78};
    }

    static {
        A05();
    }

    private double A00(BW bw, int i) throws IOException, InterruptedException {
        long A02 = A02(bw, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(BW bw) throws IOException, InterruptedException {
        bw.AES();
        while (true) {
            bw.ADP(this.A06, 0, 4);
            int A00 = C0359Bu.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C0359Bu.A01(this.A06, A00, false);
                if (this.A03.A8m(A01)) {
                    bw.AFJ(A00);
                    return A01;
                }
            }
            bw.AFJ(1);
        }
    }

    private long A02(BW bw, int i) throws IOException, InterruptedException {
        bw.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & UByte.MAX_VALUE;
            j = (j << 8) | value;
        }
        return j;
    }

    private String A04(BW bw, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return A03(0, 0, 103);
        }
        byte[] bArr = new byte[i];
        bw.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0355Bn
    public final void A8W(InterfaceC0356Bp interfaceC0356Bp) {
        this.A03 = interfaceC0356Bp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0355Bn
    public final boolean ADr(BW bw) throws IOException, InterruptedException {
        long j;
        int i;
        HD.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7P = bw.A7P();
                C0354Bm peek = this.A05.peek();
                if (A08[4].length() == 19) {
                    throw new RuntimeException();
                }
                A08[1] = "iTM85rd";
                j = peek.A01;
                if (A7P >= j) {
                    InterfaceC0356Bp interfaceC0356Bp = this.A03;
                    i = this.A05.pop().A00;
                    interfaceC0356Bp.A5F(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(bw, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(bw);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(bw, false, true, 8);
                this.A01 = 2;
            }
            int A6Z = this.A03.A6Z(this.A00);
            if (A6Z != 0) {
                if (A6Z == 1) {
                    long A7P2 = bw.A7P();
                    this.A05.push(new C0354Bm(this.A00, A7P2 + this.A02));
                    this.A03.AFO(this.A00, A7P2, this.A02);
                    this.A01 = 0;
                    return true;
                } else if (A6Z == 2) {
                    long j2 = this.A02;
                    if (j2 <= 8) {
                        this.A03.A8a(this.A00, A02(bw, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9Y(A03(41, 22, 116) + this.A02);
                } else if (A6Z == 3) {
                    long j3 = this.A02;
                    if (j3 <= 2147483647L) {
                        this.A03.AFW(this.A00, A04(bw, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C9Y(A03(63, 21, 6) + this.A02);
                } else if (A6Z == 4) {
                    this.A03.A3s(this.A00, (int) this.A02, bw);
                    this.A01 = 0;
                    return true;
                } else if (A6Z == 5) {
                    long j4 = this.A02;
                    int type = (j4 > 4L ? 1 : (j4 == 4L ? 0 : -1));
                    if (type != 0) {
                        int type2 = (j4 > 8L ? 1 : (j4 == 8L ? 0 : -1));
                        if (type2 != 0) {
                            throw new C9Y(A03(21, 20, 43) + this.A02);
                        }
                    }
                    InterfaceC0356Bp interfaceC0356Bp2 = this.A03;
                    int i2 = this.A00;
                    int type3 = (int) this.A02;
                    interfaceC0356Bp2.A5T(i2, A00(bw, type3));
                    if (A08[7].charAt(2) != 'S') {
                        A08[2] = "x8X2xTnJq9Kheln0ABdW7PO8kghsREvE";
                        this.A01 = 0;
                        return true;
                    }
                    A08[4] = "mGqeeb15RRoJ11oGs7LhfnjQvY";
                    this.A01 = 0;
                    return true;
                } else {
                    throw new C9Y(A03(0, 21, 11) + A6Z);
                }
            }
            int type4 = (int) this.A02;
            bw.AFJ(type4);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0355Bn
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
