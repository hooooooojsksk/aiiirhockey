package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class ZB implements AnonymousClass22 {
    public static byte[] A04;
    public static String[] A05 = {"l1o30ubgNMqwIxdsvAhdwl", "uEolzpc8zYF03u8DLAeDfs0A9wQx2vsd", "zKwy", "mFz9Za5MD8BXE4Lkxv", "Wms6Ep20", "", "s6yiLC", "izOiniaIEQHycLDhhOkzL"};
    public final ZO A00;
    public final InterfaceC01221v A01;
    public final AnonymousClass24 A02;
    public final C0887Xc A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{57, 28, 88, 23, 26, 18, 29, 27, 12, 88, 17, 11, 88, 22, 13, 20, 20, 56, 47, 52, 62, 54, 63, 37, 63, 34, 46, 40, 59, 41, 37, 49, 63, 35, 9, 13, 14, 58, 43, 38, 42, 33, 44, 42, 1, 42, 59, 56, 32, 61, 36, airhockey.J_NATION, airhockey.J_GAME_STANDBY, ByteCompanionObject.MAX_VALUE, airhockey.J_DISCONNECT, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_WAIT, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_ONREWARDED, 111, airhockey.J_INVITE, airhockey.J_DISCONNECT, 96, airhockey.J_INVITE, airhockey.J_SAVEDGAME_RELOAD, 14, 9, 19, 24, 21, 17, 24, 17, 14, 3, 2, 8, 24, 3, 18, 21, 6, 19, 14, 8, 9, 24, 12, 2, 30, 111, airhockey.J_GAME_DISCONNECT, 109, airhockey.J_ONREWARDED, 124, airhockey.J_GAME_EXIT, 109, airhockey.J_ERROR, airhockey.J_NATION, 111, airhockey.J_GAME_EXIT, airhockey.J_ENEMYWIN, airhockey.J_NATION, 119, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, 109, 124, 119, airhockey.J_GAME_EXIT, airhockey.J_INVITE, 102, 124, airhockey.J_ENEMYLOSE, 102, airhockey.J_PURCHASE, 59, 19, 5, 5, 23, 17, 19, 76, 86, 96, airhockey.P_GAME_SELECTMAP, 94, 94, airhockey.P_GAME_SELECTMAP, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, 13, 79, 88, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_REMATCH, 65, airhockey.P_GAME_MYLOSE, 13, 75, airhockey.P_NATION, 95, 13, 64, airhockey.P_GAME_MYLOSE, 94, 94, 76, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYLOSE, 8, 44, 54, 54, 44, 43, 34, airhockey.J_GAME_STANDBY, 39, 48, 43, 33, 41, 32, airhockey.J_GAME_STANDBY, 35, 42, 55, airhockey.J_GAME_STANDBY, 40, 32, 54, 54, 36, 34, 32, airhockey.J_GAME_ENEMYEXIT, 90, 93, 91, 86, 76, 91, 91, airhockey.P_GAME_BREAKBALLCOUNT, 91, 86, airhockey.P_GAME_SELECTMAP, 76, 90, 90, airhockey.P_GAME_MYLOSE, 78, 76, 86, airhockey.P_NATION, 76, 80, 5, 20, 13};
        String[] strArr = A05;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[1] = "11z8nLjTbJ8kXGgkHyQ0qsLYj80GB6ec";
        strArr2[2] = "E5wc";
    }

    static {
        A01();
    }

    public ZB(C0887Xc c0887Xc, AnonymousClass24 anonymousClass24, InterfaceC01221v interfaceC01221v, ZO zo) {
        this.A03 = c0887Xc;
        this.A02 = anonymousClass24;
        this.A01 = interfaceC01221v;
        this.A00 = zo;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass22
    public final void A8D(Message message) {
        com.facebook.ads.Ad A00 = this.A02.A00();
        String A002 = A00(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 3, 16);
        if (A00 == null) {
            this.A03.A07().A9C(A002, C02627s.A0K, new C02637t(A00(0, 17, 12)));
            return;
        }
        int i = message.what;
        String A003 = A00(120, 9, 2);
        String A004 = A00(17, 17, 14);
        if (i != 10) {
            if (i == 2100) {
                this.A01.AEz();
                Bundle bundle = message.getData().getBundle(A004);
                if (bundle != null) {
                    this.A02.A01 = bundle.getLong(A00(94, 26, 87));
                    this.A02.A00 = bundle.getInt(A00(69, 25, 51));
                } else {
                    InterfaceC02617r A07 = this.A03.A07();
                    int i2 = C02627s.A0V;
                    A07.A9C(A002, i2, new C02637t(A00(129, 26, 89), A003 + message));
                }
                this.A02.A01(null);
            } else if (i != 2103) {
                if (i == 2106) {
                    this.A02.A01(null);
                } else if (i == 2110) {
                    this.A01.AF9();
                } else if (i != 2010) {
                    String[] strArr = A05;
                    if (strArr[6].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A05;
                    strArr2[6] = "eimvHB";
                    strArr2[7] = "9nAYjps8XJWkdVKe7ORqJ";
                }
            }
            if (this.A02.A04 == null) {
                return;
            }
            int i3 = message.what;
            if (i3 == 2100) {
                this.A02.A04.onAdLoaded(A00);
                return;
            } else if (i3 != 2110) {
                switch (i3) {
                    case 2104:
                        this.A02.A04.onAdClicked(A00);
                        return;
                    case 2105:
                        this.A02.A04.onLoggingImpression(A00);
                        return;
                    case 2106:
                        if (this.A02.A04 instanceof RewardedVideoAdExtendedListener) {
                            ((RewardedVideoAdExtendedListener) this.A02.A04).onRewardedVideoActivityDestroyed();
                            return;
                        }
                        return;
                    default:
                        switch (i3) {
                            case 3000:
                                this.A02.A04.onRewardedVideoCompleted();
                                return;
                            case 3001:
                                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerSuccess();
                                    return;
                                }
                                return;
                            case 3002:
                                if (this.A02.A04 instanceof S2SRewardedVideoAdListener) {
                                    ((S2SRewardedVideoAdListener) this.A02.A04).onRewardServerFailed();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                }
            } else {
                this.A02.A04.onRewardedVideoClosed();
                return;
            }
        }
        Bundle bundle2 = message.getData().getBundle(A004);
        if (bundle2 != null) {
            int i4 = bundle2.getInt(A00(51, 18, 95));
            String errorMessage = bundle2.getString(A00(182, 21, 125));
            AdError adError = new AdError(i4, errorMessage);
            this.A01.AEv(adError);
            if (this.A02.A04 != null) {
                this.A02.A04.onError(A00, adError);
            } else {
                Log.e(A00(34, 17, 59), errorMessage);
            }
        } else {
            this.A01.AEr(EnumC01211u.A05);
            InterfaceC02617r A072 = this.A03.A07();
            int i5 = C02627s.A0V;
            A072.A9C(A002, i5, new C02637t(A00(155, 27, 49), A003 + message));
        }
        AnonymousClass24 anonymousClass24 = this.A02;
        String[] strArr3 = A05;
        String str = strArr3[1];
        String str2 = strArr3[2];
        int errorCode = str.length();
        if (errorCode != str2.length()) {
            String[] strArr4 = A05;
            strArr4[3] = "9bbWCvtTNy4UVYSvKE";
            strArr4[4] = "MUJHaNV8";
            anonymousClass24.A01(null);
            return;
        }
        String[] strArr5 = A05;
        strArr5[6] = "1K6GDc";
        strArr5[7] = "I0Fko4DemMWRrizY9fBW0";
        anonymousClass24.A01(null);
    }
}
