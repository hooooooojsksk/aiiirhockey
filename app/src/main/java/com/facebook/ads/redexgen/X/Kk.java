package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Kk {
    public static byte[] A00;
    public static String[] A01 = {"r58", "tPr1p", "f5lIxAtAKiBQqbeb00DIw30sTyOB6Nip", "UA77sayfFIN4rDJ1yzqar5h", "qcYJgrhXwK3F7gc49b8OJRulLZ0tc", "aw", "BC", "ZwT7VrzK7C4B3AE5wUb8SA17JwCvGXhw"};
    public static final float A02;
    public static final DisplayMetrics A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[2].charAt(25) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
            i4++;
        }
    }

    public static void A02() {
        if (A01[0].length() == 18) {
            throw new RuntimeException();
        }
        A01[0] = "y1BiGtkR2PGy";
        A00 = new byte[]{75, 61, airhockey.P_NATION, 56, airhockey.P_GAME_MYSCORE, 75};
    }

    static {
        A02();
        A03 = Resources.getSystem().getDisplayMetrics();
        A02 = A03.density;
    }

    public static int A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(A01(0, 6, 87));
        if (windowManager == null) {
            return 13;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (A01[3].length() != 18) {
            A01[2] = "2bhCmdFfmb6UvowfNGVxOCNiLCVaOJfv";
            int orientation = defaultDisplay.getOrientation();
            if (orientation != 0) {
                if (orientation != 1) {
                    if (orientation != 2) {
                        if (orientation != 3) {
                            return 13;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 0;
            }
            return 1;
        }
        throw new RuntimeException();
    }
}
