package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class QY {
    @Nullable
    public static QE A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, 8, 85, airhockey.P_GAME_SELECTMAP, 11, 77, 77, 2, ByteCompanionObject.MAX_VALUE, 10, 123, 99, airhockey.P_GAME_REMATCH, airhockey.J_ENEMYLOSE, 8, 85, airhockey.J_NATION, 15, 86, 84, 94, 81, 8, 82, 77, airhockey.P_GAME_EXIT, 8, 111, 85, airhockey.P_GAME_REMATCH, 81, 7, 48, ByteCompanionObject.MAX_VALUE, 32, 7, 58, 38, 2, 63, 42, 33, 62, 34, airhockey.J_ENEMYWIN, 27, 33, 42, 8, 36, 58, 62, 126, 37, 26, 36, 99, 53, 30, 63, airhockey.J_BACK, airhockey.P_GAME_BREAKBALLCOUNT, 13, ByteCompanionObject.MAX_VALUE, 119, 30, 59, 10, 123, 54, 3, 12, 43, 35, 38, 123, 61, 63, 59, 54, 62, 14, 10, 44, 53, 23, 0, 42, 14, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, 64, 81, 82, airhockey.P_GAME_EXIT, 87, 78, 76, 75, airhockey.P_NATION, 5, airhockey.P_GAME_MYWIN, 64, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, 87, 64, 5, 76, 75, 76, 81, 4, airhockey.J_BACK, airhockey.J_SAVEDGAME_SAVE, airhockey.J_BACK, 96, 31, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_MYWIN, airhockey.J_SAVEDGAME_SAVE, 75, 77, airhockey.J_NATION, 79, 2, 93, airhockey.P_GAME_MYLOSE, 124, 123, 77, airhockey.P_GAME_MYWIN, 80, 124, airhockey.J_SDKVER, 28, 64, 89, 78, airhockey.J_ONREWARDED, 20, 35, 54, 62, 37, 39, 59, 54, 57, 50, 8, 58, 56, 51, 50, 8, 56, 57, 7, 12, 29, 30, 6, 27, 2, 19, 8, 61, 85, 32, 53, 9, 53, 13, 36, 94, 55, 82, 49, 49, 50, 3, 36, 23, 40, 21, 33, 47, 95, 11, 1, 54, 90, 109};
    }

    static {
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(6, 29, 2));
        A04.add(A05(168, 29, 95));
        A04.add(A05(35, 29, 116));
        A04.add(A05(64, 29, 119));
        A04.add(A05(116, 29, 17));
        A05 = new AtomicBoolean();
    }

    public static QG A00(C7N c7n) {
        return A03(true, c7n);
    }

    public static QG A01(C7N c7n) {
        return A02(true, c7n);
    }

    public static QG A02(boolean z, C7N c7n) {
        QK qk = new QK();
        QN A042 = A04(c7n);
        if (!A0B(c7n)) {
            qk.A02(A04);
            qk.A01(A03);
        }
        if (KV.A04()) {
            Map<String, String> A022 = KV.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        QI A002 = QI.A00();
        QK networkModuleConfigurationBuilder = qk.A00(A042.A09());
        return A002.A01(networkModuleConfigurationBuilder.A03(z).A04(c7n.A04().A8f()).A05(), c7n.A07(), LQ.A01());
    }

    public static QG A03(boolean z, C7N c7n) {
        return QI.A00().A01(new QK().A03(z).A00(A04(c7n).A09()).A04(c7n.A04().A8f()).A05(), c7n.A07(), LQ.A01());
    }

    public static QN A04(C7N c7n) {
        A08(c7n);
        QN qn = new QN();
        if (A0B(c7n) || KV.A04()) {
            qn.A02(360000).A04(120000);
        } else {
            qn.A02(IK.A08(c7n)).A04(IK.A0A(c7n));
        }
        qn.A03(IK.A09(c7n)).A05(IK.A0B(c7n)).A06(IK.A0C(c7n));
        synchronized (QY.class) {
            if (A00 != null && (A00 instanceof QE)) {
                qn.A07(A00);
            }
        }
        return qn;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C7N c7n) {
        if (!A05.get()) {
            c7n.A07().A9C(A05(161, 7, 81), C02627s.A20, new C02637t(A05(93, 23, 29)));
        }
    }

    public static synchronized void A09(QE qe) {
        synchronized (QY.class) {
            A00 = qe;
        }
    }

    public static boolean A0A(C7N c7n) {
        int i = Build.VERSION.SDK_INT;
        String A052 = A05(145, 16, 111);
        if (i < 17) {
            return Settings.System.getInt(c7n.getContentResolver(), A052, 0) != 0;
        }
        int i2 = Settings.Global.getInt(c7n.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i2 != 0;
    }

    public static boolean A0B(C7N c7n) {
        String A7x = c7n.A04().A7x();
        if (!TextUtils.isEmpty(A7x)) {
            String urlPrefix = A05(3, 3, 30);
            if (!A7x.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 50);
                if (A7x.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
