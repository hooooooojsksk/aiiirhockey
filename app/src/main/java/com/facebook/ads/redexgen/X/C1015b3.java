package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.b3 */
/* loaded from: assets/audience_network.dex */
public final class C1015b3 {
    @Nullable
    public InterfaceC1018b6 A00;
    @Nullable
    public InterfaceC1016b4 A01;
    public C1003ar A02;
    public final InterfaceC1025bD A04;
    @Nullable
    public final InterfaceC1017b5 A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    @VisibleForTesting
    public final InterfaceC1016b4 A03 = new C0450Ft(this);

    public C1015b3(InterfaceC1025bD interfaceC1025bD, @Nullable InterfaceC1017b5 interfaceC1017b5) {
        this.A04 = interfaceC1025bD;
        this.A05 = interfaceC1017b5;
    }

    public static C1015b3 A01() {
        return new C1015b3(new C0454Fx(), null);
    }

    private void A03(AbstractC1019b7 abstractC1019b7, InterfaceC1023bB interfaceC1023bB, InterfaceC0449Fs interfaceC0449Fs) {
        this.A02 = C1003ar.A00(abstractC1019b7, interfaceC1023bB, interfaceC0449Fs);
        InterfaceC1018b6 interfaceC1018b6 = this.A00;
        if (interfaceC1018b6 != null) {
            this.A02.A03(interfaceC1018b6);
        }
        this.A02.A04(this.A03);
    }

    public final void A04(View view) {
        this.A02.A01(view);
    }

    public final void A05(View view, C1021b9 c1021b9) {
        this.A02.A02(view, c1021b9);
    }

