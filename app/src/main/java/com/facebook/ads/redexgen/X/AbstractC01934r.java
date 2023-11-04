package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.mobirix.airhockey.airhockey;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.4r */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01934r {
    public static byte[] A0I;
    public static String[] A0J = {"RjjM", "koSvj4DxhDjUOCe4EMKks9dnOG3CuiGu", "aGHSBrQSfGZtxcbyILmCKrnGyIhpjEzu", "3xCBACovNHKuv2JvT7we0utPzpikn", "cVLYlYPRz01pIgpGABaAmbt5GOW22sRw", "rNQ6SroUNOr34Wm88sisB9VlrwVLSnji", "gjKr", "5vAD1AgEgb1ZXBUPAvYh"};
    public static final List<Object> A0K;
    public E9 A08;
    public WeakReference<E9> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public AbstractC01934r A06 = null;
    public AbstractC01934r A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public C01834h A0F = null;
    public boolean A0G = false;
    public int A0E = 0;
    @VisibleForTesting
    public int A02 = -1;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0I = new byte[]{airhockey.J_ACHIEVEMENTCALLBACK, 49, 60, airhockey.J_GAME_STANDBY, 89, 16, 30, 23, 22, 11, 28, 29, airhockey.J_GAME_ENEMYEXIT, 34, 37, 61, 42, 39, 34, 47, 9, airhockey.P_GAME_MYWIN, airhockey.P_GAME_BREAKBALLCOUNT, 9, 89, airhockey.P_GAME_MYLOSE, 91, 76, airhockey.P_GAME_MYWIN, 93, 20, 90, 91, 64, 20, airhockey.P_GAME_BREAKBALLCOUNT, 81, 87, 77, 87, 88, 85, 86, 88, 81, 28, 123, 43, 52, 40, 50, 47, 50, 52, 53, 102, airhockey.J_SAVEDGAME_RELOAD, 32, 55, 63, 61, 36, 55, 54, 18, 65, 81, 64, 83, airhockey.P_NATION, 18, 25, 77, 84, airhockey.P_GAME_REMATCH, 125, 92, 77, 88, 90, 81, 92, 93, 58, 111, airhockey.J_DISCONNECT, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, 111, airhockey.J_DISCONNECT, 126, airhockey.J_ONREWARDED, 49, 42, 32, 33, 34, 45, 42, 33, 32, airhockey.J_ONREWARDED, 37, 32, 37, 52, 48, 33, 54, airhockey.J_ONREWARDED, 52, 43, 55, 45, 48, 45, 43, 42, 41, 124, airhockey.J_WAIT, 109, airhockey.J_ENEMYLOSE, 125, airhockey.J_GAME_DISCONNECT, 81, 22, 26, 85, 86, 94, airhockey.J_GAME_EXIT, 85, airhockey.P_GAME_REMATCH, 7, 76, 64, 16, 44, 16, 15, 19, 90, 96, 95, 83, 65, airhockey.P_GAME_STANDBY, airhockey.J_PURCHASE, airhockey.J_REWARD, airhockey.J_ONREWARDED, 91, 124, ByteCompanionObject.MAX_VALUE, 119, airhockey.J_REWARD, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_REWARD, 76, 89, 89, 76, 78, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYLOSE, airhockey.P_GAME_REMATCH, 126, 78, 95, 76, 93, airhockey.J_GOO, 95, airhockey.J_ENEMYWIN, airhockey.J_GAME_DISCONNECT, airhockey.J_GAME_STANDBY, airhockey.J_GAME_EXIT, 99, airhockey.J_SDKVER, 87, airhockey.J_ENEMYWIN, airhockey.J_REWARD, airhockey.J_GAME_STANDBY, airhockey.J_DISCONNECT, 89, 48, 42, 11, 60, 58, 32, 58, 53, 56, 59, 53, 60, airhockey.J_WAIT, 61, 60, 58, 43, 60, 52, 60, 55, 45, 60, 61, airhockey.J_WAIT, 59, 60, 53, 54, 46, airhockey.J_WAIT, airhockey.J_GAME_REMATCH, 99, airhockey.J_WAIT, 44, 55, 52, 56, 45, 58, 49, 60, 61, airhockey.J_WAIT, 41, 56, 48, 43, airhockey.J_WAIT, 54, 63, airhockey.J_WAIT, 42, 60, 45, 16, 42, 11, 60, 58, 32, 56, 59, 53, 60, airhockey.J_BACK, airhockey.J_GOO, airhockey.J_WAIT, 58, 56, 53, 53, 42, airhockey.J_WAIT, 63, 54, 43, airhockey.J_WAIT, 31, 2, 19, 27, 32, 31, 19, 1, 86, 27, 23, 15, 86, 24, 25, 2, 86, 20, 19, 86, 24, 3, 26, 26, 19};
        String[] strArr = A0J;
        if (strArr[5].charAt(21) != strArr[1].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[5] = "ATZarWDBMn8zDwozKxOA19Yjdj8cqMYP";
        strArr2[1] = "9Y2h7opSRjFz5DGljetO79QOLWaAi3pM";
    }

    static {
        A04();
        A0K = Collections.EMPTY_LIST;
    }

    public AbstractC01934r(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A02(264, 24, 92));
    }

    private void A03() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    public void A07(E9 e9) {
        this.A0E = C3E.A00(this.A0H);
        e9.A22(this, 4);
    }

    public void A08(E9 e9) {
        e9.A22(this, this.A0E);
        this.A0E = 0;
    }

    public boolean A09() {
        return (this.A0C & 16) == 0 && C3E.A0G(this.A0H);
    }

    public boolean A0A() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0B() {
        return (this.A0C & 512) != 0 || A0b();
    }

    public final int A0G() {
        E9 e9 = this.A08;
        if (e9 == null) {
            return -1;
        }
        return e9.A1C(this);
    }

    public final int A0H() {
        return this.A00;
    }

    public final int A0I() {
        int i = this.A04;
        return i == -1 ? this.A03 : i;
    }

    public final int A0J() {
        return this.A01;
    }

    public final long A0K() {
        return this.A05;
    }

    public final List<Object> A0L() {
        if ((this.A0C & 1024) == 0) {
            List<Object> list = this.A0A;
            if (list != null) {
                int size = list.size();
                if (A0J[2].charAt(8) == 'd') {
                    throw new RuntimeException();
                }
                String[] strArr = A0J;
                strArr[5] = "2DcmVbWbN7IXAuYZB7QLz9ixHDr4nD2H";
                strArr[1] = "B34awafHihlIJm5KsMjOG9HfWfhHTq0p";
                if (size != 0) {
                    return this.A0B;
                }
            }
            return A0K;
        }
        return A0K;
    }

    public final void A0M() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0N() {
        List<Object> list = this.A0A;
        if (list != null) {
            list.clear();
        }
        this.A0C &= -1025;
    }

    public final void A0O() {
        this.A0C &= -33;
    }

    public final void A0P() {
        this.A0C &= -257;
    }

    public final void A0Q() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0N();
        this.A0E = 0;
        this.A02 = -1;
        E9.A0s(this);
    }

    public final void A0R() {
        if (this.A01 == -1) {
            this.A01 = this.A03;
        }
    }

    public final void A0S() {
        this.A0F.A0c(this);
    }

    public final void A0T(int i) {
        this.A0C |= i;
    }

    public final void A0U(int i, int i2) {
        this.A0C = (this.A0C & (i2 ^ (-1))) | (i & i2);
    }

    public final void A0V(int i, int i2, boolean z) {
        A0T(8);
        A0W(i2, z);
        this.A03 = i;
    }

    public final void A0W(int i, boolean z) {
        if (this.A01 == -1) {
            this.A01 = this.A03;
        }
        if (this.A04 == -1) {
            this.A04 = this.A03;
        }
        if (z) {
            this.A04 += i;
        }
        this.A03 += i;
        if (this.A0H.getLayoutParams() != null) {
            ((C01774a) this.A0H.getLayoutParams()).A01 = true;
        }
    }

    public final void A0X(C01834h c01834h, boolean z) {
        this.A0F = c01834h;
        this.A0G = z;
    }

    public final void A0Y(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A03();
            this.A0A.add(obj);
            return;
        }
        A0T(1024);
    }

    public final void A0Z(boolean z) {
        int i = this.A0D;
        this.A0D = z ? i - 1 : i + 1;
        if (A0J[4].charAt(7) != 'R') {
            throw new RuntimeException();
        }
        A0J[7] = "l8mjsSEKM";
        int i2 = this.A0D;
        if (i2 < 0) {
            this.A0D = 0;
            Log.e(A02(143, 4, 28), A02(186, 78, 115) + this);
        } else if (!z && i2 == 1) {
            int i3 = this.A0C | 16;
            String[] strArr = A0J;
            if (strArr[5].charAt(21) != strArr[1].charAt(21)) {
                throw new RuntimeException();
            }
            A0J[2] = "drml3nLoX5pQWQBc32bzozsnTExNEnJK";
            this.A0C = i3;
        } else if (!z || this.A0D != 0) {
        } else {
            this.A0C &= -17;
        }
    }

    public final boolean A0a() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0b() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0c() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0d() {
        return this.A0F != null;
    }

    public final boolean A0e() {
        return (this.A0C & 256) != 0;
    }

    public final boolean A0f() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0h() {
        return (this.A0C & 128) != 0;
    }

    public final boolean A0i() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0j() {
        return (this.A0C & 16) == 0 && !C3E.A0G(this.A0H);
    }

    public final boolean A0k(int i) {
        return (this.A0C & i) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d4, code lost:
        if (r4.getParent() == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
        if (r4.getParent() == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a7, code lost:
        r3.append(A02(20, 10, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b3, code lost:
        r3.append(A02(288, 1, 68));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c3, code lost:
        return r3.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC01934r.toString():java.lang.String");
    }
}
