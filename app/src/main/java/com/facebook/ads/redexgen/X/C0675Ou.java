package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ou */
/* loaded from: assets/audience_network.dex */
public final class C0675Ou {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"Y0rICHp14ARSNu9MlXOQlrQKpJ7V2hwf", "9bmfgm9m8nITbmWk0ICcMAG3MrS", "cwEc0HiI6y8ZhWJ4MUGuUSsWKgKIPOUb", "CeguwAwwe", "1UN8Pz5pD", "KG5kSs2s3o8nfvSCZiVMOrQyfdZTA2DP", "BO8EwxINC4bfwl9QwPIiUjcYWt5Jq71N", "VnsxrIf3KddrD6MinhDJfsdqz9CBs5tu"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[2].charAt(4) == 'h') {
                throw new RuntimeException();
            }
            A02[5] = "V4DWKv2CalsHghC0GoFw5ZQ5aRA0odCa";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
            i4++;
        }
    }

    public static void A03() {
        A01 = new byte[]{-1, 36, 46, 43, 39, 28, 52, 8, 32, 47, 45, 36, 30, 46, -37, 36, 46, -37, 41, 48, 39, 39, -23, 9, 28, 42, 38, 44, 41, 26, 28, 42, -41, 32, 42, -41, 37, 44, 35, 35, -27, -65, -54, -43, -46, -51, -54, -35, -46, -40, -41, -119, -49, -54, -46, -43, -50, -51, -105, -34, -32, -35};
    }

    static {
        A03();
        A00 = true;
    }

    @Nullable
    public static BitmapDrawable A00(C0887Xc c0887Xc, @Nullable String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap overlayBm = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (overlayBm != null && (!A00 || A05(c0887Xc, overlayBm))) {
                BitmapDrawable overlayRepeat = new BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c0887Xc.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c0887Xc, A02(0, 23, 116));
                    }
                } else {
                    A04(c0887Xc, A02(23, 18, 112));
                }
                return overlayRepeat;
            }
            return null;
        } catch (Throwable th) {
            c0887Xc.A07().A9C(A02(59, 3, 42), C02627s.A1t, new C02637t(th));
            return null;
        }
    }

    @Nullable
    public static C0676Ov A01(C0887Xc c0887Xc, @Nullable String str) {
        BitmapDrawable A002;
        try {
            if (TextUtils.isEmpty(str) || (A002 = A00(c0887Xc, str)) == null) {
                return null;
            }
            C0676Ov overlayView = new C0676Ov(c0887Xc);
            if (Build.VERSION.SDK_INT >= 16) {
                overlayView.setBackground(A002);
            } else {
                overlayView.setBackgroundDrawable(A002);
            }
            overlayView.setClickable(false);
            overlayView.setFocusable(false);
            return overlayView;
        } catch (Throwable th) {
            c0887Xc.A07().A9C(A02(59, 3, 42), C02627s.A1t, new C02637t(th));
            return null;
        }
    }

    public static void A04(C0887Xc c0887Xc, String str) {
        c0887Xc.A07().A9C(A02(59, 3, 42), C02627s.A1t, new C02637t(str));
    }

    /* JADX WARN: Incorrect condition in loop: B:33:0x0021 */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.ads.redexgen.X.C0887Xc r5, android.graphics.Bitmap r6) {
        /*
            r3 = 0
        L1:
            int r4 = r6.getWidth()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0675Ou.A02
            r0 = 2
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0675Ou.A02
            java.lang.String r1 = "44dBdHmZhYYzc5DiIB6SXSnn6xfqMO61"
            r0 = 2
            r2[r0] = r1
            if (r3 >= r4) goto L4b
            r2 = 0
        L1d:
            int r0 = r6.getHeight()
            if (r2 >= r0) goto L48
            int r0 = r6.getPixel(r3, r2)
            int r0 = android.graphics.Color.alpha(r0)
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            r0 = 1022739087(0x3cf5c28f, float:0.03)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L45
            r2 = 41
            r1 = 18
            r0 = 34
            java.lang.String r0 = A02(r2, r1, r0)
            A04(r5, r0)
            r0 = 0
            return r0
        L45:
            int r2 = r2 + 1
            goto L1d
        L48:
            int r3 = r3 + 1
            goto L1
        L4b:
            r0 = 1
            return r0
        L4d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0675Ou.A05(com.facebook.ads.redexgen.X.Xc, android.graphics.Bitmap):boolean");
    }
}
