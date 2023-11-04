package com.facebook.ads.redexgen.X;

import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ZW implements AnonymousClass12 {
    public static byte[] A07;
    public static String[] A08 = {"NdU3dTBV9vpPy6YybD2Qky8Xp9oiymUK", "iGXlqhzjj4re98AW13mRmUxQt0ip7heY", "i4JUsV98mtHDxTx4GI", "uX4rqc35PVKyGMlab4Ievks4AeXTKuCR", "rLO13ppjW7wMy", "YX8F9O1K3gbo5OniWABn3Un2bmHHQded", "vQnjhTu4uDmsPPd6tCmWM2PRV3nZ7tVA", "6doRqStA7fW6oocsKlayDSgQ6jqa5ScM"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C0424Er A04;
    public final /* synthetic */ AnonymousClass88 A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{57, 46, 46, 51, 46, airhockey.P_GAME_MYSCORE, 93, airhockey.P_GAME_REMATCH};
    }

    static {
        A01();
    }

    public ZW(C0424Er c0424Er, Runnable runnable, long j, AnonymousClass88 anonymousClass88) {
        this.A04 = c0424Er;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = anonymousClass88;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABn(C0967a7 c0967a7) {
        if (!this.A00) {
            this.A00 = true;
            this.A04.A05(this.A05.A03(C8C.A03), null);
        }
        if (this.A04.A06 != null) {
            this.A04.A06.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABo(C0967a7 c0967a7) {
        Map A01;
        if (c0967a7 != this.A04.A00) {
            return;
        }
        this.A04.A0E().removeCallbacks(this.A06);
        C0424Er c0424Er = this.A04;
        c0424Er.A01 = c0967a7;
        c0424Er.A06.A0F(c0967a7);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            this.A04.A05(this.A05.A03(C8C.A05), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABp(C0967a7 c0967a7) {
        if (!this.A01) {
            this.A01 = true;
            C0424Er c0424Er = this.A04;
            AnonymousClass88 anonymousClass88 = this.A05;
            C8C c8c = C8C.A04;
            String[] strArr = A08;
            if (strArr[3].charAt(16) != strArr[0].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "w5hMaJohNUScvyTMb6YchiksjKW7iU2S";
            strArr2[0] = "lwejxTPFHVjkcDrib15s3w6szJ9sWeR6";
            c0424Er.A05(anonymousClass88.A03(c8c), null);
        }
        this.A04.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass12
    public final void ABr(C0967a7 c0967a7, JA ja) {
        Map A01;
        if (c0967a7 != this.A04.A00) {
            return;
        }
        this.A04.A0E().removeCallbacks(this.A06);
        this.A04.A0M(c0967a7);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 58), String.valueOf(ja.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), String.valueOf(ja.A04()));
            this.A04.A05(this.A05.A03(C8C.A05), A01);
        }
        this.A04.AAv(ja);
    }
}
