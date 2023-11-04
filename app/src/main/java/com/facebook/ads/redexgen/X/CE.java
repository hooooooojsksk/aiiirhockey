package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class CE {
    public static byte[] A00;
    public static String[] A01 = {"vniJFRP", "oJtPNZwcQG6hLH64wW6tXvk3sbQ9WwGW", "zry57w6QfhfaFpFxdZgKHC1xYn", "fo4QeY", "i9CLNlynjhorIFu8zs9NEh7lWGRKe1E6", "M5SbcVIJ6zX6bTvbAFwxovtl6mtBjy6T", "O1VKgn8XNf4GQEXWcT9RCCs6YBao3Pp0", "jcDd8FEzgCzhSc3FOh8Nko0kxmmUpCTh"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-28, 7, 7, -4, -43, 8, 3, 1, -23, 8, -3, 0, -85, -60, -55, -53, -58, -58, -59, -56, -54, -69, -70, airhockey.J_REWARD, -58, -55, -55, -66, airhockey.J_REWARD, -52, -69, -56, -55, -65, -59, -60, -112, airhockey.J_REWARD};
    }

    static {
        A04();
    }

    public static int A00(byte[] bArr) {
        int i;
        CD parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            i = parsedAtom.A00;
            return i;
        } else if (A01[0].length() != 21) {
            String[] strArr = A01;
            strArr[3] = "fw1Vu3";
            strArr[2] = "Fgm9cv2CAdprrHHvAJvClRGcka";
            return -1;
        } else {
            throw new RuntimeException();
        }
    }

    @Nullable
    public static CD A01(byte[] bArr) {
        C0483Hc c0483Hc = new C0483Hc(bArr);
        if (c0483Hc.A07() < 32) {
            return null;
        }
        c0483Hc.A0Y(0);
        if (c0483Hc.A08() == c0483Hc.A04() + 4 && c0483Hc.A08() == AbstractC0360Bw.A0s) {
            int dataSize = AbstractC0360Bw.A01(c0483Hc.A08());
            if (dataSize > 1) {
                Log.w(A02(0, 12, 98), A02(12, 26, 36) + dataSize);
                return null;
            }
            UUID uuid = new UUID(c0483Hc.A0L(), c0483Hc.A0L());
            if (dataSize == 1) {
                int atomType = c0483Hc.A0H() * 16;
                if (A01[0].length() == 21) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[3] = "thpi9L";
                strArr[2] = "TMAT5NZ1bWTkNSNpNaLonMSfAF";
                c0483Hc.A0Z(atomType);
            }
            int A0H = c0483Hc.A0H();
            if (A0H != c0483Hc.A04()) {
                return null;
            }
            byte[] bArr2 = new byte[A0H];
            c0483Hc.A0c(bArr2, 0, A0H);
            return new CD(uuid, dataSize, bArr2);
        }
        return null;
    }

    @Nullable
    public static UUID A03(byte[] bArr) {
        UUID uuid;
        CD parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}
