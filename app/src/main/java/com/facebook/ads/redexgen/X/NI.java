package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class NI {
    public static byte[] A09;
    @Nullable
    public NH A00;
    public boolean A01;
    public boolean A02;
    public final C0887Xc A03;
    public final InterfaceC0505Ia A04;
    public final LD A05;
    public final InterfaceC0587Lj A06;
    @Nullable
    public final QA A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, airhockey.J_SAVEDGAME_RELOAD, airhockey.P_GAME_STANDBY, airhockey.P_GAME_STANDBY, 88, airhockey.P_GAME_STANDBY, 23, 82, 79, 82, 84, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 94, 89, 80, 23, 86, 84, airhockey.P_GAME_MYSCORE, 94, 88, 89, airhockey.P_GAME_REMATCH, 126, 126, 99, 126, 44, 123, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 96, airhockey.J_GAME_REMATCH, 44, 99, 124, airhockey.J_GAME_REMATCH, airhockey.J_NATION, airhockey.J_GAME_STANDBY, airhockey.J_NATION, airhockey.J_GAME_ENEMYEXIT, 44};
    }

    public NI(C0887Xc c0887Xc, String str, @Nullable QA qa, LD ld, InterfaceC0505Ia interfaceC0505Ia) {
        this.A01 = true;
        this.A03 = c0887Xc;
        this.A08 = str;
        this.A07 = qa;
        this.A05 = ld;
        this.A04 = interfaceC0505Ia;
        this.A06 = new C0760Sb(this);
    }

    public NI(C0887Xc c0887Xc, String str, @Nullable QA qa, LD ld, InterfaceC0505Ia interfaceC0505Ia, InterfaceC0587Lj interfaceC0587Lj) {
        this.A01 = true;
        this.A03 = c0887Xc;
        this.A08 = str;
        this.A07 = qa;
        this.A05 = ld;
        this.A04 = interfaceC0505Ia;
        this.A06 = interfaceC0587Lj;
    }

    public static void A03(C0887Xc c0887Xc, @Nullable QA qa, LD ld, InterfaceC0505Ia interfaceC0505Ia, C1M c1m, String str) {
        AbstractC00810f A01 = C00820g.A01(c0887Xc, interfaceC0505Ia, str, KT.A00(c1m.A05()), new NA().A03(qa).A02(ld).A05(), false, false);
        if (A01 != null) {
            A01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> extraData) {
        this.A04.A9a(str, extraData);
        Kj.A00(new NF(this, extraData, str, str2), new NG(this, str, extraData), ActivityUtils.A00());
    }

    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC00810f A012 = C00820g.A01(this.A03, this.A04, str, KT.A00(str2), new NA(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (A012 != null) {
                A012.A0C();
            }
            if (this.A00 != null) {
                this.A00.AAe();
            }
            this.A06.A3t(this.A08);
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            Log.e(A01, A01(22, 22, 95), e2);
        }
    }

    public final void A07(NH nh) {
        this.A00 = nh;
    }

    public final void A08(String str, String str2, Map<String, String> extraData) {
        new C0513Ii(str, this.A04).A04(EnumC0512Ih.A0J, null);
        if (this.A05.A09(this.A03)) {
            this.A04.A98(str, extraData);
        } else if (IK.A1B(this.A03)) {
            A05(str, str2, extraData);
        } else {
            A06(str, str2, extraData);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}
