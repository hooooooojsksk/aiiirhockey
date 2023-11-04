package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mobirix.airhockey.airhockey;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9V */
/* loaded from: assets/audience_network.dex */
public final class C9V {
    public static byte[] A0F;
    public long A00;
    public C9V A01;
    public C9W A02;
    public TrackGroupArray A03;
    public GN A04;
    public boolean A05;
    public boolean A06;
    public GN A07;
    public final VA A08;
    public final Object A09;
    public final InterfaceC0421Eo[] A0A;
    public final boolean[] A0B;
    public final ET A0C;
    public final GM A0D;
    public final InterfaceC03089n[] A0E;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{79, airhockey.J_ENEMYWIN, 102, airhockey.J_GAME_ENEMYEXIT, 99, 82, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_GAME_ENEMYEXIT, 109, 102, airhockey.P_GAME_EXIT, 109, airhockey.J_INVITE, 102, airhockey.J_ENEMYWIN, airhockey.J_GOO, 81, airhockey.J_ONREWARDED, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ENEMYLOSE, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, 33, airhockey.J_SAVEDGAME_SAVE, airhockey.J_ONREWARDED, 109, airhockey.J_ONREWARDED, 96, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_ONREWARDED, 33, airhockey.J_ENEMYWIN, 96, airhockey.J_ENEMYLOSE, 109, airhockey.J_ONREWARDED, airhockey.J_GAME_STANDBY, 47};
    }

    public C9V(InterfaceC03089n[] interfaceC03089nArr, long j, GM gm, GP gp, ET et, Object obj, C9W c9w) {
        this.A0E = interfaceC03089nArr;
        this.A00 = j - c9w.A03;
        this.A0D = gm;
        this.A0C = et;
        this.A09 = HD.A01(obj);
        this.A02 = c9w;
        this.A0A = new InterfaceC0421Eo[interfaceC03089nArr.length];
        this.A0B = new boolean[interfaceC03089nArr.length];
        VA A4T = et.A4T(c9w.A04, gp);
        this.A08 = c9w.A02 != Long.MIN_VALUE ? new BS(A4T, true, 0L, c9w.A02) : A4T;
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(com.facebook.ads.redexgen.X.GN r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.A00
            if (r2 >= r0) goto L19
            boolean r1 = r4.A00(r2)
            com.facebook.ads.redexgen.X.GK r0 = r4.A01
            com.facebook.ads.redexgen.X.GJ r0 = r0.A00(r2)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            r0.A5C()
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9V.A02(com.facebook.ads.redexgen.X.GN):void");
    }

    private void A03(GN gn) {
        GN gn2 = this.A07;
        this.A07 = gn;
        GN gn3 = this.A07;
        if (gn3 != null) {
            A02(gn3);
        }
    }

    private void A04(InterfaceC0421Eo[] interfaceC0421EoArr) {
        int i = 0;
        while (true) {
            InterfaceC03089n[] interfaceC03089nArr = this.A0E;
            int i2 = interfaceC03089nArr.length;
            if (i < i2) {
                if (interfaceC03089nArr[i].A7u() == 5 && this.A04.A00(i)) {
                    interfaceC0421EoArr[i] = new VF();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A05(InterfaceC0421Eo[] interfaceC0421EoArr) {
        int i = 0;
        while (true) {
            InterfaceC03089n[] interfaceC03089nArr = this.A0E;
            int i2 = interfaceC03089nArr.length;
            if (i < i2) {
                if (interfaceC03089nArr[i].A7u() == 5) {
                    interfaceC0421EoArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7B();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j) {
        return j - A07();
    }

    public final long A09(long j) {
        return A07() + j;
    }

    public final long A0A(long j, boolean z) {
        return A0B(j, z, new boolean[this.A0E.length]);
    }

    public final long A0B(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            int i2 = this.A04.A00;
            boolean z2 = false;
            if (i >= i2) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z && this.A04.A02(this.A07, i)) {
                z2 = true;
            }
            zArr2[i] = z2;
            i++;
        }
        A05(this.A0A);
        A03(this.A04);
        GK gk = this.A04.A01;
        long AEh = this.A08.AEh(gk.A01(), this.A0B, this.A0A, zArr, j);
        A04(this.A0A);
        this.A05 = false;
        int i3 = 0;
        while (true) {
            InterfaceC0421Eo[] interfaceC0421EoArr = this.A0A;
            if (i3 < interfaceC0421EoArr.length) {
                if (interfaceC0421EoArr[i3] != null) {
                    HD.A04(this.A04.A00(i3));
                    int i4 = this.A0E[i3].A7u();
                    if (i4 != 5) {
                        this.A05 = true;
                    }
                } else {
                    HD.A04(gk.A00(i3) == null);
                }
                i3++;
            } else {
                return AEh;
            }
        }
    }

    public final long A0C(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long A5w = this.A08.A5w();
        if (A5w == Long.MIN_VALUE && z) {
            return this.A02.A01;
        }
        return A5w;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AE9(((BS) this.A08).A05);
            } else {
                this.A0C.AE9(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e(A00(0, 17, 28), A00(17, 22, 31), e);
        }
    }

    public final void A0E(float f) throws C9F {
        this.A06 = true;
        this.A03 = this.A08.A7t();
        A0I(f);
        long A0A = A0A(this.A02.A03, false);
        long j = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j + (newStartPositionUs - A0A);
        this.A02 = this.A02.A01(A0A);
    }

    public final void A0F(long j) {
        this.A08.A4D(A08(j));
    }

    public final void A0G(long j) {
        if (this.A06) {
            this.A08.AE0(A08(j));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A5w() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f) throws C9F {
        GJ[] A01;
        GN A0T = this.A0D.A0T(this.A0E, this.A03);
        GN selectorResult = this.A07;
        if (A0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = A0T;
        GN selectorResult2 = this.A04;
        for (GJ gj : selectorResult2.A01.A01()) {
            if (gj != null) {
                gj.AC2(f);
            }
        }
        return true;
    }
}
