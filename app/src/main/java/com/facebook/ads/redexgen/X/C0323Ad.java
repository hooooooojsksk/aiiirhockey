package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ad */
/* loaded from: assets/audience_network.dex */
public final class C0323Ad extends C0915Ye {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0326Ag A03;
    public int[] A04;
    public final C0887Xc A05;
    public final Og A06;
    public final C0662Oh A07;

    public C0323Ad(C0887Xc c0887Xc, C0662Oh c0662Oh, Og og) {
        super(c0887Xc);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c0887Xc;
        this.A07 = c0662Oh;
        this.A06 = og;
        this.A01 = -1;
        this.A03 = new C0326Ag(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4Z
    public final void A1J(C01834h c01834h, C01904o c01904o, int i, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A2A() == 1) || (mode2 == 1073741824 && A2A() == 0)) {
            super.A1J(c01834h, c01904o, i, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (c01904o.A03() >= 1) {
                int A0W = A0W() > 0 ? 1 : A0W();
                for (int i2 = 0; i2 < A0W; i2++) {
                    View A1q = A1q(i2);
                    if (A08[5].length() != 32) {
                        throw new RuntimeException();
                    }
                    A08[4] = "FajaHWp";
                    if (A1q == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1q, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A2A() == 0) {
                        int heightMode = iArr[0];
                        int[] iArr2 = this.A04;
                        iArr[0] = heightMode + iArr2[0];
                        if (i2 == 0) {
                            int A0g = iArr2[1] + A0g();
                            if (A08[6].length() != 1) {
                                A08[6] = "o1L5u";
                                iArr[1] = A0g + A0d();
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i3 = iArr[1];
                        int[] iArr3 = this.A04;
                        if (A08[6].length() != 1) {
                            A08[5] = "6nCDHSOFLCCkeDdRDThHGlolS6KLs45E";
                            iArr[1] = i3 + iArr3[1];
                            if (i2 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0e() + A0f();
                        } else {
                            A08[3] = "KFvpvLkhCjqU9hzA1pvFB";
                            iArr[1] = i3 + iArr3[1];
                            if (i2 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0e() + A0f();
                        }
                    }
                }
                int widthMode2 = this.A01;
                if (widthMode2 != -1) {
                    this.A06.A00(widthMode2, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A13(iArr[0], iArr[1]);
    }

    @Override // com.facebook.ads.redexgen.X.C0915Ye, com.facebook.ads.redexgen.X.C4Z
    public final void A1t(int i) {
        A2F(i, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C0915Ye, com.facebook.ads.redexgen.X.C4Z
    public final void A21(E9 e9, C01904o c01904o, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2K(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C0326Ag(this, this.A05);
    }

    public final void A2L(int i) {
        this.A01 = i;
    }

    public final void A2M(int i) {
        this.A02 = i;
    }
}
