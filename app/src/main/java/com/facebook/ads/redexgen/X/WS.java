package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.gms.games.GamesStatusCodes;
import com.mobirix.airhockey.airhockey;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WS implements BV {
    public static byte[] A07;
    public static String[] A08 = {"ovn62aUcwqSIvWTqoELg4J4D8wHkUDmq", "Ycr5XQrqBi4bqXq", "xp8qJzBZ1bRZYruPJEcRAHgYPTR5RYjX", "i3q4o3QoTWkNmhcyfYOgrV6edePVNuRX", "3foLzBlJQPuSe9je9cnopJfCpNuQ", "jIofLs5qujimwrYxWQlB52zkZNTbvGhY", "Oin2hfMzoDcJa9P29jyigMxfd8hffyV", "DiUz7SyfwAQ"};
    public static final BY A09;
    public static final int A0A;
    public static final byte[] A0B;
    public static final byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0351Bh A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 104);
            String[] strArr = A08;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A08[7] = "o17bMTHd2bo";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {-89, -19, -7, -24, -12, -20, -89, -5, 0, -9, -20, -89, -65, -67, -35, -23, -18, -90, -17, -19, 13, 25, 30, -7, 35, 14, -42, 14, 58, 64, 55, 47, -21, 57, 58, 63, -21, 49, 52, 57, 47, -21, 12, 24, 29, -21, 51, 48, 44, 47, 48, 61, -7, 37, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, 65, airhockey.P_GAME_MYSCORE, 61, airhockey.P_GAME_MYLOSE, -4, 29, 41, 46, -4, 36, airhockey.P_GAME_REMATCH, 81, 60, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, 63, -5, 75, 60, 63, 63, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_REMATCH, airhockey.P_NATION, -5, 61, airhockey.P_GAME_SELECTMAP, 79, 78, -5, 65, airhockey.P_GAME_EXIT, 77, -5, 65, 77, 60, airhockey.P_GAME_MYLOSE, 64, -5, airhockey.P_GAME_MYSCORE, 64, 60, 63, 64, 77, -5, -53, -65, -34, -55, airhockey.P_GAME_MYSCORE, 87, airhockey.P_GAME_BREAKBALLCOUNT, 75, 81, 17, 21, airhockey.P_GAME_REMATCH, 82, 82, -3, 17, 0, 5, 11, -53, -3, 9, 14, -55, 19, -2};
        if (A08[6].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "iWdi7SFZoODeZbEJMl3L6ntPbKeDMNvO";
        strArr[2] = "0wFRuzGYIju4XbKNAoPYNxHAh615x32s";
        A07 = bArr;
    }

    static {
        A05();
        A09 = new WT();
        A0D = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0E = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0B = C0499Hs.A0i(A03(12, 6, 52));
        A0C = C0499Hs.A0i(A03(18, 9, 100));
        A0A = A0E[8];
    }

    private int A00(int i) throws C9Y {
        String A03;
        if (!A07(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A03(53, 12, 116));
            if (!this.A05) {
                A03 = A03(103, 2, 21);
            } else if (A08[6].length() == 31) {
                A08[7] = "wEjTIiVmShi";
                A03 = A03(105, 2, 31);
            }
            sb.append(A03);
            sb.append(A03(0, 12, 31));
            sb.append(i);
            throw new C9Y(sb.toString());
        } else if (this.A05) {
            return A0E[i];
        } else {
            int[] iArr = A0D;
            if (A08[6].length() == 31) {
                String[] strArr = A08;
                strArr[4] = "W5GqdpRCUv4UTAd2FZcqfYNQbOUH";
                strArr[1] = "vSYrWd8JkI4l23w";
                return iArr[i];
            }
        }
        throw new RuntimeException();
    }

    private int A01(BW bw) throws IOException, InterruptedException {
        bw.AES();
        bw.ADP(this.A06, 0, 1);
        byte b = this.A06[0];
        if ((b & 131) <= 0) {
            return A00((b >> 3) & 15);
        }
        throw new C9Y(A03(65, 38, 115) + ((int) b));
    }

    private int A02(BW bw) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            try {
                this.A01 = A01(bw);
                this.A00 = this.A01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int AEW = this.A03.AEW(bw, this.A00, true);
        if (AEW == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AEW;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A03.AEY(this.A02, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            this.A03.A5X(Format.A06(null, this.A05 ? A03(117, 12, 52) : A03(107, 10, 122), null, -1, A0A, 1, this.A05 ? 16000 : GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i) {
        return !this.A05 && (i < 12 || i > 14);
    }

    private boolean A07(int i) {
        return i >= 0 && i <= 15 && (A08(i) || A06(i));
    }

    private boolean A08(int i) {
        if (this.A05) {
            if (i >= 10) {
                if (A08[6].length() != 31) {
                    throw new RuntimeException();
                }
                A08[5] = "qMGeUOCLNxoOBJxwE1u31s5i7NTepy4l";
                if (i > 13) {
                }
            }
            return true;
        }
        return false;
    }

    private boolean A09(BW bw) throws IOException, InterruptedException {
        if (A0A(bw, A0B)) {
            this.A05 = false;
            bw.AFJ(A0B.length);
            return true;
        } else if (A0A(bw, A0C)) {
            this.A05 = true;
            bw.AFJ(A0C.length);
            return true;
        } else {
            return false;
        }
    }

    private boolean A0A(BW bw, byte[] bArr) throws IOException, InterruptedException {
        bw.AES();
        byte[] bArr2 = new byte[bArr.length];
        bw.ADP(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void A8V(BX bx) {
        bx.AEd(new WU(-9223372036854775807L));
        this.A03 = bx.AFc(0, 1);
        bx.A5G();
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final int ADp(BW bw, C0346Bc c0346Bc) throws IOException, InterruptedException {
        if (bw.A7P() != 0 || A09(bw)) {
            A04();
            return A02(bw);
        }
        throw new C9Y(A03(27, 26, 99));
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final void AEc(long j, long j2) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BV
    public final boolean AFL(BW bw) throws IOException, InterruptedException {
        return A09(bw);
    }
}
