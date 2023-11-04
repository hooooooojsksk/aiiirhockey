package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class PB {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final C0887Xc A00;
    public final InterfaceC0505Ia A01;
    public final RA A02;
    public final RT A06;
    public final String A07;
    @Nullable
    public final Map<String, String> A08;
    public final AbstractC0663Oi A04 = new AbstractC0663Oi() { // from class: com.facebook.ads.redexgen.X.7C
        public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8V
        /* renamed from: A00 */
        public final void A03(AnonymousClass71 anonymousClass71) {
            String str;
            RT rt;
            str = PB.this.A07;
            RU ru = new RU(str, anonymousClass71.A03(), anonymousClass71.A01(), anonymousClass71.A02());
            if (anonymousClass71.A00() >= 0.05d) {
                ru.A05(anonymousClass71.A01());
            }
            rt = PB.this.A06;
            rt.A0C(ru);
            String[] strArr = A01;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
            strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
        }
    };
    public final NY A05 = new NY() { // from class: com.facebook.ads.redexgen.X.7B
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8V
        /* renamed from: A00 */
        public final void A03(C02466z c02466z) {
            PB.this.A09();
        }
    };
    public final PO A03 = new PO() { // from class: com.facebook.ads.redexgen.X.79
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C8V
        /* renamed from: A00 */
        public final void A03(AnonymousClass72 anonymousClass72) {
            PB.this.A09();
        }
    };

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public PB(C0887Xc c0887Xc, InterfaceC0505Ia interfaceC0505Ia, RA ra, String str, @Nullable Map<String, String> extraParams) {
        this.A00 = c0887Xc;
        this.A01 = interfaceC0505Ia;
        this.A07 = str;
        this.A08 = extraParams;
        this.A02 = ra;
        this.A06 = new RT(this.A07);
        this.A02.getEventBus().A03(this.A04, this.A05, this.A03);
    }

    private Map<String, String> A07(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A08;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A05(0, 6, 56), str);
        return hashMap;
    }

    public final void A09() {
        String A04 = RT.A04(this.A06.A0B());
        if (A04 != null) {
            InterfaceC0505Ia interfaceC0505Ia = this.A01;
            if (A0A[4].length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            String encodedFrameData = this.A07;
            interfaceC0505Ia.A9U(encodedFrameData, A07(A04));
        }
    }

    public final void A0A() {
        RF rf = new RF(this);
        if (this.A02.A0l()) {
            LF.A00(rf);
        } else {
            this.A02.getStateHandler().post(rf);
        }
    }
}
