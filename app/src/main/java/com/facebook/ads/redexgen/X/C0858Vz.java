package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.loopj.android.http.AsyncHttpClient;
import com.mobirix.airhockey.airhockey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Vz */
/* loaded from: assets/audience_network.dex */
public final class C0858Vz extends CR {
    public static byte[] A01;
    public static String[] A02 = {"sf1snlIsJ6W0T2FnClxHrZdECoWprGfm", "N", "", "r2HEyqcTBk5ynLpIwHNeKGT5pvsr0hUz", "VJBF4MChRorpvGWaO0TH3IkbIinT6ci", "gVX", "V2gxFGplaBAwDTpDKBzIrO8nmlXbG3Ru", "XRqJkaMKHgiwUJro7qWKl9bCL3sckU6K"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{42, 21, 16, 22, 79, 91, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYWIN, 65, 1, 65, 94, 91, 93};
    }

    static {
        A02();
        A03 = C0499Hs.A08(A01(0, 4, 111));
        A04 = new byte[]{79, airhockey.J_GOO, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.P_GAME_MYLOSE, airhockey.J_GAME_STANDBY, airhockey.J_SDKVER, airhockey.J_ONREWARDED};
    }

    private long A00(byte[] bArr) {
        int i;
        int frames;
        int i2 = bArr[0] & UByte.MAX_VALUE;
        int i3 = i2 & 3;
        if (i3 == 0) {
            i = 1;
        } else if (i3 != 1 && i3 != 2) {
            byte b = bArr[1];
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            A02[5] = "Fg3";
            i = b & 63;
        } else {
            i = 2;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        if (i4 >= 16) {
            frames = 2500 << i5;
        } else {
            int frames2 = A02[2].length();
            if (frames2 == 12) {
                throw new RuntimeException();
            }
            A02[2] = "pnsJXiCpejNcXc3iNsNdzofu9hZ";
            if (i4 >= 12) {
                int toc = i5 & 1;
                frames = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << toc;
            } else if (i5 == 3) {
                frames = 60000;
            } else {
                frames = AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT << i5;
            }
        }
        return i * frames;
    }

    private void A03(List<byte[]> initializationData, int i) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }

    public static boolean A04(C0483Hc c0483Hc) {
        int A042 = c0483Hc.A04();
        byte[] bArr = A04;
        if (A042 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c0483Hc.A0c(bArr2, 0, bArr.length);
        byte[] header = A04;
        return Arrays.equals(bArr2, header);
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final long A07(C0483Hc c0483Hc) {
        return A04(A00(c0483Hc.A00));
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final boolean A0A(C0483Hc c0483Hc, long j, CQ cq) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(c0483Hc.A00, c0483Hc.A07());
            int i = copyOf[9] & UByte.MAX_VALUE;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, ((copyOf[11] & UByte.MAX_VALUE) << 8) | (copyOf[10] & UByte.MAX_VALUE));
            A03(arrayList, 3840);
            cq.A00 = Format.A07(null, A01(4, 10, 36), null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z = c0483Hc.A08() == A03;
        c0483Hc.A0Y(0);
        return z;
    }
}