    public final void A06(AbstractC1019b7 abstractC1019b7, View view) {
        A03(abstractC1019b7, new C0453Fw(view, this.A04), new InterfaceC0449Fs(this.A05) { // from class: com.facebook.ads.redexgen.X.3m
            public static byte[] A09;
            public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A0B;
            public long A00;
            @Nullable
            public InterfaceC1018b6 A01;
            @Nullable
            public final InterfaceC1017b5 A02;
            public final Map<String, C1007av> A06 = new HashMap();
            public final C1008aw A04 = new C1008aw();
            public final C1008aw A03 = new C1008aw();
            public final List<Rect> A05 = new ArrayList(1);
            public final boolean A08 = false;
            public final boolean A07 = false;

            public static String A02(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A09 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, airhockey.J_REWARD, 125, 111, 75, 123, airhockey.J_WAIT, airhockey.J_REWARD, 63, 36, 61, 61, airhockey.J_BACK, 39, 56, 52, 38, airhockey.J_BACK, 33, 35, 62, 33, 52, 35, 37, 40, airhockey.J_BACK, 55, 62, 35, airhockey.J_BACK, 35, 52, 60, 62, 39, 52, 53, airhockey.J_BACK, 56, 37, 52, 60, airhockey.J_BACK, 125, airhockey.J_SDKVER, airhockey.J_ENEMYLOSE, airhockey.J_PURCHASE, 92, airhockey.J_GAME_ENEMYEXIT, 126, airhockey.J_SDKVER, 124, airhockey.J_PURCHASE};
            }

            static {
                A03();
                A0B = C01633m.class.getSimpleName();
            }

            {
                this.A02 = interfaceC1017b5;
            }

            public static Rect A00(@Nullable C1007av c1007av) {
                Rect rect;
                Rect rect2;
                Rect rect3;
                Rect rect4;
                Rect rect5;
                if (c1007av != null) {
                    rect = c1007av.A02;
                    if (rect.top != Integer.MIN_VALUE) {
                        rect2 = c1007av.A02;
                        if (rect2.left != Integer.MIN_VALUE) {
                            rect3 = c1007av.A02;
                            String[] strArr = A0A;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[1] = "p";
                            strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                            if (rect3.right != Integer.MIN_VALUE) {
                                rect4 = c1007av.A02;
                                if (rect4.bottom != Integer.MIN_VALUE) {
                                    rect5 = c1007av.A02;
                                    return rect5;
                                }
                            }
                        }
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1007av A01(C1021b9 c1021b9, Rect rect, Rect rect2) {
                boolean A06;
                Rect rect3;
                List list;
                C1007av c1007av = this.A06.get(c1021b9.A04);
                A06 = this.A04.A06(c1021b9);
                if (A06) {
                    if (c1007av != null) {
                        c1007av.A01 = EnumC1011az.A04;
                    } else {
                        c1007av = C1007av.A03(this.A00);
                        this.A06.put(c1021b9.A04, c1007av);
                    }
                }
                rect3 = c1007av.A02;
                rect3.set(rect2);
                list = c1007av.A03;
                list.add(new Rect(rect));
                return c1007av;
            }

            private void A04(C1008aw c1008aw) {
                Collection<C1021b9> A01;
                List list;
                A01 = c1008aw.A01();
                for (C1021b9 c1021b9 : A01) {
                    C1007av c1007av = this.A06.get(c1021b9.A04);
                    if (c1007av == null) {
                        if (this.A02 != null) {
                            String str = A02(150, 36, 10) + c1021b9.A04;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1007av.A01 = EnumC1011az.A03;
                        list = c1007av.A03;
                        list.clear();
                        c1021b9.A03(this);
                        if (this.A08) {
                            Map<String, C1007av> map = this.A06;
                            String[] strArr = A0A;
                            if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0A;
                            strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                            strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                            map.remove(c1007av);
                        } else {
                            continue;
                        }
                    }
                }
            }

            private void A05(C1008aw c1008aw) {
                Collection<C1021b9> A00;
                A00 = c1008aw.A00();
                for (C1021b9 c1021b9 : A00) {
                    c1021b9.A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0449Fs
            public final void A3K(C1021b9 c1021b9, Rect rect, Rect rect2) {
                boolean A06;
                List list;
                Rect rect3;
                List list2;
                A01(c1021b9, rect, rect2);
                C1021b9 c1021b92 = c1021b9.A01;
                C1021b9 parentViewpointData = C1021b9.A08;
                if (c1021b92 == parentViewpointData) {
                    return;
                }
                A06 = this.A03.A06(c1021b92);
                C1007av parentViewProperties = this.A06.get(c1021b92.A04);
                if (A06) {
                    if (parentViewProperties == null) {
                        parentViewProperties = C1007av.A03(this.A00);
                        rect3 = parentViewProperties.A02;
                        rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c1021b92.A04, parentViewProperties);
                    } else {
                        list2 = parentViewProperties.A03;
                        list2.clear();
                        if (!this.A07 || c1021b92.A04()) {
                            parentViewProperties.A01 = EnumC1011az.A04;
                        }
                    }
                }
                list = parentViewProperties.A03;
                list.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0449Fs
            public final void A3r(long j, List<Rect> viewportRects) {
                Collection<C1021b9> A01;
                Collection<C1021b9> A012;
                List list;
                this.A00 = j;
                this.A05.clear();
                for (Rect rect : viewportRects) {
                    this.A05.add(new Rect(rect));
                }
                A01 = this.A04.A01();
                for (C1021b9 c1021b9 : A01) {
                    this.A06.remove(c1021b9.A04);
                }
                A012 = this.A03.A01();
                for (C1021b9 c1021b92 : A012) {
                    this.A06.remove(c1021b92.A04);
                }
                for (C1007av c1007av : this.A06.values()) {
                    list = c1007av.A03;
                    list.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0449Fs
            public final void A5H() {
                Collection A00;
                Collection A002;
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    String obj = toString();
                    List<Rect> list = this.A05;
                    A00 = this.A04.A00();
                    A002 = this.A03.A00();
                    new C1006au(obj, this, list, A00, A002);
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1010ay
            public final void A6q(C1021b9 c1021b9, Rect rect) {
                List<Rect> list;
                rect.setEmpty();
                list = this.A06.get(c1021b9.A04).A03;
                for (Rect rect2 : list) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1010ay
            public final EnumC1011az A81(C1021b9 c1021b9) {
                EnumC1011az enumC1011az;
                enumC1011az = this.A06.get(c1021b9.A04).A01;
                return enumC1011az;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1010ay
            public final void A83(Rect rect) {
                rect.setEmpty();
                for (Rect rect2 : this.A05) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1010ay
            public final float A84(C1021b9 c1021b9) {
                List<Rect> list;
                C1007av c1007av = this.A06.get(c1021b9.A04);
                if (c1007av != null) {
                    Rect A00 = A00(c1007av);
                    int height = A00.height() * A00.width();
                    int totalVisibleArea = 0;
                    list = c1007av.A03;
                    for (Rect rect : list) {
                        totalVisibleArea += rect.height() * rect.width();
                    }
                    return totalVisibleArea / height;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC0449Fs
            public final void AFB(@Nullable InterfaceC1018b6 interfaceC1018b6) {
                this.A01 = interfaceC1018b6;
            }
        });
    }
}
