package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Bu */
/* loaded from: assets/audience_network.dex */
public final class C0359Bu {
    public static byte[] A03;
    public static String[] A04 = {"jNGyeOKibO3rZ", "Gh5JKt6GRlqFQi5f7wncYkOvXKUgvq3H", "CofAGDTz318WCwUORyk9cSrFfeh2Hkrj", "9nnBa0OOqYKGA4mW7JXlquoRY2XdVC9l", "SGv5o9U73t5KHQiabCNHP6atzf1gi70l", "Pw4XIo5raqSVixY1hwfj9nDYbuGZRESR", "ADqcQvt0hpjLC586x1ggUJbhpZ3DSlma", "N1vQLbUqrUUUOY9UOZX86MfJnRzuBUgh"};
    public static final long[] A05;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
                break;
            }
            A04[3] = "ZERhDI0eRTm5worZScrGBygyYS9gFskv";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
            String[] strArr2 = A04;
            if (strArr2[4].charAt(6) != strArr2[7].charAt(6)) {
                break;
            }
            String[] strArr3 = A04;
            strArr3[6] = "5jMkCIwJgzdMCgzRGNs7rdJ4OYAUyBry";
            strArr3[2] = "xyMLmlHhB2f8Cz8kVUOrh9ZTHBCB3Rr0";
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A03() {
        A03 = new byte[]{64, airhockey.J_SDKVER, 46, airhockey.J_ACHIEVEMENTCALLBACK, 111, airhockey.J_NATION, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, 46, airhockey.J_ACHIEVEMENTCALLBACK, 111, 124, airhockey.J_ENEMYWIN, 96, airhockey.J_PURCHASE, 46, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_GAME_REMATCH, airhockey.J_PURCHASE, 102, 46, 99, 111, 125, airhockey.J_GAME_STANDBY, 46, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 123, 96, airhockey.J_GAME_EXIT};
    }

    static {
        A03();
        A05 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = A05;
            int varIntLength = jArr.length;
            if (i2 >= varIntLength) {
                return -1;
            }
            int varIntLength2 = ((jArr[i2] & i) > 0L ? 1 : ((jArr[i2] & i) == 0L ? 0 : -1));
            if (varIntLength2 != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public static long A01(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            long j2 = A05[i - 1];
            String[] strArr = A04;
            if (strArr[5].charAt(17) != strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            A04[0] = "UDmiDfZ1LL8gM";
            j &= j2 ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            long j3 = j << 8;
            byte b = bArr[i2];
            if (A04[3].charAt(15) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "cm8OQheSofC6CbyPg1WnuKrHLhcydwvw";
            strArr2[2] = "ayPMvBCy6e1LCFJPDiyGHhHMjUGacyfS";
            long varint = b;
            j = j3 | (varint & 255);
        }
        return j;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(BW bw, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            if (!bw.ADu(this.A02, 0, 1, z)) {
                return -1L;
            }
            int firstByte = this.A02[0] & UByte.MAX_VALUE;
            this.A00 = A00(firstByte);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException(A02(0, 33, 67));
            }
        }
        int i2 = this.A00;
        if (i2 > i) {
            this.A01 = 0;
            return -2L;
        }
        if (i2 != 1) {
            bw.readFully(this.A02, 1, i2 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z2);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
