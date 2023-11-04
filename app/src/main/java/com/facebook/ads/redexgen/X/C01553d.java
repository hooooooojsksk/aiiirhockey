package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.mobirix.airhockey.airhockey;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.facebook.ads.redexgen.X.3d */
/* loaded from: assets/audience_network.dex */
public final class C01553d {
    public static byte[] A02;
    public static String[] A03 = {"IVmNZ4K5ijrEy03SUyZllrwYfGsSidsw", "uaVeZCSsPKZMiFLhWQ93bkOuh7Bkr", "fj8UDgC4HzdO2kuBNBPUB7GtanmKKm25", "SYZpn4btE2JdKC0jqJVDdFV7Ab7Ex928", "9XKyAy0QwW2RAbyuAC0HJ7gQU9o6NjRH", "LWQKQsADjd8kwxodkBq3bJfZv3R2tuNQ", "ttD9SROXIamLqNqjpH0jHeP07ZacbL3Q", "0sQtHWJTsFmoyuVwvJXQHcjInEg1c"};
    public static final C3Z A04;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYWIN, 90, 65, 58, 53, 46, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, 123, 96, airhockey.J_GAME_EXIT, 125, airhockey.P_GAME_MYWIN, 96, 94, 111, 124, airhockey.J_GAME_ENEMYEXIT, 96, airhockey.J_PURCHASE, 52, 46, 43, 48, airhockey.J_SAVEDGAME_RELOAD, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, 126, airhockey.J_DISCONNECT, 99, 89, 126, airhockey.P_GAME_MYSCORE, airhockey.J_SAVEDGAME_SAVE, airhockey.J_NATION, airhockey.J_ERROR, airhockey.J_ERROR, 126, 42, 48, 52, 47, airhockey.J_GAME_DISCONNECT, airhockey.J_ENEMYWIN, airhockey.J_GAME_EXIT, airhockey.J_GAME_DISCONNECT, airhockey.J_ONREWARDED, airhockey.J_INVITE, 109, 99, airhockey.J_GAME_EXIT, 53, 47, 56, 35, 96, airhockey.J_GAME_ENEMYEXIT, 102, 96, airhockey.J_ENEMYLOSE, 102, airhockey.J_ENEMYWIN, 57, 35, 59, 32, 99, airhockey.J_GAME_DISCONNECT, airhockey.J_SDKVER, airhockey.J_SAVEDGAME_SAVE, airhockey.J_SAVEDGAME_SAVE, 78, airhockey.J_SDKVER, 109, airhockey.J_GAME_STANDBY, 58, 32, 50, 41, airhockey.J_GAME_EXIT, airhockey.J_GAME_STANDBY, 96, airhockey.J_GAME_EXIT, airhockey.J_NATION, airhockey.J_ENEMYLOSE, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_STANDBY, airhockey.J_GAME_DISCONNECT, 51, 41, 88, airhockey.P_GAME_MYSCORE, 0, 12, 13, 23, 6, 13, 23, 39, 6, 16, 0, 17, 10, 19, 23, 10, 12, 13, 89, airhockey.P_GAME_MYSCORE, 49, 42, 111, airhockey.J_ONREWARDED, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, 102, 111, airhockey.J_INVITE, 48, 42, 64, 91, 29, 20, 24, 14, 8, 26, 25, 23, 30, 65, 91, 52, 47, airhockey.J_GAME_REMATCH, 96, airhockey.J_GAME_DISCONNECT, airhockey.J_PURCHASE, 124, airhockey.J_GAME_EXIT, airhockey.J_GAME_ENEMYEXIT, 53, 47, 60, 39, airhockey.J_GAME_ENEMYEXIT, airhockey.J_ENEMYLOSE, airhockey.J_GAME_REMATCH, 96, airhockey.P_GAME_SELECTMAP, airhockey.J_GAME_ENEMYEXIT, airhockey.J_INVITE, airhockey.J_ONREWARDED, airhockey.J_GAME_DISCONNECT, 102, airhockey.J_GAME_STANDBY, airhockey.J_GAME_ENEMYEXIT, airhockey.J_NATION, 61, 39, 36, 63, 111, 126, 124, airhockey.J_DISCONNECT, 126, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_PURCHASE, 81, 126, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_PURCHASE, 37, 63, 7, 28, 76, 93, 79, 79, 75, 83, 78, 88, 6, 28, 22, 13, 94, 78, 95, airhockey.P_NATION, 65, 65, 76, 79, 65, airhockey.P_GAME_MYLOSE, 23, 13, 29, 6, 85, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_STANDBY, 82, airhockey.P_GAME_MYSCORE, airhockey.P_NATION, 28, 6, 80, 75, 31, 14, 19, 31, 81, 75, ByteCompanionObject.MAX_VALUE, airhockey.J_ONREWARDED, 50, 45, 33, 51, 13, 32, 126, airhockey.J_ONREWARDED, 33, 35, 52, 41, 47, 46, 63, 33, 35, 35, 37, 51, 51, 41, 34, 41, 44, 41, 52, 57, 63, 38, 47, 35, 53, 51, 109, 111, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_GAME_STANDBY, 99, airhockey.J_NATION, airhockey.J_SAVEDGAME_SAVE, 111, 96, airhockey.J_GAME_REMATCH, 109, 126, airhockey.J_SAVEDGAME_SAVE, 109, 111, 111, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, ByteCompanionObject.MAX_VALUE, airhockey.J_GAME_STANDBY, airhockey.J_INVITE, airhockey.J_GAME_STANDBY, 96, airhockey.J_GAME_STANDBY, airhockey.J_ACHIEVEMENTCALLBACK, airhockey.J_ERROR, airhockey.J_SAVEDGAME_SAVE, airhockey.J_GAME_EXIT, 99, 111, airhockey.J_WAIT, ByteCompanionObject.MAX_VALUE, 32, 34, 53, 40, 46, 47, 62, 34, 45, 36, 32, 51, 62, 39, 46, 34, 52, 50, 51, 49, 38, 59, 61, 60, 45, 49, 62, 55, 51, 32, 45, 33, 55, 62, 55, 49, 38, 59, 61, 60, 25, 27, 12, 17, 23, 22, 7, 27, 20, 17, 27, 19, airhockey.P_GAME_STANDBY, airhockey.P_GAME_MYWIN, 80, 77, 75, airhockey.P_GAME_EXIT, 91, airhockey.P_GAME_MYWIN, 75, 84, 93, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_REMATCH, 126, 99, airhockey.J_GAME_STANDBY, airhockey.J_ONREWARDED, airhockey.J_ERROR, airhockey.J_GAME_REMATCH, ByteCompanionObject.MAX_VALUE, 126, 8, 10, 29, 0, 6, 7, 22, 15, 6, 10, 28, 26, 63, 61, 42, 55, 49, 48, 33, 50, 49, 48, 57, 33, 61, 50, 55, 61, 53, 90, 88, 79, 82, 84, 85, airhockey.P_GAME_SELECTMAP, 85, 94, airhockey.P_GAME_MYSCORE, 79, airhockey.P_GAME_SELECTMAP, 90, 79, airhockey.P_GAME_SELECTMAP, 86, 84, 77, 94, 86, 94, 85, 79, airhockey.P_GAME_SELECTMAP, 92, airhockey.P_GAME_REMATCH, 90, 85, 78, 87, 90, airhockey.P_GAME_REMATCH, 82, 79, airhockey.P_NATION, 78, 76, 91, airhockey.P_GAME_BREAKBALLCOUNT, 64, 65, 80, 65, airhockey.P_GAME_EXIT, 87, 91, 80, airhockey.P_GAME_MYWIN, 91, airhockey.P_NATION, airhockey.P_GAME_MYSCORE, 80, airhockey.P_GAME_EXIT, airhockey.P_GAME_MYSCORE, airhockey.P_GAME_EXIT, airhockey.P_NATION, airhockey.P_GAME_EXIT, 65, 91, 34, 32, 55, 42, 44, 45, 60, 51, 34, 48, 55, 38, 21, 23, 0, 29, 27, 26, 11, 4, 6, 17, 2, 29, 27, 1, 7, 11, 21, 0, 11, 25, 27, 2, 17, 25, 17, 26, 0, 11, 19, 6, 21, 26, 1, 24, 21, 6, 29, 0, 13, 45, 47, 56, 37, 35, 34, 51, 60, 62, 41, 58, 37, 35, 57, 63, 51, 36, 56, 33, 32, 51, 41, 32, 41, 33, 41, 34, 56, 14, 12, 27, 6, 0, 1, 16, 28, 12, 29, 0, 3, 3, 16, 13, 14, 12, 4, 24, 14, 29, 11, 4, 6, 17, 12, 10, 11, 26, 22, 6, 23, 10, 9, 9, 26, 3, 10, 23, 18, 4, 23, 1, 34, 32, 55, 42, 44, 45, 60, 48, 38, 47, 38, 32, 55, 52, 54, 33, 60, 58, 59, 42, 38, 48, 33, 42, 38, 48, 57, 48, 54, 33, 60, 58, 59, 24, 26, 13, 16, 22, 23, 6, 12, 23, 18, 23, 22, 14, 23, 87};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new C0P() { // from class: com.facebook.ads.redexgen.X.05
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            A04 = new C0P();
        } else if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C0Z();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A04 = new C00770b();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A04 = new C01061f();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A04 = new C3Y();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A04 = new EF();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A04 = new C0922Yl();
        } else {
            A04 = new C3Z();
        }
    }

    public C01553d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static C01553d A01(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C01553d(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return A08(577, 13, 24);
                    case 8:
                        return A08(312, 22, 9);
                    case 16:
                        return A08(334, 12, 35);
                    case 32:
                        return A08(379, 17, 5);
                    case 64:
                        return A08(236, 26, 27);
                    case 128:
                        String[] strArr = A03;
                        if (strArr[2].charAt(30) != strArr[6].charAt(30)) {
                            String[] strArr2 = A03;
                            strArr2[0] = "Wsn1vJkw9zMZ1dCIcpdhA48NRIlsHibC";
                            strArr2[3] = "yyZsxnBpb3hGEtLyBJQzoNk7OwP5So5E";
                            return A08(262, 32, 87);
                        }
                        throw new RuntimeException();
                    case 256:
                        return A08(396, 35, 96);
                    case 512:
                        return A08(467, 39, 47);
                    case 1024:
                        return A08(431, 24, 116);
                    case 2048:
                        return A08(506, 28, 23);
                    case 4096:
                        return A08(556, 21, 62);
                    case 8192:
                        return A08(534, 22, 52);
                    case 16384:
                        return A08(346, 11, 127);
                    case 32768:
                        return A08(455, 12, 24);
                    case 65536:
                        return A08(357, 10, 81);
                    case 131072:
                        return A08(590, 20, 14);
                    default:
                        return A08(610, 14, 34);
                }
            }
            return A08(294, 18, 26);
        }
        return A08(367, 12, 50);
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i) {
        this.A01.addAction(i);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((C01523a) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((C01533b) obj).A00);
    }

    public final void A0R(boolean z) {
        this.A01.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C01553d c01553d = (C01553d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (accessibilityNodeInfo == null) {
            if (c01553d.A01 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c01553d.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        sb.append(A08(5, 18, 117) + rect);
        A0B(rect);
        sb.append(A08(23, 18, 107) + rect);
        sb.append(A08(165, 15, 100));
        sb.append(A04());
        sb.append(A08(65, 13, 123));
        sb.append(A02());
        sb.append(A08(218, 8, 16));
        sb.append(A05());
        sb.append(A08(91, 22, 24));
        sb.append(A03());
        sb.append(A08(226, 10, 63));
        sb.append(A06());
        sb.append(A08(41, 13, 116));
        sb.append(A0C());
        sb.append(A08(54, 11, 120));
        sb.append(A0D());
        sb.append(A08(124, 13, 0));
        sb.append(A0G());
        sb.append(A08(137, 11, 116));
        sb.append(A0H());
        sb.append(A08(HttpStatus.SC_PARTIAL_CONTENT, 12, 93));
        sb.append(A0L());
        sb.append(A08(78, 13, 114));
        sb.append(A0E());
        sb.append(A08(148, 17, 124));
        sb.append(A0I());
        sb.append(A08(113, 11, 113));
        sb.append(A0F());
        sb.append(A08(180, 12, 71));
        sb.append(A0J());
        sb.append(A08(192, 14, 86) + A0K());
        sb.append(A08(2, 3, 26));
        int action = A00();
        while (action != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(action);
            action &= numberOfTrailingZeros ^ (-1);
            sb.append(A07(numberOfTrailingZeros));
            if (action != 0) {
                sb.append(A08(0, 2, 60));
            }
        }
        sb.append(A08(624, 1, 113));
        return sb.toString();
    }
}
