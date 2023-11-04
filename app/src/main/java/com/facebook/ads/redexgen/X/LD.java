package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class LD {
    public static byte[] A0I;
    public static String[] A0J = {"UAfRYX1IJYK1F4gMurnkVir00q2Lzr", "W9rWnfjKrefpB8hDj8decpkzvyqzW", "KuE77vVQtzCska5bvEw0ie6MMkaH2LqI", "aCUXypAv16RVdaAbRrmoDPgF0pJQTLdN", "UhONC0e0tLrj", "Xpoa", "YCNHKjVOQFwEe4MjzAzWrTTEWfFYaS", "tXFOakpgFhvHBQhEUyJ4FZAKQx0U"};
    public static final String A0K;
    @Nullable
    public View A0F;
    @Nullable
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-48, -60, -124, airhockey.J_ACHIEVEMENTCALLBACK, -69, -60, -63, -69, -61, -65, -51, -71, -54, -68, -84, -63, -59, -67, -110, airhockey.J_ACHIEVEMENTCALLBACK, -8, -5, -25, 6, 10, 0, 11, 0, 6, 5, -17, -16, -13, -33, -2, 2, -8, 3, -8, -2, -3, -24, -79, -70, -73, -79, -71, -110, -77, -70, -81, -57, -94, -73, -69, -77, 5, 14, 11, 5, 13, -6, -4, 5, 2, -4, 4, -14, -88, -79, -82, -88, -80, -86, -87, -101, -82, -86, -68, -103, -90, -84, -69, -60, -70, -86, -65, -61, -69, -16, -7, -17, -29, -94, -85, -95, -106, -97, -88, -85, -100, -98, -91, -94, -90, -92, -91, -79, 10, 20, -28, 13, 10, 4, 12, -24, 22, 2, 19, 5, -26, 15, 2, 3, 13, 6, 5, -37, -63, -20, -37, -34, -29, -17, -19, -46, 20, 3, 6, 11, 23, 21, -5, -53, -66, -68, -56, -53, -67, -62, -57, -64, airhockey.J_WAIT, -62, -58, -55, -53, -66, -52, -52, -62, -56, -57, -109, airhockey.J_WAIT, -59, -58, -77, -60, -58, -90, -69, -65, -73, -52, -51, -70, -53, -51, -79, 7, 8, -11, 6, 8, -19, 4, -10, -15, 1, -11};
        if (A0J[6].length() == 24) {
            throw new RuntimeException();
        }
        A0J[5] = "KWAi";
        A0I = bArr;
    }

    static {
        A02();
        A0K = LD.class.getSimpleName();
    }

    private EnumC0567Kp A00() {
        View view;
        View view2 = this.A0G;
        if (view2 == null || (view = this.A0F) == null) {
            return EnumC0567Kp.A0I;
        }
        if (view2 != view) {
            return EnumC0567Kp.A0G;
        }
        if (Build.VERSION.SDK_INT < 4) {
            return EnumC0567Kp.A0F;
        }
        Object tag = this.A0G.getTag(EnumC0567Kp.A02);
        if (tag == null) {
            return EnumC0567Kp.A0H;
        }
        if (!(tag instanceof EnumC0567Kp)) {
            return EnumC0567Kp.A0J;
        }
        return (EnumC0567Kp) tag;
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        if (A0J[6].length() != 24) {
            A0J[5] = "dmN9";
            return -1L;
        }
        throw new RuntimeException();
    }

    public final Map<String, String> A04() {
        long clickDelayMs;
        if (!this.A0H) {
            return null;
        }
        String valueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        long j = this.A0C;
        if (j > 0) {
            long j2 = this.A0D;
            if (j2 > j) {
                clickDelayMs = j2 - j;
                HashMap hashMap = new HashMap();
                String valueOf2 = String.valueOf(this.A04);
                String radius = A01(20, 11, 106);
                hashMap.put(radius, valueOf2);
                String valueOf3 = String.valueOf(this.A05);
                String radius2 = A01(31, 11, 98);
                hashMap.put(radius2, valueOf3);
                String valueOf4 = String.valueOf(this.A06);
                String radius3 = A01(186, 5, 96);
                hashMap.put(radius3, valueOf4);
                String valueOf5 = String.valueOf(this.A03);
                String radius4 = A01(102, 6, 16);
                hashMap.put(radius4, valueOf5);
                String valueOf6 = String.valueOf(clickDelayMs);
                String radius5 = A01(42, 14, 33);
                hashMap.put(radius5, valueOf6);
                String valueOf7 = String.valueOf(this.A0E);
                String radius6 = A01(165, 9, 37);
                hashMap.put(radius6, valueOf7);
                String valueOf8 = String.valueOf(this.A0D);
                String radius7 = A01(82, 7, 41);
                hashMap.put(radius7, valueOf8);
                String valueOf9 = String.valueOf(this.A0A);
                String radius8 = A01(174, 6, 44);
                hashMap.put(radius8, valueOf9);
                String valueOf10 = String.valueOf(this.A0B);
                String radius9 = A01(180, 6, 103);
                hashMap.put(radius9, valueOf10);
                String valueOf11 = String.valueOf(this.A07);
                String radius10 = A01(56, 6, 117);
                hashMap.put(radius10, valueOf11);
                String valueOf12 = String.valueOf(this.A08);
                String radius11 = A01(62, 6, 108);
                hashMap.put(radius11, valueOf12);
                String valueOf13 = String.valueOf(this.A07);
                String radius12 = A01(89, 4, 94);
                hashMap.put(radius12, valueOf13);
                String valueOf14 = String.valueOf(this.A08);
                String radius13 = A01(93, 4, 16);
                hashMap.put(radius13, valueOf14);
                String valueOf15 = String.valueOf(this.A00);
                String radius14 = A01(97, 5, 12);
                hashMap.put(radius14, valueOf15);
                String radius15 = A01(129, 7, 77);
                hashMap.put(radius15, valueOf);
                String radius16 = A01(136, 7, 117);
                hashMap.put(radius16, valueOf);
                String valueOf16 = String.valueOf(A00().A05());
                String radius17 = A01(68, 14, 24);
                hashMap.put(radius17, valueOf16);
                return hashMap;
            }
        }
        clickDelayMs = -1;
        HashMap hashMap2 = new HashMap();
        String valueOf22 = String.valueOf(this.A04);
        String radius18 = A01(20, 11, 106);
        hashMap2.put(radius18, valueOf22);
        String valueOf32 = String.valueOf(this.A05);
        String radius22 = A01(31, 11, 98);
        hashMap2.put(radius22, valueOf32);
        String valueOf42 = String.valueOf(this.A06);
        String radius32 = A01(186, 5, 96);
        hashMap2.put(radius32, valueOf42);
        String valueOf52 = String.valueOf(this.A03);
        String radius42 = A01(102, 6, 16);
        hashMap2.put(radius42, valueOf52);
        String valueOf62 = String.valueOf(clickDelayMs);
        String radius52 = A01(42, 14, 33);
        hashMap2.put(radius52, valueOf62);
        String valueOf72 = String.valueOf(this.A0E);
        String radius62 = A01(165, 9, 37);
        hashMap2.put(radius62, valueOf72);
        String valueOf82 = String.valueOf(this.A0D);
        String radius72 = A01(82, 7, 41);
        hashMap2.put(radius72, valueOf82);
        String valueOf92 = String.valueOf(this.A0A);
        String radius82 = A01(174, 6, 44);
        hashMap2.put(radius82, valueOf92);
        String valueOf102 = String.valueOf(this.A0B);
        String radius92 = A01(180, 6, 103);
        hashMap2.put(radius92, valueOf102);
        String valueOf112 = String.valueOf(this.A07);
        String radius102 = A01(56, 6, 117);
        hashMap2.put(radius102, valueOf112);
        String valueOf122 = String.valueOf(this.A08);
        String radius112 = A01(62, 6, 108);
        hashMap2.put(radius112, valueOf122);
        String valueOf132 = String.valueOf(this.A07);
        String radius122 = A01(89, 4, 94);
        hashMap2.put(radius122, valueOf132);
        String valueOf142 = String.valueOf(this.A08);
        String radius132 = A01(93, 4, 16);
        hashMap2.put(radius132, valueOf142);
        String valueOf152 = String.valueOf(this.A00);
        String radius142 = A01(97, 5, 12);
        hashMap2.put(radius142, valueOf152);
        String radius152 = A01(129, 7, 77);
        hashMap2.put(radius152, valueOf);
        String radius162 = A01(136, 7, 117);
        hashMap2.put(radius162, valueOf);
        String valueOf162 = String.valueOf(A00().A05());
        String radius172 = A01(68, 14, 24);
        hashMap2.put(radius172, valueOf162);
        return hashMap2;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 44) + this.A0C;
        }
    }

    public final void A06(C0887Xc c0887Xc, MotionEvent motionEvent, @Nullable View view, View view2) {
        if (view == null) {
            c0887Xc.A0E().AFo();
            return;
        }
        boolean z = this.A0H;
        if (A0J[5].length() != 4) {
            throw new RuntimeException();
        }
        A0J[4] = "drnDCnvAjgSKiECIW4dLYcZdZ";
        if (!z) {
            this.A0H = true;
            InputDevice touchDevice = motionEvent.getDevice();
            if (touchDevice != null) {
                InputDevice.MotionRange motionRange = touchDevice.getMotionRange(0);
                InputDevice.MotionRange motionRange2 = touchDevice.getMotionRange(1);
                if (motionRange != null && motionRange2 != null) {
                    this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] adViewLocation = new int[2];
        view.getLocationInWindow(adViewLocation);
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float f = this.A00;
                    this.A00 = f - (f / this.A09);
                    float f2 = this.A00;
                    float pressure = motionEvent.getPressure();
                    int i = this.A09;
                    this.A00 = f2 + (pressure / i);
                    float f3 = this.A02;
                    this.A02 = f3 - (f3 / i);
                    float f4 = this.A02;
                    float size = motionEvent.getSize();
                    int i2 = this.A09;
                    this.A02 = f4 + (size / i2);
                    this.A09 = i2 + 1;
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            this.A0D = System.currentTimeMillis();
            int touchEndXInPx = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr[0]) - adViewLocation[0]) / Kk.A02);
            this.A07 = touchEndXInPx;
            int y = (int) (motionEvent.getY() + 0.5f);
            int touchEndXInPx2 = iArr[1];
            int i3 = y + touchEndXInPx2;
            int touchEndXInPx3 = adViewLocation[1];
            int touchEndYInPx = i3 - touchEndXInPx3;
            int touchEndXInPx4 = (int) (touchEndYInPx / Kk.A02);
            this.A08 = touchEndXInPx4;
            this.A0F = view2;
            return;
        }
        int touchEndXInPx5 = adViewLocation[0];
        this.A04 = (int) (touchEndXInPx5 / Kk.A02);
        this.A05 = (int) (adViewLocation[1] / Kk.A02);
        this.A06 = (int) (view.getWidth() / Kk.A02);
        this.A03 = (int) (view.getHeight() / Kk.A02);
        this.A09 = 1;
        this.A0E = System.currentTimeMillis();
        int touchStartXInPx = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr[0]) - adViewLocation[0]) / Kk.A02);
        this.A0A = touchStartXInPx;
        int y2 = (int) (motionEvent.getY() + 0.5f);
        int touchStartXInPx2 = iArr[1];
        int i4 = y2 + touchStartXInPx2;
        int touchStartXInPx3 = adViewLocation[1];
        int touchStartYInPx = i4 - touchStartXInPx3;
        int touchStartXInPx4 = (int) (touchStartYInPx / Kk.A02);
        this.A0B = touchStartXInPx4;
        this.A00 = motionEvent.getPressure();
        this.A02 = motionEvent.getSize();
        this.A0G = view2;
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A09(android.content.Context r9) {
        /*
            r8 = this;
            int r7 = com.facebook.ads.redexgen.X.IK.A06(r9)
            long r3 = r8.A03()
            if (r7 < 0) goto L4c
            long r1 = (long) r7
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            r6 = 1
        L10:
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r2 = 108(0x6c, float:1.51E-43)
            r1 = 21
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            r5.append(r0)
            r5.append(r6)
            r2 = 2
            r1 = 18
            r0 = 43
            java.lang.String r0 = A01(r2, r1, r0)
            r5.append(r0)
            r5.append(r7)
            r2 = 0
            r1 = 2
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            r5.append(r0)
            r5.append(r3)
            r5.toString()
        L4b:
            return r6
        L4c:
            r6 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LD.A09(android.content.Context):boolean");
    }
}
