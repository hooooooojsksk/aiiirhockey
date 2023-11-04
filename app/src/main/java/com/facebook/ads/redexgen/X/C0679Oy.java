package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.Oy */
/* loaded from: assets/audience_network.dex */
public final class C0679Oy extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AbstractC0952Zs A03;
    public final C1X A04;
    public final C0887Xc A05;
    public final InterfaceC0505Ia A06;
    public final N3 A07;
    public final C0766Sh A08;
    public final InterfaceC0677Ow A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i4] = (byte) (i5 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, airhockey.P_GAME_SELECTMAP, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, airhockey.P_GAME_SELECTMAP, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, airhockey.P_GAME_SELECTMAP, 16, 22, 13, 3, 3, 1, 22, 1, 0, airhockey.P_GAME_SELECTMAP, 19, 13, 16, 12, airhockey.P_GAME_SELECTMAP, 20, 22, 1, airhockey.P_GAME_REMATCH, 1, 18, 1, 10, 16, airhockey.P_GAME_SELECTMAP, 7, 8, 13, 7, 15, 23, airhockey.P_GAME_SELECTMAP, 7, 11, 17, 10, 16, airhockey.P_GAME_SELECTMAP, 5, 10, 0, airhockey.P_GAME_SELECTMAP, 32, 1, 8, 5, 29, airhockey.J_GAME_EXIT, 86, 91, airhockey.P_GAME_MYSCORE, 91, 88, 86, 95, 123, 94, airhockey.P_GAME_REMATCH, airhockey.J_GAME_DISCONNECT, 83, 95, 77, 102, airhockey.J_SDKVER, 99, 109, airhockey.J_GAME_EXIT, 36, airhockey.J_ENEMYLOSE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_STANDBY, 96, 109, airhockey.J_GAME_EXIT, 99, 36, airhockey.J_REWARD, airhockey.J_SDKVER, airhockey.J_GAME_REMATCH, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GOO, airhockey.J_SDKVER, 36, airhockey.J_DISCONNECT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_STANDBY, 125, airhockey.J_GAME_STANDBY, 102, airhockey.J_ENEMYLOSE, airhockey.J_SDKVER, 61, 50, 55, 61, 53, 45, airhockey.J_GOO, airhockey.J_BACK, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, 109, 93, 65, 76, 84, 76, 79, 65, airhockey.P_GAME_MYLOSE, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, airhockey.J_GAME_ENEMYEXIT, airhockey.J_WAIT, 126, airhockey.P_GAME_MYSCORE, airhockey.J_GAME_EXIT, airhockey.J_ERROR, airhockey.J_WAIT, airhockey.J_GAME_ENEMYEXIT};
    }

    static {
        A09();
        A0E = (int) (Kk.A02 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0679Oy(C0887Xc c0887Xc, AbstractC0952Zs abstractC0952Zs, C1X c1x, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0677Ow interfaceC0677Ow, Map<String, String> playableMetricsData) {
        super(c0887Xc);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC0769Sk() { // from class: com.facebook.ads.redexgen.X.7D
            @Override // com.facebook.ads.redexgen.X.N3
            public final void AAF() {
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0769Sk, com.facebook.ads.redexgen.X.N3
            public final void AB0(int i, @Nullable String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC0677Ow interfaceC0677Ow2;
                atomicBoolean = C0679Oy.this.A0B;
                atomicBoolean.set(true);
                interfaceC0677Ow2 = C0679Oy.this.A09;
                interfaceC0677Ow2.ABX();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0769Sk, com.facebook.ads.redexgen.X.N3
            public final void ABC() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC0677Ow interfaceC0677Ow2;
                atomicBoolean = C0679Oy.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = C0679Oy.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC0677Ow2 = C0679Oy.this.A09;
                interfaceC0677Ow2.ABC();
            }

            @Override // com.facebook.ads.redexgen.X.N3
            public final void ADD() {
                InterfaceC0677Ow interfaceC0677Ow2;
                interfaceC0677Ow2 = C0679Oy.this.A09;
                interfaceC0677Ow2.ADD();
            }
        };
        this.A05 = c0887Xc;
        this.A03 = abstractC0952Zs;
        this.A04 = c1x;
        this.A06 = interfaceC0505Ia;
        this.A09 = interfaceC0677Ow;
        this.A02 = playableMetricsData;
        this.A08 = A04();
        if (IK.A1Q(this.A05)) {
            this.A05.A0A().AFp(this.A08, this.A03.A0m(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C0679Oy c0679Oy) {
        int i = c0679Oy.A00;
        c0679Oy.A00 = i + 1;
        return i;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private C0766Sh A04() {
        C0766Sh c0766Sh = new C0766Sh(this.A05, new WeakReference(this.A07), 10, IK.A1X(this.A05));
        c0766Sh.setCornerRadius(A0E);
        c0766Sh.setLogMultipleImpressions(false);
        c0766Sh.setCheckAssetsByJavascriptBridge(false);
        c0766Sh.setWebViewTimeoutInMillis(this.A04.A08());
        c0766Sh.setRequestId(this.A03.A0L());
        c0766Sh.setOnTouchListener(new View$OnTouchListenerC0678Ox(this));
        WebSettings settings = c0766Sh.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c0766Sh.addJavascriptInterface(new C0680Oz(this.A05, this, this.A06, this.A02, this.A03.A0m()), A06(0, 12, 104));
        }
        return c0766Sh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.IK.A0G(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.C0679Oy.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r3.AAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r2 = com.facebook.ads.redexgen.X.C0679Oy.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.IK.A0G(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
        r6.A03(0);
        r9.A05.A07().A9C(r5, com.facebook.ads.redexgen.X.C02627s.A2D, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0679Oy.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            C02637t c02637t = new C02637t(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0m());
            } catch (JSONException e) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e);
            }
            c02637t.A05(jSONObject);
            c02637t.A03(1);
            InterfaceC02617r A07 = this.A05.A07();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i = C02627s.A2F;
            String A06 = A06(155, 15, 98);
            A07.A9D(A06, i, c02637t);
            if (IK.A0n(this.A05) && LA.A00(this.A05) == L9.A07) {
                this.A05.A07().A9D(A06, C02627s.A2E, c02637t);
                this.A07.AB0(0, null);
                return;
            }
        }
        try {
            C0766Sh c0766Sh = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            c0766Sh.loadUrl(A0E2);
        } catch (Exception e2) {
            this.A05.A07().A9C(A06(192, 8, 57), C02627s.A2c, new C02637t(e2));
        }
    }

    public final void A0C() {
        if (IK.A1Q(this.A05)) {
            C0887Xc c0887Xc = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c0887Xc.A0A().AFe(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
            return;
        }
        this.A08.destroy();
    }

    public LD getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public QA getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
