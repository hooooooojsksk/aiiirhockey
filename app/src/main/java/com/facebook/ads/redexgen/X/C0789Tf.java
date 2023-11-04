package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Tf */
/* loaded from: assets/audience_network.dex */
public class C0789Tf implements QH {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0531Ja A01;
    public final /* synthetic */ C0533Jd A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{99, 96, airhockey.J_ENEMYWIN, airhockey.J_ENEMYWIN, 96, 50, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, 18, 23, 31, airhockey.P_NATION, 21, airhockey.P_GAME_SELECTMAP, 21, 31, 1, 24, 4, 5, 14, 51, 40, 46, 59, 63, 34, 36, 37, airhockey.J_BACK, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_DISCONNECT, 90, 77, airhockey.P_GAME_REMATCH, 90, 77, 31, 90, 77, 77, 80, 77, 31, 80, 92, 92, airhockey.P_GAME_EXIT, 77, 77, 90, 91, 75, 125, airhockey.J_GAME_EXIT, airhockey.J_INVITE, 125, airhockey.J_GAME_EXIT, 56, airhockey.J_GAME_EXIT, 125, airhockey.J_ENEMYLOSE, airhockey.J_DISCONNECT, airhockey.J_BACK, 125, 124, 56, airhockey.J_GAME_ENEMYEXIT, 109, 123, 123, 125, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_ENEMYEXIT, 126, 109, airhockey.J_DISCONNECT, airhockey.J_DISCONNECT, airhockey.J_SDKVER, 75, airhockey.P_GAME_EXIT, airhockey.J_ENEMYWIN, 75, airhockey.P_GAME_REMATCH, 84, airhockey.P_GAME_MYLOSE, 65, 80, 65, 95, 94, airhockey.J_ERROR, airhockey.P_NATION, airhockey.P_NATION, 95, airhockey.P_NATION};
    }

    public C0789Tf(C0533Jd c0533Jd, C0531Ja c0531Ja, long j) {
        this.A02 = c0533Jd;
        this.A01 = c0531Ja;
        this.A00 = j;
    }

    private final void A02(QT qt) {
        C0887Xc c0887Xc;
        long j;
        C0887Xc c0887Xc2;
        long j2;
        C0534Je c0534Je;
        C0887Xc c0887Xc3;
        C0887Xc c0887Xc4;
        long j3;
        JZ.A06(this.A01);
        try {
            QF response = qt.A00();
            if (response != null) {
                String A5s = response.A5s();
                c0534Je = this.A02.A05;
                c0887Xc3 = this.A02.A04;
                C0536Jg serverResponse = c0534Je.A06(c0887Xc3, A5s, this.A00);
                if (serverResponse.A01() == EnumC0535Jf.A03) {
                    C0786Tb c0786Tb = (C0786Tb) serverResponse;
                    String A04 = c0786Tb.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0786Tb.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A5s = A04;
                    }
                    c0887Xc4 = this.A02.A04;
                    C0R A0E = c0887Xc4.A0E();
                    j3 = this.A02.A00;
                    A0E.A2k(LC.A01(j3), adErrorTypeFromCode.getErrorCode(), A5s, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(JA.A01(adErrorTypeFromCode, A5s));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = qt.getMessage();
            c0887Xc2 = this.A02.A04;
            C0R A0E2 = c0887Xc2.A0E();
            j2 = this.A02.A00;
            A0E2.A2k(LC.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(JA.A01(adErrorType, errorMessage));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message = qt.getMessage();
            c0887Xc = this.A02.A04;
            C0R A0E3 = c0887Xc.A0E();
            j = this.A02.A00;
            long A01 = LC.A01(j);
            int errorCode = adErrorType2.getErrorCode();
            A0E3.A2k(A01, errorCode, A00(16, 15, 65) + e.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(JA.A01(adErrorType2, message));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QH
    public final void AAZ(QF qf) {
        JO.A05(A00(79, 10, 46), A00(52, 27, 18), A00(0, 8, 90));
        if (qf != null) {
            String A5s = qf.A5s();
            JZ.A06(this.A01);
            this.A02.A0N(A5s, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QH
    public final void AAw(Exception exc) {
        C0887Xc c0887Xc;
        long j;
        JO.A05(A00(89, 7, 58), A00(31, 21, 53), A00(8, 8, 45));
        if (QT.class.equals(exc.getClass())) {
            A02((QT) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c0887Xc = this.A02.A04;
        C0R A0E = c0887Xc.A0E();
        j = this.A02.A00;
        A0E.A2k(LC.A01(j), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(JA.A01(adErrorType, errorMessage));
    }
}
