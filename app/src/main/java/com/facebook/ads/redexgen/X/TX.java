package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public class TX extends K1 {
    public static byte[] A01;
    public static String[] A02 = {"562InPUOhACtlwCEtN", "R5lwX4z8RDFVh5E8umVQyGbxSoVGO", "CYUCoKvLVtAS439EMb", "ChKnavF9Nqo0oetaNymcfBGaHAWTYXo2", "g5ZzVDftJQYE4wszTnHA7JY3RdMW3", "1hyLjyvULyVtl4OO", "Eld6CqAd7cnvJnvbiWS", "Re88eRXq7VTIVsZrXxwUq3yVYBRsOkYZ"};
    public final /* synthetic */ Context A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, -123, -123, airhockey.J_NATION, 126, -125, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, ByteCompanionObject.MIN_VALUE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_PURCHASE, -121, -120, 126, -124, -125};
    }

    static {
        A02();
    }

    public TX(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.K1
    public final void A06() {
        int returnMinSdkVersion;
        if (C0555Kb.A02 == EnumC0554Ka.A02) {
            return;
        }
        SharedPreferences A00 = C0541Jm.A00(this.A00);
        String A002 = A00(0, 16, 10);
        int i = A00.getInt(A002, -1);
        if (i != -1) {
            int unused = C0555Kb.A00 = i;
            C0555Kb.A02 = EnumC0554Ka.A02;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            returnMinSdkVersion = C0555Kb.A03(this.A00);
        } else {
            returnMinSdkVersion = C0555Kb.A02(this.A00);
        }
        int unused2 = C0555Kb.A00 = returnMinSdkVersion;
        int returnMinSdkVersion2 = A02[7].charAt(31);
        if (returnMinSdkVersion2 == 71) {
            throw new RuntimeException();
        }
        A02[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        A00.edit().putInt(A002, returnMinSdkVersion).commit();
        C0555Kb.A02 = EnumC0554Ka.A02;
    }
}
