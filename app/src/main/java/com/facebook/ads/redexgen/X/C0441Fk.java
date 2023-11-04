package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mobirix.airhockey.airhockey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fk */
/* loaded from: assets/audience_network.dex */
public final class C0441Fk {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", "", "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C0433Fc A04;
    public final C0434Fd A05;
    public final C0440Fj A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0433Fc A04(C0482Hb c0482Hb, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i2 = 8;
        int A045 = c0482Hb.A04(8);
        c0482Hb.A08(8);
        int i3 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int A046 = c0482Hb.A04(i2);
            int A047 = c0482Hb.A04(i2);
            int i4 = i3 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = c0482Hb.A04(i2);
                A042 = c0482Hb.A04(i2);
                A043 = c0482Hb.A04(i2);
                A044 = c0482Hb.A04(i2);
                i3 = i4 - 4;
            } else {
                A04 = c0482Hb.A04(6) << 2;
                A042 = c0482Hb.A04(4) << 4;
                A043 = c0482Hb.A04(4) << 4;
                A044 = c0482Hb.A04(2) << 6;
                i3 = i4 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), C0499Hs.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), C0499Hs.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), C0499Hs.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i2 = 8;
        }
        return new C0433Fc(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0434Fd A05(C0482Hb c0482Hb) {
        int i;
        int i2;
        int i3;
        int i4;
        c0482Hb.A08(4);
        boolean A0F = c0482Hb.A0F();
        c0482Hb.A08(3);
        int A04 = c0482Hb.A04(16);
        int A042 = c0482Hb.A04(16);
        if (A0F) {
            i = c0482Hb.A04(16);
            i3 = c0482Hb.A04(16);
            i2 = c0482Hb.A04(16);
            i4 = c0482Hb.A04(16);
        } else {
            i = 0;
            i2 = 0;
            i3 = A04;
            i4 = A042;
        }
        return new C0434Fd(A04, A042, i, i3, i2, i4);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0438Fh A08(C0482Hb c0482Hb, int i) {
        int i2 = 8;
        int A04 = c0482Hb.A04(8);
        c0482Hb.A08(4);
        boolean A0F = c0482Hb.A0F();
        c0482Hb.A08(3);
        int A042 = c0482Hb.A04(16);
        int A043 = c0482Hb.A04(16);
        int A044 = c0482Hb.A04(3);
        int A045 = c0482Hb.A04(3);
        c0482Hb.A08(2);
        int A046 = c0482Hb.A04(8);
        int A047 = c0482Hb.A04(8);
        int A048 = c0482Hb.A04(4);
        int A049 = c0482Hb.A04(2);
        c0482Hb.A08(2);
        int i3 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int A0410 = c0482Hb.A04(16);
            int A0411 = c0482Hb.A04(2);
            int A0412 = c0482Hb.A04(2);
            int A0413 = c0482Hb.A04(12);
            c0482Hb.A08(4);
            int A0414 = c0482Hb.A04(12);
            i3 -= 6;
            int i4 = 0;
            int i5 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i4 = c0482Hb.A04(i2);
                i5 = c0482Hb.A04(i2);
                i3 -= 2;
            }
            sparseArray.put(A0410, new C0439Fi(A0411, A0412, A0413, A0414, i4, i5));
            i2 = 8;
        }
        return new C0438Fh(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{18, 55, 34, 55, airhockey.J_REWARD, 48, 63, 51, 58, 50, airhockey.J_REWARD, 58, 51, 56, 49, 34, 62, airhockey.J_REWARD, 51, 46, 53, 51, 51, 50, 37, airhockey.J_REWARD, 58, 63, 59, 63, 34, airhockey.J_GAME_EXIT, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<FQ> A0I(byte[] bArr, int i) {
        C0482Hb c0482Hb = new C0482Hb(bArr, i);
        while (c0482Hb.A01() >= 48 && c0482Hb.A04(8) == 15) {
            A0C(c0482Hb, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        C0434Fd c0434Fd = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c0434Fd.A05 + 1 != this.A00.getWidth() || c0434Fd.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(c0434Fd.A05 + 1, c0434Fd.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C0437Fg> sparseArray = this.A06.A01.A03;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C0437Fg valueAt = sparseArray.valueAt(i2);
            C0438Fh c0438Fh = this.A06.A08.get(sparseArray.keyAt(i2));
            int i3 = valueAt.A00 + c0434Fd.A02;
            int i4 = valueAt.A01 + c0434Fd.A04;
            this.A01.clipRect(i3, i4, Math.min(c0438Fh.A08 + i3, c0434Fd.A01), Math.min(c0438Fh.A02 + i4, c0434Fd.A03), Region.Op.REPLACE);
            C0433Fc c0433Fc = this.A06.A06.get(c0438Fh.A00);
            if (c0433Fc == null && (c0433Fc = this.A06.A04.get(c0438Fh.A00)) == null) {
                c0433Fc = this.A04;
            }
            SparseArray<C0439Fi> sparseArray2 = c0438Fh.A09;
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                int keyAt = sparseArray2.keyAt(i5);
                C0439Fi valueAt2 = sparseArray2.valueAt(i5);
                C0435Fe c0435Fe = this.A06.A07.get(keyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (c0435Fe == null) {
                    c0435Fe = this.A06.A05.get(keyAt);
                }
                if (c0435Fe != null) {
                    A0B(c0435Fe, c0433Fc, c0438Fh.A01, i3 + valueAt2.A02, i4 + valueAt2.A05, c0435Fe.A01 ? null : this.A02, this.A01);
                }
            }
            if (c0438Fh.A0A) {
                this.A03.setColor(c0438Fh.A01 == 3 ? c0433Fc.A03[c0438Fh.A07] : c0438Fh.A01 == 2 ? c0433Fc.A02[c0438Fh.A06] : c0433Fc.A01[c0438Fh.A05]);
                this.A01.drawRect(i3, i4, c0438Fh.A08 + i3, c0438Fh.A02 + i4, this.A03);
            }
            arrayList.add(new FQ(Bitmap.createBitmap(this.A00, i3, i4, c0438Fh.A08, c0438Fh.A02), i3 / c0434Fd.A05, 0, i4 / c0434Fd.A00, 0, c0438Fh.A08 / c0434Fd.A05, c0438Fh.A02 / c0434Fd.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, airhockey.P_GAME_SELECTMAP, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0441Fk(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0434Fd(719, 575, 0, 719, 0, 575);
        this.A04 = new C0433Fc(0, A0F(), A0G(), A0H());
        this.A06 = new C0440Fj(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C0482Hb c0482Hb, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int clutIndex = 0;
            byte A04 = c0482Hb.A04(2);
            if (A04 != 0) {
                clutIndex = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
            } else if (c0482Hb.A0F()) {
                clutIndex = c0482Hb.A04(3) + 3;
                A04 = c0482Hb.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c0482Hb.A0F()) {
                clutIndex = 1;
                A04 = 0;
            } else {
                int A042 = c0482Hb.A04(2);
                if (A042 == 0) {
                    z = true;
                    A04 = 0;
                } else if (A042 != 1) {
                    if (A042 == 2) {
                        clutIndex = c0482Hb.A04(4) + 12;
                        A04 = c0482Hb.A04(2);
                    } else if (A042 != 3) {
                        A04 = 0;
                    } else {
                        clutIndex = c0482Hb.A04(8) + 29;
                        A04 = c0482Hb.A04(2);
                    }
                } else {
                    clutIndex = 2;
                    A04 = 0;
                }
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + clutIndex, i2 + 1, paint);
            }
            i3 += clutIndex;
        } while (!z);
        return i3;
    }

    public static int A02(C0482Hb c0482Hb, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int peek = 0;
            byte A04 = c0482Hb.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!c0482Hb.A0F()) {
                int A042 = c0482Hb.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z = true;
                    A04 = 0;
                }
            } else if (!c0482Hb.A0F()) {
                peek = c0482Hb.A04(2) + 4;
                A04 = c0482Hb.A04(4);
            } else {
                int A043 = c0482Hb.A04(2);
                if (A043 == 0) {
                    peek = 1;
                    A04 = 0;
                } else if (A043 == 1) {
                    peek = 2;
                    A04 = 0;
                } else if (A043 == 2) {
                    peek = c0482Hb.A04(4) + 9;
                    A04 = c0482Hb.A04(4);
                } else if (A043 != 3) {
                    A04 = 0;
                } else {
                    peek = c0482Hb.A04(8) + 25;
                    A04 = c0482Hb.A04(4);
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                float f = i3;
                float f2 = i2;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f, f2, i3 + peek, i2 + 1, paint);
            }
            i3 += peek;
        } while (!z);
        return i3;
    }

    public static int A03(C0482Hb c0482Hb, int[] iArr, @Nullable byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int clutIndex;
        int i3 = i;
        boolean z = false;
        do {
            byte A04 = c0482Hb.A04(8);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!c0482Hb.A0F()) {
                clutIndex = c0482Hb.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    A04 = 0;
                } else {
                    z = true;
                    clutIndex = 0;
                    A04 = 0;
                }
            } else {
                clutIndex = c0482Hb.A04(7);
                A04 = c0482Hb.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + clutIndex, i2 + 1, paint);
            }
            i3 += clutIndex;
        } while (!z);
        return i3;
    }

    public static C0435Fe A06(C0482Hb c0482Hb) {
        int A04 = c0482Hb.A04(16);
        c0482Hb.A08(4);
        int objectId = c0482Hb.A04(2);
        boolean A0F = c0482Hb.A0F();
        c0482Hb.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c0482Hb.A04(8);
            c0482Hb.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c0482Hb.A04(16);
            int objectId2 = c0482Hb.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c0482Hb.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c0482Hb.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new C0435Fe(A04, A0F, bArr, bArr2);
    }

    public static C0436Ff A07(C0482Hb c0482Hb, int i) {
        int A04 = c0482Hb.A04(8);
        int A042 = c0482Hb.A04(4);
        int A043 = c0482Hb.A04(2);
        c0482Hb.A08(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int remainingLength = c0482Hb.A04(8);
            c0482Hb.A08(8);
            int version = c0482Hb.A04(16);
            int timeoutSecs = c0482Hb.A04(16);
            i2 -= 6;
            sparseArray.put(remainingLength, new C0437Fg(version, timeoutSecs));
        }
        return new C0436Ff(A04, A042, A043, sparseArray);
    }

    public static void A0B(C0435Fe c0435Fe, C0433Fc c0433Fc, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0433Fc.A03;
        } else if (A08[2].length() == 20) {
            throw new RuntimeException();
        } else {
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i == 2) {
                iArr = c0433Fc.A02;
            } else {
                iArr = c0433Fc.A01;
            }
        }
        A0D(c0435Fe.A03, iArr, i, i2, i3, paint, canvas);
        A0D(c0435Fe.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x006c, code lost:
        if (r0 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006e, code lost:
        r7.A01 = r4;
        r7.A08.clear();
        r7.A06.clear();
        r7.A07.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0089, code lost:
        if (r0 != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008c, code lost:
        if (r5 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008e, code lost:
        r1 = r5.A02;
        r0 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0092, code lost:
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0094, code lost:
        r7.A01 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(com.facebook.ads.redexgen.X.C0482Hb r6, com.facebook.ads.redexgen.X.C0440Fj r7) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0441Fk.A0C(com.facebook.ads.redexgen.X.Hb, com.facebook.ads.redexgen.X.Fj):void");
    }

    public static void A0D(byte[] bArr, int[] iArr, int line, int dataType, int i, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i2 = i;
        C0482Hb c0482Hb = new C0482Hb(bArr);
        byte[] clutMapTable2To4 = null;
        byte[] bArr4 = null;
        int i3 = dataType;
        while (c0482Hb.A01() != 0) {
            int A04 = c0482Hb.A04(8);
            if (A04 != 240) {
                switch (A04) {
                    case 16:
                        if (line == 3) {
                            bArr3 = bArr4 == null ? A0A : bArr4;
                        } else if (line == 2) {
                            bArr3 = clutMapTable2To4 == null ? A09 : clutMapTable2To4;
                        } else {
                            bArr3 = null;
                        }
                        if (A08[1].length() != 29) {
                            throw new RuntimeException();
                        }
                        A08[1] = "xwfPuAvCy0meNXm9qprXKFgJpDmZE";
                        i3 = A01(c0482Hb, iArr, bArr3, i3, i2, paint, canvas);
                        c0482Hb.A05();
                        continue;
                    case 17:
                        if (line == 3) {
                            bArr2 = 0 == 0 ? A0B : null;
                        } else {
                            bArr2 = null;
                        }
                        i3 = A02(c0482Hb, iArr, bArr2, i3, i2, paint, canvas);
                        c0482Hb.A05();
                        continue;
                    case 18:
                        i3 = A03(c0482Hb, iArr, null, i3, i2, paint, canvas);
                        continue;
                    default:
                        switch (A04) {
                            case 32:
                                clutMapTable2To4 = A0E(4, 4, c0482Hb);
                                continue;
                            case 33:
                                bArr4 = A0E(4, 8, c0482Hb);
                                continue;
                            case 34:
                                bArr4 = A0E(16, 8, c0482Hb);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i3 = dataType;
                String[] strArr = A08;
                if (strArr[0].charAt(24) != strArr[7].charAt(24)) {
                    String[] strArr2 = A08;
                    strArr2[3] = "Q";
                    strArr2[4] = "dDxqS2bkmSWw219FL9FrVELNlGxj";
                    i2 += 2;
                } else {
                    i2 += 2;
                }
            }
        }
    }

    public static byte[] A0E(int i, int i2, C0482Hb c0482Hb) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0482Hb.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i2 = i & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i3 = i2 != 0 ? 255 : 0;
                iArr[i] = A00(255, i3, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i4 = (i & 1) != 0 ? 127 : 0;
                iArr[i] = A00(255, i4, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0091, code lost:
        if ((r3 & 4) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0095, code lost:
        if ((r3 & 64) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0097, code lost:
        r4[r3] = A00(255, r8, r6, r10 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x009f, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00a3, code lost:
        if ((r3 & 4) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00a6, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00f2, code lost:
        if ((r3 & 32) != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x00f4, code lost:
        r0 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0116, code lost:
        if ((r3 & 32) != 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0119, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x013c, code lost:
        if (r7 != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x013e, code lost:
        r2 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x016f, code lost:
        if (r7 != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0172, code lost:
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0441Fk.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
