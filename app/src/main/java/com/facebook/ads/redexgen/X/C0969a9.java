package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.android.gms.drive.DriveFile;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.a9 */
/* loaded from: assets/audience_network.dex */
public final class C0969a9 implements InterfaceC00880n, InterfaceC01031c {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public InterfaceC00980x A02;
    public C00990y A03;
    public C01041d A04;
    public C0887Xc A05;
    public String A06;
    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, airhockey.J_GAME_DISCONNECT, 99, 42, airhockey.J_WAIT, 45, 126, airhockey.J_WAIT, airhockey.J_GAME_DISCONNECT, ByteCompanionObject.MAX_VALUE, airhockey.J_WAIT, 45, 76, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_REMATCH, airhockey.J_ONREWARDED, airhockey.J_ENEMYLOSE, 99, airhockey.J_INVITE, airhockey.J_ENEMYLOSE, airhockey.P_GAME_MYSCORE, airhockey.J_ENEMYLOSE, airhockey.J_WAIT, airhockey.J_PURCHASE, airhockey.J_NATION, ByteCompanionObject.MAX_VALUE, 102, 76, airhockey.J_INVITE, airhockey.J_WAIT, airhockey.J_ONREWARDED, 123, airhockey.J_ONREWARDED, airhockey.J_WAIT, airhockey.J_DISCONNECT, 35, 45, 64, airhockey.J_GAME_DISCONNECT, 102, airhockey.J_ENEMYLOSE, 45, 126, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, airhockey.J_ENEMYLOSE, 45, airhockey.J_WAIT, airhockey.J_GAME_STANDBY, airhockey.J_GAME_DISCONNECT, airhockey.J_WAIT, 45, airhockey.J_ONREWARDED, airhockey.J_WAIT, 42, 126, 45, airhockey.J_ONREWARDED, 99, 45, airhockey.J_DISCONNECT, airhockey.J_NATION, airhockey.J_ACHIEVEMENTCALLBACK, ByteCompanionObject.MAX_VALUE, 45, 76, 99, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, airhockey.J_NATION, airhockey.J_ONREWARDED, airhockey.J_GAME_REMATCH, 64, airhockey.J_GAME_DISCONNECT, 99, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, 126, airhockey.J_WAIT, 35, airhockey.J_ERROR, 96, airhockey.J_SDKVER, 45, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ONREWARDED, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, 35, airhockey.P_GAME_REMATCH, 77, 78, airhockey.J_PURCHASE, airhockey.J_GAME_ENEMYEXIT, 102, airhockey.J_GAME_EXIT, airhockey.J_SDKVER, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_EXIT, 65, airhockey.J_GAME_EXIT, 123, airhockey.J_ACHIEVEMENTCALLBACK, 96, 125, airhockey.J_ONREWARDED, airhockey.P_GAME_SELECTMAP, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 83, 91, 90, 87, 95, airhockey.P_GAME_EXIT, 87, 81, 80, airhockey.J_PURCHASE, 95, airhockey.P_GAME_EXIT, 95, 12, 16, 29, 31, 25, 17, 25, 18, 8, 53, 24, 52, 54, 33, 32, 33, 34, 45, 42, 33, 32, 11, 54, 45, 33, 42, 48, 37, 48, 45, 43, 42, 15, 33, 61, 6, 17, 5, 1, 17, 7, 0, 32, 29, 25, 17, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_REMATCH, airhockey.J_INVITE, airhockey.J_REWARD, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_NATION, 78, 99, 30, 1, 13, 31, 60, 17, 24, 13, 39, 57, 62, 52, 63, 39};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 88));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        NB adOrientation = A02();
        if (adOrientation == NB.A06) {
            return -1;
        }
        if (adOrientation == NB.A04) {
            if (rotation == 2 || rotation == 3) {
                int rotation2 = A0C[1].charAt(29);
                if (rotation2 != 103) {
                    String[] strArr = A0C;
                    strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
                    strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
                    return 8;
                }
                throw new RuntimeException();
            }
            return 0;
        } else if (rotation != 2) {
            return 1;
        } else {
            return 9;
        }
    }

    private final EnumC0539Jj A01() {
        return this.A04.A0C();
    }

    private NB A02() {
        return this.A04.A0D();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C01041d c01041d = this.A04;
        RewardData rewardData = this.A01;
        c01041d.A0G(intent, rewardData, P5.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C0887Xc c0887Xc, InterfaceC00980x interfaceC00980x, C01171q c01171q, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        C01041d c01041d = new C01041d(c0887Xc, c01171q, this, str);
        if (IK.A0q(c0887Xc)) {
            C0887Xc c0887Xc2 = this.A05;
            InterfaceC00840i A01 = C00850j.A01(c0887Xc, c01171q.A03(), c01041d.A0E());
            InterfaceC0505Ia A09 = c0887Xc.A09();
            String[] strArr = A0C;
            if (strArr[3].charAt(11) == strArr[7].charAt(11)) {
                A0C[2] = "TkuXboGIr4gI6uBXxoSPLVsF8oObr4N9";
                if (C00850j.A06(c0887Xc2, A01, A09)) {
                    this.A05.A0E().A44();
                    this.A02.ABI(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A04 = c01041d;
        c01041d.A0H(c0887Xc, enumSet);
        String[] strArr2 = A0C;
        if (strArr2[3].charAt(11) == strArr2[7].charAt(11)) {
            A0C[1] = "78EqxHXjdVB4uq4fqkQnSqdXUgUnX7wU";
            return;
        }
        throw new RuntimeException();
    }

    private void A08(EnumC0539Jj enumC0539Jj) {
        if (enumC0539Jj.equals(EnumC0539Jj.A08)) {
            this.A05.A0E().AFA(EnumC00780c.A03);
        } else if (enumC0539Jj.equals(EnumC0539Jj.A09)) {
            this.A05.A0E().AFA(EnumC00780c.A07);
        } else if (enumC0539Jj.equals(EnumC0539Jj.A0B)) {
            this.A05.A0E().AFA(EnumC00780c.A09);
        } else if (enumC0539Jj.equals(EnumC0539Jj.A0A)) {
            this.A05.A0E().AFA(EnumC00780c.A08);
        } else if (!enumC0539Jj.equals(EnumC0539Jj.A04)) {
        } else {
            if (this.A04.A0J()) {
                C0R A0E = this.A05.A0E();
                String[] strArr = A0C;
                if (strArr[5].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
                A0E.AFA(EnumC00780c.A04);
            } else if (this.A04.A0I()) {
                this.A05.A0E().AFA(EnumC00780c.A06);
            } else {
                this.A05.A0E().AFA(EnumC00780c.A05);
            }
        }
    }

    public final AbstractC0952Zs A09() {
        return this.A04.A0B();
    }

    public final void A0A(C0887Xc c0887Xc, InterfaceC00980x interfaceC00980x, C01171q c01171q, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        this.A05 = c0887Xc;
        this.A02 = interfaceC00980x;
        this.A08 = c01171q.A02();
        String str3 = this.A08;
        this.A06 = str3 != null ? str3.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c01171q.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c0887Xc, interfaceC00980x, c01171q, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC00980x interfaceC00980x = this.A02;
            if (interfaceC00980x != null) {
                interfaceC00980x.ABI(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A04 = KG.A04(this.A05);
        A04.putExtra(A03(143, 24, 76), A00());
        A04.putExtra(A03(178, 8, 15), this.A0A);
        A04.putExtra(A03(132, 11, 116), this.A08);
        A04.putExtra(A03(167, 11, 124), this.A00);
        EnumC0539Jj A01 = A01();
        A08(A01);
        A04.putExtra(A03(186, 8, 96), A01);
        String str = this.A07;
        if (str != null) {
            A04.putExtra(A03(119, 13, 54), str);
        }
        A06(A04);
        A04.addFlags(DriveFile.MODE_READ_ONLY);
        try {
            ActivityUtils.A03(this.A05);
            KG.A09(this.A05, A04);
            return true;
        } catch (KE e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A05.A07().A9C(A03(108, 11, 76), C02627s.A0D, new C02637t(th));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    @Nullable
    public final String A6B() {
        return this.A04.A0E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final AdPlacementType A7L() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01031c
    public final void AA6(AdError adError) {
        InterfaceC00980x interfaceC00980x = this.A02;
        if (interfaceC00980x != null) {
            interfaceC00980x.ABI(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01031c
    public final void AA7() {
        A04();
        this.A02.ABH(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01031c
    public final void AE1() {
        this.A03 = new C00990y(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final boolean AFX() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01031c
    public final void AFg() {
        C00990y c00990y = this.A03;
        if (c00990y != null) {
            c00990y.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC00880n
    public final void onDestroy() {
        C01041d c01041d = this.A04;
        if (c01041d != null) {
            c01041d.A0F();
        }
    }
}
