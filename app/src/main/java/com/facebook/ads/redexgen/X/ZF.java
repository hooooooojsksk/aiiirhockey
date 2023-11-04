package com.facebook.ads.redexgen.X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZF implements InterfaceC01241x {
    public static byte[] A0C;
    public static String[] A0D = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0E;
    public long A02;
    @Nullable
    public RewardedVideoAd A03;
    @Nullable
    public C1B A04;
    @Nullable
    public C0408Eb A05;
    @Nullable
    public YN A06;
    public final C0887Xc A09;
    public final S2SRewardedVideoAdExtendedListener A0A;
    public final AnonymousClass24 A0B;
    public int A00 = 0;
    public boolean A08 = false;
    public long A01 = -1;
    public LD A07 = new LD();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0C = new byte[]{airhockey.J_ACHIEVEMENTCALLBACK, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, airhockey.P_GAME_EXIT, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, airhockey.P_GAME_REMATCH, 75, 86, 94, 75, 92, airhockey.P_GAME_EXIT, airhockey.P_GAME_EXIT, 23, 25, 96, 86, 76, 25, airhockey.P_GAME_EXIT, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, airhockey.J_ERROR, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, airhockey.P_GAME_EXIT, 6, 5, 11, 14, 3, 4, 13, airhockey.P_GAME_EXIT, 24, 15, 29, 11, 24, 14, 15, 14, airhockey.P_GAME_EXIT, 28, 3, 14, 15, 5, airhockey.P_GAME_EXIT, 11, 14, 92, 77, 84};
        if (A0D[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0B();
        A0E = ZF.class.getSimpleName();
    }

    public ZF(AnonymousClass24 anonymousClass24, AnonymousClass27 anonymousClass27, String str) {
        this.A0B = anonymousClass24;
        this.A09 = anonymousClass24.A0B;
        this.A0A = new Z8(str, anonymousClass27, this, anonymousClass24);
    }

    private void A0D(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        String A02;
        if (!this.A08 && this.A05 != null) {
            Log.w(A0E, A0A(0, 78, 100));
        }
        A0E(false);
        this.A08 = false;
        C01161p c01161p = new C01161p(this.A0B.A0C, JF.A06, AdPlacementType.REWARDED_VIDEO, JD.A07, 1);
        c01161p.A08(z);
        if (IK.A1x(this.A09) && (A02 = KU.A02(this.A09, this.A0B.A06)) != null) {
            AnonymousClass24 anonymousClass24 = this.A0B;
            String[] strArr = A0D;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0D[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            anonymousClass24.A06 = A02;
        }
        c01161p.A06(this.A0B.A06);
        c01161p.A07(this.A0B.A07);
        this.A05 = new C0408Eb(this.A0B.A0B, c01161p);
        this.A05.A0O(new ZH(this));
        this.A05.A0S(str, adExperienceType);
    }

    public void A0E(boolean z) {
        C0408Eb c0408Eb = this.A05;
        if (c0408Eb != null) {
            c0408Eb.A0O(new ZG(this));
            this.A05.A0T(z);
            this.A05 = null;
        }
    }

    public final long A0G() {
        C0408Eb c0408Eb = this.A05;
        if (c0408Eb != null) {
            return c0408Eb.A0D();
        }
        return -1L;
    }

    public final void A0H() {
        A0E(true);
    }

    public final void A0I() {
        YN yn = this.A06;
        if (yn != null) {
            yn.A02();
        }
    }

    public final void A0J(RewardData rewardData) {
        C0408Eb c0408Eb;
        this.A0B.A03 = rewardData;
        if (this.A08 && (c0408Eb = this.A05) != null) {
            c0408Eb.A0V(rewardData);
        }
    }

    public final void A0K(AdCompanionView adCompanionView) {
        C1B c1b;
        this.A06 = (YN) adCompanionView.getAdCompanionViewApi();
        C0887Xc c0887Xc = this.A09;
        if (c0887Xc != null && (c1b = this.A04) != null) {
            this.A06.A03(c0887Xc, (AbstractC0952Zs) c1b);
        }
    }

    public final void A0L(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0D(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0E, A0A(78, 31, 55), e);
            this.A0B.A0B.A07().A9C(A0A(109, 3, 96), C02627s.A0b, new C02637t(e));
            AdError internalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A0B.A0B.A0E().A2b(LC.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A0A.onError(this.A0B.A00(), internalError);
        }
    }

    public final boolean A0M() {
        C0408Eb c0408Eb = this.A05;
        return c0408Eb == null || c0408Eb.A0U();
    }

    public final boolean A0N() {
        return this.A08;
    }

    public final boolean A0O(int i, long j) {
        if (!this.A08) {
            this.A0A.onError(this.A0B.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        } else if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i);
            this.A05.A07.A03(j);
            this.A05.A0I();
            this.A08 = false;
            return true;
        } else {
            this.A08 = false;
            return false;
        }
    }
}
