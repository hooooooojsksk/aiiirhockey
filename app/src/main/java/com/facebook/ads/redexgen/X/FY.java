package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FY {
    public static byte[] A0M;
    public static String[] A0N = {"bEAjJCvVtkePzUcw9rvynCWhWZ7YtTC", "sFv5If9m5Sphdt63zNjPhUbGsirLMRkb", "dm26J1OSzusJji0dpgrnr09k5LC689lq", "Nx5OZNPL7zWyatFSZAWV1dERcLRuFkfb", "8nXEVS4hfg5ng3YQnnC7NT8u0hAmIJYk", "i1gAYPXKkwHe1sE5BOr5igG8IxAvgiYs", "Y1prefJax7dGS9GUqUH50jWlMMgJtsPr", "K9Y4TfEKpnP3QqzXtNTgN9rOyJLVMPLw"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0M = new byte[]{81, airhockey.J_GAME_EXIT, airhockey.J_SDKVER, 124, airhockey.J_DISCONNECT, airhockey.J_SDKVER, airhockey.J_ENEMYWIN, airhockey.J_GOO, airhockey.J_SDKVER, 96, 36, airhockey.J_INVITE, airhockey.J_BACK, 119, airhockey.J_GOO, 109, airhockey.J_NATION, 109, airhockey.J_ENEMYWIN, airhockey.J_GAME_STANDBY, airhockey.J_GOO, 109, airhockey.J_GAME_ENEMYEXIT, airhockey.J_GAME_EXIT, 36, airhockey.J_SAVEDGAME_RELOAD, airhockey.J_GAME_STANDBY, airhockey.J_ENEMYLOSE, airhockey.J_BACK, airhockey.J_SDKVER, 62, 36};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.V4 A05() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FY.A05():com.facebook.ads.redexgen.X.V4");
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        A0O = A01(0, 0, 0, 0);
        A0Q = A01(0, 0, 0, 3);
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        int i = A0O;
        int i2 = A0Q;
        A0U = new int[]{i, i2, i, i, i2, i, i};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{i, i, i, i, i, i2, i2};
    }

    public FY() {
        A08();
    }

    public static int A00(int i, int i2, int i3) {
        return A01(i, i2, i3, 0);
    }

    public static int A01(int i, int i2, int i3, int i4) {
        int alpha;
        HD.A00(i, 0, 4);
        HD.A00(i2, 0, 4);
        HD.A00(i3, 0, 4);
        HD.A00(i4, 0, 4);
        if (i4 == 0 || i4 == 1) {
            alpha = 255;
        } else if (i4 == 2) {
            alpha = 127;
        } else if (i4 != 3) {
            alpha = 255;
        } else {
            alpha = 0;
        }
        int argb = Color.argb(alpha, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        if (A0N[3].charAt(10) != 'W') {
            throw new RuntimeException();
        }
        A0N[6] = "8rUrM1V8E4s8KseOh9tsUeZXjOFK47E1";
        return argb;
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            int i = this.A04;
            int length2 = A0N[0].length();
            if (length2 != 31) {
                throw new RuntimeException();
            }
            A0N[4] = "UcnYu1PwHAGC3vbuX83YmC5zO9IPxpwr";
            if (i != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A0K.delete(length2, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i = A0O;
        this.A0E = i;
        this.A03 = A0P;
        this.A01 = i;
    }

    public final void A09(char c) {
        if (c == '\n') {
            this.A0L.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if (this.A0I) {
                    int size = this.A0L.size();
                    int i = this.A0B;
                    if (A0N[3].charAt(10) != 'W') {
                        throw new RuntimeException();
                    }
                    A0N[0] = "z94yFfaTy8Odmt8n2fLZMjDbCxUThPz";
                    if (size >= i) {
                        continue;
                        this.A0L.remove(0);
                    }
                }
                if (this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c);
        }
    }

    public final void A0A(int i, int i2) {
        if (this.A0A != i) {
            A09('\n');
        }
        this.A0A = i;
    }

    public final void A0B(int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.A04 != -1 && (i5 = this.A03) != i) {
            this.A0K.setSpan(new ForegroundColorSpan(i5), this.A04, this.A0K.length(), 33);
        }
        if (i != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i;
        }
        if (this.A02 != -1 && (i4 = this.A01) != i2) {
            this.A0K.setSpan(new BackgroundColorSpan(i4), this.A02, this.A0K.length(), 33);
        }
        if (i2 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i2;
        }
    }

    public final void A0C(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
        if (this.A06 != -1) {
            if (!z) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z) {
            this.A06 = this.A0K.length();
        }
        int i6 = this.A0C;
        if (A0N[3].charAt(10) != 'W') {
            throw new RuntimeException();
        }
        A0N[3] = "GaQXCBjIxpWixMOvnA1JS7CVs7IBjZSt";
        if (i6 != -1) {
            if (!z2) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
            }
        } else if (!z2) {
        } else {
            this.A0C = this.A0K.length();
        }
    }

    public final void A0D(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.A0E = i;
        this.A07 = i6;
    }

    public final void A0E(boolean z) {
        this.A0J = z;
    }

    public final void A0F(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A0G = true;
        this.A0J = z;
        this.A0I = z2;
        this.A09 = i;
        this.A0H = z4;
        this.A0D = i2;
        this.A05 = i3;
        this.A00 = i6;
        if (this.A0B != i4 + 1) {
            int i9 = i4 + 1;
            if (A0N[1].charAt(10) == 's') {
                throw new RuntimeException();
            }
            A0N[5] = "GL1AptVbsbHBPnQiC9PDsuTMTdKpKMZ4";
            this.A0B = i9;
            while (true) {
                if ((!z2 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                }
                this.A0L.remove(0);
            }
        }
        if (i7 != 0 && this.A0F != i7) {
            this.A0F = i7;
            int i10 = i7 - 1;
            A0D(A0U[i10], A0Q, A0Y[i10], 0, A0W[i10], A0X[i10], A0V[i10]);
        }
        if (i8 != 0 && this.A08 != i8) {
            this.A08 = i8;
            int i11 = i8 - 1;
            A0C(0, 1, 1, false, false, A0S[i11], A0T[i11]);
            A0B(A0P, A0R[i11], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        return !A0G() || (this.A0L.isEmpty() && this.A0K.length() == 0);
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
