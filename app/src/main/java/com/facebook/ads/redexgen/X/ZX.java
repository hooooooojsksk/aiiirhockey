package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ZX extends K1 {
    public static byte[] A05;
    public static String[] A06 = {"Gpv8eHHTEOtePQmo1OD6muRo415gTvmp", "m8VLVbL9uinkegCEMoYL3DBV4Qd", "9DesmfPYImwpHbFMCkN8D4N2A0eEtTnA", "p6qK7niiHhY9MGJ6cPP69YBKuDETC8Y4", "5iURk91XNbuPvrJWt8OL2zSUhjl2Moa0", "44pBDqZwGccZEwpE1ClPCXXxeIB", "3LUdHIp1lrC6CN8jsqyi77AXm4NZ0z", "iLxtTrJV"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0967a7 A01;
    public final /* synthetic */ C01171q A02;
    public final /* synthetic */ C0424Er A03;
    public final /* synthetic */ AnonymousClass88 A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A06[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
            i4++;
        }
    }

    public static void A02() {
        A05 = new byte[]{33, 61, 19, 54, 51, 34, 38, 55, 32, airhockey.J_SAVEDGAME_RELOAD, 38, 59, 63, 55, 61, 39, 38, 124, 90, 77, 77, 80, 77, 36, 58, 46, 119, airhockey.J_GAME_EXIT, airhockey.J_INVITE, 102, airhockey.J_GAME_DISCONNECT, airhockey.J_REWARD, 119};
        if (A06[4].charAt(21) == 'x') {
            throw new RuntimeException();
        }
        A06[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
    }

    static {
        A02();
    }

    public ZX(C0424Er c0424Er, C01171q c01171q, C0967a7 c0967a7, long j, AnonymousClass88 anonymousClass88) {
        this.A03 = c0424Er;
        this.A02 = c01171q;
        this.A01 = c0967a7;
        this.A00 = j;
        this.A04 = anonymousClass88;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        Map A01;
        this.A03.A0P(this.A02);
        this.A03.A0M(this.A01);
        A01 = this.A03.A01(this.A00);
        A01.put(A00(18, 5, 13), A00(0, 2, 62));
        A01.put(A00(23, 3, 123), A00(26, 7, 49));
        this.A03.A05(this.A04.A03(C8C.A05), A01);
        this.A03.AAv(new JA(AdErrorType.NETWORK_ERROR, A00(2, 16, 96)));
    }
}
