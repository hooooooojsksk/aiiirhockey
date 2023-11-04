package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5F */
/* loaded from: assets/audience_network.dex */
public final class C5F implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0O;
    public static String[] A0P = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public EnumC0539Jj A07;
    @Nullable
    public InterfaceC0588Lk A08;
    public MH A09;
    public N8 A0A;
    @Nullable
    public C0676Ov A0B;
    public String A0C;
    public String A0D;
    @Nullable
    public String A0E;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AudienceNetworkActivity A0K;
    public final AudienceNetworkActivityApi A0L;
    public final C0887Xc A0M;
    public final List<C5D> A0N = new ArrayList();
    public int A01 = -1;
    public boolean A0F = false;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-3, 38, airhockey.P_GAME_MYWIN, airhockey.P_GAME_SELECTMAP, 87, airhockey.P_GAME_REMATCH, -36, -11, -24, -23, -13, -20, -89, -5, -10, -89, -16, -11, -19, -20, -7, -89, -3, -16, -20, -2, -37, 0, -9, -20, -89, -19, -7, -10, -12, -89, -16, -11, -5, -20, -11, -5, -89, -10, -7, -89, -6, -24, -3, -20, -21, -48, -11, -6, -5, -24, -11, -22, -20, -38, -5, -24, -5, -20, -12, 1, -14, -12, -10, 7, -4, 9, -4, 7, 12, -44, -35, -38, -42, -33, -27, -59, -32, -36, -42, -33, 1, 13, 11, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 2, 17, -52, -1, 2, 16, 3, 14, 13, 16, 18, 7, 12, 5, -52, -28, -25, -20, -25, -15, -26, -3, -33, -30, -3, -16, -29, -18, -19, -16, -14, -25, -20, -27, -3, -28, -22, -19, -11, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, -34, -32, -15, -26, -13, -26, -15, -10, -36, -31, -30, -16, -15, -17, -20, -10, -30, -31, 15, 27, 25, -38, 18, 13, 15, 17, 14, 27, 27, 23, -38, 13, 16, 31, -38, 21, 26, 32, 17, 30, 31, 32, 21, 32, 21, 13, 24, -38, 16, 21, 31, 25, 21, 31, 31, 17, 16, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -22, -17, -7, -10, -14, -25, -1, -21, -22, 16, 28, 26, -37, 19, 14, 16, 18, 15, 28, 28, 24, -37, 14, 17, 32, -37, 22, 27, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 18, 31, 31, 28, 31, 54, airhockey.P_NATION, 64, 1, 57, 52, 54, 56, 53, airhockey.P_NATION, airhockey.P_NATION, 62, 1, 52, 55, airhockey.P_GAME_BREAKBALLCOUNT, 1, 60, 65, airhockey.P_GAME_MYWIN, 56, airhockey.P_GAME_STANDBY, airhockey.P_GAME_BREAKBALLCOUNT, airhockey.P_GAME_MYWIN, 60, airhockey.P_GAME_MYWIN, 60, 52, 63, 1, 57, 60, 65, 60, airhockey.P_GAME_BREAKBALLCOUNT, 59, 50, 52, 54, airhockey.P_GAME_MYWIN, 60, airhockey.P_GAME_REMATCH, 60, airhockey.P_GAME_MYWIN, 76, 75, 87, 85, 22, 78, airhockey.P_GAME_REMATCH, 75, 77, airhockey.P_GAME_EXIT, 87, 87, 83, 22, airhockey.P_GAME_REMATCH, 76, 91, 22, 81, 86, 92, 77, 90, 91, 92, 81, 92, 81, airhockey.P_GAME_REMATCH, 84, 22, 81, 85, 88, 90, 77, 91, 91, 81, 87, 86, 22, 84, 87, 79, 79, 77, 76, 42, 59, 42, 51, 57, airhockey.P_GAME_SELECTMAP, 57, airhockey.P_GAME_BREAKBALLCOUNT, 60, 75, 59, 57, airhockey.P_GAME_MYLOSE, 61, 15, 7, 6, 11, 3, 22, 11, 17, 16, -26, 3, 22, 3, -7, -11, -22, -20, -18, -10, -18, -9, -3, -46, -19, 87, 86, 89, 91, 89, airhockey.P_GAME_MYLOSE, 80, 91, 76, 78, 65, 64, 65, airhockey.P_NATION, airhockey.P_GAME_STANDBY, airhockey.P_GAME_EXIT, 65, 64, 43, 78, airhockey.P_GAME_STANDBY, 65, airhockey.P_GAME_EXIT, 80, 61, 80, airhockey.P_GAME_STANDBY, 75, airhockey.P_GAME_EXIT, 39, 65, 85, -8, -21, -9, -5, -21, -7, -6, -38, -17, -13, -21, 44, 36, 34, 41, -6, 31, 45, 30, 43, 12, 30, 28, 40, 39, 29, 44, -12, -17, -33, -17, -14, -23, -27, -18, -12, -31, -12, -23, -17, -18, 57, 50, 45, 53, 57, 41, 13, 40, 90, 77, airhockey.P_GAME_REMATCH, 91, 56, 93, 84, airhockey.P_GAME_REMATCH};
    }

    static {
        A07();
    }

    public C5F(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0K = audienceNetworkActivity;
        this.A0L = audienceNetworkActivityApi;
        this.A0M = C5M.A01(audienceNetworkActivity);
        this.A0M.A0H(this);
    }

    @Nullable
    private InterfaceC0588Lk A01(Intent intent) {
        InterfaceC0588Lk A03;
        InterfaceC0588Lk A05;
        InterfaceC0588Lk A04;
        InterfaceC0588Lk A06;
        InterfaceC0588Lk A09;
        InterfaceC0588Lk A07;
        InterfaceC0588Lk A08;
        InterfaceC0588Lk A0A;
        InterfaceC0588Lk A02;
        InterfaceC0588Lk A0D;
        InterfaceC0588Lk A0B;
        InterfaceC0588Lk A0C;
        InterfaceC0588Lk A0E;
        C5C c5c = new C5C(this, intent, this.A0M.A09(), this.A0M);
        if (this.A07 == null) {
            return null;
        }
        switch (this.A07) {
            case A07:
                A0E = c5c.A0E(this.A06);
                return A0E;
            case A0C:
                A0C = c5c.A0C();
                if (A0P[6].length() != 15) {
                    throw new RuntimeException();
                }
                A0P[2] = "9AjKOltSNiH";
                return A0C;
            case A0E:
                A0B = c5c.A0B();
                return A0B;
            case A0D:
                A0D = c5c.A0D();
                return A0D;
            case A02:
                A02 = c5c.A02();
                return A02;
            case A0B:
                A0A = c5c.A0A();
                return A0A;
            case A09:
                A08 = c5c.A08();
                return A08;
            case A08:
                A07 = c5c.A07();
                if (A0P[1].length() != 0) {
                    A0P[1] = "wwrXZHO6We2";
                    return A07;
                }
                A0P[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return A07;
            case A0A:
                A09 = c5c.A09();
                return A09;
            case A05:
                A06 = c5c.A06();
                if (A0P[2].length() != 25) {
                    A0P[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                    return A06;
                }
                throw new RuntimeException();
            case A04:
                A04 = c5c.A04();
                return A04;
            case A06:
                A05 = c5c.A05();
                if (A0P[7].charAt(27) != 'B') {
                    A0P[1] = "x";
                    return A05;
                }
                throw new RuntimeException();
            case A03:
                A03 = c5c.A03();
                return A03;
            default:
                return null;
        }
    }

    private void A05() {
        String str = this.A0E;
        if (str != null) {
            this.A0B = C0675Ou.A01(this.A0M, str);
            if (this.A0B != null) {
                this.A06.addView(this.A0B, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A06() {
        if (!this.A0I) {
            if (A0G()) {
                A0D(PN.A03.A02());
            } else {
                A0D(A04(139, 48, 14));
            }
            this.A0I = true;
        }
    }

    private void A08(Intent intent) {
        if (IK.A10(this.A0K)) {
            EnumC0539Jj enumC0539Jj = this.A07;
            EnumC0539Jj enumC0539Jj2 = EnumC0539Jj.A02;
            if (A0P[2].length() == 25) {
                throw new RuntimeException();
            }
            A0P[1] = "ROWUzhbvPevH2";
            if (enumC0539Jj != enumC0539Jj2 && Build.VERSION.SDK_INT >= 18) {
                this.A0A = new N8();
                this.A0A.A0C(intent.getStringExtra(A04(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 11, 26)));
                N8 n8 = this.A0A;
                String placementId = this.A0K.getPackageName();
                n8.A0B(placementId);
                String placementId2 = A04(462, 11, 23);
                long longExtra = intent.getLongExtra(placementId2, 0L);
                if (longExtra != 0) {
                    this.A0A.A09(longExtra);
                }
                TextView textView = new TextView(this.A0K);
                String placementId3 = A04(1, 5, 115);
                textView.setText(placementId3);
                textView.setTextColor(-1);
                LL.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                C5E c5e = new C5E(this);
                textView.setOnLongClickListener(c5e);
                this.A06.setOnLongClickListener(c5e);
                this.A06.getOverlay().add(this.A0A);
            }
        }
    }

    private void A09(Intent intent, @Nullable Bundle bundle) {
        String A04 = A04(FrameMetricsAggregator.EVERY_DURATION, 8, 117);
        String A042 = A04(HttpStatus.SC_SERVICE_UNAVAILABLE, 8, 85);
        String A043 = A04(438, 24, 109);
        if (bundle != null) {
            Bundle A02 = KG.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = A02.getInt(A043, -1);
            this.A0C = A02.getString(A042);
            this.A07 = (EnumC0539Jj) A02.getSerializable(A04);
            return;
        }
        this.A01 = intent.getIntExtra(A043, -1);
        this.A0C = intent.getStringExtra(A042);
        this.A07 = (EnumC0539Jj) intent.getSerializableExtra(A04);
        this.A02 = intent.getIntExtra(A04(473, 16, 74), 0) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0058, code lost:
        if (r3.equals(r6) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0D(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 345(0x159, float:4.83E-43)
            r1 = 47
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            r4 = 1
            if (r0 != 0) goto L1d
            com.facebook.ads.redexgen.X.PN r0 = com.facebook.ads.redexgen.X.PN.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
        L1d:
            r5.A0H = r4
        L1f:
            r2 = 265(0x109, float:3.71E-43)
            r1 = 35
            r0 = 62
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.PN r0 = com.facebook.ads.redexgen.X.PN.A09
            java.lang.String r3 = r0.A02()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C5F.A0P
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5F.A0P
            java.lang.String r1 = "BsUqgJlN3izr4734FAkiK4"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DZ4pb9dksBh2p0w2isnwDh"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L5c
        L5a:
            r5.A0G = r4
        L5c:
            r2 = 86
            r1 = 53
            r0 = 47
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L72
            r0 = 9
            r5.finish(r0)
            return
        L72:
            r2 = 300(0x12c, float:4.2E-43)
            r1 = 45
            r0 = 100
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L88
            r0 = 10
            r5.finish(r0)
            return
        L88:
            r0 = 0
            r5.A0F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C5F.A0D(java.lang.String):void");
    }

    public void A0E(String str, C1V c1v) {
        if (this.A08 == null) {
            return;
        }
        if (this.A09 == null) {
            C0887Xc c0887Xc = this.A0M;
            this.A09 = MI.A02(c0887Xc, c0887Xc.A09(), str, c1v, this.A08, new YL(this));
            this.A09.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        LL.A0J(this.A09);
        LL.A0T(this.A06);
        this.A06.addView(this.A09);
        this.A09.A0K();
    }

    public void A0F(String str, @Nullable C8T c8t) {
        Intent intent = new Intent(str + A04(0, 1, 84) + this.A0C);
        if (c8t != null) {
            intent.putExtra(A04(392, 5, 86), c8t);
        }
        C2Z.A00(this.A0K).A07(intent);
    }

    private boolean A0G() {
        return this.A07 == EnumC0539Jj.A0E || this.A07 == EnumC0539Jj.A0D || this.A07 == EnumC0539Jj.A06;
    }

    public final AudienceNetworkActivity A0H() {
        return this.A0K;
    }

    public final C0887Xc A0I() {
        return this.A0M;
    }

    @VisibleForTesting
    public final void A0J() {
        if (A0G()) {
            A0D(PN.A09.A02());
        } else {
            A0D(A04(265, 35, 62));
        }
    }

    public final void A0K(C5D c5d) {
        this.A0N.add(c5d);
    }

    public final void A0L(C5D c5d) {
        this.A0N.remove(c5d);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        KN customDumpsysWriter = KO.A00();
        if (customDumpsysWriter != null) {
            boolean overrideDumpsys = customDumpsysWriter.overrideDumpsys(str, fileDescriptor, printWriter, strArr);
            if (A0P[2].length() == 25) {
                throw new RuntimeException();
            }
            A0P[6] = "QxWYw7ht1er43uY";
            if (overrideDumpsys) {
                return;
            }
        }
        this.A0L.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0M.A0E().A2R(String.valueOf(A0H().hashCode()), i);
        if (this.A0K.isFinishing()) {
            return;
        }
        if (IK.A1O(this.A0M) && !this.A0H && !this.A0G) {
            this.A0M.A0E().A9u();
            A0J();
        }
        if (A0G() && !this.A0F) {
            A0D(PN.A05.A02());
        } else {
            A0D(A04(187, 39, 61));
        }
        A06();
        this.A0L.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC0588Lk interfaceC0588Lk = this.A08;
        if (interfaceC0588Lk != null && interfaceC0588Lk.onActivityResult(i, i2, intent)) {
            return;
        }
        C0775Sq.A09(i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A03;
        long currentTime = currentTimeMillis - this.A04;
        this.A03 = j + currentTime;
        this.A04 = currentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            for (C5D c5d : this.A0N) {
                if (c5d.A8b()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0L.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i = configuration.orientation;
            String A04 = A04(489, 14, 17);
            if (i == 1) {
                hashMap.put(A04, A04(430, 8, 120));
            } else {
                hashMap.put(A04, A04(397, 9, 105));
            }
            EnumC0512Ih enumC0512Ih = EnumC0512Ih.A0K;
            InterfaceC0588Lk interfaceC0588Lk = this.A08;
            C0513Ii.A02(enumC0512Ih, hashMap, interfaceC0588Lk == null ? A04(0, 0, 50) : interfaceC0588Lk.getCurrentClientToken(), this.A0M.A09());
            this.A00 = configuration.orientation;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        LN.A02();
        if (IK.A1e(this.A0K)) {
            Window window = this.A0K.getWindow();
            String[] strArr = A0P;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0P[6] = "7njofUp2AYjKONZ";
            window.setFlags(16777216, 16777216);
        }
        Intent intent = KG.A01(this.A0K.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        this.A05 = intent;
        Intent intent2 = this.A05;
        C0887Xc A03 = KG.A03(intent2);
        if (A03 != null) {
            C0887Xc startAdContext = this.A0M;
            startAdContext.A0F(A03.A0E());
            C0887Xc startAdContext2 = this.A0M;
            startAdContext2.A0C(A03.A0B());
        }
        this.A0M.A0E().A2S(String.valueOf(A0H().hashCode()));
        this.A0K.requestWindowFeature(1);
        this.A0K.getWindow().setFlags(1024, 1024);
        this.A06 = new RelativeLayout(this.A0K);
        LL.A0M(this.A06, 0);
        this.A0K.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent3 = this.A05;
        A09(intent3, bundle);
        Intent intent4 = this.A05;
        this.A08 = A01(intent4);
        InterfaceC0588Lk interfaceC0588Lk = this.A08;
        if (interfaceC0588Lk == null) {
            this.A0M.A07().A9C(A04(64, 11, 36), C02627s.A0A, new C02637t(A04(6, 58, 24)));
            A0J();
            finish(7);
            return;
        }
        Intent intent5 = this.A05;
        interfaceC0588Lk.A92(intent5, bundle, this);
        A0D(A04(226, 39, 23));
        this.A04 = System.currentTimeMillis();
        this.A0E = this.A05.getStringExtra(A04(HttpStatus.SC_NOT_ACCEPTABLE, 13, 51));
        A05();
        Intent intent6 = this.A05;
        A08(intent6);
        this.A00 = this.A0K.getResources().getConfiguration().orientation;
        String A04 = A04(75, 11, 2);
        if (bundle != null) {
            this.A0D = bundle.getString(A04);
        } else {
            Intent intent7 = this.A05;
            this.A0D = intent7.getStringExtra(A04);
        }
        if (IK.A1m(this.A0K) && this.A0K.getWindow() != null) {
            this.A0K.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0060, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0068, code lost:
        if (com.facebook.ads.redexgen.X.IK.A10(r4.A0K) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x006a, code lost:
        r4.A0A.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006f, code lost:
        r3 = r4.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007c, code lost:
        if (com.facebook.ads.redexgen.X.C5F.A0P[2].length() == 25) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007e, code lost:
        r2 = com.facebook.ads.redexgen.X.C5F.A0P;
        r2[5] = "rHb3ILEFnyWtMYiOwcguj0";
        r2[3] = "XKBHK5KZoSEcfbvzOM5yLt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008a, code lost:
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x008c, code lost:
        r3.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x008f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0090, code lost:
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009a, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Xc r0 = r4.A0M
            com.facebook.ads.redexgen.X.0R r1 = r0.A0E()
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0H()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A2T(r0)
            r4.A06()
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            com.facebook.ads.redexgen.X.Lk r0 = r4.A08
            if (r0 == 0) goto L4a
            r0.onDestroy()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5F.A0P
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L40
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5F.A0P
            java.lang.String r1 = "BK5JyIukG"
            r0 = 1
            r2[r0] = r1
            r0 = 0
            r4.A08 = r0
        L4a:
            com.facebook.ads.redexgen.X.N8 r3 = r4.A0A
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5F.A0P
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L93
            if (r3 == 0) goto L6f
        L62:
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0K
            boolean r0 = com.facebook.ads.redexgen.X.IK.A10(r0)
            if (r0 == 0) goto L6f
            com.facebook.ads.redexgen.X.N8 r0 = r4.A0A
            r0.A07()
        L6f:
            com.facebook.ads.redexgen.X.MH r3 = r4.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C5F.A0P
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5F.A0P
            java.lang.String r1 = "rHb3ILEFnyWtMYiOwcguj0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "XKBHK5KZoSEcfbvzOM5yLt"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L8f
        L8c:
            r3.A0J()
        L8f:
            return
        L90:
            if (r3 == 0) goto L8f
            goto L8c
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5F.A0P
            java.lang.String r1 = "VoJV9dI9dal5KZ60JkB8i5Bpps"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L6f
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C5F.onDestroy():void");
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0M.A0E().A2U(String.valueOf(A0H().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        InterfaceC0588Lk interfaceC0588Lk = this.A08;
        if (interfaceC0588Lk != null) {
            interfaceC0588Lk.ABw(false);
            if (!this.A0K.isFinishing()) {
                C0513Ii.A02(EnumC0512Ih.A0E, null, this.A08.getCurrentClientToken(), this.A0M.A09());
                this.A0J = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0M.A0E().A2V(String.valueOf(A0H().hashCode()));
        this.A04 = System.currentTimeMillis();
        InterfaceC0588Lk interfaceC0588Lk = this.A08;
        if (interfaceC0588Lk != null) {
            interfaceC0588Lk.ACM(false);
            if (this.A0J) {
                C0513Ii.A02(EnumC0512Ih.A0F, null, this.A08.getCurrentClientToken(), this.A0M.A09());
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        InterfaceC0588Lk interfaceC0588Lk = this.A08;
        if (interfaceC0588Lk != null) {
            interfaceC0588Lk.AEZ(bundle2);
        }
        bundle2.putInt(A04(438, 24, 109), this.A01);
        bundle2.putString(A04(HttpStatus.SC_SERVICE_UNAVAILABLE, 8, 85), this.A0C);
        bundle2.putString(A04(75, 11, 2), this.A0D);
        bundle2.putSerializable(A04(FrameMetricsAggregator.EVERY_DURATION, 8, 117), this.A07);
        KG.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0M.A0E().A2W(String.valueOf(A0H().hashCode()));
        int i = this.A01;
        if (i != -1) {
            C0582Le.A02(this.A0K, i, this.A0M);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0M.A0E().A2X(String.valueOf(A0H().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A0L.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A0J();
        finish(5);
    }
}
