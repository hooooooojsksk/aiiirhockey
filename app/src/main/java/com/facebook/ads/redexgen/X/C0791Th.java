package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Th */
/* loaded from: assets/audience_network.dex */
public class C0791Th extends K1 {
    public static byte[] A02;
    public static String[] A03 = {"jAsZfZwQ15YE1xm95Uum6vWOaDH1Az8A", "fi77qJmjg5Rwb", "EORDPJJatEjTyV", "9q4WoxWSHvvys", "ZnqFv4LDFQ916SUcrxzb43hFVVFJOLFp", "nu1Fhr1q5Uq1RKDrD4GP42DLl0Uj", "wJhiR1cxoop1phUk5wYOXEGX7ooerIC3", "cvoiCCK"};
    public final /* synthetic */ C0531Ja A00;
    public final /* synthetic */ C0533Jd A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYWIN, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYSCORE, 84, 89, 77, airhockey.P_GAME_MYSCORE, 95, airhockey.J_GAME_STANDBY, airhockey.P_GAME_SELECTMAP, 11, airhockey.P_GAME_STANDBY, 78, 95, 92, airhockey.P_GAME_SELECTMAP, 89, 64, 11, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY, airhockey.P_GAME_STANDBY, 78, airhockey.P_GAME_MYLOSE, 95, airhockey.P_NATION, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_STANDBY};
    }

    static {
        A02();
    }

    public C0791Th(C0533Jd c0533Jd, C0531Ja c0531Ja) {
        this.A01 = c0533Jd;
        this.A00 = c0531Ja;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        C0887Xc c0887Xc;
        C0887Xc c0887Xc2;
        C0887Xc c0887Xc3;
        C0887Xc c0887Xc4;
        C0887Xc c0887Xc5;
        long j;
        C0887Xc c0887Xc6;
        String str;
        Map<String, String> adRequestParameters;
        QH A032;
        C0887Xc c0887Xc7;
        C0887Xc c0887Xc8;
        C0887Xc c0887Xc9;
        C0887Xc c0887Xc10;
        long j2;
        c0887Xc = this.A01.A04;
        if (LA.A00(c0887Xc) != L9.A07) {
            c0887Xc2 = this.A01.A04;
            AnonymousClass81.A08(c0887Xc2);
            c0887Xc3 = this.A01.A04;
            C02265y.A07(c0887Xc3);
            C0531Ja c0531Ja = this.A00;
            C8N A00 = C8N.A00();
            c0887Xc4 = this.A01.A04;
            boolean z = true;
            Map<String, String> A08 = c0531Ja.A08(A00.A01(c0887Xc4, true).A6d());
            this.A01.A02 = A08;
            try {
                c0887Xc7 = this.A01.A04;
                PackageManager packageManager = c0887Xc7.getPackageManager();
                if (packageManager != null) {
                    String A002 = A00(1, 12, 113);
                    StringBuilder sb = new StringBuilder();
                    c0887Xc8 = this.A01.A04;
                    sb.append(c0887Xc8.getPackageName());
                    sb.append(A00(0, 1, 93));
                    c0887Xc9 = this.A01.A04;
                    sb.append(packageManager.getInstallerPackageName(c0887Xc9.getPackageName()));
                    A08.put(A002, new String(Base64.encode(sb.toString().getBytes(), 2)));
                }
            } catch (Exception unused) {
            }
            try {
                if (this.A00.A05() != JF.A03 && this.A00.A05() != JF.A05 && this.A00.A05() != JF.A04 && this.A00.A05() != null) {
                    z = false;
                }
                c0887Xc6 = this.A01.A04;
                QG A022 = QY.A02(z, c0887Xc6);
                str = this.A01.A06;
                QU qu = new QU();
                adRequestParameters = this.A01.A02;
                byte[] A082 = qu.A05(adRequestParameters).A08();
                A032 = this.A01.A03(LC.A00(), this.A00);
                A022.ADU(str, A082, A032);
                return;
            } catch (Exception e) {
                AdErrorType adRequestFailed = AdErrorType.AD_REQUEST_FAILED;
                String message = e.getMessage();
                c0887Xc5 = this.A01.A04;
                C0R A0E = c0887Xc5.A0E();
                if (A03[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[3] = "KP51TgwZ8p9oo";
                strArr[2] = "i0Q8y5VFLDaPT7";
                j = this.A01.A00;
                A0E.A2k(LC.A01(j), adRequestFailed.getErrorCode(), message, adRequestFailed.isPublicError());
                this.A01.A0D(JA.A01(adRequestFailed, message));
                return;
            }
        }
        this.A01.A09();
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = A00(13, 21, 92);
        c0887Xc10 = this.A01.A04;
        C0R A0E2 = c0887Xc10.A0E();
        j2 = this.A01.A00;
        A0E2.A2k(LC.A01(j2), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A01.A0D(new JA(adErrorType, errorMessage));
    }
}
